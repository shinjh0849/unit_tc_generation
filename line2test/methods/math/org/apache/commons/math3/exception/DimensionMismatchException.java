public DimensionMismatchException(Localizable specific, int wrong, int expected) { [EOL]     super(specific, Integer.valueOf(wrong), Integer.valueOf(expected)); [EOL]     dimension = expected; [EOL] } <line_num>: 41,46
public DimensionMismatchException(int wrong, int expected) { [EOL]     this(LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, wrong, expected); [EOL] } <line_num>: 54,57
public int getDimension() { [EOL]     return dimension; [EOL] } <line_num>: 62,64
