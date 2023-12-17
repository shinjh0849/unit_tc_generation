NullType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 53,55
@Override [EOL] public boolean isNullType() { [EOL]     return true; [EOL] } <line_num>: 57,60
@Override [EOL] public boolean isNullable() { [EOL]     return true; [EOL] } <line_num>: 62,65
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return true; [EOL] } <line_num>: 67,70
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return false; [EOL] } <line_num>: 72,75
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 77,80
@Override [EOL] public JSType restrictByNotNullOrUndefined() { [EOL]     return registry.getNativeType(JSTypeNative.NO_TYPE); [EOL] } <line_num>: 82,85
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     TernaryValue result = super.testForEquality(that); [EOL]     if (result != null) { [EOL]         return result; [EOL]     } [EOL]     if (that.isNullType() || that.isVoidType()) { [EOL]         return TRUE; [EOL]     } [EOL]     if (that.isUnknownType() || that.isNullable()) { [EOL]         return UNKNOWN; [EOL]     } [EOL]     return FALSE; [EOL] } <line_num>: 87,100
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return getDisplayName(); [EOL] } <line_num>: 102,105
@Override [EOL] public String getDisplayName() { [EOL]     return "null"; [EOL] } <line_num>: 107,110
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.FALSE; [EOL] } <line_num>: 112,115
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseNullType(); [EOL] } <line_num>: 117,120
