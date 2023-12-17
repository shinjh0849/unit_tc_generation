public ArrayRealVector()
public ArrayRealVector(int size)
public ArrayRealVector(int size, double preset)
public ArrayRealVector(double[] d)
public ArrayRealVector(double[] d, boolean copyArray) throws NullArgumentException
public ArrayRealVector(double[] d, int pos, int size) throws NullArgumentException, NumberIsTooLargeException
public ArrayRealVector(Double[] d)
public ArrayRealVector(Double[] d, int pos, int size) throws NullArgumentException, NumberIsTooLargeException
public ArrayRealVector(RealVector v) throws NullArgumentException
public ArrayRealVector(ArrayRealVector v) throws NullArgumentException
public ArrayRealVector(ArrayRealVector v, boolean deep)
public ArrayRealVector(ArrayRealVector v1, ArrayRealVector v2)
public ArrayRealVector(ArrayRealVector v1, RealVector v2)
public ArrayRealVector(RealVector v1, ArrayRealVector v2)
public ArrayRealVector(ArrayRealVector v1, double[] v2)
public ArrayRealVector(double[] v1, ArrayRealVector v2)
public ArrayRealVector(double[] v1, double[] v2)
public ArrayRealVector copy()
public ArrayRealVector add(RealVector v) throws DimensionMismatchException
public ArrayRealVector subtract(RealVector v) throws DimensionMismatchException
public ArrayRealVector map(UnivariateFunction function)
public ArrayRealVector mapToSelf(UnivariateFunction function)
public RealVector mapAddToSelf(double d)
public RealVector mapSubtractToSelf(double d)
public RealVector mapMultiplyToSelf(double d)
public RealVector mapDivideToSelf(double d)
public ArrayRealVector ebeMultiply(RealVector v) throws DimensionMismatchException
public ArrayRealVector ebeDivide(RealVector v) throws DimensionMismatchException
public double[] getDataRef()
public double dotProduct(RealVector v) throws DimensionMismatchException
public double getNorm()
public double getL1Norm()
public double getLInfNorm()
public double getDistance(RealVector v) throws DimensionMismatchException
public double getL1Distance(RealVector v) throws DimensionMismatchException
public double getLInfDistance(RealVector v) throws DimensionMismatchException
public RealMatrix outerProduct(RealVector v)
public double getEntry(int index) throws OutOfRangeException
public int getDimension()
public RealVector append(RealVector v)
public ArrayRealVector append(ArrayRealVector v)
public RealVector append(double in)
public RealVector getSubVector(int index, int n) throws OutOfRangeException, NotPositiveException
public void setEntry(int index, double value) throws OutOfRangeException
public void addToEntry(int index, double increment) throws OutOfRangeException
public void setSubVector(int index, RealVector v) throws OutOfRangeException
public void setSubVector(int index, double[] v) throws OutOfRangeException
public void set(double value)
public double[] toArray()
public String toString()
protected void checkVectorDimensions(RealVector v) throws DimensionMismatchException
protected void checkVectorDimensions(int n) throws DimensionMismatchException
public boolean isNaN()
public boolean isInfinite()
public boolean equals(Object other)
public int hashCode()
public ArrayRealVector combine(double a, double b, RealVector y) throws DimensionMismatchException
public ArrayRealVector combineToSelf(double a, double b, RealVector y) throws DimensionMismatchException
public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor)
public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor)
public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public double walkInDefaultOrder(final RealVectorChangingVisitor visitor)
public double walkInDefaultOrder(final RealVectorChangingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor)
public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
