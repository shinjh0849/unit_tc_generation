public GaussIntegrator(double[] points, double[] weights) throws NonMonotonicSequenceException, DimensionMismatchException
public GaussIntegrator(Pair<double[], double[]> pointsAndWeights) throws NonMonotonicSequenceException
public double integrate(UnivariateFunction f)
public int getNumberOfPoints()
public double getPoint(int index)
public double getWeight(int index)
double[] points
double[] weights
