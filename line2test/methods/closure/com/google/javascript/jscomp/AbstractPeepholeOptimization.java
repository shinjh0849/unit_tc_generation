abstract Node optimizeSubtree(Node subtree); <line_num>: 42,42
protected void report(DiagnosticType diagnostic, Node n) { [EOL]     JSError error = JSError.make(NodeUtil.getSourceName(n), n, diagnostic, n.toString()); [EOL]     compiler.report(error); [EOL] } <line_num>: 51,55
protected void reportCodeChange() { [EOL]     Preconditions.checkNotNull(compiler); [EOL]     compiler.reportCodeChange(); [EOL] } <line_num>: 61,64
protected boolean areNodesEqualForInlining(Node n1, Node n2) { [EOL]     Preconditions.checkNotNull(compiler); [EOL]     return compiler.areNodesEqualForInlining(n1, n2); [EOL] } <line_num>: 70,76
protected boolean isASTNormalized() { [EOL]     Preconditions.checkNotNull(compiler); [EOL]     return compiler.getLifeCycleStage().isNormalized(); [EOL] } <line_num>: 82,86
void beginTraversal(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL] } <line_num>: 91,93
void endTraversal(AbstractCompiler compiler) { [EOL]     this.compiler = null; [EOL] } <line_num>: 98,100
boolean mayEffectMutableState(Node n) { [EOL]     return NodeUtil.mayEffectMutableState(n, compiler); [EOL] } <line_num>: 109,111
boolean mayHaveSideEffects(Node n) { [EOL]     return NodeUtil.mayHaveSideEffects(n, compiler); [EOL] } <line_num>: 116,118
boolean nodeTypeMayHaveSideEffects(Node n) { [EOL]     return NodeUtil.nodeTypeMayHaveSideEffects(n, compiler); [EOL] } <line_num>: 127,129
boolean isEcmaScript5OrGreater() { [EOL]     return compiler != null && compiler.acceptEcmaScript5(); [EOL] } <line_num>: 136,139
CodingConvention getCodingConvention() { [EOL]     return compiler.getCodingConvention(); [EOL] } <line_num>: 144,147
@VisibleForTesting [EOL] static Node validateResult(Node n) { [EOL]     done: { [EOL]         if (n != null && !n.isScript() && (!n.isBlock() || !n.isSyntheticBlock())) { [EOL]             for (Node parent : n.getAncestors()) { [EOL]                 if (parent.isScript()) { [EOL]                     break done; [EOL]                 } [EOL]             } [EOL]             Preconditions.checkState(false); [EOL]         } [EOL]     } [EOL]     return n; [EOL] } <line_num>: 152,166
