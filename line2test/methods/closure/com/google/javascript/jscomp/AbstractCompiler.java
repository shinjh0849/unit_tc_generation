public abstract CompilerInput getInput(InputId inputId); <line_num>: 57,57
abstract SourceFile getSourceFileByName(String sourceName); <line_num>: 62,62
abstract CompilerInput newExternInput(String name); <line_num>: 70,70
abstract JSModuleGraph getModuleGraph(); <line_num>: 76,76
abstract List<CompilerInput> getInputsInOrder(); <line_num>: 82,82
public abstract JSTypeRegistry getTypeRegistry(); <line_num>: 87,87
abstract ScopeCreator getTypedScopeCreator(); <line_num>: 92,92
public abstract Scope getTopScope(); <line_num>: 97,97
public abstract void report(JSError error); <line_num>: 102,102
abstract void throwInternalError(String msg, Exception cause); <line_num>: 107,107
public abstract CodingConvention getCodingConvention(); <line_num>: 112,112
public abstract void reportCodeChange(); <line_num>: 117,117
abstract void addToDebugLog(String message); <line_num>: 122,122
abstract void setCssRenamingMap(CssRenamingMap map); <line_num>: 127,127
abstract CssRenamingMap getCssRenamingMap(); <line_num>: 132,132
abstract Node getNodeForCodeInsertion(JSModule module); <line_num>: 145,145
abstract TypeValidator getTypeValidator(); <line_num>: 150,150
abstract Node parseSyntheticCode(String code); <line_num>: 155,155
abstract Node parseSyntheticCode(String filename, String code); <line_num>: 160,160
abstract Node parseTestCode(String code); <line_num>: 165,165
abstract String toSource(Node root); <line_num>: 170,170
abstract ErrorReporter getDefaultErrorReporter(); <line_num>: 175,175
public abstract ReverseAbstractInterpreter getReverseAbstractInterpreter(); <line_num>: 180,180
LifeCycleStage getLifeCycleStage() { [EOL]     return stage; [EOL] } <line_num>: 185,187
abstract Supplier<String> getUniqueNameIdSupplier(); <line_num>: 192,192
abstract boolean hasHaltingErrors(); <line_num>: 198,198
abstract void addChangeHandler(CodeChangeHandler handler); <line_num>: 203,203
abstract void removeChangeHandler(CodeChangeHandler handler); <line_num>: 208,208
abstract boolean isIdeMode(); <line_num>: 213,213
abstract boolean acceptEcmaScript5(); <line_num>: 218,218
abstract boolean acceptConstKeyword(); <line_num>: 223,223
abstract Config getParserConfig(); <line_num>: 228,228
abstract boolean isTypeCheckingEnabled(); <line_num>: 233,233
abstract void prepareAst(Node root); <line_num>: 240,240
abstract public ErrorManager getErrorManager(); <line_num>: 245,245
void setLifeCycleStage(LifeCycleStage stage) { [EOL]     this.stage = stage; [EOL] } <line_num>: 250,252
abstract boolean areNodesEqualForInlining(Node n1, Node n2); <line_num>: 258,258
abstract void setHasRegExpGlobalReferences(boolean references); <line_num>: 265,265
abstract boolean hasRegExpGlobalReferences(); <line_num>: 271,271
abstract CheckLevel getErrorLevel(JSError error); <line_num>: 276,276
boolean isNormalized() { [EOL]     return this == NORMALIZED || this == NORMALIZED_OBFUSCATED; [EOL] } <line_num>: 289,291
boolean isNormalizedUnobfuscated() { [EOL]     return this == NORMALIZED; [EOL] } <line_num>: 293,295
boolean isNormalizedObfuscated() { [EOL]     return this == NORMALIZED_OBFUSCATED; [EOL] } <line_num>: 297,299
abstract void process(CompilerPass pass); <line_num>: 306,306
abstract Node getRoot(); <line_num>: 311,311
abstract void updateGlobalVarReferences(Map<Var, ReferenceCollection> refMapPatch, Node collectionRoot); <line_num>: 326,327
abstract GlobalVarReferenceMap getGlobalVarReferences(); <line_num>: 335,335
abstract CompilerInput getSynthesizedExternsInput(); <line_num>: 341,341
public abstract double getProgress(); <line_num>: 349,349
abstract String getLastPassName(); <line_num>: 354,354
abstract void setProgress(double progress, @Nullable String lastPassName); <line_num>: 362,362
abstract Node ensureLibraryInjected(String resourceName); <line_num>: 377,377
abstract void setOldParseTree(String sourceName, AstRoot astRoot); <line_num>: 384,384
abstract AstRoot getOldParseTreeByName(String sourceName); <line_num>: 391,391
