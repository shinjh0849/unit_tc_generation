public Covariance()
public Covariance(double[][] data, boolean biasCorrected) throws MathIllegalArgumentException, NotStrictlyPositiveException
public Covariance(double[][] data) throws MathIllegalArgumentException, NotStrictlyPositiveException
public Covariance(RealMatrix matrix, boolean biasCorrected) throws MathIllegalArgumentException
public Covariance(RealMatrix matrix) throws MathIllegalArgumentException
public RealMatrix getCovarianceMatrix()
public int getN()
protected RealMatrix computeCovarianceMatrix(RealMatrix matrix, boolean biasCorrected) throws MathIllegalArgumentException
protected RealMatrix computeCovarianceMatrix(RealMatrix matrix) throws MathIllegalArgumentException
protected RealMatrix computeCovarianceMatrix(double[][] data, boolean biasCorrected) throws MathIllegalArgumentException, NotStrictlyPositiveException
protected RealMatrix computeCovarianceMatrix(double[][] data) throws MathIllegalArgumentException, NotStrictlyPositiveException
public double covariance(final double[] xArray, final double[] yArray, boolean biasCorrected) throws MathIllegalArgumentException
public double covariance(final double[] xArray, final double[] yArray) throws MathIllegalArgumentException
private void checkSufficientData(final RealMatrix matrix) throws MathIllegalArgumentException
