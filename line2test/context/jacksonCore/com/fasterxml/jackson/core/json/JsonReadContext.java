public JsonReadContext(JsonReadContext parent, int type, int lineNr, int colNr)
protected void reset(int type, int lineNr, int colNr)
public static JsonReadContext createRootContext(int lineNr, int colNr)
public static JsonReadContext createRootContext()
public JsonReadContext createChildArrayContext(int lineNr, int colNr)
public JsonReadContext createChildObjectContext(int lineNr, int colNr)
public String getCurrentName()
public JsonReadContext getParent()
public JsonLocation getStartLocation(Object srcRef)
public boolean expectComma()
public void setCurrentName(String name)
public String toString()
JsonReadContext _parent
int _lineNr
int _columnNr
String _currentName
JsonReadContext _child=Optional[null]
