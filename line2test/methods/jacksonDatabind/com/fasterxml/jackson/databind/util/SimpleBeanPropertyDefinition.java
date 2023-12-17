@Deprecated [EOL] public SimpleBeanPropertyDefinition(AnnotatedMember member) { [EOL]     this(member, member.getName(), null); [EOL] } <line_num>: 37,40
@Deprecated [EOL] public SimpleBeanPropertyDefinition(AnnotatedMember member, String name) { [EOL]     this(member, name, null); [EOL] } <line_num>: 45,48
private SimpleBeanPropertyDefinition(AnnotatedMember member, String name, AnnotationIntrospector intr) { [EOL]     _introspector = intr; [EOL]     _member = member; [EOL]     _name = name; [EOL] } <line_num>: 50,55
public static SimpleBeanPropertyDefinition construct(MapperConfig<?> config, AnnotatedMember member) { [EOL]     return new SimpleBeanPropertyDefinition(member, member.getName(), (config == null) ? null : config.getAnnotationIntrospector()); [EOL] } <line_num>: 60,64
public static SimpleBeanPropertyDefinition construct(MapperConfig<?> config, AnnotatedMember member, String name) { [EOL]     return new SimpleBeanPropertyDefinition(member, name, (config == null) ? null : config.getAnnotationIntrospector()); [EOL] } <line_num>: 69,73
@Override [EOL] public SimpleBeanPropertyDefinition withName(String newName) { [EOL]     if (_name.equals(newName)) { [EOL]         return this; [EOL]     } [EOL]     return new SimpleBeanPropertyDefinition(_member, newName, _introspector); [EOL] } <line_num>: 81,87
@Override [EOL] public String getName() { [EOL]     return _name; [EOL] } <line_num>: 95,96
@Override [EOL] public String getInternalName() { [EOL]     return getName(); [EOL] } <line_num>: 98,99
@Override [EOL] public PropertyName getWrapperName() { [EOL]     return (_introspector == null) ? null : _introspector.findWrapperName(_member); [EOL] } <line_num>: 101,104
@Override [EOL] public boolean isExplicitlyIncluded() { [EOL]     return false; [EOL] } <line_num>: 107,108
@Override [EOL] public boolean hasGetter() { [EOL]     return (getGetter() != null); [EOL] } <line_num>: 116,119
@Override [EOL] public boolean hasSetter() { [EOL]     return (getSetter() != null); [EOL] } <line_num>: 121,124
@Override [EOL] public boolean hasField() { [EOL]     return (_member instanceof AnnotatedField); [EOL] } <line_num>: 126,129
@Override [EOL] public boolean hasConstructorParameter() { [EOL]     return (_member instanceof AnnotatedParameter); [EOL] } <line_num>: 131,134
@Override [EOL] public AnnotatedMethod getGetter() { [EOL]     if ((_member instanceof AnnotatedMethod) && ((AnnotatedMethod) _member).getParameterCount() == 0) { [EOL]         return (AnnotatedMethod) _member; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 136,143
@Override [EOL] public AnnotatedMethod getSetter() { [EOL]     if ((_member instanceof AnnotatedMethod) && ((AnnotatedMethod) _member).getParameterCount() == 1) { [EOL]         return (AnnotatedMethod) _member; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 145,152
@Override [EOL] public AnnotatedField getField() { [EOL]     return (_member instanceof AnnotatedField) ? (AnnotatedField) _member : null; [EOL] } <line_num>: 154,158
@Override [EOL] public AnnotatedParameter getConstructorParameter() { [EOL]     return (_member instanceof AnnotatedParameter) ? (AnnotatedParameter) _member : null; [EOL] } <line_num>: 160,164
@Override [EOL] public AnnotatedMember getAccessor() { [EOL]     AnnotatedMember acc = getGetter(); [EOL]     if (acc == null) { [EOL]         acc = getField(); [EOL]     } [EOL]     return acc; [EOL] } <line_num>: 171,178
@Override [EOL] public AnnotatedMember getMutator() { [EOL]     AnnotatedMember acc = getConstructorParameter(); [EOL]     if (acc == null) { [EOL]         acc = getSetter(); [EOL]         if (acc == null) { [EOL]             acc = getField(); [EOL]         } [EOL]     } [EOL]     return acc; [EOL] } <line_num>: 185,195
@Override [EOL] public AnnotatedMember getPrimaryMember() { [EOL]     return _member; [EOL] } <line_num>: 197,200
