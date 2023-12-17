public AdaptiveStepsizeIntegrator(final String name, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance)
public AdaptiveStepsizeIntegrator(final String name, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance)
public void setStepSizeControl(final double minimalStep, final double maximalStep, final double absoluteTolerance, final double relativeTolerance)
public void setStepSizeControl(final double minimalStep, final double maximalStep, final double[] absoluteTolerance, final double[] relativeTolerance)
public void setInitialStepSize(final double initialStepSize)
protected void sanityChecks(final ExpandableStatefulODE equations, final double t) throws DimensionMismatchException, NumberIsTooSmallException
public double initializeStep(final boolean forward, final int order, final double[] scale, final double t0, final double[] y0, final double[] yDot0, final double[] y1, final double[] yDot1) throws MaxCountExceededException, DimensionMismatchException
protected double filterStep(final double h, final boolean forward, final boolean acceptSmall) throws NumberIsTooSmallException
public abstract void integrate(ExpandableStatefulODE equations, double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
public double getCurrentStepStart()
protected void resetInternalState()
public double getMinStep()
public double getMaxStep()
