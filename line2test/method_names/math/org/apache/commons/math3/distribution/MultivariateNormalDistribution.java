public MultivariateNormalDistribution(final double[] means, final double[][] covariances) throws SingularMatrixException, DimensionMismatchException, NonPositiveDefiniteMatrixException
public MultivariateNormalDistribution(RandomGenerator rng, final double[] means, final double[][] covariances) throws SingularMatrixException, DimensionMismatchException, NonPositiveDefiniteMatrixException
public double[] getMeans()
public RealMatrix getCovariances()
public double density(final double[] vals) throws DimensionMismatchException
public double[] getStandardDeviations()
public double[] sample()
private double getExponentTerm(final double[] values)
