MemoizedScopeCreator(ScopeCreator delegate) { [EOL]     this.delegate = delegate; [EOL] } <line_num>: 55,57
@Override [EOL] public Iterable<Var> getReferences(Var var) { [EOL]     return ImmutableList.of(var); [EOL] } <line_num>: 59,62
@Override [EOL] public Scope getScope(Var var) { [EOL]     return var.scope; [EOL] } <line_num>: 64,67
@Override [EOL] public Iterable<Var> getAllSymbols() { [EOL]     List<Var> vars = Lists.newArrayList(); [EOL]     for (Scope s : scopes.values()) { [EOL]         Iterables.addAll(vars, s.getAllSymbols()); [EOL]     } [EOL]     return vars; [EOL] } <line_num>: 69,76
@Override [EOL] public Scope createScope(Node n, Scope parent) { [EOL]     Scope scope = scopes.get(n); [EOL]     if (scope == null) { [EOL]         scope = delegate.createScope(n, parent); [EOL]         scopes.put(n, scope); [EOL]     } else { [EOL]         Preconditions.checkState(parent == scope.getParent()); [EOL]     } [EOL]     return scope; [EOL] } <line_num>: 78,88
Collection<Scope> getAllMemoizedScopes() { [EOL]     return Collections.unmodifiableCollection(scopes.values()); [EOL] } <line_num>: 90,92
Scope getScopeIfMemoized(Node n) { [EOL]     return scopes.get(n); [EOL] } <line_num>: 94,96
void removeScopesForScript(String scriptName) { [EOL]     for (Node scopeRoot : ImmutableSet.copyOf(scopes.keySet())) { [EOL]         if (scriptName.equals(scopeRoot.getSourceFileName())) { [EOL]             scopes.remove(scopeRoot); [EOL]         } [EOL]     } [EOL] } <line_num>: 103,109
