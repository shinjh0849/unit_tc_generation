public KMeansPlusPlusClusterer(final Random random)
public KMeansPlusPlusClusterer(final Random random, final EmptyClusterStrategy emptyStrategy)
public List<Cluster<T>> cluster(final Collection<T> points, final int k, int numTrials, int maxIterationsPerTrial) throws MathIllegalArgumentException, ConvergenceException
public List<Cluster<T>> cluster(final Collection<T> points, final int k, final int maxIterations) throws MathIllegalArgumentException, ConvergenceException
private static int assignPointsToClusters(final List<Cluster<T>> clusters, final Collection<T> points, final int[] assignments)
private static List<Cluster<T>> chooseInitialCenters(final Collection<T> points, final int k, final Random random)
private T getPointFromLargestVarianceCluster(final Collection<Cluster<T>> clusters) throws ConvergenceException
private T getPointFromLargestNumberCluster(final Collection<Cluster<T>> clusters) throws ConvergenceException
private T getFarthestPoint(final Collection<Cluster<T>> clusters) throws ConvergenceException
private static int getNearestCluster(final Collection<Cluster<T>> clusters, final T point)
Random random
EmptyClusterStrategy emptyStrategy
