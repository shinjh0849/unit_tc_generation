protected JavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) { [EOL]     _class = raw; [EOL]     _hashCode = raw.getName().hashCode() + additionalHash; [EOL]     _valueHandler = valueHandler; [EOL]     _typeHandler = typeHandler; [EOL]     _asStatic = asStatic; [EOL] } <line_num>: 73,81
public abstract JavaType withTypeHandler(Object h); <line_num>: 89,89
public abstract JavaType withContentTypeHandler(Object h); <line_num>: 98,98
public abstract JavaType withValueHandler(Object h); <line_num>: 106,106
public abstract JavaType withContentValueHandler(Object h); <line_num>: 114,114
public abstract JavaType withStaticTyping(); <line_num>: 127,127
public JavaType narrowBy(Class<?> subclass) { [EOL]     if (subclass == _class) { [EOL]         return this; [EOL]     } [EOL]     _assertSubclass(subclass, _class); [EOL]     JavaType result = _narrow(subclass); [EOL]     if (_valueHandler != result.<Object>getValueHandler()) { [EOL]         result = result.withValueHandler(_valueHandler); [EOL]     } [EOL]     if (_typeHandler != result.<Object>getTypeHandler()) { [EOL]         result = result.withTypeHandler(_typeHandler); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 143,161
public JavaType forcedNarrowBy(Class<?> subclass) { [EOL]     if (subclass == _class) { [EOL]         return this; [EOL]     } [EOL]     JavaType result = _narrow(subclass); [EOL]     if (_valueHandler != result.<Object>getValueHandler()) { [EOL]         result = result.withValueHandler(_valueHandler); [EOL]     } [EOL]     if (_typeHandler != result.<Object>getTypeHandler()) { [EOL]         result = result.withTypeHandler(_typeHandler); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 168,182
public JavaType widenBy(Class<?> superclass) { [EOL]     if (superclass == _class) { [EOL]         return this; [EOL]     } [EOL]     _assertSubclass(_class, superclass); [EOL]     return _widen(superclass); [EOL] } <line_num>: 193,202
protected abstract JavaType _narrow(Class<?> subclass); <line_num>: 204,204
protected JavaType _widen(Class<?> superclass) { [EOL]     return _narrow(superclass); [EOL] } <line_num>: 211,213
public abstract JavaType narrowContentsBy(Class<?> contentClass); <line_num>: 215,215
public abstract JavaType widenContentsBy(Class<?> contentClass); <line_num>: 217,217
@Override [EOL] public final Class<?> getRawClass() { [EOL]     return _class; [EOL] } <line_num>: 225,226
@Override [EOL] public final boolean hasRawClass(Class<?> clz) { [EOL]     return _class == clz; [EOL] } <line_num>: 233,236
@Override [EOL] public boolean isAbstract() { [EOL]     return Modifier.isAbstract(_class.getModifiers()); [EOL] } <line_num>: 238,241
@Override [EOL] public boolean isConcrete() { [EOL]     int mod = _class.getModifiers(); [EOL]     if ((mod & (Modifier.INTERFACE | Modifier.ABSTRACT)) == 0) { [EOL]         return true; [EOL]     } [EOL]     if (_class.isPrimitive()) { [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 248,261
@Override [EOL] public boolean isThrowable() { [EOL]     return Throwable.class.isAssignableFrom(_class); [EOL] } <line_num>: 263,266
@Override [EOL] public boolean isArrayType() { [EOL]     return false; [EOL] } <line_num>: 268,269
@Override [EOL] public final boolean isEnumType() { [EOL]     return _class.isEnum(); [EOL] } <line_num>: 271,272
@Override [EOL] public final boolean isInterface() { [EOL]     return _class.isInterface(); [EOL] } <line_num>: 274,275
@Override [EOL] public final boolean isPrimitive() { [EOL]     return _class.isPrimitive(); [EOL] } <line_num>: 277,278
@Override [EOL] public final boolean isFinal() { [EOL]     return Modifier.isFinal(_class.getModifiers()); [EOL] } <line_num>: 280,281
@Override [EOL] public abstract boolean isContainerType(); <line_num>: 287,288
@Override [EOL] public boolean isCollectionLikeType() { [EOL]     return false; [EOL] } <line_num>: 295,296
@Override [EOL] public boolean isMapLikeType() { [EOL]     return false; [EOL] } <line_num>: 303,304
public final boolean useStaticType() { [EOL]     return _asStatic; [EOL] } <line_num>: 314,316
@Override [EOL] public boolean hasGenericTypes() { [EOL]     return containedTypeCount() > 0; [EOL] } <line_num>: 324,328
@Override [EOL] public JavaType getKeyType() { [EOL]     return null; [EOL] } <line_num>: 330,331
@Override [EOL] public JavaType getContentType() { [EOL]     return null; [EOL] } <line_num>: 333,334
@Override [EOL] public int containedTypeCount() { [EOL]     return 0; [EOL] } <line_num>: 336,337
@Override [EOL] public JavaType containedType(int index) { [EOL]     return null; [EOL] } <line_num>: 339,340
@Override [EOL] public String containedTypeName(int index) { [EOL]     return null; [EOL] } <line_num>: 342,343
@SuppressWarnings("unchecked") [EOL] public <T> T getValueHandler() { [EOL]     return (T) _valueHandler; [EOL] } <line_num>: 354,355
@SuppressWarnings("unchecked") [EOL] public <T> T getTypeHandler() { [EOL]     return (T) _typeHandler; [EOL] } <line_num>: 360,361
public String getGenericSignature() { [EOL]     StringBuilder sb = new StringBuilder(40); [EOL]     getGenericSignature(sb); [EOL]     return sb.toString(); [EOL] } <line_num>: 379,383
public abstract StringBuilder getGenericSignature(StringBuilder sb); <line_num>: 392,392
public String getErasedSignature() { [EOL]     StringBuilder sb = new StringBuilder(40); [EOL]     getErasedSignature(sb); [EOL]     return sb.toString(); [EOL] } <line_num>: 400,404
public abstract StringBuilder getErasedSignature(StringBuilder sb); <line_num>: 417,417
protected void _assertSubclass(Class<?> subclass, Class<?> superClass) { [EOL]     if (!_class.isAssignableFrom(subclass)) { [EOL]         throw new IllegalArgumentException("Class " + subclass.getName() + " is not assignable to " + _class.getName()); [EOL]     } [EOL] } <line_num>: 425,430
@Override [EOL] public abstract String toString(); <line_num>: 438,439
@Override [EOL] public abstract boolean equals(Object o); <line_num>: 441,442
@Override [EOL] public final int hashCode() { [EOL]     return _hashCode; [EOL] } <line_num>: 444,445
