public Chronology getChronology() { [EOL]     return ISOChronology.getInstanceUTC(); [EOL] } <line_num>: 29,31
public int size() { [EOL]     return getFields().length; [EOL] } <line_num>: 32,34
public DateTimeFieldType getFieldType(int index) { [EOL]     return getFields()[index].getType(); [EOL] } <line_num>: 35,37
public DateTimeField getField(int index) { [EOL]     return getFields()[index]; [EOL] } <line_num>: 38,40
public int getValue(int index) { [EOL]     return getValues()[index]; [EOL] } <line_num>: 41,43
public int get(DateTimeFieldType field) { [EOL]     return 0; [EOL] } <line_num>: 44,46
public boolean isSupported(DateTimeFieldType field) { [EOL]     return false; [EOL] } <line_num>: 47,49
public DateTime toDateTime(DateTimeZone zone) { [EOL]     return null; [EOL] } <line_num>: 50,52
public DateTime toDateTime(ReadableInstant base) { [EOL]     return null; [EOL] } <line_num>: 53,55
public DateTimeField[] getFields() { [EOL]     return new DateTimeField[0]; [EOL] } <line_num>: 56,58
public int[] getValues() { [EOL]     return new int[0]; [EOL] } <line_num>: 59,61
public int compareTo(ReadablePartial partial) { [EOL]     return 0; [EOL] } <line_num>: 62,64
