protected TypeReference() { [EOL]     Type superClass = getClass().getGenericSuperclass(); [EOL]     if (superClass instanceof Class<?>) { [EOL]         throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information"); [EOL]     } [EOL]     _type = ((ParameterizedType) superClass).getActualTypeArguments()[0]; [EOL] } <line_num>: 32,46
public Type getType() { [EOL]     return _type; [EOL] } <line_num>: 48,48
@Override [EOL] public int compareTo(TypeReference<T> o) { [EOL]     return 0; [EOL] } <line_num>: 55,59
