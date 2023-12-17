public SimpleRegression()
public SimpleRegression(boolean includeIntercept)
public void addData(final double x, final double y)
public void append(SimpleRegression reg)
public void removeData(final double x, final double y)
public void addData(final double[][] data) throws ModelSpecificationException
public void addObservation(final double[] x, final double y) throws ModelSpecificationException
public void addObservations(final double[][] x, final double[] y) throws ModelSpecificationException
public void removeData(double[][] data)
public void clear()
public long getN()
public double predict(final double x)
public double getIntercept()
public boolean hasIntercept()
public double getSlope()
public double getSumSquaredErrors()
public double getTotalSumSquares()
public double getXSumSquares()
public double getSumOfCrossProducts()
public double getRegressionSumSquares()
public double getMeanSquareError()
public double getR()
public double getRSquare()
public double getInterceptStdErr()
public double getSlopeStdErr()
public double getSlopeConfidenceInterval() throws OutOfRangeException
public double getSlopeConfidenceInterval(final double alpha) throws OutOfRangeException
public double getSignificance()
private double getIntercept(final double slope)
private double getRegressionSumSquares(final double slope)
public RegressionResults regress() throws ModelSpecificationException, NoDataException
public RegressionResults regress(int[] variablesToInclude) throws MathIllegalArgumentException
