public BinomialDistribution(int trials, double p) { [EOL]     this(new Well19937c(), trials, p); [EOL] } <line_num>: 51,53
public BinomialDistribution(RandomGenerator rng, int trials, double p) { [EOL]     super(rng); [EOL]     if (trials < 0) { [EOL]         throw new NotPositiveException(LocalizedFormats.NUMBER_OF_TRIALS, trials); [EOL]     } [EOL]     if (p < 0 || p > 1) { [EOL]         throw new OutOfRangeException(p, 0, 1); [EOL]     } [EOL]     probabilityOfSuccess = p; [EOL]     numberOfTrials = trials; [EOL] } <line_num>: 65,80
public int getNumberOfTrials() { [EOL]     return numberOfTrials; [EOL] } <line_num>: 87,89
public double getProbabilityOfSuccess() { [EOL]     return probabilityOfSuccess; [EOL] } <line_num>: 96,98
public double probability(int x) { [EOL]     double ret; [EOL]     if (x < 0 || x > numberOfTrials) { [EOL]         ret = 0.0; [EOL]     } else { [EOL]         ret = FastMath.exp(SaddlePointExpansion.logBinomialProbability(x, numberOfTrials, probabilityOfSuccess, 1.0 - probabilityOfSuccess)); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 101,111
public double cumulativeProbability(int x) { [EOL]     double ret; [EOL]     if (x < 0) { [EOL]         ret = 0.0; [EOL]     } else if (x >= numberOfTrials) { [EOL]         ret = 1.0; [EOL]     } else { [EOL]         ret = 1.0 - Beta.regularizedBeta(probabilityOfSuccess, x + 1.0, numberOfTrials - x); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 114,125
public double getNumericalMean() { [EOL]     return numberOfTrials * probabilityOfSuccess; [EOL] } <line_num>: 133,135
public double getNumericalVariance() { [EOL]     final double p = probabilityOfSuccess; [EOL]     return numberOfTrials * p * (1 - p); [EOL] } <line_num>: 143,146
public int getSupportLowerBound() { [EOL]     return probabilityOfSuccess < 1.0 ? 0 : numberOfTrials; [EOL] } <line_num>: 156,158
public int getSupportUpperBound() { [EOL]     return probabilityOfSuccess > 0.0 ? numberOfTrials : 0; [EOL] } <line_num>: 168,170
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 179,181
