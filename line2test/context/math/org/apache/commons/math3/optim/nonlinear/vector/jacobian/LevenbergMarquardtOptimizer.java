public LevenbergMarquardtOptimizer()
public LevenbergMarquardtOptimizer(ConvergenceChecker<PointVectorValuePair> checker)
public LevenbergMarquardtOptimizer(double initialStepBoundFactor, ConvergenceChecker<PointVectorValuePair> checker, double costRelativeTolerance, double parRelativeTolerance, double orthoTolerance, double threshold)
public LevenbergMarquardtOptimizer(double costRelativeTolerance, double parRelativeTolerance, double orthoTolerance)
public LevenbergMarquardtOptimizer(double initialStepBoundFactor, double costRelativeTolerance, double parRelativeTolerance, double orthoTolerance, double threshold)
protected PointVectorValuePair doOptimize()
private void determineLMParameter(double[] qy, double delta, double[] diag, double[] work1, double[] work2, double[] work3)
private void determineLMDirection(double[] qy, double[] diag, double[] lmDiag, double[] work)
private void qrDecomposition(RealMatrix jacobian) throws ConvergenceException
private void qTy(double[] y)
private void checkParameters()
double TWO_EPS=Optional[2 * Precision.EPSILON]
int solvedCols
double[] diagR
double[] jacNorm
double[] beta
int[] permutation
int rank
double lmPar
double[] lmDir
double initialStepBoundFactor
double costRelativeTolerance
double parRelativeTolerance
double orthoTolerance
double qrRankingThreshold
double[] weightedResidual
double[][] weightedJacobian
