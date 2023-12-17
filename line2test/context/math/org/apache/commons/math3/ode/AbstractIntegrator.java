public AbstractIntegrator(final String name)
protected AbstractIntegrator()
public String getName()
public void addStepHandler(final StepHandler handler)
public Collection<StepHandler> getStepHandlers()
public void clearStepHandlers()
public void addEventHandler(final EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount)
public void addEventHandler(final EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount, final UnivariateSolver solver)
public Collection<EventHandler> getEventHandlers()
public void clearEventHandlers()
public double getCurrentStepStart()
public double getCurrentSignedStepsize()
public void setMaxEvaluations(int maxEvaluations)
public int getMaxEvaluations()
public int getEvaluations()
protected void initIntegration(final double t0, final double[] y0, final double t)
protected void setEquations(final ExpandableStatefulODE equations)
protected ExpandableStatefulODE getExpandable()
protected Incrementor getEvaluationsCounter()
public double integrate(final FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public abstract void integrate(ExpandableStatefulODE equations, double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
public void computeDerivatives(final double t, final double[] y, final double[] yDot) throws MaxCountExceededException, DimensionMismatchException
protected void setStateInitialized(final boolean stateInitialized)
public int compare(EventState es0, EventState es1)
protected double acceptStep(final AbstractStepInterpolator interpolator, final double[] y, final double[] yDot, final double tEnd) throws MaxCountExceededException, DimensionMismatchException, NoBracketingException
protected void sanityChecks(final ExpandableStatefulODE equations, final double t) throws NumberIsTooSmallException, DimensionMismatchException
Collection<StepHandler> stepHandlers
double stepStart
double stepSize
boolean isLastStep
boolean resetOccurred
Collection<EventState> eventsStates
boolean statesInitialized
String name
Incrementor evaluations
ExpandableStatefulODE expandable
