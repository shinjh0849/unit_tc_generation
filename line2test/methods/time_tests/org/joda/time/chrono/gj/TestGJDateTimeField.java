public TestGJDateTimeField(DateTimeFieldType type, long unitMillis, TestGJChronology chrono) { [EOL]     super(type, unitMillis); [EOL]     iChronology = chrono; [EOL] } <line_num>: 28,31
public boolean isLenient() { [EOL]     return false; [EOL] } <line_num>: 33,35
public long add(long instant, int value) { [EOL]     return add(instant, (long) value); [EOL] } <line_num>: 37,39
public abstract long add(long instant, long value); <line_num>: 41,41
