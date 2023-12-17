private MatrixUtils()
public FractionMatrixConverter()
public BigFractionMatrixConverter()
public static RealMatrix createRealMatrix(final int rows, final int columns)
public static FieldMatrix<T> createFieldMatrix(final Field<T> field, final int rows, final int columns)
public static RealMatrix createRealMatrix(double[][] data) throws NullArgumentException, DimensionMismatchException, NoDataException
public static FieldMatrix<T> createFieldMatrix(T[][] data) throws DimensionMismatchException, NoDataException, NullArgumentException
public static RealMatrix createRealIdentityMatrix(int dimension)
public static FieldMatrix<T> createFieldIdentityMatrix(final Field<T> field, final int dimension)
public static RealMatrix createRealDiagonalMatrix(final double[] diagonal)
public static FieldMatrix<T> createFieldDiagonalMatrix(final T[] diagonal)
public static RealVector createRealVector(double[] data) throws NoDataException, NullArgumentException
public static FieldVector<T> createFieldVector(final T[] data) throws NoDataException, NullArgumentException, ZeroException
public static RealMatrix createRowRealMatrix(double[] rowData) throws NoDataException, NullArgumentException
public static FieldMatrix<T> createRowFieldMatrix(final T[] rowData) throws NoDataException, NullArgumentException
public static RealMatrix createColumnRealMatrix(double[] columnData) throws NoDataException, NullArgumentException
public static FieldMatrix<T> createColumnFieldMatrix(final T[] columnData) throws NoDataException, NullArgumentException
private static boolean isSymmetricInternal(RealMatrix matrix, double relativeTolerance, boolean raiseException)
public static void checkSymmetric(RealMatrix matrix, double eps)
public static boolean isSymmetric(RealMatrix matrix, double eps)
public static void checkMatrixIndex(final AnyMatrix m, final int row, final int column) throws OutOfRangeException
public static void checkRowIndex(final AnyMatrix m, final int row) throws OutOfRangeException
public static void checkColumnIndex(final AnyMatrix m, final int column) throws OutOfRangeException
public static void checkSubMatrixIndex(final AnyMatrix m, final int startRow, final int endRow, final int startColumn, final int endColumn) throws NumberIsTooSmallException, OutOfRangeException
public static void checkSubMatrixIndex(final AnyMatrix m, final int[] selectedRows, final int[] selectedColumns) throws NoDataException, NullArgumentException, OutOfRangeException
public static void checkAdditionCompatible(final AnyMatrix left, final AnyMatrix right) throws MatrixDimensionMismatchException
public static void checkSubtractionCompatible(final AnyMatrix left, final AnyMatrix right) throws MatrixDimensionMismatchException
public static void checkMultiplicationCompatible(final AnyMatrix left, final AnyMatrix right) throws DimensionMismatchException
public static Array2DRowRealMatrix fractionMatrixToRealMatrix(final FieldMatrix<Fraction> m)
public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn)
public void visit(int row, int column, Fraction value)
 Array2DRowRealMatrix getConvertedMatrix()
public static Array2DRowRealMatrix bigFractionMatrixToRealMatrix(final FieldMatrix<BigFraction> m)
public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn)
public void visit(int row, int column, BigFraction value)
 Array2DRowRealMatrix getConvertedMatrix()
public static void serializeRealVector(final RealVector vector, final ObjectOutputStream oos) throws IOException
public static void deserializeRealVector(final Object instance, final String fieldName, final ObjectInputStream ois) throws ClassNotFoundException, IOException
public static void serializeRealMatrix(final RealMatrix matrix, final ObjectOutputStream oos) throws IOException
public static void deserializeRealMatrix(final Object instance, final String fieldName, final ObjectInputStream ois) throws ClassNotFoundException, IOException
public static void solveLowerTriangularSystem(RealMatrix rm, RealVector b) throws DimensionMismatchException, MathArithmeticException, NonSquareMatrixException
public static void solveUpperTriangularSystem(RealMatrix rm, RealVector b) throws DimensionMismatchException, MathArithmeticException, NonSquareMatrixException
public static RealMatrix blockInverse(RealMatrix m, int splitIndex)
