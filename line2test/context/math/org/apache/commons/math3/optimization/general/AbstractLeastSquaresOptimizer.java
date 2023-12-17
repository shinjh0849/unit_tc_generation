protected AbstractLeastSquaresOptimizer()
protected AbstractLeastSquaresOptimizer(ConvergenceChecker<PointVectorValuePair> checker)
public int getJacobianEvaluations()
protected void updateJacobian()
protected RealMatrix computeWeightedJacobian(double[] params)
protected void updateResidualsAndCost()
protected double computeCost(double[] residuals)
public double getRMS()
public double getChiSquare()
public RealMatrix getWeightSquareRoot()
protected void setCost(double cost)
public double[][] getCovariances()
public double[][] getCovariances(double threshold)
public double[][] computeCovariances(double[] params, double threshold)
public double[] guessParametersErrors()
public double[] computeSigma(double[] params, double covarianceSingularityThreshold)
public PointVectorValuePair optimize(int maxEval, final DifferentiableMultivariateVectorFunction f, final double[] target, final double[] weights, final double[] startPoint)
public PointVectorValuePair optimize(final int maxEval, final MultivariateDifferentiableVectorFunction f, final double[] target, final double[] weights, final double[] startPoint)
protected PointVectorValuePair optimizeInternal(final int maxEval, final MultivariateDifferentiableVectorFunction f, OptimizationData... optData)
protected void setUp()
protected double[] computeResiduals(double[] objectiveValue)
private RealMatrix squareRoot(RealMatrix m)
double DEFAULT_SINGULARITY_THRESHOLD=Optional[1e-14]
double[][] weightedResidualJacobian
int cols
int rows
double[] point
double[] objective
double[] weightedResiduals
double cost
MultivariateDifferentiableVectorFunction jF
int jacobianEvaluations
RealMatrix weightMatrixSqrt
