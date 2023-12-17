public CholeskyDecomposition(final RealMatrix matrix)
public CholeskyDecomposition(final RealMatrix matrix, final double relativeSymmetryThreshold, final double absolutePositivityThreshold)
private Solver(final double[][] lTData)
public RealMatrix getL()
public RealMatrix getLT()
public double getDeterminant()
public DecompositionSolver getSolver()
public boolean isNonSingular()
public RealVector solve(final RealVector b)
public RealMatrix solve(RealMatrix b)
public RealMatrix getInverse()
double DEFAULT_RELATIVE_SYMMETRY_THRESHOLD=Optional[1.0e-15]
double DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD=Optional[1.0e-10]
double[][] lTData
RealMatrix cachedL
RealMatrix cachedLT
