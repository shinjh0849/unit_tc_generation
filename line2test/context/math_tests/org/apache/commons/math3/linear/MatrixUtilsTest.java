public void testCreateRealMatrix()
public void testcreateFieldMatrix()
public void testCreateRowRealMatrix()
public void testCreateRowFieldMatrix()
public void testCreateColumnRealMatrix()
public void testCreateColumnFieldMatrix()
protected void checkIdentityMatrix(RealMatrix m)
public void testCreateIdentityMatrix()
protected void checkIdentityFieldMatrix(FieldMatrix<Fraction> m)
public void testcreateFieldIdentityMatrix()
public void testBigFractionConverter()
public void testFractionConverter()
public static final Fraction[][] asFraction(double[][] data)
public static final Fraction[] asFraction(double[] data)
public void testSolveLowerTriangularSystem()
public void testSolveUpperTriangularSystem()
public void testBlockInverse()
public void testBlockInverseNonInvertible()
public void testIsSymmetric()
public void testIsSymmetricTolerance()
public void testCheckSymmetric1()
public void testCheckSymmetric2()
double[][] testData=Optional[{ { 1d, 2d, 3d }, { 2d, 5d, 3d }, { 1d, 0d, 8d } }]
double[][] nullMatrix=Optional[null]
double[] row=Optional[{ 1, 2, 3 }]
BigDecimal[] bigRow=Optional[{ new BigDecimal(1), new BigDecimal(2), new BigDecimal(3) }]
String[] stringRow=Optional[{ "1", "2", "3" }]
Fraction[] fractionRow=Optional[{ new Fraction(1), new Fraction(2), new Fraction(3) }]
double[][] rowMatrix=Optional[{ { 1, 2, 3 } }]
BigDecimal[][] bigRowMatrix=Optional[{ { new BigDecimal(1), new BigDecimal(2), new BigDecimal(3) } }]
String[][] stringRowMatrix=Optional[{ { "1", "2", "3" } }]
Fraction[][] fractionRowMatrix=Optional[{ { new Fraction(1), new Fraction(2), new Fraction(3) } }]
double[] col=Optional[{ 0, 4, 6 }]
BigDecimal[] bigCol=Optional[{ new BigDecimal(0), new BigDecimal(4), new BigDecimal(6) }]
String[] stringCol=Optional[{ "0", "4", "6" }]
Fraction[] fractionCol=Optional[{ new Fraction(0), new Fraction(4), new Fraction(6) }]
double[] nullDoubleArray=Optional[null]
double[][] colMatrix=Optional[{ { 0 }, { 4 }, { 6 } }]
BigDecimal[][] bigColMatrix=Optional[{ { new BigDecimal(0) }, { new BigDecimal(4) }, { new BigDecimal(6) } }]
String[][] stringColMatrix=Optional[{ { "0" }, { "4" }, { "6" } }]
Fraction[][] fractionColMatrix=Optional[{ { new Fraction(0) }, { new Fraction(4) }, { new Fraction(6) } }]
