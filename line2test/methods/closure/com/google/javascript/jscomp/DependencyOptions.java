public DependencyOptions setDependencySorting(boolean enabled) { [EOL]     this.sortDependencies = enabled; [EOL]     return this; [EOL] } <line_num>: 55,58
public DependencyOptions setDependencyPruning(boolean enabled) { [EOL]     this.pruneDependencies = enabled; [EOL]     return this; [EOL] } <line_num>: 72,75
public DependencyOptions setMoocherDropping(boolean enabled) { [EOL]     this.dropMoochers = enabled; [EOL]     return this; [EOL] } <line_num>: 95,98
public DependencyOptions setEntryPoints(Collection<String> symbols) { [EOL]     entryPoints.clear(); [EOL]     entryPoints.addAll(symbols); [EOL]     return this; [EOL] } <line_num>: 112,116
boolean needsManagement() { [EOL]     return sortDependencies || pruneDependencies; [EOL] } <line_num>: 119,121
boolean shouldSortDependencies() { [EOL]     return sortDependencies; [EOL] } <line_num>: 123,125
boolean shouldPruneDependencies() { [EOL]     return pruneDependencies; [EOL] } <line_num>: 127,129
boolean shouldDropMoochers() { [EOL]     return pruneDependencies && dropMoochers; [EOL] } <line_num>: 131,133
Collection<String> getEntryPoints() { [EOL]     return entryPoints; [EOL] } <line_num>: 135,137
