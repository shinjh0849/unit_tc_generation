protected UnivariateOptimizer(ConvergenceChecker<UnivariatePointValuePair> checker)
public UnivariatePointValuePair optimize(OptimizationData... optData) throws TooManyEvaluationsException
public GoalType getGoalType()
protected void parseOptimizationData(OptimizationData... optData)
public double getStartValue()
public double getMin()
public double getMax()
protected double computeObjectiveValue(double x)
