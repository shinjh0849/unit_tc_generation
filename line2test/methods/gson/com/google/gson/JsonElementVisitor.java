void visitPrimitive(JsonPrimitive primitive) throws IOException; <line_num>: 27,27
void visitNull() throws IOException; <line_num>: 28,28
void startArray(JsonArray array) throws IOException; <line_num>: 30,30
void visitArrayMember(JsonArray parent, JsonPrimitive member, boolean isFirst) throws IOException; <line_num>: 31,31
void visitArrayMember(JsonArray parent, JsonArray member, boolean isFirst) throws IOException; <line_num>: 32,32
void visitArrayMember(JsonArray parent, JsonObject member, boolean isFirst) throws IOException; <line_num>: 33,33
void visitNullArrayMember(JsonArray parent, boolean isFirst) throws IOException; <line_num>: 34,34
void endArray(JsonArray array) throws IOException; <line_num>: 35,35
void startObject(JsonObject object) throws IOException; <line_num>: 37,37
void visitObjectMember(JsonObject parent, String memberName, JsonPrimitive member, boolean isFirst) throws IOException; <line_num>: 38,39
void visitObjectMember(JsonObject parent, String memberName, JsonArray member, boolean isFirst) throws IOException; <line_num>: 40,41
void visitObjectMember(JsonObject parent, String memberName, JsonObject member, boolean isFirst) throws IOException; <line_num>: 42,43
void visitNullObjectMember(JsonObject parent, String memberName, boolean isFirst) throws IOException; <line_num>: 44,45
void endObject(JsonObject object) throws IOException; <line_num>: 46,46
