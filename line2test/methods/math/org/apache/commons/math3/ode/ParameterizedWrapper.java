public ParameterizedWrapper(final FirstOrderDifferentialEquations ode) { [EOL]     this.fode = ode; [EOL] } <line_num>: 39,41
public int getDimension() { [EOL]     return fode.getDimension(); [EOL] } <line_num>: 46,48
public void computeDerivatives(double t, double[] y, double[] yDot) throws MaxCountExceededException, DimensionMismatchException { [EOL]     fode.computeDerivatives(t, y, yDot); [EOL] } <line_num>: 57,60
public Collection<String> getParametersNames() { [EOL]     return new ArrayList<String>(); [EOL] } <line_num>: 63,65
public boolean isSupported(String name) { [EOL]     return false; [EOL] } <line_num>: 68,70
public double getParameter(String name) throws UnknownParameterException { [EOL]     if (!isSupported(name)) { [EOL]         throw new UnknownParameterException(name); [EOL]     } [EOL]     return Double.NaN; [EOL] } <line_num>: 73,79
public void setParameter(String name, double value) { [EOL] } <line_num>: 82,83
