@JsonValue [EOL] public String value() { [EOL]     return this.name().toLowerCase(); [EOL] } <line_num>: 18,21
@JsonCreator [EOL] public static JsonFormatTypes forValue(String s) { [EOL]     return valueOf(s.toUpperCase()); [EOL] } <line_num>: 23,26
