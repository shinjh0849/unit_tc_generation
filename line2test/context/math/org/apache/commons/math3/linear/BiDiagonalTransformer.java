public BiDiagonalTransformer(RealMatrix matrix)
public RealMatrix getU()
public RealMatrix getB()
public RealMatrix getV()
 double[][] getHouseholderVectorsRef()
 double[] getMainDiagonalRef()
 double[] getSecondaryDiagonalRef()
 boolean isUpperBiDiagonal()
private void transformToUpperBiDiagonal()
private void transformToLowerBiDiagonal()
double[][] householderVectors
double[] main
double[] secondary
RealMatrix cachedU
RealMatrix cachedB
RealMatrix cachedV
