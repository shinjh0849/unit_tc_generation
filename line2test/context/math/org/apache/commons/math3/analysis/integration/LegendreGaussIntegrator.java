public LegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws MathIllegalArgumentException, NotStrictlyPositiveException, NumberIsTooSmallException
public LegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy) throws MathIllegalArgumentException
public LegendreGaussIntegrator(final int n, final int minimalIterationCount, final int maximalIterationCount) throws MathIllegalArgumentException
protected double doIntegrate() throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException
private double stage(final int n) throws TooManyEvaluationsException
double[] ABSCISSAS_2=Optional[{ -1.0 / FastMath.sqrt(3.0), 1.0 / FastMath.sqrt(3.0) }]
double[] WEIGHTS_2=Optional[{ 1.0, 1.0 }]
double[] ABSCISSAS_3=Optional[{ -FastMath.sqrt(0.6), 0.0, FastMath.sqrt(0.6) }]
double[] WEIGHTS_3=Optional[{ 5.0 / 9.0, 8.0 / 9.0, 5.0 / 9.0 }]
double[] ABSCISSAS_4=Optional[{ -FastMath.sqrt((15.0 + 2.0 * FastMath.sqrt(30.0)) / 35.0), -FastMath.sqrt((15.0 - 2.0 * FastMath.sqrt(30.0)) / 35.0), FastMath.sqrt((15.0 - 2.0 * FastMath.sqrt(30.0)) / 35.0), FastMath.sqrt((15.0 + 2.0 * FastMath.sqrt(30.0)) / 35.0) }]
double[] WEIGHTS_4=Optional[{ (90.0 - 5.0 * FastMath.sqrt(30.0)) / 180.0, (90.0 + 5.0 * FastMath.sqrt(30.0)) / 180.0, (90.0 + 5.0 * FastMath.sqrt(30.0)) / 180.0, (90.0 - 5.0 * FastMath.sqrt(30.0)) / 180.0 }]
double[] ABSCISSAS_5=Optional[{ -FastMath.sqrt((35.0 + 2.0 * FastMath.sqrt(70.0)) / 63.0), -FastMath.sqrt((35.0 - 2.0 * FastMath.sqrt(70.0)) / 63.0), 0.0, FastMath.sqrt((35.0 - 2.0 * FastMath.sqrt(70.0)) / 63.0), FastMath.sqrt((35.0 + 2.0 * FastMath.sqrt(70.0)) / 63.0) }]
double[] WEIGHTS_5=Optional[{ (322.0 - 13.0 * FastMath.sqrt(70.0)) / 900.0, (322.0 + 13.0 * FastMath.sqrt(70.0)) / 900.0, 128.0 / 225.0, (322.0 + 13.0 * FastMath.sqrt(70.0)) / 900.0, (322.0 - 13.0 * FastMath.sqrt(70.0)) / 900.0 }]
double[] abscissas
double[] weights
