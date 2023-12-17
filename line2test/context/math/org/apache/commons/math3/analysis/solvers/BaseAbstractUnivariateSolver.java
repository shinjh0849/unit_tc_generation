protected BaseAbstractUnivariateSolver(final double absoluteAccuracy)
protected BaseAbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy)
protected BaseAbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy)
public int getMaxEvaluations()
public int getEvaluations()
public double getMin()
public double getMax()
public double getStartValue()
public double getAbsoluteAccuracy()
public double getRelativeAccuracy()
public double getFunctionValueAccuracy()
protected double computeObjectiveValue(double point) throws TooManyEvaluationsException
protected void setup(int maxEval, FUNC f, double min, double max, double startValue) throws NullArgumentException
public double solve(int maxEval, FUNC f, double min, double max, double startValue) throws TooManyEvaluationsException, NoBracketingException
public double solve(int maxEval, FUNC f, double min, double max)
public double solve(int maxEval, FUNC f, double startValue) throws TooManyEvaluationsException, NoBracketingException
protected abstract double doSolve() throws TooManyEvaluationsException, NoBracketingException
protected boolean isBracketing(final double lower, final double upper)
protected boolean isSequence(final double start, final double mid, final double end)
protected void verifyInterval(final double lower, final double upper) throws NumberIsTooLargeException
protected void verifySequence(final double lower, final double initial, final double upper) throws NumberIsTooLargeException
protected void verifyBracketing(final double lower, final double upper) throws NullArgumentException, NoBracketingException
protected void incrementEvaluationCount() throws TooManyEvaluationsException
double DEFAULT_RELATIVE_ACCURACY=Optional[1e-14]
double DEFAULT_FUNCTION_VALUE_ACCURACY=Optional[1e-15]
double functionValueAccuracy
double absoluteAccuracy
double relativeAccuracy
Incrementor evaluations=Optional[new Incrementor()]
double searchMin
double searchMax
double searchStart
FUNC function
