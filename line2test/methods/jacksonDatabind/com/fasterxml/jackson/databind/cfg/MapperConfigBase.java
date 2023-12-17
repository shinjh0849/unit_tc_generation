protected MapperConfigBase(BaseSettings base, SubtypeResolver str, Map<ClassKey, Class<?>> mixins) { [EOL]     super(base, DEFAULT_MAPPER_FEATURES); [EOL]     _mixInAnnotations = mixins; [EOL]     _subtypeResolver = str; [EOL]     _rootName = null; [EOL]     _view = null; [EOL] } <line_num>: 73,81
protected MapperConfigBase(MapperConfigBase<CFG, T> src) { [EOL]     super(src); [EOL]     _mixInAnnotations = src._mixInAnnotations; [EOL]     _subtypeResolver = src._subtypeResolver; [EOL]     _rootName = src._rootName; [EOL]     _view = src._view; [EOL] } <line_num>: 87,94
protected MapperConfigBase(MapperConfigBase<CFG, T> src, BaseSettings base) { [EOL]     super(base, src._mapperFeatures); [EOL]     _mixInAnnotations = src._mixInAnnotations; [EOL]     _subtypeResolver = src._subtypeResolver; [EOL]     _rootName = src._rootName; [EOL]     _view = src._view; [EOL] } <line_num>: 96,103
protected MapperConfigBase(MapperConfigBase<CFG, T> src, int mapperFeatures) { [EOL]     super(src._base, mapperFeatures); [EOL]     _mixInAnnotations = src._mixInAnnotations; [EOL]     _subtypeResolver = src._subtypeResolver; [EOL]     _rootName = src._rootName; [EOL]     _view = src._view; [EOL] } <line_num>: 105,112
protected MapperConfigBase(MapperConfigBase<CFG, T> src, SubtypeResolver str) { [EOL]     super(src); [EOL]     _mixInAnnotations = src._mixInAnnotations; [EOL]     _subtypeResolver = str; [EOL]     _rootName = src._rootName; [EOL]     _view = src._view; [EOL] } <line_num>: 114,120
protected MapperConfigBase(MapperConfigBase<CFG, T> src, String rootName) { [EOL]     super(src); [EOL]     _mixInAnnotations = src._mixInAnnotations; [EOL]     _subtypeResolver = src._subtypeResolver; [EOL]     _rootName = rootName; [EOL]     _view = src._view; [EOL] } <line_num>: 122,128
protected MapperConfigBase(MapperConfigBase<CFG, T> src, Class<?> view) { [EOL]     super(src); [EOL]     _mixInAnnotations = src._mixInAnnotations; [EOL]     _subtypeResolver = src._subtypeResolver; [EOL]     _rootName = src._rootName; [EOL]     _view = view; [EOL] } <line_num>: 130,137
protected MapperConfigBase(MapperConfigBase<CFG, T> src, Map<ClassKey, Class<?>> mixins) { [EOL]     super(src); [EOL]     _mixInAnnotations = mixins; [EOL]     _subtypeResolver = src._subtypeResolver; [EOL]     _rootName = src._rootName; [EOL]     _view = src._view; [EOL] } <line_num>: 142,149
public abstract T with(AnnotationIntrospector ai); <line_num>: 164,164
public abstract T withAppendedAnnotationIntrospector(AnnotationIntrospector introspector); <line_num>: 170,170
public abstract T withInsertedAnnotationIntrospector(AnnotationIntrospector introspector); <line_num>: 176,176
public abstract T with(ClassIntrospector ci); <line_num>: 186,186
public abstract T with(DateFormat df); <line_num>: 196,196
public abstract T with(HandlerInstantiator hi); <line_num>: 206,206
public abstract T with(PropertyNamingStrategy strategy); <line_num>: 216,216
public abstract T withRootName(String rootName); <line_num>: 232,232
public abstract T with(SubtypeResolver str); <line_num>: 242,242
public abstract T with(TypeFactory typeFactory); <line_num>: 249,249
public abstract T with(TypeResolverBuilder<?> trb); <line_num>: 255,255
public abstract T withView(Class<?> view); <line_num>: 261,261
public abstract T with(VisibilityChecker<?> vc); <line_num>: 268,268
public abstract T withVisibility(PropertyAccessor forMethod, JsonAutoDetect.Visibility visibility); <line_num>: 274,274
public abstract T with(Locale l); <line_num>: 280,280
public abstract T with(TimeZone tz); <line_num>: 286,286
public abstract T with(Base64Variant base64); <line_num>: 292,292
@Override [EOL] public final SubtypeResolver getSubtypeResolver() { [EOL]     return _subtypeResolver; [EOL] } <line_num>: 305,308
public final String getRootName() { [EOL]     return _rootName; [EOL] } <line_num>: 310,312
@Override [EOL] public final Class<?> getActiveView() { [EOL]     return _view; [EOL] } <line_num>: 314,317
@Override [EOL] public final Class<?> findMixInClassFor(Class<?> cls) { [EOL]     return (_mixInAnnotations == null) ? null : _mixInAnnotations.get(new ClassKey(cls)); [EOL] } <line_num>: 329,332
public final int mixInCount() { [EOL]     return (_mixInAnnotations == null) ? 0 : _mixInAnnotations.size(); [EOL] } <line_num>: 334,336
