SyntheticAst(String sourceName) { [EOL]     this.inputId = new InputId(sourceName); [EOL]     this.sourceFile = new SourceFile(sourceName); [EOL]     clearAst(); [EOL] } <line_num>: 37,41
@Override [EOL] public Node getAstRoot(AbstractCompiler compiler) { [EOL]     return root; [EOL] } <line_num>: 43,46
@Override [EOL] public void clearAst() { [EOL]     root = IR.script(); [EOL]     root.setInputId(inputId); [EOL]     root.setStaticSourceFile(sourceFile); [EOL] } <line_num>: 48,53
@Override [EOL] public InputId getInputId() { [EOL]     return inputId; [EOL] } <line_num>: 55,58
@Override [EOL] public SourceFile getSourceFile() { [EOL]     return sourceFile; [EOL] } <line_num>: 60,63
@Override [EOL] public void setSourceFile(SourceFile file) { [EOL]     throw new IllegalStateException("Cannot set a source file for a synthetic AST"); [EOL] } <line_num>: 65,69
