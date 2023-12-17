public MixtureMultivariateNormalDistribution(double[] weights, double[][] means, double[][][] covariances)
public MixtureMultivariateNormalDistribution(List<Pair<Double, MultivariateNormalDistribution>> components)
public MixtureMultivariateNormalDistribution(RandomGenerator rng, List<Pair<Double, MultivariateNormalDistribution>> components) throws NotPositiveException, DimensionMismatchException
private static List<Pair<Double, MultivariateNormalDistribution>> createComponents(double[] weights, double[][] means, double[][][] covariances)
