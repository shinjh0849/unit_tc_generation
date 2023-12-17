public SynchronizedSummaryStatistics()
public SynchronizedSummaryStatistics(SynchronizedSummaryStatistics original) throws NullArgumentException
public synchronized StatisticalSummary getSummary()
public synchronized void addValue(double value)
public synchronized long getN()
public synchronized double getSum()
public synchronized double getSumsq()
public synchronized double getMean()
public synchronized double getStandardDeviation()
public synchronized double getVariance()
public synchronized double getPopulationVariance()
public synchronized double getMax()
public synchronized double getMin()
public synchronized double getGeometricMean()
public synchronized String toString()
public synchronized void clear()
public synchronized boolean equals(Object object)
public synchronized int hashCode()
public synchronized StorelessUnivariateStatistic getSumImpl()
public synchronized void setSumImpl(StorelessUnivariateStatistic sumImpl) throws MathIllegalStateException
public synchronized StorelessUnivariateStatistic getSumsqImpl()
public synchronized void setSumsqImpl(StorelessUnivariateStatistic sumsqImpl) throws MathIllegalStateException
public synchronized StorelessUnivariateStatistic getMinImpl()
public synchronized void setMinImpl(StorelessUnivariateStatistic minImpl) throws MathIllegalStateException
public synchronized StorelessUnivariateStatistic getMaxImpl()
public synchronized void setMaxImpl(StorelessUnivariateStatistic maxImpl) throws MathIllegalStateException
public synchronized StorelessUnivariateStatistic getSumLogImpl()
public synchronized void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl) throws MathIllegalStateException
public synchronized StorelessUnivariateStatistic getGeoMeanImpl()
public synchronized void setGeoMeanImpl(StorelessUnivariateStatistic geoMeanImpl) throws MathIllegalStateException
public synchronized StorelessUnivariateStatistic getMeanImpl()
public synchronized void setMeanImpl(StorelessUnivariateStatistic meanImpl) throws MathIllegalStateException
public synchronized StorelessUnivariateStatistic getVarianceImpl()
public synchronized void setVarianceImpl(StorelessUnivariateStatistic varianceImpl) throws MathIllegalStateException
public synchronized SynchronizedSummaryStatistics copy()
public static void copy(SynchronizedSummaryStatistics source, SynchronizedSummaryStatistics dest) throws NullArgumentException
