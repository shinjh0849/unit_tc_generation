public SimpleBounds(double[] lB, double[] uB) { [EOL]     lower = lB.clone(); [EOL]     upper = uB.clone(); [EOL] } <line_num>: 41,45
public double[] getLower() { [EOL]     return lower.clone(); [EOL] } <line_num>: 52,54
public double[] getUpper() { [EOL]     return upper.clone(); [EOL] } <line_num>: 60,62
public static SimpleBounds unbounded(int dim) { [EOL]     final double[] lB = new double[dim]; [EOL]     Arrays.fill(lB, Double.NEGATIVE_INFINITY); [EOL]     final double[] uB = new double[dim]; [EOL]     Arrays.fill(uB, Double.POSITIVE_INFINITY); [EOL]     return new SimpleBounds(lB, uB); [EOL] } <line_num>: 72,79
