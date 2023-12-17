public DormandPrince853StepInterpolator()
public DormandPrince853StepInterpolator(final DormandPrince853StepInterpolator interpolator)
protected StepInterpolator doCopy()
public void reinitialize(final AbstractIntegrator integrator, final double[] y, final double[][] yDotK, final boolean forward, final EquationsMapper primaryMapper, final EquationsMapper[] secondaryMappers)
public void storeTime(final double t)
protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) throws MaxCountExceededException
protected void doFinalize() throws MaxCountExceededException
public void writeExternal(final ObjectOutput out) throws IOException
public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException
