public ArrayFieldVector(final Field<T> field)
public ArrayFieldVector(Field<T> field, int size)
public ArrayFieldVector(int size, T preset)
public ArrayFieldVector(T[] d) throws NullArgumentException, ZeroException
public ArrayFieldVector(Field<T> field, T[] d) throws NullArgumentException
public ArrayFieldVector(T[] d, boolean copyArray) throws NullArgumentException, ZeroException
public ArrayFieldVector(Field<T> field, T[] d, boolean copyArray) throws NullArgumentException
public ArrayFieldVector(T[] d, int pos, int size) throws NullArgumentException, NumberIsTooLargeException
public ArrayFieldVector(Field<T> field, T[] d, int pos, int size) throws NullArgumentException, NumberIsTooLargeException
public ArrayFieldVector(FieldVector<T> v) throws NullArgumentException
public ArrayFieldVector(ArrayFieldVector<T> v) throws NullArgumentException
public ArrayFieldVector(ArrayFieldVector<T> v, boolean deep) throws NullArgumentException
public ArrayFieldVector(ArrayFieldVector<T> v1, ArrayFieldVector<T> v2) throws NullArgumentException
public ArrayFieldVector(FieldVector<T> v1, FieldVector<T> v2) throws NullArgumentException
public ArrayFieldVector(ArrayFieldVector<T> v1, T[] v2) throws NullArgumentException
public ArrayFieldVector(FieldVector<T> v1, T[] v2) throws NullArgumentException
public ArrayFieldVector(T[] v1, ArrayFieldVector<T> v2) throws NullArgumentException
public ArrayFieldVector(T[] v1, FieldVector<T> v2) throws NullArgumentException
public ArrayFieldVector(T[] v1, T[] v2) throws NullArgumentException, ZeroException
public ArrayFieldVector(Field<T> field, T[] v1, T[] v2) throws NullArgumentException, ZeroException
public Field<T> getField()
public FieldVector<T> copy()
public FieldVector<T> add(FieldVector<T> v) throws DimensionMismatchException
public ArrayFieldVector<T> add(ArrayFieldVector<T> v) throws DimensionMismatchException
public FieldVector<T> subtract(FieldVector<T> v) throws DimensionMismatchException
public ArrayFieldVector<T> subtract(ArrayFieldVector<T> v) throws DimensionMismatchException
public FieldVector<T> mapAdd(T d) throws NullArgumentException
public FieldVector<T> mapAddToSelf(T d) throws NullArgumentException
public FieldVector<T> mapSubtract(T d) throws NullArgumentException
public FieldVector<T> mapSubtractToSelf(T d) throws NullArgumentException
public FieldVector<T> mapMultiply(T d) throws NullArgumentException
public FieldVector<T> mapMultiplyToSelf(T d) throws NullArgumentException
public FieldVector<T> mapDivide(T d) throws NullArgumentException, MathArithmeticException
public FieldVector<T> mapDivideToSelf(T d) throws NullArgumentException, MathArithmeticException
public FieldVector<T> mapInv() throws MathArithmeticException
public FieldVector<T> mapInvToSelf() throws MathArithmeticException
public FieldVector<T> ebeMultiply(FieldVector<T> v) throws DimensionMismatchException
public ArrayFieldVector<T> ebeMultiply(ArrayFieldVector<T> v) throws DimensionMismatchException
public FieldVector<T> ebeDivide(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
public ArrayFieldVector<T> ebeDivide(ArrayFieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
public T[] getData()
public T[] getDataRef()
public T dotProduct(FieldVector<T> v) throws DimensionMismatchException
public T dotProduct(ArrayFieldVector<T> v) throws DimensionMismatchException
public FieldVector<T> projection(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
public ArrayFieldVector<T> projection(ArrayFieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
public FieldMatrix<T> outerProduct(FieldVector<T> v)
public FieldMatrix<T> outerProduct(ArrayFieldVector<T> v)
public T getEntry(int index)
public int getDimension()
public FieldVector<T> append(FieldVector<T> v)
public ArrayFieldVector<T> append(ArrayFieldVector<T> v)
public FieldVector<T> append(T in)
public FieldVector<T> getSubVector(int index, int n) throws OutOfRangeException, NotPositiveException
public void setEntry(int index, T value)
public void setSubVector(int index, FieldVector<T> v) throws OutOfRangeException
public void set(int index, ArrayFieldVector<T> v) throws OutOfRangeException
public void set(T value)
public T[] toArray()
protected void checkVectorDimensions(FieldVector<T> v) throws DimensionMismatchException
protected void checkVectorDimensions(int n) throws DimensionMismatchException
public boolean equals(Object other)
public int hashCode()
private void checkIndex(final int index) throws OutOfRangeException
