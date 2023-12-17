OptimizeCalls(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL] } <line_num>: 38,40
OptimizeCalls addPass(CallGraphCompilerPass pass) { [EOL]     passes.add(pass); [EOL]     return this; [EOL] } <line_num>: 42,45
void process(Node externs, Node root, SimpleDefinitionFinder definitions); <line_num>: 48,48
@Override [EOL] public void process(Node externs, Node root) { [EOL]     if (passes.size() > 0) { [EOL]         SimpleDefinitionFinder defFinder = new SimpleDefinitionFinder(compiler); [EOL]         defFinder.process(externs, root); [EOL]         for (CallGraphCompilerPass pass : passes) { [EOL]             pass.process(externs, root, defFinder); [EOL]         } [EOL]     } [EOL] } <line_num>: 51,60
