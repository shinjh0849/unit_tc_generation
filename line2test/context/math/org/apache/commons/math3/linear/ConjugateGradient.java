public ConjugateGradient(final int maxIterations, final double delta, final boolean check)
public ConjugateGradient(final IterationManager manager, final double delta, final boolean check) throws NullArgumentException
public final boolean getCheck()
public RealVector solveInPlace(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final RealVector x0) throws NullArgumentException, NonPositiveDefiniteOperatorException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException, NonPositiveDefiniteOperatorException
String OPERATOR=Optional["operator"]
String VECTOR=Optional["vector"]
boolean check
double delta
