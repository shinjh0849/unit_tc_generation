
import clover.com.google.common.collect.Sets;
import com.atlassian.clover.BitSetCoverageProvider;
import com.atlassian.clover.CloverDatabase;
import com.atlassian.clover.CoverageData;
import com.atlassian.clover.CoverageDataSpec;
import com.atlassian.clover.api.registry.*;
import com.atlassian.clover.recorder.PerTestCoverage;
import com.atlassian.clover.registry.CoverageDataRange;
import com.atlassian.clover.registry.FileElementVisitor;
import com.atlassian.clover.registry.entities.FullFileInfo;
import com.atlassian.clover.registry.entities.FullPackageInfo;
import com.atlassian.clover.registry.entities.TestCaseInfo;
import com.atlassian.clover.registry.metrics.HasMetricsFilter;
import com.atlassian.clover.reporters.Current;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

import static clover.com.google.common.collect.Maps.filterKeys;
import static clover.com.google.common.collect.Maps.newHashMap;

public class SimpleRegistryDumper {

    private final static Comparator TEST_METRICS_COMPARATOR = new Comparator() {
        @Override
        public int compare(Object object, Object object1) {
            BlockMetrics m = (BlockMetrics) ((Map.Entry) object).getValue();
            BlockMetrics m1 = (BlockMetrics) ((Map.Entry) object1).getValue();
            return (int) (1000 * (m1.getPcCoveredElements() - m.getPcCoveredElements()));
        }
    };
    private List<TestCaseInfo>[] testLineInfo;

    public static void main(String[] args) throws Exception {
//        render("evo_lang");

//        render("Cli1f");
//        render("Closure1f");
//        render("Codec1f");
//        render("Csv1f");
//        render("Lang1f");
//        render("Math1f");
//        render("Time1f");
//        render("Chart1f");
//        render("Compress1f");
//        render("gson");
//        render("jacksonCore1f");
//        render("jacksonDatabind1f");
//        render("jsoup1f");
        render("jxPath1f");
    }


    public static <testLineInfo> void render(String Project) throws Exception {
            final Current reportConfig = null;

            // read clover database together with coverage recording files, use time span=0 (latest build)
//            CloverDatabase db = CloverDatabase.loadWithCoverage("src/main/java/Projects/Cli1f/clover4_2_1.db", new CoverageDataSpec());
        CloverDatabase db;
        if (Project=="Time1f" || Project=="evo_lang" || Project=="Lang1f" || Project=="gson")
        {
            System.out.println(" time");
             db = CloverDatabase.loadWithCoverage("src/main/java/Projects/"+Project+"/clover.db", new CoverageDataSpec());
        }else
        {
            System.out.println("not time");
            System.out.println(Project);
             db = CloverDatabase.loadWithCoverage("src/main/java/Projects/"+Project+"/clover4_4_1.db", new CoverageDataSpec());
        }

            ProjectInfo projectInfo = db.getRegistry().getProject();
            List<? extends PackageInfo> packageInfo = projectInfo.getAllPackages();
            int number_of_classes = 0;
            Map<String, List<TestCaseInfo>[]> file_to_test = new HashMap<String, List<TestCaseInfo>[]>();
            for (final PackageInfo pakage : packageInfo) {
                List<? extends FileInfo> files = pakage.getFiles();
//                System.out.println("length of files: " + files.size());
                for (final FileInfo file : files) {
                    if(file.getClasses().isEmpty() == false) {
                        if (file.getClasses().get(0).isTestClass()) {
                            continue;
                        }
                    }else
                    {
                        continue;
                    }
                    number_of_classes ++;
//                    System.out.println("file: " + file.getName());

                    final Map<TestCaseInfo, BitSet> targetMethods = newHashMap();  // contains testid -> methodInfos
                    final Map<TestCaseInfo, BitSet> targetElements = newHashMap(); // contains testid -> statements & branches
                    final Map<TestCaseInfo, BlockMetrics> testMetrics = newHashMap(); // testid -> metrics
                    Set<TestCaseInfo> testHits = db.getTestHits((CoverageDataRange) file);
                    FullFileInfo fcopy = ((FullFileInfo) file).copy((FullPackageInfo) file.getContainingPackage(), HasMetricsFilter.ACCEPT_ALL);
                    Set<TestCaseInfo> testSet = Sets.newHashSet();

                    final List<TestCaseInfo>[] testLineInfo = (List<TestCaseInfo>[]) new ArrayList[fcopy.getLineCount() + 1];

                    for (final TestCaseInfo tci : testHits) {
                        testSet.clear();
                        testSet.add(tci);

                        final CoverageData data = db.getCoverageData();
                        fcopy.setDataProvider(new BitSetCoverageProvider(data.getHitsFor(testSet, fcopy), data));

                        testMetrics.put(tci, fcopy.getMetrics());

                        fcopy.visitElements(new FileElementVisitor() {
                            @Override
                            public void visitClass(ClassInfo info) {

                            }

                            @Override
                            public void visitMethod(MethodInfo info) {
                                if (info.getHitCount() > 0) {
                                    updateTestLineInfo(info);
                                    BitSet set = targetMethods.get(tci);
                                    if (set == null) {
                                        set = new BitSet();
                                        targetMethods.put(tci, set);
                                    }
                                    set.set(info.getStartLine());
                                }
                            }

                            @Override
                            public void visitStatement(StatementInfo info) {
                                visitNode(info);
                            }

                            @Override
                            public void visitBranch(BranchInfo info) {
                                visitNode(info);
                            }

                            private void visitNode(ElementInfo info) {
                                if (info.getHitCount() > 0) {
                                    updateTestLineInfo(info);
                                    BitSet set = targetElements.get(tci);
                                    if (set == null) {
                                        set = new BitSet();
                                        targetElements.put(tci, set);
                                    }
                                    set.set(info.getStartLine());

                                }
                            }

                            private void updateTestLineInfo(SourceInfo r) {
                                int sl = r.getStartLine();
                                List<TestCaseInfo> tests = testLineInfo[sl];
                                if (tests == null) {
                                    tests = new ArrayList();
                                    testLineInfo[sl] = tests;
                                }
                                if (!isSetForThisTest(targetElements, sl) && !isSetForThisTest(targetMethods, sl)) {
                                    tests.add(tci);
                                }
                            }

                            private boolean isSetForThisTest(Map<TestCaseInfo, BitSet> m, int i) {
                                BitSet bsc = m.get(tci);
                                return bsc != null && bsc.get(i);
                            }
                        });
                    }
                    file_to_test.put(String.valueOf((((FullFileInfo) file).getPhysicalFile())),testLineInfo);
                }

            }
            System.out.println(number_of_classes);
            try {
                int number_of_files = 0;
                FileWriter myWriter = new FileWriter(Project + "_line2test.txt");
                for (Map.Entry<String, List<TestCaseInfo>[]> src : file_to_test.entrySet()) {
                    System.out.println(src.getKey());
                    int flag = 0;
                    for (int i = 0; i < src.getValue().length; i++) { // for getting rid of files wih zero lines covered
                        List<TestCaseInfo> line = src.getValue()[i];
                        if (line != null) {
                            flag = 1;
                            }
                        }
                        if (flag == 0) {
                            continue;
                        }
                    number_of_files ++;
                    myWriter.write("<src_file>: " + src.getKey() + "\n");
//                  System.out.println(src.getValue());
                    for (int i = 0; i < src.getValue().length; i++) {
                        List<TestCaseInfo> line = src.getValue()[i];
                        if (line != null) {
                            System.out.println(i);
                            myWriter.write("<line>: " + i + "\n");
                            for (TestCaseInfo test : line) {
                                System.out.println(test.getSourceMethodName());
                                myWriter.write("<test_name>: " + test.getSourceMethodName() + " <###> ");
                            }
                            myWriter.write("\n");
                        }
                    }
                }
                System.out.println(number_of_files);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

//            this.testLineInfo = testLineInfo;
//
//            final Map<TestCaseInfo, BlockMetrics> orderedTestMetrics =
//                    new LinkedHashMap<TestCaseInfo, BlockMetrics>(testMetrics.size());
//            final List<Map.Entry<TestCaseInfo, BlockMetrics>> testMetricList =
//                    Lists.newLinkedList(testMetrics.entrySet());
//            Collections.sort(testMetricList, TEST_METRICS_COMPARATOR);
//
//            final List<Map.Entry<TestCaseInfo, BlockMetrics>> sublist;
//            if (reportConfig.getMaxTestsPerFile() >= 0 && // ensure a value has been set
//                    !testMetricList.isEmpty() &&
//                    testMetricList.size() > reportConfig.getMaxTestsPerFile()) {
//                sublist = testMetricList.subList(0, reportConfig.getMaxTestsPerFile());
//            } else {
//                sublist = testMetricList;
//            }
//            for (Map.Entry<TestCaseInfo, BlockMetrics> entry : sublist) {
//                orderedTestMetrics.put(entry.getKey(), entry.getValue());
//            }



//            printProject(projectInfo,cd, System.out);

    }



    private static void printProject(ProjectInfo db,CoverageData cd, PrintStream out) {

        for (PackageInfo packageInfo : db.getAllPackages()) {
            out.println("package: " + packageInfo.getName());
            for (FileInfo fileInfo : packageInfo.getFiles()) {
                Map<TestCaseInfo, BitSet> map = cd.mapTestsAndCoverageForFile((FullFileInfo) fileInfo);
                out.println("\tmap: " + map);
                out.println("\tfile: " + fileInfo.getName());
                for (ClassInfo classInfo : fileInfo.getClasses()) {
                    out.println("\t\tclass: " + classInfo.getName());
                    for (MethodInfo methodInfo : classInfo.getMethods()) {
                        out.println("\t\t\tmethod: " + methodInfo.getName());
                        out.println("\t\t\tmethod: " + methodInfo.getHitCount());

                    }
                }
            }
        }
    }

}
//        Map<TestCaseInfo, BitSet> map = cd.mapTestsAndCoverageForFile((FullFileInfo) fileInfo);


//    public static void main(String[] args) throws Exception{
//        main(new String[]{"./clover.db"});
//    }


