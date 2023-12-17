BasicSingleEraDateTimeField(String text) { [EOL]     super(DateTimeFieldType.era()); [EOL]     iEraText = text; [EOL] } <line_num>: 50,53
public boolean isLenient() { [EOL]     return false; [EOL] } <line_num>: 56,58
public int get(long instant) { [EOL]     return ERA_VALUE; [EOL] } <line_num>: 61,63
public long set(long instant, int era) { [EOL]     FieldUtils.verifyValueBounds(this, era, ERA_VALUE, ERA_VALUE); [EOL]     return instant; [EOL] } <line_num>: 66,69
public long set(long instant, String text, Locale locale) { [EOL]     if (iEraText.equals(text) == false && "1".equals(text) == false) { [EOL]         throw new IllegalFieldValueException(DateTimeFieldType.era(), text); [EOL]     } [EOL]     return instant; [EOL] } <line_num>: 72,77
public long roundFloor(long instant) { [EOL]     return Long.MIN_VALUE; [EOL] } <line_num>: 80,82
public long roundCeiling(long instant) { [EOL]     return Long.MAX_VALUE; [EOL] } <line_num>: 85,87
public long roundHalfFloor(long instant) { [EOL]     return Long.MIN_VALUE; [EOL] } <line_num>: 90,92
public long roundHalfCeiling(long instant) { [EOL]     return Long.MIN_VALUE; [EOL] } <line_num>: 95,97
public long roundHalfEven(long instant) { [EOL]     return Long.MIN_VALUE; [EOL] } <line_num>: 100,102
public DurationField getDurationField() { [EOL]     return UnsupportedDurationField.getInstance(DurationFieldType.eras()); [EOL] } <line_num>: 105,107
public DurationField getRangeDurationField() { [EOL]     return null; [EOL] } <line_num>: 110,112
public int getMinimumValue() { [EOL]     return ERA_VALUE; [EOL] } <line_num>: 115,117
public int getMaximumValue() { [EOL]     return ERA_VALUE; [EOL] } <line_num>: 120,122
public String getAsText(int fieldValue, Locale locale) { [EOL]     return iEraText; [EOL] } <line_num>: 125,127
public int getMaximumTextLength(Locale locale) { [EOL]     return iEraText.length(); [EOL] } <line_num>: 130,132
