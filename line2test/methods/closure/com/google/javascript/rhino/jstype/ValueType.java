ValueType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 48,50
@Override [EOL] final JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { [EOL]     return this; [EOL] } <line_num>: 52,55
@Override [EOL] public boolean hasDisplayName() { [EOL]     return true; [EOL] } <line_num>: 57,60
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseValueType(this, that); [EOL] } <line_num>: 62,64
