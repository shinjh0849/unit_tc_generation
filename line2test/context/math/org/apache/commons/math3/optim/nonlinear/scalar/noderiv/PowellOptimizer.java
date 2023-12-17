public PowellOptimizer(double rel, double abs, ConvergenceChecker<PointValuePair> checker)
public PowellOptimizer(double rel, double abs, double lineRel, double lineAbs, ConvergenceChecker<PointValuePair> checker)
public PowellOptimizer(double rel, double abs)
public PowellOptimizer(double rel, double abs, double lineRel, double lineAbs)
 LineSearch(double rel, double abs)
protected PointValuePair doOptimize()
private double[][] newPointAndDirection(double[] p, double[] d, double optimum)
public double value(double alpha)
public UnivariatePointValuePair search(final double[] p, final double[] d)
private void checkParameters()
double MIN_RELATIVE_TOLERANCE=Optional[2 * FastMath.ulp(1d)]
double relativeThreshold
double absoluteThreshold
LineSearch line
