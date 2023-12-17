protected TestProblemAbstract() { [EOL]     n = 0; [EOL]     calls = 0; [EOL]     t0 = 0; [EOL]     y0 = null; [EOL]     t1 = 0; [EOL]     errorScale = null; [EOL] } <line_num>: 51,58
protected TestProblemAbstract(TestProblemAbstract problem) { [EOL]     n = problem.n; [EOL]     calls = problem.calls; [EOL]     t0 = problem.t0; [EOL]     if (problem.y0 == null) { [EOL]         y0 = null; [EOL]     } else { [EOL]         y0 = problem.y0.clone(); [EOL]     } [EOL]     if (problem.errorScale == null) { [EOL]         errorScale = null; [EOL]     } else { [EOL]         errorScale = problem.errorScale.clone(); [EOL]     } [EOL]     t1 = problem.t1; [EOL] } <line_num>: 64,79
public abstract TestProblemAbstract copy(); <line_num>: 85,85
protected void setInitialConditions(double t0, double[] y0) { [EOL]     calls = 0; [EOL]     n = y0.length; [EOL]     this.t0 = t0; [EOL]     this.y0 = y0.clone(); [EOL] } <line_num>: 92,97
protected void setFinalConditions(double t1) { [EOL]     this.t1 = t1; [EOL] } <line_num>: 103,105
protected void setErrorScale(double[] errorScale) { [EOL]     this.errorScale = errorScale.clone(); [EOL] } <line_num>: 111,113
public int getDimension() { [EOL]     return n; [EOL] } <line_num>: 115,117
public double getInitialTime() { [EOL]     return t0; [EOL] } <line_num>: 123,125
public double[] getInitialState() { [EOL]     return y0; [EOL] } <line_num>: 131,133
public double getFinalTime() { [EOL]     return t1; [EOL] } <line_num>: 139,141
public double[] getErrorScale() { [EOL]     return errorScale; [EOL] } <line_num>: 147,149
public EventHandler[] getEventsHandlers() { [EOL]     return new EventHandler[0]; [EOL] } <line_num>: 154,156
public double[] getTheoreticalEventsTimes() { [EOL]     return new double[0]; [EOL] } <line_num>: 162,164
public int getCalls() { [EOL]     return calls; [EOL] } <line_num>: 170,172
public void computeDerivatives(double t, double[] y, double[] yDot) { [EOL]     ++calls; [EOL]     doComputeDerivatives(t, y, yDot); [EOL] } <line_num>: 174,177
abstract public void doComputeDerivatives(double t, double[] y, double[] yDot); <line_num>: 179,179
abstract public double[] computeTheoreticalState(double t); <line_num>: 186,186
