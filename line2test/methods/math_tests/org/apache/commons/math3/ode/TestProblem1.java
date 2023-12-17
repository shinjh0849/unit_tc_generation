public TestProblem1() { [EOL]     super(); [EOL]     double[] y0 = { 1.0, 0.1 }; [EOL]     setInitialConditions(0.0, y0); [EOL]     setFinalConditions(4.0); [EOL]     double[] errorScale = { 1.0, 1.0 }; [EOL]     setErrorScale(errorScale); [EOL]     y = new double[y0.length]; [EOL] } <line_num>: 45,53
public TestProblem1(TestProblem1 problem) { [EOL]     super(problem); [EOL]     y = problem.y.clone(); [EOL] } <line_num>: 59,62
@Override [EOL] public TestProblem1 copy() { [EOL]     return new TestProblem1(this); [EOL] } <line_num>: 65,68
@Override [EOL] public void doComputeDerivatives(double t, double[] y, double[] yDot) { [EOL]     for (int i = 0; i < n; ++i) yDot[i] = -y[i]; [EOL] } <line_num>: 70,77
@Override [EOL] public double[] computeTheoreticalState(double t) { [EOL]     double c = FastMath.exp(t0 - t); [EOL]     for (int i = 0; i < n; ++i) { [EOL]         y[i] = c * y0[i]; [EOL]     } [EOL]     return y; [EOL] } <line_num>: 79,86
