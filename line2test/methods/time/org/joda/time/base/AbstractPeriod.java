protected AbstractPeriod() { [EOL]     super(); [EOL] } <line_num>: 44,46
public int size() { [EOL]     return getPeriodType().size(); [EOL] } <line_num>: 55,57
public DurationFieldType getFieldType(int index) { [EOL]     return getPeriodType().getFieldType(index); [EOL] } <line_num>: 67,69
public DurationFieldType[] getFieldTypes() { [EOL]     DurationFieldType[] result = new DurationFieldType[size()]; [EOL]     for (int i = 0; i < result.length; i++) { [EOL]         result[i] = getFieldType(i); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 78,84
public int[] getValues() { [EOL]     int[] result = new int[size()]; [EOL]     for (int i = 0; i < result.length; i++) { [EOL]         result[i] = getValue(i); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 94,100
public int get(DurationFieldType type) { [EOL]     int index = indexOf(type); [EOL]     if (index == -1) { [EOL]         return 0; [EOL]     } [EOL]     return getValue(index); [EOL] } <line_num>: 112,118
public boolean isSupported(DurationFieldType type) { [EOL]     return getPeriodType().isSupported(type); [EOL] } <line_num>: 126,128
public int indexOf(DurationFieldType type) { [EOL]     return getPeriodType().indexOf(type); [EOL] } <line_num>: 136,138
public Period toPeriod() { [EOL]     return new Period(this); [EOL] } <line_num>: 146,148
public MutablePeriod toMutablePeriod() { [EOL]     return new MutablePeriod(this); [EOL] } <line_num>: 157,159
public boolean equals(Object period) { [EOL]     if (this == period) { [EOL]         return true; [EOL]     } [EOL]     if (period instanceof ReadablePeriod == false) { [EOL]         return false; [EOL]     } [EOL]     ReadablePeriod other = (ReadablePeriod) period; [EOL]     if (size() != other.size()) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         if (getValue(i) != other.getValue(i) || getFieldType(i) != other.getFieldType(i)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 182,199
public int hashCode() { [EOL]     int total = 17; [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         total = 27 * total + getValue(i); [EOL]         total = 27 * total + getFieldType(i).hashCode(); [EOL]     } [EOL]     return total; [EOL] } <line_num>: 206,213
@ToString [EOL] public String toString() { [EOL]     return ISOPeriodFormat.standard().print(this); [EOL] } <line_num>: 226,229
public String toString(PeriodFormatter formatter) { [EOL]     if (formatter == null) { [EOL]         return toString(); [EOL]     } [EOL]     return formatter.print(this); [EOL] } <line_num>: 239,244
