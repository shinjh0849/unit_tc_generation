public DefaultMeasurementModel(final double[][] measMatrix, final double[][] measNoise) throws NullArgumentException, NoDataException, DimensionMismatchException { [EOL]     this(new Array2DRowRealMatrix(measMatrix), new Array2DRowRealMatrix(measNoise)); [EOL] } <line_num>: 59,62
public DefaultMeasurementModel(final RealMatrix measMatrix, final RealMatrix measNoise) { [EOL]     this.measurementMatrix = measMatrix; [EOL]     this.measurementNoise = measNoise; [EOL] } <line_num>: 71,74
public RealMatrix getMeasurementMatrix() { [EOL]     return measurementMatrix; [EOL] } <line_num>: 77,79
public RealMatrix getMeasurementNoise() { [EOL]     return measurementNoise; [EOL] } <line_num>: 82,84
