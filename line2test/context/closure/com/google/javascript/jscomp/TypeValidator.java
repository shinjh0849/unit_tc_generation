 TypeValidator(AbstractCompiler compiler)
 TypeMismatch(JSType a, JSType b, JSError src)
 Iterable<TypeMismatch> getMismatches()
 void setShouldReport(boolean report)
 void expectValidTypeofName(NodeTraversal t, Node n, String found)
 boolean expectObject(NodeTraversal t, Node n, JSType type, String msg)
 void expectActualObject(NodeTraversal t, Node n, JSType type, String msg)
 void expectAnyObject(NodeTraversal t, Node n, JSType type, String msg)
 void expectString(NodeTraversal t, Node n, JSType type, String msg)
 void expectNumber(NodeTraversal t, Node n, JSType type, String msg)
 void expectBitwiseable(NodeTraversal t, Node n, JSType type, String msg)
 void expectStringOrNumber(NodeTraversal t, Node n, JSType type, String msg)
 boolean expectNotNullOrUndefined(NodeTraversal t, Node n, JSType type, String msg, JSType expectedType)
private boolean containsForwardDeclaredUnresolvedName(JSType type)
 void expectSwitchMatchesCase(NodeTraversal t, Node n, JSType switchType, JSType caseType)
 void expectIndexMatch(NodeTraversal t, Node n, JSType objType, JSType indexType)
 boolean expectCanAssignToPropertyOf(NodeTraversal t, Node n, JSType rightType, JSType leftType, Node owner, String propName)
 boolean expectCanAssignTo(NodeTraversal t, Node n, JSType rightType, JSType leftType, String msg)
 void expectArgumentMatchesParameter(NodeTraversal t, Node n, JSType argType, JSType paramType, Node callNode, int ordinal)
 void expectCanOverride(NodeTraversal t, Node n, JSType overridingType, JSType hiddenType, String propertyName, JSType ownerType)
 void expectSuperType(NodeTraversal t, Node n, ObjectType superObject, ObjectType subObject)
 void expectCanCast(NodeTraversal t, Node n, JSType castType, JSType type)
 Var expectUndeclaredVariable(String sourceName, CompilerInput input, Node n, Node parent, Var var, String variableName, JSType newType)
 void expectAllInterfaceProperties(NodeTraversal t, Node n, FunctionType type)
private void expectInterfaceProperty(NodeTraversal t, Node n, ObjectType instance, ObjectType implementedInterface, String prop)
private void mismatch(NodeTraversal t, Node n, String msg, JSType found, JSType required)
private void mismatch(NodeTraversal t, Node n, String msg, JSType found, JSTypeNative required)
private void mismatch(String sourceName, Node n, String msg, JSType found, JSType required)
private void registerMismatch(JSType found, JSType required, JSError error)
private void registerIfMismatch(JSType found, JSType required, JSError error)
private String formatFoundRequired(String description, JSType found, JSType required)
 String getReadableJSTypeName(Node n, boolean dereference)
private JSType getJSType(Node n)
private JSType getNativeType(JSTypeNative typeId)
private JSError report(JSError error)
public boolean equals(Object object)
public int hashCode()
public String toString()
AbstractCompiler compiler
JSTypeRegistry typeRegistry
JSType allValueTypes
boolean shouldReport=Optional[true]
JSType nullOrUndefined
List<TypeMismatch> mismatches=Optional[Lists.newArrayList()]
String FOUND_REQUIRED=Optional["{0}\n" + "found   : {1}\n" + "required: {2}"]
DiagnosticType INVALID_CAST=Optional[DiagnosticType.disabled("JSC_INVALID_CAST", "invalid cast - must be a subtype or supertype\n" + "from: {0}\n" + "to  : {1}")]
DiagnosticType TYPE_MISMATCH_WARNING=Optional[DiagnosticType.warning("JSC_TYPE_MISMATCH", "{0}")]
DiagnosticType MISSING_EXTENDS_TAG_WARNING=Optional[DiagnosticType.warning("JSC_MISSING_EXTENDS_TAG", "Missing @extends tag on type {0}")]
DiagnosticType DUP_VAR_DECLARATION=Optional[DiagnosticType.warning("JSC_DUP_VAR_DECLARATION", "variable {0} redefined with type {1}, " + "original definition at {2}:{3} with type {4}")]
DiagnosticType HIDDEN_PROPERTY_MISMATCH=Optional[DiagnosticType.warning("JSC_HIDDEN_PROPERTY_MISMATCH", "mismatch of the {0} property type and the type " + "of the property it overrides from superclass {1}\n" + "original: {2}\n" + "override: {3}")]
DiagnosticType INTERFACE_METHOD_NOT_IMPLEMENTED=Optional[DiagnosticType.warning("JSC_INTERFACE_METHOD_NOT_IMPLEMENTED", "property {0} on interface {1} is not implemented by type {2}")]
DiagnosticType HIDDEN_INTERFACE_PROPERTY_MISMATCH=Optional[DiagnosticType.warning("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH", "mismatch of the {0} property type and the type " + "of the property it overrides from interface {1}\n" + "original: {2}\n" + "override: {3}")]
DiagnosticType UNKNOWN_TYPEOF_VALUE=Optional[DiagnosticType.warning("JSC_UNKNOWN_TYPEOF_VALUE", "unknown type: {0}")]
DiagnosticType ILLEGAL_PROPERTY_ACCESS=Optional[DiagnosticType.warning("JSC_ILLEGAL_PROPERTY_ACCESS", "Cannot do {0} access on a {1}")]
DiagnosticGroup ALL_DIAGNOSTICS=Optional[new DiagnosticGroup(INVALID_CAST, TYPE_MISMATCH_WARNING, MISSING_EXTENDS_TAG_WARNING, DUP_VAR_DECLARATION, HIDDEN_PROPERTY_MISMATCH, INTERFACE_METHOD_NOT_IMPLEMENTED, HIDDEN_INTERFACE_PROPERTY_MISMATCH, UNKNOWN_TYPEOF_VALUE, ILLEGAL_PROPERTY_ACCESS)]
