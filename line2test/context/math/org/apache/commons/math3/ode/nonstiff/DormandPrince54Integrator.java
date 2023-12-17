public DormandPrince54Integrator(final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance)
public DormandPrince54Integrator(final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance)
public int getOrder()
protected double estimateError(final double[][] yDotK, final double[] y0, final double[] y1, final double h)
String METHOD_NAME=Optional["Dormand-Prince 5(4)"]
double[] STATIC_C=Optional[{ 1.0 / 5.0, 3.0 / 10.0, 4.0 / 5.0, 8.0 / 9.0, 1.0, 1.0 }]
double[][] STATIC_A=Optional[{ { 1.0 / 5.0 }, { 3.0 / 40.0, 9.0 / 40.0 }, { 44.0 / 45.0, -56.0 / 15.0, 32.0 / 9.0 }, { 19372.0 / 6561.0, -25360.0 / 2187.0, 64448.0 / 6561.0, -212.0 / 729.0 }, { 9017.0 / 3168.0, -355.0 / 33.0, 46732.0 / 5247.0, 49.0 / 176.0, -5103.0 / 18656.0 }, { 35.0 / 384.0, 0.0, 500.0 / 1113.0, 125.0 / 192.0, -2187.0 / 6784.0, 11.0 / 84.0 } }]
double[] STATIC_B=Optional[{ 35.0 / 384.0, 0.0, 500.0 / 1113.0, 125.0 / 192.0, -2187.0 / 6784.0, 11.0 / 84.0, 0.0 }]
double E1=Optional[71.0 / 57600.0]
double E3=Optional[-71.0 / 16695.0]
double E4=Optional[71.0 / 1920.0]
double E5=Optional[-17253.0 / 339200.0]
double E6=Optional[22.0 / 525.0]
double E7=Optional[-1.0 / 40.0]
