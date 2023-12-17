public Fraction(double value) throws FractionConversionException
public Fraction(double value, double epsilon, int maxIterations) throws FractionConversionException
public Fraction(double value, int maxDenominator) throws FractionConversionException
private Fraction(double value, double epsilon, int maxDenominator, int maxIterations) throws FractionConversionException
public Fraction(int num)
public Fraction(int num, int den)
public Fraction abs()
public int compareTo(Fraction object)
public double doubleValue()
public boolean equals(Object other)
public float floatValue()
public int getDenominator()
public int getNumerator()
public int hashCode()
public int intValue()
public long longValue()
public Fraction negate()
public Fraction reciprocal()
public Fraction add(Fraction fraction)
public Fraction add(final int i)
public Fraction subtract(Fraction fraction)
public Fraction subtract(final int i)
private Fraction addSub(Fraction fraction, boolean isAdd)
public Fraction multiply(Fraction fraction)
public Fraction multiply(final int i)
public Fraction divide(Fraction fraction)
public Fraction divide(final int i)
public double percentageValue()
public static Fraction getReducedFraction(int numerator, int denominator)
public String toString()
public FractionField getField()
Fraction TWO=Optional[new Fraction(2, 1)]
Fraction ONE=Optional[new Fraction(1, 1)]
Fraction ZERO=Optional[new Fraction(0, 1)]
Fraction FOUR_FIFTHS=Optional[new Fraction(4, 5)]
Fraction ONE_FIFTH=Optional[new Fraction(1, 5)]
Fraction ONE_HALF=Optional[new Fraction(1, 2)]
Fraction ONE_QUARTER=Optional[new Fraction(1, 4)]
Fraction ONE_THIRD=Optional[new Fraction(1, 3)]
Fraction THREE_FIFTHS=Optional[new Fraction(3, 5)]
Fraction THREE_QUARTERS=Optional[new Fraction(3, 4)]
Fraction TWO_FIFTHS=Optional[new Fraction(2, 5)]
Fraction TWO_QUARTERS=Optional[new Fraction(2, 4)]
Fraction TWO_THIRDS=Optional[new Fraction(2, 3)]
Fraction MINUS_ONE=Optional[new Fraction(-1, 1)]
long serialVersionUID=Optional[3698073679419233275L]
double DEFAULT_EPSILON=Optional[1e-5]
int denominator
int numerator
