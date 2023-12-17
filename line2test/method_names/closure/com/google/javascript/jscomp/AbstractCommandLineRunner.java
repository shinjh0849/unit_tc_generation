 AbstractCommandLineRunner()
 AbstractCommandLineRunner(PrintStream out, PrintStream err)
public FlagUsageException(String message)
private Entry(CheckLevel level, String groupName)
 void enableTestMode(Supplier<List<SourceFile>> externsSupplier, Supplier<List<SourceFile>> inputsSupplier, Supplier<List<JSModule>> modulesSupplier, Function<Integer, Boolean> exitCodeReceiver)
protected boolean isInTestMode()
protected CommandLineConfig getCommandLineConfig()
protected abstract A createCompiler()
protected abstract B createOptions()
protected DiagnosticGroups getDiagnosticGroups()
protected void initOptionsFromFlags(CompilerOptions options)
 static DependencyOptions createDependencyOptions(boolean manageClosureDependencies, boolean onlyClosureDependencies, boolean processCommonJSModules, List<String> closureEntryPoints) throws FlagUsageException
protected void setRunOptions(CompilerOptions options) throws FlagUsageException, IOException
protected final A getCompiler()
public final void run()
protected PrintStream getErrorPrintStream()
protected List<SourceFile> createInputs(List<String> files, boolean allowStdIn) throws FlagUsageException, IOException
private List<SourceFile> createSourceInputs(List<String> files) throws FlagUsageException, IOException
private List<SourceFile> createExternInputs(List<String> files) throws FlagUsageException, IOException
 List<JSModule> createJsModules(List<String> specs, List<String> jsFiles) throws FlagUsageException, IOException
protected void checkModuleName(String name) throws FlagUsageException
 static Map<String, String> parseModuleWrappers(List<String> specs, List<JSModule> modules) throws FlagUsageException
private String getModuleOutputFileName(JSModule m)
 void writeModuleOutput(Appendable out, JSModule m) throws FlagUsageException, IOException
 static void writeOutput(Appendable out, Compiler compiler, String code, String wrapper, String codePlaceholder, @Nullable Function<String, String> escaper) throws IOException
private static void maybeCreateDirsForPath(String pathPrefix)
protected int doRun() throws FlagUsageException, IOException
 int processResults(Result result, List<JSModule> modules, B options) throws FlagUsageException, IOException
 Function<String, String> getJavascriptEscaper()
 void outputSingleBinary() throws IOException
private void outputModuleBinaryAndSourceMaps(List<JSModule> modules, B options) throws FlagUsageException, IOException
private Charset getInputCharset() throws FlagUsageException
private String getLegacyOutputCharset() throws FlagUsageException
private Charset getOutputCharset2() throws FlagUsageException
protected List<SourceFile> createExterns() throws FlagUsageException, IOException
private boolean shouldGenerateMapPerModule(B options)
private Writer openExternExportsStream(B options, String path) throws IOException
private String expandCommandLinePath(String path, JSModule forModule)
 String expandSourceMapPath(B options, JSModule forModule)
private Writer fileNameToLegacyOutputWriter(String fileName) throws IOException
private Writer fileNameToOutputWriter2(String fileName) throws IOException
protected OutputStream filenameToOutputStream(String fileName) throws IOException
private Writer streamToLegacyOutputWriter(OutputStream stream) throws IOException
private Writer streamToOutputWriter2(OutputStream stream)
private void outputSourceMap(B options, String associatedName) throws IOException
private String getMapPath(String outputFile)
private void outputNameMaps(B options) throws FlagUsageException, IOException
 static void createDefineOrTweakReplacements(List<String> definitions, CompilerOptions options, boolean tweaks)
private boolean shouldGenerateOutputPerModule(String output)
private void outputManifest() throws IOException
private void outputBundle() throws IOException
private void outputManifestOrBundle(List<String> outputFiles, boolean isManifest) throws IOException
private void outputModuleGraphJson() throws IOException
 void printModuleGraphJsonTo(JSModuleGraph graph, Appendable out) throws IOException
 void printModuleGraphManifestOrBundleTo(JSModuleGraph graph, Appendable out, boolean isManifest) throws IOException
private void printManifestTo(Iterable<CompilerInput> inputs, Appendable out) throws IOException
private void printBundleTo(Iterable<CompilerInput> inputs, Appendable out) throws IOException
private Map<String, String> constructRootRelativePathsMap()
private void recordStartRun()
private void recordEndRun()
private void outputBestPhaseOrdering()
 CommandLineConfig setPrintTree(boolean printTree)
 CommandLineConfig setComputePhaseOrdering(boolean computePhaseOrdering)
 CommandLineConfig setPrintAst(boolean printAst)
 CommandLineConfig setPrintPassGraph(boolean printPassGraph)
 CommandLineConfig setJscompDevMode(CompilerOptions.DevMode jscompDevMode)
 CommandLineConfig setLoggingLevel(String loggingLevel)
 CommandLineConfig setExterns(List<String> externs)
 CommandLineConfig setJs(List<String> js)
 CommandLineConfig setJsOutputFile(String jsOutputFile)
 CommandLineConfig setModule(List<String> module)
 CommandLineConfig setVariableMapInputFile(String variableMapInputFile)
 CommandLineConfig setPropertyMapInputFile(String propertyMapInputFile)
 CommandLineConfig setVariableMapOutputFile(String variableMapOutputFile)
 CommandLineConfig setCreateNameMapFiles(boolean createNameMapFiles)
 CommandLineConfig setPropertyMapOutputFile(String propertyMapOutputFile)
 CommandLineConfig setCodingConvention(CodingConvention codingConvention)
 CommandLineConfig setSummaryDetailLevel(int summaryDetailLevel)
 CommandLineConfig setOutputWrapper(String outputWrapper)
 CommandLineConfig setModuleWrapper(List<String> moduleWrapper)
 CommandLineConfig setModuleOutputPathPrefix(String moduleOutputPathPrefix)
 CommandLineConfig setCreateSourceMap(String createSourceMap)
 CommandLineConfig setSourceMapDetailLevel(SourceMap.DetailLevel level)
 CommandLineConfig setSourceMapFormat(SourceMap.Format format)
 CommandLineConfig setWarningGuardSpec(WarningGuardSpec spec)
 CommandLineConfig setDefine(List<String> define)
 CommandLineConfig setTweak(List<String> tweak)
 CommandLineConfig setTweakProcessing(TweakProcessing tweakProcessing)
 CommandLineConfig setCharset(String charset)
 CommandLineConfig setManageClosureDependencies(boolean newVal)
 CommandLineConfig setOnlyClosureDependencies(boolean newVal)
 CommandLineConfig setClosureEntryPoints(List<String> entryPoints)
 CommandLineConfig setOutputManifest(List<String> outputManifests)
 CommandLineConfig setOutputModuleDependencies(String outputModuleDependencies)
 CommandLineConfig setOutputBundle(List<String> outputBundles)
 CommandLineConfig setAcceptConstKeyword(boolean acceptConstKeyword)
 CommandLineConfig setLanguageIn(String languageIn)
 CommandLineConfig setSkipNormalOutputs(boolean skipNormalOutputs)
 CommandLineConfig setManifestMaps(List<String> manifestMaps)
 CommandLineConfig setTransformAMDToCJSModules(boolean transformAMDToCJSModules)
 CommandLineConfig setProcessCommonJSModules(boolean processCommonJSModules)
 CommandLineConfig setCommonJSModulePathPrefix(String commonJSModulePathPrefix)
 CommandLineConfig setWarningsWhitelistFile(String fileName)
protected void add(CheckLevel level, String groupName)
protected void clear()
