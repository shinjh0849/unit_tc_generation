public OrderedTuple(final double... components)
private void encode(final int minOffset)
public int compareTo(final OrderedTuple ot)
public boolean equals(final Object other)
public int hashCode()
public double[] getComponents()
private static long sign(final long bits)
private static int exponent(final long bits)
private static long mantissa(final long bits)
private static int computeMSB(final long l)
private static int computeLSB(final long l)
private int getBit(final int i, final int k)
long SIGN_MASK=Optional[0x8000000000000000L]
long EXPONENT_MASK=Optional[0x7ff0000000000000L]
long MANTISSA_MASK=Optional[0x000fffffffffffffL]
long IMPLICIT_ONE=Optional[0x0010000000000000L]
double[] components
int offset
int lsb
long[] encoding
boolean posInf
boolean negInf
boolean nan
