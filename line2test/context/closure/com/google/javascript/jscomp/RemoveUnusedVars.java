 RemoveUnusedVars(AbstractCompiler compiler, boolean removeGlobals, boolean preserveFunctionExpressionNames, boolean modifyCallSites)
 CallSiteOptimizer(AbstractCompiler compiler, SimpleDefinitionFinder defFinder)
 Continuation(Node node, Scope scope)
 Assign(Node assignNode, Node nameNode, boolean isPropertyAssign)
public void process(Node externs, Node root)
public void process(Node externs, Node root, SimpleDefinitionFinder defFinder)
private void traverseAndRemoveUnusedReferences(Node root)
private void traverseNode(Node n, Node parent, Scope scope)
private boolean isRemovableVar(Var var)
private void traverseFunction(Node n, Scope parentScope)
private void collectMaybeUnreferencedVars(Scope scope)
private void removeUnreferencedFunctionArgs(Scope fnScope)
private static Node getFunctionArgList(Node function)
public void optimize(Scope fnScope, Set<Var> referenced)
public void applyChanges()
private boolean markUnreferencedFunctionArgs(Scope scope, Node function, Set<Var> referenced, Node param, int paramIndex, boolean canChangeSignature)
private boolean canRemoveArgFromCallSites(Node function, int argIndex)
private void tryRemoveArgFromCallSites(Node function, int argIndex, boolean canModifyAllSites)
private void tryRemoveAllFollowingArgs(Node function, final int argIndex)
private static Node getArgumentForCallOrNewOrDotCall(UseSite site, final int argIndex)
 boolean canModifyCallers(Node function)
private static boolean isModifiableCallSite(UseSite site)
private boolean canChangeSignature(Node function)
private Definition getFunctionDefinition(Node function)
private void interpretAssigns()
private void removeAllAssigns(Var var)
private boolean markReferencedVar(Var var)
private void removeUnreferencedVars()
 void apply()
 static Assign maybeCreateAssign(Node assignNode)
 void remove()
AbstractCompiler compiler
CodingConvention codingConvention
boolean removeGlobals
boolean preserveFunctionExpressionNames
Set<Var> referenced=Optional[Sets.newHashSet()]
List<Var> maybeUnreferenced=Optional[Lists.newArrayList()]
List<Scope> allFunctionScopes=Optional[Lists.newArrayList()]
Multimap<Var, Assign> assignsByVar=Optional[ArrayListMultimap.create()]
Map<Node, Assign> assignsByNode=Optional[Maps.newHashMap()]
Multimap<Var, Node> classDefiningCalls=Optional[ArrayListMultimap.create()]
Multimap<Var, Continuation> continuations=Optional[ArrayListMultimap.create()]
boolean modifyCallSites
CallSiteOptimizer callSiteOptimizer
