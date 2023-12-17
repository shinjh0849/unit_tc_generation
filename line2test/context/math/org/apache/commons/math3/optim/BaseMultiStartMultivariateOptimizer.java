public BaseMultiStartMultivariateOptimizer(final BaseMultivariateOptimizer<PAIR> optimizer, final int starts, final RandomVectorGenerator generator)
public int getEvaluations()
public abstract PAIR[] getOptima()
public PAIR optimize(OptimizationData... optData)
protected PAIR doOptimize()
protected abstract void store(PAIR optimum)
protected abstract void clear()
BaseMultivariateOptimizer<PAIR> optimizer
int totalEvaluations
int starts
RandomVectorGenerator generator
OptimizationData[] optimData
int maxEvalIndex=Optional[-1]
int initialGuessIndex=Optional[-1]
