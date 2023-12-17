 CheckAccessControls(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
private JSType getClassOfMethod(Node n, Node parent)
private JSType normalizeClassType(JSType type)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void checkConstructorDeprecation(NodeTraversal t, Node n, Node parent)
private void checkNameDeprecation(NodeTraversal t, Node n, Node parent)
private void checkPropertyDeprecation(NodeTraversal t, Node n, Node parent)
private void checkNameVisibility(NodeTraversal t, Node name, Node parent)
private void checkFinalClassOverrides(NodeTraversal t, Node fn, Node parent)
private void checkConstantProperty(NodeTraversal t, Node getprop)
private void checkPropertyVisibility(NodeTraversal t, Node getprop, Node parent)
private static boolean isValidPrivateConstructorAccess(Node parent)
private boolean shouldEmitDeprecationWarning(NodeTraversal t, Node n, Node parent)
private boolean canAccessDeprecatedTypes(NodeTraversal t)
private static boolean isDeprecatedFunction(Node n, Node parent)
private static String getTypeDeprecationInfo(JSType type)
private static boolean isPropertyDeclaredConstant(ObjectType objectType, String prop)
private static String getPropertyDeprecationInfo(ObjectType type, String prop)
private static JSType dereference(JSType type)
private JSType getFinalParentClass(JSType type)
DiagnosticType DEPRECATED_NAME=Optional[DiagnosticType.disabled("JSC_DEPRECATED_VAR", "Variable {0} has been deprecated.")]
DiagnosticType DEPRECATED_NAME_REASON=Optional[DiagnosticType.disabled("JSC_DEPRECATED_VAR_REASON", "Variable {0} has been deprecated: {1}")]
DiagnosticType DEPRECATED_PROP=Optional[DiagnosticType.disabled("JSC_DEPRECATED_PROP", "Property {0} of type {1} has been deprecated.")]
DiagnosticType DEPRECATED_PROP_REASON=Optional[DiagnosticType.disabled("JSC_DEPRECATED_PROP_REASON", "Property {0} of type {1} has been deprecated: {2}")]
DiagnosticType DEPRECATED_CLASS=Optional[DiagnosticType.disabled("JSC_DEPRECATED_CLASS", "Class {0} has been deprecated.")]
DiagnosticType DEPRECATED_CLASS_REASON=Optional[DiagnosticType.disabled("JSC_DEPRECATED_CLASS_REASON", "Class {0} has been deprecated: {1}")]
DiagnosticType BAD_PRIVATE_GLOBAL_ACCESS=Optional[DiagnosticType.disabled("JSC_BAD_PRIVATE_GLOBAL_ACCESS", "Access to private variable {0} not allowed outside file {1}.")]
DiagnosticType BAD_PRIVATE_PROPERTY_ACCESS=Optional[DiagnosticType.disabled("JSC_BAD_PRIVATE_PROPERTY_ACCESS", "Access to private property {0} of {1} not allowed here.")]
DiagnosticType BAD_PROTECTED_PROPERTY_ACCESS=Optional[DiagnosticType.disabled("JSC_BAD_PROTECTED_PROPERTY_ACCESS", "Access to protected property {0} of {1} not allowed here.")]
DiagnosticType PRIVATE_OVERRIDE=Optional[DiagnosticType.disabled("JSC_PRIVATE_OVERRIDE", "Overriding private property of {0}.")]
DiagnosticType EXTEND_FINAL_CLASS=Optional[DiagnosticType.error("JSC_EXTEND_FINAL_CLASS", "{0} is not allowed to extend final class {1}.")]
DiagnosticType VISIBILITY_MISMATCH=Optional[DiagnosticType.disabled("JSC_VISIBILITY_MISMATCH", "Overriding {0} property of {1} with {2} property.")]
DiagnosticType CONST_PROPERTY_REASSIGNED_VALUE=Optional[DiagnosticType.warning("JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE", "constant property {0} assigned a value more than once")]
DiagnosticType CONST_PROPERTY_DELETED=Optional[DiagnosticType.warning("JSC_CONSTANT_PROPERTY_DELETED", "constant property {0} cannot be deleted")]
AbstractCompiler compiler
TypeValidator validator
int deprecatedDepth=Optional[0]
int methodDepth=Optional[0]
JSType currentClass=Optional[null]
Multimap<String, String> initializedConstantProperties
