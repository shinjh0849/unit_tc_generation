public BetaDistribution(double alpha, double beta) { [EOL]     this(alpha, beta, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 59,61
public BetaDistribution(double alpha, double beta, double inverseCumAccuracy) { [EOL]     this(new Well19937c(), alpha, beta, inverseCumAccuracy); [EOL] } <line_num>: 73,75
public BetaDistribution(RandomGenerator rng, double alpha, double beta, double inverseCumAccuracy) { [EOL]     super(rng); [EOL]     this.alpha = alpha; [EOL]     this.beta = beta; [EOL]     z = Double.NaN; [EOL]     solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 88,98
public double getAlpha() { [EOL]     return alpha; [EOL] } <line_num>: 105,107
public double getBeta() { [EOL]     return beta; [EOL] } <line_num>: 114,116
private void recomputeZ() { [EOL]     if (Double.isNaN(z)) { [EOL]         z = Gamma.logGamma(alpha) + Gamma.logGamma(beta) - Gamma.logGamma(alpha + beta); [EOL]     } [EOL] } <line_num>: 119,123
public double density(double x) { [EOL]     recomputeZ(); [EOL]     if (x < 0 || x > 1) { [EOL]         return 0; [EOL]     } else if (x == 0) { [EOL]         if (alpha < 1) { [EOL]             throw new NumberIsTooSmallException(LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA, alpha, 1, false); [EOL]         } [EOL]         return 0; [EOL]     } else if (x == 1) { [EOL]         if (beta < 1) { [EOL]             throw new NumberIsTooSmallException(LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA, beta, 1, false); [EOL]         } [EOL]         return 0; [EOL]     } else { [EOL]         double logX = FastMath.log(x); [EOL]         double log1mX = FastMath.log1p(-x); [EOL]         return FastMath.exp((alpha - 1) * logX + (beta - 1) * log1mX - z); [EOL]     } [EOL] } <line_num>: 126,145
public double cumulativeProbability(double x) { [EOL]     if (x <= 0) { [EOL]         return 0; [EOL]     } else if (x >= 1) { [EOL]         return 1; [EOL]     } else { [EOL]         return Beta.regularizedBeta(x, alpha, beta); [EOL]     } [EOL] } <line_num>: 148,156
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 165,168
public double getNumericalMean() { [EOL]     final double a = getAlpha(); [EOL]     return a / (a + getBeta()); [EOL] } <line_num>: 176,179
public double getNumericalVariance() { [EOL]     final double a = getAlpha(); [EOL]     final double b = getBeta(); [EOL]     final double alphabetasum = a + b; [EOL]     return (a * b) / ((alphabetasum * alphabetasum) * (alphabetasum + 1)); [EOL] } <line_num>: 188,193
public double getSupportLowerBound() { [EOL]     return 0; [EOL] } <line_num>: 202,204
public double getSupportUpperBound() { [EOL]     return 1; [EOL] } <line_num>: 213,215
public boolean isSupportLowerBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 218,220
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 223,225
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 234,236
