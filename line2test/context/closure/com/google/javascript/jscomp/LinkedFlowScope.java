private LinkedFlowScope(FlatFlowScopeCache cache, LinkedFlowScope directParent)
 LinkedFlowScope(FlatFlowScopeCache cache)
 LinkedFlowScope(LinkedFlowScope directParent)
 LinkedFlowSlot(String name, JSType type, LinkedFlowSlot parent)
 FlatFlowScopeCache(Scope functionScope)
 FlatFlowScopeCache(LinkedFlowScope directParent)
 FlatFlowScopeCache(LinkedFlowScope joinedScopeA, LinkedFlowScope joinedScopeB)
private Scope getFunctionScope()
private boolean flowsFromBottom()
public static LinkedFlowScope createEntryLattice(Scope scope)
public void inferSlotType(String symbol, JSType type)
public void inferQualifiedSlot(Node node, String symbol, JSType bottomType, JSType inferredType)
public JSType getTypeOfThis()
public Node getRootNode()
public StaticScope<JSType> getParentScope()
public StaticSlot<JSType> getSlot(String name)
public StaticSlot<JSType> getOwnSlot(String name)
public FlowScope createChildFlowScope()
public StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope)
public void completeScope(StaticScope<JSType> staticScope)
public LinkedFlowScope optimize()
public FlowScope apply(FlowScope a, FlowScope b)
public boolean equals(Object other)
private boolean diffSlots(StaticSlot<JSType> slotA, StaticSlot<JSType> slotB)
private Map<String, StaticSlot<JSType>> allFlowSlots()
public StaticSlot<JSType> getSlot(String name)
FlatFlowScopeCache cache
LinkedFlowScope parent
int depth
int MAX_DEPTH=Optional[250]
FlatFlowScopeCache flattened
boolean frozen=Optional[false]
LinkedFlowSlot lastSlot
