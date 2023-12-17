GJEraDateTimeField(BasicChronology chronology) { [EOL]     super(DateTimeFieldType.era()); [EOL]     iChronology = chronology; [EOL] } <line_num>: 46,49
public boolean isLenient() { [EOL]     return false; [EOL] } <line_num>: 51,53
public int get(long instant) { [EOL]     if (iChronology.getYear(instant) <= 0) { [EOL]         return DateTimeConstants.BCE; [EOL]     } else { [EOL]         return DateTimeConstants.CE; [EOL]     } [EOL] } <line_num>: 60,66
public String getAsText(int fieldValue, Locale locale) { [EOL]     return GJLocaleSymbols.forLocale(locale).eraValueToText(fieldValue); [EOL] } <line_num>: 68,70
public long set(long instant, int era) { [EOL]     FieldUtils.verifyValueBounds(this, era, DateTimeConstants.BCE, DateTimeConstants.CE); [EOL]     int oldEra = get(instant); [EOL]     if (oldEra != era) { [EOL]         int year = iChronology.getYear(instant); [EOL]         return iChronology.setYear(instant, -year); [EOL]     } else { [EOL]         return instant; [EOL]     } [EOL] } <line_num>: 80,90
public long set(long instant, String text, Locale locale) { [EOL]     return set(instant, GJLocaleSymbols.forLocale(locale).eraTextToValue(text)); [EOL] } <line_num>: 92,94
public long roundFloor(long instant) { [EOL]     if (get(instant) == DateTimeConstants.CE) { [EOL]         return iChronology.setYear(0, 1); [EOL]     } else { [EOL]         return Long.MIN_VALUE; [EOL]     } [EOL] } <line_num>: 96,102
public long roundCeiling(long instant) { [EOL]     if (get(instant) == DateTimeConstants.BCE) { [EOL]         return iChronology.setYear(0, 1); [EOL]     } else { [EOL]         return Long.MAX_VALUE; [EOL]     } [EOL] } <line_num>: 104,110
public long roundHalfFloor(long instant) { [EOL]     return roundFloor(instant); [EOL] } <line_num>: 112,115
public long roundHalfCeiling(long instant) { [EOL]     return roundFloor(instant); [EOL] } <line_num>: 117,120
public long roundHalfEven(long instant) { [EOL]     return roundFloor(instant); [EOL] } <line_num>: 122,125
public DurationField getDurationField() { [EOL]     return UnsupportedDurationField.getInstance(DurationFieldType.eras()); [EOL] } <line_num>: 127,129
public DurationField getRangeDurationField() { [EOL]     return null; [EOL] } <line_num>: 131,133
public int getMinimumValue() { [EOL]     return DateTimeConstants.BCE; [EOL] } <line_num>: 135,137
public int getMaximumValue() { [EOL]     return DateTimeConstants.CE; [EOL] } <line_num>: 139,141
public int getMaximumTextLength(Locale locale) { [EOL]     return GJLocaleSymbols.forLocale(locale).getEraMaxTextLength(); [EOL] } <line_num>: 143,145
private Object readResolve() { [EOL]     return iChronology.era(); [EOL] } <line_num>: 150,152
