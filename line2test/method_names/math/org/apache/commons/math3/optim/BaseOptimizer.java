protected BaseOptimizer(ConvergenceChecker<PAIR> checker)
protected BaseOptimizer(ConvergenceChecker<PAIR> checker, int maxEval, int maxIter)
public int getMaxEvaluations()
public int getEvaluations()
public int getMaxIterations()
public int getIterations()
public ConvergenceChecker<PAIR> getConvergenceChecker()
public PAIR optimize(OptimizationData... optData) throws TooManyEvaluationsException, TooManyIterationsException
public PAIR optimize() throws TooManyEvaluationsException, TooManyIterationsException
protected abstract PAIR doOptimize()
protected void incrementEvaluationCount() throws TooManyEvaluationsException
protected void incrementIterationCount() throws TooManyIterationsException
protected void parseOptimizationData(OptimizationData... optData)
public void trigger(int max)
public void trigger(int max)
