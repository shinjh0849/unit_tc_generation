public RRQRDecomposition(RealMatrix matrix)
public RRQRDecomposition(RealMatrix matrix, double threshold)
private Solver(final DecompositionSolver upper, final RealMatrix p)
protected void decompose(double[][] qrt)
protected void performHouseholderReflection(int minor, double[][] qrt)
public RealMatrix getP()
public int getRank(final double dropThreshold)
public DecompositionSolver getSolver()
public boolean isNonSingular()
public RealVector solve(RealVector b)
public RealMatrix solve(RealMatrix b)
public RealMatrix getInverse()
int[] p
RealMatrix cachedP
