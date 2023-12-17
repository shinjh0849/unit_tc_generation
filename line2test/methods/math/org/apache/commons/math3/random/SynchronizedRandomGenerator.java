public SynchronizedRandomGenerator(RandomGenerator rng) { [EOL]     wrapped = rng; [EOL] } <line_num>: 42,44
public synchronized void setSeed(int seed) { [EOL]     wrapped.setSeed(seed); [EOL] } <line_num>: 49,51
public synchronized void setSeed(int[] seed) { [EOL]     wrapped.setSeed(seed); [EOL] } <line_num>: 56,58
public synchronized void setSeed(long seed) { [EOL]     wrapped.setSeed(seed); [EOL] } <line_num>: 63,65
public synchronized void nextBytes(byte[] bytes) { [EOL]     wrapped.nextBytes(bytes); [EOL] } <line_num>: 70,72
public synchronized int nextInt() { [EOL]     return wrapped.nextInt(); [EOL] } <line_num>: 77,79
public synchronized int nextInt(int n) { [EOL]     return wrapped.nextInt(n); [EOL] } <line_num>: 84,86
public synchronized long nextLong() { [EOL]     return wrapped.nextLong(); [EOL] } <line_num>: 91,93
public synchronized boolean nextBoolean() { [EOL]     return wrapped.nextBoolean(); [EOL] } <line_num>: 98,100
public synchronized float nextFloat() { [EOL]     return wrapped.nextFloat(); [EOL] } <line_num>: 105,107
public synchronized double nextDouble() { [EOL]     return wrapped.nextDouble(); [EOL] } <line_num>: 112,114
public synchronized double nextGaussian() { [EOL]     return wrapped.nextGaussian(); [EOL] } <line_num>: 119,121
