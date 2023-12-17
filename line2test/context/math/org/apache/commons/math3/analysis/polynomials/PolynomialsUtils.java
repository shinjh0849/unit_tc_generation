private PolynomialsUtils()
public JacobiKey(final int v, final int w)
public BigFraction[] generate(int k)
public static PolynomialFunction createChebyshevPolynomial(final int degree)
public BigFraction[] generate(int k)
public static PolynomialFunction createHermitePolynomial(final int degree)
public BigFraction[] generate(int k)
public static PolynomialFunction createLaguerrePolynomial(final int degree)
public BigFraction[] generate(int k)
public static PolynomialFunction createLegendrePolynomial(final int degree)
public BigFraction[] generate(int k)
public static PolynomialFunction createJacobiPolynomial(final int degree, final int v, final int w)
public int hashCode()
public boolean equals(final Object key)
public static double[] shift(final double[] coefficients, final double shift)
private static PolynomialFunction buildPolynomial(final int degree, final List<BigFraction> coefficients, final RecurrenceCoefficientsGenerator generator)
private static void computeUpToDegree(final int degree, final int maxDegree, final RecurrenceCoefficientsGenerator generator, final List<BigFraction> coefficients)
 BigFraction[] generate(int k)
List<BigFraction> CHEBYSHEV_COEFFICIENTS
List<BigFraction> HERMITE_COEFFICIENTS
List<BigFraction> LAGUERRE_COEFFICIENTS
List<BigFraction> LEGENDRE_COEFFICIENTS
Map<JacobiKey, List<BigFraction>> JACOBI_COEFFICIENTS
