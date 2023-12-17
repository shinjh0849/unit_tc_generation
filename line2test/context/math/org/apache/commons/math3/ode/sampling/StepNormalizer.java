public StepNormalizer(final double h, final FixedStepHandler handler)
public StepNormalizer(final double h, final FixedStepHandler handler, final StepNormalizerMode mode)
public StepNormalizer(final double h, final FixedStepHandler handler, final StepNormalizerBounds bounds)
public StepNormalizer(final double h, final FixedStepHandler handler, final StepNormalizerMode mode, final StepNormalizerBounds bounds)
public void init(double t0, double[] y0, double t)
public void handleStep(final StepInterpolator interpolator, final boolean isLast) throws MaxCountExceededException
private boolean isNextInStep(double nextTime, StepInterpolator interpolator)
private void doNormalizedStep(boolean isLast)
private void storeStep(StepInterpolator interpolator, double t) throws MaxCountExceededException
double h
FixedStepHandler handler
double firstTime
double lastTime
double[] lastState
double[] lastDerivatives
boolean forward
StepNormalizerBounds bounds
StepNormalizerMode mode
