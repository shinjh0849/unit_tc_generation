private DiagnosticType(String key, CheckLevel level, MessageFormat format) { [EOL]     this.key = key; [EOL]     this.defaultLevel = level; [EOL]     this.format = format; [EOL]     this.level = this.defaultLevel; [EOL] } <line_num>: 97,103
public static DiagnosticType error(String name, String descriptionFormat) { [EOL]     return make(name, CheckLevel.ERROR, descriptionFormat); [EOL] } <line_num>: 53,55
public static DiagnosticType warning(String name, String descriptionFormat) { [EOL]     return make(name, CheckLevel.WARNING, descriptionFormat); [EOL] } <line_num>: 64,66
public static DiagnosticType disabled(String name, String descriptionFormat) { [EOL]     return make(name, CheckLevel.OFF, descriptionFormat); [EOL] } <line_num>: 75,78
public static DiagnosticType make(String name, CheckLevel level, String descriptionFormat) { [EOL]     return new DiagnosticType(name, level, new MessageFormat(descriptionFormat)); [EOL] } <line_num>: 88,92
String format(Object... arguments) { [EOL]     return format.format(arguments); [EOL] } <line_num>: 109,111
@Override [EOL] public boolean equals(Object type) { [EOL]     return type instanceof DiagnosticType && ((DiagnosticType) type).key.equals(key); [EOL] } <line_num>: 113,117
@Override [EOL] public int hashCode() { [EOL]     return key.hashCode(); [EOL] } <line_num>: 119,122
@Override [EOL] public int compareTo(DiagnosticType diagnosticType) { [EOL]     return key.compareTo(diagnosticType.key); [EOL] } <line_num>: 124,127
@Override [EOL] public String toString() { [EOL]     return key + ": " + format.toPattern(); [EOL] } <line_num>: 129,132
