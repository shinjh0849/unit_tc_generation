public BOBYQAOptimizer(int numberOfInterpolationPoints)
public BOBYQAOptimizer(int numberOfInterpolationPoints, double initialTrustRegionRadius, double stoppingTrustRegionRadius)
 PathIsExploredException()
protected PointValuePair doOptimize()
private double bobyqa(double[] lowerBound, double[] upperBound)
private double bobyqb(double[] lowerBound, double[] upperBound)
private double[] altmov(int knew, double adelt)
private void prelim(double[] lowerBound, double[] upperBound)
private double[] trsbox(double delta, ArrayRealVector gnew, ArrayRealVector xbdi, ArrayRealVector s, ArrayRealVector hs, ArrayRealVector hred)
private void update(double beta, double denom, int knew)
private void setup(double[] lowerBound, double[] upperBound)
private static String caller(int n)
private static void printState(int s)
private static void printMethod()
int MINIMUM_PROBLEM_DIMENSION=Optional[2]
double DEFAULT_INITIAL_RADIUS=Optional[10.0]
double DEFAULT_STOPPING_RADIUS=Optional[1E-8]
double ZERO=Optional[0d]
double ONE=Optional[1d]
double TWO=Optional[2d]
double TEN=Optional[10d]
double SIXTEEN=Optional[16d]
double TWO_HUNDRED_FIFTY=Optional[250d]
double MINUS_ONE=Optional[-ONE]
double HALF=Optional[ONE / 2]
double ONE_OVER_FOUR=Optional[ONE / 4]
double ONE_OVER_EIGHT=Optional[ONE / 8]
double ONE_OVER_TEN=Optional[ONE / 10]
double ONE_OVER_A_THOUSAND=Optional[ONE / 1000]
int numberOfInterpolationPoints
double initialTrustRegionRadius
double stoppingTrustRegionRadius
boolean isMinimize
ArrayRealVector currentBest
double[] boundDifference
int trustRegionCenterInterpolationPointIndex
Array2DRowRealMatrix bMatrix
Array2DRowRealMatrix zMatrix
Array2DRowRealMatrix interpolationPoints
ArrayRealVector originShift
ArrayRealVector fAtInterpolationPoints
ArrayRealVector trustRegionCenterOffset
ArrayRealVector gradientAtTrustRegionCenter
ArrayRealVector lowerDifference
ArrayRealVector upperDifference
ArrayRealVector modelSecondDerivativesParameters
ArrayRealVector newPoint
ArrayRealVector alternativeNewPoint
ArrayRealVector trialStepPoint
ArrayRealVector lagrangeValuesAtNewPoint
ArrayRealVector modelSecondDerivativesValues
