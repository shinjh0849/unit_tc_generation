public OpenMapRealVector()
public OpenMapRealVector(int dimension)
public OpenMapRealVector(int dimension, double epsilon)
protected OpenMapRealVector(OpenMapRealVector v, int resize)
public OpenMapRealVector(int dimension, int expectedSize)
public OpenMapRealVector(int dimension, int expectedSize, double epsilon)
public OpenMapRealVector(double[] values)
public OpenMapRealVector(double[] values, double epsilon)
public OpenMapRealVector(Double[] values)
public OpenMapRealVector(Double[] values, double epsilon)
public OpenMapRealVector(OpenMapRealVector v)
public OpenMapRealVector(RealVector v)
protected OpenMapEntry(Iterator iter)
protected OpenMapSparseIterator()
private OpenIntToDoubleHashMap getEntries()
protected boolean isDefaultValue(double value)
public RealVector add(RealVector v) throws DimensionMismatchException
public OpenMapRealVector add(OpenMapRealVector v) throws DimensionMismatchException
public OpenMapRealVector append(OpenMapRealVector v)
public OpenMapRealVector append(RealVector v)
public OpenMapRealVector append(double d)
public OpenMapRealVector copy()
public double dotProduct(OpenMapRealVector v) throws DimensionMismatchException
public OpenMapRealVector ebeDivide(RealVector v) throws DimensionMismatchException
public OpenMapRealVector ebeMultiply(RealVector v) throws DimensionMismatchException
public OpenMapRealVector getSubVector(int index, int n) throws NotPositiveException, OutOfRangeException
public int getDimension()
public double getDistance(OpenMapRealVector v) throws DimensionMismatchException
public double getDistance(RealVector v) throws DimensionMismatchException
public double getEntry(int index) throws OutOfRangeException
public double getL1Distance(OpenMapRealVector v) throws DimensionMismatchException
public double getL1Distance(RealVector v) throws DimensionMismatchException
private double getLInfDistance(OpenMapRealVector v) throws DimensionMismatchException
public double getLInfDistance(RealVector v) throws DimensionMismatchException
public boolean isInfinite()
public boolean isNaN()
public OpenMapRealVector mapAdd(double d)
public OpenMapRealVector mapAddToSelf(double d)
public void setEntry(int index, double value) throws OutOfRangeException
public void setSubVector(int index, RealVector v) throws OutOfRangeException
public void set(double value)
public OpenMapRealVector subtract(OpenMapRealVector v) throws DimensionMismatchException
public RealVector subtract(RealVector v) throws DimensionMismatchException
public OpenMapRealVector unitVector() throws MathArithmeticException
public void unitize() throws MathArithmeticException
public double[] toArray()
public int hashCode()
public boolean equals(Object obj)
public double getSparsity()
public java.util.Iterator<Entry> sparseIterator()
public double getValue()
public void setValue(double value)
public int getIndex()
public boolean hasNext()
public Entry next()
public void remove()
double DEFAULT_ZERO_TOLERANCE=Optional[1.0e-12]
long serialVersionUID=Optional[8772222695580707260L]
OpenIntToDoubleHashMap entries
int virtualSize
double epsilon
