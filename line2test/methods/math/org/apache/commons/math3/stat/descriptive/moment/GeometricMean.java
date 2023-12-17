public GeometricMean() { [EOL]     sumOfLogs = new SumOfLogs(); [EOL] } <line_num>: 66,68
public GeometricMean(GeometricMean original) throws NullArgumentException { [EOL]     super(); [EOL]     copy(original, this); [EOL] } <line_num>: 77,80
public GeometricMean(SumOfLogs sumOfLogs) { [EOL]     this.sumOfLogs = sumOfLogs; [EOL] } <line_num>: 86,88
@Override [EOL] public GeometricMean copy() { [EOL]     GeometricMean result = new GeometricMean(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 93,99
@Override [EOL] public void increment(final double d) { [EOL]     sumOfLogs.increment(d); [EOL] } <line_num>: 104,107
@Override [EOL] public double getResult() { [EOL]     if (sumOfLogs.getN() > 0) { [EOL]         return FastMath.exp(sumOfLogs.getResult() / sumOfLogs.getN()); [EOL]     } else { [EOL]         return Double.NaN; [EOL]     } [EOL] } <line_num>: 112,119
@Override [EOL] public void clear() { [EOL]     sumOfLogs.clear(); [EOL] } <line_num>: 124,127
@Override [EOL] public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     return FastMath.exp(sumOfLogs.evaluate(values, begin, length) / length); [EOL] } <line_num>: 145,151
public long getN() { [EOL]     return sumOfLogs.getN(); [EOL] } <line_num>: 156,158
public void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl) throws MathIllegalStateException { [EOL]     checkEmpty(); [EOL]     this.sumOfLogs = sumLogImpl; [EOL] } <line_num>: 171,175
public StorelessUnivariateStatistic getSumLogImpl() { [EOL]     return sumOfLogs; [EOL] } <line_num>: 182,184
public static void copy(GeometricMean source, GeometricMean dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.sumOfLogs = source.sumOfLogs.copy(); [EOL] } <line_num>: 194,200
private void checkEmpty() throws MathIllegalStateException { [EOL]     if (getN() > 0) { [EOL]         throw new MathIllegalStateException(LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC, getN()); [EOL]     } [EOL] } <line_num>: 207,213
