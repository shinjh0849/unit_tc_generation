public PointVectorValuePair(final double[] point, final double[] value) { [EOL]     this(point, value, true); [EOL] } <line_num>: 42,45
public PointVectorValuePair(final double[] point, final double[] value, final boolean copyArray) { [EOL]     super(copyArray ? ((point == null) ? null : point.clone()) : point, copyArray ? ((value == null) ? null : value.clone()) : value); [EOL] } <line_num>: 55,66
public DataTransferObject(final double[] point, final double[] value) { [EOL]     this.point = point.clone(); [EOL]     this.value = value.clone(); [EOL] } <line_num>: 135,138
public double[] getPoint() { [EOL]     final double[] p = getKey(); [EOL]     return p == null ? null : p.clone(); [EOL] } <line_num>: 73,76
public double[] getPointRef() { [EOL]     return getKey(); [EOL] } <line_num>: 83,85
@Override [EOL] public double[] getValue() { [EOL]     final double[] v = super.getValue(); [EOL]     return v == null ? null : v.clone(); [EOL] } <line_num>: 92,96
public double[] getValueRef() { [EOL]     return super.getValue(); [EOL] } <line_num>: 104,106
private Object writeReplace() { [EOL]     return new DataTransferObject(getKey(), getValue()); [EOL] } <line_num>: 112,114
private Object readResolve() { [EOL]     return new PointVectorValuePair(point, value, false); [EOL] } <line_num>: 143,145
