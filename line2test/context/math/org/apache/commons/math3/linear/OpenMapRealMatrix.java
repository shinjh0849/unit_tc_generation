public OpenMapRealMatrix(int rowDimension, int columnDimension) throws NotStrictlyPositiveException, NumberIsTooLargeException
public OpenMapRealMatrix(OpenMapRealMatrix matrix)
public OpenMapRealMatrix copy()
public OpenMapRealMatrix createMatrix(int rowDimension, int columnDimension) throws NotStrictlyPositiveException, NumberIsTooLargeException
public int getColumnDimension()
public OpenMapRealMatrix add(OpenMapRealMatrix m) throws MatrixDimensionMismatchException
public OpenMapRealMatrix subtract(final RealMatrix m) throws MatrixDimensionMismatchException
public OpenMapRealMatrix subtract(OpenMapRealMatrix m) throws MatrixDimensionMismatchException
public RealMatrix multiply(final RealMatrix m) throws DimensionMismatchException, NumberIsTooLargeException
public OpenMapRealMatrix multiply(OpenMapRealMatrix m) throws DimensionMismatchException, NumberIsTooLargeException
public double getEntry(int row, int column) throws OutOfRangeException
public int getRowDimension()
public void setEntry(int row, int column, double value) throws OutOfRangeException
public void addToEntry(int row, int column, double increment) throws OutOfRangeException
public void multiplyEntry(int row, int column, double factor) throws OutOfRangeException
private int computeKey(int row, int column)
long serialVersionUID=Optional[-5962461716457143437L]
int rows
int columns
OpenIntToDoubleHashMap entries
