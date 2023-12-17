protected EmbeddedRungeKuttaIntegrator(final String name, final boolean fsal, final double[] c, final double[][] a, final double[] b, final RungeKuttaStepInterpolator prototype, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance)
protected EmbeddedRungeKuttaIntegrator(final String name, final boolean fsal, final double[] c, final double[][] a, final double[] b, final RungeKuttaStepInterpolator prototype, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance)
public abstract int getOrder()
public double getSafety()
public void setSafety(final double safety)
public void integrate(final ExpandableStatefulODE equations, final double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
public double getMinReduction()
public void setMinReduction(final double minReduction)
public double getMaxGrowth()
public void setMaxGrowth(final double maxGrowth)
protected abstract double estimateError(double[][] yDotK, double[] y0, double[] y1, double h)
boolean fsal
double[] c
double[][] a
double[] b
RungeKuttaStepInterpolator prototype
double exp
double safety
double minReduction
double maxGrowth
