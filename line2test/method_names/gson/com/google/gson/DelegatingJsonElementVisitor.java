protected DelegatingJsonElementVisitor(JsonElementVisitor delegate)
public void endArray(JsonArray array) throws IOException
public void endObject(JsonObject object) throws IOException
public void startArray(JsonArray array) throws IOException
public void startObject(JsonObject object) throws IOException
public void visitArrayMember(JsonArray parent, JsonPrimitive member, boolean isFirst) throws IOException
public void visitArrayMember(JsonArray parent, JsonArray member, boolean isFirst) throws IOException
public void visitArrayMember(JsonArray parent, JsonObject member, boolean isFirst) throws IOException
public void visitObjectMember(JsonObject parent, String memberName, JsonPrimitive member, boolean isFirst) throws IOException
public void visitObjectMember(JsonObject parent, String memberName, JsonArray member, boolean isFirst) throws IOException
public void visitObjectMember(JsonObject parent, String memberName, JsonObject member, boolean isFirst) throws IOException
public void visitNullObjectMember(JsonObject parent, String memberName, boolean isFirst) throws IOException
public void visitPrimitive(JsonPrimitive primitive) throws IOException
public void visitNull() throws IOException
public void visitNullArrayMember(JsonArray parent, boolean isFirst) throws IOException
