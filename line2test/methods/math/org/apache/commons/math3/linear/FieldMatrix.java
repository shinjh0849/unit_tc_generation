Field<T> getField(); <line_num>: 46,46
FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException; <line_num>: 59,60
FieldMatrix<T> copy(); <line_num>: 67,67
FieldMatrix<T> add(FieldMatrix<T> m) throws MatrixDimensionMismatchException; <line_num>: 77,77
FieldMatrix<T> subtract(FieldMatrix<T> m) throws MatrixDimensionMismatchException; <line_num>: 87,87
FieldMatrix<T> scalarAdd(T d); <line_num>: 95,95
FieldMatrix<T> scalarMultiply(T d); <line_num>: 103,103
FieldMatrix<T> multiply(FieldMatrix<T> m) throws DimensionMismatchException; <line_num>: 114,114
FieldMatrix<T> preMultiply(FieldMatrix<T> m) throws DimensionMismatchException; <line_num>: 124,124
FieldMatrix<T> power(final int p) throws NonSquareMatrixException, NotPositiveException; <line_num>: 136,137
T[][] getData(); <line_num>: 144,144
FieldMatrix<T> getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException; <line_num>: 159,160
FieldMatrix<T> getSubMatrix(int[] selectedRows, int[] selectedColumns) throws NoDataException, NullArgumentException, OutOfRangeException; <line_num>: 176,177
void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, T[][] destination) throws MatrixDimensionMismatchException, NumberIsTooSmallException, OutOfRangeException; <line_num>: 196,199
void copySubMatrix(int[] selectedRows, int[] selectedColumns, T[][] destination) throws MatrixDimensionMismatchException, NoDataException, NullArgumentException, OutOfRangeException; <line_num>: 217,219
void setSubMatrix(T[][] subMatrix, int row, int column) throws DimensionMismatchException, OutOfRangeException, NoDataException, NullArgumentException; <line_num>: 256,258
FieldMatrix<T> getRowMatrix(int row) throws OutOfRangeException; <line_num>: 268,268
void setRowMatrix(int row, FieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException; <line_num>: 281,282
FieldMatrix<T> getColumnMatrix(int column) throws OutOfRangeException; <line_num>: 292,292
void setColumnMatrix(int column, FieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException; <line_num>: 305,306
FieldVector<T> getRowVector(int row) throws OutOfRangeException; <line_num>: 316,316
void setRowVector(int row, FieldVector<T> vector) throws MatrixDimensionMismatchException, OutOfRangeException; <line_num>: 329,330
FieldVector<T> getColumnVector(int column) throws OutOfRangeException; <line_num>: 340,340
void setColumnVector(int column, FieldVector<T> vector) throws MatrixDimensionMismatchException, OutOfRangeException; <line_num>: 353,354
T[] getRow(int row) throws OutOfRangeException; <line_num>: 363,363
void setRow(int row, T[] array) throws MatrixDimensionMismatchException, OutOfRangeException; <line_num>: 376,377
T[] getColumn(int column) throws OutOfRangeException; <line_num>: 386,386
void setColumn(int column, T[] array) throws MatrixDimensionMismatchException, OutOfRangeException; <line_num>: 398,399
T getEntry(int row, int column) throws OutOfRangeException; <line_num>: 409,409
void setEntry(int row, int column, T value) throws OutOfRangeException; <line_num>: 420,420
void addToEntry(int row, int column, T increment) throws OutOfRangeException; <line_num>: 432,432
void multiplyEntry(int row, int column, T factor) throws OutOfRangeException; <line_num>: 444,444
FieldMatrix<T> transpose(); <line_num>: 451,451
T getTrace() throws NonSquareMatrixException; <line_num>: 460,460
T[] operate(T[] v) throws DimensionMismatchException; <line_num>: 470,470
FieldVector<T> operate(FieldVector<T> v) throws DimensionMismatchException; <line_num>: 480,480
T[] preMultiply(T[] v) throws DimensionMismatchException; <line_num>: 491,491
FieldVector<T> preMultiply(FieldVector<T> v) throws DimensionMismatchException; <line_num>: 502,502
T walkInRowOrder(FieldMatrixChangingVisitor<T> visitor); <line_num>: 524,524
T walkInRowOrder(FieldMatrixPreservingVisitor<T> visitor); <line_num>: 546,546
T walkInRowOrder(FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 575,577
T walkInRowOrder(FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException; <line_num>: 606,608
T walkInColumnOrder(FieldMatrixChangingVisitor<T> visitor); <line_num>: 630,630
T walkInColumnOrder(FieldMatrixPreservingVisitor<T> visitor); <line_num>: 652,652
T walkInColumnOrder(FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException; <line_num>: 681,683
T walkInColumnOrder(FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException; <line_num>: 712,714
T walkInOptimizedOrder(FieldMatrixChangingVisitor<T> visitor); <line_num>: 735,735
T walkInOptimizedOrder(FieldMatrixPreservingVisitor<T> visitor); <line_num>: 756,756
T walkInOptimizedOrder(FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException; <line_num>: 784,786
T walkInOptimizedOrder(FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException; <line_num>: 814,816
