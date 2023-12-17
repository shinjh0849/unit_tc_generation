protected AbstractOptimizer()
protected AbstractOptimizer(AbstractOptimizer<PAIR, OPTIM> other)
protected OPTIM self()
public OPTIM withConvergenceChecker(ConvergenceChecker<PAIR> newChecker)
public OPTIM withMaxEvaluations(int max)
public OPTIM withMaxIterations(int max)
public int getMaxEvaluations()
public int getEvaluations()
public int getMaxIterations()
public int getIterations()
public ConvergenceChecker<PAIR> getConvergenceChecker()
public PAIR optimize() throws TooManyEvaluationsException, TooManyIterationsException
public abstract OPTIM shallowCopy()
protected abstract PAIR doOptimize()
protected void incrementEvaluationCount() throws TooManyEvaluationsException
protected void incrementIterationCount() throws TooManyIterationsException
public void trigger(int max)
public void trigger(int max)
Incrementor evaluations=Optional[new Incrementor(Integer.MAX_VALUE, new MaxEvalCallback())]
Incrementor iterations=Optional[new Incrementor(Integer.MAX_VALUE, new MaxIterCallback())]
ConvergenceChecker<PAIR> checker=Optional[null]
