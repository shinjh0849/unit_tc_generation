public ParameterJacobianWrapper(final FirstOrderDifferentialEquations fode, final ParameterizedODE pode, final ParameterConfiguration[] paramsAndSteps)
public Collection<String> getParametersNames()
public boolean isSupported(String name)
public void computeParameterJacobian(double t, double[] y, double[] yDot, String paramName, double[] dFdP) throws DimensionMismatchException, MaxCountExceededException
FirstOrderDifferentialEquations fode
ParameterizedODE pode
Map<String, Double> hParam
