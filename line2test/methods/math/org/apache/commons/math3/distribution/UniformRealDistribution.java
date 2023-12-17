public UniformRealDistribution() { [EOL]     this(0, 1); [EOL] } <line_num>: 52,54
public UniformRealDistribution(double lower, double upper) throws NumberIsTooLargeException { [EOL]     this(new Well19937c(), lower, upper); [EOL] } <line_num>: 64,67
@Deprecated [EOL] public UniformRealDistribution(double lower, double upper, double inverseCumAccuracy) throws NumberIsTooLargeException { [EOL]     this(new Well19937c(), lower, upper); [EOL] } <line_num>: 79,83
@Deprecated [EOL] public UniformRealDistribution(RandomGenerator rng, double lower, double upper, double inverseCumAccuracy) { [EOL]     this(rng, lower, upper); [EOL] } <line_num>: 98,104
public UniformRealDistribution(RandomGenerator rng, double lower, double upper) throws NumberIsTooLargeException { [EOL]     super(rng); [EOL]     if (lower >= upper) { [EOL]         throw new NumberIsTooLargeException(LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false); [EOL]     } [EOL]     this.lower = lower; [EOL]     this.upper = upper; [EOL] } <line_num>: 115,128
public double density(double x) { [EOL]     if (x < lower || x > upper) { [EOL]         return 0.0; [EOL]     } [EOL]     return 1 / (upper - lower); [EOL] } <line_num>: 131,136
public double cumulativeProbability(double x) { [EOL]     if (x <= lower) { [EOL]         return 0; [EOL]     } [EOL]     if (x >= upper) { [EOL]         return 1; [EOL]     } [EOL]     return (x - lower) / (upper - lower); [EOL] } <line_num>: 139,147
@Override [EOL] public double inverseCumulativeProbability(final double p) throws OutOfRangeException { [EOL]     if (p < 0.0 || p > 1.0) { [EOL]         throw new OutOfRangeException(p, 0, 1); [EOL]     } [EOL]     return p * (upper - lower) + lower; [EOL] } <line_num>: 149,156
public double getNumericalMean() { [EOL]     return 0.5 * (lower + upper); [EOL] } <line_num>: 164,166
public double getNumericalVariance() { [EOL]     double ul = upper - lower; [EOL]     return ul * ul / 12; [EOL] } <line_num>: 174,177
public double getSupportLowerBound() { [EOL]     return lower; [EOL] } <line_num>: 187,189
public double getSupportUpperBound() { [EOL]     return upper; [EOL] } <line_num>: 199,201
public boolean isSupportLowerBoundInclusive() { [EOL]     return true; [EOL] } <line_num>: 204,206
public boolean isSupportUpperBoundInclusive() { [EOL]     return true; [EOL] } <line_num>: 209,211
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 220,222
@Override [EOL] public double sample() { [EOL]     final double u = random.nextDouble(); [EOL]     return u * upper + (1 - u) * lower; [EOL] } <line_num>: 225,229
