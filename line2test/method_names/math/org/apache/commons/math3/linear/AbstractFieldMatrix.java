protected AbstractFieldMatrix()
protected AbstractFieldMatrix(final Field<T> field)
protected AbstractFieldMatrix(final Field<T> field, final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
protected static Field<T> extractField(final T[][] d) throws NoDataException, NullArgumentException
protected static Field<T> extractField(final T[] d) throws NoDataException
protected static T[][] buildArray(final Field<T> field, final int rows, final int columns)
protected static T[] buildArray(final Field<T> field, final int length)
public Field<T> getField()
public abstract FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public abstract FieldMatrix<T> copy()
public FieldMatrix<T> add(FieldMatrix<T> m) throws MatrixDimensionMismatchException
public FieldMatrix<T> subtract(final FieldMatrix<T> m) throws MatrixDimensionMismatchException
public FieldMatrix<T> scalarAdd(final T d)
public FieldMatrix<T> scalarMultiply(final T d)
public FieldMatrix<T> multiply(final FieldMatrix<T> m) throws DimensionMismatchException
public FieldMatrix<T> preMultiply(final FieldMatrix<T> m) throws DimensionMismatchException
public FieldMatrix<T> power(final int p) throws NonSquareMatrixException, NotPositiveException
public T[][] getData()
public FieldMatrix<T> getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public T visit(final int row, final int column, final T value)
public FieldMatrix<T> getSubMatrix(final int[] selectedRows, final int[] selectedColumns) throws NoDataException, NullArgumentException, OutOfRangeException
public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn)
public void visit(final int row, final int column, final T value)
public void copySubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn, final T[][] destination) throws MatrixDimensionMismatchException, NumberIsTooSmallException, OutOfRangeException
public void copySubMatrix(int[] selectedRows, int[] selectedColumns, T[][] destination) throws MatrixDimensionMismatchException, NoDataException, NullArgumentException, OutOfRangeException
public void setSubMatrix(final T[][] subMatrix, final int row, final int column) throws DimensionMismatchException, OutOfRangeException, NoDataException, NullArgumentException
public FieldMatrix<T> getRowMatrix(final int row) throws OutOfRangeException
public void setRowMatrix(final int row, final FieldMatrix<T> matrix) throws OutOfRangeException, MatrixDimensionMismatchException
public FieldMatrix<T> getColumnMatrix(final int column) throws OutOfRangeException
public void setColumnMatrix(final int column, final FieldMatrix<T> matrix) throws OutOfRangeException, MatrixDimensionMismatchException
public FieldVector<T> getRowVector(final int row) throws OutOfRangeException
public void setRowVector(final int row, final FieldVector<T> vector) throws OutOfRangeException, MatrixDimensionMismatchException
public FieldVector<T> getColumnVector(final int column) throws OutOfRangeException
public void setColumnVector(final int column, final FieldVector<T> vector) throws OutOfRangeException, MatrixDimensionMismatchException
public T[] getRow(final int row) throws OutOfRangeException
public void setRow(final int row, final T[] array) throws OutOfRangeException, MatrixDimensionMismatchException
public T[] getColumn(final int column) throws OutOfRangeException
public void setColumn(final int column, final T[] array) throws OutOfRangeException, MatrixDimensionMismatchException
public abstract T getEntry(int row, int column) throws OutOfRangeException
public abstract void setEntry(int row, int column, T value) throws OutOfRangeException
public abstract void addToEntry(int row, int column, T increment) throws OutOfRangeException
public abstract void multiplyEntry(int row, int column, T factor) throws OutOfRangeException
public void visit(final int row, final int column, final T value)
public FieldMatrix<T> transpose()
public boolean isSquare()
public abstract int getRowDimension()
public abstract int getColumnDimension()
public T getTrace() throws NonSquareMatrixException
public T[] operate(final T[] v) throws DimensionMismatchException
public FieldVector<T> operate(final FieldVector<T> v) throws DimensionMismatchException
public T[] preMultiply(final T[] v) throws DimensionMismatchException
public FieldVector<T> preMultiply(final FieldVector<T> v) throws DimensionMismatchException
public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor)
public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor)
public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor)
public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor)
public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor)
public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor)
public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public String toString()
public boolean equals(final Object object)
public int hashCode()
protected void checkRowIndex(final int row) throws OutOfRangeException
protected void checkColumnIndex(final int column) throws OutOfRangeException
protected void checkSubMatrixIndex(final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
protected void checkSubMatrixIndex(final int[] selectedRows, final int[] selectedColumns) throws NoDataException, NullArgumentException, OutOfRangeException
protected void checkAdditionCompatible(final FieldMatrix<T> m) throws MatrixDimensionMismatchException
protected void checkSubtractionCompatible(final FieldMatrix<T> m) throws MatrixDimensionMismatchException
protected void checkMultiplicationCompatible(final FieldMatrix<T> m) throws DimensionMismatchException
