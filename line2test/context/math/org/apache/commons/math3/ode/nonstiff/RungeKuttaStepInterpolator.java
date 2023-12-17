protected RungeKuttaStepInterpolator()
public RungeKuttaStepInterpolator(final RungeKuttaStepInterpolator interpolator)
public void reinitialize(final AbstractIntegrator rkIntegrator, final double[] y, final double[][] yDotArray, final boolean forward, final EquationsMapper primaryMapper, final EquationsMapper[] secondaryMappers)
public void shift()
public void writeExternal(final ObjectOutput out) throws IOException
public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException
double[] previousState
double[][] yDotK
AbstractIntegrator integrator
