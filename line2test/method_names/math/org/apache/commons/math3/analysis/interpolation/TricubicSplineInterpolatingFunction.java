public TricubicSplineInterpolatingFunction(double[] x, double[] y, double[] z, double[][][] f, double[][][] dFdX, double[][][] dFdY, double[][][] dFdZ, double[][][] d2FdXdY, double[][][] d2FdXdZ, double[][][] d2FdYdZ, double[][][] d3FdXdYdZ) throws NoDataException, DimensionMismatchException, NonMonotonicSequenceException
public TricubicSplineFunction(double[] aV)
public double value(double x, double y, double z) throws OutOfRangeException
private int searchIndex(double c, double[] val)
private double[] computeSplineCoefficients(double[] beta)
public double value(double x, double y, double z) throws OutOfRangeException
