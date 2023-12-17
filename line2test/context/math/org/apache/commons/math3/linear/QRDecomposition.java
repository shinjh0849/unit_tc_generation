public QRDecomposition(RealMatrix matrix)
public QRDecomposition(RealMatrix matrix, double threshold)
private Solver(final double[][] qrt, final double[] rDiag, final double threshold)
protected void decompose(double[][] matrix)
protected void performHouseholderReflection(int minor, double[][] matrix)
public RealMatrix getR()
public RealMatrix getQ()
public RealMatrix getQT()
public RealMatrix getH()
public DecompositionSolver getSolver()
public boolean isNonSingular()
public RealVector solve(RealVector b)
public RealMatrix solve(RealMatrix b)
public RealMatrix getInverse()
double[][] qrt
double[] rDiag
RealMatrix cachedQ
RealMatrix cachedQT
RealMatrix cachedR
RealMatrix cachedH
double threshold
