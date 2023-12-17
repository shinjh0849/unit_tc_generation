public NonLinearConjugateGradientOptimizer(final Formula updateFormula, ConvergenceChecker<PointValuePair> checker)
public BracketingStep(double step)
public NonLinearConjugateGradientOptimizer(final Formula updateFormula, ConvergenceChecker<PointValuePair> checker, final UnivariateSolver lineSearchSolver)
public NonLinearConjugateGradientOptimizer(final Formula updateFormula, ConvergenceChecker<PointValuePair> checker, final UnivariateSolver lineSearchSolver, final Preconditioner preconditioner)
public LineSearchFunction(double[] point, double[] direction)
public double getBracketingStep()
public PointValuePair optimize(OptimizationData... optData) throws TooManyEvaluationsException
protected PointValuePair doOptimize()
protected void parseOptimizationData(OptimizationData... optData)
private double findUpperBound(final UnivariateFunction f, final double a, final double h)
public double[] precondition(double[] variables, double[] r)
public double value(double x)
private void checkParameters()
Formula updateFormula
Preconditioner preconditioner
UnivariateSolver solver
double initialStep=Optional[1]
