public DummyRandomKey(List<Double> representation) { [EOL]     super(representation); [EOL] } <line_num>: 26,28
public DummyRandomKey(Double[] representation) { [EOL]     super(representation); [EOL] } <line_num>: 30,32
@Override [EOL] public AbstractListChromosome<Double> newFixedLengthChromosome(List<Double> chromosomeRepresentation) { [EOL]     return new DummyRandomKey(chromosomeRepresentation); [EOL] } <line_num>: 34,37
public double fitness() { [EOL]     return 0; [EOL] } <line_num>: 39,42
