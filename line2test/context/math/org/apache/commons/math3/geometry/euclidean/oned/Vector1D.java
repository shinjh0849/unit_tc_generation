public Vector1D(double x)
public Vector1D(double a, Vector1D u)
public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2)
public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2, double a3, Vector1D u3)
public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2, double a3, Vector1D u3, double a4, Vector1D u4)
public double getX()
public Space getSpace()
public Vector1D getZero()
public double getNorm1()
public double getNorm()
public double getNormSq()
public double getNormInf()
public Vector1D add(Vector<Euclidean1D> v)
public Vector1D add(double factor, Vector<Euclidean1D> v)
public Vector1D subtract(Vector<Euclidean1D> p)
public Vector1D subtract(double factor, Vector<Euclidean1D> v)
public Vector1D normalize() throws MathArithmeticException
public Vector1D negate()
public Vector1D scalarMultiply(double a)
public boolean isNaN()
public boolean isInfinite()
public double distance1(Vector<Euclidean1D> p)
public double distance(Vector<Euclidean1D> p)
public double distanceInf(Vector<Euclidean1D> p)
public double distanceSq(Vector<Euclidean1D> p)
public double dotProduct(final Vector<Euclidean1D> v)
public static double distance(Vector1D p1, Vector1D p2)
public static double distanceInf(Vector1D p1, Vector1D p2)
public static double distanceSq(Vector1D p1, Vector1D p2)
public boolean equals(Object other)
public int hashCode()
public String toString()
public String toString(final NumberFormat format)
Vector1D ZERO=Optional[new Vector1D(0.0)]
Vector1D ONE=Optional[new Vector1D(1.0)]
Vector1D NaN=Optional[new Vector1D(Double.NaN)]
Vector1D POSITIVE_INFINITY=Optional[new Vector1D(Double.POSITIVE_INFINITY)]
Vector1D NEGATIVE_INFINITY=Optional[new Vector1D(Double.NEGATIVE_INFINITY)]
long serialVersionUID=Optional[7556674948671647925L]
double x
