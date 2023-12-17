public NonPositiveDefiniteMatrixException(double wrong, int index, double threshold) { [EOL]     super(wrong, threshold, false); [EOL]     this.index = index; [EOL]     this.threshold = threshold; [EOL]     final ExceptionContext context = getContext(); [EOL]     context.addMessage(LocalizedFormats.NOT_POSITIVE_DEFINITE_MATRIX); [EOL]     context.addMessage(LocalizedFormats.ARRAY_ELEMENT, wrong, index); [EOL] } <line_num>: 44,54
public int getRow() { [EOL]     return index; [EOL] } <line_num>: 59,61
public int getColumn() { [EOL]     return index; [EOL] } <line_num>: 65,67
public double getThreshold() { [EOL]     return threshold; [EOL] } <line_num>: 71,73
