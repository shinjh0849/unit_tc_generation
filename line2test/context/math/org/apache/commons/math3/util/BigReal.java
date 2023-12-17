public BigReal(BigDecimal val)
public BigReal(BigInteger val)
public BigReal(BigInteger unscaledVal, int scale)
public BigReal(BigInteger unscaledVal, int scale, MathContext mc)
public BigReal(BigInteger val, MathContext mc)
public BigReal(char[] in)
public BigReal(char[] in, int offset, int len)
public BigReal(char[] in, int offset, int len, MathContext mc)
public BigReal(char[] in, MathContext mc)
public BigReal(double val)
public BigReal(double val, MathContext mc)
public BigReal(int val)
public BigReal(int val, MathContext mc)
public BigReal(long val)
public BigReal(long val, MathContext mc)
public BigReal(String val)
public BigReal(String val, MathContext mc)
public RoundingMode getRoundingMode()
public void setRoundingMode(RoundingMode roundingMode)
public int getScale()
public void setScale(int scale)
public BigReal add(BigReal a)
public BigReal subtract(BigReal a)
public BigReal negate()
public BigReal divide(BigReal a) throws MathArithmeticException
public BigReal reciprocal() throws MathArithmeticException
public BigReal multiply(BigReal a)
public BigReal multiply(final int n)
public int compareTo(BigReal a)
public double doubleValue()
public BigDecimal bigDecimalValue()
public boolean equals(Object other)
public int hashCode()
public Field<BigReal> getField()
BigReal ZERO=Optional[new BigReal(BigDecimal.ZERO)]
BigReal ONE=Optional[new BigReal(BigDecimal.ONE)]
long serialVersionUID=Optional[4984534880991310382L]
BigDecimal d
RoundingMode roundingMode=Optional[RoundingMode.HALF_UP]
int scale=Optional[64]
