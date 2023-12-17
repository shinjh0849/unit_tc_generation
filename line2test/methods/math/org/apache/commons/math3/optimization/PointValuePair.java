public PointValuePair(final double[] point, final double value) { [EOL]     this(point, value, true); [EOL] } <line_num>: 47,50
public PointValuePair(final double[] point, final double value, final boolean copyArray) { [EOL]     super(copyArray ? ((point == null) ? null : point.clone()) : point, value); [EOL] } <line_num>: 60,67
public DataTransferObject(final double[] point, final double value) { [EOL]     this.point = point.clone(); [EOL]     this.value = value; [EOL] } <line_num>: 115,118
public double[] getPoint() { [EOL]     final double[] p = getKey(); [EOL]     return p == null ? null : p.clone(); [EOL] } <line_num>: 74,77
public double[] getPointRef() { [EOL]     return getKey(); [EOL] } <line_num>: 84,86
private Object writeReplace() { [EOL]     return new DataTransferObject(getKey(), getValue()); [EOL] } <line_num>: 92,94
private Object readResolve() { [EOL]     return new PointValuePair(point, value, false); [EOL] } <line_num>: 123,125
