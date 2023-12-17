public Interval(final double lower, final double upper) { [EOL]     this.lower = lower; [EOL]     this.upper = upper; [EOL] } <line_num>: 39,42
public double getInf() { [EOL]     return lower; [EOL] } <line_num>: 48,50
@Deprecated [EOL] public double getLower() { [EOL]     return getInf(); [EOL] } <line_num>: 56,59
public double getSup() { [EOL]     return upper; [EOL] } <line_num>: 65,67
@Deprecated [EOL] public double getUpper() { [EOL]     return getSup(); [EOL] } <line_num>: 73,76
public double getSize() { [EOL]     return upper - lower; [EOL] } <line_num>: 82,84
@Deprecated [EOL] public double getLength() { [EOL]     return getSize(); [EOL] } <line_num>: 90,93
public double getBarycenter() { [EOL]     return 0.5 * (lower + upper); [EOL] } <line_num>: 99,101
@Deprecated [EOL] public double getMidPoint() { [EOL]     return getBarycenter(); [EOL] } <line_num>: 107,110
public Location checkPoint(final double point, final double tolerance) { [EOL]     if (point < lower - tolerance || point > upper + tolerance) { [EOL]         return Location.OUTSIDE; [EOL]     } else if (point > lower + tolerance && point < upper - tolerance) { [EOL]         return Location.INSIDE; [EOL]     } else { [EOL]         return Location.BOUNDARY; [EOL]     } [EOL] } <line_num>: 120,128
