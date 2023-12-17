public SparseFieldMatrix(final Field<T> field)
public SparseFieldMatrix(final Field<T> field, final int rowDimension, final int columnDimension)
public SparseFieldMatrix(SparseFieldMatrix<T> other)
public SparseFieldMatrix(FieldMatrix<T> other)
public void addToEntry(int row, int column, T increment)
public FieldMatrix<T> copy()
public FieldMatrix<T> createMatrix(int rowDimension, int columnDimension)
public int getColumnDimension()
public T getEntry(int row, int column)
public int getRowDimension()
public void multiplyEntry(int row, int column, T factor)
public void setEntry(int row, int column, T value)
private int computeKey(int row, int column)
OpenIntToFieldHashMap<T> entries
int rows
int columns
