public abstract String getModuleName(); <line_num>: 35,35
@Override [EOL] public abstract Version version(); <line_num>: 41,42
public abstract void setupModule(SetupContext context); <line_num>: 55,55
public Version getMapperVersion(); <line_num>: 84,84
public <C extends ObjectCodec> C getOwner(); <line_num>: 105,105
public TypeFactory getTypeFactory(); <line_num>: 116,116
public boolean isEnabled(MapperFeature f); <line_num>: 118,118
public boolean isEnabled(DeserializationFeature f); <line_num>: 120,120
public boolean isEnabled(SerializationFeature f); <line_num>: 122,122
public boolean isEnabled(JsonFactory.Feature f); <line_num>: 124,124
public boolean isEnabled(JsonParser.Feature f); <line_num>: 126,126
public boolean isEnabled(JsonGenerator.Feature f); <line_num>: 128,128
public void addDeserializers(Deserializers d); <line_num>: 143,143
public void addKeyDeserializers(KeyDeserializers s); <line_num>: 150,150
public void addSerializers(Serializers s); <line_num>: 159,159
public void addKeySerializers(Serializers s); <line_num>: 166,166
public void addBeanDeserializerModifier(BeanDeserializerModifier mod); <line_num>: 180,180
public void addBeanSerializerModifier(BeanSerializerModifier mod); <line_num>: 188,188
public void addAbstractTypeResolver(AbstractTypeResolver resolver); <line_num>: 197,197
public void addTypeModifier(TypeModifier modifier); <line_num>: 206,206
public void addValueInstantiators(ValueInstantiators instantiators); <line_num>: 216,216
public void setClassIntrospector(ClassIntrospector ci); <line_num>: 226,226
public void insertAnnotationIntrospector(AnnotationIntrospector ai); <line_num>: 235,235
public void appendAnnotationIntrospector(AnnotationIntrospector ai); <line_num>: 244,244
public void registerSubtypes(Class<?>... subtypes); <line_num>: 250,250
public void registerSubtypes(NamedType... subtypes); <line_num>: 256,256
public void setMixInAnnotations(Class<?> target, Class<?> mixinSource); <line_num>: 276,276
public void addDeserializationProblemHandler(DeserializationProblemHandler handler); <line_num>: 283,283
