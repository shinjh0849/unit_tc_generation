public Vector2D(double x, double y) { [EOL]     this.x = x; [EOL]     this.y = y; [EOL] } <line_num>: 68,71
public Vector2D(double[] v) throws DimensionMismatchException { [EOL]     if (v.length != 2) { [EOL]         throw new DimensionMismatchException(v.length, 2); [EOL]     } [EOL]     this.x = v[0]; [EOL]     this.y = v[1]; [EOL] } <line_num>: 79,85
public Vector2D(double a, Vector2D u) { [EOL]     this.x = a * u.x; [EOL]     this.y = a * u.y; [EOL] } <line_num>: 93,96
public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2) { [EOL]     this.x = a1 * u1.x + a2 * u2.x; [EOL]     this.y = a1 * u1.y + a2 * u2.y; [EOL] } <line_num>: 106,109
public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2, double a3, Vector2D u3) { [EOL]     this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x; [EOL]     this.y = a1 * u1.y + a2 * u2.y + a3 * u3.y; [EOL] } <line_num>: 121,125
public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2, double a3, Vector2D u3, double a4, Vector2D u4) { [EOL]     this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x + a4 * u4.x; [EOL]     this.y = a1 * u1.y + a2 * u2.y + a3 * u3.y + a4 * u4.y; [EOL] } <line_num>: 139,143
public double getX() { [EOL]     return x; [EOL] } <line_num>: 149,151
public double getY() { [EOL]     return y; [EOL] } <line_num>: 157,159
public double[] toArray() { [EOL]     return new double[] { x, y }; [EOL] } <line_num>: 165,167
public Space getSpace() { [EOL]     return Euclidean2D.getInstance(); [EOL] } <line_num>: 170,172
public Vector2D getZero() { [EOL]     return ZERO; [EOL] } <line_num>: 175,177
public double getNorm1() { [EOL]     return FastMath.abs(x) + FastMath.abs(y); [EOL] } <line_num>: 180,182
public double getNorm() { [EOL]     return FastMath.sqrt(x * x + y * y); [EOL] } <line_num>: 185,187
public double getNormSq() { [EOL]     return x * x + y * y; [EOL] } <line_num>: 190,192
public double getNormInf() { [EOL]     return FastMath.max(FastMath.abs(x), FastMath.abs(y)); [EOL] } <line_num>: 195,197
public Vector2D add(Vector<Euclidean2D> v) { [EOL]     Vector2D v2 = (Vector2D) v; [EOL]     return new Vector2D(x + v2.getX(), y + v2.getY()); [EOL] } <line_num>: 200,203
public Vector2D add(double factor, Vector<Euclidean2D> v) { [EOL]     Vector2D v2 = (Vector2D) v; [EOL]     return new Vector2D(x + factor * v2.getX(), y + factor * v2.getY()); [EOL] } <line_num>: 206,209
public Vector2D subtract(Vector<Euclidean2D> p) { [EOL]     Vector2D p3 = (Vector2D) p; [EOL]     return new Vector2D(x - p3.x, y - p3.y); [EOL] } <line_num>: 212,215
public Vector2D subtract(double factor, Vector<Euclidean2D> v) { [EOL]     Vector2D v2 = (Vector2D) v; [EOL]     return new Vector2D(x - factor * v2.getX(), y - factor * v2.getY()); [EOL] } <line_num>: 218,221
public Vector2D normalize() throws MathArithmeticException { [EOL]     double s = getNorm(); [EOL]     if (s == 0) { [EOL]         throw new MathArithmeticException(LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR); [EOL]     } [EOL]     return scalarMultiply(1 / s); [EOL] } <line_num>: 224,230
public Vector2D negate() { [EOL]     return new Vector2D(-x, -y); [EOL] } <line_num>: 232,234
public Vector2D scalarMultiply(double a) { [EOL]     return new Vector2D(a * x, a * y); [EOL] } <line_num>: 237,239
public boolean isNaN() { [EOL]     return Double.isNaN(x) || Double.isNaN(y); [EOL] } <line_num>: 242,244
public boolean isInfinite() { [EOL]     return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y)); [EOL] } <line_num>: 247,249
public double distance1(Vector<Euclidean2D> p) { [EOL]     Vector2D p3 = (Vector2D) p; [EOL]     final double dx = FastMath.abs(p3.x - x); [EOL]     final double dy = FastMath.abs(p3.y - y); [EOL]     return dx + dy; [EOL] } <line_num>: 252,257
public double distance(Vector<Euclidean2D> p) { [EOL]     Vector2D p3 = (Vector2D) p; [EOL]     final double dx = p3.x - x; [EOL]     final double dy = p3.y - y; [EOL]     return FastMath.sqrt(dx * dx + dy * dy); [EOL] } <line_num>: 260,265
public double distanceInf(Vector<Euclidean2D> p) { [EOL]     Vector2D p3 = (Vector2D) p; [EOL]     final double dx = FastMath.abs(p3.x - x); [EOL]     final double dy = FastMath.abs(p3.y - y); [EOL]     return FastMath.max(dx, dy); [EOL] } <line_num>: 268,273
public double distanceSq(Vector<Euclidean2D> p) { [EOL]     Vector2D p3 = (Vector2D) p; [EOL]     final double dx = p3.x - x; [EOL]     final double dy = p3.y - y; [EOL]     return dx * dx + dy * dy; [EOL] } <line_num>: 276,281
public double dotProduct(final Vector<Euclidean2D> v) { [EOL]     final Vector2D v2 = (Vector2D) v; [EOL]     return x * v2.x + y * v2.y; [EOL] } <line_num>: 284,287
public static double distance(Vector2D p1, Vector2D p2) { [EOL]     return p1.distance(p2); [EOL] } <line_num>: 297,299
public static double distanceInf(Vector2D p1, Vector2D p2) { [EOL]     return p1.distanceInf(p2); [EOL] } <line_num>: 309,311
public static double distanceSq(Vector2D p1, Vector2D p2) { [EOL]     return p1.distanceSq(p2); [EOL] } <line_num>: 321,323
@Override [EOL] public boolean equals(Object other) { [EOL]     if (this == other) { [EOL]         return true; [EOL]     } [EOL]     if (other instanceof Vector2D) { [EOL]         final Vector2D rhs = (Vector2D) other; [EOL]         if (rhs.isNaN()) { [EOL]             return this.isNaN(); [EOL]         } [EOL]         return (x == rhs.x) && (y == rhs.y); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 344,360
@Override [EOL] public int hashCode() { [EOL]     if (isNaN()) { [EOL]         return 542; [EOL]     } [EOL]     return 122 * (76 * MathUtils.hash(x) + MathUtils.hash(y)); [EOL] } <line_num>: 369,375
@Override [EOL] public String toString() { [EOL]     return Vector2DFormat.getInstance().format(this); [EOL] } <line_num>: 380,383
public String toString(final NumberFormat format) { [EOL]     return new Vector2DFormat(format).format(this); [EOL] } <line_num>: 386,388
