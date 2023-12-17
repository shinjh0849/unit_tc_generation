protected AbstractMultivariateRealDistribution(RandomGenerator rng, int n) { [EOL]     random = rng; [EOL]     dimension = n; [EOL] } <line_num>: 40,44
public void reseedRandomGenerator(long seed) { [EOL]     random.setSeed(seed); [EOL] } <line_num>: 47,49
public int getDimension() { [EOL]     return dimension; [EOL] } <line_num>: 52,54
public abstract double[] sample(); <line_num>: 57,57
public double[][] sample(final int sampleSize) { [EOL]     if (sampleSize <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize); [EOL]     } [EOL]     final double[][] out = new double[sampleSize][dimension]; [EOL]     for (int i = 0; i < sampleSize; i++) { [EOL]         out[i] = sample(); [EOL]     } [EOL]     return out; [EOL] } <line_num>: 60,70
