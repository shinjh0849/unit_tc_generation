public TestProblem4() { [EOL]     super(); [EOL]     a = 1.2; [EOL]     double[] y0 = { FastMath.sin(a), FastMath.cos(a) }; [EOL]     setInitialConditions(0.0, y0); [EOL]     setFinalConditions(15); [EOL]     double[] errorScale = { 1.0, 0.0 }; [EOL]     setErrorScale(errorScale); [EOL]     y = new double[y0.length]; [EOL] } <line_num>: 48,57
public TestProblem4(TestProblem4 problem) { [EOL]     super(problem); [EOL]     a = problem.a; [EOL]     y = problem.y.clone(); [EOL] } <line_num>: 63,67
public Bounce() { [EOL]     sign = +1; [EOL] } <line_num>: 114,116
public Stop() { [EOL] } <line_num>: 140,141
@Override [EOL] public TestProblem4 copy() { [EOL]     return new TestProblem4(this); [EOL] } <line_num>: 70,73
@Override [EOL] public EventHandler[] getEventsHandlers() { [EOL]     return new EventHandler[] { new Bounce(), new Stop() }; [EOL] } <line_num>: 75,78
@Override [EOL] public double[] getTheoreticalEventsTimes() { [EOL]     return new double[] { 1 * FastMath.PI - a, 2 * FastMath.PI - a, 3 * FastMath.PI - a, 4 * FastMath.PI - a, 12.0 }; [EOL] } <line_num>: 84,93
@Override [EOL] public void doComputeDerivatives(double t, double[] y, double[] yDot) { [EOL]     yDot[0] = y[1]; [EOL]     yDot[1] = -y[0]; [EOL] } <line_num>: 95,99
@Override [EOL] public double[] computeTheoreticalState(double t) { [EOL]     double sin = FastMath.sin(t + a); [EOL]     double cos = FastMath.cos(t + a); [EOL]     y[0] = FastMath.abs(sin); [EOL]     y[1] = (sin >= 0) ? cos : -cos; [EOL]     return y; [EOL] } <line_num>: 101,108
public void init(double t0, double[] y0, double t) { [EOL] } <line_num>: 118,119
public double g(double t, double[] y) { [EOL]     return sign * y[0]; [EOL] } <line_num>: 121,123
public Action eventOccurred(double t, double[] y, boolean increasing) { [EOL]     sign = -sign; [EOL]     return Action.RESET_STATE; [EOL] } <line_num>: 125,129
public void resetState(double t, double[] y) { [EOL]     y[0] = -y[0]; [EOL]     y[1] = -y[1]; [EOL] } <line_num>: 131,134
public void init(double t0, double[] y0, double t) { [EOL] } <line_num>: 143,144
public double g(double t, double[] y) { [EOL]     return t - 12.0; [EOL] } <line_num>: 146,148
public Action eventOccurred(double t, double[] y, boolean increasing) { [EOL]     return Action.STOP; [EOL] } <line_num>: 150,152
public void resetState(double t, double[] y) { [EOL] } <line_num>: 154,155
