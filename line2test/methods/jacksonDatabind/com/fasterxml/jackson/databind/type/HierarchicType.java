public HierarchicType(Type type) { [EOL]     this._actualType = type; [EOL]     if (type instanceof Class<?>) { [EOL]         _rawClass = (Class<?>) type; [EOL]         _genericType = null; [EOL]     } else if (type instanceof ParameterizedType) { [EOL]         _genericType = (ParameterizedType) type; [EOL]         _rawClass = (Class<?>) _genericType.getRawType(); [EOL]     } else { [EOL]         throw new IllegalArgumentException("Type " + type.getClass().getName() + " can not be used to construct HierarchicType"); [EOL]     } [EOL] } <line_num>: 28,40
private HierarchicType(Type actualType, Class<?> rawClass, ParameterizedType genericType, HierarchicType superType, HierarchicType subType) { [EOL]     _actualType = actualType; [EOL]     _rawClass = rawClass; [EOL]     _genericType = genericType; [EOL]     _superType = superType; [EOL]     _subType = subType; [EOL] } <line_num>: 42,50
public HierarchicType deepCloneWithoutSubtype() { [EOL]     HierarchicType sup = (_superType == null) ? null : _superType.deepCloneWithoutSubtype(); [EOL]     HierarchicType result = new HierarchicType(_actualType, _rawClass, _genericType, sup, null); [EOL]     if (sup != null) { [EOL]         sup.setSubType(result); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 56,64
public void setSuperType(HierarchicType sup) { [EOL]     _superType = sup; [EOL] } <line_num>: 66,66
public final HierarchicType getSuperType() { [EOL]     return _superType; [EOL] } <line_num>: 67,67
public void setSubType(HierarchicType sub) { [EOL]     _subType = sub; [EOL] } <line_num>: 68,68
public final HierarchicType getSubType() { [EOL]     return _subType; [EOL] } <line_num>: 69,69
public final boolean isGeneric() { [EOL]     return _genericType != null; [EOL] } <line_num>: 71,71
public final ParameterizedType asGeneric() { [EOL]     return _genericType; [EOL] } <line_num>: 72,72
public final Class<?> getRawClass() { [EOL]     return _rawClass; [EOL] } <line_num>: 74,74
@Override [EOL] public String toString() { [EOL]     if (_genericType != null) { [EOL]         return _genericType.toString(); [EOL]     } [EOL]     return _rawClass.getName(); [EOL] } <line_num>: 76,82
