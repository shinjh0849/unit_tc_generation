public MultiStartUnivariateOptimizer(final UnivariateOptimizer optimizer, final int starts, final RandomGenerator generator)
public int getEvaluations()
public UnivariatePointValuePair[] getOptima()
public UnivariatePointValuePair optimize(OptimizationData... optData)
protected UnivariatePointValuePair doOptimize()
public int compare(final UnivariatePointValuePair o1, final UnivariatePointValuePair o2)
private void sortPairs(final GoalType goal)
UnivariateOptimizer optimizer
int totalEvaluations
int starts
RandomGenerator generator
UnivariatePointValuePair[] optima
OptimizationData[] optimData
int maxEvalIndex=Optional[-1]
int searchIntervalIndex=Optional[-1]
