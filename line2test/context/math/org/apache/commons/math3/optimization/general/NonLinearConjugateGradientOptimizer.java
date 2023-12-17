public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula)
public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula, ConvergenceChecker<PointValuePair> checker)
public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula, ConvergenceChecker<PointValuePair> checker, final UnivariateSolver lineSearchSolver)
public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula, ConvergenceChecker<PointValuePair> checker, final UnivariateSolver lineSearchSolver, final Preconditioner preconditioner)
public LineSearchFunction(final double[] searchDirection)
public void setInitialStep(final double initialStep)
protected PointValuePair doOptimize()
private double findUpperBound(final UnivariateFunction f, final double a, final double h)
public double[] precondition(double[] variables, double[] r)
public double value(double x)
ConjugateGradientFormula updateFormula
Preconditioner preconditioner
UnivariateSolver solver
double initialStep
double[] point
