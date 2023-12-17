public AbstractListChromosome(final List<T> representation) throws InvalidRepresentationException
public AbstractListChromosome(final T[] representation) throws InvalidRepresentationException
protected abstract void checkValidity(List<T> chromosomeRepresentation) throws InvalidRepresentationException
protected List<T> getRepresentation()
public int getLength()
public abstract AbstractListChromosome<T> newFixedLengthChromosome(final List<T> chromosomeRepresentation)
public String toString()
