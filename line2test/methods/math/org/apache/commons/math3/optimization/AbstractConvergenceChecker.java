@Deprecated [EOL] public AbstractConvergenceChecker() { [EOL]     this.relativeThreshold = DEFAULT_RELATIVE_THRESHOLD; [EOL]     this.absoluteThreshold = DEFAULT_ABSOLUTE_THRESHOLD; [EOL] } <line_num>: 65,69
public AbstractConvergenceChecker(final double relativeThreshold, final double absoluteThreshold) { [EOL]     this.relativeThreshold = relativeThreshold; [EOL]     this.absoluteThreshold = absoluteThreshold; [EOL] } <line_num>: 77,81
public double getRelativeThreshold() { [EOL]     return relativeThreshold; [EOL] } <line_num>: 86,88
public double getAbsoluteThreshold() { [EOL]     return absoluteThreshold; [EOL] } <line_num>: 93,95
public abstract boolean converged(int iteration, PAIR previous, PAIR current); <line_num>: 100,102
