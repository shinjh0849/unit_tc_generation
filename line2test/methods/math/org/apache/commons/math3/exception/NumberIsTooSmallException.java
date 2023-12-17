public NumberIsTooSmallException(Number wrong, Number min, boolean boundIsAllowed) { [EOL]     this(boundIsAllowed ? LocalizedFormats.NUMBER_TOO_SMALL : LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED, wrong, min, boundIsAllowed); [EOL] } <line_num>: 47,54
public NumberIsTooSmallException(Localizable specific, Number wrong, Number min, boolean boundIsAllowed) { [EOL]     super(specific, wrong, min); [EOL]     this.min = min; [EOL]     this.boundIsAllowed = boundIsAllowed; [EOL] } <line_num>: 64,72
public boolean getBoundIsAllowed() { [EOL]     return boundIsAllowed; [EOL] } <line_num>: 77,79
public Number getMin() { [EOL]     return min; [EOL] } <line_num>: 84,86
