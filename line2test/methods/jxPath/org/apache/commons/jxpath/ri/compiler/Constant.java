public Constant(Number number) { [EOL]     this.value = number; [EOL] } <line_num>: 31,33
public Constant(String string) { [EOL]     this.value = string; [EOL] } <line_num>: 35,37
public Object compute(EvalContext context) { [EOL]     return value; [EOL] } <line_num>: 39,41
public Object computeValue(EvalContext context) { [EOL]     return value; [EOL] } <line_num>: 46,48
public boolean isContextDependent() { [EOL]     return false; [EOL] } <line_num>: 53,55
public boolean computeContextDependent() { [EOL]     return false; [EOL] } <line_num>: 60,62
public String toString() { [EOL]     if (value instanceof Number) { [EOL]         double doubleValue = ((Number) value).doubleValue(); [EOL]         long longValue = ((Number) value).longValue(); [EOL]         if (doubleValue == longValue) { [EOL]             return String.valueOf(longValue); [EOL]         } else { [EOL]             return String.valueOf(doubleValue); [EOL]         } [EOL]     } else { [EOL]         return "'" + value + "'"; [EOL]     } [EOL] } <line_num>: 64,78
