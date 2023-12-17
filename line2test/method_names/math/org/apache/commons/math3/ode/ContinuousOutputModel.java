public ContinuousOutputModel()
public void append(final ContinuousOutputModel model) throws MathIllegalArgumentException, MaxCountExceededException
public void init(double t0, double[] y0, double t)
public void handleStep(final StepInterpolator interpolator, final boolean isLast) throws MaxCountExceededException
public double getInitialTime()
public double getFinalTime()
public double getInterpolatedTime()
public void setInterpolatedTime(final double time)
public double[] getInterpolatedState() throws MaxCountExceededException
public double[] getInterpolatedSecondaryState(final int secondaryStateIndex) throws MaxCountExceededException
private int locatePoint(final double time, final StepInterpolator interval)
