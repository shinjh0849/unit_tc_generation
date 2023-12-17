public Std(String name, JavaType type, PropertyName wrapperName, Annotations contextAnnotations, AnnotatedMember member, boolean isRequired) { [EOL]     _name = name; [EOL]     _type = type; [EOL]     _wrapperName = wrapperName; [EOL]     _isRequired = isRequired; [EOL]     _member = member; [EOL]     _contextAnnotations = contextAnnotations; [EOL] } <line_num>: 123,133
@Override [EOL] public String getName(); <line_num>: 34,35
public JavaType getType(); <line_num>: 40,40
public PropertyName getWrapperName(); <line_num>: 48,48
public boolean isRequired(); <line_num>: 56,56
public <A extends Annotation> A getAnnotation(Class<A> acls); <line_num>: 63,63
public <A extends Annotation> A getContextAnnotation(Class<A> acls); <line_num>: 70,70
public AnnotatedMember getMember(); <line_num>: 76,76
public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor) throws JsonMappingException; <line_num>: 89,90
public Std withType(JavaType type) { [EOL]     return new Std(_name, type, _wrapperName, _contextAnnotations, _member, _isRequired); [EOL] } <line_num>: 135,137
@Override [EOL] public <A extends Annotation> A getAnnotation(Class<A> acls) { [EOL]     return (_member == null) ? null : _member.getAnnotation(acls); [EOL] } <line_num>: 139,142
@Override [EOL] public <A extends Annotation> A getContextAnnotation(Class<A> acls) { [EOL]     return (_contextAnnotations == null) ? null : _contextAnnotations.get(acls); [EOL] } <line_num>: 144,147
@Override [EOL] public String getName() { [EOL]     return _name; [EOL] } <line_num>: 149,152
@Override [EOL] public JavaType getType() { [EOL]     return _type; [EOL] } <line_num>: 154,157
@Override [EOL] public PropertyName getWrapperName() { [EOL]     return _wrapperName; [EOL] } <line_num>: 159,162
@Override [EOL] public boolean isRequired() { [EOL]     return _isRequired; [EOL] } <line_num>: 164,167
@Override [EOL] public AnnotatedMember getMember() { [EOL]     return _member; [EOL] } <line_num>: 169,172
@Override [EOL] public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor) { [EOL]     throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited"); [EOL] } <line_num>: 180,184
