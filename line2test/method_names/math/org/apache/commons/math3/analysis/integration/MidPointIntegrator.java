public MidPointIntegrator(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException
public MidPointIntegrator(final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException
public MidPointIntegrator()
private double stage(final int n, double previousStageResult, double min, double diffMaxMin) throws TooManyEvaluationsException
protected double doIntegrate() throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException
