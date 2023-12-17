public Object number(String value) { [EOL]     return new Constant(new Double(value)); [EOL] } <line_num>: 30,32
public Object literal(String value) { [EOL]     return new Constant(value); [EOL] } <line_num>: 34,36
public Object qname(String prefix, String name) { [EOL]     return new QName(prefix, name); [EOL] } <line_num>: 38,40
public Object sum(Object[] arguments) { [EOL]     return new CoreOperationAdd(toExpressionArray(arguments)); [EOL] } <line_num>: 42,44
public Object minus(Object left, Object right) { [EOL]     return new CoreOperationSubtract((Expression) left, (Expression) right); [EOL] } <line_num>: 46,50
public Object multiply(Object left, Object right) { [EOL]     return new CoreOperationMultiply((Expression) left, (Expression) right); [EOL] } <line_num>: 52,54
public Object divide(Object left, Object right) { [EOL]     return new CoreOperationDivide((Expression) left, (Expression) right); [EOL] } <line_num>: 56,58
public Object mod(Object left, Object right) { [EOL]     return new CoreOperationMod((Expression) left, (Expression) right); [EOL] } <line_num>: 60,62
public Object lessThan(Object left, Object right) { [EOL]     return new CoreOperationLessThan((Expression) left, (Expression) right); [EOL] } <line_num>: 64,66
public Object lessThanOrEqual(Object left, Object right) { [EOL]     return new CoreOperationLessThanOrEqual((Expression) left, (Expression) right); [EOL] } <line_num>: 68,72
public Object greaterThan(Object left, Object right) { [EOL]     return new CoreOperationGreaterThan((Expression) left, (Expression) right); [EOL] } <line_num>: 74,78
public Object greaterThanOrEqual(Object left, Object right) { [EOL]     return new CoreOperationGreaterThanOrEqual((Expression) left, (Expression) right); [EOL] } <line_num>: 80,84
public Object equal(Object left, Object right) { [EOL]     if (isNameAttributeTest((Expression) left)) { [EOL]         return new NameAttributeTest((Expression) left, (Expression) right); [EOL]     } else { [EOL]         return new CoreOperationEqual((Expression) left, (Expression) right); [EOL]     } [EOL] } <line_num>: 86,95
public Object notEqual(Object left, Object right) { [EOL]     return new CoreOperationNotEqual((Expression) left, (Expression) right); [EOL] } <line_num>: 97,101
public Object minus(Object argument) { [EOL]     return new CoreOperationNegate((Expression) argument); [EOL] } <line_num>: 103,105
public Object variableReference(Object qName) { [EOL]     return new VariableReference((QName) qName); [EOL] } <line_num>: 107,109
public Object function(int code, Object[] args) { [EOL]     return new CoreFunction(code, toExpressionArray(args)); [EOL] } <line_num>: 111,113
public Object function(Object name, Object[] args) { [EOL]     return new ExtensionFunction((QName) name, toExpressionArray(args)); [EOL] } <line_num>: 115,117
public Object and(Object[] arguments) { [EOL]     return new CoreOperationAnd(toExpressionArray(arguments)); [EOL] } <line_num>: 119,122
public Object or(Object[] arguments) { [EOL]     return new CoreOperationOr(toExpressionArray(arguments)); [EOL] } <line_num>: 124,127
public Object union(Object[] arguments) { [EOL]     return new CoreOperationUnion(toExpressionArray(arguments)); [EOL] } <line_num>: 129,132
public Object locationPath(boolean absolute, Object[] steps) { [EOL]     return new LocationPath(absolute, toStepArray(steps)); [EOL] } <line_num>: 134,136
public Object expressionPath(Object expression, Object[] predicates, Object[] steps) { [EOL]     return new ExpressionPath((Expression) expression, toExpressionArray(predicates), toStepArray(steps)); [EOL] } <line_num>: 138,147
public Object nodeNameTest(Object qname) { [EOL]     return new NodeNameTest((QName) qname); [EOL] } <line_num>: 149,151
public Object nodeTypeTest(int nodeType) { [EOL]     return new NodeTypeTest(nodeType); [EOL] } <line_num>: 153,155
public Object processingInstructionTest(String instruction) { [EOL]     return new ProcessingInstructionTest(instruction); [EOL] } <line_num>: 157,159
public Object step(int axis, Object nodeTest, Object[] predicates) { [EOL]     return new Step(axis, (NodeTest) nodeTest, toExpressionArray(predicates)); [EOL] } <line_num>: 161,166
private Expression[] toExpressionArray(Object[] array) { [EOL]     Expression[] expArray = null; [EOL]     if (array != null) { [EOL]         expArray = new Expression[array.length]; [EOL]         for (int i = 0; i < expArray.length; i++) { [EOL]             expArray[i] = (Expression) array[i]; [EOL]         } [EOL]     } [EOL]     return expArray; [EOL] } <line_num>: 168,177
private Step[] toStepArray(Object[] array) { [EOL]     Step[] stepArray = null; [EOL]     if (array != null) { [EOL]         stepArray = new Step[array.length]; [EOL]         for (int i = 0; i < stepArray.length; i++) { [EOL]             stepArray[i] = (Step) array[i]; [EOL]         } [EOL]     } [EOL]     return stepArray; [EOL] } <line_num>: 179,188
private boolean isNameAttributeTest(Expression arg) { [EOL]     if (!(arg instanceof LocationPath)) { [EOL]         return false; [EOL]     } [EOL]     Step[] steps = ((LocationPath) arg).getSteps(); [EOL]     if (steps.length != 1) { [EOL]         return false; [EOL]     } [EOL]     if (steps[0].getAxis() != Compiler.AXIS_ATTRIBUTE) { [EOL]         return false; [EOL]     } [EOL]     NodeTest test = steps[0].getNodeTest(); [EOL]     if (!(test instanceof NodeNameTest)) { [EOL]         return false; [EOL]     } [EOL]     if (!((NodeNameTest) test).getNodeName().equals(QNAME_NAME)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 190,210
