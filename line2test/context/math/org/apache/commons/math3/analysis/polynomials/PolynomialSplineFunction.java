public PolynomialSplineFunction(double[] knots, PolynomialFunction[] polynomials) throws NullArgumentException, NumberIsTooSmallException, DimensionMismatchException, NonMonotonicSequenceException
public double value(double v)
public UnivariateFunction derivative()
public PolynomialSplineFunction polynomialSplineDerivative()
public DerivativeStructure value(final DerivativeStructure t)
public int getN()
public PolynomialFunction[] getPolynomials()
public double[] getKnots()
public boolean isValidPoint(double x)
double[] knots
PolynomialFunction[] polynomials
int n
