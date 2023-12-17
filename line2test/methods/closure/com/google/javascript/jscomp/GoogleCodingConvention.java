public GoogleCodingConvention() { [EOL]     this(new ClosureCodingConvention()); [EOL] } <line_num>: 43,45
public GoogleCodingConvention(CodingConvention convention) { [EOL]     super(convention); [EOL] } <line_num>: 48,50
@Override [EOL] public boolean isConstant(String name) { [EOL]     if (name.length() <= 1) { [EOL]         return false; [EOL]     } [EOL]     int pos = name.lastIndexOf('$'); [EOL]     if (pos >= 0) { [EOL]         name = name.substring(pos + 1); [EOL]         if (name.length() == 0) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return isConstantKey(name); [EOL] } <line_num>: 70,87
@Override [EOL] public boolean isConstantKey(String name) { [EOL]     if (name.isEmpty() || !Character.isUpperCase(name.charAt(0))) { [EOL]         return false; [EOL]     } [EOL]     return name.toUpperCase().equals(name); [EOL] } <line_num>: 89,97
@Override [EOL] public boolean isValidEnumKey(String key) { [EOL]     return ENUM_KEY_PATTERN.matcher(key).matches(); [EOL] } <line_num>: 112,115
@Override [EOL] public boolean isOptionalParameter(Node parameter) { [EOL]     return parameter.getString().startsWith(OPTIONAL_ARG_PREFIX); [EOL] } <line_num>: 123,126
@Override [EOL] public boolean isVarArgsParameter(Node parameter) { [EOL]     return VAR_ARGS_NAME.equals(parameter.getString()); [EOL] } <line_num>: 128,131
@Override [EOL] public boolean isExported(String name, boolean local) { [EOL]     return super.isExported(name, local) || (!local && name.startsWith("_")); [EOL] } <line_num>: 139,143
@Override [EOL] public boolean isPrivate(String name) { [EOL]     return name.endsWith("_") && !isExported(name); [EOL] } <line_num>: 151,154
