public DateRange() { [EOL]     this(new Date(0), new Date(1)); [EOL] } <line_num>: 71,73
public DateRange(Date lower, Date upper) { [EOL]     super(lower.getTime(), upper.getTime()); [EOL]     this.lowerDate = lower.getTime(); [EOL]     this.upperDate = upper.getTime(); [EOL] } <line_num>: 81,85
public DateRange(double lower, double upper) { [EOL]     super(lower, upper); [EOL]     this.lowerDate = (long) lower; [EOL]     this.upperDate = (long) upper; [EOL] } <line_num>: 94,98
public DateRange(Range other) { [EOL]     this(other.getLowerBound(), other.getUpperBound()); [EOL] } <line_num>: 108,110
public Date getLowerDate() { [EOL]     return new Date(this.lowerDate); [EOL] } <line_num>: 119,121
public long getLowerMillis() { [EOL]     return this.lowerDate; [EOL] } <line_num>: 132,134
public Date getUpperDate() { [EOL]     return new Date(this.upperDate); [EOL] } <line_num>: 143,145
public long getUpperMillis() { [EOL]     return this.upperDate; [EOL] } <line_num>: 156,158
public String toString() { [EOL]     DateFormat df = DateFormat.getDateTimeInstance(); [EOL]     return "[" + df.format(getLowerDate()) + " --> " + df.format(getUpperDate()) + "]"; [EOL] } <line_num>: 165,169
