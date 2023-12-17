private void testSuccess(JsonML source) throws Exception
private void testError(JsonML source) throws Exception
private void testString(String jsonml) throws Exception
private void testInvalidString(String jsonml) throws Exception
public void testCompilerInterface() throws Exception
String SIMPLE_SOURCE=Optional["['Program',{}," + "['VarDecl',{}," + "['InitPatt',{}," + "['IdPatt',{'name':'x'}]," + "['LiteralExpr',{'type':'number','value':1}]]]," + "['VarDecl',{}," + "['InitPatt',{}," + "['IdPatt',{'name':'t'}]," + "['IdExpr',{'name':'x'}]]]]"]
String SYNTAX_ERROR=Optional["['Program',{}," + "['VarDecl',{}," + "['InitPatt',{}," + "['IdPatt',{'name':'x'}]," + "['LiteralExpr',{'type':'number','value':1}]]]," + "['VarDecl',{}," + "['IdPatt',{'name':'t'}]," + "['IdExpr',{'name':'x'}]]]]"]
