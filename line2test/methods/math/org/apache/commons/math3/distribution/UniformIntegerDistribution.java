public UniformIntegerDistribution(int lower, int upper) throws NumberIsTooLargeException { [EOL]     this(new Well19937c(), lower, upper); [EOL] } <line_num>: 50,53
public UniformIntegerDistribution(RandomGenerator rng, int lower, int upper) throws NumberIsTooLargeException { [EOL]     super(rng); [EOL]     if (lower >= upper) { [EOL]         throw new NumberIsTooLargeException(LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false); [EOL]     } [EOL]     this.lower = lower; [EOL]     this.upper = upper; [EOL] } <line_num>: 65,78
public double probability(int x) { [EOL]     if (x < lower || x > upper) { [EOL]         return 0; [EOL]     } [EOL]     return 1.0 / (upper - lower + 1); [EOL] } <line_num>: 81,86
public double cumulativeProbability(int x) { [EOL]     if (x < lower) { [EOL]         return 0; [EOL]     } [EOL]     if (x > upper) { [EOL]         return 1; [EOL]     } [EOL]     return (x - lower + 1.0) / (upper - lower + 1.0); [EOL] } <line_num>: 89,97
public double getNumericalMean() { [EOL]     return 0.5 * (lower + upper); [EOL] } <line_num>: 105,107
public double getNumericalVariance() { [EOL]     double n = upper - lower + 1; [EOL]     return (n * n - 1) / 12.0; [EOL] } <line_num>: 115,118
public int getSupportLowerBound() { [EOL]     return lower; [EOL] } <line_num>: 128,130
public int getSupportUpperBound() { [EOL]     return upper; [EOL] } <line_num>: 140,142
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 151,153
@Override [EOL] public int sample() { [EOL]     final int max = (upper - lower) + 1; [EOL]     if (max <= 0) { [EOL]         while (true) { [EOL]             final int r = random.nextInt(); [EOL]             if (r >= lower && r <= upper) { [EOL]                 return r; [EOL]             } [EOL]         } [EOL]     } else { [EOL]         return lower + random.nextInt(max); [EOL]     } [EOL] } <line_num>: 156,174
