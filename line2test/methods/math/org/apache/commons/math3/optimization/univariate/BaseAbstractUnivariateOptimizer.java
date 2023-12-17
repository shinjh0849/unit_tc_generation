protected BaseAbstractUnivariateOptimizer(ConvergenceChecker<UnivariatePointValuePair> checker) { [EOL]     this.checker = checker; [EOL] } <line_num>: 57,59
public int getMaxEvaluations() { [EOL]     return evaluations.getMaximalCount(); [EOL] } <line_num>: 62,64
public int getEvaluations() { [EOL]     return evaluations.getCount(); [EOL] } <line_num>: 67,69
public GoalType getGoalType() { [EOL]     return goal; [EOL] } <line_num>: 74,76
public double getMin() { [EOL]     return searchMin; [EOL] } <line_num>: 80,82
public double getMax() { [EOL]     return searchMax; [EOL] } <line_num>: 86,88
public double getStartValue() { [EOL]     return searchStart; [EOL] } <line_num>: 92,94
protected double computeObjectiveValue(double point) { [EOL]     try { [EOL]         evaluations.incrementCount(); [EOL]     } catch (MaxCountExceededException e) { [EOL]         throw new TooManyEvaluationsException(e.getMax()); [EOL]     } [EOL]     return function.value(point); [EOL] } <line_num>: 104,111
public UnivariatePointValuePair optimize(int maxEval, UnivariateFunction f, GoalType goalType, double min, double max, double startValue) { [EOL]     if (f == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     if (goalType == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     searchMin = min; [EOL]     searchMax = max; [EOL]     searchStart = startValue; [EOL]     goal = goalType; [EOL]     function = f; [EOL]     evaluations.setMaximalCount(maxEval); [EOL]     evaluations.resetCount(); [EOL]     return doOptimize(); [EOL] } <line_num>: 114,137
public UnivariatePointValuePair optimize(int maxEval, UnivariateFunction f, GoalType goalType, double min, double max) { [EOL]     return optimize(maxEval, f, goalType, min, max, min + 0.5 * (max - min)); [EOL] } <line_num>: 140,145
public ConvergenceChecker<UnivariatePointValuePair> getConvergenceChecker() { [EOL]     return checker; [EOL] } <line_num>: 150,152
protected abstract UnivariatePointValuePair doOptimize(); <line_num>: 162,162
