public CauchyDistribution() { [EOL]     this(0, 1); [EOL] } <line_num>: 53,55
public CauchyDistribution(double median, double scale) { [EOL]     this(median, scale, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 63,65
public CauchyDistribution(double median, double scale, double inverseCumAccuracy) { [EOL]     this(new Well19937c(), median, scale, inverseCumAccuracy); [EOL] } <line_num>: 78,81
public CauchyDistribution(RandomGenerator rng, double median, double scale, double inverseCumAccuracy) { [EOL]     super(rng); [EOL]     if (scale <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.SCALE, scale); [EOL]     } [EOL]     this.scale = scale; [EOL]     this.median = median; [EOL]     solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 95,106
public double cumulativeProbability(double x) { [EOL]     return 0.5 + (FastMath.atan((x - median) / scale) / FastMath.PI); [EOL] } <line_num>: 109,111
public double getMedian() { [EOL]     return median; [EOL] } <line_num>: 118,120
public double getScale() { [EOL]     return scale; [EOL] } <line_num>: 127,129
public double density(double x) { [EOL]     final double dev = x - median; [EOL]     return (1 / FastMath.PI) * (scale / (dev * dev + scale * scale)); [EOL] } <line_num>: 132,135
@Override [EOL] public double inverseCumulativeProbability(double p) throws OutOfRangeException { [EOL]     double ret; [EOL]     if (p < 0 || p > 1) { [EOL]         throw new OutOfRangeException(p, 0, 1); [EOL]     } else if (p == 0) { [EOL]         ret = Double.NEGATIVE_INFINITY; [EOL]     } else if (p == 1) { [EOL]         ret = Double.POSITIVE_INFINITY; [EOL]     } else { [EOL]         ret = median + scale * FastMath.tan(FastMath.PI * (p - .5)); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 143,156
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 159,162
public double getNumericalMean() { [EOL]     return Double.NaN; [EOL] } <line_num>: 171,173
public double getNumericalVariance() { [EOL]     return Double.NaN; [EOL] } <line_num>: 182,184
public double getSupportLowerBound() { [EOL]     return Double.NEGATIVE_INFINITY; [EOL] } <line_num>: 194,196
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 206,208
public boolean isSupportLowerBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 211,213
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 216,218
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 227,229
