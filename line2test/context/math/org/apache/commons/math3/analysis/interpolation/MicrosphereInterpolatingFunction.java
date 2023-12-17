 MicrosphereSurfaceElement(double[] n)
public MicrosphereInterpolatingFunction(double[][] xval, double[] yval, int brightnessExponent, int microsphereElements, UnitSphereRandomVectorGenerator rand) throws DimensionMismatchException, NoDataException, NullArgumentException
 RealVector normal()
 void reset()
 void store(final double illuminationFromSample, final Map.Entry<RealVector, Double> sample)
 double illumination()
 Map.Entry<RealVector, Double> sample()
public double value(double[] point) throws DimensionMismatchException
private double cosAngle(final RealVector v, final RealVector w)
int dimension
List<MicrosphereSurfaceElement> microsphere
double brightnessExponent
Map<RealVector, Double> samples
