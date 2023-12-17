public StepProblem(double rateBefore, double rateAfter, double switchTime) { [EOL]     this.rateAfter = rateAfter; [EOL]     this.switchTime = switchTime; [EOL]     setRate(rateBefore); [EOL] } <line_num>: 27,32
public void computeDerivatives(double t, double[] y, double[] yDot) { [EOL]     yDot[0] = rate; [EOL] } <line_num>: 34,36
public int getDimension() { [EOL]     return 1; [EOL] } <line_num>: 38,40
public void setRate(double rate) { [EOL]     this.rate = rate; [EOL] } <line_num>: 42,44
public void init(double t0, double[] y0, double t) { [EOL] } <line_num>: 46,47
public Action eventOccurred(double t, double[] y, boolean increasing) { [EOL]     setRate(rateAfter); [EOL]     return Action.RESET_DERIVATIVES; [EOL] } <line_num>: 49,52
public double g(double t, double[] y) { [EOL]     return t - switchTime; [EOL] } <line_num>: 54,56
public void resetState(double t, double[] y) { [EOL] } <line_num>: 58,59
