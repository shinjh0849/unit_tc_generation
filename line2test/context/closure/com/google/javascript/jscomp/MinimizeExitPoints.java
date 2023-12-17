 MinimizeExitPoints(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
 void tryMinimizeExits(Node n, int exitType, String labelName)
private void tryMinimizeIfBlockExits(Node srcBlock, Node destBlock, Node ifNode, int exitType, String labelName)
private static boolean matchingExitNode(Node n, int type, String labelName)
private static void moveAllFollowing(Node start, Node srcParent, Node destParent)
AbstractCompiler compiler
