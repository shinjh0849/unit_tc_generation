public JSTypeExpression(Node root, String sourceName) { [EOL]     this.root = root; [EOL]     this.sourceName = sourceName; [EOL] } <line_num>: 64,67
public static JSTypeExpression makeOptionalArg(JSTypeExpression expr) { [EOL]     if (expr.isOptionalArg() || expr.isVarArgs()) { [EOL]         return expr; [EOL]     } else { [EOL]         return new JSTypeExpression(new Node(Token.EQUALS, expr.root), expr.sourceName); [EOL]     } [EOL] } <line_num>: 73,80
public boolean isOptionalArg() { [EOL]     return root.getType() == Token.EQUALS; [EOL] } <line_num>: 85,87
public boolean isVarArgs() { [EOL]     return root.getType() == Token.ELLIPSIS; [EOL] } <line_num>: 92,94
public JSType evaluate(StaticScope<JSType> scope, JSTypeRegistry registry) { [EOL]     JSType type = registry.createFromTypeNodes(root, sourceName, scope); [EOL]     root.setJSType(type); [EOL]     return type; [EOL] } <line_num>: 99,103
@Override [EOL] public boolean equals(Object other) { [EOL]     return other instanceof JSTypeExpression && ((JSTypeExpression) other).root.isEquivalentTo(root); [EOL] } <line_num>: 105,109
@Override [EOL] public int hashCode() { [EOL]     return root.toStringTree().hashCode(); [EOL] } <line_num>: 111,114
public Node getRoot() { [EOL]     return root; [EOL] } <line_num>: 120,122
