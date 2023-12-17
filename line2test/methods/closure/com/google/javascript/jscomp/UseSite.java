UseSite(Node node, Scope scope, JSModule module) { [EOL]     this.node = node; [EOL]     this.scope = scope; [EOL]     this.module = module; [EOL] } <line_num>: 33,37
@Override [EOL] public int hashCode() { [EOL]     return this.node.hashCode(); [EOL] } <line_num>: 41,44
@Override [EOL] public boolean equals(Object o) { [EOL]     return (o instanceof UseSite && ((UseSite) (o)).node.equals(this.node)); [EOL] } <line_num>: 46,49
