public UnivariateMultiStartOptimizer(final BaseUnivariateOptimizer<FUNC> optimizer, final int starts, final RandomGenerator generator)
public ConvergenceChecker<UnivariatePointValuePair> getConvergenceChecker()
public int getMaxEvaluations()
public int getEvaluations()
public UnivariatePointValuePair[] getOptima()
public UnivariatePointValuePair optimize(int maxEval, final FUNC f, final GoalType goal, final double min, final double max)
public UnivariatePointValuePair optimize(int maxEval, final FUNC f, final GoalType goal, final double min, final double max, final double startValue)
public int compare(final UnivariatePointValuePair o1, final UnivariatePointValuePair o2)
private void sortPairs(final GoalType goal)
BaseUnivariateOptimizer<FUNC> optimizer
int maxEvaluations
int totalEvaluations
int starts
RandomGenerator generator
UnivariatePointValuePair[] optima
