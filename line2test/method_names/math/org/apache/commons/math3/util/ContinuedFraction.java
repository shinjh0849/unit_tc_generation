protected ContinuedFraction()
protected abstract double getA(int n, double x)
protected abstract double getB(int n, double x)
public double evaluate(double x) throws ConvergenceException
public double evaluate(double x, double epsilon) throws ConvergenceException
public double evaluate(double x, int maxIterations) throws ConvergenceException, MaxCountExceededException
public double evaluate(double x, double epsilon, int maxIterations) throws ConvergenceException, MaxCountExceededException
