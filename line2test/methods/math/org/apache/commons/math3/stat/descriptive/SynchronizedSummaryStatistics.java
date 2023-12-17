public SynchronizedSummaryStatistics() { [EOL]     super(); [EOL] } <line_num>: 44,46
public SynchronizedSummaryStatistics(SynchronizedSummaryStatistics original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 54,57
@Override [EOL] public synchronized StatisticalSummary getSummary() { [EOL]     return super.getSummary(); [EOL] } <line_num>: 62,65
@Override [EOL] public synchronized void addValue(double value) { [EOL]     super.addValue(value); [EOL] } <line_num>: 70,73
@Override [EOL] public synchronized long getN() { [EOL]     return super.getN(); [EOL] } <line_num>: 78,81
@Override [EOL] public synchronized double getSum() { [EOL]     return super.getSum(); [EOL] } <line_num>: 86,89
@Override [EOL] public synchronized double getSumsq() { [EOL]     return super.getSumsq(); [EOL] } <line_num>: 94,97
@Override [EOL] public synchronized double getMean() { [EOL]     return super.getMean(); [EOL] } <line_num>: 102,105
@Override [EOL] public synchronized double getStandardDeviation() { [EOL]     return super.getStandardDeviation(); [EOL] } <line_num>: 110,113
@Override [EOL] public synchronized double getVariance() { [EOL]     return super.getVariance(); [EOL] } <line_num>: 118,121
@Override [EOL] public synchronized double getPopulationVariance() { [EOL]     return super.getPopulationVariance(); [EOL] } <line_num>: 126,129
@Override [EOL] public synchronized double getMax() { [EOL]     return super.getMax(); [EOL] } <line_num>: 134,137
@Override [EOL] public synchronized double getMin() { [EOL]     return super.getMin(); [EOL] } <line_num>: 142,145
@Override [EOL] public synchronized double getGeometricMean() { [EOL]     return super.getGeometricMean(); [EOL] } <line_num>: 150,153
@Override [EOL] public synchronized String toString() { [EOL]     return super.toString(); [EOL] } <line_num>: 158,161
@Override [EOL] public synchronized void clear() { [EOL]     super.clear(); [EOL] } <line_num>: 166,169
@Override [EOL] public synchronized boolean equals(Object object) { [EOL]     return super.equals(object); [EOL] } <line_num>: 174,177
@Override [EOL] public synchronized int hashCode() { [EOL]     return super.hashCode(); [EOL] } <line_num>: 182,185
@Override [EOL] public synchronized StorelessUnivariateStatistic getSumImpl() { [EOL]     return super.getSumImpl(); [EOL] } <line_num>: 190,193
@Override [EOL] public synchronized void setSumImpl(StorelessUnivariateStatistic sumImpl) throws MathIllegalStateException { [EOL]     super.setSumImpl(sumImpl); [EOL] } <line_num>: 198,202
@Override [EOL] public synchronized StorelessUnivariateStatistic getSumsqImpl() { [EOL]     return super.getSumsqImpl(); [EOL] } <line_num>: 207,210
@Override [EOL] public synchronized void setSumsqImpl(StorelessUnivariateStatistic sumsqImpl) throws MathIllegalStateException { [EOL]     super.setSumsqImpl(sumsqImpl); [EOL] } <line_num>: 215,219
@Override [EOL] public synchronized StorelessUnivariateStatistic getMinImpl() { [EOL]     return super.getMinImpl(); [EOL] } <line_num>: 224,227
@Override [EOL] public synchronized void setMinImpl(StorelessUnivariateStatistic minImpl) throws MathIllegalStateException { [EOL]     super.setMinImpl(minImpl); [EOL] } <line_num>: 232,236
@Override [EOL] public synchronized StorelessUnivariateStatistic getMaxImpl() { [EOL]     return super.getMaxImpl(); [EOL] } <line_num>: 241,244
@Override [EOL] public synchronized void setMaxImpl(StorelessUnivariateStatistic maxImpl) throws MathIllegalStateException { [EOL]     super.setMaxImpl(maxImpl); [EOL] } <line_num>: 249,253
@Override [EOL] public synchronized StorelessUnivariateStatistic getSumLogImpl() { [EOL]     return super.getSumLogImpl(); [EOL] } <line_num>: 258,261
@Override [EOL] public synchronized void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl) throws MathIllegalStateException { [EOL]     super.setSumLogImpl(sumLogImpl); [EOL] } <line_num>: 266,270
@Override [EOL] public synchronized StorelessUnivariateStatistic getGeoMeanImpl() { [EOL]     return super.getGeoMeanImpl(); [EOL] } <line_num>: 275,278
@Override [EOL] public synchronized void setGeoMeanImpl(StorelessUnivariateStatistic geoMeanImpl) throws MathIllegalStateException { [EOL]     super.setGeoMeanImpl(geoMeanImpl); [EOL] } <line_num>: 283,287
@Override [EOL] public synchronized StorelessUnivariateStatistic getMeanImpl() { [EOL]     return super.getMeanImpl(); [EOL] } <line_num>: 292,295
@Override [EOL] public synchronized void setMeanImpl(StorelessUnivariateStatistic meanImpl) throws MathIllegalStateException { [EOL]     super.setMeanImpl(meanImpl); [EOL] } <line_num>: 300,304
@Override [EOL] public synchronized StorelessUnivariateStatistic getVarianceImpl() { [EOL]     return super.getVarianceImpl(); [EOL] } <line_num>: 309,312
@Override [EOL] public synchronized void setVarianceImpl(StorelessUnivariateStatistic varianceImpl) throws MathIllegalStateException { [EOL]     super.setVarianceImpl(varianceImpl); [EOL] } <line_num>: 317,321
@Override [EOL] public synchronized SynchronizedSummaryStatistics copy() { [EOL]     SynchronizedSummaryStatistics result = new SynchronizedSummaryStatistics(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 329,336
public static void copy(SynchronizedSummaryStatistics source, SynchronizedSummaryStatistics dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     synchronized (source) { [EOL]         synchronized (dest) { [EOL]             SummaryStatistics.copy(source, dest); [EOL]         } [EOL]     } [EOL] } <line_num>: 347,357
