public SecureCompiler()
private Report(JsonMLError[] errors, JsonMLError[] warnings)
public JsonML getJsonML()
public String getString()
public Report getReport()
public void compile(JsonML source)
private CompilerOptions getSecureCompilerOptions()
public void enableFoldConstant()
 Report generateReport(Result result)
public boolean isSuccessful()
public JsonMLError[] getErrors()
public JsonMLError[] getWarnings()
String COMPILATION_UNCOMPLETED_MSG=Optional["No compilation has been completed yet."]
String COMPILATION_UNSUCCESSFUL_MSG=Optional["The last compilation was not successful."]
String COMPILATION_ALREADY_COMPLETED_MSG=Optional["This instance has already compiled one source."]
Compiler compiler
CompilerOptions options
JsonMLAst sourceAst
Report report
