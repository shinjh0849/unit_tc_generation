RealMatrix createMatrix(int rowDimension, int columnDimension) throws NotStrictlyPositiveException; <line_num>: 50,51
RealMatrix copy(); <line_num>: 58,58
RealMatrix add(RealMatrix m) throws MatrixDimensionMismatchException; <line_num>: 68,69
RealMatrix subtract(RealMatrix m) throws MatrixDimensionMismatchException; <line_num>: 79,80
RealMatrix scalarAdd(double d); <line_num>: 88,88
RealMatrix scalarMultiply(double d); <line_num>: 97,97
RealMatrix multiply(RealMatrix m) throws DimensionMismatchException; <line_num>: 107,108
RealMatrix preMultiply(RealMatrix m) throws DimensionMismatchException; <line_num>: 118,119
RealMatrix power(final int p) throws NotPositiveException, NonSquareMatrixException; <line_num>: 131,132
double[][] getData(); <line_num>: 139,139
double getNorm(); <line_num>: 147,147
double getFrobeniusNorm(); <line_num>: 155,155
RealMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 171,173
RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) throws NullArgumentException, NoDataException, OutOfRangeException; <line_num>: 188,189
void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, double[][] destination) throws OutOfRangeException, NumberIsTooSmallException, MatrixDimensionMismatchException; <line_num>: 207,210
void copySubMatrix(int[] selectedRows, int[] selectedColumns, double[][] destination) throws OutOfRangeException, NullArgumentException, NoDataException, MatrixDimensionMismatchException; <line_num>: 228,231
void setSubMatrix(double[][] subMatrix, int row, int column) throws NoDataException, OutOfRangeException, DimensionMismatchException, NullArgumentException; <line_num>: 261,263
RealMatrix getRowMatrix(int row) throws OutOfRangeException; <line_num>: 273,273
void setRowMatrix(int row, RealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException; <line_num>: 287,288
RealMatrix getColumnMatrix(int column) throws OutOfRangeException; <line_num>: 298,299
void setColumnMatrix(int column, RealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException; <line_num>: 313,314
RealVector getRowVector(int row) throws OutOfRangeException; <line_num>: 324,325
void setRowVector(int row, RealVector vector) throws OutOfRangeException, MatrixDimensionMismatchException; <line_num>: 338,339
RealVector getColumnVector(int column) throws OutOfRangeException; <line_num>: 349,350
void setColumnVector(int column, RealVector vector) throws OutOfRangeException, MatrixDimensionMismatchException; <line_num>: 363,364
double[] getRow(int row) throws OutOfRangeException; <line_num>: 373,373
void setRow(int row, double[] array) throws OutOfRangeException, MatrixDimensionMismatchException; <line_num>: 386,387
double[] getColumn(int column) throws OutOfRangeException; <line_num>: 397,397
void setColumn(int column, double[] array) throws OutOfRangeException, MatrixDimensionMismatchException; <line_num>: 410,411
double getEntry(int row, int column) throws OutOfRangeException; <line_num>: 422,422
void setEntry(int row, int column, double value) throws OutOfRangeException; <line_num>: 434,434
void addToEntry(int row, int column, double increment) throws OutOfRangeException; <line_num>: 446,446
void multiplyEntry(int row, int column, double factor) throws OutOfRangeException; <line_num>: 458,458
RealMatrix transpose(); <line_num>: 465,465
double getTrace() throws NonSquareMatrixException; <line_num>: 474,474
double[] operate(double[] v) throws DimensionMismatchException; <line_num>: 484,484
RealVector operate(RealVector v) throws DimensionMismatchException; <line_num>: 494,494
double[] preMultiply(double[] v) throws DimensionMismatchException; <line_num>: 504,504
RealVector preMultiply(RealVector v) throws DimensionMismatchException; <line_num>: 514,514
double walkInRowOrder(RealMatrixChangingVisitor visitor); <line_num>: 536,536
double walkInRowOrder(RealMatrixPreservingVisitor visitor); <line_num>: 558,558
double walkInRowOrder(RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 587,589
double walkInRowOrder(RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 618,620
double walkInColumnOrder(RealMatrixChangingVisitor visitor); <line_num>: 642,642
double walkInColumnOrder(RealMatrixPreservingVisitor visitor); <line_num>: 664,664
double walkInColumnOrder(RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 693,695
double walkInColumnOrder(RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 724,726
double walkInOptimizedOrder(RealMatrixChangingVisitor visitor); <line_num>: 747,747
double walkInOptimizedOrder(RealMatrixPreservingVisitor visitor); <line_num>: 768,768
double walkInOptimizedOrder(RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 796,798
double walkInOptimizedOrder(RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 826,828
