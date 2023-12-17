private UnivariateSolverUtils()
public static double solve(UnivariateFunction function, double x0, double x1) throws NullArgumentException, NoBracketingException
public static double solve(UnivariateFunction function, double x0, double x1, double absoluteAccuracy) throws NullArgumentException, NoBracketingException
public static double forceSide(final int maxEval, final UnivariateFunction f, final BracketedUnivariateSolver<UnivariateFunction> bracketing, final double baseRoot, final double min, final double max, final AllowedSolution allowedSolution) throws NoBracketingException
public static double[] bracket(UnivariateFunction function, double initial, double lowerBound, double upperBound) throws NullArgumentException, NotStrictlyPositiveException, NoBracketingException
public static double[] bracket(UnivariateFunction function, double initial, double lowerBound, double upperBound, int maximumIterations) throws NullArgumentException, NotStrictlyPositiveException, NoBracketingException
public static double midpoint(double a, double b)
public static boolean isBracketing(UnivariateFunction function, final double lower, final double upper) throws NullArgumentException
public static boolean isSequence(final double start, final double mid, final double end)
public static void verifyInterval(final double lower, final double upper) throws NumberIsTooLargeException
public static void verifySequence(final double lower, final double initial, final double upper) throws NumberIsTooLargeException
public static void verifyBracketing(UnivariateFunction function, final double lower, final double upper) throws NullArgumentException, NoBracketingException
