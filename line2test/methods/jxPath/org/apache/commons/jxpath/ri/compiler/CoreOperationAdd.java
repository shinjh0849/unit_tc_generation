public CoreOperationAdd(Expression[] args) { [EOL]     super(args); [EOL] } <line_num>: 30,32
public Object computeValue(EvalContext context) { [EOL]     double s = 0.0; [EOL]     for (int i = 0; i < args.length; i++) { [EOL]         s += InfoSetUtil.doubleValue(args[i].computeValue(context)); [EOL]     } [EOL]     return new Double(s); [EOL] } <line_num>: 34,40
protected int getPrecedence() { [EOL]     return 4; [EOL] } <line_num>: 42,44
protected boolean isSymmetric() { [EOL]     return true; [EOL] } <line_num>: 46,48
public String getSymbol() { [EOL]     return "+"; [EOL] } <line_num>: 50,52
