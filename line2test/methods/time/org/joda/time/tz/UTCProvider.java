public UTCProvider() { [EOL]     super(); [EOL] } <line_num>: 36,38
public DateTimeZone getZone(String id) { [EOL]     if ("UTC".equalsIgnoreCase(id)) { [EOL]         return DateTimeZone.UTC; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 44,49
public Set<String> getAvailableIDs() { [EOL]     return Collections.singleton("UTC"); [EOL] } <line_num>: 54,56
