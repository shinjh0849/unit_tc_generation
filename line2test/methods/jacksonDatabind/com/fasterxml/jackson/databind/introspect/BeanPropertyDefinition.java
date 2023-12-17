public abstract BeanPropertyDefinition withName(String newName); <line_num>: 32,32
@Override [EOL] public abstract String getName(); <line_num>: 43,44
public abstract String getInternalName(); <line_num>: 52,52
public abstract PropertyName getWrapperName(); <line_num>: 59,59
public abstract boolean isExplicitlyIncluded(); <line_num>: 70,70
public boolean couldDeserialize() { [EOL]     return getMutator() != null; [EOL] } <line_num>: 78,80
public boolean couldSerialize() { [EOL]     return getAccessor() != null; [EOL] } <line_num>: 81,83
public abstract boolean hasGetter(); <line_num>: 91,91
public abstract boolean hasSetter(); <line_num>: 92,92
public abstract boolean hasField(); <line_num>: 93,93
public abstract boolean hasConstructorParameter(); <line_num>: 94,94
public abstract AnnotatedMethod getGetter(); <line_num>: 96,96
public abstract AnnotatedMethod getSetter(); <line_num>: 97,97
public abstract AnnotatedField getField(); <line_num>: 98,98
public abstract AnnotatedParameter getConstructorParameter(); <line_num>: 99,99
public abstract AnnotatedMember getAccessor(); <line_num>: 106,106
public abstract AnnotatedMember getMutator(); <line_num>: 113,113
public AnnotatedMember getPrimaryMember() { [EOL]     return null; [EOL] } <line_num>: 122,124
public Class<?>[] findViews() { [EOL]     return null; [EOL] } <line_num>: 138,138
public AnnotationIntrospector.ReferenceProperty findReferenceType() { [EOL]     return null; [EOL] } <line_num>: 144,146
public boolean isTypeId() { [EOL]     return false; [EOL] } <line_num>: 153,155
public ObjectIdInfo findObjectIdInfo() { [EOL]     return null; [EOL] } <line_num>: 162,164
public boolean isRequired() { [EOL]     return false; [EOL] } <line_num>: 172,174
