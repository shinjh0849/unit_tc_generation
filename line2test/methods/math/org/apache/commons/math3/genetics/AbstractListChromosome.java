public AbstractListChromosome(final List<T> representation) throws InvalidRepresentationException { [EOL]     checkValidity(representation); [EOL]     this.representation = Collections.unmodifiableList(new ArrayList<T>(representation)); [EOL] } <line_num>: 41,44
public AbstractListChromosome(final T[] representation) throws InvalidRepresentationException { [EOL]     this(Arrays.asList(representation)); [EOL] } <line_num>: 51,53
protected abstract void checkValidity(List<T> chromosomeRepresentation) throws InvalidRepresentationException; <line_num>: 61,61
protected List<T> getRepresentation() { [EOL]     return representation; [EOL] } <line_num>: 67,69
public int getLength() { [EOL]     return getRepresentation().size(); [EOL] } <line_num>: 75,77
public abstract AbstractListChromosome<T> newFixedLengthChromosome(final List<T> chromosomeRepresentation); <line_num>: 89,89
@Override [EOL] public String toString() { [EOL]     return String.format("(f=%s %s)", getFitness(), getRepresentation()); [EOL] } <line_num>: 91,94
