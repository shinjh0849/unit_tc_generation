public PointValuePair(final double[] point, final double value) { [EOL]     this(point, value, true); [EOL] } <line_num>: 42,45
public PointValuePair(final double[] point, final double value, final boolean copyArray) { [EOL]     super(copyArray ? ((point == null) ? null : point.clone()) : point, value); [EOL] } <line_num>: 55,62
public DataTransferObject(final double[] point, final double value) { [EOL]     this.point = point.clone(); [EOL]     this.value = value; [EOL] } <line_num>: 110,113
public double[] getPoint() { [EOL]     final double[] p = getKey(); [EOL]     return p == null ? null : p.clone(); [EOL] } <line_num>: 69,72
public double[] getPointRef() { [EOL]     return getKey(); [EOL] } <line_num>: 79,81
private Object writeReplace() { [EOL]     return new DataTransferObject(getKey(), getValue()); [EOL] } <line_num>: 87,89
private Object readResolve() { [EOL]     return new PointValuePair(point, value, false); [EOL] } <line_num>: 118,120
