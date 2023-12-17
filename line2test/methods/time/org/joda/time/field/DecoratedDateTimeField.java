protected DecoratedDateTimeField(DateTimeField field, DateTimeFieldType type) { [EOL]     super(type); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     if (!field.isSupported()) { [EOL]         throw new IllegalArgumentException("The field must be supported"); [EOL]     } [EOL]     iField = field; [EOL] } <line_num>: 54,63
public final DateTimeField getWrappedField() { [EOL]     return iField; [EOL] } <line_num>: 70,72
public boolean isLenient() { [EOL]     return iField.isLenient(); [EOL] } <line_num>: 74,76
public int get(long instant) { [EOL]     return iField.get(instant); [EOL] } <line_num>: 78,80
public long set(long instant, int value) { [EOL]     return iField.set(instant, value); [EOL] } <line_num>: 82,84
public DurationField getDurationField() { [EOL]     return iField.getDurationField(); [EOL] } <line_num>: 86,88
public DurationField getRangeDurationField() { [EOL]     return iField.getRangeDurationField(); [EOL] } <line_num>: 90,92
public int getMinimumValue() { [EOL]     return iField.getMinimumValue(); [EOL] } <line_num>: 94,96
public int getMaximumValue() { [EOL]     return iField.getMaximumValue(); [EOL] } <line_num>: 98,100
public long roundFloor(long instant) { [EOL]     return iField.roundFloor(instant); [EOL] } <line_num>: 102,104
