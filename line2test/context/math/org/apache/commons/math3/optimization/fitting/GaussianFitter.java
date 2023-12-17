public GaussianFitter(DifferentiableMultivariateVectorOptimizer optimizer)
public ParameterGuesser(WeightedObservedPoint[] observations)
public double value(double x, double... p)
public double[] gradient(double x, double... p)
public double[] fit(double[] initialGuess)
public double[] fit()
public double[] guess()
public int compare(WeightedObservedPoint p1, WeightedObservedPoint p2)
private WeightedObservedPoint[] sortObservations(WeightedObservedPoint[] unsorted)
private double[] basicGuess(WeightedObservedPoint[] points)
private int findMaxY(WeightedObservedPoint[] points)
private double interpolateXAtY(WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws OutOfRangeException
private WeightedObservedPoint[] getInterpolationPointsForY(WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws OutOfRangeException
private boolean isBetween(double value, double boundary1, double boundary2)
