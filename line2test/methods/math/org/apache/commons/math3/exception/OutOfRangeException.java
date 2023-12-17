public OutOfRangeException(Number wrong, Number lo, Number hi) { [EOL]     this(LocalizedFormats.OUT_OF_RANGE_SIMPLE, wrong, lo, hi); [EOL] } <line_num>: 43,47
public OutOfRangeException(Localizable specific, Number wrong, Number lo, Number hi) { [EOL]     super(specific, wrong, lo, hi); [EOL]     this.lo = lo; [EOL]     this.hi = hi; [EOL] } <line_num>: 58,65
public Number getLo() { [EOL]     return lo; [EOL] } <line_num>: 70,72
public Number getHi() { [EOL]     return hi; [EOL] } <line_num>: 76,78
