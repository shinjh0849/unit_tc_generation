public AbstractRandomGeneratorTest() { [EOL]     super(); [EOL] } <line_num>: 27,29
@Override [EOL] protected RandomGenerator makeGenerator() { [EOL]     RandomGenerator generator = new TestRandomGenerator(); [EOL]     generator.setSeed(1001); [EOL]     return generator; [EOL] } <line_num>: 31,36
