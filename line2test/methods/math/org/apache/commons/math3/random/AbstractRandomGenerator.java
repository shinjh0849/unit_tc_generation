public AbstractRandomGenerator() { [EOL]     super(); [EOL] } <line_num>: 50,53
public void clear() { [EOL]     cachedNormalDeviate = Double.NaN; [EOL] } <line_num>: 61,63
public void setSeed(int seed) { [EOL]     setSeed((long) seed); [EOL] } <line_num>: 66,68
public void setSeed(int[] seed) { [EOL]     final long prime = 4294967291l; [EOL]     long combined = 0l; [EOL]     for (int s : seed) { [EOL]         combined = combined * prime + s; [EOL]     } [EOL]     setSeed(combined); [EOL] } <line_num>: 71,80
public abstract void setSeed(long seed); <line_num>: 93,93
public void nextBytes(byte[] bytes) { [EOL]     int bytesOut = 0; [EOL]     while (bytesOut < bytes.length) { [EOL]         int randInt = nextInt(); [EOL]         for (int i = 0; i < 3; i++) { [EOL]             if (i > 0) { [EOL]                 randInt = randInt >> 8; [EOL]             } [EOL]             bytes[bytesOut++] = (byte) randInt; [EOL]             if (bytesOut == bytes.length) { [EOL]                 return; [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 106,120
public int nextInt() { [EOL]     return (int) ((2d * nextDouble() - 1d) * Integer.MAX_VALUE); [EOL] } <line_num>: 136,138
public int nextInt(int n) { [EOL]     if (n <= 0) { [EOL]         throw new NotStrictlyPositiveException(n); [EOL]     } [EOL]     int result = (int) (nextDouble() * n); [EOL]     return result < n ? result : n - 1; [EOL] } <line_num>: 156,162
public long nextLong() { [EOL]     return (long) ((2d * nextDouble() - 1d) * Long.MAX_VALUE); [EOL] } <line_num>: 178,180
public boolean nextBoolean() { [EOL]     return nextDouble() <= 0.5; [EOL] } <line_num>: 196,198
public float nextFloat() { [EOL]     return (float) nextDouble(); [EOL] } <line_num>: 214,216
public abstract double nextDouble(); <line_num>: 230,230
public double nextGaussian() { [EOL]     if (!Double.isNaN(cachedNormalDeviate)) { [EOL]         double dev = cachedNormalDeviate; [EOL]         cachedNormalDeviate = Double.NaN; [EOL]         return dev; [EOL]     } [EOL]     double v1 = 0; [EOL]     double v2 = 0; [EOL]     double s = 1; [EOL]     while (s >= 1) { [EOL]         v1 = 2 * nextDouble() - 1; [EOL]         v2 = 2 * nextDouble() - 1; [EOL]         s = v1 * v1 + v2 * v2; [EOL]     } [EOL]     if (s != 0) { [EOL]         s = FastMath.sqrt(-2 * FastMath.log(s) / s); [EOL]     } [EOL]     cachedNormalDeviate = v2 * s; [EOL]     return v1 * s; [EOL] } <line_num>: 252,271
