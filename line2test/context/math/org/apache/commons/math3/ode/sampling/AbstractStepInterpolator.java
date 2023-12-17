protected AbstractStepInterpolator()
protected AbstractStepInterpolator(final double[] y, final boolean forward, final EquationsMapper primaryMapper, final EquationsMapper[] secondaryMappers)
protected AbstractStepInterpolator(final AbstractStepInterpolator interpolator)
private void allocateInterpolatedArrays(final int dimension)
protected void reinitialize(final double[] y, final boolean isForward, final EquationsMapper primary, final EquationsMapper[] secondary)
public StepInterpolator copy() throws MaxCountExceededException
protected abstract StepInterpolator doCopy()
public void shift()
public void storeTime(final double t)
public void setSoftPreviousTime(final double softPreviousTime)
public void setSoftCurrentTime(final double softCurrentTime)
public double getGlobalPreviousTime()
public double getGlobalCurrentTime()
public double getPreviousTime()
public double getCurrentTime()
public double getInterpolatedTime()
public void setInterpolatedTime(final double time)
public boolean isForward()
protected abstract void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) throws MaxCountExceededException
private void evaluateCompleteInterpolatedState() throws MaxCountExceededException
public double[] getInterpolatedState() throws MaxCountExceededException
public double[] getInterpolatedDerivatives() throws MaxCountExceededException
public double[] getInterpolatedSecondaryState(final int index) throws MaxCountExceededException
public double[] getInterpolatedSecondaryDerivatives(final int index) throws MaxCountExceededException
public final void finalizeStep() throws MaxCountExceededException
protected void doFinalize() throws MaxCountExceededException
public abstract void writeExternal(ObjectOutput out) throws IOException
public abstract void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
protected void writeBaseExternal(final ObjectOutput out) throws IOException
protected double readBaseExternal(final ObjectInput in) throws IOException, ClassNotFoundException
double h
double[] currentState
double interpolatedTime
double[] interpolatedState
double[] interpolatedDerivatives
double[] interpolatedPrimaryState
double[] interpolatedPrimaryDerivatives
double[][] interpolatedSecondaryState
double[][] interpolatedSecondaryDerivatives
double globalPreviousTime
double globalCurrentTime
double softPreviousTime
double softCurrentTime
boolean finalized
boolean forward
boolean dirtyState
EquationsMapper primaryMapper
EquationsMapper[] secondaryMappers
