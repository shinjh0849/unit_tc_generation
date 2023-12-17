Field<T> getField(); <line_num>: 64,64
FieldVector<T> copy(); <line_num>: 70,70
FieldVector<T> add(FieldVector<T> v) throws DimensionMismatchException; <line_num>: 78,78
FieldVector<T> subtract(FieldVector<T> v) throws DimensionMismatchException; <line_num>: 86,86
FieldVector<T> mapAdd(T d) throws NullArgumentException; <line_num>: 94,94
FieldVector<T> mapAddToSelf(T d) throws NullArgumentException; <line_num>: 103,103
FieldVector<T> mapSubtract(T d) throws NullArgumentException; <line_num>: 111,111
FieldVector<T> mapSubtractToSelf(T d) throws NullArgumentException; <line_num>: 120,120
FieldVector<T> mapMultiply(T d) throws NullArgumentException; <line_num>: 128,128
FieldVector<T> mapMultiplyToSelf(T d) throws NullArgumentException; <line_num>: 137,137
FieldVector<T> mapDivide(T d) throws NullArgumentException, MathArithmeticException; <line_num>: 146,147
FieldVector<T> mapDivideToSelf(T d) throws NullArgumentException, MathArithmeticException; <line_num>: 157,158
FieldVector<T> mapInv() throws MathArithmeticException; <line_num>: 165,165
FieldVector<T> mapInvToSelf() throws MathArithmeticException; <line_num>: 173,173
FieldVector<T> ebeMultiply(FieldVector<T> v) throws DimensionMismatchException; <line_num>: 181,182
FieldVector<T> ebeDivide(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException; <line_num>: 191,192
@Deprecated [EOL] T[] getData(); <line_num>: 199,200
T dotProduct(FieldVector<T> v) throws DimensionMismatchException; <line_num>: 208,208
FieldVector<T> projection(FieldVector<T> v) throws DimensionMismatchException, MathArithmeticException; <line_num>: 217,218
FieldMatrix<T> outerProduct(FieldVector<T> v); <line_num>: 225,225
T getEntry(int index) throws OutOfRangeException; <line_num>: 235,235
void setEntry(int index, T value) throws OutOfRangeException; <line_num>: 244,244
int getDimension(); <line_num>: 250,250
FieldVector<T> append(FieldVector<T> v); <line_num>: 257,257
FieldVector<T> append(T d); <line_num>: 264,264
FieldVector<T> getSubVector(int index, int n) throws OutOfRangeException, NotPositiveException; <line_num>: 274,275
void setSubVector(int index, FieldVector<T> v) throws OutOfRangeException; <line_num>: 283,283
void set(T value); <line_num>: 289,289
T[] toArray(); <line_num>: 297,297
