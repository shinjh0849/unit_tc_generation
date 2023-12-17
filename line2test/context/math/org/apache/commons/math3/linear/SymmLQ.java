public State(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final boolean goodb, final double shift, final double delta, final boolean check)
public SymmLQ(final int maxIterations, final double delta, final boolean check)
public SymmLQ(final IterationManager manager, final double delta, final boolean check)
private static void checkSymmetry(final RealLinearOperator l, final RealVector x, final RealVector y, final RealVector z) throws NonSelfAdjointOperatorException
private static void throwNPDLOException(final RealLinearOperator l, final RealVector v) throws NonPositiveDefiniteOperatorException
private static void daxpy(final double a, final RealVector x, final RealVector y)
private static void daxpbypz(final double a, final RealVector x, final double b, final RealVector y, final RealVector z)
 void refineSolution(final RealVector x)
 void init()
 void update()
private void updateNorms()
 boolean hasConverged()
 boolean bEqualsNullVector()
 boolean betaEqualsZero()
 double getNormOfResidual()
public final boolean getCheck()
public RealVector solve(final RealLinearOperator a, final RealLinearOperator m, final RealVector b) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException, NonSelfAdjointOperatorException, NonPositiveDefiniteOperatorException, IllConditionedOperatorException
public RealVector solve(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final boolean goodb, final double shift) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, MaxCountExceededException, NonSelfAdjointOperatorException, NonPositiveDefiniteOperatorException, IllConditionedOperatorException
public RealVector solve(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final RealVector x) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, NonSelfAdjointOperatorException, NonPositiveDefiniteOperatorException, IllConditionedOperatorException, MaxCountExceededException
public RealVector solve(final RealLinearOperator a, final RealVector b) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, NonSelfAdjointOperatorException, IllConditionedOperatorException, MaxCountExceededException
public RealVector solve(final RealLinearOperator a, final RealVector b, final boolean goodb, final double shift) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, NonSelfAdjointOperatorException, IllConditionedOperatorException, MaxCountExceededException
public RealVector solve(final RealLinearOperator a, final RealVector b, final RealVector x) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, NonSelfAdjointOperatorException, IllConditionedOperatorException, MaxCountExceededException
public RealVector solveInPlace(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final RealVector x) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, NonSelfAdjointOperatorException, NonPositiveDefiniteOperatorException, IllConditionedOperatorException, MaxCountExceededException
public RealVector solveInPlace(final RealLinearOperator a, final RealLinearOperator m, final RealVector b, final RealVector x, final boolean goodb, final double shift) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, NonSelfAdjointOperatorException, NonPositiveDefiniteOperatorException, IllConditionedOperatorException, MaxCountExceededException
public RealVector solveInPlace(final RealLinearOperator a, final RealVector b, final RealVector x) throws NullArgumentException, NonSquareOperatorException, DimensionMismatchException, NonSelfAdjointOperatorException, IllConditionedOperatorException, MaxCountExceededException
String OPERATOR=Optional["operator"]
String THRESHOLD=Optional["threshold"]
String VECTOR=Optional["vector"]
String VECTOR1=Optional["vector1"]
String VECTOR2=Optional["vector2"]
boolean check
double delta
