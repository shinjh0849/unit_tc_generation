public GeometricMean()
public GeometricMean(GeometricMean original) throws NullArgumentException
public GeometricMean(SumOfLogs sumOfLogs)
public GeometricMean copy()
public void increment(final double d)
public double getResult()
public void clear()
public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public long getN()
public void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl) throws MathIllegalStateException
public StorelessUnivariateStatistic getSumLogImpl()
public static void copy(GeometricMean source, GeometricMean dest) throws NullArgumentException
private void checkEmpty() throws MathIllegalStateException
long serialVersionUID=Optional[-8178734905303459453L]
StorelessUnivariateStatistic sumOfLogs
