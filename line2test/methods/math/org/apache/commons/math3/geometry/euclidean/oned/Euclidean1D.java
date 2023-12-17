private Euclidean1D() { [EOL] } <line_num>: 38,39
public static Euclidean1D getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 44,46
public int getDimension() { [EOL]     return 1; [EOL] } <line_num>: 49,51
public Space getSubSpace() throws MathUnsupportedOperationException { [EOL]     throw new MathUnsupportedOperationException(LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N, 1); [EOL] } <line_num>: 61,63
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 78,81
