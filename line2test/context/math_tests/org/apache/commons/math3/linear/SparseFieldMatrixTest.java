public SparseFieldMatrixTest()
public void testDimensions()
public void testCopyFunctions()
public void testAdd()
public void testAddFail()
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
private FieldVector<Fraction> columnToVector(Fraction[][] column)
public void testEqualsAndHashCode()
public void testSetSubMatrix()
protected void assertClose(String msg, FieldMatrix<Fraction> m, FieldMatrix<Fraction> n, double tolerance)
protected void assertClose(String msg, Fraction[] m, Fraction[] n, double tolerance)
private SparseFieldMatrix<Fraction> createSparseMatrix(Fraction[][] data)
Fraction[][] id=Optional[{ { new Fraction(1), new Fraction(0), new Fraction(0) }, { new Fraction(0), new Fraction(1), new Fraction(0) }, { new Fraction(0), new Fraction(0), new Fraction(1) } }]
Fraction[][] testData=Optional[{ { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(5), new Fraction(3) }, { new Fraction(1), new Fraction(0), new Fraction(8) } }]
Fraction[][] testDataLU=Optional[null]
Fraction[][] testDataPlus2=Optional[{ { new Fraction(3), new Fraction(4), new Fraction(5) }, { new Fraction(4), new Fraction(7), new Fraction(5) }, { new Fraction(3), new Fraction(2), new Fraction(10) } }]
Fraction[][] testDataMinus=Optional[{ { new Fraction(-1), new Fraction(-2), new Fraction(-3) }, { new Fraction(-2), new Fraction(-5), new Fraction(-3) }, { new Fraction(-1), new Fraction(0), new Fraction(-8) } }]
Fraction[] testDataRow1=Optional[{ new Fraction(1), new Fraction(2), new Fraction(3) }]
Fraction[] testDataCol3=Optional[{ new Fraction(3), new Fraction(3), new Fraction(8) }]
Fraction[][] testDataInv=Optional[{ { new Fraction(-40), new Fraction(16), new Fraction(9) }, { new Fraction(13), new Fraction(-5), new Fraction(-3) }, { new Fraction(5), new Fraction(-2), new Fraction(-1) } }]
Fraction[] preMultTest=Optional[{ new Fraction(8), new Fraction(12), new Fraction(33) }]
Fraction[][] testData2=Optional[{ { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(5), new Fraction(3) } }]
Fraction[][] testData2T=Optional[{ { new Fraction(1), new Fraction(2) }, { new Fraction(2), new Fraction(5) }, { new Fraction(3), new Fraction(3) } }]
Fraction[][] testDataPlusInv=Optional[{ { new Fraction(-39), new Fraction(18), new Fraction(12) }, { new Fraction(15), new Fraction(0), new Fraction(0) }, { new Fraction(6), new Fraction(-2), new Fraction(7) } }]
Fraction[][] luData=Optional[{ { new Fraction(2), new Fraction(3), new Fraction(3) }, { new Fraction(0), new Fraction(5), new Fraction(7) }, { new Fraction(6), new Fraction(9), new Fraction(8) } }]
Fraction[][] luDataLUDecomposition=Optional[null]
Fraction[][] singular=Optional[{ { new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(3) } }]
Fraction[][] bigSingular=Optional[{ { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) }, { new Fraction(2), new Fraction(5), new Fraction(3), new Fraction(4) }, { new Fraction(7), new Fraction(3), new Fraction(256), new Fraction(1930) }, // 4th
{ new Fraction(3), new Fraction(7), new Fraction(6), new Fraction(8) } }]
Fraction[][] detData=Optional[{ { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(4), new Fraction(5), new Fraction(6) }, { new Fraction(7), new Fraction(8), new Fraction(10) } }]
Fraction[][] detData2=Optional[{ { new Fraction(1), new Fraction(3) }, { new Fraction(2), new Fraction(4) } }]
Fraction[] testVector=Optional[{ new Fraction(1), new Fraction(2), new Fraction(3) }]
Fraction[] testVector2=Optional[{ new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) }]
Fraction[][] subTestData=Optional[null]
Fraction[][] subRows02Cols13=Optional[{ { new Fraction(2), new Fraction(4) }, { new Fraction(4), new Fraction(8) } }]
Fraction[][] subRows03Cols12=Optional[{ { new Fraction(2), new Fraction(3) }, { new Fraction(5), new Fraction(6) } }]
Fraction[][] subRows03Cols123=Optional[{ { new Fraction(2), new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6), new Fraction(7) } }]
Fraction[][] subRows20Cols123=Optional[{ { new Fraction(4), new Fraction(6), new Fraction(8) }, { new Fraction(2), new Fraction(3), new Fraction(4) } }]
Fraction[][] subRows31Cols31=Optional[null]
Fraction[][] subRows01Cols23=Optional[null]
Fraction[][] subRows23Cols00=Optional[{ { new Fraction(2) }, { new Fraction(4) } }]
Fraction[][] subRows00Cols33=Optional[{ { new Fraction(4) } }]
Fraction[][] subRow0=Optional[{ { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) } }]
Fraction[][] subRow3=Optional[{ { new Fraction(4), new Fraction(5), new Fraction(6), new Fraction(7) } }]
Fraction[][] subColumn1=Optional[null]
Fraction[][] subColumn3=Optional[null]
double entryTolerance=Optional[10E-16]
double normTolerance=Optional[10E-14]
Field<Fraction> field=Optional[FractionField.getInstance()]
Fraction[][] d3=Optional[new Fraction[][] { { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6), new Fraction(7), new Fraction(8) } }]
Fraction[][] d4=Optional[new Fraction[][] { { new Fraction(1) }, { new Fraction(2) }, { new Fraction(3) }, { new Fraction(4) } }]
Fraction[][] d5=Optional[new Fraction[][] { { new Fraction(30) }, { new Fraction(70) } }]
