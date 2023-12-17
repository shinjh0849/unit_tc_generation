public CoreOperationNegate(Expression arg) { [EOL]     super(new Expression[] { arg }); [EOL] } <line_num>: 30,32
public Object computeValue(EvalContext context) { [EOL]     double a = InfoSetUtil.doubleValue(args[0].computeValue(context)); [EOL]     return new Double(-a); [EOL] } <line_num>: 34,37
protected int getPrecedence() { [EOL]     return 6; [EOL] } <line_num>: 39,41
protected boolean isSymmetric() { [EOL]     return false; [EOL] } <line_num>: 43,45
public String getSymbol() { [EOL]     return "-"; [EOL] } <line_num>: 47,49
