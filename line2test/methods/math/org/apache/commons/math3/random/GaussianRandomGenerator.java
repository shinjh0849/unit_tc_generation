public GaussianRandomGenerator(final RandomGenerator generator) { [EOL]     this.generator = generator; [EOL] } <line_num>: 36,38
public double nextNormalizedDouble() { [EOL]     return generator.nextGaussian(); [EOL] } <line_num>: 43,45
