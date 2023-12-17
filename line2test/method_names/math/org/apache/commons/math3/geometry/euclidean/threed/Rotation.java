public Rotation(double q0, double q1, double q2, double q3, boolean needsNormalization)
public Rotation(Vector3D axis, double angle) throws MathIllegalArgumentException
public Rotation(double[][] m, double threshold) throws NotARotationMatrixException
public Rotation(Vector3D u1, Vector3D u2, Vector3D v1, Vector3D v2) throws MathArithmeticException
public Rotation(Vector3D u, Vector3D v) throws MathArithmeticException
public Rotation(RotationOrder order, double alpha1, double alpha2, double alpha3)
private static double[] mat2quat(final double[][] ort)
public Rotation revert()
public double getQ0()
public double getQ1()
public double getQ2()
public double getQ3()
public Vector3D getAxis()
public double getAngle()
public double[] getAngles(RotationOrder order) throws CardanEulerSingularityException
public double[][] getMatrix()
public Vector3D applyTo(Vector3D u)
public void applyTo(final double[] in, final double[] out)
public Vector3D applyInverseTo(Vector3D u)
public void applyInverseTo(final double[] in, final double[] out)
public Rotation applyTo(Rotation r)
public Rotation applyInverseTo(Rotation r)
private double[][] orthogonalizeMatrix(double[][] m, double threshold) throws NotARotationMatrixException
public static double distance(Rotation r1, Rotation r2)
