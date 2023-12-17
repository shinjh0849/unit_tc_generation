@JsonCreator [EOL] public JsonSchema(ObjectNode schema) { [EOL]     this.schema = schema; [EOL] } <line_num>: 35,39
@JsonValue [EOL] public ObjectNode getSchemaNode() { [EOL]     return schema; [EOL] } <line_num>: 50,54
@Override [EOL] public String toString() { [EOL]     return this.schema.toString(); [EOL] } <line_num>: 56,60
@Override [EOL] public int hashCode() { [EOL]     return schema.hashCode(); [EOL] } <line_num>: 62,66
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (!(o instanceof JsonSchema)) [EOL]         return false; [EOL]     JsonSchema other = (JsonSchema) o; [EOL]     if (schema == null) { [EOL]         return other.schema == null; [EOL]     } [EOL]     return schema.equals(other.schema); [EOL] } <line_num>: 68,80
public static JsonNode getDefaultSchemaNode() { [EOL]     ObjectNode objectNode = JsonNodeFactory.instance.objectNode(); [EOL]     objectNode.put("type", "any"); [EOL]     return objectNode; [EOL] } <line_num>: 87,94
