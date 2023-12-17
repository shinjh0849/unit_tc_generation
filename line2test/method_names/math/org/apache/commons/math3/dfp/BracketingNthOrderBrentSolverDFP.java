public BracketingNthOrderBrentSolverDFP(final Dfp relativeAccuracy, final Dfp absoluteAccuracy, final Dfp functionValueAccuracy, final int maximalOrder) throws NumberIsTooSmallException
public int getMaximalOrder()
public int getMaxEvaluations()
public int getEvaluations()
public Dfp getAbsoluteAccuracy()
public Dfp getRelativeAccuracy()
public Dfp getFunctionValueAccuracy()
public Dfp solve(final int maxEval, final UnivariateDfpFunction f, final Dfp min, final Dfp max, final AllowedSolution allowedSolution) throws NullArgumentException, NoBracketingException
public Dfp solve(final int maxEval, final UnivariateDfpFunction f, final Dfp min, final Dfp max, final Dfp startValue, final AllowedSolution allowedSolution) throws NullArgumentException, NoBracketingException
private Dfp guessX(final Dfp targetY, final Dfp[] x, final Dfp[] y, final int start, final int end)
