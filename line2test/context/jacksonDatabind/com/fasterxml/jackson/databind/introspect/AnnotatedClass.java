private AnnotatedClass(Class<?> cls, List<Class<?>> superTypes, AnnotationIntrospector aintr, MixInResolver mir, AnnotationMap classAnnotations)
public AnnotatedClass withAnnotations(AnnotationMap ann)
public static AnnotatedClass construct(Class<?> cls, AnnotationIntrospector aintr, MixInResolver mir)
public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, AnnotationIntrospector aintr, MixInResolver mir)
public Class<?> getAnnotated()
public int getModifiers()
public String getName()
public A getAnnotation(Class<A> acls)
public Type getGenericType()
public Class<?> getRawType()
protected AnnotationMap getAllAnnotations()
public Annotations getAnnotations()
public boolean hasAnnotations()
public AnnotatedConstructor getDefaultConstructor()
public List<AnnotatedConstructor> getConstructors()
public List<AnnotatedMethod> getStaticMethods()
public Iterable<AnnotatedMethod> memberMethods()
public int getMemberMethodCount()
public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes)
public int getFieldCount()
public Iterable<AnnotatedField> fields()
private void resolveClassAnnotations()
private void resolveCreators()
private void resolveMemberMethods()
private void resolveFields()
protected void _addClassMixIns(AnnotationMap annotations, Class<?> toMask)
protected void _addClassMixIns(AnnotationMap annotations, Class<?> toMask, Class<?> mixin)
protected void _addConstructorMixIns(Class<?> mixin)
protected void _addFactoryMixIns(Class<?> mixin)
protected void _addMemberMethods(Class<?> cls, AnnotatedMethodMap methods, Class<?> mixInCls, AnnotatedMethodMap mixIns)
protected void _addMethodMixIns(Class<?> targetClass, AnnotatedMethodMap methods, Class<?> mixInCls, AnnotatedMethodMap mixIns)
protected Map<String, AnnotatedField> _findFields(Class<?> c, Map<String, AnnotatedField> fields)
protected void _addFieldMixIns(Class<?> targetClass, Class<?> mixInCls, Map<String, AnnotatedField> fields)
protected AnnotatedMethod _constructMethod(Method m)
protected AnnotatedConstructor _constructConstructor(Constructor<?> ctor, boolean defaultCtor)
protected AnnotatedMethod _constructCreatorMethod(Method m)
protected AnnotatedField _constructField(Field f)
private AnnotationMap _emptyAnnotationMap()
private AnnotationMap[] _emptyAnnotationMaps(int count)
protected boolean _isIncludableMemberMethod(Method m)
private boolean _isIncludableField(Field f)
protected AnnotationMap[] _collectRelevantAnnotations(Annotation[][] anns)
protected AnnotationMap _collectRelevantAnnotations(Annotation[] anns)
private void _addAnnotationsIfNotPresent(AnnotationMap result, Annotation[] anns)
private void _addAnnotationsIfNotPresent(AnnotatedMember target, Annotation[] anns)
private void _addOrOverrideAnnotations(AnnotatedMember target, Annotation[] anns)
protected void _addMixOvers(Constructor<?> mixin, AnnotatedConstructor target, boolean addParamAnnotations)
protected void _addMixOvers(Method mixin, AnnotatedMethod target, boolean addParamAnnotations)
protected void _addMixUnders(Method src, AnnotatedMethod target)
private final boolean _isAnnotationBundle(Annotation ann)
public String toString()
AnnotationMap[] NO_ANNOTATION_MAPS=Optional[new AnnotationMap[0]]
Class<?> _class
List<Class<?>> _superTypes
AnnotationIntrospector _annotationIntrospector
MixInResolver _mixInResolver
Class<?> _primaryMixIn
AnnotationMap _classAnnotations
boolean _creatorsResolved=Optional[false]
AnnotatedConstructor _defaultConstructor
List<AnnotatedConstructor> _constructors
List<AnnotatedMethod> _creatorMethods
AnnotatedMethodMap _memberMethods
List<AnnotatedField> _fields
