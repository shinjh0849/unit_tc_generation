public KeywordVariables(String keyword, Object object) { [EOL]     this.keyword = keyword; [EOL]     this.object = object; [EOL] } <line_num>: 33,36
public boolean isDeclaredVariable(String variable) { [EOL]     return variable.equals(keyword); [EOL] } <line_num>: 38,40
public Object getVariable(String variable) { [EOL]     if (variable.equals(keyword)) { [EOL]         return object; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 42,47
public void declareVariable(String variable, Object value) { [EOL]     throw new UnsupportedOperationException("Cannot declare new keyword variables."); [EOL] } <line_num>: 49,52
public void undeclareVariable(String variable) { [EOL]     throw new UnsupportedOperationException("Cannot declare new keyword variables."); [EOL] } <line_num>: 54,57
