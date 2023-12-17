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
int SSE_IDX=Optional[0]
int SST_IDX=Optional[1]
int RSQ_IDX=Optional[2]
int MSE_IDX=Optional[3]
int ADJRSQ_IDX=Optional[4]
long serialVersionUID=Optional[1l]
double[] parameters
double[][] varCovData
boolean isSymmetricVCD
int rank
long nobs
boolean containsConstant
double[] globalFitInfo
