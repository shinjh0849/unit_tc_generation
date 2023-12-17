public DBSCANClusterer(final double eps, final int minPts) throws NotPositiveException
public DBSCANClusterer(final double eps, final int minPts, final DistanceMeasure measure) throws NotPositiveException
public double getEps()
public int getMinPts()
public List<Cluster<T>> cluster(final Collection<T> points) throws NullArgumentException
private Cluster<T> expandCluster(final Cluster<T> cluster, final T point, final List<T> neighbors, final Collection<T> points, final Map<Clusterable, PointStatus> visited)
private List<T> getNeighbors(final T point, final Collection<T> points)
private List<T> merge(final List<T> one, final List<T> two)
double eps
int minPts
