 Field<T> getField()
 FieldVector<T> copy()
 FieldVector<T> add(FieldVector<T> v) throws DimensionMismatchException
 FieldVector<T> subtract(FieldVector<T> v) throws DimensionMismatchException
 FieldVector<T> mapAdd(T d) throws NullArgumentException
 FieldVector<T> mapAddToSelf(T d) throws NullArgumentException
 FieldVector<T> mapSubtract(T d) throws NullArgumentException
 FieldVector<T> mapSubtractToSelf(T d) throws NullArgumentException
 FieldVector<T> mapMultiply(T d) throws NullArgumentException
 FieldVector<T> mapMultiplyToSelf(T d) throws NullArgumentException
 FieldVector<T> mapDivide(T d) throws NullArgumentException, MathArithmeticException
 FieldVector<T> mapDivideToSelf(T d) throws NullArgumentException, MathArithmeticException
 FieldVector<T> mapInv() throws MathArithmeticException
 FieldVector<T> mapInvToSelf() throws MathArithmeticException
 FieldVector<T> ebeMultiply(FieldVector<T> v) throws DimensionMismatchException
 FieldVector<T> ebeDivide(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
 T[] getData()
 T dotProduct(FieldVector<T> v) throws DimensionMismatchException
 FieldVector<T> projection(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException
 FieldMatrix<T> outerProduct(FieldVector<T> v)
 T getEntry(int index) throws OutOfRangeException
 void setEntry(int index, T value) throws OutOfRangeException
 int getDimension()
 FieldVector<T> append(FieldVector<T> v)
 FieldVector<T> append(T d)
 FieldVector<T> getSubVector(int index, int n) throws OutOfRangeException, NotPositiveException
 void setSubVector(int index, FieldVector<T> v) throws OutOfRangeException
 void set(T value)
 T[] toArray()
