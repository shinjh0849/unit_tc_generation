protected OptionalHandlerFactory()
public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc)
public JsonDeserializer<?> findDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
private Object instantiate(String className)
private boolean doesImplement(Class<?> actualType, String classNameToImplement)
private boolean hasInterface(Class<?> type, String interfaceToImplement)
private boolean hasSupertypeStartingWith(Class<?> rawType, String prefix)
private boolean hasInterfaceStartingWith(Class<?> type, String prefix)
long serialVersionUID=Optional[1]
String PACKAGE_PREFIX_JAVAX_XML=Optional["javax.xml."]
String SERIALIZERS_FOR_JAVAX_XML=Optional["com.fasterxml.jackson.databind.ext.CoreXMLSerializers"]
String DESERIALIZERS_FOR_JAVAX_XML=Optional["com.fasterxml.jackson.databind.ext.CoreXMLDeserializers"]
String CLASS_NAME_DOM_NODE=Optional["org.w3c.dom.Node"]
String CLASS_NAME_DOM_DOCUMENT=Optional["org.w3c.dom.Node"]
String SERIALIZER_FOR_DOM_NODE=Optional["com.fasterxml.jackson.databind.ext.DOMSerializer"]
String DESERIALIZER_FOR_DOM_DOCUMENT=Optional["com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"]
String DESERIALIZER_FOR_DOM_NODE=Optional["com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer"]
OptionalHandlerFactory instance=Optional[new OptionalHandlerFactory()]
