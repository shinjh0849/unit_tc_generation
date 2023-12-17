protected BaseSecantSolver(final double absoluteAccuracy, final Method method)
protected BaseSecantSolver(final double relativeAccuracy, final double absoluteAccuracy, final Method method)
protected BaseSecantSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy, final Method method)
public double solve(final int maxEval, final UnivariateFunction f, final double min, final double max, final AllowedSolution allowedSolution)
public double solve(final int maxEval, final UnivariateFunction f, final double min, final double max, final double startValue, final AllowedSolution allowedSolution)
public double solve(final int maxEval, final UnivariateFunction f, final double min, final double max, final double startValue)
protected final double doSolve() throws ConvergenceException
double DEFAULT_ABSOLUTE_ACCURACY=Optional[1e-6]
AllowedSolution allowed
Method method
