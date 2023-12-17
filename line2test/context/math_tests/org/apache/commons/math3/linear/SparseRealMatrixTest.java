public void testDimensions()
public void testCopyFunctions()
public void testAdd()
public void testAddFail()
public void testNorm()
public void testPlusMinus()
public void testMultiply()
public void testMultiply2()
public void testTrace()
public void testScalarAdd()
public void testOperate()
public void testMath209()
public void testTranspose()
public void testPremultiplyVector()
public void testPremultiply()
public void testGetVectors()
public void testGetEntry()
public void testExamples()
public void testSubMatrix()
public void testGetRowMatrix()
public void testGetColumnMatrix()
public void testGetRowVector()
public void testGetColumnVector()
private RealVector columnToVector(double[][] column)
public void testEqualsAndHashCode()
public void testToString()
public void testSetSubMatrix()
public void testSerial()
protected void assertClose(String msg, RealMatrix m, RealMatrix n, double tolerance)
protected void assertClose(String msg, double[] m, double[] n, double tolerance)
private OpenMapRealMatrix createSparseMatrix(double[][] data)
double[][] id=Optional[{ { 1d, 0d, 0d }, { 0d, 1d, 0d }, { 0d, 0d, 1d } }]
double[][] testData=Optional[{ { 1d, 2d, 3d }, { 2d, 5d, 3d }, { 1d, 0d, 8d } }]
double[][] testDataLU=Optional[{ { 2d, 5d, 3d }, { .5d, -2.5d, 6.5d }, { 0.5d, 0.2d, .2d } }]
double[][] testDataPlus2=Optional[{ { 3d, 4d, 5d }, { 4d, 7d, 5d }, { 3d, 2d, 10d } }]
double[][] testDataMinus=Optional[{ { -1d, -2d, -3d }, { -2d, -5d, -3d }, { -1d, 0d, -8d } }]
double[] testDataRow1=Optional[{ 1d, 2d, 3d }]
double[] testDataCol3=Optional[{ 3d, 3d, 8d }]
double[][] testDataInv=Optional[{ { -40d, 16d, 9d }, { 13d, -5d, -3d }, { 5d, -2d, -1d } }]
double[] preMultTest=Optional[{ 8, 12, 33 }]
double[][] testData2=Optional[{ { 1d, 2d, 3d }, { 2d, 5d, 3d } }]
double[][] testData2T=Optional[{ { 1d, 2d }, { 2d, 5d }, { 3d, 3d } }]
double[][] testDataPlusInv=Optional[{ { -39d, 18d, 12d }, { 15d, 0d, 0d }, { 6d, -2d, 7d } }]
double[][] luData=Optional[{ { 2d, 3d, 3d }, { 0d, 5d, 7d }, { 6d, 9d, 8d } }]
double[][] luDataLUDecomposition=Optional[{ { 6d, 9d, 8d }, { 0d, 5d, 7d }, { 0.33333333333333, 0d, 0.33333333333333 } }]
double[][] singular=Optional[{ { 2d, 3d }, { 2d, 3d } }]
double[][] bigSingular=Optional[{ { 1d, 2d, 3d, 4d }, { 2d, 5d, 3d, 4d }, { 7d, 3d, 256d, 1930d }, // 4th
{ 3d, 7d, 6d, 8d } }]
double[][] detData=Optional[{ { 1d, 2d, 3d }, { 4d, 5d, 6d }, { 7d, 8d, 10d } }]
double[][] detData2=Optional[{ { 1d, 3d }, { 2d, 4d } }]
double[] testVector=Optional[{ 1, 2, 3 }]
double[] testVector2=Optional[{ 1, 2, 3, 4 }]
double[][] subTestData=Optional[{ { 1, 2, 3, 4 }, { 1.5, 2.5, 3.5, 4.5 }, { 2, 4, 6, 8 }, { 4, 5, 6, 7 } }]
double[][] subRows02Cols13=Optional[{ { 2, 4 }, { 4, 8 } }]
double[][] subRows03Cols12=Optional[{ { 2, 3 }, { 5, 6 } }]
double[][] subRows03Cols123=Optional[{ { 2, 3, 4 }, { 5, 6, 7 } }]
double[][] subRows20Cols123=Optional[{ { 4, 6, 8 }, { 2, 3, 4 } }]
double[][] subRows31Cols31=Optional[{ { 7, 5 }, { 4.5, 2.5 } }]
double[][] subRows01Cols23=Optional[{ { 3, 4 }, { 3.5, 4.5 } }]
double[][] subRows23Cols00=Optional[{ { 2 }, { 4 } }]
double[][] subRows00Cols33=Optional[{ { 4 } }]
double[][] subRow0=Optional[{ { 1, 2, 3, 4 } }]
double[][] subRow3=Optional[{ { 4, 5, 6, 7 } }]
double[][] subColumn1=Optional[{ { 2 }, { 2.5 }, { 4 }, { 5 } }]
double[][] subColumn3=Optional[{ { 4 }, { 4.5 }, { 8 }, { 7 } }]
double entryTolerance=Optional[10E-16]
double normTolerance=Optional[10E-14]
double[][] d3=Optional[new double[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } }]
double[][] d4=Optional[new double[][] { { 1 }, { 2 }, { 3 }, { 4 } }]
double[][] d5=Optional[new double[][] { { 30 }, { 70 } }]
