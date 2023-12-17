public NonSymmetricMatrixException(int row, int column, double threshold) { [EOL]     super(LocalizedFormats.NON_SYMMETRIC_MATRIX, row, column, threshold); [EOL]     this.row = row; [EOL]     this.column = column; [EOL]     this.threshold = threshold; [EOL] } <line_num>: 45,52
public int getRow() { [EOL]     return row; [EOL] } <line_num>: 57,59
public int getColumn() { [EOL]     return column; [EOL] } <line_num>: 63,65
public double getThreshold() { [EOL]     return threshold; [EOL] } <line_num>: 69,71
