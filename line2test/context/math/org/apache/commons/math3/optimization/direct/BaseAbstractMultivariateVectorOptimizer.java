protected BaseAbstractMultivariateVectorOptimizer()
protected BaseAbstractMultivariateVectorOptimizer(ConvergenceChecker<PointVectorValuePair> checker)
public int getMaxEvaluations()
public int getEvaluations()
public ConvergenceChecker<PointVectorValuePair> getConvergenceChecker()
protected double[] computeObjectiveValue(double[] point)
public PointVectorValuePair optimize(int maxEval, FUNC f, double[] t, double[] w, double[] startPoint)
protected PointVectorValuePair optimize(int maxEval, FUNC f, OptimizationData... optData) throws TooManyEvaluationsException, DimensionMismatchException
protected PointVectorValuePair optimizeInternal(final int maxEval, final FUNC f, final double[] t, final double[] w, final double[] startPoint)
protected PointVectorValuePair optimizeInternal(int maxEval, FUNC f, OptimizationData... optData) throws TooManyEvaluationsException, DimensionMismatchException
public double[] getStartPoint()
public RealMatrix getWeight()
public double[] getTarget()
protected FUNC getObjectiveFunction()
protected abstract PointVectorValuePair doOptimize()
protected double[] getTargetRef()
protected double[] getWeightRef()
protected void setUp()
private void parseOptimizationData(OptimizationData... optData)
private void checkParameters()
Incrementor evaluations=Optional[new Incrementor()]
ConvergenceChecker<PointVectorValuePair> checker
double[] target
RealMatrix weightMatrix
double[] weight
double[] start
FUNC function
