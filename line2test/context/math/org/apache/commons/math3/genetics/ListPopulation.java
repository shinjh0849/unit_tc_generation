public ListPopulation(final int populationLimit) throws NotPositiveException
public ListPopulation(final List<Chromosome> chromosomes, final int populationLimit) throws NullArgumentException, NotPositiveException, NumberIsTooLargeException
public void setChromosomes(final List<Chromosome> chromosomes) throws NullArgumentException, NumberIsTooLargeException
public void addChromosomes(final Collection<Chromosome> chromosomeColl) throws NumberIsTooLargeException
public List<Chromosome> getChromosomes()
protected List<Chromosome> getChromosomeList()
public void addChromosome(final Chromosome chromosome) throws NumberIsTooLargeException
public Chromosome getFittestChromosome()
public int getPopulationLimit()
public void setPopulationLimit(final int populationLimit) throws NotPositiveException, NumberIsTooSmallException
public int getPopulationSize()
public String toString()
public Iterator<Chromosome> iterator()
List<Chromosome> chromosomes
int populationLimit
