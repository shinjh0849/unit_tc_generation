public GraggBulirschStoerStepInterpolator()
public GraggBulirschStoerStepInterpolator(final double[] y, final double[] y0Dot, final double[] y1, final double[] y1Dot, final double[][] yMidDots, final boolean forward, final EquationsMapper primaryMapper, final EquationsMapper[] secondaryMappers)
public GraggBulirschStoerStepInterpolator(final GraggBulirschStoerStepInterpolator interpolator)
private void resetTables(final int maxDegree)
protected StepInterpolator doCopy()
public void computeCoefficients(final int mu, final double h)
public double estimateError(final double[] scale)
protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH)
public void writeExternal(final ObjectOutput out) throws IOException
public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[20110928L]
double[] y0Dot
double[] y1
double[] y1Dot
double[][] yMidDots
double[][] polynomials
double[] errfac
int currentDegree
