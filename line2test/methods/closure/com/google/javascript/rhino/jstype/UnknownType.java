UnknownType(JSTypeRegistry registry, boolean isChecked) { [EOL]     super(registry); [EOL]     this.isChecked = isChecked; [EOL] } <line_num>: 56,59
@Override [EOL] public boolean isUnknownType() { [EOL]     return true; [EOL] } <line_num>: 61,64
@Override [EOL] public boolean isCheckedUnknownType() { [EOL]     return isChecked; [EOL] } <line_num>: 66,69
@Override [EOL] public boolean canBeCalled() { [EOL]     return true; [EOL] } <line_num>: 71,74
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return true; [EOL] } <line_num>: 76,79
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return true; [EOL] } <line_num>: 81,84
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 86,89
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     return UNKNOWN; [EOL] } <line_num>: 91,94
@Override [EOL] public boolean isNullable() { [EOL]     return true; [EOL] } <line_num>: 96,99
@Override [EOL] public boolean isSubtype(JSType that) { [EOL]     return true; [EOL] } <line_num>: 101,104
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseUnknownType(); [EOL] } <line_num>: 106,109
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseUnknownType(this, that); [EOL] } <line_num>: 111,113
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return getReferenceName(); [EOL] } <line_num>: 115,118
@Override [EOL] boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) { [EOL]     return true; [EOL] } <line_num>: 120,125
@Override [EOL] public ObjectType getImplicitPrototype() { [EOL]     return null; [EOL] } <line_num>: 127,130
@Override [EOL] public FunctionType getConstructor() { [EOL]     return null; [EOL] } <line_num>: 132,135
@Override [EOL] public String getReferenceName() { [EOL]     return isChecked ? "??" : "?"; [EOL] } <line_num>: 137,140
@Override [EOL] public String getDisplayName() { [EOL]     return "Unknown"; [EOL] } <line_num>: 142,145
@Override [EOL] public boolean hasDisplayName() { [EOL]     return true; [EOL] } <line_num>: 147,150
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.BOTH; [EOL] } <line_num>: 152,155
@Override [EOL] JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { [EOL]     return this; [EOL] } <line_num>: 157,160
