 ErrorReporter(AbstractCompiler compiler)
private Operator(String name)
private Type(String name)
private void report(JsonML element, String... arguments) throws JsonMLException
private void report(DiagnosticType type, JsonML element, String... arguments) throws JsonMLException
private void report(JSError error) throws JsonMLException
private void report(JSError error, boolean terminal) throws JsonMLException
public void setRootElement(JsonML rootElement)
public Node parse(AbstractCompiler compiler) throws JsonMLException
private T getOptionalAttribute(JsonML element, TagAttr attr, Class<T> type) throws JsonMLException
private T getAttribute(JsonML element, TagAttr attr, Class<T> type) throws JsonMLException
private T getAttribute(JsonML element, TagAttr attr, Class<T> type, boolean optional) throws JsonMLException
private Object getObjectAttribute(JsonML element, TagAttr attr) throws JsonMLException
private String getStringAttribute(JsonML element, TagAttr attr) throws JsonMLException
private void validate(JsonML element) throws JsonMLException
private void transformElement(JsonML element, Node parent) throws JsonMLException
private void transformAllChildren(JsonML element, Node parent, boolean newState) throws JsonMLException
private void transformAllChildren(JsonML element, Node parent) throws JsonMLException
private void transformAllChildrenFromIndex(JsonML element, Node parent, int fromIndex, boolean newState) throws JsonMLException
private void transformElements(List<JsonML> elements, Node parent, boolean newState) throws JsonMLException
private void transformElements(List<JsonML> elements, Node parent) throws JsonMLException
private boolean transformExpr(JsonML element, Node parent) throws JsonMLException
private void transformForLoop(JsonML element, Node parent, int childno) throws JsonMLException
private void transformJumpStmt(JsonML element, Node parent, int type) throws JsonMLException
private void transformLogicalExpr(JsonML element, Node parent, int type) throws JsonMLException
private void transformTwoArgumentExpr(JsonML element, Node parent, int type) throws JsonMLException
private void transformPotentiallyUnwrappedBlock(JsonML element, Node parent) throws JsonMLException
private void transformArrayExpr(JsonML element, Node parent) throws JsonMLException
private void transformAssignExpr(JsonML element, Node parent) throws JsonMLException
private void transformBinaryExpr(JsonML element, Node parent) throws JsonMLException
private void transformBlock(JsonML element, Node parent) throws JsonMLException
private void transformBlock(JsonML element, Node parent, int start) throws JsonMLException
private void transformBlock(JsonML element, Node parent, int start, int end) throws JsonMLException
private void transformBreakStmt(JsonML element, Node parent) throws JsonMLException
private void transformCallExpr(JsonML element, Node parent) throws JsonMLException
private void transformCase(JsonML element, Node parent) throws JsonMLException
private void transformCatchClause(JsonML element, Node parent) throws JsonMLException
private void transformConditionalExpr(JsonML element, Node parent) throws JsonMLException
private void transformContinueStmt(JsonML element, Node parent) throws JsonMLException
private void transformCountExpr(JsonML element, Node parent) throws JsonMLException
private void transformDataProp(JsonML element, Node parent) throws JsonMLException
private static String getStringValue(double value)
private void transformGetterProp(JsonML element, Node parent) throws JsonMLException
private void transformSetterProp(JsonML element, Node parent) throws JsonMLException
private void transformProp(int tokenType, JsonML element, Node parent) throws JsonMLException
private void transformDefaultCase(JsonML element, Node parent) throws JsonMLException
private void transformDeleteExpr(JsonML element, Node parent) throws JsonMLException
private void transformDoWhileStmt(JsonML element, Node parent) throws JsonMLException
private void transformEmpty(JsonML element, Node parent)
private void transformEmptyStmt(JsonML element, Node parent)
private void transformEvalExpr(JsonML element, Node parent) throws JsonMLException
private void transformForInStmt(JsonML element, Node parent) throws JsonMLException
private void transformForStmt(JsonML element, Node parent) throws JsonMLException
private void transformFunction(JsonML element, Node parent, boolean needsName) throws JsonMLException
private void transformFunctionDecl(JsonML element, Node parent) throws JsonMLException
private void transformFunctionExpr(JsonML element, Node parent) throws JsonMLException
private void transformIdExpr(JsonML element, Node parent) throws JsonMLException
private void transformInitPatt(JsonML element, Node parent) throws JsonMLException
private void transformIdPatt(JsonML element, Node parent) throws JsonMLException
private void transformIfStmt(JsonML element, Node parent) throws JsonMLException
private void transformInvokeExpr(JsonML element, Node parent) throws JsonMLException
private void transformLabelledStmt(JsonML element, Node parent) throws JsonMLException
private void transformLiteralExpr(JsonML element, Node parent) throws JsonMLException
private void transformLogicalAndExpr(JsonML element, Node parent) throws JsonMLException
private void transformLogicalOrExpr(JsonML element, Node parent) throws JsonMLException
private void transformMemberExpr(JsonML element, Node parent) throws JsonMLException
private void transformNewExpr(JsonML element, Node parent) throws JsonMLException
private void transformObjectExpr(JsonML element, Node parent) throws JsonMLException
private void transformParamDecl(JsonML element, Node parent) throws JsonMLException
private void transformProgram(JsonML element, Node parent) throws JsonMLException
private void transformPrologueDecl(JsonML element, Node parent) throws JsonMLException
private void transformRegExpExpr(JsonML element, Node parent) throws JsonMLException
private void transformReturnStmt(JsonML element, Node parent) throws JsonMLException
private void transformSwitchStmt(JsonML element, Node parent) throws JsonMLException
private void transformThisExpr(JsonML element, Node parent) throws JsonMLException
private void transformThrowStmt(JsonML element, Node parent) throws JsonMLException
private void transformTryStmt(JsonML element, Node parent) throws JsonMLException
private void transformTypeofExpr(JsonML element, Node parent) throws JsonMLException
private void transformUnaryExpr(JsonML element, Node parent) throws JsonMLException
private void transformVarDecl(JsonML element, Node parent) throws JsonMLException
private void transformWhileStmt(JsonML element, Node parent) throws JsonMLException
private void transformWithStmt(JsonML element, Node parent) throws JsonMLException
private Node createNode(int type, JsonML element)
private void setPosition(Node node)
private String getName()
private static Operator get(String name)
private static int getNodeTypeForAssignOp(String name)
private static int getNodeTypeForBinaryOp(String name)
private static int getNodeTypeForCountOp(String name)
private static int getNodeTypeForUnaryOp(String name)
private String getName()
private static Type get(String name)
