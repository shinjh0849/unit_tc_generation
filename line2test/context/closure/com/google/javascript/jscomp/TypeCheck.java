public TypeCheck(AbstractCompiler compiler, ReverseAbstractInterpreter reverseInterpreter, JSTypeRegistry typeRegistry, Scope topScope, MemoizedScopeCreator scopeCreator, CheckLevel reportMissingOverride, CheckLevel reportUnknownTypes)
public TypeCheck(AbstractCompiler compiler, ReverseAbstractInterpreter reverseInterpreter, JSTypeRegistry typeRegistry, CheckLevel reportMissingOverride, CheckLevel reportUnknownTypes)
 TypeCheck(AbstractCompiler compiler, ReverseAbstractInterpreter reverseInterpreter, JSTypeRegistry typeRegistry)
 TypeCheck reportMissingProperties(boolean report)
public void process(Node externsRoot, Node jsRoot)
public Scope processForTesting(Node externsRoot, Node jsRoot)
public void check(Node node, boolean externs)
private void checkNoTypeCheckSection(Node n, boolean enterSection)
private void report(NodeTraversal t, Node n, DiagnosticType diagnosticType, String... arguments)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void checkTypeofString(NodeTraversal t, Node n, String s)
private void doPercentTypedAccounting(NodeTraversal t, Node n)
private void visitAssign(NodeTraversal t, Node assign)
private void checkPropCreation(NodeTraversal t, Node lvalue)
private void checkPropertyInheritanceOnGetpropAssign(NodeTraversal t, Node assign, Node object, String property, JSDocInfo info, JSType propertyType)
private void visitObjLitKey(NodeTraversal t, Node key, Node objlit, JSType litType)
private boolean propertyIsImplicitCast(ObjectType type, String prop)
private void checkDeclaredPropertyInheritance(NodeTraversal t, Node n, FunctionType ctorType, String propertyName, JSDocInfo info, JSType propertyType)
private static boolean hasUnknownOrEmptySupertype(FunctionType ctor)
private void visitInterfaceGetprop(NodeTraversal t, Node assign, Node object, String property, Node lvalue, Node rvalue)
 boolean visitName(NodeTraversal t, Node n, Node parent)
private void visitGetProp(NodeTraversal t, Node n, Node parent)
private void checkPropertyAccess(JSType childType, String propName, NodeTraversal t, Node n)
private void checkPropertyAccessHelper(JSType objectType, String propName, NodeTraversal t, Node n)
private boolean isPropertyTest(Node getProp)
private void visitGetElem(NodeTraversal t, Node n)
private void visitVar(NodeTraversal t, Node n)
private void visitNew(NodeTraversal t, Node n)
private void checkInterfaceConflictProperties(NodeTraversal t, Node n, String functionName, HashMap<String, ObjectType> properties, HashMap<String, ObjectType> currentProperties, ObjectType interfaceType)
private void visitFunction(NodeTraversal t, Node n)
private void visitCall(NodeTraversal t, Node n)
private void visitParameterList(NodeTraversal t, Node call, FunctionType functionType)
private void visitReturn(NodeTraversal t, Node n)
private void visitBinaryOperator(int op, NodeTraversal t, Node n)
private void checkEnumAlias(NodeTraversal t, JSDocInfo declInfo, Node value)
private JSType getJSType(Node n)
private void ensureTyped(NodeTraversal t, Node n)
private void ensureTyped(NodeTraversal t, Node n, JSTypeNative type)
private void ensureTyped(NodeTraversal t, Node n, JSType type)
 double getTypedPercent()
private JSType getNativeType(JSTypeNative typeId)
DiagnosticType UNEXPECTED_TOKEN=Optional[DiagnosticType.error("JSC_INTERNAL_ERROR_UNEXPECTED_TOKEN", "Internal Error: Don't know how to handle {0}")]
DiagnosticType BAD_DELETE=Optional[DiagnosticType.warning("JSC_BAD_DELETE_OPERAND", "delete operator needs a reference operand")]
String OVERRIDING_PROTOTYPE_WITH_NON_OBJECT=Optional["overriding prototype with non-object"]
DiagnosticType DETERMINISTIC_TEST=Optional[DiagnosticType.warning("JSC_DETERMINISTIC_TEST", "condition always evaluates to {2}\n" + "left : {0}\n" + "right: {1}")]
DiagnosticType DETERMINISTIC_TEST_NO_RESULT=Optional[DiagnosticType.warning("JSC_DETERMINISTIC_TEST_NO_RESULT", "condition always evaluates to the same value\n" + "left : {0}\n" + "right: {1}")]
DiagnosticType INEXISTENT_ENUM_ELEMENT=Optional[DiagnosticType.warning("JSC_INEXISTENT_ENUM_ELEMENT", "element {0} does not exist on this enum")]
DiagnosticType INEXISTENT_PROPERTY=Optional[DiagnosticType.disabled("JSC_INEXISTENT_PROPERTY", "Property {0} never defined on {1}")]
DiagnosticType NOT_A_CONSTRUCTOR=Optional[DiagnosticType.warning("JSC_NOT_A_CONSTRUCTOR", "cannot instantiate non-constructor")]
DiagnosticType BIT_OPERATION=Optional[DiagnosticType.warning("JSC_BAD_TYPE_FOR_BIT_OPERATION", "operator {0} cannot be applied to {1}")]
DiagnosticType NOT_CALLABLE=Optional[DiagnosticType.warning("JSC_NOT_FUNCTION_TYPE", "{0} expressions are not callable")]
DiagnosticType CONSTRUCTOR_NOT_CALLABLE=Optional[DiagnosticType.warning("JSC_CONSTRUCTOR_NOT_CALLABLE", "Constructor {0} should be called with the \"new\" keyword")]
DiagnosticType FUNCTION_MASKS_VARIABLE=Optional[DiagnosticType.warning("JSC_FUNCTION_MASKS_VARIABLE", "function {0} masks variable (IE bug)")]
DiagnosticType MULTIPLE_VAR_DEF=Optional[DiagnosticType.warning("JSC_MULTIPLE_VAR_DEF", "declaration of multiple variables with shared type information")]
DiagnosticType ENUM_DUP=Optional[DiagnosticType.error("JSC_ENUM_DUP", "enum element {0} already defined")]
DiagnosticType ENUM_NOT_CONSTANT=Optional[DiagnosticType.warning("JSC_ENUM_NOT_CONSTANT", "enum key {0} must be a syntactic constant")]
DiagnosticType INVALID_INTERFACE_MEMBER_DECLARATION=Optional[DiagnosticType.warning("JSC_INVALID_INTERFACE_MEMBER_DECLARATION", "interface members can only be empty property declarations," + " empty functions{0}")]
DiagnosticType INTERFACE_FUNCTION_NOT_EMPTY=Optional[DiagnosticType.warning("JSC_INTERFACE_FUNCTION_NOT_EMPTY", "interface member functions must have an empty body")]
DiagnosticType CONFLICTING_EXTENDED_TYPE=Optional[DiagnosticType.warning("JSC_CONFLICTING_EXTENDED_TYPE", "{1} cannot extend this type; {0}s can only extend {0}s")]
DiagnosticType CONFLICTING_IMPLEMENTED_TYPE=Optional[DiagnosticType.warning("JSC_CONFLICTING_IMPLEMENTED_TYPE", "{0} cannot implement this type; " + "an interface can only extend, but not implement interfaces")]
DiagnosticType BAD_IMPLEMENTED_TYPE=Optional[DiagnosticType.warning("JSC_IMPLEMENTS_NON_INTERFACE", "can only implement interfaces")]
DiagnosticType HIDDEN_SUPERCLASS_PROPERTY=Optional[DiagnosticType.warning("JSC_HIDDEN_SUPERCLASS_PROPERTY", "property {0} already defined on superclass {1}; " + "use @override to override it")]
DiagnosticType HIDDEN_INTERFACE_PROPERTY=Optional[DiagnosticType.warning("JSC_HIDDEN_INTERFACE_PROPERTY", "property {0} already defined on interface {1}; " + "use @override to override it")]
DiagnosticType HIDDEN_SUPERCLASS_PROPERTY_MISMATCH=Optional[DiagnosticType.warning("JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH", "mismatch of the {0} property type and the type " + "of the property it overrides from superclass {1}\n" + "original: {2}\n" + "override: {3}")]
DiagnosticType UNKNOWN_OVERRIDE=Optional[DiagnosticType.warning("JSC_UNKNOWN_OVERRIDE", "property {0} not defined on any superclass of {1}")]
DiagnosticType INTERFACE_METHOD_OVERRIDE=Optional[DiagnosticType.warning("JSC_INTERFACE_METHOD_OVERRIDE", "property {0} is already defined by the {1} extended interface")]
DiagnosticType UNKNOWN_EXPR_TYPE=Optional[DiagnosticType.warning("JSC_UNKNOWN_EXPR_TYPE", "could not determine the type of this expression")]
DiagnosticType UNRESOLVED_TYPE=Optional[DiagnosticType.warning("JSC_UNRESOLVED_TYPE", "could not resolve the name {0} to a type")]
DiagnosticType WRONG_ARGUMENT_COUNT=Optional[DiagnosticType.warning("JSC_WRONG_ARGUMENT_COUNT", "Function {0}: called with {1} argument(s). " + "Function requires at least {2} argument(s){3}.")]
DiagnosticType ILLEGAL_IMPLICIT_CAST=Optional[DiagnosticType.warning("JSC_ILLEGAL_IMPLICIT_CAST", "Illegal annotation on {0}. @implicitCast may only be used in " + "externs.")]
DiagnosticType INCOMPATIBLE_EXTENDED_PROPERTY_TYPE=Optional[DiagnosticType.warning("JSC_INCOMPATIBLE_EXTENDED_PROPERTY_TYPE", "Interface {0} has a property {1} with incompatible types in " + "its super interfaces {2} and {3}")]
DiagnosticType EXPECTED_THIS_TYPE=Optional[DiagnosticType.warning("JSC_EXPECTED_THIS_TYPE", "\"{0}\" must be called with a \"this\" type")]
DiagnosticType IN_USED_WITH_STRUCT=Optional[DiagnosticType.warning("JSC_IN_USED_WITH_STRUCT", "Cannot use the IN operator with structs")]
DiagnosticType ILLEGAL_PROPERTY_CREATION=Optional[DiagnosticType.warning("JSC_ILLEGAL_PROPERTY_CREATION", "Cannot add a property to a struct instance " + "after it is constructed.")]
DiagnosticType ILLEGAL_OBJLIT_KEY=Optional[DiagnosticType.warning("ILLEGAL_OBJLIT_KEY", "Illegal key, the object literal is a {0}")]
DiagnosticGroup ALL_DIAGNOSTICS=Optional[new DiagnosticGroup(DETERMINISTIC_TEST, DETERMINISTIC_TEST_NO_RESULT, INEXISTENT_ENUM_ELEMENT, INEXISTENT_PROPERTY, NOT_A_CONSTRUCTOR, BIT_OPERATION, NOT_CALLABLE, CONSTRUCTOR_NOT_CALLABLE, FUNCTION_MASKS_VARIABLE, MULTIPLE_VAR_DEF, ENUM_DUP, ENUM_NOT_CONSTANT, INVALID_INTERFACE_MEMBER_DECLARATION, INTERFACE_FUNCTION_NOT_EMPTY, CONFLICTING_EXTENDED_TYPE, CONFLICTING_IMPLEMENTED_TYPE, BAD_IMPLEMENTED_TYPE, HIDDEN_SUPERCLASS_PROPERTY, HIDDEN_INTERFACE_PROPERTY, HIDDEN_SUPERCLASS_PROPERTY_MISMATCH, UNKNOWN_OVERRIDE, INTERFACE_METHOD_OVERRIDE, UNKNOWN_EXPR_TYPE, UNRESOLVED_TYPE, WRONG_ARGUMENT_COUNT, ILLEGAL_IMPLICIT_CAST, INCOMPATIBLE_EXTENDED_PROPERTY_TYPE, EXPECTED_THIS_TYPE, IN_USED_WITH_STRUCT, ILLEGAL_PROPERTY_CREATION, ILLEGAL_OBJLIT_KEY, RhinoErrorReporter.TYPE_PARSE_ERROR, TypedScopeCreator.UNKNOWN_LENDS, TypedScopeCreator.LENDS_ON_NON_OBJECT, TypedScopeCreator.CTOR_INITIALIZER, TypedScopeCreator.IFACE_INITIALIZER, FunctionTypeBuilder.THIS_TYPE_NON_OBJECT)]
AbstractCompiler compiler
TypeValidator validator
ReverseAbstractInterpreter reverseInterpreter
JSTypeRegistry typeRegistry
Scope topScope
MemoizedScopeCreator scopeCreator
CheckLevel reportMissingOverride
CheckLevel reportUnknownTypes
boolean reportMissingProperties=Optional[true]
InferJSDocInfo inferJSDocInfo=Optional[null]
int typedCount=Optional[0]
int nullCount=Optional[0]
int unknownCount=Optional[0]
boolean inExterns
int noTypeCheckSection=Optional[0]
