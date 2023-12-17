public FuzzyKMeansClusterer(final int k, final double fuzziness) throws NumberIsTooSmallException
public FuzzyKMeansClusterer(final int k, final double fuzziness, final int maxIterations, final DistanceMeasure measure) throws NumberIsTooSmallException
public FuzzyKMeansClusterer(final int k, final double fuzziness, final int maxIterations, final DistanceMeasure measure, final double epsilon, final RandomGenerator random) throws NumberIsTooSmallException
public int getK()
public double getFuzziness()
public int getMaxIterations()
public double getEpsilon()
public RandomGenerator getRandomGenerator()
public RealMatrix getMembershipMatrix()
public List<T> getDataPoints()
public List<CentroidCluster<T>> getClusters()
public double getObjectiveFunctionValue()
public List<CentroidCluster<T>> cluster(final Collection<T> dataPoints) throws MathIllegalArgumentException
private void updateClusterCenters()
private void updateMembershipMatrix()
private void initializeMembershipMatrix()
private double calculateMaxMembershipChange(final double[][] matrix)
private void saveMembershipMatrix(final double[][] matrix)
double DEFAULT_EPSILON=Optional[1e-3]
int k
int maxIterations
double fuzziness
double epsilon
RandomGenerator random
double[][] membershipMatrix
List<T> points
List<CentroidCluster<T>> clusters
