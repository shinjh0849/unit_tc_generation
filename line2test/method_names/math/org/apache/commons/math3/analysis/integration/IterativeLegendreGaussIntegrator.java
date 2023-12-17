public IterativeLegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException
public IterativeLegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy) throws NotStrictlyPositiveException
public IterativeLegendreGaussIntegrator(final int n, final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException
protected double doIntegrate() throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException
public double value(double x) throws MathIllegalArgumentException, TooManyEvaluationsException
private double stage(final int n) throws TooManyEvaluationsException
