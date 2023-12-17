ErrorPass(AbstractCompiler compiler, DiagnosticType error) { [EOL]     this(compiler, JSError.make(error)); [EOL] } <line_num>: 30,32
ErrorPass(AbstractCompiler compiler, JSError error) { [EOL]     this.compiler = compiler; [EOL]     this.error = error; [EOL] } <line_num>: 34,37
@Override [EOL] public void process(Node externs, Node root) { [EOL]     compiler.report(error); [EOL] } <line_num>: 39,42
