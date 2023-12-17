public CoreOperationAnd(Expression[] args) { [EOL]     super(args); [EOL] } <line_num>: 30,32
public Object computeValue(EvalContext context) { [EOL]     for (int i = 0; i < args.length; i++) { [EOL]         if (!InfoSetUtil.booleanValue(args[i].computeValue(context))) { [EOL]             return Boolean.FALSE; [EOL]         } [EOL]     } [EOL]     return Boolean.TRUE; [EOL] } <line_num>: 34,41
protected int getPrecedence() { [EOL]     return 1; [EOL] } <line_num>: 43,45
protected boolean isSymmetric() { [EOL]     return true; [EOL] } <line_num>: 47,49
public String getSymbol() { [EOL]     return "and"; [EOL] } <line_num>: 51,53
