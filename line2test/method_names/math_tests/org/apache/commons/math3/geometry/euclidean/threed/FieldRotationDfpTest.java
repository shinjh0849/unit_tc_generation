public void testIdentity()
public void testAxisAngle() throws MathIllegalArgumentException
public void testRevert()
public void testVectorOnePair() throws MathArithmeticException
public void testVectorTwoPairs() throws MathArithmeticException
public void testMatrix() throws NotARotationMatrixException
public void testAngles() throws CardanEulerSingularityException
public void testSingularities()
public void testQuaternion() throws MathIllegalArgumentException
public void testCompose() throws MathIllegalArgumentException
public void testComposeInverse() throws MathIllegalArgumentException
public void testDoubleVectors() throws MathIllegalArgumentException
public void testDoubleRotations() throws MathIllegalArgumentException
public void testArray() throws MathIllegalArgumentException
public void testApplyInverseTo() throws MathIllegalArgumentException
public void testIssue639() throws MathArithmeticException
public void testIssue801() throws MathArithmeticException
private void checkAngle(Dfp a1, double a2)
private void checkRotationDS(FieldRotation<Dfp> r, double q0, double q1, double q2, double q3)
private FieldRotation<Dfp> createRotation(double q0, double q1, double q2, double q3, boolean needsNormalization)
private FieldRotation<Dfp> createRotation(double[][] m, double threshold)
private FieldVector3D<Dfp> createVector(double x, double y, double z)
private FieldVector3D<Dfp> createAxis(double x, double y, double z)
private Dfp createAngle(double alpha)
private void checkVector(FieldVector3D<Dfp> u, FieldVector3D<Dfp> v)
