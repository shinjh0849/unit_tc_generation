protected BaseOptimizer(ConvergenceChecker<PAIR> checker) { [EOL]     this(checker, 0, Integer.MAX_VALUE); [EOL] } <line_num>: 47,49
protected BaseOptimizer(ConvergenceChecker<PAIR> checker, int maxEval, int maxIter) { [EOL]     this.checker = checker; [EOL]     evaluations = new Incrementor(maxEval, new MaxEvalCallback()); [EOL]     iterations = new Incrementor(maxIter, new MaxIterCallback()); [EOL] } <line_num>: 56,63
public int getMaxEvaluations() { [EOL]     return evaluations.getMaximalCount(); [EOL] } <line_num>: 70,72
public int getEvaluations() { [EOL]     return evaluations.getCount(); [EOL] } <line_num>: 82,84
public int getMaxIterations() { [EOL]     return iterations.getMaximalCount(); [EOL] } <line_num>: 91,93
public int getIterations() { [EOL]     return iterations.getCount(); [EOL] } <line_num>: 103,105
public ConvergenceChecker<PAIR> getConvergenceChecker() { [EOL]     return checker; [EOL] } <line_num>: 112,114
public PAIR optimize(OptimizationData... optData) throws TooManyEvaluationsException, TooManyIterationsException { [EOL]     parseOptimizationData(optData); [EOL]     evaluations.resetCount(); [EOL]     iterations.resetCount(); [EOL]     return doOptimize(); [EOL] } <line_num>: 144,155
public PAIR optimize() throws TooManyEvaluationsException, TooManyIterationsException { [EOL]     evaluations.resetCount(); [EOL]     iterations.resetCount(); [EOL]     return doOptimize(); [EOL] } <line_num>: 166,174
protected abstract PAIR doOptimize(); <line_num>: 182,182
protected void incrementEvaluationCount() throws TooManyEvaluationsException { [EOL]     evaluations.incrementCount(); [EOL] } <line_num>: 190,193
protected void incrementIterationCount() throws TooManyIterationsException { [EOL]     iterations.incrementCount(); [EOL] } <line_num>: 201,204
protected void parseOptimizationData(OptimizationData... optData) { [EOL]     for (OptimizationData data : optData) { [EOL]         if (data instanceof MaxEval) { [EOL]             evaluations.setMaximalCount(((MaxEval) data).getMaxEval()); [EOL]             continue; [EOL]         } [EOL]         if (data instanceof MaxIter) { [EOL]             iterations.setMaximalCount(((MaxIter) data).getMaxIter()); [EOL]             continue; [EOL]         } [EOL]     } [EOL] } <line_num>: 217,230
public void trigger(int max) { [EOL]     throw new TooManyEvaluationsException(max); [EOL] } <line_num>: 242,244
public void trigger(int max) { [EOL]     throw new TooManyIterationsException(max); [EOL] } <line_num>: 257,259
