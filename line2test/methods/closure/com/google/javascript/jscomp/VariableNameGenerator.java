VariableNameGenerator(Scope scope) { [EOL]     this.scope = scope; [EOL]     Set<String> usedNames = Sets.newHashSet(); [EOL]     names = new NameGenerator(usedNames, "", null); [EOL] } <line_num>: 32,36
String getNextNewName() { [EOL]     String name = null; [EOL]     while (scope.isDeclared(name = names.generateNextName(), true)) { [EOL]     } [EOL]     return name; [EOL] } <line_num>: 38,42
