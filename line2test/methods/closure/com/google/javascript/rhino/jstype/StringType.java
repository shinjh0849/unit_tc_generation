StringType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 52,54
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     TernaryValue result = super.testForEquality(that); [EOL]     if (result != null) { [EOL]         return result; [EOL]     } [EOL]     if (that.isUnknownType() || that.isSubtype(getNativeType(JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN))) { [EOL]         return UNKNOWN; [EOL]     } [EOL]     return FALSE; [EOL] } <line_num>: 56,67
@Override [EOL] public boolean isStringValueType() { [EOL]     return true; [EOL] } <line_num>: 69,72
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return true; [EOL] } <line_num>: 74,77
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 79,82
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return true; [EOL] } <line_num>: 84,88
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return getDisplayName(); [EOL] } <line_num>: 90,93
@Override [EOL] public String getDisplayName() { [EOL]     return "string"; [EOL] } <line_num>: 95,98
@Override [EOL] public JSType autoboxesTo() { [EOL]     return getNativeType(JSTypeNative.STRING_OBJECT_TYPE); [EOL] } <line_num>: 100,103
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.BOTH; [EOL] } <line_num>: 105,108
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseStringType(); [EOL] } <line_num>: 110,113
