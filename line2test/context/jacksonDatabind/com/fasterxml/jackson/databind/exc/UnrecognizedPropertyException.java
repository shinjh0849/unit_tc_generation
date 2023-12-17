public UnrecognizedPropertyException(String msg, JsonLocation loc, Class<?> referringClass, String propName, Collection<Object> propertyIds)
public static UnrecognizedPropertyException from(JsonParser jp, Object fromObjectOrClass, String propertyName, Collection<Object> propertyIds)
public String getMessageSuffix()
public Class<?> getReferringClass()
public String getUnrecognizedPropertyName()
public Collection<Object> getKnownPropertyIds()
long serialVersionUID=Optional[1L]
Class<?> _referringClass
String _unrecognizedPropertyName
Collection<Object> _propertyIds
String _propertiesAsString
int MAX_DESC_LENGTH=Optional[200]
