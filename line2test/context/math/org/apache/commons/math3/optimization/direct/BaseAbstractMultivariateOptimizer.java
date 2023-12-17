protected BaseAbstractMultivariateOptimizer()
protected BaseAbstractMultivariateOptimizer(ConvergenceChecker<PointValuePair> checker)
public int getMaxEvaluations()
public int getEvaluations()
public ConvergenceChecker<PointValuePair> getConvergenceChecker()
protected double computeObjectiveValue(double[] point)
public PointValuePair optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint)
public PointValuePair optimize(int maxEval, FUNC f, GoalType goalType, OptimizationData... optData)
protected PointValuePair optimizeInternal(int maxEval, FUNC f, GoalType goalType, double[] startPoint)
protected PointValuePair optimizeInternal(int maxEval, FUNC f, GoalType goalType, OptimizationData... optData) throws TooManyEvaluationsException
private void parseOptimizationData(OptimizationData... optData)
public GoalType getGoalType()
public double[] getStartPoint()
public double[] getLowerBound()
public double[] getUpperBound()
protected abstract PointValuePair doOptimize()
private void checkParameters()
Incrementor evaluations=Optional[new Incrementor()]
ConvergenceChecker<PointValuePair> checker
GoalType goal
double[] start
double[] lowerBound
double[] upperBound
MultivariateFunction function
