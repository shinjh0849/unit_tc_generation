public Complex(double real)
public Complex(double real, double imaginary)
public double abs()
public Complex add(Complex addend) throws NullArgumentException
public Complex add(double addend)
public Complex conjugate()
public Complex divide(Complex divisor) throws NullArgumentException
public Complex divide(double divisor)
public Complex reciprocal()
public boolean equals(Object other)
public int hashCode()
public double getImaginary()
public double getReal()
public boolean isNaN()
public boolean isInfinite()
public Complex multiply(Complex factor) throws NullArgumentException
public Complex multiply(final int factor)
public Complex multiply(double factor)
public Complex negate()
public Complex subtract(Complex subtrahend) throws NullArgumentException
public Complex subtract(double subtrahend)
public Complex acos()
public Complex asin()
public Complex atan()
public Complex cos()
public Complex cosh()
public Complex exp()
public Complex log()
public Complex pow(Complex x) throws NullArgumentException
public Complex pow(double x)
public Complex sin()
public Complex sinh()
public Complex sqrt()
public Complex sqrt1z()
public Complex tan()
public Complex tanh()
public double getArgument()
public List<Complex> nthRoot(int n) throws NotPositiveException
protected Complex createComplex(double realPart, double imaginaryPart)
public static Complex valueOf(double realPart, double imaginaryPart)
public static Complex valueOf(double realPart)
protected final Object readResolve()
public ComplexField getField()
public String toString()
Complex I=Optional[new Complex(0.0, 1.0)]
Complex NaN=Optional[new Complex(Double.NaN, Double.NaN)]
Complex INF=Optional[new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)]
Complex ONE=Optional[new Complex(1.0, 0.0)]
Complex ZERO=Optional[new Complex(0.0, 0.0)]
long serialVersionUID=Optional[-6195664516687396620L]
double imaginary
double real
boolean isNaN
boolean isInfinite
