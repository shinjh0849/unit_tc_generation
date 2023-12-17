public CMAESOptimizer(int maxIterations, double stopFitness, boolean isActiveCMA, int diagonalOnly, int checkFeasableCount, RandomGenerator random, boolean generateStatistics, ConvergenceChecker<PointValuePair> checker)
public Sigma(double[] s) throws NotPositiveException
public PopulationSize(int size) throws NotStrictlyPositiveException
 DoubleIndex(double value, int index)
public FitnessFunction()
public List<Double> getStatisticsSigmaHistory()
public List<RealMatrix> getStatisticsMeanHistory()
public List<Double> getStatisticsFitnessHistory()
public List<RealMatrix> getStatisticsDHistory()
public double[] getSigma()
public int getPopulationSize()
public PointValuePair optimize(OptimizationData... optData) throws TooManyEvaluationsException, DimensionMismatchException
protected PointValuePair doOptimize()
protected void parseOptimizationData(OptimizationData... optData)
private void checkParameters()
private void initializeCMA(double[] guess)
private boolean updateEvolutionPaths(RealMatrix zmean, RealMatrix xold)
private void updateCovarianceDiagonalOnly(boolean hsig, final RealMatrix bestArz)
private void updateCovariance(boolean hsig, final RealMatrix bestArx, final RealMatrix arz, final int[] arindex, final RealMatrix xold)
private void updateBD(double negccov)
private static void push(double[] vals, double val)
private int[] sortedIndices(final double[] doubles)
public int compareTo(DoubleIndex o)
public boolean equals(Object other)
public int hashCode()
public double value(final double[] point)
public boolean isFeasible(final double[] x)
public void setValueRange(double valueRange)
private double[] repair(final double[] x)
private double penalty(final double[] x, final double[] repaired)
private static RealMatrix log(final RealMatrix m)
private static RealMatrix sqrt(final RealMatrix m)
private static RealMatrix square(final RealMatrix m)
private static RealMatrix times(final RealMatrix m, final RealMatrix n)
private static RealMatrix divide(final RealMatrix m, final RealMatrix n)
private static RealMatrix selectColumns(final RealMatrix m, final int[] cols)
private static RealMatrix triu(final RealMatrix m, int k)
private static RealMatrix sumRows(final RealMatrix m)
private static RealMatrix diag(final RealMatrix m)
private static void copyColumn(final RealMatrix m1, int col1, RealMatrix m2, int col2)
private static RealMatrix ones(int n, int m)
private static RealMatrix eye(int n, int m)
private static RealMatrix zeros(int n, int m)
private static RealMatrix repmat(final RealMatrix mat, int n, int m)
private static RealMatrix sequence(double start, double end, double step)
private static double max(final RealMatrix m)
private static double min(final RealMatrix m)
private static double max(final double[] m)
private static double min(final double[] m)
private static int[] inverse(final int[] indices)
private static int[] reverse(final int[] indices)
private double[] randn(int size)
private RealMatrix randn1(int size, int popSize)
int lambda
boolean isActiveCMA
int checkFeasableCount
double[] inputSigma
int dimension
int diagonalOnly
boolean isMinimize=Optional[true]
boolean generateStatistics
int maxIterations
double stopFitness
double stopTolUpX
double stopTolX
double stopTolFun
double stopTolHistFun
int mu
double logMu2
RealMatrix weights
double mueff
double sigma
double cc
double cs
double damps
double ccov1
double ccovmu
double chiN
double ccov1Sep
double ccovmuSep
RealMatrix xmean
RealMatrix pc
RealMatrix ps
double normps
RealMatrix B
RealMatrix D
RealMatrix BD
RealMatrix diagD
RealMatrix C
RealMatrix diagC
int iterations
double[] fitnessHistory
int historySize
RandomGenerator random
List<Double> statisticsSigmaHistory=Optional[new ArrayList<Double>()]
List<RealMatrix> statisticsMeanHistory=Optional[new ArrayList<RealMatrix>()]
List<Double> statisticsFitnessHistory=Optional[new ArrayList<Double>()]
List<RealMatrix> statisticsDHistory=Optional[new ArrayList<RealMatrix>()]
