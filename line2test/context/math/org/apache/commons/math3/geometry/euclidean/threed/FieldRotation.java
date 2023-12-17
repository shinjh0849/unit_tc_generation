public FieldRotation(final T q0, final T q1, final T q2, final T q3, final boolean needsNormalization)
public FieldRotation(final FieldVector3D<T> axis, final T angle) throws MathIllegalArgumentException
public FieldRotation(final T[][] m, final double threshold) throws NotARotationMatrixException
public FieldRotation(FieldVector3D<T> u1, FieldVector3D<T> u2, FieldVector3D<T> v1, FieldVector3D<T> v2) throws MathArithmeticException
public FieldRotation(final FieldVector3D<T> u, final FieldVector3D<T> v) throws MathArithmeticException
public FieldRotation(final RotationOrder order, final T alpha1, final T alpha2, final T alpha3)
private T[] mat2quat(final T[][] ort)
public FieldRotation<T> revert()
public T getQ0()
public T getQ1()
public T getQ2()
public T getQ3()
public FieldVector3D<T> getAxis()
public T getAngle()
public T[] getAngles(final RotationOrder order) throws CardanEulerSingularityException
private T[] buildArray(final T a0, final T a1, final T a2)
private FieldVector3D<T> vector(final double x, final double y, final double z)
public T[][] getMatrix()
public Rotation toRotation()
public FieldVector3D<T> applyTo(final FieldVector3D<T> u)
public FieldVector3D<T> applyTo(final Vector3D u)
public void applyTo(final T[] in, final T[] out)
public void applyTo(final double[] in, final T[] out)
public static FieldVector3D<T> applyTo(final Rotation r, final FieldVector3D<T> u)
public FieldVector3D<T> applyInverseTo(final FieldVector3D<T> u)
public FieldVector3D<T> applyInverseTo(final Vector3D u)
public void applyInverseTo(final T[] in, final T[] out)
public void applyInverseTo(final double[] in, final T[] out)
public static FieldVector3D<T> applyInverseTo(final Rotation r, final FieldVector3D<T> u)
public FieldRotation<T> applyTo(final FieldRotation<T> r)
public FieldRotation<T> applyTo(final Rotation r)
public static FieldRotation<T> applyTo(final Rotation r1, final FieldRotation<T> rInner)
public FieldRotation<T> applyInverseTo(final FieldRotation<T> r)
public FieldRotation<T> applyInverseTo(final Rotation r)
public static FieldRotation<T> applyInverseTo(final Rotation rOuter, final FieldRotation<T> rInner)
private T[][] orthogonalizeMatrix(final T[][] m, final double threshold) throws NotARotationMatrixException
public static T distance(final FieldRotation<T> r1, final FieldRotation<T> r2)
long serialVersionUID=Optional[20130224l]
T q0
T q1
T q2
T q3
