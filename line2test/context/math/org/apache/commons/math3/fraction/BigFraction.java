public BigFraction(final BigInteger num)
public BigFraction(BigInteger num, BigInteger den)
public BigFraction(final double value) throws MathIllegalArgumentException
public BigFraction(final double value, final double epsilon, final int maxIterations) throws FractionConversionException
private BigFraction(final double value, final double epsilon, final int maxDenominator, int maxIterations) throws FractionConversionException
public BigFraction(final double value, final int maxDenominator) throws FractionConversionException
public BigFraction(final int num)
public BigFraction(final int num, final int den)
public BigFraction(final long num)
public BigFraction(final long num, final long den)
public static BigFraction getReducedFraction(final int numerator, final int denominator)
public BigFraction abs()
public BigFraction add(final BigInteger bg) throws NullArgumentException
public BigFraction add(final int i)
public BigFraction add(final long l)
public BigFraction add(final BigFraction fraction)
public BigDecimal bigDecimalValue()
public BigDecimal bigDecimalValue(final int roundingMode)
public BigDecimal bigDecimalValue(final int scale, final int roundingMode)
public int compareTo(final BigFraction object)
public BigFraction divide(final BigInteger bg)
public BigFraction divide(final int i)
public BigFraction divide(final long l)
public BigFraction divide(final BigFraction fraction)
public double doubleValue()
public boolean equals(final Object other)
public float floatValue()
public BigInteger getDenominator()
public int getDenominatorAsInt()
public long getDenominatorAsLong()
public BigInteger getNumerator()
public int getNumeratorAsInt()
public long getNumeratorAsLong()
public int hashCode()
public int intValue()
public long longValue()
public BigFraction multiply(final BigInteger bg)
public BigFraction multiply(final int i)
public BigFraction multiply(final long l)
public BigFraction multiply(final BigFraction fraction)
public BigFraction negate()
public double percentageValue()
public BigFraction pow(final int exponent)
public BigFraction pow(final long exponent)
public BigFraction pow(final BigInteger exponent)
public double pow(final double exponent)
public BigFraction reciprocal()
public BigFraction reduce()
public BigFraction subtract(final BigInteger bg)
public BigFraction subtract(final int i)
public BigFraction subtract(final long l)
public BigFraction subtract(final BigFraction fraction)
public String toString()
public BigFractionField getField()
BigFraction TWO=Optional[new BigFraction(2)]
BigFraction ONE=Optional[new BigFraction(1)]
BigFraction ZERO=Optional[new BigFraction(0)]
BigFraction MINUS_ONE=Optional[new BigFraction(-1)]
BigFraction FOUR_FIFTHS=Optional[new BigFraction(4, 5)]
BigFraction ONE_FIFTH=Optional[new BigFraction(1, 5)]
BigFraction ONE_HALF=Optional[new BigFraction(1, 2)]
BigFraction ONE_QUARTER=Optional[new BigFraction(1, 4)]
BigFraction ONE_THIRD=Optional[new BigFraction(1, 3)]
BigFraction THREE_FIFTHS=Optional[new BigFraction(3, 5)]
BigFraction THREE_QUARTERS=Optional[new BigFraction(3, 4)]
BigFraction TWO_FIFTHS=Optional[new BigFraction(2, 5)]
BigFraction TWO_QUARTERS=Optional[new BigFraction(2, 4)]
BigFraction TWO_THIRDS=Optional[new BigFraction(2, 3)]
long serialVersionUID=Optional[-5630213147331578515L]
BigInteger ONE_HUNDRED=Optional[BigInteger.valueOf(100)]
BigInteger numerator
BigInteger denominator
