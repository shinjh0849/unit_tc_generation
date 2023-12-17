public MapBasedScope(Map<String, ? extends JSType> namesToTypes) { [EOL]     for (Map.Entry<String, ? extends JSType> entry : namesToTypes.entrySet()) { [EOL]         slots.put(entry.getKey(), new SimpleSlot(entry.getKey(), entry.getValue(), false)); [EOL]     } [EOL] } <line_num>: 56,62
public static MapBasedScope emptyScope() { [EOL]     return new MapBasedScope(ImmutableMap.<String, JSType>of()); [EOL] } <line_num>: 64,66
@Override [EOL] public StaticSlot<JSType> getSlot(String name) { [EOL]     return slots.get(name); [EOL] } <line_num>: 68,71
