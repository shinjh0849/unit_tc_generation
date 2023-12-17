public boolean isDeclaredVariable(String varName) { [EOL]     return vars.containsKey(varName); [EOL] } <line_num>: 42,44
public Object getVariable(String varName) { [EOL]     if (vars.containsKey(varName)) { [EOL]         return vars.get(varName); [EOL]     } [EOL]     throw new IllegalArgumentException("No such variable: '" + varName + "'"); [EOL] } <line_num>: 54,63
public void declareVariable(String varName, Object value) { [EOL]     vars.put(varName, value); [EOL] } <line_num>: 72,74
public void undeclareVariable(String varName) { [EOL]     vars.remove(varName); [EOL] } <line_num>: 81,83
public String toString() { [EOL]     return vars.toString(); [EOL] } <line_num>: 85,87
