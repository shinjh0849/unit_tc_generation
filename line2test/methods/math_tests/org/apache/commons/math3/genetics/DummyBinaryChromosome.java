public DummyBinaryChromosome(List<Integer> representation) { [EOL]     super(representation); [EOL] } <line_num>: 26,28
public DummyBinaryChromosome(Integer[] representation) { [EOL]     super(representation); [EOL] } <line_num>: 30,32
@Override [EOL] public AbstractListChromosome<Integer> newFixedLengthChromosome(List<Integer> chromosomeRepresentation) { [EOL]     return new DummyBinaryChromosome(chromosomeRepresentation); [EOL] } <line_num>: 34,37
public double fitness() { [EOL]     return 0; [EOL] } <line_num>: 39,42
