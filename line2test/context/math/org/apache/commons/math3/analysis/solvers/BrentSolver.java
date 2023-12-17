public BrentSolver()
public BrentSolver(double absoluteAccuracy)
public BrentSolver(double relativeAccuracy, double absoluteAccuracy)
public BrentSolver(double relativeAccuracy, double absoluteAccuracy, double functionValueAccuracy)
protected double doSolve() throws NoBracketingException, TooManyEvaluationsException, NumberIsTooLargeException
private double brent(double lo, double hi, double fLo, double fHi)
double DEFAULT_ABSOLUTE_ACCURACY=Optional[1e-6]
