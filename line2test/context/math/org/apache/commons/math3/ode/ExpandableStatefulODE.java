public ExpandableStatefulODE(final FirstOrderDifferentialEquations primary)
public SecondaryComponent(final SecondaryEquations equation, final int firstIndex)
public FirstOrderDifferentialEquations getPrimary()
public int getTotalDimension()
public void computeDerivatives(final double t, final double[] y, final double[] yDot) throws MaxCountExceededException, DimensionMismatchException
public int addSecondaryEquations(final SecondaryEquations secondary)
public EquationsMapper getPrimaryMapper()
public EquationsMapper[] getSecondaryMappers()
public void setTime(final double time)
public double getTime()
public void setPrimaryState(final double[] primaryState) throws DimensionMismatchException
public double[] getPrimaryState()
public double[] getPrimaryStateDot()
public void setSecondaryState(final int index, final double[] secondaryState) throws DimensionMismatchException
public double[] getSecondaryState(final int index)
public double[] getSecondaryStateDot(final int index)
public void setCompleteState(final double[] completeState) throws DimensionMismatchException
public double[] getCompleteState() throws DimensionMismatchException
FirstOrderDifferentialEquations primary
EquationsMapper primaryMapper
double time
double[] primaryState
double[] primaryStateDot
List<SecondaryComponent> components
