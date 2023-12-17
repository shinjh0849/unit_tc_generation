public EuclideanDoublePoint(final double[] point) { [EOL]     this.point = point; [EOL] } <line_num>: 48,50
public EuclideanDoublePoint centroidOf(final Collection<EuclideanDoublePoint> points) { [EOL]     final double[] centroid = new double[getPoint().length]; [EOL]     for (final EuclideanDoublePoint p : points) { [EOL]         for (int i = 0; i < centroid.length; i++) { [EOL]             centroid[i] += p.getPoint()[i]; [EOL]         } [EOL]     } [EOL]     for (int i = 0; i < centroid.length; i++) { [EOL]         centroid[i] /= points.size(); [EOL]     } [EOL]     return new EuclideanDoublePoint(centroid); [EOL] } <line_num>: 53,64
public double distanceFrom(final EuclideanDoublePoint p) { [EOL]     return MathArrays.distance(point, p.getPoint()); [EOL] } <line_num>: 67,69
@Override [EOL] public boolean equals(final Object other) { [EOL]     if (!(other instanceof EuclideanDoublePoint)) { [EOL]         return false; [EOL]     } [EOL]     return Arrays.equals(point, ((EuclideanDoublePoint) other).point); [EOL] } <line_num>: 72,78
public double[] getPoint() { [EOL]     return point; [EOL] } <line_num>: 85,87
@Override [EOL] public int hashCode() { [EOL]     return Arrays.hashCode(point); [EOL] } <line_num>: 90,93
@Override [EOL] public String toString() { [EOL]     return Arrays.toString(point); [EOL] } <line_num>: 96,99
