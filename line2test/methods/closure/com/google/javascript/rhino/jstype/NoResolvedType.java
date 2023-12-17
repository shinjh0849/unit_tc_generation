NoResolvedType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 58,60
@Override [EOL] public boolean isNoResolvedType() { [EOL]     return true; [EOL] } <line_num>: 62,65
@Override [EOL] public boolean isNoType() { [EOL]     return false; [EOL] } <line_num>: 67,70
@Override [EOL] public boolean isSubtype(JSType that) { [EOL]     if (JSType.isSubtypeHelper(this, that)) { [EOL]         return true; [EOL]     } else { [EOL]         return !that.isNoType(); [EOL]     } [EOL] } <line_num>: 72,79
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return forAnnotations ? "?" : "NoResolvedType"; [EOL] } <line_num>: 81,84
