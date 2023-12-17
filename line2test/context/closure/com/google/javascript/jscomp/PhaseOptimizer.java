 PhaseOptimizer(AbstractCompiler compiler, PerformanceTracker tracker, ProgressRange progressRange)
 NamedPass(PassFactory factory)
public ProgressRange(double initialValue, double maxValue)
 static void randomizeLoops()
 static List<List<String>> getLoopsRun()
 static void clearLoopsRun()
 void consume(List<PassFactory> factories)
 void addOneTimePass(PassFactory factory)
 Loop addFixedPointLoop()
 void setSanityCheck(PassFactory sanityCheck)
public void process(Node externs, Node root)
private void startPass(String passName)
private void endPass(Node externs, Node root)
 void maybeSanityCheck(Node externs, Node root)
private boolean hasHaltingErrors()
private Tracer newTracer(String passName)
private void stopTracer(Tracer t, String passName)
public void process(Node externs, Node root)
 void addLoopedPass(PassFactory factory)
private List<String> getPassOrder()
public void process(Node externs, Node root)
private void randomizePasses()
private void optimizePasses()
List<String> OPTIMAL_ORDER=Optional[ImmutableList.of("deadAssignmentsElimination", "inlineFunctions", "removeUnusedPrototypeProperties", "removeUnreachableCode", "removeUnusedVars", "minimizeExitPoints", "inlineVariables", "collapseObjectLiterals", "peepholeOptimizations")]
int MAX_LOOPS=Optional[100]
String OPTIMIZE_LOOP_ERROR=Optional["Fixed point loop exceeded the maximum number of iterations."]
Logger logger=Optional[Logger.getLogger(PhaseOptimizer.class.getName())]
List<CompilerPass> passes=Optional[Lists.newArrayList()]
AbstractCompiler compiler
PerformanceTracker tracker
CodeChangeHandler.RecentChange recentChange=Optional[new CodeChangeHandler.RecentChange()]
boolean loopMutex=Optional[false]
Tracer currentTracer=Optional[null]
String currentPassName=Optional[null]
PassFactory sanityCheck=Optional[null]
double progress=Optional[0.0]
double progressStep=Optional[0.0]
boolean randomizeLoops=Optional[false]
List<List<String>> loopsRun=Optional[Lists.newArrayList()]
ProgressRange progressRange
