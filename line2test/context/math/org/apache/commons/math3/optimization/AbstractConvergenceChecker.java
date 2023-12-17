public AbstractConvergenceChecker()
public AbstractConvergenceChecker(final double relativeThreshold, final double absoluteThreshold)
public double getRelativeThreshold()
public double getAbsoluteThreshold()
public abstract boolean converged(int iteration, PAIR previous, PAIR current)
double DEFAULT_RELATIVE_THRESHOLD=Optional[100 * Precision.EPSILON]
double DEFAULT_ABSOLUTE_THRESHOLD=Optional[100 * Precision.SAFE_MIN]
double relativeThreshold
double absoluteThreshold
