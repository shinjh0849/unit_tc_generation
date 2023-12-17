public LogNormalDistribution() { [EOL]     this(0, 1); [EOL] } <line_num>: 85,87
public LogNormalDistribution(double scale, double shape) throws NotStrictlyPositiveException { [EOL]     this(scale, shape, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 96,99
public LogNormalDistribution(double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     this(new Well19937c(), scale, shape, inverseCumAccuracy); [EOL] } <line_num>: 110,113
public LogNormalDistribution(RandomGenerator rng, double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     super(rng); [EOL]     if (shape <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.SHAPE, shape); [EOL]     } [EOL]     this.scale = scale; [EOL]     this.shape = shape; [EOL]     this.solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 125,139
public double getScale() { [EOL]     return scale; [EOL] } <line_num>: 146,148
public double getShape() { [EOL]     return shape; [EOL] } <line_num>: 155,157
public double density(double x) { [EOL]     if (x <= 0) { [EOL]         return 0; [EOL]     } [EOL]     final double x0 = FastMath.log(x) - scale; [EOL]     final double x1 = x0 / shape; [EOL]     return FastMath.exp(-0.5 * x1 * x1) / (shape * SQRT2PI * x); [EOL] } <line_num>: 170,177
public double cumulativeProbability(double x) { [EOL]     if (x <= 0) { [EOL]         return 0; [EOL]     } [EOL]     final double dev = FastMath.log(x) - scale; [EOL]     if (FastMath.abs(dev) > 40 * shape) { [EOL]         return dev < 0 ? 0.0d : 1.0d; [EOL]     } [EOL]     return 0.5 + 0.5 * Erf.erf(dev / (shape * SQRT2)); [EOL] } <line_num>: 194,203
@Override [EOL] @Deprecated [EOL] public double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException { [EOL]     return probability(x0, x1); [EOL] } <line_num>: 210,214
@Override [EOL] public double probability(double x0, double x1) throws NumberIsTooLargeException { [EOL]     if (x0 > x1) { [EOL]         throw new NumberIsTooLargeException(LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true); [EOL]     } [EOL]     if (x0 <= 0 || x1 <= 0) { [EOL]         return super.probability(x0, x1); [EOL]     } [EOL]     final double denom = shape * SQRT2; [EOL]     final double v0 = (FastMath.log(x0) - scale) / denom; [EOL]     final double v1 = (FastMath.log(x1) - scale) / denom; [EOL]     return 0.5 * Erf.erf(v0, v1); [EOL] } <line_num>: 217,232
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 235,238
public double getNumericalMean() { [EOL]     double s = shape; [EOL]     return FastMath.exp(scale + (s * s / 2)); [EOL] } <line_num>: 246,249
public double getNumericalVariance() { [EOL]     final double s = shape; [EOL]     final double ss = s * s; [EOL]     return (FastMath.exp(ss) - 1) * FastMath.exp(2 * scale + ss); [EOL] } <line_num>: 257,261
public double getSupportLowerBound() { [EOL]     return 0; [EOL] } <line_num>: 270,272
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 283,285
public boolean isSupportLowerBoundInclusive() { [EOL]     return true; [EOL] } <line_num>: 288,290
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 293,295
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 304,306
@Override [EOL] public double sample() { [EOL]     final double n = random.nextGaussian(); [EOL]     return FastMath.exp(scale + shape * n); [EOL] } <line_num>: 309,313
