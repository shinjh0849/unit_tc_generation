public ChiSquaredDistribution(double degreesOfFreedom) { [EOL]     this(degreesOfFreedom, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 47,49
public ChiSquaredDistribution(double degreesOfFreedom, double inverseCumAccuracy) { [EOL]     this(new Well19937c(), degreesOfFreedom, inverseCumAccuracy); [EOL] } <line_num>: 61,64
public ChiSquaredDistribution(RandomGenerator rng, double degreesOfFreedom, double inverseCumAccuracy) { [EOL]     super(rng); [EOL]     gamma = new GammaDistribution(degreesOfFreedom / 2, 2); [EOL]     solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 77,84
public double getDegreesOfFreedom() { [EOL]     return gamma.getShape() * 2.0; [EOL] } <line_num>: 91,93
public double density(double x) { [EOL]     return gamma.density(x); [EOL] } <line_num>: 96,98
public double cumulativeProbability(double x) { [EOL]     return gamma.cumulativeProbability(x); [EOL] } <line_num>: 101,103
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 106,109
public double getNumericalMean() { [EOL]     return getDegreesOfFreedom(); [EOL] } <line_num>: 116,118
public double getNumericalVariance() { [EOL]     return 2 * getDegreesOfFreedom(); [EOL] } <line_num>: 125,127
public double getSupportLowerBound() { [EOL]     return 0; [EOL] } <line_num>: 137,139
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 149,151
public boolean isSupportLowerBoundInclusive() { [EOL]     return true; [EOL] } <line_num>: 154,156
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 159,161
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 170,172
