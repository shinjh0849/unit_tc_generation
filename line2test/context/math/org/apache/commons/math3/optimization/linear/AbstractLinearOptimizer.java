protected AbstractLinearOptimizer()
protected boolean restrictToNonNegative()
protected GoalType getGoalType()
protected LinearObjectiveFunction getFunction()
protected Collection<LinearConstraint> getConstraints()
public void setMaxIterations(int maxIterations)
public int getMaxIterations()
public int getIterations()
protected void incrementIterationsCounter() throws MaxCountExceededException
public PointValuePair optimize(final LinearObjectiveFunction f, final Collection<LinearConstraint> constraints, final GoalType goalType, final boolean restrictToNonNegative) throws MathIllegalStateException
protected abstract PointValuePair doOptimize() throws MathIllegalStateException
int DEFAULT_MAX_ITERATIONS=Optional[100]
LinearObjectiveFunction function
Collection<LinearConstraint> linearConstraints
GoalType goal
boolean nonNegative
int maxIterations
int iterations
