 CrossModuleMethodMotion(AbstractCompiler compiler, IdGenerator idGenerator, boolean canModifyExterns)
public void process(Node externRoot, Node root)
private void moveMethods(Collection<NameInfo> allNameInfo)
 boolean hasGeneratedAnyIds()
 int newId()
DiagnosticType NULL_COMMON_MODULE_ERROR=Optional[DiagnosticType.error("JSC_INTERNAL_ERROR_MODULE_DEPEND", "null deepest common module")]
AbstractCompiler compiler
IdGenerator idGenerator
AnalyzePrototypeProperties analyzer
JSModuleGraph moduleGraph
String STUB_METHOD_NAME=Optional["JSCompiler_stubMethod"]
String UNSTUB_METHOD_NAME=Optional["JSCompiler_unstubMethod"]
String STUB_DECLARATIONS=Optional["var JSCompiler_stubMap = [];" + "function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {" + "  return function() {" + "    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(" + "        this, arguments);" + "  };" + "}" + "function JSCompiler_unstubMethod(" + "    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {" + "  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] = " + "      JSCompiler_unstubMethod_body;" + "}"]
