public CoreOperationUnion(Expression[] args) { [EOL]     super(args); [EOL] } <line_num>: 30,32
public Object computeValue(EvalContext context) { [EOL]     EvalContext[] argCtxs = new EvalContext[args.length]; [EOL]     for (int i = 0; i < args.length; i++) { [EOL]         Object value = args[i].compute(context); [EOL]         if (value instanceof EvalContext) { [EOL]             argCtxs[i] = (EvalContext) value; [EOL]         } else { [EOL]             argCtxs[i] = context.getRootContext().getConstantContext(value); [EOL]         } [EOL]     } [EOL]     return new UnionContext(context.getRootContext(), argCtxs); [EOL] } <line_num>: 34,46
protected int getPrecedence() { [EOL]     return 7; [EOL] } <line_num>: 48,50
protected boolean isSymmetric() { [EOL]     return true; [EOL] } <line_num>: 52,54
public String getSymbol() { [EOL]     return "|"; [EOL] } <line_num>: 56,58
