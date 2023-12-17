public MatrixDimensionMismatchException(int wrongRowDim, int wrongColDim, int expectedRowDim, int expectedColDim) { [EOL]     super(LocalizedFormats.DIMENSIONS_MISMATCH_2x2, new Integer[] { wrongRowDim, wrongColDim }, new Integer[] { expectedRowDim, expectedColDim }); [EOL] } <line_num>: 41,48
public int getWrongRowDimension() { [EOL]     return getWrongDimension(0); [EOL] } <line_num>: 53,55
public int getExpectedRowDimension() { [EOL]     return getExpectedDimension(0); [EOL] } <line_num>: 59,61
public int getWrongColumnDimension() { [EOL]     return getWrongDimension(1); [EOL] } <line_num>: 65,67
public int getExpectedColumnDimension() { [EOL]     return getExpectedDimension(1); [EOL] } <line_num>: 71,73
