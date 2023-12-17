public SimplexSolver()
public SimplexSolver(final double epsilon, final int maxUlps)
private Integer getPivotColumn(SimplexTableau tableau)
private Integer getPivotRow(SimplexTableau tableau, final int col)
protected void doIteration(final SimplexTableau tableau) throws MaxCountExceededException, UnboundedSolutionException
protected void solvePhase1(final SimplexTableau tableau) throws MaxCountExceededException, UnboundedSolutionException, NoFeasibleSolutionException
public PointValuePair doOptimize() throws MaxCountExceededException, UnboundedSolutionException, NoFeasibleSolutionException
double DEFAULT_EPSILON=Optional[1.0e-6]
int DEFAULT_ULPS=Optional[10]
double epsilon
int maxUlps
