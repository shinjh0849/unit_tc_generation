public LaguerreSolver()
public LaguerreSolver(double absoluteAccuracy)
public LaguerreSolver(double relativeAccuracy, double absoluteAccuracy)
public LaguerreSolver(double relativeAccuracy, double absoluteAccuracy, double functionValueAccuracy)
public double doSolve() throws TooManyEvaluationsException, NumberIsTooLargeException, NoBracketingException
public double laguerre(double lo, double hi, double fLo, double fHi)
public Complex[] solveAllComplex(double[] coefficients, double initial) throws NullArgumentException, NoDataException, TooManyEvaluationsException
public Complex solveComplex(double[] coefficients, double initial) throws NullArgumentException, NoDataException, TooManyEvaluationsException
public boolean isRoot(double min, double max, Complex z)
public Complex[] solveAll(Complex[] coefficients, Complex initial) throws NullArgumentException, NoDataException, TooManyEvaluationsException
public Complex solve(Complex[] coefficients, Complex initial) throws NullArgumentException, NoDataException, TooManyEvaluationsException
double DEFAULT_ABSOLUTE_ACCURACY=Optional[1e-6]
ComplexSolver complexSolver=Optional[new ComplexSolver()]
