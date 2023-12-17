protected BaseAbstractUnivariateIntegrator(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException
protected BaseAbstractUnivariateIntegrator(final double relativeAccuracy, final double absoluteAccuracy)
protected BaseAbstractUnivariateIntegrator(final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException
public double getRelativeAccuracy()
public double getAbsoluteAccuracy()
public int getMinimalIterationCount()
public int getMaximalIterationCount()
public int getEvaluations()
public int getIterations()
protected double getMin()
protected double getMax()
protected double computeObjectiveValue(final double point) throws TooManyEvaluationsException
protected void setup(final int maxEval, final UnivariateFunction f, final double lower, final double upper) throws NullArgumentException, MathIllegalArgumentException
public double integrate(final int maxEval, final UnivariateFunction f, final double lower, final double upper) throws TooManyEvaluationsException, MaxCountExceededException, MathIllegalArgumentException, NullArgumentException
protected abstract double doIntegrate() throws TooManyEvaluationsException, MaxCountExceededException
double DEFAULT_ABSOLUTE_ACCURACY=Optional[1.0e-15]
double DEFAULT_RELATIVE_ACCURACY=Optional[1.0e-6]
int DEFAULT_MIN_ITERATIONS_COUNT=Optional[3]
int DEFAULT_MAX_ITERATIONS_COUNT=Optional[Integer.MAX_VALUE]
Incrementor iterations
double absoluteAccuracy
double relativeAccuracy
int minimalIterationCount
Incrementor evaluations
UnivariateFunction function
double min
double max
