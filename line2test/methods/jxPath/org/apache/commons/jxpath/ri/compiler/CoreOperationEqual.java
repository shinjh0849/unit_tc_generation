public CoreOperationEqual(Expression arg1, Expression arg2) { [EOL]     super(arg1, arg2); [EOL] } <line_num>: 29,31
public Object computeValue(EvalContext context) { [EOL]     return equal(context, args[0], args[1]) ? Boolean.TRUE : Boolean.FALSE; [EOL] } <line_num>: 33,35
protected int getPrecedence() { [EOL]     return 2; [EOL] } <line_num>: 37,39
protected boolean isSymmetric() { [EOL]     return true; [EOL] } <line_num>: 41,43
public String getSymbol() { [EOL]     return "="; [EOL] } <line_num>: 45,47
