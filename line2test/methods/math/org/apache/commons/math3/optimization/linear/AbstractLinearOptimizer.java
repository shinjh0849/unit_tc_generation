protected AbstractLinearOptimizer() { [EOL]     setMaxIterations(DEFAULT_MAX_ITERATIONS); [EOL] } <line_num>: 78,80
protected boolean restrictToNonNegative() { [EOL]     return nonNegative; [EOL] } <line_num>: 85,87
protected GoalType getGoalType() { [EOL]     return goal; [EOL] } <line_num>: 92,94
protected LinearObjectiveFunction getFunction() { [EOL]     return function; [EOL] } <line_num>: 99,101
protected Collection<LinearConstraint> getConstraints() { [EOL]     return Collections.unmodifiableCollection(linearConstraints); [EOL] } <line_num>: 106,108
public void setMaxIterations(int maxIterations) { [EOL]     this.maxIterations = maxIterations; [EOL] } <line_num>: 111,113
public int getMaxIterations() { [EOL]     return maxIterations; [EOL] } <line_num>: 116,118
public int getIterations() { [EOL]     return iterations; [EOL] } <line_num>: 121,123
protected void incrementIterationsCounter() throws MaxCountExceededException { [EOL]     if (++iterations > maxIterations) { [EOL]         throw new MaxCountExceededException(maxIterations); [EOL]     } [EOL] } <line_num>: 129,134
public PointValuePair optimize(final LinearObjectiveFunction f, final Collection<LinearConstraint> constraints, final GoalType goalType, final boolean restrictToNonNegative) throws MathIllegalStateException { [EOL]     this.function = f; [EOL]     this.linearConstraints = constraints; [EOL]     this.goal = goalType; [EOL]     this.nonNegative = restrictToNonNegative; [EOL]     iterations = 0; [EOL]     return doOptimize(); [EOL] } <line_num>: 137,153
protected abstract PointValuePair doOptimize() throws MathIllegalStateException; <line_num>: 161,161
