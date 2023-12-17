private Beta()
public static double regularizedBeta(double x, double a, double b)
public static double regularizedBeta(double x, double a, double b, double epsilon)
public static double regularizedBeta(double x, double a, double b, int maxIterations)
protected double getB(int n, double x)
protected double getA(int n, double x)
public static double regularizedBeta(double x, final double a, final double b, double epsilon, int maxIterations)
public static double logBeta(double a, double b, double epsilon, int maxIterations)
private static double logGammaSum(final double a, final double b) throws OutOfRangeException
private static double logGammaMinusLogGammaSum(final double a, final double b) throws NumberIsTooSmallException
private static double deltaMinusDeltaSum(final double a, final double b) throws OutOfRangeException, NumberIsTooSmallException
private static double sumDeltaMinusDeltaSum(final double p, final double q)
public static double logBeta(final double p, final double q)
double DEFAULT_EPSILON=Optional[1E-14]
double HALF_LOG_TWO_PI=Optional[.9189385332046727]
double[] DELTA=Optional[{ .833333333333333333333333333333E-01, -.277777777777777777777777752282E-04, .793650793650793650791732130419E-07, -.595238095238095232389839236182E-09, .841750841750832853294451671990E-11, -.191752691751854612334149171243E-12, .641025640510325475730918472625E-14, -.295506514125338232839867823991E-15, .179643716359402238723287696452E-16, -.139228964661627791231203060395E-17, .133802855014020915603275339093E-18, -.154246009867966094273710216533E-19, .197701992980957427278370133333E-20, -.234065664793997056856992426667E-21, .171348014966398575409015466667E-22 }]
