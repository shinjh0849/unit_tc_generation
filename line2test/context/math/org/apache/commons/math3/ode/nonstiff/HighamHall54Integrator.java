public HighamHall54Integrator(final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance)
public HighamHall54Integrator(final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance)
public int getOrder()
protected double estimateError(final double[][] yDotK, final double[] y0, final double[] y1, final double h)
String METHOD_NAME=Optional["Higham-Hall 5(4)"]
double[] STATIC_C=Optional[{ 2.0 / 9.0, 1.0 / 3.0, 1.0 / 2.0, 3.0 / 5.0, 1.0, 1.0 }]
double[][] STATIC_A=Optional[{ { 2.0 / 9.0 }, { 1.0 / 12.0, 1.0 / 4.0 }, { 1.0 / 8.0, 0.0, 3.0 / 8.0 }, { 91.0 / 500.0, -27.0 / 100.0, 78.0 / 125.0, 8.0 / 125.0 }, { -11.0 / 20.0, 27.0 / 20.0, 12.0 / 5.0, -36.0 / 5.0, 5.0 }, { 1.0 / 12.0, 0.0, 27.0 / 32.0, -4.0 / 3.0, 125.0 / 96.0, 5.0 / 48.0 } }]
double[] STATIC_B=Optional[{ 1.0 / 12.0, 0.0, 27.0 / 32.0, -4.0 / 3.0, 125.0 / 96.0, 5.0 / 48.0, 0.0 }]
double[] STATIC_E=Optional[{ -1.0 / 20.0, 0.0, 81.0 / 160.0, -6.0 / 5.0, 25.0 / 32.0, 1.0 / 16.0, -1.0 / 10.0 }]
