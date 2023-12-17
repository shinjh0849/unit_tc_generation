TypeInfo(Type actualType) { [EOL]     this.actualType = actualType; [EOL]     rawClass = TypeUtils.toRawClass(actualType); [EOL] } <line_num>: 32,35
public final Type getActualType() { [EOL]     return actualType; [EOL] } <line_num>: 37,39
public final Class<?> getWrappedClass() { [EOL]     return Primitives.wrap(rawClass); [EOL] } <line_num>: 50,52
public final Class<?> getRawClass() { [EOL]     return rawClass; [EOL] } <line_num>: 57,59
public final boolean isCollectionOrArray() { [EOL]     return Collection.class.isAssignableFrom(rawClass) || isArray(); [EOL] } <line_num>: 61,63
public final boolean isArray() { [EOL]     return TypeUtils.isArray(rawClass); [EOL] } <line_num>: 65,67
public final boolean isEnum() { [EOL]     return rawClass.isEnum(); [EOL] } <line_num>: 69,71
public final boolean isPrimitive() { [EOL]     return Primitives.isWrapperType(Primitives.wrap(rawClass)); [EOL] } <line_num>: 73,75
