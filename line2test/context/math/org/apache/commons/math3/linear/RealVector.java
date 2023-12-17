public Entry()
protected SparseEntryIterator()
public abstract int getDimension()
public abstract double getEntry(int index) throws OutOfRangeException
public abstract void setEntry(int index, double value) throws OutOfRangeException
public void addToEntry(int index, double increment) throws OutOfRangeException
public abstract RealVector append(RealVector v)
public abstract RealVector append(double d)
public abstract RealVector getSubVector(int index, int n) throws NotPositiveException, OutOfRangeException
public abstract void setSubVector(int index, RealVector v) throws OutOfRangeException
public abstract boolean isNaN()
public abstract boolean isInfinite()
protected void checkVectorDimensions(RealVector v) throws DimensionMismatchException
protected void checkVectorDimensions(int n) throws DimensionMismatchException
protected void checkIndex(final int index) throws OutOfRangeException
protected void checkIndices(final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public RealVector add(RealVector v) throws DimensionMismatchException
public RealVector subtract(RealVector v) throws DimensionMismatchException
public RealVector mapAdd(double d)
public RealVector mapAddToSelf(double d)
public abstract RealVector copy()
public double dotProduct(RealVector v) throws DimensionMismatchException
public double cosine(RealVector v) throws DimensionMismatchException, MathArithmeticException
public abstract RealVector ebeDivide(RealVector v) throws DimensionMismatchException
public abstract RealVector ebeMultiply(RealVector v) throws DimensionMismatchException
public double getDistance(RealVector v) throws DimensionMismatchException
public double getNorm()
public double getL1Norm()
public double getLInfNorm()
public double getL1Distance(RealVector v) throws DimensionMismatchException
public double getLInfDistance(RealVector v) throws DimensionMismatchException
public int getMinIndex()
public double getMinValue()
public int getMaxIndex()
public double getMaxValue()
public RealVector mapMultiply(double d)
public RealVector mapMultiplyToSelf(double d)
public RealVector mapSubtract(double d)
public RealVector mapSubtractToSelf(double d)
public RealVector mapDivide(double d)
public RealVector mapDivideToSelf(double d)
public RealMatrix outerProduct(RealVector v)
public RealVector projection(final RealVector v) throws DimensionMismatchException, MathArithmeticException
public void set(double value)
public double[] toArray()
public RealVector unitVector() throws MathArithmeticException
public void unitize() throws MathArithmeticException
public Iterator<Entry> sparseIterator()
public boolean hasNext()
public Entry next()
public void remove() throws MathUnsupportedOperationException
public Iterator<Entry> iterator()
public RealVector map(UnivariateFunction function)
public RealVector mapToSelf(UnivariateFunction function)
public RealVector combine(double a, double b, RealVector y) throws DimensionMismatchException
public RealVector combineToSelf(double a, double b, RealVector y) throws DimensionMismatchException
public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor)
public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor)
public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public double walkInDefaultOrder(final RealVectorChangingVisitor visitor)
public double walkInDefaultOrder(final RealVectorChangingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor)
public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor, final int start, final int end) throws NumberIsTooSmallException, OutOfRangeException
public double getValue()
public void setValue(double value)
public int getIndex()
public void setIndex(int index)
public boolean equals(Object other) throws MathUnsupportedOperationException
public int hashCode() throws MathUnsupportedOperationException
protected void advance(Entry e)
public boolean hasNext()
public Entry next()
public void remove() throws MathUnsupportedOperationException
public RealVector mapToSelf(UnivariateFunction function) throws MathUnsupportedOperationException
public RealVector map(UnivariateFunction function)
public boolean hasNext()
public Entry next()
public void remove() throws MathUnsupportedOperationException
public Iterator<Entry> iterator()
public boolean hasNext()
public Entry next()
public void remove() throws MathUnsupportedOperationException
public Iterator<Entry> sparseIterator()
public RealVector copy()
public RealVector add(RealVector w) throws DimensionMismatchException
public RealVector subtract(RealVector w) throws DimensionMismatchException
public RealVector mapAdd(double d)
public RealVector mapAddToSelf(double d) throws MathUnsupportedOperationException
public RealVector mapSubtract(double d)
public RealVector mapSubtractToSelf(double d) throws MathUnsupportedOperationException
public RealVector mapMultiply(double d)
public RealVector mapMultiplyToSelf(double d) throws MathUnsupportedOperationException
public RealVector mapDivide(double d)
public RealVector mapDivideToSelf(double d) throws MathUnsupportedOperationException
public RealVector ebeMultiply(RealVector w) throws DimensionMismatchException
public RealVector ebeDivide(RealVector w) throws DimensionMismatchException
public double dotProduct(RealVector w) throws DimensionMismatchException
public double cosine(RealVector w) throws DimensionMismatchException, MathArithmeticException
public double getNorm()
public double getL1Norm()
public double getLInfNorm()
public double getDistance(RealVector w) throws DimensionMismatchException
public double getL1Distance(RealVector w) throws DimensionMismatchException
public double getLInfDistance(RealVector w) throws DimensionMismatchException
public RealVector unitVector() throws MathArithmeticException
public void unitize() throws MathUnsupportedOperationException
public RealMatrix outerProduct(RealVector w)
public double getEntry(int index) throws OutOfRangeException
public void setEntry(int index, double value) throws MathUnsupportedOperationException
public void addToEntry(int index, double value) throws MathUnsupportedOperationException
public int getDimension()
public RealVector append(RealVector w)
public RealVector append(double d)
public RealVector getSubVector(int index, int n) throws OutOfRangeException, NotPositiveException
public void setSubVector(int index, RealVector w) throws MathUnsupportedOperationException
public void set(double value) throws MathUnsupportedOperationException
public double[] toArray()
public boolean isNaN()
public boolean isInfinite()
public RealVector combine(double a, double b, RealVector y) throws DimensionMismatchException
public RealVector combineToSelf(double a, double b, RealVector y) throws MathUnsupportedOperationException
public double getValue()
public void setValue(double value) throws MathUnsupportedOperationException
public static RealVector unmodifiableRealVector(final RealVector v)
