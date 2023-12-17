public TestProblem2() { [EOL]     super(); [EOL]     double[] y0 = { 0.0 }; [EOL]     setInitialConditions(0.0, y0); [EOL]     setFinalConditions(1.0); [EOL]     double[] errorScale = { 1.0 }; [EOL]     setErrorScale(errorScale); [EOL]     y = new double[y0.length]; [EOL] } <line_num>: 46,54
public TestProblem2(TestProblem2 problem) { [EOL]     super(problem); [EOL]     y = problem.y.clone(); [EOL] } <line_num>: 60,63
@Override [EOL] public TestProblem2 copy() { [EOL]     return new TestProblem2(this); [EOL] } <line_num>: 66,69
@Override [EOL] public void doComputeDerivatives(double t, double[] y, double[] yDot) { [EOL]     for (int i = 0; i < n; ++i) yDot[i] = t * (t * t - y[i]); [EOL] } <line_num>: 71,78
@Override [EOL] public double[] computeTheoreticalState(double t) { [EOL]     double t2 = t * t; [EOL]     double c = t2 + 2 * (FastMath.exp(-0.5 * t2) - 1); [EOL]     for (int i = 0; i < n; ++i) { [EOL]         y[i] = c; [EOL]     } [EOL]     return y; [EOL] } <line_num>: 80,88
