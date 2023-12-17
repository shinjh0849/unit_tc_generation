protected JsonWriteContext(int type, JsonWriteContext parent)
public static JsonWriteContext createRootContext()
private JsonWriteContext reset(int type)
public final JsonWriteContext createChildArrayContext()
public final JsonWriteContext createChildObjectContext()
public final JsonWriteContext getParent()
public final String getCurrentName()
public final int writeFieldName(String name)
public final int writeValue()
protected final void appendDesc(StringBuilder sb)
public final String toString()
int STATUS_OK_AS_IS=Optional[0]
int STATUS_OK_AFTER_COMMA=Optional[1]
int STATUS_OK_AFTER_COLON=Optional[2]
int STATUS_OK_AFTER_SPACE=Optional[3]
int STATUS_EXPECT_VALUE=Optional[4]
int STATUS_EXPECT_NAME=Optional[5]
JsonWriteContext _parent
String _currentName
JsonWriteContext _child=Optional[null]
