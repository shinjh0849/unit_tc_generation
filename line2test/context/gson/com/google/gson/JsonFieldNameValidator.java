public String validate(String fieldName)
String COMMON_PATTERN=Optional["[a-zA-Z][a-zA-Z0-9\\ \\$_\\-]*$"]
Pattern JSON_FIELD_NAME_PATTERN=Optional[Pattern.compile("(^" + COMMON_PATTERN + ")|(^[\\$_]" + COMMON_PATTERN + ")")]
