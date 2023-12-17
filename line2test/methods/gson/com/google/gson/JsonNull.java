public JsonNull() { [EOL] } <line_num>: 34,36
@Override [EOL] protected void toString(Appendable sb, Escaper escaper) throws IOException { [EOL]     sb.append("null"); [EOL] } <line_num>: 38,41
@Override [EOL] public int hashCode() { [EOL]     return JsonNull.class.hashCode(); [EOL] } <line_num>: 46,49
@Override [EOL] public boolean equals(Object other) { [EOL]     return other instanceof JsonNull; [EOL] } <line_num>: 54,57
static JsonNull createJsonNull() { [EOL]     return INSTANCE; [EOL] } <line_num>: 69,71
