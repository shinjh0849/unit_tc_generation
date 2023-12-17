protected MapperConfig(BaseSettings base, int mapperFeatures) { [EOL]     _base = base; [EOL]     _mapperFeatures = mapperFeatures; [EOL] } <line_num>: 55,59
protected MapperConfig(MapperConfig<T> src) { [EOL]     _base = src._base; [EOL]     _mapperFeatures = src._mapperFeatures; [EOL] } <line_num>: 61,65
public static <F extends Enum<F> & ConfigFeature> int collectFeatureDefaults(Class<F> enumClass) { [EOL]     int flags = 0; [EOL]     for (F value : enumClass.getEnumConstants()) { [EOL]         if (value.enabledByDefault()) { [EOL]             flags |= value.getMask(); [EOL]         } [EOL]     } [EOL]     return flags; [EOL] } <line_num>: 71,80
public abstract T with(MapperFeature... features); <line_num>: 91,91
public abstract T without(MapperFeature... features); <line_num>: 97,97
public final boolean isEnabled(MapperFeature f) { [EOL]     return (_mapperFeatures & f.getMask()) != 0; [EOL] } <line_num>: 109,111
public final boolean isAnnotationProcessingEnabled() { [EOL]     return isEnabled(MapperFeature.USE_ANNOTATIONS); [EOL] } <line_num>: 119,121
public final boolean canOverrideAccessModifiers() { [EOL]     return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS); [EOL] } <line_num>: 134,136
public final boolean shouldSortPropertiesAlphabetically() { [EOL]     return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY); [EOL] } <line_num>: 142,144
public abstract boolean useRootWrapping(); <line_num>: 151,151
public ClassIntrospector getClassIntrospector() { [EOL]     return _base.getClassIntrospector(); [EOL] } <line_num>: 159,161
public AnnotationIntrospector getAnnotationIntrospector() { [EOL]     return _base.getAnnotationIntrospector(); [EOL] } <line_num>: 169,171
public VisibilityChecker<?> getDefaultVisibilityChecker() { [EOL]     return _base.getVisibilityChecker(); [EOL] } <line_num>: 182,184
public final PropertyNamingStrategy getPropertyNamingStrategy() { [EOL]     return _base.getPropertyNamingStrategy(); [EOL] } <line_num>: 186,188
public final HandlerInstantiator getHandlerInstantiator() { [EOL]     return _base.getHandlerInstantiator(); [EOL] } <line_num>: 190,192
public final TypeResolverBuilder<?> getDefaultTyper(JavaType baseType) { [EOL]     return _base.getTypeResolverBuilder(); [EOL] } <line_num>: 206,208
public abstract SubtypeResolver getSubtypeResolver(); <line_num>: 210,210
public final TypeFactory getTypeFactory() { [EOL]     return _base.getTypeFactory(); [EOL] } <line_num>: 212,214
public final JavaType constructType(Class<?> cls) { [EOL]     return getTypeFactory().constructType(cls, (TypeBindings) null); [EOL] } <line_num>: 224,226
public final JavaType constructType(TypeReference<?> valueTypeRef) { [EOL]     return getTypeFactory().constructType(valueTypeRef.getType(), (TypeBindings) null); [EOL] } <line_num>: 236,238
public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass) { [EOL]     return getTypeFactory().constructSpecializedType(baseType, subclass); [EOL] } <line_num>: 240,242
public BeanDescription introspectClassAnnotations(Class<?> cls) { [EOL]     return introspectClassAnnotations(constructType(cls)); [EOL] } <line_num>: 254,256
public abstract BeanDescription introspectClassAnnotations(JavaType type); <line_num>: 262,262
public BeanDescription introspectDirectClassAnnotations(Class<?> cls) { [EOL]     return introspectDirectClassAnnotations(constructType(cls)); [EOL] } <line_num>: 269,271
public abstract BeanDescription introspectDirectClassAnnotations(JavaType type); <line_num>: 277,277
public final DateFormat getDateFormat() { [EOL]     return _base.getDateFormat(); [EOL] } <line_num>: 301,301
public final Locale getLocale() { [EOL]     return _base.getLocale(); [EOL] } <line_num>: 308,308
public final TimeZone getTimeZone() { [EOL]     return _base.getTimeZone(); [EOL] } <line_num>: 315,315
public abstract Class<?> getActiveView(); <line_num>: 320,320
public Base64Variant getBase64Variant() { [EOL]     return _base.getBase64Variant(); [EOL] } <line_num>: 329,331
public TypeResolverBuilder<?> typeResolverBuilderInstance(Annotated annotated, Class<? extends TypeResolverBuilder<?>> builderClass) { [EOL]     HandlerInstantiator hi = getHandlerInstantiator(); [EOL]     if (hi != null) { [EOL]         TypeResolverBuilder<?> builder = hi.typeResolverBuilderInstance(this, annotated, builderClass); [EOL]         if (builder != null) { [EOL]             return builder; [EOL]         } [EOL]     } [EOL]     return (TypeResolverBuilder<?>) ClassUtil.createInstance(builderClass, canOverrideAccessModifiers()); [EOL] } <line_num>: 343,354
public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class<? extends TypeIdResolver> resolverClass) { [EOL]     HandlerInstantiator hi = getHandlerInstantiator(); [EOL]     if (hi != null) { [EOL]         TypeIdResolver builder = hi.typeIdResolverInstance(this, annotated, resolverClass); [EOL]         if (builder != null) { [EOL]             return builder; [EOL]         } [EOL]     } [EOL]     return (TypeIdResolver) ClassUtil.createInstance(resolverClass, canOverrideAccessModifiers()); [EOL] } <line_num>: 360,371
