public PropertyValueBuffer(JsonParser jp, DeserializationContext ctxt, int paramCount, ObjectIdReader oir)
public void inject(SettableBeanProperty[] injectableProperties)
protected final Object[] getParameters(Object[] defaults)
public boolean readIdProperty(String propName) throws IOException
public Object handleIdValue(final DeserializationContext ctxt, Object bean) throws IOException
protected PropertyValue buffered()
public boolean isComplete()
public boolean assignParameter(int index, Object value)
public void bufferProperty(SettableBeanProperty prop, Object value)
public void bufferAnyProperty(SettableAnyProperty prop, String propName, Object value)
public void bufferMapProperty(Object key, Object value)
JsonParser _parser
DeserializationContext _context
Object[] _creatorParameters
ObjectIdReader _objectIdReader
int _paramsNeeded
PropertyValue _buffered
Object _idValue
