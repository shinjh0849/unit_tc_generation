public IllegalFieldValueException(DateTimeFieldType fieldType, Number value, Number lowerBound, Number upperBound)
public IllegalFieldValueException(DateTimeFieldType fieldType, Number value, String explain)
public IllegalFieldValueException(DurationFieldType fieldType, Number value, Number lowerBound, Number upperBound)
public IllegalFieldValueException(String fieldName, Number value, Number lowerBound, Number upperBound)
public IllegalFieldValueException(DateTimeFieldType fieldType, String value)
public IllegalFieldValueException(DurationFieldType fieldType, String value)
public IllegalFieldValueException(String fieldName, String value)
private static String createMessage(String fieldName, Number value, Number lowerBound, Number upperBound, String explain)
private static String createMessage(String fieldName, String value)
public DateTimeFieldType getDateTimeFieldType()
public DurationFieldType getDurationFieldType()
public String getFieldName()
public Number getIllegalNumberValue()
public String getIllegalStringValue()
public String getIllegalValueAsString()
public Number getLowerBound()
public Number getUpperBound()
public String getMessage()
public void prependMessage(String message)
long serialVersionUID=Optional[6305711765985447737L]
DateTimeFieldType iDateTimeFieldType
DurationFieldType iDurationFieldType
String iFieldName
Number iNumberValue
String iStringValue
Number iLowerBound
Number iUpperBound
String iMessage
