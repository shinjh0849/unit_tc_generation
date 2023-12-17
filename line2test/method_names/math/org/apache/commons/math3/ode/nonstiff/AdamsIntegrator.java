public AdamsIntegrator(final String name, final int nSteps, final int order, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) throws NumberIsTooSmallException
public AdamsIntegrator(final String name, final int nSteps, final int order, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) throws IllegalArgumentException
public abstract void integrate(final ExpandableStatefulODE equations, final double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
protected Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot)
public Array2DRowRealMatrix updateHighOrderDerivativesPhase1(final Array2DRowRealMatrix highOrder)
public void updateHighOrderDerivativesPhase2(final double[] start, final double[] end, final Array2DRowRealMatrix highOrder)
