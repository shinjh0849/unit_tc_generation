@SuppressWarnings("unused") [EOL] private RandomAdaptor() { [EOL]     randomGenerator = null; [EOL] } <line_num>: 39,40
public RandomAdaptor(RandomGenerator randomGenerator) { [EOL]     this.randomGenerator = randomGenerator; [EOL] } <line_num>: 47,49
public static Random createAdaptor(RandomGenerator randomGenerator) { [EOL]     return new RandomAdaptor(randomGenerator); [EOL] } <line_num>: 58,60
@Override [EOL] public boolean nextBoolean() { [EOL]     return randomGenerator.nextBoolean(); [EOL] } <line_num>: 71,74
@Override [EOL] public void nextBytes(byte[] bytes) { [EOL]     randomGenerator.nextBytes(bytes); [EOL] } <line_num>: 84,87
@Override [EOL] public double nextDouble() { [EOL]     return randomGenerator.nextDouble(); [EOL] } <line_num>: 98,101
@Override [EOL] public float nextFloat() { [EOL]     return randomGenerator.nextFloat(); [EOL] } <line_num>: 112,115
@Override [EOL] public double nextGaussian() { [EOL]     return randomGenerator.nextGaussian(); [EOL] } <line_num>: 127,130
@Override [EOL] public int nextInt() { [EOL]     return randomGenerator.nextInt(); [EOL] } <line_num>: 141,144
@Override [EOL] public int nextInt(int n) { [EOL]     return randomGenerator.nextInt(n); [EOL] } <line_num>: 157,160
@Override [EOL] public long nextLong() { [EOL]     return randomGenerator.nextLong(); [EOL] } <line_num>: 171,174
public void setSeed(int seed) { [EOL]     if (randomGenerator != null) { [EOL]         randomGenerator.setSeed(seed); [EOL]     } [EOL] } <line_num>: 177,181
public void setSeed(int[] seed) { [EOL]     if (randomGenerator != null) { [EOL]         randomGenerator.setSeed(seed); [EOL]     } [EOL] } <line_num>: 184,188
@Override [EOL] public void setSeed(long seed) { [EOL]     if (randomGenerator != null) { [EOL]         randomGenerator.setSeed(seed); [EOL]     } [EOL] } <line_num>: 191,196
