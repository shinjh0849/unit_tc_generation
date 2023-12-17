 PreprocessorSymbolTable(Node root)
 Reference(SimpleSlot symbol, Node node)
public Node getRootNode()
public JSType getTypeOfThis()
public StaticScope<JSType> getParentScope()
public SimpleSlot getSlot(String name)
public SimpleSlot getOwnSlot(String name)
public Iterable<Reference> getReferences(SimpleSlot symbol)
public Iterable<SimpleSlot> getAllSymbols()
public StaticScope<JSType> getScope(SimpleSlot slot)
 void addReference(Node node)
Map<String, SimpleSlot> symbols=Optional[Maps.newHashMap()]
Multimap<String, Reference> refs=Optional[ArrayListMultimap.create()]
Node root
