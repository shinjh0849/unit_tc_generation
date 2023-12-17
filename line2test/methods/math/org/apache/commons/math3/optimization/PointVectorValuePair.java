public PointVectorValuePair(final double[] point, final double[] value) { [EOL]     this(point, value, true); [EOL] } <line_num>: 47,50
public PointVectorValuePair(final double[] point, final double[] value, final boolean copyArray) { [EOL]     super(copyArray ? ((point == null) ? null : point.clone()) : point, copyArray ? ((value == null) ? null : value.clone()) : value); [EOL] } <line_num>: 60,71
public DataTransferObject(final double[] point, final double[] value) { [EOL]     this.point = point.clone(); [EOL]     this.value = value.clone(); [EOL] } <line_num>: 140,143
public double[] getPoint() { [EOL]     final double[] p = getKey(); [EOL]     return p == null ? null : p.clone(); [EOL] } <line_num>: 78,81
public double[] getPointRef() { [EOL]     return getKey(); [EOL] } <line_num>: 88,90
@Override [EOL] public double[] getValue() { [EOL]     final double[] v = super.getValue(); [EOL]     return v == null ? null : v.clone(); [EOL] } <line_num>: 97,101
public double[] getValueRef() { [EOL]     return super.getValue(); [EOL] } <line_num>: 109,111
private Object writeReplace() { [EOL]     return new DataTransferObject(getKey(), getValue()); [EOL] } <line_num>: 117,119
private Object readResolve() { [EOL]     return new PointVectorValuePair(point, value, false); [EOL] } <line_num>: 148,150
