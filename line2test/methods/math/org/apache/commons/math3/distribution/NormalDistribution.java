public NormalDistribution() { [EOL]     this(0, 1); [EOL] } <line_num>: 59,61
public NormalDistribution(double mean, double sd) throws NotStrictlyPositiveException { [EOL]     this(mean, sd, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 70,73
public NormalDistribution(double mean, double sd, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     this(new Well19937c(), mean, sd, inverseCumAccuracy); [EOL] } <line_num>: 85,88
public NormalDistribution(RandomGenerator rng, double mean, double sd, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     super(rng); [EOL]     if (sd <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.STANDARD_DEVIATION, sd); [EOL]     } [EOL]     this.mean = mean; [EOL]     standardDeviation = sd; [EOL]     solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 100,114
public double getMean() { [EOL]     return mean; [EOL] } <line_num>: 121,123
public double getStandardDeviation() { [EOL]     return standardDeviation; [EOL] } <line_num>: 130,132
public double density(double x) { [EOL]     final double x0 = x - mean; [EOL]     final double x1 = x0 / standardDeviation; [EOL]     return FastMath.exp(-0.5 * x1 * x1) / (standardDeviation * SQRT2PI); [EOL] } <line_num>: 135,139
public double cumulativeProbability(double x) { [EOL]     final double dev = x - mean; [EOL]     if (FastMath.abs(dev) > 40 * standardDeviation) { [EOL]         return dev < 0 ? 0.0d : 1.0d; [EOL]     } [EOL]     return 0.5 * (1 + Erf.erf(dev / (standardDeviation * SQRT2))); [EOL] } <line_num>: 148,154
@Override [EOL] public double inverseCumulativeProbability(final double p) throws OutOfRangeException { [EOL]     if (p < 0.0 || p > 1.0) { [EOL]         throw new OutOfRangeException(p, 0, 1); [EOL]     } [EOL]     return mean + standardDeviation * SQRT2 * Erf.erfInv(2 * p - 1); [EOL] } <line_num>: 159,165
@Override [EOL] @Deprecated [EOL] public double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException { [EOL]     return probability(x0, x1); [EOL] } <line_num>: 172,176
@Override [EOL] public double probability(double x0, double x1) throws NumberIsTooLargeException { [EOL]     if (x0 > x1) { [EOL]         throw new NumberIsTooLargeException(LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true); [EOL]     } [EOL]     final double denom = standardDeviation * SQRT2; [EOL]     final double v0 = (x0 - mean) / denom; [EOL]     final double v1 = (x1 - mean) / denom; [EOL]     return 0.5 * Erf.erf(v0, v1); [EOL] } <line_num>: 179,191
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 194,197
public double getNumericalMean() { [EOL]     return getMean(); [EOL] } <line_num>: 204,206
public double getNumericalVariance() { [EOL]     final double s = getStandardDeviation(); [EOL]     return s * s; [EOL] } <line_num>: 213,216
public double getSupportLowerBound() { [EOL]     return Double.NEGATIVE_INFINITY; [EOL] } <line_num>: 227,229
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 240,242
public boolean isSupportLowerBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 245,247
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 250,252
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 261,263
@Override [EOL] public double sample() { [EOL]     return standardDeviation * random.nextGaussian() + mean; [EOL] } <line_num>: 266,269
