protected DelegatingJsonElementVisitor(JsonElementVisitor delegate) { [EOL]     Preconditions.checkNotNull(delegate); [EOL]     this.delegate = delegate; [EOL] } <line_num>: 50,53
public void endArray(JsonArray array) throws IOException { [EOL]     delegate.endArray(array); [EOL] } <line_num>: 55,57
public void endObject(JsonObject object) throws IOException { [EOL]     delegate.endObject(object); [EOL] } <line_num>: 59,61
public void startArray(JsonArray array) throws IOException { [EOL]     delegate.startArray(array); [EOL] } <line_num>: 63,65
public void startObject(JsonObject object) throws IOException { [EOL]     delegate.startObject(object); [EOL] } <line_num>: 67,69
public void visitArrayMember(JsonArray parent, JsonPrimitive member, boolean isFirst) throws IOException { [EOL]     delegate.visitArrayMember(parent, member, isFirst); [EOL] } <line_num>: 71,74
public void visitArrayMember(JsonArray parent, JsonArray member, boolean isFirst) throws IOException { [EOL]     delegate.visitArrayMember(parent, member, isFirst); [EOL] } <line_num>: 76,79
public void visitArrayMember(JsonArray parent, JsonObject member, boolean isFirst) throws IOException { [EOL]     delegate.visitArrayMember(parent, member, isFirst); [EOL] } <line_num>: 81,84
public void visitObjectMember(JsonObject parent, String memberName, JsonPrimitive member, boolean isFirst) throws IOException { [EOL]     delegate.visitObjectMember(parent, memberName, member, isFirst); [EOL] } <line_num>: 86,89
public void visitObjectMember(JsonObject parent, String memberName, JsonArray member, boolean isFirst) throws IOException { [EOL]     delegate.visitObjectMember(parent, memberName, member, isFirst); [EOL] } <line_num>: 91,94
public void visitObjectMember(JsonObject parent, String memberName, JsonObject member, boolean isFirst) throws IOException { [EOL]     delegate.visitObjectMember(parent, memberName, member, isFirst); [EOL] } <line_num>: 96,99
public void visitNullObjectMember(JsonObject parent, String memberName, boolean isFirst) throws IOException { [EOL]     delegate.visitNullObjectMember(parent, memberName, isFirst); [EOL] } <line_num>: 101,104
public void visitPrimitive(JsonPrimitive primitive) throws IOException { [EOL]     delegate.visitPrimitive(primitive); [EOL] } <line_num>: 106,108
public void visitNull() throws IOException { [EOL]     delegate.visitNull(); [EOL] } <line_num>: 110,112
public void visitNullArrayMember(JsonArray parent, boolean isFirst) throws IOException { [EOL]     delegate.visitNullArrayMember(parent, isFirst); [EOL] } <line_num>: 114,116
