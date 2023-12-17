public StandardTickUnitSource() { [EOL]     super(); [EOL] } <line_num>: 61,63
public TickUnit getLargerTickUnit(TickUnit unit) { [EOL]     double x = unit.getSize(); [EOL]     double log = Math.log(x) / LOG_10_VALUE; [EOL]     double higher = Math.ceil(log); [EOL]     return new NumberTickUnit(Math.pow(10, higher), new DecimalFormat("0.0E0")); [EOL] } <line_num>: 72,78
public TickUnit getCeilingTickUnit(TickUnit unit) { [EOL]     return getLargerTickUnit(unit); [EOL] } <line_num>: 88,90
public TickUnit getCeilingTickUnit(double size) { [EOL]     double log = Math.log(size) / LOG_10_VALUE; [EOL]     double higher = Math.ceil(log); [EOL]     return new NumberTickUnit(Math.pow(10, higher), new DecimalFormat("0.0E0")); [EOL] } <line_num>: 100,105
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     return (obj instanceof StandardTickUnitSource); [EOL] } <line_num>: 114,119
public int hashCode() { [EOL]     return 0; [EOL] } <line_num>: 126,128
