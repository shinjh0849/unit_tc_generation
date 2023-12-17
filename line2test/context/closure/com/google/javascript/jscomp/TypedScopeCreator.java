 DeferredSetType(Node node, JSType type)
 TypedScopeCreator(AbstractCompiler compiler)
 TypedScopeCreator(AbstractCompiler compiler, CodingConvention codingConvention)
 DiscoverEnumsAndTypedefs(JSTypeRegistry registry)
private AbstractScopeBuilder(Scope scope)
 CollectProperties(JSType thisType)
private StubDeclaration(Node node, boolean isExtern, String ownerName)
private GlobalScopeBuilder(Scope scope)
private LocalScopeBuilder(Scope scope)
 FirstOrderFunctionAnalyzer(AbstractCompiler compiler, Map<Node, AstFunctionContents> outParam)
 void resolve(Scope scope)
public Scope createScope(Node root, Scope parent)
 void patchGlobalScope(Scope globalScope, Node scriptRoot)
 Scope createInitialScope(Node root)
private void declareNativeFunctionType(Scope scope, JSTypeNative tId)
private void declareNativeValueType(Scope scope, String name, JSTypeNative tId)
private void declareNativeType(Scope scope, String name, JSType t)
public void visit(NodeTraversal t, Node node, Node parent)
private void identifyNameNode(Node nameNode, Node valueNode, JSDocInfo info)
private JSType getNativeType(JSTypeNative nativeType)
 void setDeferredType(Node node, JSType type)
 void resolveTypes()
public final boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void attachLiteralTypes(NodeTraversal t, Node n)
private void defineObjectLiteral(Node objectLit)
 void processObjectLitProperties(Node objLit, ObjectType objLitType, boolean declareOnOwner)
private JSType getDeclaredTypeInAnnotation(String sourceName, Node node, JSDocInfo info)
 void assertDefinitionNode(Node n, int type)
 void defineCatch(Node n)
 void defineVar(Node n)
 void defineFunctionLiteral(Node n)
private void defineName(Node name, Node var, JSDocInfo info)
private boolean shouldUseFunctionLiteralType(FunctionType type, JSDocInfo info, Node lValue)
private FunctionType createFunctionTypeFromNodes(@Nullable Node rValue, @Nullable String name, @Nullable JSDocInfo info, @Nullable Node lvalueNode)
private FunctionType findOverriddenFunction(ObjectType ownerType, String propName)
private EnumType createEnumTypeFromNodes(Node rValue, String name, JSDocInfo info, Node lValueNode)
private void defineSlot(Node name, Node parent, JSType type)
 void defineSlot(Node n, Node parent, JSType type, boolean inferred)
 void defineSlot(Node n, Node parent, String variableName, JSType type, boolean inferred)
private void finishConstructorDefinition(Node n, String variableName, FunctionType fnType, Scope scopeToDeclareIn, CompilerInput input, Var newVar)
private boolean isQnameRootedInGlobalScope(Node n)
private Scope getQnameRootScope(Node n)
private JSType getDeclaredType(String sourceName, JSDocInfo info, Node lValue, @Nullable Node rValue)
private FunctionType getFunctionType(@Nullable Var v)
private void checkForCallingConventionDefiningCalls(Node n, Map<String, String> delegateCallingConventions)
private void checkForClassDefiningCalls(NodeTraversal t, Node n, Node parent)
private void applyDelegateRelationship(DelegateRelationship delegateRelationship)
 void maybeDeclareQualifiedName(NodeTraversal t, JSDocInfo info, Node n, Node parent, Node rhsValue)
private boolean isQualifiedNameInferred(String qName, Node n, JSDocInfo info, Node rhsValue, JSType valueType)
private ObjectType getObjectSlot(String slotName)
 void resolveStubDeclarations()
public void visit(NodeTraversal t, Node n, Node parent)
private void maybeCollectMember(NodeTraversal t, Node member, Node nodeWithJsDocInfo, @Nullable Node value)
public void visit(NodeTraversal t, Node n, Node parent)
 void maybeDeclareQualifiedName(NodeTraversal t, JSDocInfo info, Node n, Node parent, Node rhsValue)
private void checkForTypedef(NodeTraversal t, Node candidate, JSDocInfo info)
 void build()
public void visit(NodeTraversal t, Node n, Node parent)
private void handleFunctionInputs(Node fnNode)
private void declareArguments(Node functionNode)
public void process(Node externs, Node root)
public void enterScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
private AstFunctionContents getFunctionAnalysisResults(@Nullable Node n)
String DELEGATE_PROXY_SUFFIX=Optional[ObjectType.createDelegateSuffix("Proxy")]
DiagnosticType MALFORMED_TYPEDEF=Optional[DiagnosticType.warning("JSC_MALFORMED_TYPEDEF", "Typedef for {0} does not have any type information")]
DiagnosticType ENUM_INITIALIZER=Optional[DiagnosticType.warning("JSC_ENUM_INITIALIZER_NOT_ENUM", "enum initializer must be an object literal or an enum")]
DiagnosticType CTOR_INITIALIZER=Optional[DiagnosticType.warning("JSC_CTOR_INITIALIZER_NOT_CTOR", "Constructor {0} must be initialized at declaration")]
DiagnosticType IFACE_INITIALIZER=Optional[DiagnosticType.warning("JSC_IFACE_INITIALIZER_NOT_IFACE", "Interface {0} must be initialized at declaration")]
DiagnosticType CONSTRUCTOR_EXPECTED=Optional[DiagnosticType.warning("JSC_REFLECT_CONSTRUCTOR_EXPECTED", "Constructor expected as first argument")]
DiagnosticType UNKNOWN_LENDS=Optional[DiagnosticType.warning("JSC_UNKNOWN_LENDS", "Variable {0} not declared before @lends annotation.")]
DiagnosticType LENDS_ON_NON_OBJECT=Optional[DiagnosticType.warning("JSC_LENDS_ON_NON_OBJECT", "May only lend properties to object types. {0} has type {1}.")]
AbstractCompiler compiler
ErrorReporter typeParsingErrorReporter
TypeValidator validator
CodingConvention codingConvention
JSTypeRegistry typeRegistry
List<ObjectType> delegateProxyPrototypes=Optional[Lists.newArrayList()]
Map<String, String> delegateCallingConventions=Optional[Maps.newHashMap()]
Map<Node, AstFunctionContents> functionAnalysisResults=Optional[Maps.newHashMap()]
ObjectType unknownType
