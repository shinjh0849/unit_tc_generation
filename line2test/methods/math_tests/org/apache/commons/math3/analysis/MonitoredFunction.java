public MonitoredFunction(UnivariateFunction f) { [EOL]     callsCount = 0; [EOL]     this.f = f; [EOL] } <line_num>: 26,29
public void setCallsCount(int callsCount) { [EOL]     this.callsCount = callsCount; [EOL] } <line_num>: 31,33
public int getCallsCount() { [EOL]     return callsCount; [EOL] } <line_num>: 35,37
public double value(double x) { [EOL]     ++callsCount; [EOL]     return f.value(x); [EOL] } <line_num>: 39,42
