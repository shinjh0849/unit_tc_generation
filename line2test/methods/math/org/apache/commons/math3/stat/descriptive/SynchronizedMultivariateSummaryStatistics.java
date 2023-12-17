public SynchronizedMultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) { [EOL]     super(k, isCovarianceBiasCorrected); [EOL] } <line_num>: 48,50
@Override [EOL] public synchronized void addValue(double[] value) throws DimensionMismatchException { [EOL]     super.addValue(value); [EOL] } <line_num>: 55,58
@Override [EOL] public synchronized int getDimension() { [EOL]     return super.getDimension(); [EOL] } <line_num>: 63,66
@Override [EOL] public synchronized long getN() { [EOL]     return super.getN(); [EOL] } <line_num>: 71,74
@Override [EOL] public synchronized double[] getSum() { [EOL]     return super.getSum(); [EOL] } <line_num>: 79,82
@Override [EOL] public synchronized double[] getSumSq() { [EOL]     return super.getSumSq(); [EOL] } <line_num>: 87,90
@Override [EOL] public synchronized double[] getSumLog() { [EOL]     return super.getSumLog(); [EOL] } <line_num>: 95,98
@Override [EOL] public synchronized double[] getMean() { [EOL]     return super.getMean(); [EOL] } <line_num>: 103,106
@Override [EOL] public synchronized double[] getStandardDeviation() { [EOL]     return super.getStandardDeviation(); [EOL] } <line_num>: 111,114
@Override [EOL] public synchronized RealMatrix getCovariance() { [EOL]     return super.getCovariance(); [EOL] } <line_num>: 119,122
@Override [EOL] public synchronized double[] getMax() { [EOL]     return super.getMax(); [EOL] } <line_num>: 127,130
@Override [EOL] public synchronized double[] getMin() { [EOL]     return super.getMin(); [EOL] } <line_num>: 135,138
@Override [EOL] public synchronized double[] getGeometricMean() { [EOL]     return super.getGeometricMean(); [EOL] } <line_num>: 143,146
@Override [EOL] public synchronized String toString() { [EOL]     return super.toString(); [EOL] } <line_num>: 151,154
@Override [EOL] public synchronized void clear() { [EOL]     super.clear(); [EOL] } <line_num>: 159,162
@Override [EOL] public synchronized boolean equals(Object object) { [EOL]     return super.equals(object); [EOL] } <line_num>: 167,170
@Override [EOL] public synchronized int hashCode() { [EOL]     return super.hashCode(); [EOL] } <line_num>: 175,178
@Override [EOL] public synchronized StorelessUnivariateStatistic[] getSumImpl() { [EOL]     return super.getSumImpl(); [EOL] } <line_num>: 183,186
@Override [EOL] public synchronized void setSumImpl(StorelessUnivariateStatistic[] sumImpl) throws DimensionMismatchException, MathIllegalStateException { [EOL]     super.setSumImpl(sumImpl); [EOL] } <line_num>: 191,195
@Override [EOL] public synchronized StorelessUnivariateStatistic[] getSumsqImpl() { [EOL]     return super.getSumsqImpl(); [EOL] } <line_num>: 200,203
@Override [EOL] public synchronized void setSumsqImpl(StorelessUnivariateStatistic[] sumsqImpl) throws DimensionMismatchException, MathIllegalStateException { [EOL]     super.setSumsqImpl(sumsqImpl); [EOL] } <line_num>: 208,212
@Override [EOL] public synchronized StorelessUnivariateStatistic[] getMinImpl() { [EOL]     return super.getMinImpl(); [EOL] } <line_num>: 217,220
@Override [EOL] public synchronized void setMinImpl(StorelessUnivariateStatistic[] minImpl) throws DimensionMismatchException, MathIllegalStateException { [EOL]     super.setMinImpl(minImpl); [EOL] } <line_num>: 225,229
@Override [EOL] public synchronized StorelessUnivariateStatistic[] getMaxImpl() { [EOL]     return super.getMaxImpl(); [EOL] } <line_num>: 234,237
@Override [EOL] public synchronized void setMaxImpl(StorelessUnivariateStatistic[] maxImpl) throws DimensionMismatchException, MathIllegalStateException { [EOL]     super.setMaxImpl(maxImpl); [EOL] } <line_num>: 242,246
@Override [EOL] public synchronized StorelessUnivariateStatistic[] getSumLogImpl() { [EOL]     return super.getSumLogImpl(); [EOL] } <line_num>: 251,254
@Override [EOL] public synchronized void setSumLogImpl(StorelessUnivariateStatistic[] sumLogImpl) throws DimensionMismatchException, MathIllegalStateException { [EOL]     super.setSumLogImpl(sumLogImpl); [EOL] } <line_num>: 259,263
@Override [EOL] public synchronized StorelessUnivariateStatistic[] getGeoMeanImpl() { [EOL]     return super.getGeoMeanImpl(); [EOL] } <line_num>: 268,271
@Override [EOL] public synchronized void setGeoMeanImpl(StorelessUnivariateStatistic[] geoMeanImpl) throws DimensionMismatchException, MathIllegalStateException { [EOL]     super.setGeoMeanImpl(geoMeanImpl); [EOL] } <line_num>: 276,280
@Override [EOL] public synchronized StorelessUnivariateStatistic[] getMeanImpl() { [EOL]     return super.getMeanImpl(); [EOL] } <line_num>: 285,288
@Override [EOL] public synchronized void setMeanImpl(StorelessUnivariateStatistic[] meanImpl) throws DimensionMismatchException, MathIllegalStateException { [EOL]     super.setMeanImpl(meanImpl); [EOL] } <line_num>: 293,297
