protected void setUp() throws Exception
public void testUpdateGlobalVarReferences_ResetReferences()
public void testUpdateGlobalVarReferences_UpdateScriptNoRef()
public void testUpdateGlobalVarReferences_UpdateScriptNewRefs()
public void testUpdateGlobalVarReferences_UpdateScriptNewVar()
public void testUpdateReferencesWithGlobalScope()
CompilerInput INPUT1=Optional[new CompilerInput(SourceFile.fromCode("input1", ""), false)]
CompilerInput INPUT2=Optional[new CompilerInput(SourceFile.fromCode("input2", ""), false)]
CompilerInput INPUT3=Optional[new CompilerInput(SourceFile.fromCode("input3", ""), false)]
CompilerInput EXTERN1=Optional[new CompilerInput(SourceFile.fromCode("extern1", ""), true)]
GlobalVarReferenceMap map=Optional[new GlobalVarReferenceMap(Lists.newArrayList(INPUT1, INPUT2, INPUT3), Lists.newArrayList(EXTERN1))]
Map<Var, ReferenceCollection> globalMap=Optional[Maps.newHashMap()]
Node root=Optional[new Node(Token.BLOCK)]
Scope globalScope=Optional[Scope.createGlobalScope(root)]
Node scriptRoot=Optional[new Node(Token.SCRIPT)]
String VAR1=Optional["var1"]
String VAR2=Optional["var2"]
String VAR3=Optional["var3"]
ReferenceCollection var1Refs=Optional[new ReferenceCollection()]
ReferenceCollection var2Refs=Optional[new ReferenceCollection()]
ReferenceCollection var3Refs=Optional[new ReferenceCollection()]
Reference var1In1Ref=Optional[createRefForTest(INPUT1)]
Reference var1In2Ref=Optional[createRefForTest(INPUT2)]
Reference var1In3Ref=Optional[createRefForTest(INPUT3)]
Reference var2In1Ref=Optional[createRefForTest(INPUT1)]
Reference var2In3Ref=Optional[createRefForTest(INPUT3)]
Reference var3In2Ref=Optional[createRefForTest(INPUT2)]
Reference var3In1Ext=Optional[createRefForTest(EXTERN1)]
