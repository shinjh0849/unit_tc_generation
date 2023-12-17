protected MultivariateVectorOptimizer(ConvergenceChecker<PointVectorValuePair> checker)
protected double[] computeObjectiveValue(double[] params)
public PointVectorValuePair optimize(OptimizationData... optData) throws TooManyEvaluationsException, DimensionMismatchException
public RealMatrix getWeight()
public double[] getTarget()
public int getTargetSize()
protected void parseOptimizationData(OptimizationData... optData)
private void checkParameters()
double[] target
RealMatrix weightMatrix
MultivariateVectorFunction model
