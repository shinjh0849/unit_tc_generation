private GaussianCurveFitter(double[] initialGuess, int maxIter)
public ParameterGuesser(Collection<WeightedObservedPoint> observations)
public double value(double x, double... p)
public double[] gradient(double x, double... p)
public static GaussianCurveFitter create()
public GaussianCurveFitter withStartPoint(double[] start)
public GaussianCurveFitter withMaxIterations(int max)
protected LevenbergMarquardtOptimizer getOptimizer(Collection<WeightedObservedPoint> observations)
public double[] guess()
public int compare(WeightedObservedPoint p1, WeightedObservedPoint p2)
private List<WeightedObservedPoint> sortObservations(Collection<WeightedObservedPoint> unsorted)
private double[] basicGuess(WeightedObservedPoint[] points)
private int findMaxY(WeightedObservedPoint[] points)
private double interpolateXAtY(WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws OutOfRangeException
private WeightedObservedPoint[] getInterpolationPointsForY(WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws OutOfRangeException
private boolean isBetween(double value, double boundary1, double boundary2)
Gaussian.Parametric FUNCTION=Optional[new Gaussian.Parametric() {

    @Override
    public double value(double x, double... p) {
        double v = Double.POSITIVE_INFINITY;
        try {
            v = super.value(x, p);
        } catch (NotStrictlyPositiveException e) {
            // NOPMD
            // Do nothing.
        }
        return v;
    }

    @Override
    public double[] gradient(double x, double... p) {
        double[] v = { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY };
        try {
            v = super.gradient(x, p);
        } catch (NotStrictlyPositiveException e) {
            // NOPMD
            // Do nothing.
        }
        return v;
    }
}]
double[] initialGuess
int maxIter
