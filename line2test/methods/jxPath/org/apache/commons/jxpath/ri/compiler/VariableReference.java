public VariableReference(QName varName) { [EOL]     this.varName = varName; [EOL] } <line_num>: 32,34
public QName getVariableName() { [EOL]     return varName; [EOL] } <line_num>: 36,38
public String toString() { [EOL]     return "$" + varName; [EOL] } <line_num>: 40,42
public boolean isContextDependent() { [EOL]     return false; [EOL] } <line_num>: 44,46
public boolean computeContextDependent() { [EOL]     return false; [EOL] } <line_num>: 48,50
public Object compute(EvalContext context) { [EOL]     return computeValue(context); [EOL] } <line_num>: 52,54
public Object computeValue(EvalContext context) { [EOL]     return context.getRootContext().getVariableContext(varName); [EOL] } <line_num>: 59,61
