public Quaternion(final double a, final double b, final double c, final double d)
public Quaternion(final double scalar, final double[] v) throws DimensionMismatchException
public Quaternion(final double[] v)
public Quaternion getConjugate()
public static Quaternion multiply(final Quaternion q1, final Quaternion q2)
public Quaternion multiply(final Quaternion q)
public static Quaternion add(final Quaternion q1, final Quaternion q2)
public Quaternion add(final Quaternion q)
public static Quaternion subtract(final Quaternion q1, final Quaternion q2)
public Quaternion subtract(final Quaternion q)
public static double dotProduct(final Quaternion q1, final Quaternion q2)
public double dotProduct(final Quaternion q)
public double getNorm()
public Quaternion normalize()
public boolean equals(Object other)
public int hashCode()
public boolean equals(final Quaternion q, final double eps)
public boolean isUnitQuaternion(double eps)
public boolean isPureQuaternion(double eps)
public Quaternion getPositivePolarForm()
public Quaternion getInverse()
public double getQ0()
public double getQ1()
public double getQ2()
public double getQ3()
public double getScalarPart()
public double[] getVectorPart()
public Quaternion multiply(final double alpha)
public String toString()
Quaternion IDENTITY=Optional[new Quaternion(1, 0, 0, 0)]
Quaternion ZERO=Optional[new Quaternion(0, 0, 0, 0)]
Quaternion I=Optional[new Quaternion(0, 1, 0, 0)]
Quaternion J=Optional[new Quaternion(0, 0, 1, 0)]
Quaternion K=Optional[new Quaternion(0, 0, 0, 1)]
long serialVersionUID=Optional[20092012L]
double q0
double q1
double q2
double q3
