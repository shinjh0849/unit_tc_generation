public EventState(final EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount, final UnivariateSolver solver)
public LocalMaxCountExceededException(final MaxCountExceededException exception)
public EventHandler getEventHandler()
public void setExpandable(final ExpandableStatefulODE expandable)
public double getMaxCheckInterval()
public double getConvergence()
public int getMaxIterationCount()
public void reinitializeBegin(final StepInterpolator interpolator) throws MaxCountExceededException
private double[] getCompleteState(final StepInterpolator interpolator)
public double value(final double t) throws LocalMaxCountExceededException
public boolean evaluateStep(final StepInterpolator interpolator) throws MaxCountExceededException, NoBracketingException
public double getEventTime()
public void stepAccepted(final double t, final double[] y)
public boolean stop()
public boolean reset(final double t, final double[] y)
public MaxCountExceededException getException()
