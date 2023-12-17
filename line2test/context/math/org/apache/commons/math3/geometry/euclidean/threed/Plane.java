public Plane(final Vector3D normal) throws MathArithmeticException
public Plane(final Vector3D p, final Vector3D normal) throws MathArithmeticException
public Plane(final Vector3D p1, final Vector3D p2, final Vector3D p3) throws MathArithmeticException
public Plane(final Plane plane)
public Plane copySelf()
public void reset(final Vector3D p, final Vector3D normal) throws MathArithmeticException
public void reset(final Plane original)
private void setNormal(final Vector3D normal) throws MathArithmeticException
private void setFrame()
public Vector3D getOrigin()
public Vector3D getNormal()
public Vector3D getU()
public Vector3D getV()
public void revertSelf()
public Vector2D toSubSpace(final Vector<Euclidean3D> point)
public Vector3D toSpace(final Vector<Euclidean2D> point)
public Vector3D getPointAt(final Vector2D inPlane, final double offset)
public boolean isSimilarTo(final Plane plane)
public Plane rotate(final Vector3D center, final Rotation rotation)
public Plane translate(final Vector3D translation)
public Vector3D intersection(final Line line)
public Line intersection(final Plane other)
public static Vector3D intersection(final Plane plane1, final Plane plane2, final Plane plane3)
public SubPlane wholeHyperplane()
public PolyhedronsSet wholeSpace()
public boolean contains(final Vector3D p)
public double getOffset(final Plane plane)
public double getOffset(final Vector<Euclidean3D> point)
public boolean sameOrientationAs(final Hyperplane<Euclidean3D> other)
double originOffset
Vector3D origin
Vector3D u
Vector3D v
Vector3D w
