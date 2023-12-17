AllType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 52,54
@Override [EOL] public boolean isAllType() { [EOL]     return true; [EOL] } <line_num>: 56,59
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 61,65
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return true; [EOL] } <line_num>: 67,71
@Override [EOL] public boolean canBeCalled() { [EOL]     return false; [EOL] } <line_num>: 73,76
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     return UNKNOWN; [EOL] } <line_num>: 78,81
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return "*"; [EOL] } <line_num>: 83,86
@Override [EOL] public String getDisplayName() { [EOL]     return "<Any Type>"; [EOL] } <line_num>: 88,91
@Override [EOL] public boolean hasDisplayName() { [EOL]     return true; [EOL] } <line_num>: 93,96
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseAllType(); [EOL] } <line_num>: 98,101
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseAllType(that); [EOL] } <line_num>: 103,105
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.BOTH; [EOL] } <line_num>: 107,110
@Override [EOL] JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { [EOL]     return this; [EOL] } <line_num>: 112,115
