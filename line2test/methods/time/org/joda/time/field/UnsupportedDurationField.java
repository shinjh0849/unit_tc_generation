private UnsupportedDurationField(DurationFieldType type) { [EOL]     iType = type; [EOL] } <line_num>: 70,72
public static synchronized UnsupportedDurationField getInstance(DurationFieldType type) { [EOL]     UnsupportedDurationField field; [EOL]     if (cCache == null) { [EOL]         cCache = new HashMap<DurationFieldType, UnsupportedDurationField>(7); [EOL]         field = null; [EOL]     } else { [EOL]         field = cCache.get(type); [EOL]     } [EOL]     if (field == null) { [EOL]         field = new UnsupportedDurationField(type); [EOL]         cCache.put(type, field); [EOL]     } [EOL]     return field; [EOL] } <line_num>: 47,60
public final DurationFieldType getType() { [EOL]     return iType; [EOL] } <line_num>: 78,80
public String getName() { [EOL]     return iType.getName(); [EOL] } <line_num>: 82,84
public boolean isSupported() { [EOL]     return false; [EOL] } <line_num>: 91,93
public boolean isPrecise() { [EOL]     return true; [EOL] } <line_num>: 100,102
public int getValue(long duration) { [EOL]     throw unsupported(); [EOL] } <line_num>: 109,111
public long getValueAsLong(long duration) { [EOL]     throw unsupported(); [EOL] } <line_num>: 118,120
public int getValue(long duration, long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 127,129
public long getValueAsLong(long duration, long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 136,138
public long getMillis(int value) { [EOL]     throw unsupported(); [EOL] } <line_num>: 145,147
public long getMillis(long value) { [EOL]     throw unsupported(); [EOL] } <line_num>: 154,156
public long getMillis(int value, long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 163,165
public long getMillis(long value, long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 172,174
public long add(long instant, int value) { [EOL]     throw unsupported(); [EOL] } <line_num>: 181,183
public long add(long instant, long value) { [EOL]     throw unsupported(); [EOL] } <line_num>: 190,192
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 199,201
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 208,210
public long getUnitMillis() { [EOL]     return 0; [EOL] } <line_num>: 217,219
public int compareTo(DurationField durationField) { [EOL]     return 0; [EOL] } <line_num>: 226,228
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } else if (obj instanceof UnsupportedDurationField) { [EOL]         UnsupportedDurationField other = (UnsupportedDurationField) obj; [EOL]         if (other.getName() == null) { [EOL]             return (getName() == null); [EOL]         } [EOL]         return (other.getName().equals(getName())); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 237,248
public int hashCode() { [EOL]     return getName().hashCode(); [EOL] } <line_num>: 255,257
public String toString() { [EOL]     return "UnsupportedDurationField[" + getName() + ']'; [EOL] } <line_num>: 264,266
private Object readResolve() { [EOL]     return getInstance(iType); [EOL] } <line_num>: 271,273
private UnsupportedOperationException unsupported() { [EOL]     return new UnsupportedOperationException(iType + " field is unsupported"); [EOL] } <line_num>: 275,277
