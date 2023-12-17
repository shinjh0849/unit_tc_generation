public NumberIsTooLargeException(Number wrong, Number max, boolean boundIsAllowed) { [EOL]     this(boundIsAllowed ? LocalizedFormats.NUMBER_TOO_LARGE : LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED, wrong, max, boundIsAllowed); [EOL] } <line_num>: 47,54
public NumberIsTooLargeException(Localizable specific, Number wrong, Number max, boolean boundIsAllowed) { [EOL]     super(specific, wrong, max); [EOL]     this.max = max; [EOL]     this.boundIsAllowed = boundIsAllowed; [EOL] } <line_num>: 63,71
public boolean getBoundIsAllowed() { [EOL]     return boundIsAllowed; [EOL] } <line_num>: 76,78
public Number getMax() { [EOL]     return max; [EOL] } <line_num>: 83,85
