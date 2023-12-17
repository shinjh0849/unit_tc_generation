public ReferenceProperty(Type t, String n) { [EOL]     _type = t; [EOL]     _name = n; [EOL] } <line_num>: 75,78
@Deprecated [EOL] public Pair(AnnotationIntrospector p, AnnotationIntrospector s) { [EOL]     super(p, s); [EOL] } <line_num>: 1130,1133
public static ReferenceProperty managed(String name) { [EOL]     return new ReferenceProperty(Type.MANAGED_REFERENCE, name); [EOL] } <line_num>: 80,80
public static ReferenceProperty back(String name) { [EOL]     return new ReferenceProperty(Type.BACK_REFERENCE, name); [EOL] } <line_num>: 81,81
public Type getType() { [EOL]     return _type; [EOL] } <line_num>: 83,83
public String getName() { [EOL]     return _name; [EOL] } <line_num>: 84,84
public boolean isManagedReference() { [EOL]     return _type == Type.MANAGED_REFERENCE; [EOL] } <line_num>: 86,86
public boolean isBackReference() { [EOL]     return _type == Type.BACK_REFERENCE; [EOL] } <line_num>: 87,87
public static AnnotationIntrospector nopInstance() { [EOL]     return NopAnnotationIntrospector.instance; [EOL] } <line_num>: 101,103
public static AnnotationIntrospector pair(AnnotationIntrospector a1, AnnotationIntrospector a2) { [EOL]     return new AnnotationIntrospectorPair(a1, a2); [EOL] } <line_num>: 105,107
public Collection<AnnotationIntrospector> allIntrospectors() { [EOL]     return Collections.singletonList(this); [EOL] } <line_num>: 126,128
public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> result) { [EOL]     result.add(this); [EOL]     return result; [EOL] } <line_num>: 140,143
@Override [EOL] public abstract Version version(); <line_num>: 151,152
@Deprecated [EOL] public boolean isHandled(Annotation ann) { [EOL]     return false; [EOL] } <line_num>: 166,169
public boolean isAnnotationBundle(Annotation ann) { [EOL]     return false; [EOL] } <line_num>: 178,180
public ObjectIdInfo findObjectIdInfo(Annotated ann) { [EOL]     return null; [EOL] } <line_num>: 198,200
public ObjectIdInfo findObjectReferenceInfo(Annotated ann, ObjectIdInfo objectIdInfo) { [EOL]     return objectIdInfo; [EOL] } <line_num>: 207,209
public PropertyName findRootName(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 227,229
public String[] findPropertiesToIgnore(Annotated ac) { [EOL]     return null; [EOL] } <line_num>: 238,240
public Boolean findIgnoreUnknownProperties(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 245,247
public Boolean isIgnorableType(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 260,262
public Object findFilterId(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 271,273
public Object findNamingStrategy(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 286,288
public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass ac, VisibilityChecker<?> checker) { [EOL]     return checker; [EOL] } <line_num>: 303,306
public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { [EOL]     return null; [EOL] } <line_num>: 328,331
public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> config, AnnotatedMember am, JavaType baseType) { [EOL]     return null; [EOL] } <line_num>: 348,351
public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> config, AnnotatedMember am, JavaType containerType) { [EOL]     return null; [EOL] } <line_num>: 370,373
public List<NamedType> findSubtypes(Annotated a) { [EOL]     return null; [EOL] } <line_num>: 384,386
public String findTypeName(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 393,395
public ReferenceProperty findReferenceType(AnnotatedMember member) { [EOL]     return null; [EOL] } <line_num>: 407,409
public NameTransformer findUnwrappingNameTransformer(AnnotatedMember member) { [EOL]     return null; [EOL] } <line_num>: 419,421
public boolean hasIgnoreMarker(AnnotatedMember m) { [EOL]     return false; [EOL] } <line_num>: 430,432
public Object findInjectableValueId(AnnotatedMember m) { [EOL]     return null; [EOL] } <line_num>: 447,449
public Boolean hasRequiredMarker(AnnotatedMember m) { [EOL]     return null; [EOL] } <line_num>: 458,460
public Class<?>[] findViews(Annotated a) { [EOL]     return null; [EOL] } <line_num>: 475,477
@Deprecated [EOL] public JsonFormat.Value findFormat(AnnotatedMember member) { [EOL]     return null; [EOL] } <line_num>: 489,492
public JsonFormat.Value findFormat(Annotated memberOrClass) { [EOL]     if (memberOrClass instanceof AnnotatedMember) { [EOL]         return findFormat((AnnotatedMember) memberOrClass); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 502,507
public Boolean isTypeId(AnnotatedMember member) { [EOL]     return null; [EOL] } <line_num>: 516,518
public PropertyName findWrapperName(Annotated ann) { [EOL]     return null; [EOL] } <line_num>: 532,534
public Object findSerializer(Annotated am) { [EOL]     return null; [EOL] } <line_num>: 549,551
public Object findKeySerializer(Annotated am) { [EOL]     return null; [EOL] } <line_num>: 560,562
public Object findContentSerializer(Annotated am) { [EOL]     return null; [EOL] } <line_num>: 572,574
public JsonInclude.Include findSerializationInclusion(Annotated a, JsonInclude.Include defValue) { [EOL]     return defValue; [EOL] } <line_num>: 586,588
public Class<?> findSerializationType(Annotated a) { [EOL]     return null; [EOL] } <line_num>: 599,601
public Class<?> findSerializationKeyType(Annotated am, JavaType baseType) { [EOL]     return null; [EOL] } <line_num>: 611,613
public Class<?> findSerializationContentType(Annotated am, JavaType baseType) { [EOL]     return null; [EOL] } <line_num>: 623,625
public JsonSerialize.Typing findSerializationTyping(Annotated a) { [EOL]     return null; [EOL] } <line_num>: 635,637
public Object findSerializationConverter(Annotated a) { [EOL]     return null; [EOL] } <line_num>: 660,662
public Object findSerializationContentConverter(AnnotatedMember a) { [EOL]     return null; [EOL] } <line_num>: 682,684
public String[] findSerializationPropertyOrder(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 696,698
public Boolean findSerializationSortAlphabetically(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 705,707
public PropertyName findNameForSerialization(Annotated a) { [EOL]     String name; [EOL]     if (a instanceof AnnotatedField) { [EOL]         name = findSerializationName((AnnotatedField) a); [EOL]     } else if (a instanceof AnnotatedMethod) { [EOL]         name = findSerializationName((AnnotatedMethod) a); [EOL]     } else { [EOL]         name = null; [EOL]     } [EOL]     if (name != null) { [EOL]         if (name.length() == 0) { [EOL]             return PropertyName.USE_DEFAULT; [EOL]         } [EOL]         return new PropertyName(name); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 729,748
@Deprecated [EOL] public String findSerializationName(AnnotatedMethod am) { [EOL]     return null; [EOL] } <line_num>: 762,765
@Deprecated [EOL] public String findSerializationName(AnnotatedField af) { [EOL]     return null; [EOL] } <line_num>: 779,782
public boolean hasAsValueAnnotation(AnnotatedMethod am) { [EOL]     return false; [EOL] } <line_num>: 793,795
public String findEnumValue(Enum<?> value) { [EOL]     return value.name(); [EOL] } <line_num>: 804,807
public Object findDeserializer(Annotated am) { [EOL]     return null; [EOL] } <line_num>: 822,824
public Object findKeyDeserializer(Annotated am) { [EOL]     return null; [EOL] } <line_num>: 834,836
public Object findContentDeserializer(Annotated am) { [EOL]     return null; [EOL] } <line_num>: 847,849
public Class<?> findDeserializationType(Annotated am, JavaType baseType) { [EOL]     return null; [EOL] } <line_num>: 863,865
public Class<?> findDeserializationKeyType(Annotated am, JavaType baseKeyType) { [EOL]     return null; [EOL] } <line_num>: 877,879
public Class<?> findDeserializationContentType(Annotated am, JavaType baseContentType) { [EOL]     return null; [EOL] } <line_num>: 892,894
public Object findDeserializationConverter(Annotated a) { [EOL]     return null; [EOL] } <line_num>: 918,920
public Object findDeserializationContentConverter(AnnotatedMember a) { [EOL]     return null; [EOL] } <line_num>: 940,942
public Object findValueInstantiator(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 955,957
public Class<?> findPOJOBuilder(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 972,974
public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { [EOL]     return null; [EOL] } <line_num>: 979,981
public PropertyName findNameForDeserialization(Annotated a) { [EOL]     String name; [EOL]     if (a instanceof AnnotatedField) { [EOL]         name = findDeserializationName((AnnotatedField) a); [EOL]     } else if (a instanceof AnnotatedMethod) { [EOL]         name = findDeserializationName((AnnotatedMethod) a); [EOL]     } else if (a instanceof AnnotatedParameter) { [EOL]         name = findDeserializationName((AnnotatedParameter) a); [EOL]     } else { [EOL]         name = null; [EOL]     } [EOL]     if (name != null) { [EOL]         if (name.length() == 0) { [EOL]             return PropertyName.USE_DEFAULT; [EOL]         } [EOL]         return new PropertyName(name); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 1003,1024
@Deprecated [EOL] public String findDeserializationName(AnnotatedMethod am) { [EOL]     return null; [EOL] } <line_num>: 1038,1041
@Deprecated [EOL] public String findDeserializationName(AnnotatedField af) { [EOL]     return null; [EOL] } <line_num>: 1055,1058
@Deprecated [EOL] public String findDeserializationName(AnnotatedParameter param) { [EOL]     return null; [EOL] } <line_num>: 1068,1071
public boolean hasAnySetterAnnotation(AnnotatedMethod am) { [EOL]     return false; [EOL] } <line_num>: 1082,1084
public boolean hasAnyGetterAnnotation(AnnotatedMethod am) { [EOL]     return false; [EOL] } <line_num>: 1095,1097
public boolean hasCreatorAnnotation(Annotated a) { [EOL]     return false; [EOL] } <line_num>: 1109,1111
