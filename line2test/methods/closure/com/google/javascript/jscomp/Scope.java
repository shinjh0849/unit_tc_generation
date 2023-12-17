private Var(boolean inferred, String name, Node nameNode, JSType type, Scope scope, int index, CompilerInput input) { [EOL]     this.name = name; [EOL]     this.nameNode = nameNode; [EOL]     this.type = type; [EOL]     this.scope = scope; [EOL]     this.index = index; [EOL]     this.input = input; [EOL]     this.typeInferred = inferred; [EOL] } <line_num>: 120,129
Arguments(Scope scope) { [EOL]     super(false, "arguments", null, null, scope, -1, null); [EOL] } <line_num>: 354,365
Scope(Scope parent, Node rootNode) { [EOL]     Preconditions.checkNotNull(parent); [EOL]     Preconditions.checkArgument(rootNode != parent.rootNode); [EOL]     this.parent = parent; [EOL]     this.rootNode = rootNode; [EOL]     this.isBottom = false; [EOL]     this.depth = parent.depth + 1; [EOL] } <line_num>: 386,394
private Scope(Node rootNode, boolean isBottom) { [EOL]     this.parent = null; [EOL]     this.rootNode = rootNode; [EOL]     this.isBottom = isBottom; [EOL]     this.depth = 0; [EOL] } <line_num>: 402,407
@Override [EOL] public boolean apply(Var var) { [EOL]     return var.getParentNode() != null && var.getType() == null && var.getParentNode().isVar() && !var.isExtern(); [EOL] } <line_num>: 68,73
@Override [EOL] public String getName() { [EOL]     return name; [EOL] } <line_num>: 134,137
@Override [EOL] public Node getNode() { [EOL]     return nameNode; [EOL] } <line_num>: 142,145
CompilerInput getInput() { [EOL]     return input; [EOL] } <line_num>: 147,149
@Override [EOL] public StaticSourceFile getSourceFile() { [EOL]     return nameNode.getStaticSourceFile(); [EOL] } <line_num>: 151,154
@Override [EOL] public Var getSymbol() { [EOL]     return this; [EOL] } <line_num>: 156,159
@Override [EOL] public Var getDeclaration() { [EOL]     return nameNode == null ? null : this; [EOL] } <line_num>: 161,164
public Node getParentNode() { [EOL]     return nameNode == null ? null : nameNode.getParent(); [EOL] } <line_num>: 169,171
public boolean isBleedingFunction() { [EOL]     return NodeUtil.isFunctionExpression(getParentNode()); [EOL] } <line_num>: 177,179
Scope getScope() { [EOL]     return scope; [EOL] } <line_num>: 184,186
public boolean isGlobal() { [EOL]     return scope.isGlobal(); [EOL] } <line_num>: 191,193
public boolean isLocal() { [EOL]     return scope.isLocal(); [EOL] } <line_num>: 198,200
boolean isExtern() { [EOL]     return input == null || input.isExtern(); [EOL] } <line_num>: 205,207
public boolean isConst() { [EOL]     return nameNode != null && NodeUtil.isConstantName(nameNode); [EOL] } <line_num>: 213,215
public boolean isDefine() { [EOL]     JSDocInfo info = getJSDocInfo(); [EOL]     return info != null && info.isDefine(); [EOL] } <line_num>: 221,224
public Node getInitialValue() { [EOL]     return NodeUtil.getRValueOfLValue(nameNode); [EOL] } <line_num>: 226,228
@Override [EOL] public JSType getType() { [EOL]     return type; [EOL] } <line_num>: 234,237
public Node getNameNode() { [EOL]     return nameNode; [EOL] } <line_num>: 242,244
@Override [EOL] public JSDocInfo getJSDocInfo() { [EOL]     return nameNode == null ? null : NodeUtil.getBestJSDocInfo(nameNode); [EOL] } <line_num>: 249,252
void setType(JSType type) { [EOL]     Preconditions.checkState(isTypeInferred()); [EOL]     this.type = type; [EOL] } <line_num>: 258,261
void resolveType(ErrorReporter errorReporter) { [EOL]     if (type != null) { [EOL]         type = type.resolve(errorReporter, scope); [EOL]     } [EOL] } <line_num>: 266,270
@Override [EOL] public boolean isTypeInferred() { [EOL]     return typeInferred; [EOL] } <line_num>: 276,279
public String getInputName() { [EOL]     if (input == null) [EOL]         return "<non-file>"; [EOL]     else [EOL]         return input.getName(); [EOL] } <line_num>: 281,286
public boolean isNoShadow() { [EOL]     JSDocInfo info = getJSDocInfo(); [EOL]     return info != null && info.isNoShadow(); [EOL] } <line_num>: 288,291
@Override [EOL] public boolean equals(Object other) { [EOL]     if (!(other instanceof Var)) { [EOL]         return false; [EOL]     } [EOL]     Var otherVar = (Var) other; [EOL]     return otherVar.nameNode == nameNode; [EOL] } <line_num>: 293,300
@Override [EOL] public int hashCode() { [EOL]     return nameNode.hashCode(); [EOL] } <line_num>: 302,304
@Override [EOL] public String toString() { [EOL]     return "Scope.Var " + name + "{" + type + "}"; [EOL] } <line_num>: 306,309
void markEscaped() { [EOL]     markedEscaped = true; [EOL] } <line_num>: 317,319
boolean isMarkedEscaped() { [EOL]     return markedEscaped; [EOL] } <line_num>: 325,327
void markAssignedExactlyOnce() { [EOL]     markedAssignedExactlyOnce = true; [EOL] } <line_num>: 335,337
boolean isMarkedAssignedExactlyOnce() { [EOL]     return markedAssignedExactlyOnce; [EOL] } <line_num>: 343,345
@Override [EOL] public boolean equals(Object other) { [EOL]     if (!(other instanceof Arguments)) { [EOL]         return false; [EOL]     } [EOL]     Arguments otherVar = (Arguments) other; [EOL]     return otherVar.scope.getRootNode() == scope.getRootNode(); [EOL] } <line_num>: 367,374
@Override [EOL] public int hashCode() { [EOL]     return System.identityHashCode(this); [EOL] } <line_num>: 376,378
static Scope createGlobalScope(Node rootNode) { [EOL]     return new Scope(rootNode, false); [EOL] } <line_num>: 409,411
static Scope createLatticeBottom(Node rootNode) { [EOL]     return new Scope(rootNode, true); [EOL] } <line_num>: 413,415
int getDepth() { [EOL]     return depth; [EOL] } <line_num>: 418,420
boolean isBottom() { [EOL]     return isBottom; [EOL] } <line_num>: 423,425
@Override [EOL] public Node getRootNode() { [EOL]     return rootNode; [EOL] } <line_num>: 431,434
public Scope getParent() { [EOL]     return parent; [EOL] } <line_num>: 436,438
Scope getGlobalScope() { [EOL]     Scope result = this; [EOL]     while (result.getParent() != null) { [EOL]         result = result.getParent(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 440,446
@Override [EOL] public StaticScope<JSType> getParentScope() { [EOL]     return parent; [EOL] } <line_num>: 448,451
@Override [EOL] public JSType getTypeOfThis() { [EOL]     if (isGlobal()) { [EOL]         return ObjectType.cast(rootNode.getJSType()); [EOL]     } [EOL]     Preconditions.checkState(rootNode.isFunction()); [EOL]     JSType nodeType = rootNode.getJSType(); [EOL]     if (nodeType != null && nodeType.isFunctionType()) { [EOL]         return nodeType.toMaybeFunctionType().getTypeOfThis(); [EOL]     } else { [EOL]         return parent.getTypeOfThis(); [EOL]     } [EOL] } <line_num>: 456,469
Var declare(String name, Node nameNode, JSType type, CompilerInput input) { [EOL]     return declare(name, nameNode, type, input, true); [EOL] } <line_num>: 479,481
Var declare(String name, Node nameNode, JSType type, CompilerInput input, boolean inferred) { [EOL]     Preconditions.checkState(name != null && name.length() > 0); [EOL]     Preconditions.checkState(vars.get(name) == null); [EOL]     Var var = new Var(inferred, name, nameNode, type, this, vars.size(), input); [EOL]     vars.put(name, var); [EOL]     return var; [EOL] } <line_num>: 493,503
void undeclare(Var var) { [EOL]     Preconditions.checkState(var.scope == this); [EOL]     Preconditions.checkState(vars.get(var.name) == var); [EOL]     vars.remove(var.name); [EOL] } <line_num>: 509,513
@Override [EOL] public Var getSlot(String name) { [EOL]     return getVar(name); [EOL] } <line_num>: 515,518
@Override [EOL] public Var getOwnSlot(String name) { [EOL]     return vars.get(name); [EOL] } <line_num>: 520,523
public Var getVar(String name) { [EOL]     Var var = vars.get(name); [EOL]     if (var != null) { [EOL]         return var; [EOL]     } else if (parent != null) { [EOL]         return parent.getVar(name); [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 528,537
public Var getArgumentsVar() { [EOL]     if (arguments == null) { [EOL]         arguments = new Arguments(this); [EOL]     } [EOL]     return arguments; [EOL] } <line_num>: 542,547
public boolean isDeclared(String name, boolean recurse) { [EOL]     Scope scope = this; [EOL]     if (scope.vars.containsKey(name)) [EOL]         return true; [EOL]     if (scope.parent != null && recurse) { [EOL]         return scope.parent.isDeclared(name, recurse); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 552,561
public Iterator<Var> getVars() { [EOL]     return vars.values().iterator(); [EOL] } <line_num>: 566,568
Iterable<Var> getVarIterable() { [EOL]     return vars.values(); [EOL] } <line_num>: 573,575
@Override [EOL] public Iterable<Var> getReferences(Var var) { [EOL]     return ImmutableList.of(var); [EOL] } <line_num>: 577,580
@Override [EOL] public StaticScope<JSType> getScope(Var var) { [EOL]     return var.scope; [EOL] } <line_num>: 582,585
@Override [EOL] public Iterable<Var> getAllSymbols() { [EOL]     return Collections.unmodifiableCollection(vars.values()); [EOL] } <line_num>: 587,590
public int getVarCount() { [EOL]     return vars.size(); [EOL] } <line_num>: 595,597
public boolean isGlobal() { [EOL]     return parent == null; [EOL] } <line_num>: 602,604
public boolean isLocal() { [EOL]     return !isGlobal(); [EOL] } <line_num>: 609,611
public Iterator<Var> getDeclarativelyUnboundVarsWithoutTypes() { [EOL]     return Iterators.filter(getVars(), DECLARATIVELY_UNBOUND_VARS_WITHOUT_TYPES); [EOL] } <line_num>: 616,619
