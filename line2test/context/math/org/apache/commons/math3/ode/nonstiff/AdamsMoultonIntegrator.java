public AdamsMoultonIntegrator(final int nSteps, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) throws NumberIsTooSmallException
public AdamsMoultonIntegrator(final int nSteps, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) throws IllegalArgumentException
public Corrector(final double[] previous, final double[] scaled, final double[] state)
public void integrate(final ExpandableStatefulODE equations, final double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn)
public void visit(int row, int column, double value)
public double end()
String METHOD_NAME=Optional["Adams-Moulton"]
