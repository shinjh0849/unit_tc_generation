public GeometricDistribution(double p) { [EOL]     this(new Well19937c(), p); [EOL] } <line_num>: 46,48
public GeometricDistribution(RandomGenerator rng, double p) { [EOL]     super(rng); [EOL]     if (p <= 0 || p > 1) { [EOL]         throw new OutOfRangeException(LocalizedFormats.OUT_OF_RANGE_LEFT, p, 0, 1); [EOL]     } [EOL]     probabilityOfSuccess = p; [EOL] } <line_num>: 57,65
public double getProbabilityOfSuccess() { [EOL]     return probabilityOfSuccess; [EOL] } <line_num>: 72,74
public double probability(int x) { [EOL]     double ret; [EOL]     if (x < 0) { [EOL]         ret = 0.0; [EOL]     } else { [EOL]         final double p = probabilityOfSuccess; [EOL]         ret = FastMath.pow(1 - p, x) * p; [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 77,86
public double cumulativeProbability(int x) { [EOL]     double ret; [EOL]     if (x < 0) { [EOL]         ret = 0.0; [EOL]     } else { [EOL]         final double p = probabilityOfSuccess; [EOL]         ret = 1.0 - FastMath.pow(1 - p, x + 1); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 89,98
public double getNumericalMean() { [EOL]     final double p = probabilityOfSuccess; [EOL]     return (1 - p) / p; [EOL] } <line_num>: 105,108
public double getNumericalVariance() { [EOL]     final double p = probabilityOfSuccess; [EOL]     return (1 - p) / (p * p); [EOL] } <line_num>: 116,119
public int getSupportLowerBound() { [EOL]     return 0; [EOL] } <line_num>: 128,130
public int getSupportUpperBound() { [EOL]     return Integer.MAX_VALUE; [EOL] } <line_num>: 140,142
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 151,153
