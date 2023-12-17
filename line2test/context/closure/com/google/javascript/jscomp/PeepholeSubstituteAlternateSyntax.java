 PeepholeSubstituteAlternateSyntax(boolean late)
public boolean apply(Node input)
public Node optimizeSubtree(Node node)
private void tryJoinForCondition(Node n)
private Node tryFoldSimpleFunctionCall(Node n)
private Node tryFoldImmediateCallToBoundFunction(Node n)
private void addParameterAfter(Node parameterList, Node after)
private Node trySplitComma(Node n)
private Node tryReplaceIf(Node n)
private boolean statementMustExitParent(Node n)
private Node tryReplaceUndefined(Node n)
private Node tryReduceReturn(Node n)
private Node tryReplaceExitWithBreak(Node n)
private Node tryRemoveRedundantExit(Node n)
 boolean isPure(Node n)
 Node skipFinallyNodes(Node n)
 boolean areMatchingExits(Node nodeThis, Node nodeThat)
 boolean isExceptionPossible(Node n)
 Node getExceptionHandler(Node n)
private Node tryMinimizeNot(Node n)
private Node tryMinimizeIf(Node n)
private void tryRemoveRepeatedStatements(Node n)
private boolean isFoldableExpressBlock(Node n)
private Node getBlockExpression(Node n)
private boolean isReturnBlock(Node n)
private boolean isReturnExpressBlock(Node n)
private boolean isReturnExpression(Node n)
private Node getBlockReturnExpression(Node n)
private boolean isVarBlock(Node n)
private Node getBlockVar(Node n)
private boolean consumesDanglingElse(Node n)
public boolean apply(Node input)
private boolean isLowerPrecedenceInExpression(Node n, final int precedence)
private boolean isLowerPrecedence(Node n, final int precedence)
private boolean isHigherPrecedence(Node n, final int precedence)
public boolean apply(Node input)
private boolean isPropertyAssignmentInExpression(Node n)
private Node tryMinimizeCondition(Node n)
private Node maybeReplaceChildWithNumber(Node n, Node parent, int num)
private Node tryFoldStandardConstructors(Node n)
private Node tryFoldLiteralConstructor(Node n)
private FoldArrayAction isSafeToFoldArrayConstructor(Node arg)
private Node tryFoldRegularExpressionConstructor(Node n)
private Node reduceTrueFalse(Node n)
private Node tryMinimizeArrayLiteral(Node n)
private Node tryMinimizeStringArrayLiteral(Node n)
private String pickDelimiter(String[] strings)
private static boolean areValidRegexpFlags(String flags)
private boolean areSafeFlagsToFold(String flags)
private static Node makeForwardSlashBracketSafe(Node n)
 static boolean containsUnicodeEscape(String s)
int AND_PRECEDENCE=Optional[NodeUtil.precedence(Token.AND)]
int OR_PRECEDENCE=Optional[NodeUtil.precedence(Token.OR)]
int NOT_PRECEDENCE=Optional[NodeUtil.precedence(Token.NOT)]
CodeGenerator REGEXP_ESCAPER=Optional[CodeGenerator.forCostEstimation(null)]
boolean late
int STRING_SPLIT_OVERHEAD=Optional[".split('.')".length()]
DiagnosticType INVALID_REGULAR_EXPRESSION_FLAGS=Optional[DiagnosticType.warning("JSC_INVALID_REGULAR_EXPRESSION_FLAGS", "Invalid flags to RegExp constructor: {0}")]
Predicate<Node> DONT_TRAVERSE_FUNCTIONS_PREDICATE=Optional[new Predicate<Node>() {

    @Override
    public boolean apply(Node input) {
        return !input.isFunction();
    }
}]
ImmutableSet<String> STANDARD_OBJECT_CONSTRUCTORS=Optional[// String, Number, and Boolean functions return non-object types, whereas
// new String, new Number, and new Boolean return object types, so don't
// include them here.
ImmutableSet.of("Object", "Array", "RegExp", "Error")]
Pattern REGEXP_FLAGS_RE=Optional[Pattern.compile("^[gmi]*$")]
