public AliasSpecification(String aliasName, int tokenId)
 ThrowAliasSpecification(String aliasName)
 KeywordAliasSpecification(String aliasName, int tokenId)
 VoidKeywordAliasSpecification(String aliasName, int tokenId)
 AliasKeywords(AbstractCompiler compiler)
public void visit(NodeTraversal t, Node n, Node parent)
private void visitAliasableNode(Node n, Node parent)
private void visitNameNode(Node n)
public void visit(Node n, Node parent)
 boolean maybeInsertAliasDeclarationIntoParseTree(Node codeRoot)
public void doAlias(AbstractCompiler compiler)
public int getTokenId()
public String getAliasName()
protected abstract int minOccurrencesRequiredToAlias()
protected abstract void insertAliasDeclaration(Node codeRoot)
protected abstract void aliasNode(Node n, Node parent)
protected void aliasNode(Node throwNode, Node parent)
protected void insertAliasDeclaration(Node codeRoot)
protected int minOccurrencesRequiredToAlias()
 static int estimateMinOccurrencesRequriedToAlias()
private static Node createAliasFunctionNode(String aliasName)
protected int minOccurrencesRequiredToAlias()
protected void aliasNode(Node n, Node parent)
protected void insertAliasDeclaration(Node codeRoot)
public void visit(Node n, Node parent)
protected int minOccurrencesRequiredToAlias()
protected void aliasNode(Node n, Node parent)
protected void insertAliasDeclaration(Node codeRoot)
public void process(Node externs, Node root)
private boolean needsAliases()
private void addAliasNodes(Node codeRoot)
private boolean isAliasDefinition(Node n)
private boolean isAliasableType(int type)
private boolean isAliasName(String name)
private List<AliasSpecification> createAliasSpecifications()
String ALIAS_NULL=Optional["JSCompiler_alias_NULL"]
String ALIAS_TRUE=Optional["JSCompiler_alias_TRUE"]
String ALIAS_FALSE=Optional["JSCompiler_alias_FALSE"]
String ALIAS_THROW=Optional["JSCompiler_alias_THROW"]
String ALIAS_VOID=Optional["JSCompiler_alias_VOID"]
int MIN_OCCURRENCES_REQUIRED_TO_ALIAS_LITERAL=Optional[6]
int MIN_OCCURRENCES_REQUIRED_TO_ALIAS_THROW=Optional[estimateMinOccurrencesRequriedToAlias()]
AbstractCompiler compiler
List<AliasSpecification> aliasSpecifications
Map<Integer, AliasSpecification> aliasTypes
Set<String> aliasNames
