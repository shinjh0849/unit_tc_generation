public MultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected)
public void addValue(double[] value) throws DimensionMismatchException
public int getDimension()
public long getN()
private double[] getResults(StorelessUnivariateStatistic[] stats)
public double[] getSum()
public double[] getSumSq()
public double[] getSumLog()
public double[] getMean()
public double[] getStandardDeviation()
public RealMatrix getCovariance()
public double[] getMax()
public double[] getMin()
public double[] getGeometricMean()
public String toString()
private void append(StringBuilder buffer, double[] data, String prefix, String separator, String suffix)
public void clear()
public boolean equals(Object object)
public int hashCode()
private void setImpl(StorelessUnivariateStatistic[] newImpl, StorelessUnivariateStatistic[] oldImpl) throws MathIllegalStateException, DimensionMismatchException
public StorelessUnivariateStatistic[] getSumImpl()
public void setSumImpl(StorelessUnivariateStatistic[] sumImpl) throws MathIllegalStateException, DimensionMismatchException
public StorelessUnivariateStatistic[] getSumsqImpl()
public void setSumsqImpl(StorelessUnivariateStatistic[] sumsqImpl) throws MathIllegalStateException, DimensionMismatchException
public StorelessUnivariateStatistic[] getMinImpl()
public void setMinImpl(StorelessUnivariateStatistic[] minImpl) throws MathIllegalStateException, DimensionMismatchException
public StorelessUnivariateStatistic[] getMaxImpl()
public void setMaxImpl(StorelessUnivariateStatistic[] maxImpl) throws MathIllegalStateException, DimensionMismatchException
public StorelessUnivariateStatistic[] getSumLogImpl()
public void setSumLogImpl(StorelessUnivariateStatistic[] sumLogImpl) throws MathIllegalStateException, DimensionMismatchException
public StorelessUnivariateStatistic[] getGeoMeanImpl()
public void setGeoMeanImpl(StorelessUnivariateStatistic[] geoMeanImpl) throws MathIllegalStateException, DimensionMismatchException
public StorelessUnivariateStatistic[] getMeanImpl()
public void setMeanImpl(StorelessUnivariateStatistic[] meanImpl) throws MathIllegalStateException, DimensionMismatchException
private void checkEmpty() throws MathIllegalStateException
private void checkDimension(int dimension) throws DimensionMismatchException
long serialVersionUID=Optional[2271900808994826718L]
int k
long n=Optional[0]
StorelessUnivariateStatistic[] sumImpl
StorelessUnivariateStatistic[] sumSqImpl
StorelessUnivariateStatistic[] minImpl
StorelessUnivariateStatistic[] maxImpl
StorelessUnivariateStatistic[] sumLogImpl
StorelessUnivariateStatistic[] geoMeanImpl
StorelessUnivariateStatistic[] meanImpl
VectorialCovariance covarianceImpl
