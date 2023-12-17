public StatisticalReferenceDataset(final BufferedReader in) throws IOException
public double[] value(final double[] a)
public DerivativeStructure[] value(final DerivativeStructure[] a)
public String getName()
public int getNumObservations()
public double[][] getData()
public double getX(final int i)
public double getY(final int i)
public int getNumParameters()
public double[] getParameters()
public double getParameter(final int i)
public double[] getParametersStandardDeviations()
public double getParameterStandardDeviation(final int i)
public double getResidualSumOfSquares()
public int getNumStartingPoints()
public double[] getStartingPoint(final int i)
public MultivariateDifferentiableVectorFunction getLeastSquaresProblem()
public abstract DerivativeStructure getModelValue(final double x, final DerivativeStructure[] a)
private static int[] findLineNumbers(final String key, final Iterable<String> lines)
String name
int numObservations
int numParameters
int numStartingPoints
double[] x
double[] y
double[][] startingValues
double[] a
double[] sigA
double residualSumOfSquares
MultivariateDifferentiableVectorFunction problem
