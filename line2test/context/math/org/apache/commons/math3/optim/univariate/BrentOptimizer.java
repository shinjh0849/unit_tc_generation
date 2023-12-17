public BrentOptimizer(double rel, double abs, ConvergenceChecker<UnivariatePointValuePair> checker)
public BrentOptimizer(double rel, double abs)
protected UnivariatePointValuePair doOptimize()
private UnivariatePointValuePair best(UnivariatePointValuePair a, UnivariatePointValuePair b, boolean isMinim)
double GOLDEN_SECTION=Optional[0.5 * (3 - FastMath.sqrt(5))]
double MIN_RELATIVE_TOLERANCE=Optional[2 * FastMath.ulp(1d)]
double relativeThreshold
double absoluteThreshold
