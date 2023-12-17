public void testDimensions()
public void testNonSquare()
public void testPAEqualLU()
public void testLLowerTriangular()
public void testUUpperTriangular()
public void testPPermutation()
public void testSingular()
public void testMatricesValues1()
public void testMatricesValues2()
double[][] testData=Optional[{ { 1.0, 2.0, 3.0 }, { 2.0, 5.0, 3.0 }, { 1.0, 0.0, 8.0 } }]
double[][] testDataMinus=Optional[{ { -1.0, -2.0, -3.0 }, { -2.0, -5.0, -3.0 }, { -1.0, 0.0, -8.0 } }]
double[][] luData=Optional[{ { 2.0, 3.0, 3.0 }, { 0.0, 5.0, 7.0 }, { 6.0, 9.0, 8.0 } }]
double[][] singular=Optional[{ { 2.0, 3.0 }, { 2.0, 3.0 } }]
double[][] bigSingular=Optional[{ { 1.0, 2.0, 3.0, 4.0 }, { 2.0, 5.0, 3.0, 4.0 }, { 7.0, 3.0, 256.0, 1930.0 }, { 3.0, 7.0, 6.0, 8.0 } }]
double entryTolerance=Optional[10e-16]
double normTolerance=Optional[10e-14]
