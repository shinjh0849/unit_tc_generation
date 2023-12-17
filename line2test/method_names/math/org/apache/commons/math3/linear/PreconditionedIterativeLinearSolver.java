public PreconditionedIterativeLinearSolver(final int maxIterations)
public PreconditionedIterativeLinearSolver(final IterationManager manager) throws NullArgumentException
public RealVector solve(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
public RealVector solve(final RealLinearOperator a, final RealVector b) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
public RealVector solve(final RealLinearOperator a, final RealVector b, final RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
protected static void checkParameters(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException
public RealVector solve(RealLinearOperator a, RealLinearOperator m, RealVector b) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
public abstract RealVector solveInPlace(RealLinearOperator a, RealLinearOperator m, RealVector b, RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
public RealVector solveInPlace(final RealLinearOperator a, final RealVector b, final RealVector x0) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException
