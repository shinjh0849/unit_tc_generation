public JsonObject() { [EOL]     members = new LinkedHashMap<String, JsonElement>(); [EOL] } <line_num>: 42,44
public void add(String property, JsonElement value) { [EOL]     Preconditions.checkArgument(property != null); [EOL]     if (value == null) { [EOL]         value = JsonNull.createJsonNull(); [EOL]     } [EOL]     members.put(property, value); [EOL] } <line_num>: 54,60
public JsonElement remove(String property) { [EOL]     return members.remove(property); [EOL] } <line_num>: 69,71
public void addProperty(String property, String value) { [EOL]     add(property, createJsonElement(value)); [EOL] } <line_num>: 80,82
public void addProperty(String property, Number value) { [EOL]     add(property, createJsonElement(value)); [EOL] } <line_num>: 91,93
public void addProperty(String property, Boolean value) { [EOL]     add(property, createJsonElement(value)); [EOL] } <line_num>: 102,104
public void addProperty(String property, Character value) { [EOL]     add(property, createJsonElement(value)); [EOL] } <line_num>: 113,115
private JsonElement createJsonElement(Object value) { [EOL]     return value == null ? JsonNull.createJsonNull() : new JsonPrimitive(value); [EOL] } <line_num>: 123,125
public Set<Map.Entry<String, JsonElement>> entrySet() { [EOL]     return members.entrySet(); [EOL] } <line_num>: 133,135
public boolean has(String memberName) { [EOL]     return members.containsKey(memberName); [EOL] } <line_num>: 143,145
public JsonElement get(String memberName) { [EOL]     if (members.containsKey(memberName)) { [EOL]         JsonElement member = members.get(memberName); [EOL]         return member == null ? JsonNull.createJsonNull() : member; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 153,159
public JsonPrimitive getAsJsonPrimitive(String memberName) { [EOL]     return (JsonPrimitive) members.get(memberName); [EOL] } <line_num>: 167,169
public JsonArray getAsJsonArray(String memberName) { [EOL]     return (JsonArray) members.get(memberName); [EOL] } <line_num>: 177,179
public JsonObject getAsJsonObject(String memberName) { [EOL]     return (JsonObject) members.get(memberName); [EOL] } <line_num>: 187,189
@Override [EOL] protected void toString(Appendable sb, Escaper escaper) throws IOException { [EOL]     sb.append('{'); [EOL]     boolean first = true; [EOL]     for (Map.Entry<String, JsonElement> entry : members.entrySet()) { [EOL]         if (first) { [EOL]             first = false; [EOL]         } else { [EOL]             sb.append(','); [EOL]         } [EOL]         sb.append('\"'); [EOL]         sb.append(escaper.escapeJsonString(entry.getKey())); [EOL]         sb.append("\":"); [EOL]         entry.getValue().toString(sb, escaper); [EOL]     } [EOL]     sb.append('}'); [EOL] } <line_num>: 191,207
