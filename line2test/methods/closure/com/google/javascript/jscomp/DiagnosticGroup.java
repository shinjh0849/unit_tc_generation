DiagnosticGroup(String name, DiagnosticType... types) { [EOL]     this.name = name; [EOL]     this.types = ImmutableSet.copyOf(Arrays.asList(types)); [EOL] } <line_num>: 45,48
public DiagnosticGroup(DiagnosticType... types) { [EOL]     this(null, types); [EOL] } <line_num>: 53,55
private DiagnosticGroup(DiagnosticType type) { [EOL]     this.name = null; [EOL]     this.types = ImmutableSet.of(type); [EOL] } <line_num>: 60,63
public DiagnosticGroup(DiagnosticGroup... groups) { [EOL]     this(null, groups); [EOL] } <line_num>: 80,82
public DiagnosticGroup(String name, DiagnosticGroup... groups) { [EOL]     Set<DiagnosticType> set = Sets.newHashSet(); [EOL]     for (DiagnosticGroup group : groups) { [EOL]         set.addAll(group.types); [EOL]     } [EOL]     this.name = name; [EOL]     this.types = ImmutableSet.copyOf(set); [EOL] } <line_num>: 87,96
public static DiagnosticGroup forType(DiagnosticType type) { [EOL]     if (!singletons.containsKey(type)) { [EOL]         singletons.put(type, new DiagnosticGroup(type)); [EOL]     } [EOL]     return singletons.get(type); [EOL] } <line_num>: 70,75
public boolean matches(JSError error) { [EOL]     return matches(error.getType()); [EOL] } <line_num>: 102,104
public boolean matches(DiagnosticType type) { [EOL]     return types.contains(type); [EOL] } <line_num>: 109,111
boolean isSubGroup(DiagnosticGroup group) { [EOL]     for (DiagnosticType type : group.types) { [EOL]         if (!matches(type)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 116,123
public Iterable<DiagnosticType> getTypes() { [EOL]     return types; [EOL] } <line_num>: 128,130
@Override [EOL] public String toString() { [EOL]     return name == null ? super.toString() : "DiagnosticGroup<" + name + ">"; [EOL] } <line_num>: 132,135
