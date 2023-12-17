public Operation(Expression[] args) { [EOL]     this.args = args; [EOL] } <line_num>: 27,29
public Expression[] getArguments() { [EOL]     return args; [EOL] } <line_num>: 31,33
public boolean computeContextDependent() { [EOL]     if (args != null) { [EOL]         for (int i = 0; i < args.length; i++) { [EOL]             if (args[i].isContextDependent()) { [EOL]                 return true; [EOL]             } [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 35,44
