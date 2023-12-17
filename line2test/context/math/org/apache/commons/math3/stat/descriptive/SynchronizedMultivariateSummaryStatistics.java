public SynchronizedMultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected)
public synchronized void addValue(double[] value) throws DimensionMismatchException
public synchronized int getDimension()
public synchronized long getN()
public synchronized double[] getSum()
public synchronized double[] getSumSq()
public synchronized double[] getSumLog()
public synchronized double[] getMean()
public synchronized double[] getStandardDeviation()
public synchronized RealMatrix getCovariance()
public synchronized double[] getMax()
public synchronized double[] getMin()
public synchronized double[] getGeometricMean()
public synchronized String toString()
public synchronized void clear()
public synchronized boolean equals(Object object)
public synchronized int hashCode()
public synchronized StorelessUnivariateStatistic[] getSumImpl()
public synchronized void setSumImpl(StorelessUnivariateStatistic[] sumImpl) throws DimensionMismatchException, MathIllegalStateException
public synchronized StorelessUnivariateStatistic[] getSumsqImpl()
public synchronized void setSumsqImpl(StorelessUnivariateStatistic[] sumsqImpl) throws DimensionMismatchException, MathIllegalStateException
public synchronized StorelessUnivariateStatistic[] getMinImpl()
public synchronized void setMinImpl(StorelessUnivariateStatistic[] minImpl) throws DimensionMismatchException, MathIllegalStateException
public synchronized StorelessUnivariateStatistic[] getMaxImpl()
public synchronized void setMaxImpl(StorelessUnivariateStatistic[] maxImpl) throws DimensionMismatchException, MathIllegalStateException
public synchronized StorelessUnivariateStatistic[] getSumLogImpl()
public synchronized void setSumLogImpl(StorelessUnivariateStatistic[] sumLogImpl) throws DimensionMismatchException, MathIllegalStateException
public synchronized StorelessUnivariateStatistic[] getGeoMeanImpl()
public synchronized void setGeoMeanImpl(StorelessUnivariateStatistic[] geoMeanImpl) throws DimensionMismatchException, MathIllegalStateException
public synchronized StorelessUnivariateStatistic[] getMeanImpl()
public synchronized void setMeanImpl(StorelessUnivariateStatistic[] meanImpl) throws DimensionMismatchException, MathIllegalStateException
long serialVersionUID=Optional[7099834153347155363L]
