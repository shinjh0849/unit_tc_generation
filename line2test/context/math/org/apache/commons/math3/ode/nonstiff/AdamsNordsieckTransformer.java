private AdamsNordsieckTransformer(final int nSteps)
public static AdamsNordsieckTransformer getInstance(final int nSteps)
public int getNSteps()
private FieldMatrix<BigFraction> buildP(final int nSteps)
public Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot)
public Array2DRowRealMatrix updateHighOrderDerivativesPhase1(final Array2DRowRealMatrix highOrder)
public void updateHighOrderDerivativesPhase2(final double[] start, final double[] end, final Array2DRowRealMatrix highOrder)
Map<Integer, AdamsNordsieckTransformer> CACHE=Optional[new HashMap<Integer, AdamsNordsieckTransformer>()]
Array2DRowRealMatrix update
double[] c1
