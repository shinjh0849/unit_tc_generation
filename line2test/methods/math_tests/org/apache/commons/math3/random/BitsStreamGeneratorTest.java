public BitsStreamGeneratorTest() { [EOL]     super(); [EOL] } <line_num>: 29,31
public BitRandom() { [EOL]     super(); [EOL] } <line_num>: 76,78
@Override [EOL] protected RandomGenerator makeGenerator() { [EOL]     RandomGenerator generator = new TestBitStreamGenerator(); [EOL]     generator.setSeed(1000); [EOL]     return generator; [EOL] } <line_num>: 33,38
@Override [EOL] public void setSeed(int seed) { [EOL]     ran.setSeed(seed); [EOL]     clear(); [EOL] } <line_num>: 48,52
@Override [EOL] public void setSeed(int[] seed) { [EOL]     ran.setSeed(seed[0]); [EOL] } <line_num>: 54,57
@Override [EOL] public void setSeed(long seed) { [EOL]     ran.setSeed((int) seed); [EOL] } <line_num>: 59,63
@Override [EOL] protected int next(int bits) { [EOL]     return ran.nextBits(bits); [EOL] } <line_num>: 65,68
public int nextBits(int bits) { [EOL]     return next(bits); [EOL] } <line_num>: 79,81
