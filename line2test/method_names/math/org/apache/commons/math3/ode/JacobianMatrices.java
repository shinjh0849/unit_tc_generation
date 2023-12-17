public JacobianMatrices(final FirstOrderDifferentialEquations fode, final double[] hY, final String... parameters) throws DimensionMismatchException
public JacobianMatrices(final MainStateJacobianProvider jode, final String... parameters)
public MainStateJacobianWrapper(final FirstOrderDifferentialEquations ode, final double[] hY) throws DimensionMismatchException
public MismatchedEquations()
public void registerVariationalEquations(final ExpandableStatefulODE expandable) throws DimensionMismatchException, MismatchedEquations
public void addParameterJacobianProvider(final ParameterJacobianProvider provider)
public void setParameterizedODE(final ParameterizedODE parameterizedOde)
public void setParameterStep(final String parameter, final double hP) throws UnknownParameterException
public void setInitialMainStateJacobian(final double[][] dYdY0) throws DimensionMismatchException
public void setInitialParameterJacobian(final String pName, final double[] dYdP) throws UnknownParameterException, DimensionMismatchException
public void getCurrentMainSetJacobian(final double[][] dYdY0)
public void getCurrentParameterJacobian(String pName, final double[] dYdP)
private void checkDimension(final int expected, final Object array) throws DimensionMismatchException
public int getDimension()
public void computeDerivatives(final double t, final double[] y, final double[] yDot, final double[] z, final double[] zDot) throws MaxCountExceededException, DimensionMismatchException
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot) throws MaxCountExceededException, DimensionMismatchException
public void computeMainStateJacobian(double t, double[] y, double[] yDot, double[][] dFdY) throws MaxCountExceededException, DimensionMismatchException
