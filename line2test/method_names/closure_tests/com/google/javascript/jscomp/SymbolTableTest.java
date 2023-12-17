public void setUp() throws Exception
public void testGlobalVar() throws Exception
public void testGlobalThisReferences() throws Exception
public void testGlobalThisReferences2() throws Exception
public void testGlobalThisReferences3() throws Exception
public void testGlobalThisPropertyReferences() throws Exception
public void testGlobalVarReferences() throws Exception
public void testLocalVarReferences() throws Exception
public void testLocalThisReferences() throws Exception
public void testLocalThisReferences2() throws Exception
public void testLocalThisReferences3() throws Exception
public void testNamespacedReferences() throws Exception
public void testIncompleteNamespacedReferences() throws Exception
public void testGlobalRichObjectReference() throws Exception
public void testRemovalOfNamespacedReferencesOfProperties() throws Exception
public void testGoogScopeReferences() throws Exception
public void testGoogRequireReferences() throws Exception
public void testGoogRequireReferences2() throws Exception
public void testGlobalVarInExterns() throws Exception
public void testLocalVarInExterns() throws Exception
public void testSymbolsForType() throws Exception
public void testStaticMethodReferences() throws Exception
public void testMethodReferences() throws Exception
public void testSuperClassMethodReferences() throws Exception
public void testMethodReferencesMissingTypeInfo() throws Exception
public void testFieldReferencesMissingTypeInfo() throws Exception
public void testFieldReferences() throws Exception
public void testUndeclaredFieldReferences() throws Exception
public void testPrototypeReferences() throws Exception
public void testPrototypeReferences2() throws Exception
public void testPrototypeReferences3() throws Exception
public void testPrototypeReferences4() throws Exception
public void testPrototypeReferences5() throws Exception
public void testReferencesInJSDocType()
public void testReferencesInJSDocType2()
public void testReferencesInJSDocName()
public void testLocalQualifiedNamesInLocalScopes()
public void testNaturalSymbolOrdering()
public void testDeclarationDisagreement()
public void testMultipleExtends()
public void testJSDocAssociationWithBadNamespace()
public void testMissingConstructorTag()
public void testTypeCheckingOff()
public void testSuperClassReference() throws Exception
public void testInnerEnum() throws Exception
public void testMethodInAnonObject1() throws Exception
public void testMethodInAnonObject2() throws Exception
public void testJSDocOnlySymbol() throws Exception
public void testNamespaceDefinitionOrder() throws Exception
public void testConstructorAlias() throws Exception
public void testSymbolForScopeOfNatives() throws Exception
private void assertSymmetricOrdering(Ordering<Symbol> ordering, Symbol first, Symbol second)
private Symbol getGlobalVar(SymbolTable table, String name)
private Symbol getDocVar(SymbolTable table, String name)
private Symbol getLocalVar(SymbolTable table, String name)
private List<Symbol> getVars(SymbolTable table)
private SymbolTable createSymbolTable(String input)
private SymbolTable assertSymbolTableValid(SymbolTable table)
