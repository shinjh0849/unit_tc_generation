private CodingConventions() { [EOL] } <line_num>: 38,38
protected Proxy(CodingConvention convention) { [EOL]     this.nextConvention = convention; [EOL] } <line_num>: 59,61
public static CodingConvention getDefault() { [EOL]     return new DefaultCodingConvention(); [EOL] } <line_num>: 41,43
@Override [EOL] public boolean isConstant(String variableName) { [EOL]     return nextConvention.isConstant(variableName); [EOL] } <line_num>: 63,66
@Override [EOL] public boolean isConstantKey(String keyName) { [EOL]     return nextConvention.isConstantKey(keyName); [EOL] } <line_num>: 68,70
@Override [EOL] public boolean isValidEnumKey(String key) { [EOL]     return nextConvention.isValidEnumKey(key); [EOL] } <line_num>: 72,75
@Override [EOL] public boolean isOptionalParameter(Node parameter) { [EOL]     return nextConvention.isOptionalParameter(parameter); [EOL] } <line_num>: 77,80
@Override [EOL] public boolean isVarArgsParameter(Node parameter) { [EOL]     return nextConvention.isVarArgsParameter(parameter); [EOL] } <line_num>: 82,85
@Override [EOL] public boolean isExported(String name, boolean local) { [EOL]     return nextConvention.isExported(name, local); [EOL] } <line_num>: 87,90
@Override [EOL] public final boolean isExported(String name) { [EOL]     return isExported(name, false) || isExported(name, true); [EOL] } <line_num>: 93,96
@Override [EOL] public boolean isPrivate(String name) { [EOL]     return nextConvention.isPrivate(name); [EOL] } <line_num>: 98,101
@Override [EOL] public SubclassRelationship getClassesDefinedByCall(Node callNode) { [EOL]     return nextConvention.getClassesDefinedByCall(callNode); [EOL] } <line_num>: 103,106
@Override [EOL] public boolean isSuperClassReference(String propertyName) { [EOL]     return nextConvention.isSuperClassReference(propertyName); [EOL] } <line_num>: 108,111
@Override [EOL] public String extractClassNameIfProvide(Node node, Node parent) { [EOL]     return nextConvention.extractClassNameIfProvide(node, parent); [EOL] } <line_num>: 113,116
@Override [EOL] public String extractClassNameIfRequire(Node node, Node parent) { [EOL]     return nextConvention.extractClassNameIfRequire(node, parent); [EOL] } <line_num>: 118,121
@Override [EOL] public String getExportPropertyFunction() { [EOL]     return nextConvention.getExportPropertyFunction(); [EOL] } <line_num>: 123,126
@Override [EOL] public String getExportSymbolFunction() { [EOL]     return nextConvention.getExportSymbolFunction(); [EOL] } <line_num>: 128,131
@Override [EOL] public List<String> identifyTypeDeclarationCall(Node n) { [EOL]     return nextConvention.identifyTypeDeclarationCall(n); [EOL] } <line_num>: 133,136
@Override [EOL] public void applySubclassRelationship(FunctionType parentCtor, FunctionType childCtor, SubclassType type) { [EOL]     nextConvention.applySubclassRelationship(parentCtor, childCtor, type); [EOL] } <line_num>: 138,143
@Override [EOL] public String getAbstractMethodName() { [EOL]     return nextConvention.getAbstractMethodName(); [EOL] } <line_num>: 145,148
@Override [EOL] public String getSingletonGetterClassName(Node callNode) { [EOL]     return nextConvention.getSingletonGetterClassName(callNode); [EOL] } <line_num>: 150,153
@Override [EOL] public void applySingletonGetter(FunctionType functionType, FunctionType getterType, ObjectType objectType) { [EOL]     nextConvention.applySingletonGetter(functionType, getterType, objectType); [EOL] } <line_num>: 155,160
@Override [EOL] public boolean isInlinableFunction(Node n) { [EOL]     return nextConvention.isInlinableFunction(n); [EOL] } <line_num>: 162,165
@Override [EOL] public DelegateRelationship getDelegateRelationship(Node callNode) { [EOL]     return nextConvention.getDelegateRelationship(callNode); [EOL] } <line_num>: 167,170
@Override [EOL] public void applyDelegateRelationship(ObjectType delegateSuperclass, ObjectType delegateBase, ObjectType delegator, FunctionType delegateProxy, FunctionType findDelegate) { [EOL]     nextConvention.applyDelegateRelationship(delegateSuperclass, delegateBase, delegator, delegateProxy, findDelegate); [EOL] } <line_num>: 172,180
@Override [EOL] public String getDelegateSuperclassName() { [EOL]     return nextConvention.getDelegateSuperclassName(); [EOL] } <line_num>: 182,185
@Override [EOL] public void checkForCallingConventionDefiningCalls(Node n, Map<String, String> delegateCallingConventions) { [EOL]     nextConvention.checkForCallingConventionDefiningCalls(n, delegateCallingConventions); [EOL] } <line_num>: 187,192
@Override [EOL] public void defineDelegateProxyPrototypeProperties(JSTypeRegistry registry, StaticScope<JSType> scope, List<ObjectType> delegateProxyPrototypes, Map<String, String> delegateCallingConventions) { [EOL]     nextConvention.defineDelegateProxyPrototypeProperties(registry, scope, delegateProxyPrototypes, delegateCallingConventions); [EOL] } <line_num>: 194,201
@Override [EOL] public String getGlobalObject() { [EOL]     return nextConvention.getGlobalObject(); [EOL] } <line_num>: 203,206
@Override [EOL] public Collection<AssertionFunctionSpec> getAssertionFunctions() { [EOL]     return nextConvention.getAssertionFunctions(); [EOL] } <line_num>: 208,211
@Override [EOL] public Bind describeFunctionBind(Node n) { [EOL]     return describeFunctionBind(n, false); [EOL] } <line_num>: 213,216
@Override [EOL] public Bind describeFunctionBind(Node n, boolean useTypeInfo) { [EOL]     return nextConvention.describeFunctionBind(n, useTypeInfo); [EOL] } <line_num>: 218,221
@Override [EOL] public boolean isPropertyTestFunction(Node call) { [EOL]     return nextConvention.isPropertyTestFunction(call); [EOL] } <line_num>: 223,226
@Override [EOL] public boolean isPrototypeAlias(Node getProp) { [EOL]     return false; [EOL] } <line_num>: 228,231
@Override [EOL] public ObjectLiteralCast getObjectLiteralCast(Node callNode) { [EOL]     return nextConvention.getObjectLiteralCast(callNode); [EOL] } <line_num>: 233,236
@Override [EOL] public Collection<String> getIndirectlyDeclaredProperties() { [EOL]     return nextConvention.getIndirectlyDeclaredProperties(); [EOL] } <line_num>: 238,241
@Override [EOL] public boolean isConstant(String variableName) { [EOL]     return false; [EOL] } <line_num>: 253,256
@Override [EOL] public boolean isConstantKey(String variableName) { [EOL]     return false; [EOL] } <line_num>: 258,261
@Override [EOL] public boolean isValidEnumKey(String key) { [EOL]     return key != null && key.length() > 0; [EOL] } <line_num>: 263,266
@Override [EOL] public boolean isOptionalParameter(Node parameter) { [EOL]     return !isVarArgsParameter(parameter); [EOL] } <line_num>: 268,273
@Override [EOL] public boolean isVarArgsParameter(Node parameter) { [EOL]     return parameter.getParent().getLastChild() == parameter; [EOL] } <line_num>: 275,279
@Override [EOL] public boolean isExported(String name, boolean local) { [EOL]     return local && name.startsWith("$super"); [EOL] } <line_num>: 281,284
@Override [EOL] public boolean isExported(String name) { [EOL]     return isExported(name, false) || isExported(name, true); [EOL] } <line_num>: 286,289
@Override [EOL] public boolean isPrivate(String name) { [EOL]     return false; [EOL] } <line_num>: 291,294
@Override [EOL] public SubclassRelationship getClassesDefinedByCall(Node callNode) { [EOL]     return null; [EOL] } <line_num>: 296,299
@Override [EOL] public boolean isSuperClassReference(String propertyName) { [EOL]     return false; [EOL] } <line_num>: 301,304
@Override [EOL] public String extractClassNameIfProvide(Node node, Node parent) { [EOL]     String message = "only implemented in GoogleCodingConvention"; [EOL]     throw new UnsupportedOperationException(message); [EOL] } <line_num>: 306,310
@Override [EOL] public String extractClassNameIfRequire(Node node, Node parent) { [EOL]     String message = "only implemented in GoogleCodingConvention"; [EOL]     throw new UnsupportedOperationException(message); [EOL] } <line_num>: 312,316
@Override [EOL] public String getExportPropertyFunction() { [EOL]     return null; [EOL] } <line_num>: 318,321
@Override [EOL] public String getExportSymbolFunction() { [EOL]     return null; [EOL] } <line_num>: 323,326
@Override [EOL] public List<String> identifyTypeDeclarationCall(Node n) { [EOL]     return null; [EOL] } <line_num>: 328,331
@Override [EOL] public void applySubclassRelationship(FunctionType parentCtor, FunctionType childCtor, SubclassType type) { [EOL] } <line_num>: 333,337
@Override [EOL] public String getAbstractMethodName() { [EOL]     return null; [EOL] } <line_num>: 339,342
@Override [EOL] public String getSingletonGetterClassName(Node callNode) { [EOL]     return null; [EOL] } <line_num>: 344,347
@Override [EOL] public void applySingletonGetter(FunctionType functionType, FunctionType getterType, ObjectType objectType) { [EOL] } <line_num>: 349,353
@Override [EOL] public boolean isInlinableFunction(Node n) { [EOL]     Preconditions.checkState(n.isFunction()); [EOL]     return true; [EOL] } <line_num>: 355,359
@Override [EOL] public DelegateRelationship getDelegateRelationship(Node callNode) { [EOL]     return null; [EOL] } <line_num>: 361,364
@Override [EOL] public void applyDelegateRelationship(ObjectType delegateSuperclass, ObjectType delegateBase, ObjectType delegator, FunctionType delegateProxy, FunctionType findDelegate) { [EOL] } <line_num>: 366,372
@Override [EOL] public String getDelegateSuperclassName() { [EOL]     return null; [EOL] } <line_num>: 374,377
@Override [EOL] public void checkForCallingConventionDefiningCalls(Node n, Map<String, String> delegateCallingConventions) { [EOL] } <line_num>: 379,383
@Override [EOL] public void defineDelegateProxyPrototypeProperties(JSTypeRegistry registry, StaticScope<JSType> scope, List<ObjectType> delegateProxyPrototypes, Map<String, String> delegateCallingConventions) { [EOL] } <line_num>: 385,391
@Override [EOL] public String getGlobalObject() { [EOL]     return "window"; [EOL] } <line_num>: 393,396
@Override [EOL] public boolean isPropertyTestFunction(Node call) { [EOL]     return false; [EOL] } <line_num>: 398,401
@Override [EOL] public boolean isPrototypeAlias(Node getProp) { [EOL]     return false; [EOL] } <line_num>: 403,406
@Override [EOL] public ObjectLiteralCast getObjectLiteralCast(Node callNode) { [EOL]     return null; [EOL] } <line_num>: 408,411
@Override [EOL] public Collection<AssertionFunctionSpec> getAssertionFunctions() { [EOL]     return Collections.emptySet(); [EOL] } <line_num>: 413,416
@Override [EOL] public Bind describeFunctionBind(Node n) { [EOL]     return describeFunctionBind(n, false); [EOL] } <line_num>: 418,421
@Override [EOL] public Bind describeFunctionBind(Node n, boolean useTypeInfo) { [EOL]     if (!n.isCall()) { [EOL]         return null; [EOL]     } [EOL]     Node callTarget = n.getFirstChild(); [EOL]     String name = callTarget.getQualifiedName(); [EOL]     if (name != null) { [EOL]         if (name.equals("Function.prototype.bind.call")) { [EOL]             Node fn = callTarget.getNext(); [EOL]             if (fn == null) { [EOL]                 return null; [EOL]             } [EOL]             Node thisValue = safeNext(fn); [EOL]             Node parameters = safeNext(thisValue); [EOL]             return new Bind(fn, thisValue, parameters); [EOL]         } [EOL]     } [EOL]     if (callTarget.isGetProp() && callTarget.getLastChild().getString().equals("bind")) { [EOL]         Node maybeFn = callTarget.getFirstChild(); [EOL]         JSType maybeFnType = maybeFn.getJSType(); [EOL]         FunctionType fnType = null; [EOL]         if (useTypeInfo && maybeFnType != null) { [EOL]             fnType = maybeFnType.restrictByNotNullOrUndefined().toMaybeFunctionType(); [EOL]         } [EOL]         if (fnType != null || maybeFn.isFunction()) { [EOL]             Node thisValue = callTarget.getNext(); [EOL]             Node parameters = safeNext(thisValue); [EOL]             return new Bind(maybeFn, thisValue, parameters); [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 423,463
@Override [EOL] public Collection<String> getIndirectlyDeclaredProperties() { [EOL]     return ImmutableList.of(); [EOL] } <line_num>: 465,468
private Node safeNext(Node n) { [EOL]     if (n != null) { [EOL]         return n.getNext(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 470,475
