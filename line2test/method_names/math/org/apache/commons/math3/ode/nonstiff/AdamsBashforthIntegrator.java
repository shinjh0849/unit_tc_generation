public AdamsBashforthIntegrator(final int nSteps, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) throws NumberIsTooSmallException
public AdamsBashforthIntegrator(final int nSteps, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) throws IllegalArgumentException
public void integrate(final ExpandableStatefulODE equations, final double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
