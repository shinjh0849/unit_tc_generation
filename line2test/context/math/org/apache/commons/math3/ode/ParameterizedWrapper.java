public ParameterizedWrapper(final FirstOrderDifferentialEquations ode)
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot) throws MaxCountExceededException, DimensionMismatchException
public Collection<String> getParametersNames()
public boolean isSupported(String name)
public double getParameter(String name) throws UnknownParameterException
public void setParameter(String name, double value)
FirstOrderDifferentialEquations fode
