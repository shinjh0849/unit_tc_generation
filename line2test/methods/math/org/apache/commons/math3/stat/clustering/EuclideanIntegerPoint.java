public EuclideanIntegerPoint(final int[] point) { [EOL]     this.point = point; [EOL] } <line_num>: 47,49
public int[] getPoint() { [EOL]     return point; [EOL] } <line_num>: 55,57
public double distanceFrom(final EuclideanIntegerPoint p) { [EOL]     return MathArrays.distance(point, p.getPoint()); [EOL] } <line_num>: 60,62
public EuclideanIntegerPoint centroidOf(final Collection<EuclideanIntegerPoint> points) { [EOL]     int[] centroid = new int[getPoint().length]; [EOL]     for (EuclideanIntegerPoint p : points) { [EOL]         for (int i = 0; i < centroid.length; i++) { [EOL]             centroid[i] += p.getPoint()[i]; [EOL]         } [EOL]     } [EOL]     for (int i = 0; i < centroid.length; i++) { [EOL]         centroid[i] /= points.size(); [EOL]     } [EOL]     return new EuclideanIntegerPoint(centroid); [EOL] } <line_num>: 65,76
@Override [EOL] public boolean equals(final Object other) { [EOL]     if (!(other instanceof EuclideanIntegerPoint)) { [EOL]         return false; [EOL]     } [EOL]     return Arrays.equals(point, ((EuclideanIntegerPoint) other).point); [EOL] } <line_num>: 79,85
@Override [EOL] public int hashCode() { [EOL]     return Arrays.hashCode(point); [EOL] } <line_num>: 88,91
@Override [EOL] public String toString() { [EOL]     return Arrays.toString(point); [EOL] } <line_num>: 97,100
