public PropertyBuilder(SerializationConfig config, BeanDescription beanDesc)
public Annotations getClassAnnotations()
protected BeanPropertyWriter buildWriter(BeanPropertyDefinition propDef, JavaType declaredType, JsonSerializer<?> ser, TypeSerializer typeSer, TypeSerializer contentTypeSer, AnnotatedMember am, boolean defaultUseStaticTyping)
protected JavaType findSerializationType(Annotated a, boolean useStaticTyping, JavaType declaredType)
protected Object getDefaultBean()
protected Object getDefaultValue(String name, AnnotatedMember member)
protected Object _throwWrapped(Exception e, String propName, Object defaultBean)
SerializationConfig _config
BeanDescription _beanDesc
JsonInclude.Include _outputProps
AnnotationIntrospector _annotationIntrospector
Object _defaultBean
