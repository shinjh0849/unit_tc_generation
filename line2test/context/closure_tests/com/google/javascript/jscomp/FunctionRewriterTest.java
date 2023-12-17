protected void setUp()
protected FunctionRewriter getProcessor(Compiler compiler)
protected int getNumRepetitions()
public void testReplaceReturnConst1()
public void testReplaceReturnConst2()
public void testReplaceReturnConst3()
public void testReplaceGetter1()
public void testReplaceGetter2()
public void testReplaceSetter1()
public void testReplaceSetter2()
public void testReplaceSetter3()
public void testReplaceSetter4()
public void testReplaceEmptyFunction1()
public void testReplaceEmptyFunction2()
public void testReplaceEmptyFunction3()
public void testReplaceIdentityFunction1()
public void testReplaceIdentityFunction2()
public void testIssue538()
private void checkCompilesTo(String src, String expectedHdr, String expectedBody, int repetitions)
private void checkCompilesToSame(String src, int repetitions)
String RETURNARG_HELPER=Optional["function JSCompiler_returnArg(JSCompiler_returnArg_value){" + "  return function() { return JSCompiler_returnArg_value }" + "}"]
String GET_HELPER=Optional["function JSCompiler_get(JSCompiler_get_name){" + "  return function() { return this[JSCompiler_get_name] }" + "}"]
String SET_HELPER=Optional["function JSCompiler_set(JSCompiler_set_name) {" + "  return function(JSCompiler_set_value){" + "    this[JSCompiler_set_name]=JSCompiler_set_value" + "  }" + "}"]
String EMPTY_HELPER=Optional["function JSCompiler_emptyFn() {" + "  return function(){}" + "}"]
String IDENTITY_HELPER=Optional["function JSCompiler_identityFn() {" + "  return function(JSCompiler_identityFn_value) {" + "      return JSCompiler_identityFn_value" + "  }" + "}"]
