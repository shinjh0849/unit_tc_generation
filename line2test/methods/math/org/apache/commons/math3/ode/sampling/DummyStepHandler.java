private DummyStepHandler() { [EOL] } <line_num>: 43,44
public static DummyStepHandler getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 49,51
public void init(double t0, double[] y0, double t) { [EOL] } <line_num>: 54,55
public void handleStep(final StepInterpolator interpolator, final boolean isLast) { [EOL] } <line_num>: 69,70
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 85,88
