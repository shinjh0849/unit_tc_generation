public JqueryCodingConvention() { [EOL]     this(CodingConventions.getDefault()); [EOL] } <line_num>: 31,33
public JqueryCodingConvention(CodingConvention wrapped) { [EOL]     super(wrapped); [EOL] } <line_num>: 35,37
@Override [EOL] public String getGlobalObject() { [EOL]     return "window"; [EOL] } <line_num>: 39,42
@Override [EOL] public boolean isPropertyTestFunction(Node call) { [EOL]     Preconditions.checkArgument(call.isCall()); [EOL]     return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName()); [EOL] } <line_num>: 48,53
@Override [EOL] public boolean isPrototypeAlias(Node getProp) { [EOL]     Preconditions.checkArgument(getProp.isGetProp()); [EOL]     return prototypeAliases.contains(getProp.getQualifiedName()); [EOL] } <line_num>: 58,62
