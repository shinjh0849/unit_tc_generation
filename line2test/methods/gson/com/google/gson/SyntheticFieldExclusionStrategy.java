SyntheticFieldExclusionStrategy(boolean skipSyntheticFields) { [EOL]     this.skipSyntheticFields = skipSyntheticFields; [EOL] } <line_num>: 32,34
public boolean shouldSkipClass(Class<?> clazz) { [EOL]     return false; [EOL] } <line_num>: 36,38
public boolean shouldSkipField(FieldAttributes f) { [EOL]     return skipSyntheticFields && f.isSynthetic(); [EOL] } <line_num>: 40,42
