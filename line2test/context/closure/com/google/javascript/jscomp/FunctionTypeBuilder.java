 FunctionTypeBuilder(String fnName, AbstractCompiler compiler, Node errorRoot, String sourceName, Scope scope)
 AstFunctionContents(Node n)
public boolean apply(JSType type)
public boolean apply(JSType type)
 FunctionTypeBuilder setContents(@Nullable FunctionContents contents)
 FunctionTypeBuilder inferFromOverriddenFunction(@Nullable FunctionType oldType, @Nullable Node paramsParent)
 FunctionTypeBuilder inferReturnType(@Nullable JSDocInfo info)
 FunctionTypeBuilder inferInheritance(@Nullable JSDocInfo info)
 FunctionTypeBuilder inferThisType(JSDocInfo info, JSType type)
 FunctionTypeBuilder inferThisType(JSDocInfo info)
 FunctionTypeBuilder inferParameterTypes(JSDocInfo info)
 FunctionTypeBuilder inferParameterTypes(@Nullable Node argsParent, @Nullable JSDocInfo info)
private boolean isOptionalParameter(Node param, @Nullable JSDocInfo info)
private boolean isVarArgsParameter(Node param, @Nullable JSDocInfo info)
 FunctionTypeBuilder inferTemplateTypeName(@Nullable JSDocInfo info)
private boolean addParameter(FunctionParamBuilder builder, JSType paramType, boolean warnedAboutArgList, boolean isOptional, boolean isVarArgs)
 FunctionType buildAndRegister()
private void maybeSetBaseType(FunctionType fnType)
private FunctionType getOrCreateConstructor()
private void reportWarning(DiagnosticType warning, String... args)
private void reportError(DiagnosticType error, String... args)
 static boolean isFunctionTypeDeclaration(JSDocInfo info)
private Scope getScopeDeclaredIn()
private static boolean hasMoreTagsToResolve(ObjectType objectType)
 Node getSourceNode()
 boolean mayBeFromExterns()
 boolean mayHaveNonEmptyReturns()
 boolean mayHaveSingleThrow()
 Iterable<String> getEscapedVarNames()
 Set<String> getEscapedQualifiedNames()
 Multiset<String> getAssignedNameCounts()
 static FunctionContents get()
public Node getSourceNode()
public boolean mayBeFromExterns()
public boolean mayHaveNonEmptyReturns()
public boolean mayHaveSingleThrow()
public Iterable<String> getEscapedVarNames()
public Set<String> getEscapedQualifiedNames()
public Multiset<String> getAssignedNameCounts()
public Node getSourceNode()
public boolean mayBeFromExterns()
public boolean mayHaveNonEmptyReturns()
 void recordNonEmptyReturn()
public boolean mayHaveSingleThrow()
public Iterable<String> getEscapedVarNames()
 void recordEscapedVarName(String name)
public Set<String> getEscapedQualifiedNames()
 void recordEscapedQualifiedName(String name)
public Multiset<String> getAssignedNameCounts()
 void recordAssignedName(String name)
String fnName
AbstractCompiler compiler
CodingConvention codingConvention
JSTypeRegistry typeRegistry
Node errorRoot
String sourceName
Scope scope
FunctionContents contents=Optional[UnknownFunctionContents.get()]
JSType returnType=Optional[null]
boolean returnTypeInferred=Optional[false]
List<ObjectType> implementedInterfaces=Optional[null]
List<ObjectType> extendedInterfaces=Optional[null]
ObjectType baseType=Optional[null]
JSType thisType=Optional[null]
boolean isConstructor=Optional[false]
boolean makesStructs=Optional[false]
boolean makesDicts=Optional[false]
boolean isInterface=Optional[false]
Node parametersNode=Optional[null]
ImmutableList<String> templateTypeNames=Optional[ImmutableList.of()]
DiagnosticType EXTENDS_WITHOUT_TYPEDEF=Optional[DiagnosticType.warning("JSC_EXTENDS_WITHOUT_TYPEDEF", "@extends used without @constructor or @interface for {0}")]
DiagnosticType EXTENDS_NON_OBJECT=Optional[DiagnosticType.warning("JSC_EXTENDS_NON_OBJECT", "{0} @extends non-object type {1}")]
DiagnosticType RESOLVED_TAG_EMPTY=Optional[DiagnosticType.warning("JSC_RESOLVED_TAG_EMPTY", "Could not resolve type in {0} tag of {1}")]
DiagnosticType IMPLEMENTS_WITHOUT_CONSTRUCTOR=Optional[DiagnosticType.warning("JSC_IMPLEMENTS_WITHOUT_CONSTRUCTOR", "@implements used without @constructor or @interface for {0}")]
DiagnosticType CONSTRUCTOR_REQUIRED=Optional[DiagnosticType.warning("JSC_CONSTRUCTOR_REQUIRED", "{0} used without @constructor for {1}")]
DiagnosticType VAR_ARGS_MUST_BE_LAST=Optional[DiagnosticType.warning("JSC_VAR_ARGS_MUST_BE_LAST", "variable length argument must be last")]
DiagnosticType OPTIONAL_ARG_AT_END=Optional[DiagnosticType.warning("JSC_OPTIONAL_ARG_AT_END", "optional arguments must be at the end")]
DiagnosticType INEXISTANT_PARAM=Optional[DiagnosticType.warning("JSC_INEXISTANT_PARAM", "parameter {0} does not appear in {1}''s parameter list")]
DiagnosticType TYPE_REDEFINITION=Optional[DiagnosticType.warning("JSC_TYPE_REDEFINITION", "attempted re-definition of type {0}\n" + "found   : {1}\n" + "expected: {2}")]
DiagnosticType TEMPLATE_TYPE_DUPLICATED=Optional[DiagnosticType.warning("JSC_TEMPLATE_TYPE_DUPLICATED", "Only one parameter type must be the template type")]
DiagnosticType TEMPLATE_TYPE_EXPECTED=Optional[DiagnosticType.warning("JSC_TEMPLATE_TYPE_EXPECTED", "The template type must be a parameter type")]
DiagnosticType THIS_TYPE_NON_OBJECT=Optional[DiagnosticType.warning("JSC_THIS_TYPE_NON_OBJECT", "@this type of a function must be an object\n" + "Actual type: {0}")]
