 PeepholeFoldConstants(boolean late)
 Node optimizeSubtree(Node subtree)
private Node tryFoldBinaryOperator(Node subtree)
private Node tryReduceVoid(Node n)
private void tryReduceOperandsForOp(Node n)
private void tryConvertOperandsToNumber(Node n)
private void tryConvertToNumber(Node n)
private Node tryFoldTypeof(Node originalTypeofNode)
private Node tryFoldUnaryOperator(Node n)
private Node tryFoldInstanceof(Node n, Node left, Node right)
private Node tryFoldAssign(Node n, Node left, Node right)
private Node tryUnfoldAssignOp(Node n, Node left, Node right)
private Node tryFoldAndOr(Node n, Node left, Node right)
private Node tryFoldChildAddString(Node n, Node left, Node right)
private Node tryFoldAddConstantString(Node n, Node left, Node right)
private Node tryFoldArithmeticOp(Node n, Node left, Node right)
private Node performArithmeticOp(int opType, Node left, Node right)
private Node tryFoldLeftChildOp(Node n, Node left, Node right)
private Node tryFoldAdd(Node node, Node left, Node right)
private Node tryFoldShift(Node n, Node left, Node right)
private Node tryFoldComparison(Node n, Node left, Node right)
 static TernaryValue evaluateComparison(int op, Node left, Node right)
private static TernaryValue areStringsEqual(String a, String b)
private static int getNormalizedNodeType(Node n)
private static TernaryValue compareAsNumbers(int op, Node left, Node right)
private static boolean compareToUndefined(Node value, int op)
private static boolean isEqualityOp(int op)
private static boolean compareToNull(Node value, int op)
private Node tryFoldCtorCall(Node n)
private boolean inForcedStringContext(Node n)
private Node tryFoldInForcedStringContext(Node n)
private Node tryFoldGetElem(Node n, Node left, Node right)
private Node tryFoldGetProp(Node n, Node left, Node right)
private boolean isAssignmentTarget(Node n)
private Node tryFoldArrayAccess(Node n, Node left, Node right)
private Node tryFoldObjectPropAccess(Node n, Node left, Node right)
DiagnosticType INVALID_GETELEM_INDEX_ERROR=Optional[DiagnosticType.warning("JSC_INVALID_GETELEM_INDEX_ERROR", "Array index not integer: {0}")]
DiagnosticType INDEX_OUT_OF_BOUNDS_ERROR=Optional[DiagnosticType.warning("JSC_INDEX_OUT_OF_BOUNDS_ERROR", "Array index out of bounds: {0}")]
DiagnosticType NEGATING_A_NON_NUMBER_ERROR=Optional[DiagnosticType.warning("JSC_NEGATING_A_NON_NUMBER_ERROR", "Can't negate non-numeric value: {0}")]
DiagnosticType BITWISE_OPERAND_OUT_OF_RANGE=Optional[DiagnosticType.warning("JSC_BITWISE_OPERAND_OUT_OF_RANGE", "Operand out of range, bitwise operation will lose information: {0}")]
DiagnosticType SHIFT_AMOUNT_OUT_OF_BOUNDS=Optional[DiagnosticType.warning("JSC_SHIFT_AMOUNT_OUT_OF_BOUNDS", "Shift amount out of bounds: {0}")]
DiagnosticType FRACTIONAL_BITWISE_OPERAND=Optional[DiagnosticType.warning("JSC_FRACTIONAL_BITWISE_OPERAND", "Fractional bitwise operand: {0}")]
double MAX_FOLD_NUMBER=Optional[Math.pow(2, 53)]
boolean late
