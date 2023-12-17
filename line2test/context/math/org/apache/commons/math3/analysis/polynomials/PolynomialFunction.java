public PolynomialFunction(double[] c) throws NullArgumentException, NoDataException
public double value(double x)
public int degree()
public double[] getCoefficients()
protected static double evaluate(double[] coefficients, double argument) throws NullArgumentException, NoDataException
public DerivativeStructure value(final DerivativeStructure t) throws NullArgumentException, NoDataException
public PolynomialFunction add(final PolynomialFunction p)
public PolynomialFunction subtract(final PolynomialFunction p)
public PolynomialFunction negate()
public PolynomialFunction multiply(final PolynomialFunction p)
protected static double[] differentiate(double[] coefficients) throws NullArgumentException, NoDataException
public PolynomialFunction polynomialDerivative()
public UnivariateFunction derivative()
public String toString()
private static String toString(double coeff)
public int hashCode()
public boolean equals(Object obj)
public double[] gradient(double x, double... parameters)
public double value(final double x, final double... parameters) throws NoDataException
long serialVersionUID=Optional[-7726511984200295583L]
double[] coefficients
