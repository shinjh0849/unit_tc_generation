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
int NUM_COEFF=Optional[16]
double[][] AINV=Optional[{ { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { -3, 3, 0, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 2, -2, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, -3, 3, 0, 0, -2, -1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 0, 0, 1, 1, 0, 0 }, { -3, 0, 3, 0, 0, 0, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, -3, 0, 3, 0, 0, 0, 0, 0, -2, 0, -1, 0 }, { 9, -9, -9, 9, 6, 3, -6, -3, 6, -6, 3, -3, 4, 2, 2, 1 }, { -6, 6, 6, -6, -3, -3, 3, 3, -4, 4, -2, 2, -2, -2, -1, -1 }, { 2, 0, -2, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, { -6, 6, 6, -6, -4, -2, 4, 2, -3, 3, -3, 3, -2, -1, -2, -1 }, { 4, -4, -4, 4, 2, 2, -2, -2, 2, -2, 2, -2, 1, 1, 1, 1 } }]
double[] xval
double[] yval
BicubicSplineFunction[][] splines
BivariateFunction[][][] partialDerivatives=Optional[null]
short N=Optional[4]
double[][] a
BivariateFunction partialDerivativeX
BivariateFunction partialDerivativeY
BivariateFunction partialDerivativeXX
BivariateFunction partialDerivativeYY
BivariateFunction partialDerivativeXY
