public LevyDistribution(final RandomGenerator rng, final double mu, final double c) { [EOL]     super(rng); [EOL]     this.mu = mu; [EOL]     this.c = c; [EOL]     this.halfC = 0.5 * c; [EOL] } <line_num>: 51,56
public double density(final double x) { [EOL]     if (x < mu) { [EOL]         return Double.NaN; [EOL]     } [EOL]     final double delta = x - mu; [EOL]     final double f = halfC / delta; [EOL]     return FastMath.sqrt(f / FastMath.PI) * FastMath.exp(-f) / delta; [EOL] } <line_num>: 72,80
public double cumulativeProbability(final double x) { [EOL]     if (x < mu) { [EOL]         return Double.NaN; [EOL]     } [EOL]     return Erf.erfc(FastMath.sqrt(halfC / (x - mu))); [EOL] } <line_num>: 90,95
@Override [EOL] public double inverseCumulativeProbability(final double p) throws OutOfRangeException { [EOL]     if (p < 0.0 || p > 1.0) { [EOL]         throw new OutOfRangeException(p, 0, 1); [EOL]     } [EOL]     final double t = Erf.erfcInv(p); [EOL]     return mu + halfC / (t * t); [EOL] } <line_num>: 98,105
public double getScale() { [EOL]     return c; [EOL] } <line_num>: 110,112
public double getLocation() { [EOL]     return mu; [EOL] } <line_num>: 117,119
public double getNumericalMean() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 122,124
public double getNumericalVariance() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 127,129
public double getSupportLowerBound() { [EOL]     return mu; [EOL] } <line_num>: 132,134
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 137,139
public boolean isSupportLowerBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 142,146
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 149,152
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 155,157
