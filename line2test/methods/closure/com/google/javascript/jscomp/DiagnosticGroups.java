public DiagnosticGroups() { [EOL] } <line_num>: 33,33
static DiagnosticGroup registerDeprecatedGroup(String name) { [EOL]     return registerGroup(name, new DiagnosticGroup(name, UNUSED)); [EOL] } <line_num>: 38,40
static DiagnosticGroup registerGroup(String name, DiagnosticGroup group) { [EOL]     groupsByName.put(name, group); [EOL]     return group; [EOL] } <line_num>: 42,46
static DiagnosticGroup registerGroup(String name, DiagnosticType... types) { [EOL]     DiagnosticGroup group = new DiagnosticGroup(name, types); [EOL]     groupsByName.put(name, group); [EOL]     return group; [EOL] } <line_num>: 48,53
static DiagnosticGroup registerGroup(String name, DiagnosticGroup... groups) { [EOL]     DiagnosticGroup group = new DiagnosticGroup(name, groups); [EOL]     groupsByName.put(name, group); [EOL]     return group; [EOL] } <line_num>: 55,60
protected Map<String, DiagnosticGroup> getRegisteredGroups() { [EOL]     return ImmutableMap.copyOf(groupsByName); [EOL] } <line_num>: 63,65
public DiagnosticGroup forName(String name) { [EOL]     return groupsByName.get(name); [EOL] } <line_num>: 68,70
void setWarningLevel(CompilerOptions options, String name, CheckLevel level) { [EOL]     DiagnosticGroup group = forName(name); [EOL]     Preconditions.checkNotNull(group, "No warning class for name: %s", name); [EOL]     options.setWarningLevel(group, level); [EOL] } <line_num>: 250,255
