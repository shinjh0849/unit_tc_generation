protected Dfp(final DfpField field)
protected Dfp(final DfpField field, byte x)
protected Dfp(final DfpField field, int x)
protected Dfp(final DfpField field, long x)
protected Dfp(final DfpField field, double x)
public Dfp(final Dfp d)
protected Dfp(final DfpField field, final String s)
protected Dfp(final DfpField field, final byte sign, final byte nans)
public Dfp newInstance()
public Dfp newInstance(final byte x)
public Dfp newInstance(final int x)
public Dfp newInstance(final long x)
public Dfp newInstance(final double x)
public Dfp newInstance(final Dfp d)
public Dfp newInstance(final String s)
public Dfp newInstance(final byte sig, final byte code)
public DfpField getField()
public int getRadixDigits()
public Dfp getZero()
public Dfp getOne()
public Dfp getTwo()
protected void shiftLeft()
protected void shiftRight()
protected int align(int e)
public boolean lessThan(final Dfp x)
public boolean greaterThan(final Dfp x)
public boolean negativeOrNull()
public boolean strictlyNegative()
public boolean positiveOrNull()
public boolean strictlyPositive()
public Dfp abs()
public boolean isInfinite()
public boolean isNaN()
public boolean isZero()
public boolean equals(final Object other)
public int hashCode()
public boolean unequal(final Dfp x)
private static int compare(final Dfp a, final Dfp b)
public Dfp rint()
public Dfp floor()
public Dfp ceil()
public Dfp remainder(final Dfp d)
protected Dfp trunc(final DfpField.RoundingMode rmode)
public int intValue()
public int log10K()
public Dfp power10K(final int e)
public int intLog10()
public Dfp power10(final int e)
protected int complement(int extra)
public Dfp add(final Dfp x)
public Dfp negate()
public Dfp subtract(final Dfp x)
protected int round(int n)
public Dfp multiply(final Dfp x)
public Dfp multiply(final int x)
private Dfp multiplyFast(final int x)
public Dfp divide(Dfp divisor)
public Dfp divide(int divisor)
public Dfp reciprocal()
public Dfp sqrt()
public String toString()
protected String dfp2sci()
protected String dfp2string()
public Dfp dotrap(int type, String what, Dfp oper, Dfp result)
protected Dfp trap(int type, String what, Dfp oper, Dfp def, Dfp result)
public int classify()
public static Dfp copysign(final Dfp x, final Dfp y)
public Dfp nextAfter(final Dfp x)
public double toDouble()
public double[] toSplitDouble()
public double getReal()
public Dfp add(final double a)
public Dfp subtract(final double a)
public Dfp multiply(final double a)
public Dfp divide(final double a)
public Dfp remainder(final double a)
public long round()
public Dfp signum()
public Dfp copySign(final Dfp s)
public Dfp copySign(final double s)
public Dfp scalb(final int n)
public Dfp hypot(final Dfp y)
public Dfp cbrt()
public Dfp rootN(final int n)
public Dfp pow(final double p)
public Dfp pow(final int n)
public Dfp pow(final Dfp e)
public Dfp exp()
public Dfp expm1()
public Dfp log()
public Dfp log1p()
public int log10()
public Dfp cos()
public Dfp sin()
public Dfp tan()
public Dfp acos()
public Dfp asin()
public Dfp atan()
public Dfp atan2(final Dfp x) throws DimensionMismatchException
public Dfp cosh()
public Dfp sinh()
public Dfp tanh()
public Dfp acosh()
public Dfp asinh()
public Dfp atanh()
public Dfp linearCombination(final Dfp[] a, final Dfp[] b) throws DimensionMismatchException
public Dfp linearCombination(final double[] a, final Dfp[] b) throws DimensionMismatchException
public Dfp linearCombination(final Dfp a1, final Dfp b1, final Dfp a2, final Dfp b2)
public Dfp linearCombination(final double a1, final Dfp b1, final double a2, final Dfp b2)
public Dfp linearCombination(final Dfp a1, final Dfp b1, final Dfp a2, final Dfp b2, final Dfp a3, final Dfp b3)
public Dfp linearCombination(final double a1, final Dfp b1, final double a2, final Dfp b2, final double a3, final Dfp b3)
public Dfp linearCombination(final Dfp a1, final Dfp b1, final Dfp a2, final Dfp b2, final Dfp a3, final Dfp b3, final Dfp a4, final Dfp b4)
public Dfp linearCombination(final double a1, final Dfp b1, final double a2, final Dfp b2, final double a3, final Dfp b3, final double a4, final Dfp b4)
int RADIX=Optional[10000]
int MIN_EXP=Optional[-32767]
int MAX_EXP=Optional[32768]
int ERR_SCALE=Optional[32760]
byte FINITE=Optional[0]
byte INFINITE=Optional[1]
byte SNAN=Optional[2]
byte QNAN=Optional[3]
String NAN_STRING=Optional["NaN"]
String POS_INFINITY_STRING=Optional["Infinity"]
String NEG_INFINITY_STRING=Optional["-Infinity"]
String ADD_TRAP=Optional["add"]
String MULTIPLY_TRAP=Optional["multiply"]
String DIVIDE_TRAP=Optional["divide"]
String SQRT_TRAP=Optional["sqrt"]
String ALIGN_TRAP=Optional["align"]
String TRUNC_TRAP=Optional["trunc"]
String NEXT_AFTER_TRAP=Optional["nextAfter"]
String LESS_THAN_TRAP=Optional["lessThan"]
String GREATER_THAN_TRAP=Optional["greaterThan"]
String NEW_INSTANCE_TRAP=Optional["newInstance"]
int[] mant
byte sign
int exp
byte nans
DfpField field
