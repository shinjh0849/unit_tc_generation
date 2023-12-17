public TypeBindings(TypeFactory typeFactory, Class<?> cc)
public TypeBindings(TypeFactory typeFactory, JavaType type)
private TypeBindings(TypeFactory tf, TypeBindings parent, Class<?> cc, JavaType type)
public TypeBindings childInstance()
public JavaType resolveType(Class<?> cls)
public JavaType resolveType(Type type)
public int getBindingCount()
public JavaType findType(String name)
public void addBinding(String name, JavaType type)
public JavaType[] typesAsArray()
protected void _resolve()
public void _addPlaceholder(String name)
protected void _resolveBindings(Type t)
public String toString()
JavaType[] NO_TYPES=Optional[new JavaType[0]]
JavaType UNBOUND=Optional[new SimpleType(Object.class)]
TypeFactory _typeFactory
JavaType _contextType
Class<?> _contextClass
Map<String, JavaType> _bindings
HashSet<String> _placeholders
TypeBindings _parentBindings
