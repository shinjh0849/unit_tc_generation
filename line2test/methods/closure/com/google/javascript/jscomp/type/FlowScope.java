FlowScope createChildFlowScope(); <line_num>: 39,39
void inferSlotType(String symbol, JSType type); <line_num>: 45,45
void inferQualifiedSlot(Node node, String symbol, JSType bottomType, JSType inferredType); <line_num>: 59,60
FlowScope optimize(); <line_num>: 65,65
StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope); <line_num>: 74,74
void completeScope(StaticScope<JSType> scope); <line_num>: 81,81
