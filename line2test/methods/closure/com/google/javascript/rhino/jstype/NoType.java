NoType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 64,66
@Override [EOL] public boolean isNoObjectType() { [EOL]     return false; [EOL] } <line_num>: 68,71
@Override [EOL] public boolean isNoType() { [EOL]     return true; [EOL] } <line_num>: 73,76
@Override [EOL] public boolean isNullable() { [EOL]     return true; [EOL] } <line_num>: 78,81
@Override [EOL] public boolean isSubtype(JSType that) { [EOL]     return true; [EOL] } <line_num>: 83,86
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.EMPTY; [EOL] } <line_num>: 88,91
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return true; [EOL] } <line_num>: 93,96
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return true; [EOL] } <line_num>: 98,101
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 103,106
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseNoType(); [EOL] } <line_num>: 108,111
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseNoType(that); [EOL] } <line_num>: 113,115
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return forAnnotations ? "?" : "None"; [EOL] } <line_num>: 117,120
