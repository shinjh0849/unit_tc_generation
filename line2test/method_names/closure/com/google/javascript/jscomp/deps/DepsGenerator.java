public DepsGenerator(Collection<SourceFile> deps, Collection<SourceFile> srcs, InclusionStrategy mergeStrategy, String closurePathAbs, ErrorManager errorManager)
public String computeDependencyCalls() throws IOException
protected void cleanUpDuplicatedFiles(Map<String, DependencyInfo> depsFiles, Map<String, DependencyInfo> jsFiles)
private void validateDependencies(Iterable<DependencyInfo> preparsedFileDepedencies, Iterable<DependencyInfo> parsedFileDependencies)
private void reportSameFile(String namespace, DependencyInfo depInfo)
private void reportUndefinedNamespace(String namespace, DependencyInfo depInfo)
private void reportDuplicateProvide(String namespace, DependencyInfo firstDep, DependencyInfo secondDep)
private void reportDuplicateRequire(String namespace, DependencyInfo depInfo)
private void reportNoDepsInDepsFile(String filePath)
private void addToProvideMap(Iterable<DependencyInfo> depInfos, Map<String, DependencyInfo> providesMap)
protected DepsFileParser createDepsFileParser()
protected boolean shouldSkipDepsFile(SourceFile file)
private Map<String, DependencyInfo> parseDepsFiles() throws IOException
private Map<String, DependencyInfo> parseSources(Set<String> preparsedFiles) throws IOException
public String apply(DependencyInfo from)
private void writeDepsContent(Map<String, DependencyInfo> depsFiles, Map<String, DependencyInfo> jsFiles, PrintStream out) throws IOException
protected String formatPathToDepsFile(String path)
private void writeDepInfos(PrintStream out, Collection<DependencyInfo> depInfos) throws IOException
private static void writeJsArray(PrintStream out, Collection<String> values)
 static List<SourceFile> createSourceFilesFromPaths(Collection<String> paths)
 static List<SourceFile> createSourceFilesFromPaths(String... paths)
