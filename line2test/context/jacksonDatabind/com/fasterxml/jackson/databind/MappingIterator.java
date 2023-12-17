protected MappingIterator(JavaType type, JsonParser jp, DeserializationContext ctxt, JsonDeserializer<?> deser)
protected MappingIterator(JavaType type, JsonParser jp, DeserializationContext ctxt, JsonDeserializer<?> deser, boolean managedParser, Object valueToUpdate)
protected static MappingIterator<T> emptyIterator()
public boolean hasNext()
public T next()
public void remove()
public void close() throws IOException
public boolean hasNextValue() throws IOException
public T nextValue() throws IOException
public List<T> readAll() throws IOException
public List<T> readAll(List<T> resultList) throws IOException
public JsonParser getParser()
public FormatSchema getParserSchema()
public JsonLocation getCurrentLocation()
MappingIterator<?> EMPTY_ITERATOR=Optional[new MappingIterator<Object>(null, null, null, null, false, null)]
JavaType _type
DeserializationContext _context
JsonDeserializer<T> _deserializer
JsonParser _parser
boolean _closeParser
boolean _hasNextChecked
T _updatedValue
