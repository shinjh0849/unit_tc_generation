public MultiDirectionalSimplex(final int n)
public MultiDirectionalSimplex(final int n, double sideLength)
public MultiDirectionalSimplex(final int n, final double khi, final double gamma)
public MultiDirectionalSimplex(final int n, double sideLength, final double khi, final double gamma)
public MultiDirectionalSimplex(final double[] steps)
public MultiDirectionalSimplex(final double[] steps, final double khi, final double gamma)
public MultiDirectionalSimplex(final double[][] referenceSimplex)
public MultiDirectionalSimplex(final double[][] referenceSimplex, final double khi, final double gamma)
public void iterate(final MultivariateFunction evaluationFunction, final Comparator<PointValuePair> comparator)
private PointValuePair evaluateNewSimplex(final MultivariateFunction evaluationFunction, final PointValuePair[] original, final double coeff, final Comparator<PointValuePair> comparator)
double DEFAULT_KHI=Optional[2]
double DEFAULT_GAMMA=Optional[0.5]
double khi
double gamma
