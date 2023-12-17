public ReplaceIdGenerators(AbstractCompiler compiler, Set<String> idGens, boolean generatePseudoNames, String previousMapSerialized)
public ObfuscatedNameSuppier(RenameStrategy renameStrategy, BiMap<String, String> previousMappings)
public PseudoNameSuppier(RenameStrategy renameStrategy)
 String getName(String id, String name)
 RenameStrategy getRenameStrategy()
public String getName(String id, String name)
public RenameStrategy getRenameStrategy()
public String getName(String id, String name)
public RenameStrategy getRenameStrategy()
public String getName(String id, String name)
public RenameStrategy getRenameStrategy()
private NameSupplier createNameSupplier(RenameStrategy renameStrategy, BiMap<String, String> previousMappings)
public void visit(NodeTraversal t, Node n, Node parent)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
public String getSerializedIdMappings()
private Map<String, BiMap<String, String>> parsePreviousResults(String serializedMap)
private void reportInvalidLine(String line, int lineIndex)
 String getIdForGeneratorNode(boolean consistent, Node n)
DiagnosticType NON_GLOBAL_ID_GENERATOR_CALL=Optional[DiagnosticType.error("JSC_NON_GLOBAL_ID_GENERATOR_CALL", "Id generator call must be in the global scope")]
DiagnosticType CONDITIONAL_ID_GENERATOR_CALL=Optional[DiagnosticType.error("JSC_CONDITIONAL_ID_GENERATOR_CALL", "Id generator call must be unconditional")]
DiagnosticType CONFLICTING_GENERATOR_TYPE=Optional[DiagnosticType.error("JSC_CONFLICTING_ID_GENERATOR_TYPE", "Id generator can only be one of consistent, inconsistent, or stable.")]
DiagnosticType INVALID_GENERATOR_ID_MAPPING=Optional[DiagnosticType.error("JSC_INVALID_GENERATOR_ID_MAPPING", "Invalid generator id mapping. {0}")]
AbstractCompiler compiler
Map<String, NameSupplier> nameGenerators
Map<String, Map<String, String>> consistNameMap
Map<String, Map<String, String>> idGeneratorMaps
Map<String, BiMap<String, String>> previousMap
boolean generatePseudoNames
