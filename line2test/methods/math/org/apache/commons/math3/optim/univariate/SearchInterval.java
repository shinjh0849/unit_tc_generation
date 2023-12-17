public SearchInterval(double lo, double hi, double init) { [EOL]     if (lo >= hi) { [EOL]         throw new NumberIsTooLargeException(lo, hi, false); [EOL]     } [EOL]     if (init < lo || init > hi) { [EOL]         throw new OutOfRangeException(init, lo, hi); [EOL]     } [EOL]     lower = lo; [EOL]     upper = hi; [EOL]     start = init; [EOL] } <line_num>: 46,60
public SearchInterval(double lo, double hi) { [EOL]     this(lo, hi, 0.5 * (lo + hi)); [EOL] } <line_num>: 67,70
public double getMin() { [EOL]     return lower; [EOL] } <line_num>: 77,79
public double getMax() { [EOL]     return upper; [EOL] } <line_num>: 85,87
public double getStartValue() { [EOL]     return start; [EOL] } <line_num>: 93,95
