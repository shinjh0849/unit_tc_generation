public NameReferenceGraph(AbstractCompiler compiler) { [EOL]     super(true, true); [EOL]     this.compiler = compiler; [EOL]     UNKNOWN = new Name("{UNKNOWN}", true); [EOL]     UNKNOWN.isAliased = true; [EOL]     UNKNOWN.type = compiler.getTypeRegistry().getNativeType(JSTypeNative.NO_TYPE); [EOL]     this.createNode(UNKNOWN); [EOL]     MAIN = new Name("{Global Main}", true); [EOL]     this.createNode(MAIN); [EOL]     WINDOW = new Name("window", true); [EOL]     this.createNode(WINDOW); [EOL] } <line_num>: 86,102
public Name(String qName, boolean isExtern) { [EOL]     this.qName = qName; [EOL]     this.isExtern = isExtern; [EOL]     int lastDot = qName.lastIndexOf('.'); [EOL]     String name = (lastDot == -1) ? qName : qName.substring(lastDot + 1); [EOL]     this.isExported = compiler.getCodingConvention().isExported(name); [EOL]     this.type = compiler.getTypeRegistry().getNativeType(JSTypeNative.UNKNOWN_TYPE); [EOL] } <line_num>: 196,204
public Reference(Node site, Node parent) { [EOL]     this.site = site; [EOL]     this.parent = parent; [EOL] } <line_num>: 371,374
public Name defineNameIfNotExists(String name, boolean isExtern) { [EOL]     Name symbol = null; [EOL]     if (nameMap.containsKey(name)) { [EOL]         symbol = nameMap.get(name); [EOL]     } else { [EOL]         symbol = new Name(name, isExtern); [EOL]         nameMap.put(name, symbol); [EOL]         createNode(symbol); [EOL]     } [EOL]     return symbol; [EOL] } <line_num>: 104,115
public List<Name> getReferencesAt(Node site) { [EOL]     Preconditions.checkArgument(site.isGetProp() || site.isName()); [EOL]     List<Name> result = new ArrayList<Name>(); [EOL]     for (Name target : referenceMap.get(site)) { [EOL]         result.add(target); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 120,128
@Override [EOL] public Collection<Definition> getDefinitionsReferencedAt(Node useSite) { [EOL]     List<Name> nameRefs = getReferencesAt(useSite); [EOL]     if (nameRefs.isEmpty()) { [EOL]         return null; [EOL]     } [EOL]     List<Definition> result = Lists.newArrayList(); [EOL]     for (Name nameRef : nameRefs) { [EOL]         List<Definition> decls = nameRef.getDeclarations(); [EOL]         if (!decls.isEmpty()) { [EOL]             result.addAll(decls); [EOL]         } [EOL]     } [EOL]     if (!result.isEmpty()) { [EOL]         return result; [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 130,150
public Name getSymbol(String name) { [EOL]     return nameMap.get(name); [EOL] } <line_num>: 152,154
@Override [EOL] public GraphNode<Name, Reference> createNode(Name value) { [EOL]     nameMap.put(value.qName, value); [EOL]     return super.createNode(value); [EOL] } <line_num>: 156,160
@Override [EOL] public void connect(Name src, Reference ref, Name dest) { [EOL]     super.connect(src, ref, dest); [EOL]     referenceMap.put(ref.site, dest); [EOL] } <line_num>: 162,166
public JSType getType() { [EOL]     return type; [EOL] } <line_num>: 206,208
public void setType(JSType type) { [EOL]     this.type = type; [EOL] } <line_num>: 210,212
public List<Definition> getDeclarations() { [EOL]     return declarations; [EOL] } <line_num>: 214,216
public void addAssignmentDeclaration(Node node) { [EOL]     declarations.add(new AssignmentDefinition(node, isExtern)); [EOL] } <line_num>: 218,220
public void addFunctionDeclaration(Node node) { [EOL]     declarations.add(new NamedFunctionDefinition(node, isExtern)); [EOL] } <line_num>: 222,224
public boolean isExtern() { [EOL]     return isExtern; [EOL] } <line_num>: 226,228
public void markExported() { [EOL]     this.isExported = true; [EOL] } <line_num>: 230,232
public boolean isExported() { [EOL]     return isExported; [EOL] } <line_num>: 234,236
public final void remove() { [EOL]     for (Definition declaration : getDeclarations()) { [EOL]         declaration.remove(); [EOL]     } [EOL] } <line_num>: 239,243
public boolean isAliased() { [EOL]     return isAliased; [EOL] } <line_num>: 250,252
public void setAliased(boolean isAliased) { [EOL]     this.isAliased = isAliased; [EOL] } <line_num>: 254,256
public boolean hasSideEffect() { [EOL]     return isCallable(); [EOL] } <line_num>: 258,260
public String getQualifiedName() { [EOL]     return qName; [EOL] } <line_num>: 262,264
public String getPropertyName() { [EOL]     int lastIndexOfDot = qName.lastIndexOf('.'); [EOL]     if (lastIndexOfDot == -1) { [EOL]         return null; [EOL]     } else { [EOL]         return qName.substring(lastIndexOfDot + 1); [EOL]     } [EOL] } <line_num>: 270,277
public boolean isCallable() { [EOL]     return type.canBeCalled(); [EOL] } <line_num>: 279,281
public boolean exposedToCallOrApply() { [EOL]     return exposedToCallOrApply; [EOL] } <line_num>: 283,285
public void markExposedToCallOrApply() { [EOL]     exposedToCallOrApply = true; [EOL] } <line_num>: 287,289
@Override [EOL] public String toString() { [EOL]     return qName + " : " + type; [EOL] } <line_num>: 291,294
@Override [EOL] public int hashCode() { [EOL]     return qName.hashCode(); [EOL] } <line_num>: 296,299
public boolean canChangeSignature() { [EOL]     return !(isExtern() || !isCallable() || isAliased() || isExported() || exposedToCallOrApply() || nameUsesArgumentsProperty()); [EOL] } <line_num>: 316,335
private boolean nameUsesArgumentsProperty() { [EOL]     for (Definition definition : getDeclarations()) { [EOL]         if (NodeUtil.isVarArgsFunction(definition.getRValue())) { [EOL]             return true; [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 343,350
public boolean isUnknown() { [EOL]     return isUnknown; [EOL] } <line_num>: 376,378
public void setUnknown(boolean isUnknown) { [EOL]     this.isUnknown = isUnknown; [EOL] } <line_num>: 380,382
public JSModule getModule() { [EOL]     return module; [EOL] } <line_num>: 384,386
public void setModule(JSModule module) { [EOL]     this.module = module; [EOL] } <line_num>: 388,390
boolean isCall() { [EOL]     return site.isCall(); [EOL] } <line_num>: 392,394
public Node getSite() { [EOL]     return site; [EOL] } <line_num>: 402,404
