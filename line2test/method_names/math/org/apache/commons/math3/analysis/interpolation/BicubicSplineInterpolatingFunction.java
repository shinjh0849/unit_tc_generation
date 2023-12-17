public BicubicSplineInterpolatingFunction(double[] x, double[] y, double[][] f, double[][] dFdX, double[][] dFdY, double[][] d2FdXdY) throws DimensionMismatchException, NoDataException, NonMonotonicSequenceException
public BicubicSplineFunction(double[] a)
public double value(double x, double y) throws OutOfRangeException
public boolean isValidPoint(double x, double y)
public double partialDerivativeX(double x, double y) throws OutOfRangeException
public double partialDerivativeY(double x, double y) throws OutOfRangeException
public double partialDerivativeXX(double x, double y) throws OutOfRangeException
public double partialDerivativeYY(double x, double y) throws OutOfRangeException
public double partialDerivativeXY(double x, double y) throws OutOfRangeException
private double partialDerivative(int which, double x, double y) throws OutOfRangeException
private void computePartialDerivatives()
private int searchIndex(double c, double[] val)
private double[] computeSplineCoefficients(double[] beta)
public double value(double x, double y)
private double apply(double[] pX, double[] pY, double[][] coeff)
public BivariateFunction partialDerivativeX()
public BivariateFunction partialDerivativeY()
public BivariateFunction partialDerivativeXX()
public BivariateFunction partialDerivativeYY()
public BivariateFunction partialDerivativeXY()
public double value(double x, double y)
public double value(double x, double y)
public double value(double x, double y)
public double value(double x, double y)
public double value(double x, double y)
private void computePartialDerivatives()
