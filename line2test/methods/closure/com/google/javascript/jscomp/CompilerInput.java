public CompilerInput(SourceAst ast) { [EOL]     this(ast, ast.getSourceFile().getName(), false); [EOL] } <line_num>: 60,62
public CompilerInput(SourceAst ast, boolean isExtern) { [EOL]     this(ast, ast.getInputId(), isExtern); [EOL] } <line_num>: 64,66
public CompilerInput(SourceAst ast, String inputId, boolean isExtern) { [EOL]     this(ast, new InputId(inputId), isExtern); [EOL] } <line_num>: 68,70
public CompilerInput(SourceAst ast, InputId inputId, boolean isExtern) { [EOL]     this.ast = ast; [EOL]     this.id = inputId; [EOL]     if (ast != null && ast.getSourceFile() != null) { [EOL]         ast.getSourceFile().setIsExtern(isExtern); [EOL]     } [EOL] } <line_num>: 72,81
public CompilerInput(SourceFile file) { [EOL]     this(file, false); [EOL] } <line_num>: 83,85
public CompilerInput(SourceFile file, boolean isExtern) { [EOL]     this(new JsAst(file), isExtern); [EOL] } <line_num>: 87,89
@Override [EOL] public InputId getInputId() { [EOL]     return id; [EOL] } <line_num>: 92,95
@Override [EOL] public String getName() { [EOL]     return id.getIdName(); [EOL] } <line_num>: 98,101
public SourceAst getAst() { [EOL]     return ast; [EOL] } <line_num>: 103,105
@Override [EOL] public String getPathRelativeToClosureBase() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 108,112
@Override [EOL] public Node getAstRoot(AbstractCompiler compiler) { [EOL]     Node root = ast.getAstRoot(compiler); [EOL]     if (root != null) { [EOL]         Preconditions.checkState(root.isScript()); [EOL]         Preconditions.checkNotNull(root.getInputId()); [EOL]     } [EOL]     return root; [EOL] } <line_num>: 114,123
@Override [EOL] public void clearAst() { [EOL]     ast.clearAst(); [EOL] } <line_num>: 125,128
@Override [EOL] public SourceFile getSourceFile() { [EOL]     return ast.getSourceFile(); [EOL] } <line_num>: 130,133
@Override [EOL] public void setSourceFile(SourceFile file) { [EOL]     ast.setSourceFile(file); [EOL] } <line_num>: 135,138
public SourceAst getSourceAst() { [EOL]     return ast; [EOL] } <line_num>: 141,143
public void setCompiler(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL] } <line_num>: 146,148
private void checkErrorManager() { [EOL]     Preconditions.checkNotNull(compiler, "Expected setCompiler to be called first: " + this); [EOL]     Preconditions.checkNotNull(compiler.getErrorManager(), "Expected compiler to call an error manager: " + this); [EOL] } <line_num>: 150,155
@Override [EOL] public Collection<String> getRequires() { [EOL]     checkErrorManager(); [EOL]     try { [EOL]         regenerateDependencyInfoIfNecessary(); [EOL]         return Collections.<String>unmodifiableSet(requires); [EOL]     } catch (IOException e) { [EOL]         compiler.getErrorManager().report(CheckLevel.ERROR, JSError.make(AbstractCompiler.READ_ERROR, getName())); [EOL]         return ImmutableList.<String>of(); [EOL]     } [EOL] } <line_num>: 158,169
@Override [EOL] public Collection<String> getProvides() { [EOL]     checkErrorManager(); [EOL]     try { [EOL]         regenerateDependencyInfoIfNecessary(); [EOL]         return Collections.<String>unmodifiableSet(provides); [EOL]     } catch (IOException e) { [EOL]         compiler.getErrorManager().report(CheckLevel.ERROR, JSError.make(AbstractCompiler.READ_ERROR, getName())); [EOL]         return ImmutableList.<String>of(); [EOL]     } [EOL] } <line_num>: 172,183
void addProvide(String provide) { [EOL]     getProvides(); [EOL]     provides.add(provide); [EOL] } <line_num>: 187,190
void addRequire(String require) { [EOL]     getRequires(); [EOL]     requires.add(require); [EOL] } <line_num>: 192,195
public void removeRequire(String require) { [EOL]     getRequires(); [EOL]     requires.remove(require); [EOL] } <line_num>: 197,200
private void regenerateDependencyInfoIfNecessary() throws IOException { [EOL]     if (!(ast instanceof JsAst)) { [EOL]         Preconditions.checkNotNull(compiler, "Expected setCompiler to be called first"); [EOL]         DepsFinder finder = new DepsFinder(); [EOL]         Node root = getAstRoot(compiler); [EOL]         if (root == null) { [EOL]             return; [EOL]         } [EOL]         finder.visitTree(getAstRoot(compiler)); [EOL]         provides.addAll(finder.provides); [EOL]         requires.addAll(finder.requires); [EOL]     } else { [EOL]         if (!generatedDependencyInfoFromSource) { [EOL]             DependencyInfo info = (new JsFileParser(compiler.getErrorManager())).setIncludeGoogBase(true).parseFile(getName(), getName(), getCode()); [EOL]             provides.addAll(info.getProvides()); [EOL]             requires.addAll(info.getRequires()); [EOL]             generatedDependencyInfoFromSource = true; [EOL]         } [EOL]     } [EOL] } <line_num>: 205,250
void visitTree(Node n) { [EOL]     visitSubtree(n, null); [EOL] } <line_num>: 258,260
void visitSubtree(Node n, Node parent) { [EOL]     if (n.isCall()) { [EOL]         String require = codingConvention.extractClassNameIfRequire(n, parent); [EOL]         if (require != null) { [EOL]             requires.add(require); [EOL]         } [EOL]         String provide = codingConvention.extractClassNameIfProvide(n, parent); [EOL]         if (provide != null) { [EOL]             provides.add(provide); [EOL]         } [EOL]         return; [EOL]     } else if (parent != null && !parent.isExprResult() && !parent.isScript()) { [EOL]         return; [EOL]     } [EOL]     for (Node child = n.getFirstChild(); child != null; child = child.getNext()) { [EOL]         visitSubtree(child, n); [EOL]     } [EOL] } <line_num>: 262,286
public String getLine(int lineNumber) { [EOL]     return getSourceFile().getLine(lineNumber); [EOL] } <line_num>: 297,299
public Region getRegion(int lineNumber) { [EOL]     return getSourceFile().getRegion(lineNumber); [EOL] } <line_num>: 310,312
public String getCode() throws IOException { [EOL]     return getSourceFile().getCode(); [EOL] } <line_num>: 314,316
public JSModule getModule() { [EOL]     return module; [EOL] } <line_num>: 319,321
public void setModule(JSModule module) { [EOL]     Preconditions.checkArgument(module == null || this.module == null || this.module == module); [EOL]     this.module = module; [EOL] } <line_num>: 324,329
void overrideModule(JSModule module) { [EOL]     this.module = module; [EOL] } <line_num>: 332,334
public boolean isExtern() { [EOL]     if (ast == null || ast.getSourceFile() == null) { [EOL]         return false; [EOL]     } [EOL]     return ast.getSourceFile().isExtern(); [EOL] } <line_num>: 336,341
void setIsExtern(boolean isExtern) { [EOL]     if (ast == null || ast.getSourceFile() == null) { [EOL]         return; [EOL]     } [EOL]     ast.getSourceFile().setIsExtern(isExtern); [EOL] } <line_num>: 343,348
public int getLineOffset(int lineno) { [EOL]     return ast.getSourceFile().getLineOffset(lineno); [EOL] } <line_num>: 350,352
public int getNumLines() { [EOL]     return ast.getSourceFile().getNumLines(); [EOL] } <line_num>: 355,357
@Override [EOL] public String toString() { [EOL]     return getName(); [EOL] } <line_num>: 359,362
