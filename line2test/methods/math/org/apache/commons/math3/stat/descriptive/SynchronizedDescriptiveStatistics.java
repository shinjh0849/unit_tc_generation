public SynchronizedDescriptiveStatistics() { [EOL]     this(INFINITE_WINDOW); [EOL] } <line_num>: 44,47
public SynchronizedDescriptiveStatistics(int window) throws MathIllegalArgumentException { [EOL]     super(window); [EOL] } <line_num>: 55,57
public SynchronizedDescriptiveStatistics(SynchronizedDescriptiveStatistics original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 65,68
@Override [EOL] public synchronized void addValue(double v) { [EOL]     super.addValue(v); [EOL] } <line_num>: 73,76
@Override [EOL] public synchronized double apply(UnivariateStatistic stat) { [EOL]     return super.apply(stat); [EOL] } <line_num>: 81,84
@Override [EOL] public synchronized void clear() { [EOL]     super.clear(); [EOL] } <line_num>: 89,92
@Override [EOL] public synchronized double getElement(int index) { [EOL]     return super.getElement(index); [EOL] } <line_num>: 97,100
@Override [EOL] public synchronized long getN() { [EOL]     return super.getN(); [EOL] } <line_num>: 105,108
@Override [EOL] public synchronized double getStandardDeviation() { [EOL]     return super.getStandardDeviation(); [EOL] } <line_num>: 113,116
@Override [EOL] public synchronized double[] getValues() { [EOL]     return super.getValues(); [EOL] } <line_num>: 121,124
@Override [EOL] public synchronized int getWindowSize() { [EOL]     return super.getWindowSize(); [EOL] } <line_num>: 129,132
@Override [EOL] public synchronized void setWindowSize(int windowSize) throws MathIllegalArgumentException { [EOL]     super.setWindowSize(windowSize); [EOL] } <line_num>: 137,140
@Override [EOL] public synchronized String toString() { [EOL]     return super.toString(); [EOL] } <line_num>: 145,148
@Override [EOL] public synchronized SynchronizedDescriptiveStatistics copy() { [EOL]     SynchronizedDescriptiveStatistics result = new SynchronizedDescriptiveStatistics(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 156,163
public static void copy(SynchronizedDescriptiveStatistics source, SynchronizedDescriptiveStatistics dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     synchronized (source) { [EOL]         synchronized (dest) { [EOL]             DescriptiveStatistics.copy(source, dest); [EOL]         } [EOL]     } [EOL] } <line_num>: 174,184
