protected BaseAbstractUnivariateOptimizer(ConvergenceChecker<UnivariatePointValuePair> checker)
public int getMaxEvaluations()
public int getEvaluations()
public GoalType getGoalType()
public double getMin()
public double getMax()
public double getStartValue()
protected double computeObjectiveValue(double point)
public UnivariatePointValuePair optimize(int maxEval, UnivariateFunction f, GoalType goalType, double min, double max, double startValue)
public UnivariatePointValuePair optimize(int maxEval, UnivariateFunction f, GoalType goalType, double min, double max)
public ConvergenceChecker<UnivariatePointValuePair> getConvergenceChecker()
protected abstract UnivariatePointValuePair doOptimize()
ConvergenceChecker<UnivariatePointValuePair> checker
Incrementor evaluations=Optional[new Incrementor()]
GoalType goal
double searchMin
double searchMax
double searchStart
UnivariateFunction function
