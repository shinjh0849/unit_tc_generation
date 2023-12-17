public Path(Step[] steps)
public Step[] getSteps()
public boolean computeContextDependent()
public boolean isSimplePath()
protected boolean isSimpleStep(Step step)
protected boolean areBasicPredicates(Expression[] predicates)
protected Pointer getSingleNodePointerForSteps(EvalContext context)
private Pointer searchForPath(EvalContext context)
protected EvalContext evalSteps(EvalContext context)
private EvalContext buildContextChain(EvalContext context, int stepCount, boolean createInitialContext)
protected EvalContext createContextForStep(EvalContext context, int axis, NodeTest nodeTest)
Step[] steps
boolean basicKnown=Optional[false]
boolean basic
