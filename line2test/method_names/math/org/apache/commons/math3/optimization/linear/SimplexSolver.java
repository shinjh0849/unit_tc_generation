public SimplexSolver()
public SimplexSolver(final double epsilon, final int maxUlps)
private Integer getPivotColumn(SimplexTableau tableau)
private Integer getPivotRow(SimplexTableau tableau, final int col)
protected void doIteration(final SimplexTableau tableau) throws MaxCountExceededException, UnboundedSolutionException
protected void solvePhase1(final SimplexTableau tableau) throws MaxCountExceededException, UnboundedSolutionException, NoFeasibleSolutionException
public PointValuePair doOptimize() throws MaxCountExceededException, UnboundedSolutionException, NoFeasibleSolutionException
