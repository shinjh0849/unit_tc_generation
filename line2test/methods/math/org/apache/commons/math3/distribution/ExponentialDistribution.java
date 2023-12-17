public ExponentialDistribution(double mean) { [EOL]     this(mean, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 95,97
public ExponentialDistribution(double mean, double inverseCumAccuracy) { [EOL]     this(new Well19937c(), mean, inverseCumAccuracy); [EOL] } <line_num>: 109,111
public ExponentialDistribution(RandomGenerator rng, double mean, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     super(rng); [EOL]     if (mean <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.MEAN, mean); [EOL]     } [EOL]     this.mean = mean; [EOL]     solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 124,135
public double getMean() { [EOL]     return mean; [EOL] } <line_num>: 142,144
public double density(double x) { [EOL]     if (x < 0) { [EOL]         return 0; [EOL]     } [EOL]     return FastMath.exp(-x / mean) / mean; [EOL] } <line_num>: 147,152
public double cumulativeProbability(double x) { [EOL]     double ret; [EOL]     if (x <= 0.0) { [EOL]         ret = 0.0; [EOL]     } else { [EOL]         ret = 1.0 - FastMath.exp(-x / mean); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 164,172
@Override [EOL] public double inverseCumulativeProbability(double p) throws OutOfRangeException { [EOL]     double ret; [EOL]     if (p < 0.0 || p > 1.0) { [EOL]         throw new OutOfRangeException(p, 0.0, 1.0); [EOL]     } else if (p == 1.0) { [EOL]         ret = Double.POSITIVE_INFINITY; [EOL]     } else { [EOL]         ret = -mean * FastMath.log(1.0 - p); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 180,193
@Override [EOL] public double sample() { [EOL]     double a = 0; [EOL]     double u = random.nextDouble(); [EOL]     while (u < 0.5) { [EOL]         a += EXPONENTIAL_SA_QI[0]; [EOL]         u *= 2; [EOL]     } [EOL]     u += u - 1; [EOL]     if (u <= EXPONENTIAL_SA_QI[0]) { [EOL]         return mean * (a + u); [EOL]     } [EOL]     int i = 0; [EOL]     double u2 = random.nextDouble(); [EOL]     double umin = u2; [EOL]     do { [EOL]         ++i; [EOL]         u2 = random.nextDouble(); [EOL]         if (u2 < umin) { [EOL]             umin = u2; [EOL]         } [EOL]     } while (u > EXPONENTIAL_SA_QI[i]); [EOL]     return mean * (a + umin * EXPONENTIAL_SA_QI[0]); [EOL] } <line_num>: 206,244
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 247,250
public double getNumericalMean() { [EOL]     return getMean(); [EOL] } <line_num>: 257,259
public double getNumericalVariance() { [EOL]     final double m = getMean(); [EOL]     return m * m; [EOL] } <line_num>: 266,269
public double getSupportLowerBound() { [EOL]     return 0; [EOL] } <line_num>: 278,280
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 290,292
public boolean isSupportLowerBoundInclusive() { [EOL]     return true; [EOL] } <line_num>: 295,297
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 300,302
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 311,313
