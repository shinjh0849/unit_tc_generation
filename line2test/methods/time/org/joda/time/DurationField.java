public abstract DurationFieldType getType(); <line_num>: 37,37
public abstract String getName(); <line_num>: 46,46
public abstract boolean isSupported(); <line_num>: 53,53
public abstract boolean isPrecise(); <line_num>: 63,63
public abstract long getUnitMillis(); <line_num>: 76,76
public abstract int getValue(long duration); <line_num>: 88,88
public abstract long getValueAsLong(long duration); <line_num>: 98,98
public abstract int getValue(long duration, long instant); <line_num>: 114,114
public abstract long getValueAsLong(long duration, long instant); <line_num>: 129,129
public abstract long getMillis(int value); <line_num>: 140,140
public abstract long getMillis(long value); <line_num>: 150,150
public abstract long getMillis(int value, long instant); <line_num>: 165,165
public abstract long getMillis(long value, long instant); <line_num>: 180,180
public abstract long add(long instant, int value); <line_num>: 189,189
public abstract long add(long instant, long value); <line_num>: 198,198
public long subtract(long instant, int value) { [EOL]     if (value == Integer.MIN_VALUE) { [EOL]         return subtract(instant, (long) value); [EOL]     } [EOL]     return add(instant, -value); [EOL] } <line_num>: 208,213
public long subtract(long instant, long value) { [EOL]     if (value == Long.MIN_VALUE) { [EOL]         throw new ArithmeticException("Long.MIN_VALUE cannot be negated"); [EOL]     } [EOL]     return add(instant, -value); [EOL] } <line_num>: 223,228
public abstract int getDifference(long minuendInstant, long subtrahendInstant); <line_num>: 249,249
public abstract long getDifferenceAsLong(long minuendInstant, long subtrahendInstant); <line_num>: 270,270
public abstract String toString(); <line_num>: 318,318
