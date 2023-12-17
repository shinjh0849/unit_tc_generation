public NordsieckStepInterpolator()
public NordsieckStepInterpolator(final NordsieckStepInterpolator interpolator)
protected StepInterpolator doCopy()
public void reinitialize(final double[] y, final boolean forward, final EquationsMapper primaryMapper, final EquationsMapper[] secondaryMappers)
public void reinitialize(final double time, final double stepSize, final double[] scaledDerivative, final Array2DRowRealMatrix nordsieckVector)
public void rescale(final double stepSize)
public double[] getInterpolatedStateVariation() throws MaxCountExceededException
protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH)
public void writeExternal(final ObjectOutput out) throws IOException
public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-7179861704951334960L]
double[] stateVariation
double scalingH
double referenceTime
double[] scaled
Array2DRowRealMatrix nordsieck
