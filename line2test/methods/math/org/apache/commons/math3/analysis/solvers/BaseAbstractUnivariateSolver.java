protected BaseAbstractUnivariateSolver(final double absoluteAccuracy) { [EOL]     this(DEFAULT_RELATIVE_ACCURACY, absoluteAccuracy, DEFAULT_FUNCTION_VALUE_ACCURACY); [EOL] } <line_num>: 66,70
protected BaseAbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy) { [EOL]     this(relativeAccuracy, absoluteAccuracy, DEFAULT_FUNCTION_VALUE_ACCURACY); [EOL] } <line_num>: 78,83
protected BaseAbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) { [EOL]     this.absoluteAccuracy = absoluteAccuracy; [EOL]     this.relativeAccuracy = relativeAccuracy; [EOL]     this.functionValueAccuracy = functionValueAccuracy; [EOL] } <line_num>: 92,98
public int getMaxEvaluations() { [EOL]     return evaluations.getMaximalCount(); [EOL] } <line_num>: 101,103
public int getEvaluations() { [EOL]     return evaluations.getCount(); [EOL] } <line_num>: 105,107
public double getMin() { [EOL]     return searchMin; [EOL] } <line_num>: 111,113
public double getMax() { [EOL]     return searchMax; [EOL] } <line_num>: 117,119
public double getStartValue() { [EOL]     return searchStart; [EOL] } <line_num>: 123,125
public double getAbsoluteAccuracy() { [EOL]     return absoluteAccuracy; [EOL] } <line_num>: 129,131
public double getRelativeAccuracy() { [EOL]     return relativeAccuracy; [EOL] } <line_num>: 135,137
public double getFunctionValueAccuracy() { [EOL]     return functionValueAccuracy; [EOL] } <line_num>: 141,143
protected double computeObjectiveValue(double point) throws TooManyEvaluationsException { [EOL]     incrementEvaluationCount(); [EOL]     return function.value(point); [EOL] } <line_num>: 153,157
protected void setup(int maxEval, FUNC f, double min, double max, double startValue) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(f); [EOL]     searchMin = min; [EOL]     searchMax = max; [EOL]     searchStart = startValue; [EOL]     function = f; [EOL]     evaluations.setMaximalCount(maxEval); [EOL]     evaluations.resetCount(); [EOL] } <line_num>: 171,186
public double solve(int maxEval, FUNC f, double min, double max, double startValue) throws TooManyEvaluationsException, NoBracketingException { [EOL]     setup(maxEval, f, min, max, startValue); [EOL]     return doSolve(); [EOL] } <line_num>: 189,197
public double solve(int maxEval, FUNC f, double min, double max) { [EOL]     return solve(maxEval, f, min, max, min + 0.5 * (max - min)); [EOL] } <line_num>: 200,202
public double solve(int maxEval, FUNC f, double startValue) throws TooManyEvaluationsException, NoBracketingException { [EOL]     return solve(maxEval, f, Double.NaN, Double.NaN, startValue); [EOL] } <line_num>: 205,209
protected abstract double doSolve() throws TooManyEvaluationsException, NoBracketingException; <line_num>: 221,222
protected boolean isBracketing(final double lower, final double upper) { [EOL]     return UnivariateSolverUtils.isBracketing(function, lower, upper); [EOL] } <line_num>: 232,235
protected boolean isSequence(final double start, final double mid, final double end) { [EOL]     return UnivariateSolverUtils.isSequence(start, mid, end); [EOL] } <line_num>: 245,249
protected void verifyInterval(final double lower, final double upper) throws NumberIsTooLargeException { [EOL]     UnivariateSolverUtils.verifyInterval(lower, upper); [EOL] } <line_num>: 258,262
protected void verifySequence(final double lower, final double initial, final double upper) throws NumberIsTooLargeException { [EOL]     UnivariateSolverUtils.verifySequence(lower, initial, upper); [EOL] } <line_num>: 273,278
protected void verifyBracketing(final double lower, final double upper) throws NullArgumentException, NoBracketingException { [EOL]     UnivariateSolverUtils.verifyBracketing(function, lower, upper); [EOL] } <line_num>: 290,295
protected void incrementEvaluationCount() throws TooManyEvaluationsException { [EOL]     try { [EOL]         evaluations.incrementCount(); [EOL]     } catch (MaxCountExceededException e) { [EOL]         throw new TooManyEvaluationsException(e.getMax()); [EOL]     } [EOL] } <line_num>: 307,314
