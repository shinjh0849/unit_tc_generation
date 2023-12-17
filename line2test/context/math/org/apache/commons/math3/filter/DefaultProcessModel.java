public DefaultProcessModel(final double[][] stateTransition, final double[][] control, final double[][] processNoise, final double[] initialStateEstimate, final double[][] initialErrorCovariance) throws NullArgumentException, NoDataException, DimensionMismatchException
public DefaultProcessModel(final double[][] stateTransition, final double[][] control, final double[][] processNoise) throws NullArgumentException, NoDataException, DimensionMismatchException
public DefaultProcessModel(final RealMatrix stateTransition, final RealMatrix control, final RealMatrix processNoise, final RealVector initialStateEstimate, final RealMatrix initialErrorCovariance)
public RealMatrix getStateTransitionMatrix()
public RealMatrix getControlMatrix()
public RealMatrix getProcessNoise()
public RealVector getInitialStateEstimate()
public RealMatrix getInitialErrorCovariance()
RealMatrix stateTransitionMatrix
RealMatrix controlMatrix
RealMatrix processNoiseCovMatrix
RealVector initialStateEstimateVector
RealMatrix initialErrorCovMatrix
