 LabeledStatementSearcher(String target)
public void process(Node externs, Node root)
protected CompilerPass getProcessor(final Compiler compiler)
public void setUp() throws Exception
public void testDegenerateSafeMoves()
public void testVisibilitySafeMoves()
public void testDegenerateUnsafeMoves()
public void testVisibilityUnsafeMoves()
public void testVisibilityMoveCalls()
public void testVisibilityMergesParametersWithHeap()
public void testMovedSideEffectsMustHaveSameControlFlow()
private SideEffectsAnalysis.AbstractMotionEnvironment environment(Node... nodes)
private void assertMove(LocationAbstractionMode abstraction, String src, boolean expected)
private void assertSafeMoveDegenerate(String src)
private void assertUnsafeMoveDegenerate(String src)
private void assertSafeMoveVisibility(String src)
private void assertUnsafeMoveVisibility(String src)
private SideEffectsAnalysis compileAndRun(String js, LocationAbstractionMode locationAbstractionIdentifier)
private Node findLabeledStatement(String label)
public void visit(NodeTraversal t, Node n, Node parent)
String SHARED_EXTERNS=Optional["var arguments = [];"]
LocationAbstractionMode currentLocationAbstractionIdentifier
SideEffectsAnalysis currentAnalysis=Optional[null]
Compiler currentCompiler=Optional[null]
Node currentJsRoot=Optional[null]
