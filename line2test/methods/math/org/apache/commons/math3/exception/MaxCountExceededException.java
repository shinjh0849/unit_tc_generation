public MaxCountExceededException(Number max) { [EOL]     this(LocalizedFormats.MAX_COUNT_EXCEEDED, max); [EOL] } <line_num>: 41,43
public MaxCountExceededException(Localizable specific, Number max, Object... args) { [EOL]     getContext().addMessage(specific, max, args); [EOL]     this.max = max; [EOL] } <line_num>: 51,56
public Number getMax() { [EOL]     return max; [EOL] } <line_num>: 61,63
