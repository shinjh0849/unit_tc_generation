public static FieldMatrix<Fraction> createFractionMatrix(final int[][] data)
public void testSingular()
public void testSolveDimensionErrors()
public void testSolveSingularityErrors()
public void testSolve()
public void testDeterminant()
private double getDeterminant(final FieldMatrix<Fraction> m)
int[][] testData=Optional[{ { 1, 2, 3 }, { 2, 5, 3 }, { 1, 0, 8 } }]
int[][] luData=Optional[{ { 2, 3, 3 }, { 0, 5, 7 }, { 6, 9, 8 } }]
int[][] singular=Optional[{ { 2, 3 }, { 2, 3 } }]
int[][] bigSingular=Optional[{ { 1, 2, 3, 4 }, { 2, 5, 3, 4 }, { 7, 3, 256, 1930 }, { 3, 7, 6, 8 } }]
