public IterativeLinearSolver(final int maxIterations)
public IterativeLinearSolver(final IterationManager manager) throws NullArgumentException
protected static void checkParameters(final RealLinearOperator a, final RealVector b, final RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException
public IterationManager getIterationManager()
public RealVector solve(final RealLinearOperator a, final RealVector b) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
public RealVector solve(RealLinearOperator a, RealVector b, RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
public abstract RealVector solveInPlace(RealLinearOperator a, RealVector b, RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
IterationManager manager
