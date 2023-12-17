 Field<T> getField()
 FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
 FieldMatrix<T> copy()
 FieldMatrix<T> add(FieldMatrix<T> m) throws MatrixDimensionMismatchException
 FieldMatrix<T> subtract(FieldMatrix<T> m) throws MatrixDimensionMismatchException
 FieldMatrix<T> scalarAdd(T d)
 FieldMatrix<T> scalarMultiply(T d)
 FieldMatrix<T> multiply(FieldMatrix<T> m) throws DimensionMismatchException
 FieldMatrix<T> preMultiply(FieldMatrix<T> m) throws DimensionMismatchException
 FieldMatrix<T> power(final int p) throws NonSquareMatrixException, NotPositiveException
 T[][] getData()
 FieldMatrix<T> getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException
 FieldMatrix<T> getSubMatrix(int[] selectedRows, int[] selectedColumns) throws NoDataException, NullArgumentException, OutOfRangeException
 void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, T[][] destination) throws MatrixDimensionMismatchException, NumberIsTooSmallException, OutOfRangeException
 void copySubMatrix(int[] selectedRows, int[] selectedColumns, T[][] destination) throws MatrixDimensionMismatchException, NoDataException, NullArgumentException, OutOfRangeException
 void setSubMatrix(T[][] subMatrix, int row, int column) throws DimensionMismatchException, OutOfRangeException, NoDataException, NullArgumentException
 FieldMatrix<T> getRowMatrix(int row) throws OutOfRangeException
 void setRowMatrix(int row, FieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException
 FieldMatrix<T> getColumnMatrix(int column) throws OutOfRangeException
 void setColumnMatrix(int column, FieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException
 FieldVector<T> getRowVector(int row) throws OutOfRangeException
 void setRowVector(int row, FieldVector<T> vector) throws MatrixDimensionMismatchException, OutOfRangeException
 FieldVector<T> getColumnVector(int column) throws OutOfRangeException
 void setColumnVector(int column, FieldVector<T> vector) throws MatrixDimensionMismatchException, OutOfRangeException
 T[] getRow(int row) throws OutOfRangeException
 void setRow(int row, T[] array) throws MatrixDimensionMismatchException, OutOfRangeException
 T[] getColumn(int column) throws OutOfRangeException
 void setColumn(int column, T[] array) throws MatrixDimensionMismatchException, OutOfRangeException
 T getEntry(int row, int column) throws OutOfRangeException
 void setEntry(int row, int column, T value) throws OutOfRangeException
 void addToEntry(int row, int column, T increment) throws OutOfRangeException
 void multiplyEntry(int row, int column, T factor) throws OutOfRangeException
 FieldMatrix<T> transpose()
 T getTrace() throws NonSquareMatrixException
 T[] operate(T[] v) throws DimensionMismatchException
 FieldVector<T> operate(FieldVector<T> v) throws DimensionMismatchException
 T[] preMultiply(T[] v) throws DimensionMismatchException
 FieldVector<T> preMultiply(FieldVector<T> v) throws DimensionMismatchException
 T walkInRowOrder(FieldMatrixChangingVisitor<T> visitor)
 T walkInRowOrder(FieldMatrixPreservingVisitor<T> visitor)
 T walkInRowOrder(FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException
 T walkInRowOrder(FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws OutOfRangeException, NumberIsTooSmallException
 T walkInColumnOrder(FieldMatrixChangingVisitor<T> visitor)
 T walkInColumnOrder(FieldMatrixPreservingVisitor<T> visitor)
 T walkInColumnOrder(FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException
 T walkInColumnOrder(FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException
 T walkInOptimizedOrder(FieldMatrixChangingVisitor<T> visitor)
 T walkInOptimizedOrder(FieldMatrixPreservingVisitor<T> visitor)
 T walkInOptimizedOrder(FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException
 T walkInOptimizedOrder(FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws NumberIsTooSmallException, OutOfRangeException
