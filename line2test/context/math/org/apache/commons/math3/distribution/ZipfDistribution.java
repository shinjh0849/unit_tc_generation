public ZipfDistribution(final int numberOfElements, final double exponent)
public ZipfDistribution(RandomGenerator rng, int numberOfElements, double exponent) throws NotStrictlyPositiveException
public int getNumberOfElements()
public double getExponent()
public double probability(final int x)
public double cumulativeProbability(final int x)
public double getNumericalMean()
protected double calculateNumericalMean()
public double getNumericalVariance()
protected double calculateNumericalVariance()
private double generalizedHarmonic(final int n, final double m)
public int getSupportLowerBound()
public int getSupportUpperBound()
public boolean isSupportConnected()
long serialVersionUID=Optional[-140627372283420404L]
int numberOfElements
double exponent
double numericalMean=Optional[Double.NaN]
boolean numericalMeanIsCalculated=Optional[false]
double numericalVariance=Optional[Double.NaN]
boolean numericalVarianceIsCalculated=Optional[false]
