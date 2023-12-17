public DoublePoint(final double[] point) { [EOL]     this.point = point; [EOL] } <line_num>: 43,45
public DoublePoint(final int[] point) { [EOL]     this.point = new double[point.length]; [EOL]     for (int i = 0; i < point.length; i++) { [EOL]         this.point[i] = point[i]; [EOL]     } [EOL] } <line_num>: 54,59
public double[] getPoint() { [EOL]     return point; [EOL] } <line_num>: 62,64
@Override [EOL] public boolean equals(final Object other) { [EOL]     if (!(other instanceof DoublePoint)) { [EOL]         return false; [EOL]     } [EOL]     return Arrays.equals(point, ((DoublePoint) other).point); [EOL] } <line_num>: 67,73
@Override [EOL] public int hashCode() { [EOL]     return Arrays.hashCode(point); [EOL] } <line_num>: 76,79
@Override [EOL] public String toString() { [EOL]     return Arrays.toString(point); [EOL] } <line_num>: 82,85
