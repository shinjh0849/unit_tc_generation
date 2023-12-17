double probability(double x); <line_num>: 38,38
double density(double x); <line_num>: 52,52
double cumulativeProbability(double x); <line_num>: 64,64
@Deprecated [EOL] double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException; <line_num>: 80,81
double inverseCumulativeProbability(double p) throws OutOfRangeException; <line_num>: 97,97
double getNumericalMean(); <line_num>: 105,105
double getNumericalVariance(); <line_num>: 115,115
double getSupportLowerBound(); <line_num>: 126,126
double getSupportUpperBound(); <line_num>: 137,137
@Deprecated [EOL] boolean isSupportLowerBoundInclusive(); <line_num>: 149,150
@Deprecated [EOL] boolean isSupportUpperBoundInclusive(); <line_num>: 162,163
boolean isSupportConnected(); <line_num>: 172,172
void reseedRandomGenerator(long seed); <line_num>: 179,179
double sample(); <line_num>: 186,186
double[] sample(int sampleSize); <line_num>: 196,196
