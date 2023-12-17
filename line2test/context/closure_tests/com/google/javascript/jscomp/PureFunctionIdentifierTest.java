public PureFunctionIdentifierTest()
 NoSideEffectCallEnumerator(Compiler compiler)
protected int getNumRepetitions()
protected void tearDown() throws Exception
public void testIssue303() throws Exception
public void testIssue303b() throws Exception
public void testAnnotationInExterns_new1() throws Exception
public void testAnnotationInExterns_new2() throws Exception
public void testAnnotationInExterns_new3() throws Exception
public void testAnnotationInExterns_new4() throws Exception
public void testAnnotationInExterns_new5() throws Exception
public void testAnnotationInExterns_new6() throws Exception
public void testAnnotationInExterns_new7() throws Exception
public void testAnnotationInExterns_new8() throws Exception
public void testAnnotationInExterns_new9() throws Exception
public void testAnnotationInExterns_new10() throws Exception
public void testAnnotationInExterns1() throws Exception
public void testAnnotationInExterns2() throws Exception
public void testAnnotationInExterns3() throws Exception
public void testAnnotationInExterns4() throws Exception
public void testAnnotationInExterns5() throws Exception
public void testNamespaceAnnotationInExterns1() throws Exception
public void testNamespaceAnnotationInExterns2() throws Exception
public void testNamespaceAnnotationInExterns3() throws Exception
public void testNamespaceAnnotationInExterns4() throws Exception
public void testNamespaceAnnotationInExterns5() throws Exception
public void testNamespaceAnnotationInExterns6() throws Exception
public void testConstructorAnnotationInExterns1() throws Exception
public void testConstructorAnnotationInExterns2() throws Exception
public void testConstructorAnnotationInExterns3() throws Exception
public void testConstructorAnnotationInExterns4() throws Exception
public void testConstructorAnnotationInExterns5() throws Exception
public void testConstructorAnnotationInExterns6() throws Exception
public void testConstructorAnnotationInExterns7() throws Exception
public void testConstructorAnnotationInExterns8() throws Exception
public void testSharedFunctionName1() throws Exception
public void testSharedFunctionName2() throws Exception
public void testAnnotationInExternStubs1() throws Exception
public void testAnnotationInExternStubs1b() throws Exception
public void testAnnotationInExternStubs2() throws Exception
public void testAnnotationInExternStubs2b() throws Exception
public void testAnnotationInExternStubs3() throws Exception
public void testAnnotationInExternStubs4() throws Exception
public void testAnnotationInExternStubs5() throws Exception
public void testNoSideEffectsSimple() throws Exception
public void testResultLocalitySimple() throws Exception
public void testExternCalls() throws Exception
public void testApply() throws Exception
public void testCall() throws Exception
public void testInference1() throws Exception
public void testInference2() throws Exception
public void testInference3() throws Exception
public void testInference4() throws Exception
public void testInference5() throws Exception
public void testInference6() throws Exception
public void testLocalizedSideEffects1() throws Exception
public void testLocalizedSideEffects2() throws Exception
public void testLocalizedSideEffects3() throws Exception
public void testLocalizedSideEffects4() throws Exception
public void testLocalizedSideEffects5() throws Exception
public void testLocalizedSideEffects6() throws Exception
public void testLocalizedSideEffects7() throws Exception
public void testLocalizedSideEffects8() throws Exception
public void testLocalizedSideEffects9() throws Exception
public void testLocalizedSideEffects10() throws Exception
public void testLocalizedSideEffects11() throws Exception
public void testUnaryOperators1() throws Exception
public void testUnaryOperators2() throws Exception
public void testUnaryOperators3() throws Exception
public void testUnaryOperators4() throws Exception
public void testUnaryOperators5() throws Exception
public void testDeleteOperator1() throws Exception
public void testDeleteOperator2() throws Exception
public void testOrOperator1() throws Exception
public void testOrOperator2() throws Exception
public void testOrOperator3() throws Exception
public void testOrOperators4() throws Exception
public void testAndOperator1() throws Exception
public void testAndOperator2() throws Exception
public void testAndOperator3() throws Exception
public void testAndOperators4() throws Exception
public void testHookOperator1() throws Exception
public void testHookOperator2() throws Exception
public void testHookOperator3() throws Exception
public void testHookOperators4() throws Exception
public void testThrow1() throws Exception
public void testThrow2() throws Exception
public void testAssignmentOverride() throws Exception
public void testInheritance1() throws Exception
public void testInheritance2() throws Exception
public void testCallBeforeDefinition() throws Exception
public void testConstructorThatModifiesThis1() throws Exception
public void testConstructorThatModifiesThis2() throws Exception
public void testConstructorThatModifiesThis3() throws Exception
public void testConstructorThatModifiesThis4() throws Exception
public void testConstructorThatModifiesGlobal1() throws Exception
public void testConstructorThatModifiesGlobal2() throws Exception
public void testCallFunctionThatModifiesThis() throws Exception
public void testCallFunctionFOrG() throws Exception
public void testCallFunctionFOrGViaHook() throws Exception
public void testCallFunctionForGorH() throws Exception
public void testCallFunctionFOrGWithSideEffects() throws Exception
public void testCallFunctionFOrGViaHookWithSideEffects() throws Exception
public void testCallRegExpWithSideEffects() throws Exception
public void testAnonymousFunction1() throws Exception
public void testAnonymousFunction2() throws Exception
public void testAnonymousFunction3() throws Exception
public void testAnonymousFunction4() throws Exception
public void testInvalidAnnotation1() throws Exception
public void testInvalidAnnotation2() throws Exception
public void testInvalidAnnotation3() throws Exception
public void testInvalidAnnotation4() throws Exception
public void testInvalidAnnotation5() throws Exception
 void checkMarkedCalls(String source, List<String> expected)
 void checkLocalityOfMarkedCalls(String source, List<String> expected)
protected CompilerPass getProcessor(Compiler compiler)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private String generateNameString(Node node)
List<String> noSideEffectCalls=Optional[Lists.newArrayList()]
List<String> localResultCalls=Optional[Lists.newArrayList()]
boolean regExpHaveSideEffects=Optional[true]
String kExterns=Optional[CompilerTypeTestCase.DEFAULT_EXTERNS + "var window; window.setTimeout;" + "/**@nosideeffects*/ function externSENone(){}\n" + "/**@modifies{this}*/ function externSEThis(){}\n" + "/**@constructor\n" + " * @modifies{this}*/\n" + "function externObjSEThis(){}\n" + "/**\n" + " * @param {string} s id.\n" + " * @return {string}\n" + " * @modifies{this}\n" + " */\n" + "externObjSEThis.prototype.externObjSEThisMethod = function(s) {};" + "/**\n" + " * @param {string} s id.\n" + " * @return {string}\n" + " * @modifies{arguments}\n" + " */\n" + "externObjSEThis.prototype.externObjSEThisMethod2 = function(s) {};" + "/**@nosideeffects*/function Error(){}" + "function externSef1(){}" + "/**@nosideeffects*/function externNsef1(){}" + "var externSef2 = function(){};" + "/**@nosideeffects*/var externNsef2 = function(){};" + "var externNsef3 = /**@nosideeffects*/function(){};" + "var externObj;" + "externObj.sef1 = function(){};" + "/**@nosideeffects*/externObj.nsef1 = function(){};" + "externObj.nsef2 = /**@nosideeffects*/function(){};" + "externObj.partialFn;" + "externObj.partialSharedFn;" + "var externObj2;" + "externObj2.partialSharedFn = /**@nosideeffects*/function(){};" + "/**@constructor*/function externSefConstructor(){}" + "externSefConstructor.prototype.sefFnOfSefObj = function(){};" + "externSefConstructor.prototype.nsefFnOfSefObj = " + "  /**@nosideeffects*/function(){};" + "externSefConstructor.prototype.externShared = function(){};" + "/**@constructor\n@nosideeffects*/function externNsefConstructor(){}" + "externNsefConstructor.prototype.sefFnOfNsefObj = function(){};" + "externNsefConstructor.prototype.nsefFnOfNsefObj = " + "  /**@nosideeffects*/function(){};" + "externNsefConstructor.prototype.externShared = " + "  /**@nosideeffects*/function(){};" + "/**@constructor\n@nosideeffects*/function externNsefConstructor2(){}" + "externNsefConstructor2.prototype.externShared = " + "  /**@nosideeffects*/function(){};" + "externNsefConstructor.prototype.sharedPartialSef;" + "/**@nosideeffects*/externNsefConstructor.prototype.sharedPartialNsef;" + // An externs definition with a stub before.
"/**@constructor*/function externObj3(){}" + "externObj3.prototype.propWithStubBefore;" + "/**\n" + " * @param {string} s id.\n" + " * @return {string}\n" + " * @nosideeffects\n" + " */\n" + "externObj3.prototype.propWithStubBefore = function(s) {};" + // useless JsDoc
"/**\n" + " * @see {foo}\n" + " */\n" + "externObj3.prototype.propWithStubBeforeWithJSDoc;" + "/**\n" + " * @param {string} s id.\n" + " * @return {string}\n" + " * @nosideeffects\n" + " */\n" + "externObj3.prototype.propWithStubBeforeWithJSDoc = function(s) {};" + // An externs definition with a stub after.
"/**@constructor*/function externObj4(){}" + "/**\n" + " * @param {string} s id.\n" + " * @return {string}\n" + " * @nosideeffects\n" + " */\n" + "externObj4.prototype.propWithStubAfter = function(s) {};" + "externObj4.prototype.propWithStubAfter;" + "/**\n" + " * @param {string} s id.\n" + " * @return {string}\n" + " * @nosideeffects\n" + " */\n" + "externObj4.prototype.propWithStubAfterWithJSDoc = function(s) {};" + // useless JsDoc
"/**\n" + " * @see {foo}\n" + " */\n" + "externObj4.prototype.propWithStubAfterWithJSDoc;"]
