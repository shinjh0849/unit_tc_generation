public KMeansPlusPlusClusterer(final int k)
public KMeansPlusPlusClusterer(final int k, final int maxIterations)
public KMeansPlusPlusClusterer(final int k, final int maxIterations, final DistanceMeasure measure)
public KMeansPlusPlusClusterer(final int k, final int maxIterations, final DistanceMeasure measure, final RandomGenerator random)
public KMeansPlusPlusClusterer(final int k, final int maxIterations, final DistanceMeasure measure, final RandomGenerator random, final EmptyClusterStrategy emptyStrategy)
public int getK()
public int getMaxIterations()
public RandomGenerator getRandomGenerator()
public EmptyClusterStrategy getEmptyClusterStrategy()
public List<CentroidCluster<T>> cluster(final Collection<T> points) throws MathIllegalArgumentException, ConvergenceException
private int assignPointsToClusters(final List<CentroidCluster<T>> clusters, final Collection<T> points, final int[] assignments)
private List<CentroidCluster<T>> chooseInitialCenters(final Collection<T> points)
private T getPointFromLargestVarianceCluster(final Collection<CentroidCluster<T>> clusters) throws ConvergenceException
private T getPointFromLargestNumberCluster(final Collection<? extends Cluster<T>> clusters) throws ConvergenceException
private T getFarthestPoint(final Collection<CentroidCluster<T>> clusters) throws ConvergenceException
private int getNearestCluster(final Collection<CentroidCluster<T>> clusters, final T point)
private Clusterable centroidOf(final Collection<T> points, final int dimension)
