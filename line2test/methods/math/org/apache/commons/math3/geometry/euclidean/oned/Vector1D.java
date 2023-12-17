public Vector1D(double x) { [EOL]     this.x = x; [EOL] } <line_num>: 65,67
public Vector1D(double a, Vector1D u) { [EOL]     this.x = a * u.x; [EOL] } <line_num>: 75,77
public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2) { [EOL]     this.x = a1 * u1.x + a2 * u2.x; [EOL] } <line_num>: 87,89
public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2, double a3, Vector1D u3) { [EOL]     this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x; [EOL] } <line_num>: 101,104
public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2, double a3, Vector1D u3, double a4, Vector1D u4) { [EOL]     this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x + a4 * u4.x; [EOL] } <line_num>: 118,121
public double getX() { [EOL]     return x; [EOL] } <line_num>: 127,129
public Space getSpace() { [EOL]     return Euclidean1D.getInstance(); [EOL] } <line_num>: 132,134
public Vector1D getZero() { [EOL]     return ZERO; [EOL] } <line_num>: 137,139
public double getNorm1() { [EOL]     return FastMath.abs(x); [EOL] } <line_num>: 142,144
public double getNorm() { [EOL]     return FastMath.abs(x); [EOL] } <line_num>: 147,149
public double getNormSq() { [EOL]     return x * x; [EOL] } <line_num>: 152,154
public double getNormInf() { [EOL]     return FastMath.abs(x); [EOL] } <line_num>: 157,159
public Vector1D add(Vector<Euclidean1D> v) { [EOL]     Vector1D v1 = (Vector1D) v; [EOL]     return new Vector1D(x + v1.getX()); [EOL] } <line_num>: 162,165
public Vector1D add(double factor, Vector<Euclidean1D> v) { [EOL]     Vector1D v1 = (Vector1D) v; [EOL]     return new Vector1D(x + factor * v1.getX()); [EOL] } <line_num>: 168,171
public Vector1D subtract(Vector<Euclidean1D> p) { [EOL]     Vector1D p3 = (Vector1D) p; [EOL]     return new Vector1D(x - p3.x); [EOL] } <line_num>: 174,177
public Vector1D subtract(double factor, Vector<Euclidean1D> v) { [EOL]     Vector1D v1 = (Vector1D) v; [EOL]     return new Vector1D(x - factor * v1.getX()); [EOL] } <line_num>: 180,183
public Vector1D normalize() throws MathArithmeticException { [EOL]     double s = getNorm(); [EOL]     if (s == 0) { [EOL]         throw new MathArithmeticException(LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR); [EOL]     } [EOL]     return scalarMultiply(1 / s); [EOL] } <line_num>: 186,192
public Vector1D negate() { [EOL]     return new Vector1D(-x); [EOL] } <line_num>: 194,196
public Vector1D scalarMultiply(double a) { [EOL]     return new Vector1D(a * x); [EOL] } <line_num>: 199,201
public boolean isNaN() { [EOL]     return Double.isNaN(x); [EOL] } <line_num>: 204,206
public boolean isInfinite() { [EOL]     return !isNaN() && Double.isInfinite(x); [EOL] } <line_num>: 209,211
public double distance1(Vector<Euclidean1D> p) { [EOL]     Vector1D p3 = (Vector1D) p; [EOL]     final double dx = FastMath.abs(p3.x - x); [EOL]     return dx; [EOL] } <line_num>: 214,218
public double distance(Vector<Euclidean1D> p) { [EOL]     Vector1D p3 = (Vector1D) p; [EOL]     final double dx = p3.x - x; [EOL]     return FastMath.abs(dx); [EOL] } <line_num>: 221,225
public double distanceInf(Vector<Euclidean1D> p) { [EOL]     Vector1D p3 = (Vector1D) p; [EOL]     final double dx = FastMath.abs(p3.x - x); [EOL]     return dx; [EOL] } <line_num>: 228,232
public double distanceSq(Vector<Euclidean1D> p) { [EOL]     Vector1D p3 = (Vector1D) p; [EOL]     final double dx = p3.x - x; [EOL]     return dx * dx; [EOL] } <line_num>: 235,239
public double dotProduct(final Vector<Euclidean1D> v) { [EOL]     final Vector1D v1 = (Vector1D) v; [EOL]     return x * v1.x; [EOL] } <line_num>: 242,245
public static double distance(Vector1D p1, Vector1D p2) { [EOL]     return p1.distance(p2); [EOL] } <line_num>: 255,257
public static double distanceInf(Vector1D p1, Vector1D p2) { [EOL]     return p1.distanceInf(p2); [EOL] } <line_num>: 267,269
public static double distanceSq(Vector1D p1, Vector1D p2) { [EOL]     return p1.distanceSq(p2); [EOL] } <line_num>: 279,281
@Override [EOL] public boolean equals(Object other) { [EOL]     if (this == other) { [EOL]         return true; [EOL]     } [EOL]     if (other instanceof Vector1D) { [EOL]         final Vector1D rhs = (Vector1D) other; [EOL]         if (rhs.isNaN()) { [EOL]             return this.isNaN(); [EOL]         } [EOL]         return x == rhs.x; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 302,318
@Override [EOL] public int hashCode() { [EOL]     if (isNaN()) { [EOL]         return 7785; [EOL]     } [EOL]     return 997 * MathUtils.hash(x); [EOL] } <line_num>: 327,333
@Override [EOL] public String toString() { [EOL]     return Vector1DFormat.getInstance().format(this); [EOL] } <line_num>: 338,341
public String toString(final NumberFormat format) { [EOL]     return new Vector1DFormat(format).format(this); [EOL] } <line_num>: 344,346
