public DescriptiveStatistics()
public DescriptiveStatistics(int window) throws MathIllegalArgumentException
public DescriptiveStatistics(double[] initialDoubleArray)
public DescriptiveStatistics(DescriptiveStatistics original) throws NullArgumentException
public void addValue(double v)
public void removeMostRecentValue() throws MathIllegalStateException
public double replaceMostRecentValue(double v) throws MathIllegalStateException
public double getMean()
public double getGeometricMean()
public double getVariance()
public double getPopulationVariance()
public double getStandardDeviation()
public double getSkewness()
public double getKurtosis()
public double getMax()
public double getMin()
public long getN()
public double getSum()
public double getSumsq()
public void clear()
public int getWindowSize()
public void setWindowSize(int windowSize) throws MathIllegalArgumentException
public double[] getValues()
public double[] getSortedValues()
public double getElement(int index)
public double getPercentile(double p) throws MathIllegalStateException, MathIllegalArgumentException
public String toString()
public double apply(UnivariateStatistic stat)
public synchronized UnivariateStatistic getMeanImpl()
public synchronized void setMeanImpl(UnivariateStatistic meanImpl)
public synchronized UnivariateStatistic getGeometricMeanImpl()
public synchronized void setGeometricMeanImpl(UnivariateStatistic geometricMeanImpl)
public synchronized UnivariateStatistic getKurtosisImpl()
public synchronized void setKurtosisImpl(UnivariateStatistic kurtosisImpl)
public synchronized UnivariateStatistic getMaxImpl()
public synchronized void setMaxImpl(UnivariateStatistic maxImpl)
public synchronized UnivariateStatistic getMinImpl()
public synchronized void setMinImpl(UnivariateStatistic minImpl)
public synchronized UnivariateStatistic getPercentileImpl()
public synchronized void setPercentileImpl(UnivariateStatistic percentileImpl) throws MathIllegalArgumentException
public synchronized UnivariateStatistic getSkewnessImpl()
public synchronized void setSkewnessImpl(UnivariateStatistic skewnessImpl)
public synchronized UnivariateStatistic getVarianceImpl()
public synchronized void setVarianceImpl(UnivariateStatistic varianceImpl)
public synchronized UnivariateStatistic getSumsqImpl()
public synchronized void setSumsqImpl(UnivariateStatistic sumsqImpl)
public synchronized UnivariateStatistic getSumImpl()
public synchronized void setSumImpl(UnivariateStatistic sumImpl)
public DescriptiveStatistics copy()
public static void copy(DescriptiveStatistics source, DescriptiveStatistics dest) throws NullArgumentException
int INFINITE_WINDOW=Optional[-1]
long serialVersionUID=Optional[4133067267405273064L]
String SET_QUANTILE_METHOD_NAME=Optional["setQuantile"]
int windowSize=Optional[INFINITE_WINDOW]
ResizableDoubleArray eDA=Optional[new ResizableDoubleArray()]
UnivariateStatistic meanImpl=Optional[new Mean()]
UnivariateStatistic geometricMeanImpl=Optional[new GeometricMean()]
UnivariateStatistic kurtosisImpl=Optional[new Kurtosis()]
UnivariateStatistic maxImpl=Optional[new Max()]
UnivariateStatistic minImpl=Optional[new Min()]
UnivariateStatistic percentileImpl=Optional[new Percentile()]
UnivariateStatistic skewnessImpl=Optional[new Skewness()]
UnivariateStatistic varianceImpl=Optional[new Variance()]
UnivariateStatistic sumsqImpl=Optional[new SumOfSquares()]
UnivariateStatistic sumImpl=Optional[new Sum()]
