public AnnotatedMethodMap() { [EOL] } <line_num>: 16,16
public void add(AnnotatedMethod am) { [EOL]     if (_methods == null) { [EOL]         _methods = new LinkedHashMap<MemberKey, AnnotatedMethod>(); [EOL]     } [EOL]     _methods.put(new MemberKey(am.getAnnotated()), am); [EOL] } <line_num>: 21,27
public AnnotatedMethod remove(AnnotatedMethod am) { [EOL]     return remove(am.getAnnotated()); [EOL] } <line_num>: 33,36
public AnnotatedMethod remove(Method m) { [EOL]     if (_methods != null) { [EOL]         return _methods.remove(new MemberKey(m)); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 38,44
public boolean isEmpty() { [EOL]     return (_methods == null || _methods.size() == 0); [EOL] } <line_num>: 46,48
public int size() { [EOL]     return (_methods == null) ? 0 : _methods.size(); [EOL] } <line_num>: 50,52
public AnnotatedMethod find(String name, Class<?>[] paramTypes) { [EOL]     if (_methods == null) { [EOL]         return null; [EOL]     } [EOL]     return _methods.get(new MemberKey(name, paramTypes)); [EOL] } <line_num>: 54,60
public AnnotatedMethod find(Method m) { [EOL]     if (_methods == null) { [EOL]         return null; [EOL]     } [EOL]     return _methods.get(new MemberKey(m)); [EOL] } <line_num>: 62,68
@Override [EOL] public Iterator<AnnotatedMethod> iterator() { [EOL]     if (_methods != null) { [EOL]         return _methods.values().iterator(); [EOL]     } [EOL]     List<AnnotatedMethod> empty = Collections.emptyList(); [EOL]     return empty.iterator(); [EOL] } <line_num>: 76,84
