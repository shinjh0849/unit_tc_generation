protected AbstractOptimizer() { [EOL] } <line_num>: 56,56
protected AbstractOptimizer(AbstractOptimizer<PAIR, OPTIM> other) { [EOL]     checker = other.checker; [EOL]     evaluations.setMaximalCount(other.getMaxEvaluations()); [EOL]     iterations.setMaximalCount(other.getMaxIterations()); [EOL] } <line_num>: 63,67
protected OPTIM self() { [EOL]     @SuppressWarnings("unchecked") [EOL]     final OPTIM optim = (OPTIM) this; [EOL]     return optim; [EOL] } <line_num>: 74,78
public OPTIM withConvergenceChecker(ConvergenceChecker<PAIR> newChecker) { [EOL]     this.checker = newChecker; [EOL]     return self(); [EOL] } <line_num>: 81,84
public OPTIM withMaxEvaluations(int max) { [EOL]     evaluations.setMaximalCount(max); [EOL]     return self(); [EOL] } <line_num>: 87,90
public OPTIM withMaxIterations(int max) { [EOL]     iterations.setMaximalCount(max); [EOL]     return self(); [EOL] } <line_num>: 93,96
public int getMaxEvaluations() { [EOL]     return evaluations.getMaximalCount(); [EOL] } <line_num>: 103,105
public int getEvaluations() { [EOL]     return evaluations.getCount(); [EOL] } <line_num>: 115,117
public int getMaxIterations() { [EOL]     return iterations.getMaximalCount(); [EOL] } <line_num>: 124,126
public int getIterations() { [EOL]     return iterations.getCount(); [EOL] } <line_num>: 136,138
public ConvergenceChecker<PAIR> getConvergenceChecker() { [EOL]     return checker; [EOL] } <line_num>: 145,147
public PAIR optimize() throws TooManyEvaluationsException, TooManyIterationsException { [EOL]     evaluations.resetCount(); [EOL]     iterations.resetCount(); [EOL]     return doOptimize(); [EOL] } <line_num>: 158,166
public abstract OPTIM shallowCopy(); <line_num>: 175,175
protected abstract PAIR doOptimize(); <line_num>: 183,183
protected void incrementEvaluationCount() throws TooManyEvaluationsException { [EOL]     evaluations.incrementCount(); [EOL] } <line_num>: 191,194
protected void incrementIterationCount() throws TooManyIterationsException { [EOL]     iterations.incrementCount(); [EOL] } <line_num>: 202,205
public void trigger(int max) { [EOL]     throw new TooManyEvaluationsException(max); [EOL] } <line_num>: 217,219
public void trigger(int max) { [EOL]     throw new TooManyIterationsException(max); [EOL] } <line_num>: 232,234
