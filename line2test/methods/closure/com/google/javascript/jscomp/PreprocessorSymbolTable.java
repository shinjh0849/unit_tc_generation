PreprocessorSymbolTable(Node root) { [EOL]     this.root = root; [EOL] } <line_num>: 54,56
Reference(SimpleSlot symbol, Node node) { [EOL]     super(symbol, node); [EOL] } <line_num>: 104,106
@Override [EOL] public Node getRootNode() { [EOL]     return root; [EOL] } <line_num>: 58,59
@Override [EOL] public JSType getTypeOfThis() { [EOL]     return null; [EOL] } <line_num>: 61,62
@Override [EOL] public StaticScope<JSType> getParentScope() { [EOL]     return null; [EOL] } <line_num>: 64,65
@Override [EOL] public SimpleSlot getSlot(String name) { [EOL]     return symbols.get(name); [EOL] } <line_num>: 67,70
@Override [EOL] public SimpleSlot getOwnSlot(String name) { [EOL]     return getSlot(name); [EOL] } <line_num>: 72,75
@Override [EOL] public Iterable<Reference> getReferences(SimpleSlot symbol) { [EOL]     return Collections.unmodifiableCollection(refs.get(symbol.getName())); [EOL] } <line_num>: 77,80
@Override [EOL] public Iterable<SimpleSlot> getAllSymbols() { [EOL]     return Collections.unmodifiableCollection(symbols.values()); [EOL] } <line_num>: 82,85
@Override [EOL] public StaticScope<JSType> getScope(SimpleSlot slot) { [EOL]     return this; [EOL] } <line_num>: 87,90
void addReference(Node node) { [EOL]     String name = node.getQualifiedName(); [EOL]     Preconditions.checkNotNull(name); [EOL]     if (!symbols.containsKey(name)) { [EOL]         symbols.put(name, new SimpleSlot(name, null, true)); [EOL]     } [EOL]     refs.put(name, new Reference(symbols.get(name), node)); [EOL] } <line_num>: 92,101
