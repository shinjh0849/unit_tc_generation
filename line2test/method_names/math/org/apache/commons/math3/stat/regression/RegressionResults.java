private RegressionResults()
public RegressionResults(final double[] parameters, final double[][] varcov, final boolean isSymmetricCompressed, final long nobs, final int rank, final double sumy, final double sumysq, final double sse, final boolean containsConstant, final boolean copyData)
public double getParameterEstimate(int index) throws OutOfRangeException
public double[] getParameterEstimates()
public double getStdErrorOfEstimate(int index) throws OutOfRangeException
public double[] getStdErrorOfEstimates()
public double getCovarianceOfParameters(int i, int j) throws OutOfRangeException
public int getNumberOfParameters()
public long getN()
public double getTotalSumSquares()
public double getRegressionSumSquares()
public double getErrorSumSquares()
public double getMeanSquareError()
public double getRSquared()
public double getAdjustedRSquared()
public boolean hasIntercept()
private double getVcvElement(int i, int j)
