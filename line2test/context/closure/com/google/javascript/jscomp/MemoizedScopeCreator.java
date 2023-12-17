 MemoizedScopeCreator(ScopeCreator delegate)
public Iterable<Var> getReferences(Var var)
public Scope getScope(Var var)
public Iterable<Var> getAllSymbols()
public Scope createScope(Node n, Scope parent)
 Collection<Scope> getAllMemoizedScopes()
 Scope getScopeIfMemoized(Node n)
 void removeScopesForScript(String scriptName)
Map<Node, Scope> scopes=Optional[Maps.newHashMap()]
ScopeCreator delegate
