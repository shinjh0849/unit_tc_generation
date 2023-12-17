public Compiler()
public Compiler(PrintStream stream)
public Compiler(ErrorManager errorManager)
private IntermediateState()
public Thread newThread(Runnable r)
public void setErrorManager(ErrorManager errorManager)
private MessageFormatter createMessageFormatter()
public void initOptions(CompilerOptions options)
public void init(JSSourceFile[] externs, JSSourceFile[] inputs, CompilerOptions options)
public void init(List<T1> externs, List<T2> inputs, CompilerOptions options)
public void init(JSSourceFile[] externs, JSModule[] modules, CompilerOptions options)
public void initModules(List<T> externs, List<JSModule> modules, CompilerOptions options)
private void initBasedOnOptions()
private List<CompilerInput> makeCompilerInput(List<T> files, boolean isExtern)
private void checkFirstModule(List<JSModule> modules)
 static String createFillFileName(String moduleName)
private static void fillEmptyModules(List<JSModule> modules)
public void rebuildInputsFromModules()
private static List<CompilerInput> getAllInputsFromModules(List<JSModule> modules)
 void initInputsByIdMap()
public Result compile(SourceFile extern, SourceFile input, CompilerOptions options)
public Result compile(SourceFile extern, JSSourceFile[] input, CompilerOptions options)
public Result compile(JSSourceFile extern, JSModule[] modules, CompilerOptions options)
public Result compile(JSSourceFile[] externs, JSSourceFile[] inputs, CompilerOptions options)
public Result compile(List<T1> externs, List<T2> inputs, CompilerOptions options)
public Result compile(JSSourceFile[] externs, JSModule[] modules, CompilerOptions options)
public Result compileModules(List<T> externs, List<JSModule> modules, CompilerOptions options)
public Result call() throws Exception
private Result compile()
public void disableThreads()
public T call()
 T runInCompilerThread(final Callable<T> callable)
private void compileInternal()
public void parse()
 PassConfig getPassConfig()
 PassConfig createPassConfigInternal()
public void setPassConfig(PassConfig passes)
 boolean precheck()
public void check()
private void externExports()
 void process(CompilerPass p)
protected CompilerPass create(AbstractCompiler compiler)
private void maybeSanityCheck()
private void runSanityCheck()
 void removeTryCatchFinally()
 void stripCode(Set<String> stripTypes, Set<String> stripNameSuffixes, Set<String> stripTypePrefixes, Set<String> stripNamePrefixes)
private void runCustomPasses(CustomPassExecutionTime executionTime)
 void startPass(String passName)
 void endPass()
 Tracer newTracer(String passName)
 void stopTracer(Tracer t, String passName)
public Result getResult()
public JSError[] getMessages()
public JSError[] getErrors()
public JSError[] getWarnings()
public Node getRoot()
private int nextUniqueNameId()
 void resetUniqueNameId()
public String get()
 Supplier<String> getUniqueNameIdSupplier()
 boolean areNodesEqualForInlining(Node n1, Node n2)
public CompilerInput getInput(InputId id)
protected void removeExternInput(InputId id)
public CompilerInput newExternInput(String name)
private CompilerInput putCompilerInput(InputId id, CompilerInput input)
 void addIncrementalSourceAst(JsAst ast)
 boolean replaceIncrementalSourceAst(JsAst ast)
 boolean addNewSourceAst(JsAst ast)
 JSModuleGraph getModuleGraph()
 JSModuleGraph getDegenerateModuleGraph()
public JSTypeRegistry getTypeRegistry()
public MemoizedScopeCreator getTypedScopeCreator()
 DefaultPassConfig ensureDefaultPassConfig()
public SymbolTable buildKnownSymbolTable()
public Scope getTopScope()
public ReverseAbstractInterpreter getReverseAbstractInterpreter()
 TypeValidator getTypeValidator()
 Node parseInputs()
private void hoistExterns(Node externsRoot)
private void hoistNoCompileFiles()
private void repartitionInputs()
 void processAMDAndCommonJSModules()
public Node parse(SourceFile file)
 Node parseSyntheticCode(String js)
protected CompilerOptions newCompilerOptions()
 void initCompilerOptionsIfTesting()
 Node parseSyntheticCode(String fileName, String js)
 Node parseTestCode(String js)
 ErrorReporter getDefaultErrorReporter()
public String call() throws Exception
public String toSource()
public String[] call() throws Exception
public String[] toSourceArray()
public String call() throws Exception
public String toSource(final JSModule module)
public String[] call() throws Exception
public String[] toSourceArray(final JSModule module)
public Void call() throws Exception
public void toSource(final CodeBuilder cb, final int inputSeqNum, final Node root)
 String toSource(Node n)
private String toSource(Node n, SourceMap sourceMap, boolean firstOutput)
 void reset()
 CodeBuilder append(String str)
public String toString()
public int getLength()
 int getLineIndex()
 int getColumnIndex()
 boolean endsWith(String suffix)
public void optimize()
 void setCssRenamingMap(CssRenamingMap map)
 CssRenamingMap getCssRenamingMap()
public void processDefines()
 boolean isInliningForbidden()
 ControlFlowGraph<Node> computeCFG()
public void normalize()
 void prepareAst(Node root)
 void recordFunctionInformation()
 void addChangeHandler(CodeChangeHandler handler)
 void removeChangeHandler(CodeChangeHandler handler)
public void reportCodeChange()
public CodingConvention getCodingConvention()
public boolean isIdeMode()
public boolean acceptEcmaScript5()
public LanguageMode languageMode()
public boolean acceptConstKeyword()
 Config getParserConfig()
public boolean isTypeCheckingEnabled()
protected DiagnosticGroups getDiagnosticGroups()
public void report(JSError error)
public CheckLevel getErrorLevel(JSError error)
 void throwInternalError(String message, Exception cause)
public int getErrorCount()
public int getWarningCount()
 boolean hasHaltingErrors()
public boolean hasErrors()
 void addToDebugLog(String str)
 SourceFile getSourceFileByName(String sourceName)
public String getSourceLine(String sourceName, int lineNumber)
public Region getSourceRegion(String sourceName, int lineNumber)
 Node getNodeForCodeInsertion(JSModule module)
public SourceMap getSourceMap()
 VariableMap getVariableMap()
 VariableMap getPropertyMap()
 CompilerOptions getOptions()
 FunctionInformationMap getFunctionalInformationMap()
public static void setLoggingLevel(Level level)
public String getAstDotGraph() throws IOException
public ErrorManager getErrorManager()
 List<CompilerInput> getInputsInOrder()
public Map<InputId, CompilerInput> getInputsById()
 List<CompilerInput> getExternsInOrder()
public IntermediateState getState()
public void setState(IntermediateState state)
 List<CompilerInput> getInputsForTesting()
 List<CompilerInput> getExternsForTesting()
 boolean hasRegExpGlobalReferences()
 void setHasRegExpGlobalReferences(boolean references)
 void updateGlobalVarReferences(Map<Var, ReferenceCollection> refMapPatch, Node collectionRoot)
 GlobalVarReferenceMap getGlobalVarReferences()
 CompilerInput getSynthesizedExternsInput()
public double getProgress()
 String getLastPassName()
 void setProgress(double newProgress, String passName)
public void replaceScript(JsAst ast)
public void addNewScript(JsAst ast)
private void processNewScript(JsAst ast, Node originalRoot)
private void runHotSwap(Node originalRoot, Node js, PassConfig passConfig)
private void runHotSwapPass(Node originalRoot, Node js, PassFactory passFactory)
private PassConfig getCleanupPassConfig()
private void removeSyntheticVarsInput()
 Node ensureLibraryInjected(String resourceName)
 Node loadLibraryCode(String resourceName)
public static String getReleaseVersion()
public static String getReleaseDate()
public void setOldParseTree(String sourceName, AstRoot oldAst)
public AstRoot getOldParseTreeByName(String sourceName)
String SINGLETON_MODULE_NAME=Optional["[singleton]"]
DiagnosticType MODULE_DEPENDENCY_ERROR=Optional[DiagnosticType.error("JSC_MODULE_DEPENDENCY_ERROR", "Bad dependency: {0} -> {1}. " + "Modules must be listed in dependency order.")]
DiagnosticType MISSING_ENTRY_ERROR=Optional[DiagnosticType.error("JSC_MISSING_ENTRY_ERROR", "required entry point \"{0}\" never provided")]
String CONFIG_RESOURCE=Optional["com.google.javascript.jscomp.parsing.ParserConfig"]
CompilerOptions options=Optional[null]
PassConfig passes=Optional[null]
List<CompilerInput> externs
List<JSModule> modules
JSModuleGraph moduleGraph
List<CompilerInput> inputs
ErrorManager errorManager
WarningsGuard warningsGuard
Map<String, Node> injectedLibraries=Optional[Maps.newLinkedHashMap()]
Node externsRoot
Node jsRoot
Node externAndJsRoot
Map<InputId, CompilerInput> inputsById
SourceMap sourceMap
String externExports=Optional[null]
int uniqueNameId=Optional[0]
boolean hasRegExpGlobalReferences=Optional[true]
FunctionInformationMap functionInformationMap
StringBuilder debugLog=Optional[new StringBuilder()]
CodingConvention defaultCodingConvention=Optional[new ClosureCodingConvention()]
JSTypeRegistry typeRegistry
Config parserConfig=Optional[null]
ReverseAbstractInterpreter abstractInterpreter
TypeValidator typeValidator
PerformanceTracker tracker
com.google.javascript.rhino.ErrorReporter oldErrorReporter=Optional[RhinoErrorReporter.forOldRhino(this)]
ErrorReporter defaultErrorReporter=Optional[RhinoErrorReporter.forNewRhino(this)]
DiagnosticType OPTIMIZE_LOOP_ERROR=Optional[DiagnosticType.error("JSC_OPTIMIZE_LOOP_ERROR", "Exceeded max number of optimization iterations: {0}")]
DiagnosticType MOTION_ITERATIONS_ERROR=Optional[DiagnosticType.error("JSC_OPTIMIZE_LOOP_ERROR", "Exceeded max number of code motion iterations: {0}")]
long COMPILER_STACK_SIZE=Optional[(1 << 21)]
ExecutorService compilerExecutor=Optional[Executors.newCachedThreadPool(new ThreadFactory() {

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(null, r, "jscompiler", COMPILER_STACK_SIZE);
    }
})]
Thread compilerThread=Optional[null]
boolean useThreads=Optional[true]
Logger logger=Optional[Logger.getLogger("com.google.javascript.jscomp")]
PrintStream outStream
GlobalVarReferenceMap globalRefMap=Optional[null]
double progress=Optional[0.0]
String lastPassName
DiagnosticType EMPTY_MODULE_LIST_ERROR=Optional[DiagnosticType.error("JSC_EMPTY_MODULE_LIST_ERROR", "At least one module must be provided")]
DiagnosticType EMPTY_ROOT_MODULE_ERROR=Optional[DiagnosticType.error("JSC_EMPTY_ROOT_MODULE_ERROR", "Root module '{0}' must contain at least one source code input")]
DiagnosticType DUPLICATE_INPUT=Optional[DiagnosticType.error("JSC_DUPLICATE_INPUT", "Duplicate input: {0}")]
DiagnosticType DUPLICATE_EXTERN_INPUT=Optional[DiagnosticType.error("JSC_DUPLICATE_EXTERN_INPUT", "Duplicate extern input: {0}")]
PassFactory sanityCheck=Optional[new PassFactory("sanityCheck", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new SanityCheck(compiler);
    }
}]
Tracer currentTracer=Optional[null]
String currentPassName=Optional[null]
int syntheticCodeId=Optional[0]
CodeChangeHandler.RecentChange recentChange=Optional[new CodeChangeHandler.RecentChange()]
List<CodeChangeHandler> codeChangeHandlers=Optional[Lists.<CodeChangeHandler>newArrayList()]
String SYNTHETIC_EXTERNS=Optional["{SyntheticVarsDeclar}"]
CompilerInput synthesizedExternsInput=Optional[null]
