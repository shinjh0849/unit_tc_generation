public FiniteDifferencesDifferentiator(final int nbPoints, final double stepSize) throws NotPositiveException, NumberIsTooSmallException
public FiniteDifferencesDifferentiator(final int nbPoints, final double stepSize, final double tLower, final double tUpper) throws NotPositiveException, NumberIsTooSmallException, NumberIsTooLargeException
public int getNbPoints()
public double getStepSize()
private DerivativeStructure evaluate(final DerivativeStructure t, final double t0, final double[] y) throws NumberIsTooLargeException
public double value(final double x) throws MathIllegalArgumentException
public DerivativeStructure value(final DerivativeStructure t) throws MathIllegalArgumentException
public UnivariateDifferentiableFunction differentiate(final UnivariateFunction function)
public double[] value(final double x) throws MathIllegalArgumentException
public DerivativeStructure[] value(final DerivativeStructure t) throws MathIllegalArgumentException
public UnivariateDifferentiableVectorFunction differentiate(final UnivariateVectorFunction function)
public double[][] value(final double x) throws MathIllegalArgumentException
public DerivativeStructure[][] value(final DerivativeStructure t) throws MathIllegalArgumentException
public UnivariateDifferentiableMatrixFunction differentiate(final UnivariateMatrixFunction function)
