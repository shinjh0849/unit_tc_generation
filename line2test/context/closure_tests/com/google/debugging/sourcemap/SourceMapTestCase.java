public SourceMapTestCase()
 Token(String tokenName, String inputName, FilePosition position)
 void disableColumnValidation()
public void setUp()
protected void checkSourceMap(String js, String expectedMap) throws IOException
protected String getSourceMap(RunResult result) throws IOException
protected void checkSourceMap(String fileName, String js, String expectedMap) throws IOException
private Map<String, Token> findTokens(Map<String, String> inputs)
private Map<String, Token> findTokens(String src)
private Map<String, Token> findTokens(Map<String, Token> tokens, String inputName, String js)
protected abstract SourceMap.Format getSourceMapFormat()
protected abstract SourceMapConsumer getSourceMapConsumer()
protected void compileAndCheck(String js)
protected void check(String inputName, String input, String output, String sourceMapFileContent)
protected void check(Map<String, String> originalInputs, String generatedSource, String sourceMapFileContent)
protected void check(Map<String, String> originalInputs, String generatedSource, String sourceMapFileContent, SourceMapSupplier supplier)
protected RunResult compile(String js, String fileName)
protected CompilerOptions getCompilerOptions()
protected RunResult compile(String js1, String fileName1, String js2, String fileName2)
boolean validateColumns=Optional[true]
List<SourceFile> EXTERNS=Optional[ImmutableList.of(SourceFile.fromCode("externs", ""))]
DetailLevel detailLevel=Optional[SourceMap.DetailLevel.ALL]
