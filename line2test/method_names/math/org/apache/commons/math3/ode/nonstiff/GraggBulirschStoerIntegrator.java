public GraggBulirschStoerIntegrator(final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance)
public GraggBulirschStoerIntegrator(final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance)
public void setStabilityCheck(final boolean performStabilityCheck, final int maxNumIter, final int maxNumChecks, final double stepsizeReductionFactor)
public void setControlFactors(final double control1, final double control2, final double control3, final double control4)
public void setOrderControl(final int maximalOrder, final double control1, final double control2)
public void addStepHandler(final StepHandler handler)
public void addEventHandler(final EventHandler function, final double maxCheckInterval, final double convergence, final int maxIterationCount, final UnivariateSolver solver)
private void initializeArrays()
public void setInterpolationControl(final boolean useInterpolationErrorForControl, final int mudifControlParameter)
private void rescale(final double[] y1, final double[] y2, final double[] scale)
private boolean tryStep(final double t0, final double[] y0, final double step, final int k, final double[] scale, final double[][] f, final double[] yMiddle, final double[] yEnd, final double[] yTmp) throws MaxCountExceededException, DimensionMismatchException
private void extrapolate(final int offset, final int k, final double[][] diag, final double[] last)
public void integrate(final ExpandableStatefulODE equations, final double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
