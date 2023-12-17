GJDayOfWeekDateTimeField(BasicChronology chronology, DurationField days) { [EOL]     super(DateTimeFieldType.dayOfWeek(), days); [EOL]     iChronology = chronology; [EOL] } <line_num>: 45,48
public int get(long instant) { [EOL]     return iChronology.getDayOfWeek(instant); [EOL] } <line_num>: 56,58
public String getAsText(int fieldValue, Locale locale) { [EOL]     return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToText(fieldValue); [EOL] } <line_num>: 67,69
public String getAsShortText(int fieldValue, Locale locale) { [EOL]     return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToShortText(fieldValue); [EOL] } <line_num>: 78,80
protected int convertText(String text, Locale locale) { [EOL]     return GJLocaleSymbols.forLocale(locale).dayOfWeekTextToValue(text); [EOL] } <line_num>: 90,92
public DurationField getRangeDurationField() { [EOL]     return iChronology.weeks(); [EOL] } <line_num>: 94,96
public int getMinimumValue() { [EOL]     return DateTimeConstants.MONDAY; [EOL] } <line_num>: 103,105
public int getMaximumValue() { [EOL]     return DateTimeConstants.SUNDAY; [EOL] } <line_num>: 112,114
public int getMaximumTextLength(Locale locale) { [EOL]     return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxTextLength(); [EOL] } <line_num>: 122,124
public int getMaximumShortTextLength(Locale locale) { [EOL]     return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxShortTextLength(); [EOL] } <line_num>: 132,134
private Object readResolve() { [EOL]     return iChronology.dayOfWeek(); [EOL] } <line_num>: 139,141
