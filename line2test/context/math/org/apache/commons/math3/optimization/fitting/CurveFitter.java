public CurveFitter(final DifferentiableMultivariateVectorOptimizer optimizer)
public CurveFitter(final MultivariateDifferentiableVectorOptimizer optimizer)
public OldTheoreticalValuesFunction(final ParametricUnivariateFunction f)
public TheoreticalValuesFunction(final ParametricUnivariateFunction f)
public void addObservedPoint(double x, double y)
public void addObservedPoint(double weight, double x, double y)
public void addObservedPoint(WeightedObservedPoint observed)
public WeightedObservedPoint[] getObservations()
public void clearObservations()
public double[] fit(T f, final double[] initialGuess)
public double[] fit(int maxEval, T f, final double[] initialGuess)
public double[][] value(double[] point)
public MultivariateMatrixFunction jacobian()
public double[] value(double[] point)
public double[] value(double[] point)
public DerivativeStructure[] value(DerivativeStructure[] point)
DifferentiableMultivariateVectorOptimizer oldOptimizer
MultivariateDifferentiableVectorOptimizer optimizer
List<WeightedObservedPoint> observations
