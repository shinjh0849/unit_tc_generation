BooleanType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 52,54
@Override [EOL] public boolean isNullable() { [EOL]     return false; [EOL] } <line_num>: 56,59
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     TernaryValue result = super.testForEquality(that); [EOL]     if (result != null) { [EOL]         return result; [EOL]     } [EOL]     if (that.isUnknownType() || that.isSubtype(getNativeType(JSTypeNative.NUMBER_STRING_BOOLEAN)) || that.isObject()) { [EOL]         return UNKNOWN; [EOL]     } [EOL]     return FALSE; [EOL] } <line_num>: 61,73
@Override [EOL] public boolean isBooleanValueType() { [EOL]     return true; [EOL] } <line_num>: 75,78
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return true; [EOL] } <line_num>: 80,83
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 85,88
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return true; [EOL] } <line_num>: 90,94
@Override [EOL] public JSType autoboxesTo() { [EOL]     return getNativeType(JSTypeNative.BOOLEAN_OBJECT_TYPE); [EOL] } <line_num>: 96,99
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return getDisplayName(); [EOL] } <line_num>: 101,104
@Override [EOL] public String getDisplayName() { [EOL]     return "boolean"; [EOL] } <line_num>: 106,109
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.BOTH; [EOL] } <line_num>: 111,114
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseBooleanType(); [EOL] } <line_num>: 116,119
