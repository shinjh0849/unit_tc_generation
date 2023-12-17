VoidType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 53,55
@Override [EOL] public JSType restrictByNotNullOrUndefined() { [EOL]     return registry.getNativeType(JSTypeNative.NO_TYPE); [EOL] } <line_num>: 57,60
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     if (UNKNOWN.equals(super.testForEquality(that))) { [EOL]         return UNKNOWN; [EOL]     } [EOL]     if (that.isSubtype(this) || that.isSubtype(getNativeType(JSTypeNative.NULL_TYPE))) { [EOL]         return TRUE; [EOL]     } [EOL]     return FALSE; [EOL] } <line_num>: 62,72
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return false; [EOL] } <line_num>: 74,77
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return false; [EOL] } <line_num>: 79,82
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 84,87
@Override [EOL] public boolean isVoidType() { [EOL]     return true; [EOL] } <line_num>: 89,92
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return getDisplayName(); [EOL] } <line_num>: 94,97
@Override [EOL] public String getDisplayName() { [EOL]     return "undefined"; [EOL] } <line_num>: 99,102
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.FALSE; [EOL] } <line_num>: 104,107
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseVoidType(); [EOL] } <line_num>: 109,112
