public QNameDeserializer()
public QName getQname()
public void setQname(QName qname)
public String getAttributeProperty()
public void setAttributeProperty(String attributeProperty)
public String getElementProperty()
public void setElementProperty(String elementProperty)
public List<String> getWrappedElementProperty()
public void setWrappedElementProperty(List<String> wrappedElementProperty)
public EnumExample getEnumProperty()
public void setEnumProperty(EnumExample enumProperty)
public void serialize(QName value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public QName deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public String findEnumValue(Enum<?> value)
public void testSerializeDeserializeWithJaxbAnnotations() throws Exception
public void testJsonTypeResolver() throws Exception
public void testIgnoredType() throws Exception
public void testEnumHandling() throws Exception
