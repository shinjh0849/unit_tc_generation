public KalmanFilter(final ProcessModel process, final MeasurementModel measurement) throws NullArgumentException, NonSquareMatrixException, DimensionMismatchException, MatrixDimensionMismatchException
public int getStateDimension()
public int getMeasurementDimension()
public double[] getStateEstimation()
public RealVector getStateEstimationVector()
public double[][] getErrorCovariance()
public RealMatrix getErrorCovarianceMatrix()
public void predict()
public void predict(final double[] u) throws DimensionMismatchException
public void predict(final RealVector u) throws DimensionMismatchException
public void correct(final double[] z) throws NullArgumentException, DimensionMismatchException, SingularMatrixException
public void correct(final RealVector z) throws NullArgumentException, DimensionMismatchException, SingularMatrixException
ProcessModel processModel
MeasurementModel measurementModel
RealMatrix transitionMatrix
RealMatrix transitionMatrixT
RealMatrix controlMatrix
RealMatrix measurementMatrix
RealMatrix measurementMatrixT
RealVector stateEstimation
RealMatrix errorCovariance
