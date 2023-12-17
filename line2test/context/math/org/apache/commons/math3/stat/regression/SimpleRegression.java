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
long serialVersionUID=Optional[-3004689053607543335L]
double sumX=Optional[0d]
double sumXX=Optional[0d]
double sumY=Optional[0d]
double sumYY=Optional[0d]
double sumXY=Optional[0d]
long n=Optional[0]
double xbar=Optional[0]
double ybar=Optional[0]
boolean hasIntercept
