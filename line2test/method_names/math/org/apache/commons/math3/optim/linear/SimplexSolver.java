public SimplexSolver()
public SimplexSolver(final double epsilon)
public SimplexSolver(final double epsilon, final int maxUlps)
public SimplexSolver(final double epsilon, final int maxUlps, final double cutOff)
private Integer getPivotColumn(SimplexTableau tableau)
private Integer getPivotRow(SimplexTableau tableau, final int col)
protected void doIteration(final SimplexTableau tableau) throws TooManyIterationsException, UnboundedSolutionException
protected void solvePhase1(final SimplexTableau tableau) throws TooManyIterationsException, UnboundedSolutionException, NoFeasibleSolutionException
public PointValuePair doOptimize() throws TooManyIterationsException, UnboundedSolutionException, NoFeasibleSolutionException
