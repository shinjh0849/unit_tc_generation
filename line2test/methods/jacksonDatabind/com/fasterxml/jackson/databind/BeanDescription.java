protected BeanDescription(JavaType type) { [EOL]     _type = type; [EOL] } <line_num>: 42,45
public JavaType getType() { [EOL]     return _type; [EOL] } <line_num>: 57,57
public Class<?> getBeanClass() { [EOL]     return _type.getRawClass(); [EOL] } <line_num>: 59,59
public abstract AnnotatedClass getClassInfo(); <line_num>: 65,65
public abstract ObjectIdInfo getObjectIdInfo(); <line_num>: 71,71
public abstract boolean hasKnownClassAnnotations(); <line_num>: 77,77
public abstract TypeBindings bindingsForBeanType(); <line_num>: 84,84
public abstract JavaType resolveType(java.lang.reflect.Type jdkType); <line_num>: 90,90
public abstract Annotations getClassAnnotations(); <line_num>: 96,96
public abstract List<BeanPropertyDefinition> findProperties(); <line_num>: 108,108
public abstract Map<String, AnnotatedMember> findBackReferenceProperties(); <line_num>: 113,113
public abstract Set<String> getIgnoredPropertyNames(); <line_num>: 115,115
public abstract List<AnnotatedConstructor> getConstructors(); <line_num>: 123,123
public abstract List<AnnotatedMethod> getFactoryMethods(); <line_num>: 125,125
public abstract AnnotatedConstructor findDefaultConstructor(); <line_num>: 132,132
public abstract Constructor<?> findSingleArgConstructor(Class<?>... argTypes); <line_num>: 140,140
public abstract Method findFactoryMethod(Class<?>... expArgTypes); <line_num>: 151,151
public abstract AnnotatedMember findAnyGetter(); <line_num>: 159,159
public abstract AnnotatedMethod findAnySetter(); <line_num>: 170,170
public abstract AnnotatedMethod findJsonValueMethod(); <line_num>: 178,178
public abstract AnnotatedMethod findMethod(String name, Class<?>[] paramTypes); <line_num>: 180,180
public abstract JsonInclude.Include findSerializationInclusion(JsonInclude.Include defValue); <line_num>: 188,188
public abstract JsonFormat.Value findExpectedFormat(JsonFormat.Value defValue); <line_num>: 197,197
public abstract Converter<Object, Object> findSerializationConverter(); <line_num>: 205,205
public abstract Converter<Object, Object> findDeserializationConverter(); <line_num>: 213,213
public abstract Map<Object, AnnotatedMember> findInjectables(); <line_num>: 221,221
public abstract Class<?> findPOJOBuilder(); <line_num>: 229,229
public abstract JsonPOJOBuilder.Value findPOJOBuilderConfig(); <line_num>: 234,234
public abstract Object instantiateBean(boolean fixAccess); <line_num>: 248,248
