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
Logger logger=Optional[Logger.getLogger(DepsGenerator.class.getName())]
Collection<SourceFile> srcs
Collection<SourceFile> deps
String closurePathAbs
InclusionStrategy mergeStrategy
ErrorManager errorManager
DiagnosticType SAME_FILE_WARNING=Optional[DiagnosticType.warning("DEPS_SAME_FILE", "Namespace \"{0}\" is both required and provided in the same file.")]
DiagnosticType NEVER_PROVIDED_ERROR=Optional[DiagnosticType.error("DEPS_NEVER_PROVIDED", "Namespace \"{0}\" is required but never provided.")]
DiagnosticType DUPE_PROVIDES_WARNING=Optional[DiagnosticType.warning("DEPS_DUPE_PROVIDES", "Multiple calls to goog.provide(\"{0}\")")]
DiagnosticType MULTIPLE_PROVIDES_ERROR=Optional[DiagnosticType.error("DEPS_DUPE_PROVIDES", "Namespace \"{0}\" is already provided in other file {1}")]
DiagnosticType DUPE_REQUIRE_WARNING=Optional[DiagnosticType.warning("DEPS_DUPE_REQUIRES", "Namespace \"{0}\" is required multiple times")]
DiagnosticType NO_DEPS_WARNING=Optional[DiagnosticType.warning("DEPS_NO_DEPS", "No dependencies found in file")]
