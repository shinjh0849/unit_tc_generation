public TestProblemHandler(TestProblemAbstract problem, ODEIntegrator integrator)
public void init(double t0, double[] y0, double t)
public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException
public double getMaximalValueError()
public double getMaximalTimeError()
public double getLastError()
public double getLastTime()
TestProblemAbstract problem
double maxValueError
double maxTimeError
double lastError
double lastTime
ODEIntegrator integrator
double expectedStepStart
