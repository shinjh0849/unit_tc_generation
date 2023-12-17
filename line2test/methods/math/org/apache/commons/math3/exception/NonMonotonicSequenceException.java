public NonMonotonicSequenceException(Number wrong, Number previous, int index) { [EOL]     this(wrong, previous, index, MathArrays.OrderDirection.INCREASING, true); [EOL] } <line_num>: 58,62
public NonMonotonicSequenceException(Number wrong, Number previous, int index, MathArrays.OrderDirection direction, boolean strict) { [EOL]     super(direction == MathArrays.OrderDirection.INCREASING ? (strict ? LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE : LocalizedFormats.NOT_INCREASING_SEQUENCE) : (strict ? LocalizedFormats.NOT_STRICTLY_DECREASING_SEQUENCE : LocalizedFormats.NOT_DECREASING_SEQUENCE), wrong, previous, Integer.valueOf(index), Integer.valueOf(index - 1)); [EOL]     this.direction = direction; [EOL]     this.strict = strict; [EOL]     this.index = index; [EOL]     this.previous = previous; [EOL] } <line_num>: 75,93
public MathArrays.OrderDirection getDirection() { [EOL]     return direction; [EOL] } <line_num>: 98,100
public boolean getStrict() { [EOL]     return strict; [EOL] } <line_num>: 104,106
public int getIndex() { [EOL]     return index; [EOL] } <line_num>: 112,114
public Number getPrevious() { [EOL]     return previous; [EOL] } <line_num>: 118,120
