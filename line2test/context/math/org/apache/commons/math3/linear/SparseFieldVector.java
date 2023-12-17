public SparseFieldVector(Field<T> field)
public SparseFieldVector(Field<T> field, int dimension)
protected SparseFieldVector(SparseFieldVector<T> v, int resize)
public SparseFieldVector(Field<T> field, int dimension, int expectedSize)
public SparseFieldVector(Field<T> field, T[] values) throws NullArgumentException
public SparseFieldVector(SparseFieldVector<T> v)
private OpenIntToFieldHashMap<T> getEntries()
public FieldVector<T> add(SparseFieldVector<T> v) throws DimensionMismatchException
public FieldVector<T> append(SparseFieldVector<T> v)
public FieldVector<T> append(FieldVector<T> v)
public FieldVector<T> append(T d) throws NullArgumentException
public FieldVector<T> copy()
public T dotProduct(FieldVector<T> v) throws DimensionMismatchException
public FieldVector<T> ebeDivide(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
public FieldVector<T> ebeMultiply(FieldVector<T> v) throws DimensionMismatchException
public T[] getData()
public int getDimension()
public T getEntry(int index) throws OutOfRangeException
public Field<T> getField()
public FieldVector<T> getSubVector(int index, int n) throws OutOfRangeException, NotPositiveException
public FieldVector<T> mapAdd(T d) throws NullArgumentException
public FieldVector<T> mapAddToSelf(T d) throws NullArgumentException
public FieldVector<T> mapDivide(T d) throws NullArgumentException, MathArithmeticException
public FieldVector<T> mapDivideToSelf(T d) throws NullArgumentException, MathArithmeticException
public FieldVector<T> mapInv() throws MathArithmeticException
public FieldVector<T> mapInvToSelf() throws MathArithmeticException
public FieldVector<T> mapMultiply(T d) throws NullArgumentException
public FieldVector<T> mapMultiplyToSelf(T d) throws NullArgumentException
public FieldVector<T> mapSubtract(T d) throws NullArgumentException
public FieldVector<T> mapSubtractToSelf(T d) throws NullArgumentException
public FieldMatrix<T> outerProduct(SparseFieldVector<T> v)
public FieldMatrix<T> outerProduct(FieldVector<T> v)
public FieldVector<T> projection(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
public void set(T value)
public void setEntry(int index, T value) throws NullArgumentException, OutOfRangeException
public void setSubVector(int index, FieldVector<T> v) throws OutOfRangeException
public SparseFieldVector<T> subtract(SparseFieldVector<T> v) throws DimensionMismatchException
public FieldVector<T> subtract(FieldVector<T> v) throws DimensionMismatchException
public T[] toArray()
private void checkIndex(final int index) throws OutOfRangeException
protected void checkVectorDimensions(int n) throws DimensionMismatchException
public FieldVector<T> add(FieldVector<T> v) throws DimensionMismatchException
public int hashCode()
public boolean equals(Object obj)
long serialVersionUID=Optional[7841233292190413362L]
Field<T> field
OpenIntToFieldHashMap<T> entries
int virtualSize
