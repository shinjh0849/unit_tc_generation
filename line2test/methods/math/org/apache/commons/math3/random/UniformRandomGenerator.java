public UniformRandomGenerator(RandomGenerator generator) { [EOL]     this.generator = generator; [EOL] } <line_num>: 45,47
public double nextNormalizedDouble() { [EOL]     return SQRT3 * (2 * generator.nextDouble() - 1.0); [EOL] } <line_num>: 54,56
