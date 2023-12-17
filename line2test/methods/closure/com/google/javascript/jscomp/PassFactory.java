protected PassFactory(String name, boolean isOneTimePass) { [EOL]     this.name = name; [EOL]     this.isOneTimePass = isOneTimePass; [EOL] } <line_num>: 37,40
String getName() { [EOL]     return name; [EOL] } <line_num>: 45,47
boolean isOneTimePass() { [EOL]     return isOneTimePass; [EOL] } <line_num>: 52,54
abstract CompilerPass create(AbstractCompiler compiler); <line_num>: 59,59
HotSwapCompilerPass getHotSwapPass(AbstractCompiler compiler) { [EOL]     return null; [EOL] } <line_num>: 67,72
