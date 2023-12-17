public ConstantGenerator() { [EOL]     value = 0; [EOL] } <line_num>: 65,67
public ConstantGenerator(double value) { [EOL]     this.value = value; [EOL] } <line_num>: 69,71
@Test [EOL] public void testAdaptor() { [EOL]     ConstantGenerator generator = new ConstantGenerator(); [EOL]     Random random = RandomAdaptor.createAdaptor(generator); [EOL]     checkConstant(random); [EOL]     RandomAdaptor randomAdaptor = new RandomAdaptor(generator); [EOL]     checkConstant(randomAdaptor); [EOL] } <line_num>: 32,39
private void checkConstant(Random random) { [EOL]     byte[] bytes = new byte[] { 0 }; [EOL]     random.nextBytes(bytes); [EOL]     Assert.assertEquals(0, bytes[0]); [EOL]     Assert.assertFalse(random.nextBoolean()); [EOL]     Assert.assertEquals(0, random.nextDouble(), 0); [EOL]     Assert.assertEquals(0, random.nextFloat(), 0); [EOL]     Assert.assertEquals(0, random.nextGaussian(), 0); [EOL]     Assert.assertEquals(0, random.nextInt()); [EOL]     Assert.assertEquals(0, random.nextInt(1)); [EOL]     Assert.assertEquals(0, random.nextLong()); [EOL]     random.setSeed(100); [EOL]     Assert.assertEquals(0, random.nextDouble(), 0); [EOL] } <line_num>: 41,54
public boolean nextBoolean() { [EOL]     return false; [EOL] } <line_num>: 73,75
public void nextBytes(byte[] bytes) { [EOL] } <line_num>: 77,78
public double nextDouble() { [EOL]     return value; [EOL] } <line_num>: 80,82
public float nextFloat() { [EOL]     return (float) value; [EOL] } <line_num>: 84,86
public double nextGaussian() { [EOL]     return value; [EOL] } <line_num>: 88,90
public int nextInt() { [EOL]     return (int) value; [EOL] } <line_num>: 92,94
public int nextInt(int n) { [EOL]     return (int) value; [EOL] } <line_num>: 96,98
public long nextLong() { [EOL]     return (int) value; [EOL] } <line_num>: 100,102
public void setSeed(int seed) { [EOL] } <line_num>: 104,105
public void setSeed(int[] seed) { [EOL] } <line_num>: 107,108
public void setSeed(long seed) { [EOL] } <line_num>: 110,111
