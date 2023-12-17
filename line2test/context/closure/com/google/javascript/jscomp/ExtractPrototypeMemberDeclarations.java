 Pattern(int globalOverHead, int perExtractionOverhead, int perMemberOverhead)
 ExtractPrototypeMemberDeclarations(AbstractCompiler compiler, Pattern pattern)
private ExtractionInstance(PrototypeMemberDeclaration head, Node parent)
private PrototypeMemberDeclaration(Node lhs, Node node)
public void process(Node externs, Node root)
private void doExtraction(GatherExtractionInfo info)
private void extractInstance(ExtractionInstance instance)
private void replacePrototypeMemberDeclaration(PrototypeMemberDeclaration declar)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean shouldExtract()
 boolean isFavorable()
private boolean isSameClass(PrototypeMemberDeclaration other)
private static PrototypeMemberDeclaration extractDeclaration(Node n)
String prototypeAlias=Optional["JSCompiler_prototypeAlias"]
AbstractCompiler compiler
Pattern pattern
