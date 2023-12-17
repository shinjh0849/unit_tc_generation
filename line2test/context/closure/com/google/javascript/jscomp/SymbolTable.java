 SymbolTable(JSTypeRegistry registry)
 Symbol(String name, JSType type, boolean inferred, SymbolScope scope)
 Reference(Symbol symbol, Node node)
 SymbolScope(Node rootNode, @Nullable SymbolScope parent, JSType typeOfThis, Symbol mySymbol)
 PropertyRefCollector(AbstractCompiler compiler)
 ThisRefCollector(AbstractCompiler compiler)
private JSDocInfoCollector(JSTypeRegistry registry)
public Iterable<Reference> getReferences(Symbol symbol)
public List<Reference> getReferenceList(Symbol symbol)
public Iterable<Symbol> getAllSymbols()
public List<Symbol> getAllSymbolsSorted()
public Ordering<Symbol> getNaturalSymbolOrdering()
public SymbolScope getScope(Symbol slot)
public Collection<JSDocInfo> getAllJSDocInfo()
public Symbol declareInferredSymbol(SymbolScope scope, String name, Node declNode)
public SymbolScope getEnclosingScope(Node n)
public Symbol getParameterInFunction(Symbol sym, String paramName)
private SymbolScope getScopeInFunction(Symbol sym)
public Symbol getSymbolForScope(SymbolScope scope)
private Symbol findSymbolForScope(SymbolScope scope)
public Iterable<Symbol> getAllSymbolsForTypeOf(Symbol sym)
public SymbolScope getGlobalScope()
public Symbol getSymbolDeclaredBy(FunctionType fn)
public Symbol getSymbolDeclaredBy(EnumType enumType)
public Symbol getSymbolForInstancesOf(Symbol sym)
public Symbol getSymbolForInstancesOf(FunctionType fn)
private Symbol getSymbolForName(Node source, String name)
public List<Symbol> getAllSymbolsForType(JSType type)
private Symbol getSymbolForTypeHelper(JSType type, boolean linkToCtor)
public String toDebugString()
private void toDebugString(StringBuilder builder, Symbol symbol)
 void addScopes(Collection<S> scopes)
public void enterScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node p)
 void findScopes(AbstractCompiler compiler, Node externs, Node root)
public Collection<SymbolScope> getAllScopes()
public void addAnonymousFunctions()
private void addAnonymousFunctionsInScope(SymbolScope scope)
 void addSymbolsFrom(StaticSymbolTable<S, R> otherSymbolTable)
private Symbol isAnySymbolDeclared(String name, Node declNode, SymbolScope scope)
private StaticReference<JSType> findBestDeclToAdd(StaticSymbolTable<S, R> otherSymbolTable, S slot)
private boolean isGoodRefToAdd(@Nullable StaticReference<JSType> ref)
private Symbol copySymbolTo(StaticSlot<JSType> sym, SymbolScope scope)
private Symbol copySymbolTo(StaticSlot<JSType> sym, Node declNode, SymbolScope scope)
private Symbol addSymbol(String name, JSType type, boolean inferred, SymbolScope scope, Node declNode)
private Symbol declareSymbol(String name, JSType type, boolean inferred, SymbolScope scope, Node declNode, JSDocInfo info)
private void removeSymbol(Symbol s)
 void fillNamespaceReferences()
 void fillPropertyScopes()
private boolean needsPropertyScope(Symbol sym)
 void pruneOrphanedNames()
 void fillPropertySymbols(AbstractCompiler compiler, Node externs, Node root)
 void fillJSDocInfo(AbstractCompiler compiler, Node externs, Node root)
private void createPropertyScopeFor(Symbol s)
 void fillThisReferences(AbstractCompiler compiler, Node externs, Node root)
private SymbolScope createScopeFrom(StaticScope<JSType> otherScope)
public Reference getDeclaration()
public FunctionType getFunctionType()
public Reference defineReferenceAt(Node n)
 void setDeclaration(Reference ref)
public boolean inGlobalScope()
public boolean inExterns()
public Node getDeclarationNode()
public String getSourceFileName()
public SymbolScope getPropertyScope()
 void setPropertyScope(SymbolScope scope)
public JSDocInfo getJSDocInfo()
 void setJSDocInfo(JSDocInfo info)
public boolean isProperty()
public boolean isLexicalVariable()
public boolean isDocOnlyParameter()
public String toString()
 Symbol getSymbolForScope()
 void setSymbolForScope(Symbol sym)
public int getIndexOfSymbol(Symbol sym)
public Node getRootNode()
public SymbolScope getParentScope()
public Symbol getQualifiedSlot(String name)
public Symbol getSlot(String name)
public Symbol getOwnSlot(String name)
public JSType getTypeOfThis()
public boolean isGlobalScope()
public boolean isDocScope()
public boolean isPropertyScope()
public boolean isLexicalScope()
public int getScopeDepth()
public String toString()
public void process(Node externs, Node root)
private boolean maybeDefineReference(Node n, String propName, Symbol ownerSymbol)
private boolean tryDefineLexicalQualifiedNameRef(String name, Node n)
private void tryRemoveLexicalQualifiedNameRef(String name, Node n)
private boolean maybeDefineTypedReference(Node n, String propName, JSType owner)
public void visit(NodeTraversal t, Node n, Node parent)
public void process(Node externs, Node root)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
public void visitTypeNode(SymbolScope scope, Node n)
public int compare(Node a, Node b)
public int compare(SymbolScope a, SymbolScope b)
public int compare(Symbol a, Symbol b)
private int getLexicalScopeDepth(SymbolScope scope)
Logger logger=Optional[Logger.getLogger(SymbolTable.class.getName())]
String GLOBAL_THIS=Optional["*global*"]
Table<Node, String, Symbol> symbols=Optional[HashBasedTable.create()]
Map<Node, SymbolScope> scopes=Optional[Maps.newLinkedHashMap()]
List<JSDocInfo> docInfos=Optional[Lists.newArrayList()]
SymbolScope globalScope=Optional[null]
JSTypeRegistry registry
Ordering<String> SOURCE_NAME_ORDERING=Optional[Ordering.natural().nullsFirst()]
Ordering<Node> NODE_ORDERING=Optional[new Ordering<Node>() {

    @Override
    public int compare(Node a, Node b) {
        int result = SOURCE_NAME_ORDERING.compare(a.getSourceFileName(), b.getSourceFileName());
        if (result != 0) {
            return result;
        }
        // Source position is a bit mask of line in the top 4 bits, so this
        // is a quick way to compare order without computing absolute position.
        return a.getSourcePosition() - b.getSourcePosition();
    }
}]
Ordering<SymbolScope> LEXICAL_SCOPE_ORDERING=Optional[new Ordering<SymbolScope>() {

    @Override
    public int compare(SymbolScope a, SymbolScope b) {
        Preconditions.checkState(a.isLexicalScope() && b.isLexicalScope(), "We can only sort lexical scopes");
        return NODE_ORDERING.compare(a.getRootNode(), b.getRootNode());
    }
}]
Ordering<Symbol> SYMBOL_ORDERING=Optional[new Ordering<Symbol>() {

    @Override
    public int compare(Symbol a, Symbol b) {
        SymbolScope scopeA = getScope(a);
        SymbolScope scopeB = getScope(b);
        // More deeply nested symbols should go later.
        int result = getLexicalScopeDepth(scopeA) - getLexicalScopeDepth(scopeB);
        if (result != 0) {
            return result;
        }
        // After than, just use lexicographic ordering.
        // This ensures "a.b" comes before "a.b.c".
        return a.getName().compareTo(b.getName());
    }
}]
