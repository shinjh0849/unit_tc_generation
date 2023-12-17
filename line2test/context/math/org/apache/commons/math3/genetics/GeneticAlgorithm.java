public GeneticAlgorithm(final CrossoverPolicy crossoverPolicy, final double crossoverRate, final MutationPolicy mutationPolicy, final double mutationRate, final SelectionPolicy selectionPolicy) throws OutOfRangeException
public static synchronized void setRandomGenerator(final RandomGenerator random)
public static synchronized RandomGenerator getRandomGenerator()
public Population evolve(final Population initial, final StoppingCondition condition)
public Population nextGeneration(final Population current)
public CrossoverPolicy getCrossoverPolicy()
public double getCrossoverRate()
public MutationPolicy getMutationPolicy()
public double getMutationRate()
public SelectionPolicy getSelectionPolicy()
public int getGenerationsEvolved()
RandomGenerator randomGenerator=Optional[new JDKRandomGenerator()]
CrossoverPolicy crossoverPolicy
double crossoverRate
MutationPolicy mutationPolicy
double mutationRate
SelectionPolicy selectionPolicy
int generationsEvolved=Optional[0]
