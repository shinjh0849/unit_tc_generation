public AbstractConvergenceChecker(final double relativeThreshold, final double absoluteThreshold) { [EOL]     this.relativeThreshold = relativeThreshold; [EOL]     this.absoluteThreshold = absoluteThreshold; [EOL] } <line_num>: 44,48
public double getRelativeThreshold() { [EOL]     return relativeThreshold; [EOL] } <line_num>: 53,55
public double getAbsoluteThreshold() { [EOL]     return absoluteThreshold; [EOL] } <line_num>: 60,62
public abstract boolean converged(int iteration, PAIR previous, PAIR current); <line_num>: 67,69
