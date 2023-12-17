public MultiDimensionMismatchException(Integer[] wrong, Integer[] expected) { [EOL]     this(LocalizedFormats.DIMENSIONS_MISMATCH, wrong, expected); [EOL] } <line_num>: 43,46
public MultiDimensionMismatchException(Localizable specific, Integer[] wrong, Integer[] expected) { [EOL]     super(specific, wrong, expected); [EOL]     this.wrong = wrong.clone(); [EOL]     this.expected = expected.clone(); [EOL] } <line_num>: 56,62
public Integer[] getWrongDimensions() { [EOL]     return wrong.clone(); [EOL] } <line_num>: 67,69
public Integer[] getExpectedDimensions() { [EOL]     return expected.clone(); [EOL] } <line_num>: 73,75
public int getWrongDimension(int index) { [EOL]     return wrong[index].intValue(); [EOL] } <line_num>: 81,83
public int getExpectedDimension(int index) { [EOL]     return expected[index].intValue(); [EOL] } <line_num>: 88,90
