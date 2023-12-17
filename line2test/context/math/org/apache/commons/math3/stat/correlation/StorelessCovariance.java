public StorelessCovariance(final int dim)
public StorelessCovariance(final int dim, final boolean biasCorrected)
private void initializeMatrix(final boolean biasCorrected)
private int indexOf(final int i, final int j)
private StorelessBivariateCovariance getElement(final int i, final int j)
private void setElement(final int i, final int j, final StorelessBivariateCovariance cov)
public double getCovariance(final int xIndex, final int yIndex) throws NumberIsTooSmallException
public void increment(final double[] data) throws DimensionMismatchException
public void append(StorelessCovariance sc) throws DimensionMismatchException
public RealMatrix getCovarianceMatrix() throws NumberIsTooSmallException
public double[][] getData() throws NumberIsTooSmallException
public int getN() throws MathUnsupportedOperationException
StorelessBivariateCovariance[] covMatrix
int dimension
