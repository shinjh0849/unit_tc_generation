public ParetoDistribution() { [EOL]     this(1, 1); [EOL] } <line_num>: 70,72
public ParetoDistribution(double scale, double shape) throws NotStrictlyPositiveException { [EOL]     this(scale, shape, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 81,84
public ParetoDistribution(double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     this(new Well19937c(), scale, shape, inverseCumAccuracy); [EOL] } <line_num>: 95,98
public ParetoDistribution(RandomGenerator rng, double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     super(rng); [EOL]     if (scale <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.SCALE, scale); [EOL]     } [EOL]     if (shape <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.SHAPE, shape); [EOL]     } [EOL]     this.scale = scale; [EOL]     this.shape = shape; [EOL]     this.solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 109,127
public double getScale() { [EOL]     return scale; [EOL] } <line_num>: 134,136
public double getShape() { [EOL]     return shape; [EOL] } <line_num>: 143,145
public double density(double x) { [EOL]     if (x < scale) { [EOL]         return 0; [EOL]     } [EOL]     return FastMath.pow(scale, shape) / FastMath.pow(x, shape + 1) * shape; [EOL] } <line_num>: 157,162
public double cumulativeProbability(double x) { [EOL]     if (x <= scale) { [EOL]         return 0; [EOL]     } [EOL]     return 1 - FastMath.pow(scale / x, shape); [EOL] } <line_num>: 173,178
@Override [EOL] @Deprecated [EOL] public double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException { [EOL]     return probability(x0, x1); [EOL] } <line_num>: 185,190
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 193,196
public double getNumericalMean() { [EOL]     if (shape <= 1) { [EOL]         return Double.POSITIVE_INFINITY; [EOL]     } [EOL]     return shape * scale / (shape - 1); [EOL] } <line_num>: 207,212
public double getNumericalVariance() { [EOL]     if (shape <= 2) { [EOL]         return Double.POSITIVE_INFINITY; [EOL]     } [EOL]     double s = shape - 1; [EOL]     return scale * scale * shape / (s * s) / (shape - 2); [EOL] } <line_num>: 223,229
public double getSupportLowerBound() { [EOL]     return scale; [EOL] } <line_num>: 238,240
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 249,251
public boolean isSupportLowerBoundInclusive() { [EOL]     return true; [EOL] } <line_num>: 254,256
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 259,261
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 270,272
@Override [EOL] public double sample() { [EOL]     final double n = random.nextDouble(); [EOL]     return scale / FastMath.pow(n, 1 / shape); [EOL] } <line_num>: 275,279
