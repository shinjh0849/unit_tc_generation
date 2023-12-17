 CheckGlobalNames(AbstractCompiler compiler, CheckLevel level)
 CheckGlobalNames injectNamespace(GlobalNamespace namespace)
public void process(Node externs, Node root)
private void findPrototypeProps(String type, Set<String> props)
private void checkDescendantNames(Name name, boolean nameIsDefined)
private void validateName(Name name, boolean isDefined)
private boolean isTypedef(Ref ref)
private void reportBadModuleReference(Name name, Ref ref)
private void reportRefToUndefinedName(Name name, Ref ref)
private boolean propertyMustBeInitializedByFullName(Name name)
AbstractCompiler compiler
CodingConvention convention
CheckLevel level
GlobalNamespace namespace=Optional[null]
Set<String> objectPrototypeProps=Optional[Sets.newHashSet()]
Set<String> functionPrototypeProps=Optional[Sets.newHashSet()]
DiagnosticType UNDEFINED_NAME_WARNING=Optional[DiagnosticType.warning("JSC_UNDEFINED_NAME", "{0} is never defined")]
DiagnosticType NAME_DEFINED_LATE_WARNING=Optional[DiagnosticType.warning("JSC_NAME_DEFINED_LATE", "{0} defined before its owner. {1} is defined at {2}:{3}")]
DiagnosticType STRICT_MODULE_DEP_QNAME=Optional[DiagnosticType.disabled("JSC_STRICT_MODULE_DEP_QNAME", "module {0} cannot reference {2}, defined in " + "module {1}")]
