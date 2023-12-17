protected AbstractLeastSquaresOptimizer(ConvergenceChecker<PointVectorValuePair> checker)
protected RealMatrix computeWeightedJacobian(double[] params)
protected double computeCost(double[] residuals)
public double getRMS()
public double getChiSquare()
public RealMatrix getWeightSquareRoot()
protected void setCost(double cost)
public double[][] computeCovariances(double[] params, double threshold)
public double[] computeSigma(double[] params, double covarianceSingularityThreshold)
public PointVectorValuePair optimize(OptimizationData... optData) throws TooManyEvaluationsException
protected double[] computeResiduals(double[] objectiveValue)
protected void parseOptimizationData(OptimizationData... optData)
private RealMatrix squareRoot(RealMatrix m)
RealMatrix weightMatrixSqrt
double cost
