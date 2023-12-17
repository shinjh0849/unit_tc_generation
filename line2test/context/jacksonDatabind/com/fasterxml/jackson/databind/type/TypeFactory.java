private TypeFactory()
protected TypeFactory(TypeParser p, TypeModifier[] mods)
public TypeFactory withModifier(TypeModifier mod)
public static TypeFactory defaultInstance()
public static JavaType unknownType()
public static Class<?> rawClass(Type t)
public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass)
public JavaType constructFromCanonical(String canonical) throws IllegalArgumentException
public JavaType[] findTypeParameters(JavaType type, Class<?> expType)
public JavaType[] findTypeParameters(Class<?> clz, Class<?> expType)
public JavaType[] findTypeParameters(Class<?> clz, Class<?> expType, TypeBindings bindings)
public JavaType moreSpecificType(JavaType type1, JavaType type2)
public JavaType constructType(Type type)
public JavaType constructType(Type type, TypeBindings bindings)
public JavaType constructType(TypeReference<?> typeRef)
public JavaType constructType(Type type, Class<?> context)
public JavaType constructType(Type type, JavaType context)
protected JavaType _constructType(Type type, TypeBindings context)
public ArrayType constructArrayType(Class<?> elementType)
public ArrayType constructArrayType(JavaType elementType)
public CollectionType constructCollectionType(Class<? extends Collection> collectionClass, Class<?> elementClass)
public CollectionType constructCollectionType(Class<? extends Collection> collectionClass, JavaType elementType)
public CollectionLikeType constructCollectionLikeType(Class<?> collectionClass, Class<?> elementClass)
public CollectionLikeType constructCollectionLikeType(Class<?> collectionClass, JavaType elementType)
public MapType constructMapType(Class<? extends Map> mapClass, JavaType keyType, JavaType valueType)
public MapType constructMapType(Class<? extends Map> mapClass, Class<?> keyClass, Class<?> valueClass)
public MapLikeType constructMapLikeType(Class<?> mapClass, JavaType keyType, JavaType valueType)
public MapLikeType constructMapLikeType(Class<?> mapClass, Class<?> keyClass, Class<?> valueClass)
public JavaType constructSimpleType(Class<?> rawType, JavaType[] parameterTypes)
public JavaType uncheckedSimpleType(Class<?> cls)
public JavaType constructParametricType(Class<?> parametrized, Class<?>... parameterClasses)
public JavaType constructParametricType(Class<?> parametrized, JavaType... parameterTypes)
public CollectionType constructRawCollectionType(Class<? extends Collection> collectionClass)
public CollectionLikeType constructRawCollectionLikeType(Class<?> collectionClass)
public MapType constructRawMapType(Class<? extends Map> mapClass)
public MapLikeType constructRawMapLikeType(Class<?> mapClass)
protected JavaType _fromClass(Class<?> clz, TypeBindings context)
protected JavaType _fromParameterizedClass(Class<?> clz, List<JavaType> paramTypes)
protected JavaType _fromParamType(ParameterizedType type, TypeBindings context)
protected JavaType _fromArrayType(GenericArrayType type, TypeBindings context)
protected JavaType _fromVariable(TypeVariable<?> type, TypeBindings context)
protected JavaType _fromWildcard(WildcardType type, TypeBindings context)
private JavaType _mapType(Class<?> rawClass)
private JavaType _collectionType(Class<?> rawClass)
protected JavaType _resolveVariableViaSubTypes(HierarchicType leafType, String variableName, TypeBindings bindings)
protected JavaType _unknownType()
protected HierarchicType _findSuperTypeChain(Class<?> subtype, Class<?> supertype)
protected HierarchicType _findSuperClassChain(Type currentType, Class<?> target)
protected HierarchicType _findSuperInterfaceChain(Type currentType, Class<?> target)
protected HierarchicType _doFindSuperInterfaceChain(HierarchicType current, Class<?> target)
protected synchronized HierarchicType _hashMapSuperInterfaceChain(HierarchicType current)
protected synchronized HierarchicType _arrayListSuperInterfaceChain(HierarchicType current)
long serialVersionUID=Optional[1L]
JavaType[] NO_TYPES=Optional[new JavaType[0]]
TypeFactory instance=Optional[new TypeFactory()]
SimpleType CORE_TYPE_STRING=Optional[new SimpleType(String.class)]
SimpleType CORE_TYPE_BOOL=Optional[new SimpleType(Boolean.TYPE)]
SimpleType CORE_TYPE_INT=Optional[new SimpleType(Integer.TYPE)]
SimpleType CORE_TYPE_LONG=Optional[new SimpleType(Long.TYPE)]
LRUMap<ClassKey, JavaType> _typeCache=Optional[new LRUMap<ClassKey, JavaType>(16, 100)]
HierarchicType _cachedHashMapType
HierarchicType _cachedArrayListType
TypeModifier[] _modifiers
TypeParser _parser
