public Bind(Node target, Node thisValue, Node parameters) { [EOL]     this.target = target; [EOL]     this.thisValue = thisValue; [EOL]     this.parameters = parameters; [EOL] } <line_num>: 265,269
public SubclassRelationship(SubclassType type, Node subclassNode, Node superclassNode) { [EOL]     this.type = type; [EOL]     this.subclassName = subclassNode.getQualifiedName(); [EOL]     this.superclassName = superclassNode.getQualifiedName(); [EOL] } <line_num>: 325,330
DelegateRelationship(String delegateBase, String delegator) { [EOL]     this.delegateBase = delegateBase; [EOL]     this.delegator = delegator; [EOL] } <line_num>: 346,349
ObjectLiteralCast(String typeName, Node objectNode, DiagnosticType diagnosticType) { [EOL]     this.typeName = typeName; [EOL]     this.objectNode = objectNode; [EOL]     this.diagnosticType = diagnosticType; [EOL] } <line_num>: 366,371
public AssertionFunctionSpec(String functionName) { [EOL]     this(functionName, null); [EOL] } <line_num>: 383,385
public AssertionFunctionSpec(String functionName, JSTypeNative assertedType) { [EOL]     this.functionName = functionName; [EOL]     this.assertedType = assertedType; [EOL] } <line_num>: 387,391
public boolean isConstant(String variableName); <line_num>: 45,45
public boolean isConstantKey(String keyName); <line_num>: 52,52
public boolean isValidEnumKey(String key); <line_num>: 61,61
public boolean isOptionalParameter(Node parameter); <line_num>: 74,74
public boolean isVarArgsParameter(Node parameter); <line_num>: 85,85
public boolean isExported(String name, boolean local); <line_num>: 95,95
public boolean isExported(String name); <line_num>: 100,100
public boolean isPrivate(String name); <line_num>: 112,112
public SubclassRelationship getClassesDefinedByCall(Node callNode); <line_num>: 121,121
public boolean isSuperClassReference(String propertyName); <line_num>: 128,128
public String extractClassNameIfProvide(Node node, Node parent); <line_num>: 134,134
public String extractClassNameIfRequire(Node node, Node parent); <line_num>: 140,140
public String getExportPropertyFunction(); <line_num>: 147,147
public String getExportSymbolFunction(); <line_num>: 154,154
public List<String> identifyTypeDeclarationCall(Node n); <line_num>: 160,160
public void applySubclassRelationship(FunctionType parentCtor, FunctionType childCtor, SubclassType type); <line_num>: 166,167
public String getAbstractMethodName(); <line_num>: 176,176
public String getSingletonGetterClassName(Node callNode); <line_num>: 189,189
public void applySingletonGetter(FunctionType functionType, FunctionType getterType, ObjectType objectType); <line_num>: 195,196
public boolean isInlinableFunction(Node n); <line_num>: 201,201
public DelegateRelationship getDelegateRelationship(Node callNode); <line_num>: 206,206
public void applyDelegateRelationship(ObjectType delegateSuperclass, ObjectType delegateBase, ObjectType delegator, FunctionType delegateProxy, FunctionType findDelegate); <line_num>: 212,215
public String getDelegateSuperclassName(); <line_num>: 220,220
public void checkForCallingConventionDefiningCalls(Node n, Map<String, String> delegateCallingConventions); <line_num>: 226,227
public void defineDelegateProxyPrototypeProperties(JSTypeRegistry registry, StaticScope<JSType> scope, List<ObjectType> delegateProxyPrototypes, Map<String, String> delegateCallingConventions); <line_num>: 235,238
public String getGlobalObject(); <line_num>: 243,243
public Bind describeFunctionBind(Node n); <line_num>: 248,248
public Bind describeFunctionBind(Node n, boolean useTypeInfo); <line_num>: 255,255
int getBoundParameterCount() { [EOL]     if (parameters == null) { [EOL]         return 0; [EOL]     } [EOL]     Node paramParent = parameters.getParent(); [EOL]     return paramParent.getChildCount() - paramParent.getIndexOfChild(parameters); [EOL] } <line_num>: 274,281
public boolean isPropertyTestFunction(Node call); <line_num>: 287,287
public boolean isPrototypeAlias(Node getProp); <line_num>: 292,292
public ObjectLiteralCast getObjectLiteralCast(Node callNode); <line_num>: 301,301
public Collection<String> getIndirectlyDeclaredProperties(); <line_num>: 308,308
public Collection<AssertionFunctionSpec> getAssertionFunctions(); <line_num>: 313,313
public String getFunctionName() { [EOL]     return functionName; [EOL] } <line_num>: 394,396
public Node getAssertedParam(Node firstParam) { [EOL]     return firstParam; [EOL] } <line_num>: 402,404
public JSType getAssertedType(Node call, JSTypeRegistry registry) { [EOL]     return assertedType != null ? registry.getNativeType(assertedType) : null; [EOL] } <line_num>: 410,412
