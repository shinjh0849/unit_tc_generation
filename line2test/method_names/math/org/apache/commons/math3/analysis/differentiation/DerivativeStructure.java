private DerivativeStructure(final DSCompiler compiler)
public DerivativeStructure(final int parameters, final int order) throws NumberIsTooLargeException
public DerivativeStructure(final int parameters, final int order, final double value) throws NumberIsTooLargeException
public DerivativeStructure(final int parameters, final int order, final int index, final double value) throws NumberIsTooLargeException
public DerivativeStructure(final double a1, final DerivativeStructure ds1, final double a2, final DerivativeStructure ds2) throws DimensionMismatchException
public DerivativeStructure(final double a1, final DerivativeStructure ds1, final double a2, final DerivativeStructure ds2, final double a3, final DerivativeStructure ds3) throws DimensionMismatchException
public DerivativeStructure(final double a1, final DerivativeStructure ds1, final double a2, final DerivativeStructure ds2, final double a3, final DerivativeStructure ds3, final double a4, final DerivativeStructure ds4) throws DimensionMismatchException
public DerivativeStructure(final int parameters, final int order, final double... derivatives) throws DimensionMismatchException, NumberIsTooLargeException
private DerivativeStructure(final DerivativeStructure ds)
public DataTransferObject(final int variables, final int order, final double[] data)
public int getFreeParameters()
public int getOrder()
public DerivativeStructure createConstant(final double c)
public double getReal()
public double getValue()
public double getPartialDerivative(final int... orders) throws DimensionMismatchException, NumberIsTooLargeException
public double[] getAllDerivatives()
public DerivativeStructure add(final double a)
public DerivativeStructure add(final DerivativeStructure a) throws DimensionMismatchException
public DerivativeStructure subtract(final double a)
public DerivativeStructure subtract(final DerivativeStructure a) throws DimensionMismatchException
public DerivativeStructure multiply(final int n)
public DerivativeStructure multiply(final double a)
public DerivativeStructure multiply(final DerivativeStructure a) throws DimensionMismatchException
public DerivativeStructure divide(final double a)
public DerivativeStructure divide(final DerivativeStructure a) throws DimensionMismatchException
public DerivativeStructure remainder(final double a)
public DerivativeStructure remainder(final DerivativeStructure a) throws DimensionMismatchException
public DerivativeStructure negate()
public DerivativeStructure abs()
public DerivativeStructure ceil()
public DerivativeStructure floor()
public DerivativeStructure rint()
public long round()
public DerivativeStructure signum()
public DerivativeStructure copySign(final DerivativeStructure sign)
public DerivativeStructure copySign(final double sign)
public int getExponent()
public DerivativeStructure scalb(final int n)
public DerivativeStructure hypot(final DerivativeStructure y) throws DimensionMismatchException
public static DerivativeStructure hypot(final DerivativeStructure x, final DerivativeStructure y) throws DimensionMismatchException
public DerivativeStructure compose(final double... f) throws DimensionMismatchException
public DerivativeStructure reciprocal()
public DerivativeStructure sqrt()
public DerivativeStructure cbrt()
public DerivativeStructure rootN(final int n)
public DerivativeStructure getZero()
public DerivativeStructure getOne()
public Class<? extends FieldElement<DerivativeStructure>> getRuntimeClass()
public Field<DerivativeStructure> getField()
public static DerivativeStructure pow(final double a, final DerivativeStructure x)
public DerivativeStructure pow(final double p)
public DerivativeStructure pow(final int n)
public DerivativeStructure pow(final DerivativeStructure e) throws DimensionMismatchException
public DerivativeStructure exp()
public DerivativeStructure expm1()
public DerivativeStructure log()
public DerivativeStructure log1p()
public DerivativeStructure log10()
public DerivativeStructure cos()
public DerivativeStructure sin()
public DerivativeStructure tan()
public DerivativeStructure acos()
public DerivativeStructure asin()
public DerivativeStructure atan()
public DerivativeStructure atan2(final DerivativeStructure x) throws DimensionMismatchException
public static DerivativeStructure atan2(final DerivativeStructure y, final DerivativeStructure x) throws DimensionMismatchException
public DerivativeStructure cosh()
public DerivativeStructure sinh()
public DerivativeStructure tanh()
public DerivativeStructure acosh()
public DerivativeStructure asinh()
public DerivativeStructure atanh()
public DerivativeStructure toDegrees()
public DerivativeStructure toRadians()
public double taylor(final double... delta) throws MathArithmeticException
public DerivativeStructure linearCombination(final DerivativeStructure[] a, final DerivativeStructure[] b) throws DimensionMismatchException
public DerivativeStructure linearCombination(final double[] a, final DerivativeStructure[] b) throws DimensionMismatchException
public DerivativeStructure linearCombination(final DerivativeStructure a1, final DerivativeStructure b1, final DerivativeStructure a2, final DerivativeStructure b2) throws DimensionMismatchException
public DerivativeStructure linearCombination(final double a1, final DerivativeStructure b1, final double a2, final DerivativeStructure b2) throws DimensionMismatchException
public DerivativeStructure linearCombination(final DerivativeStructure a1, final DerivativeStructure b1, final DerivativeStructure a2, final DerivativeStructure b2, final DerivativeStructure a3, final DerivativeStructure b3) throws DimensionMismatchException
public DerivativeStructure linearCombination(final double a1, final DerivativeStructure b1, final double a2, final DerivativeStructure b2, final double a3, final DerivativeStructure b3) throws DimensionMismatchException
public DerivativeStructure linearCombination(final DerivativeStructure a1, final DerivativeStructure b1, final DerivativeStructure a2, final DerivativeStructure b2, final DerivativeStructure a3, final DerivativeStructure b3, final DerivativeStructure a4, final DerivativeStructure b4) throws DimensionMismatchException
public DerivativeStructure linearCombination(final double a1, final DerivativeStructure b1, final double a2, final DerivativeStructure b2, final double a3, final DerivativeStructure b3, final double a4, final DerivativeStructure b4) throws DimensionMismatchException
public boolean equals(Object other)
public int hashCode()
private Object writeReplace()
private Object readResolve()
