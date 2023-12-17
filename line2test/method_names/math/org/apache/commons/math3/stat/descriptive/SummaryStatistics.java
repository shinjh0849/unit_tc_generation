public SummaryStatistics()
public SummaryStatistics(SummaryStatistics original) throws NullArgumentException
public StatisticalSummary getSummary()
public void addValue(double value)
public long getN()
public double getSum()
public double getSumsq()
public double getMean()
public double getStandardDeviation()
public double getVariance()
public double getPopulationVariance()
public double getMax()
public double getMin()
public double getGeometricMean()
public double getSumOfLogs()
public double getSecondMoment()
public String toString()
public void clear()
public boolean equals(Object object)
public int hashCode()
public StorelessUnivariateStatistic getSumImpl()
public void setSumImpl(StorelessUnivariateStatistic sumImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getSumsqImpl()
public void setSumsqImpl(StorelessUnivariateStatistic sumsqImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getMinImpl()
public void setMinImpl(StorelessUnivariateStatistic minImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getMaxImpl()
public void setMaxImpl(StorelessUnivariateStatistic maxImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getSumLogImpl()
public void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getGeoMeanImpl()
public void setGeoMeanImpl(StorelessUnivariateStatistic geoMeanImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getMeanImpl()
public void setMeanImpl(StorelessUnivariateStatistic meanImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getVarianceImpl()
public void setVarianceImpl(StorelessUnivariateStatistic varianceImpl) throws MathIllegalStateException
private void checkEmpty() throws MathIllegalStateException
public SummaryStatistics copy()
public static void copy(SummaryStatistics source, SummaryStatistics dest) throws NullArgumentException
