 void visitPrimitive(JsonPrimitive primitive) throws IOException
 void visitNull() throws IOException
 void startArray(JsonArray array) throws IOException
 void visitArrayMember(JsonArray parent, JsonPrimitive member, boolean isFirst) throws IOException
 void visitArrayMember(JsonArray parent, JsonArray member, boolean isFirst) throws IOException
 void visitArrayMember(JsonArray parent, JsonObject member, boolean isFirst) throws IOException
 void visitNullArrayMember(JsonArray parent, boolean isFirst) throws IOException
 void endArray(JsonArray array) throws IOException
 void startObject(JsonObject object) throws IOException
 void visitObjectMember(JsonObject parent, String memberName, JsonPrimitive member, boolean isFirst) throws IOException
 void visitObjectMember(JsonObject parent, String memberName, JsonArray member, boolean isFirst) throws IOException
 void visitObjectMember(JsonObject parent, String memberName, JsonObject member, boolean isFirst) throws IOException
 void visitNullObjectMember(JsonObject parent, String memberName, boolean isFirst) throws IOException
 void endObject(JsonObject object) throws IOException
