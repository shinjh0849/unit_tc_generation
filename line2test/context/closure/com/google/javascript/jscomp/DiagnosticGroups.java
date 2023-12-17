public DiagnosticGroups()
 static DiagnosticGroup registerDeprecatedGroup(String name)
 static DiagnosticGroup registerGroup(String name, DiagnosticGroup group)
 static DiagnosticGroup registerGroup(String name, DiagnosticType... types)
 static DiagnosticGroup registerGroup(String name, DiagnosticGroup... groups)
protected Map<String, DiagnosticGroup> getRegisteredGroups()
public DiagnosticGroup forName(String name)
 void setWarningLevel(CompilerOptions options, String name, CheckLevel level)
DiagnosticType UNUSED=Optional[DiagnosticType.warning("JSC_UNUSED", "{0}")]
Map<String, DiagnosticGroup> groupsByName=Optional[Maps.newHashMap()]
String DIAGNOSTIC_GROUP_NAMES=Optional["accessControls, ambiguousFunctionDecl, cast, checkRegExp, " + "checkTypes, checkVars, const, constantProperty, deprecated, " + "duplicateMessage, " + "es5Strict, externsValidation, fileoverviewTags, globalThis, " + "internetExplorerChecks, invalidCasts, misplacedTypeAnnotation, " + "missingProperties, " + "nonStandardJsDocs, suspiciousCode, strictModuleDepCheck, " + "typeInvalidation, " + "undefinedNames, undefinedVars, unknownDefines, uselessCode, " + "visibility"]
DiagnosticGroup GLOBAL_THIS=Optional[DiagnosticGroups.registerGroup("globalThis", CheckGlobalThis.GLOBAL_THIS)]
DiagnosticGroup DEPRECATED=Optional[DiagnosticGroups.registerGroup("deprecated", CheckAccessControls.DEPRECATED_NAME, CheckAccessControls.DEPRECATED_NAME_REASON, CheckAccessControls.DEPRECATED_PROP, CheckAccessControls.DEPRECATED_PROP_REASON, CheckAccessControls.DEPRECATED_CLASS, CheckAccessControls.DEPRECATED_CLASS_REASON)]
DiagnosticGroup VISIBILITY=Optional[DiagnosticGroups.registerGroup("visibility", CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS, CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS, CheckAccessControls.BAD_PROTECTED_PROPERTY_ACCESS, CheckAccessControls.PRIVATE_OVERRIDE, CheckAccessControls.VISIBILITY_MISMATCH)]
DiagnosticGroup CONSTANT_PROPERTY=Optional[DiagnosticGroups.registerGroup("constantProperty", CheckAccessControls.CONST_PROPERTY_DELETED, CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE)]
DiagnosticGroup NON_STANDARD_JSDOC=Optional[DiagnosticGroups.registerGroup("nonStandardJsDocs", RhinoErrorReporter.BAD_JSDOC_ANNOTATION)]
DiagnosticGroup ACCESS_CONTROLS=Optional[DiagnosticGroups.registerGroup("accessControls", DEPRECATED, VISIBILITY)]
DiagnosticGroup INVALID_CASTS=Optional[DiagnosticGroups.registerGroup("invalidCasts", TypeValidator.INVALID_CAST)]
DiagnosticGroup FILEOVERVIEW_JSDOC=Optional[DiagnosticGroups.registerDeprecatedGroup("fileoverviewTags")]
DiagnosticGroup STRICT_MODULE_DEP_CHECK=Optional[DiagnosticGroups.registerGroup("strictModuleDepCheck", VarCheck.STRICT_MODULE_DEP_ERROR, CheckGlobalNames.STRICT_MODULE_DEP_QNAME)]
DiagnosticGroup VIOLATED_MODULE_DEP=Optional[DiagnosticGroups.registerGroup("violatedModuleDep", VarCheck.VIOLATED_MODULE_DEP_ERROR)]
DiagnosticGroup EXTERNS_VALIDATION=Optional[DiagnosticGroups.registerGroup("externsValidation", VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR, VarCheck.UNDEFINED_EXTERN_VAR_ERROR)]
DiagnosticGroup AMBIGUOUS_FUNCTION_DECL=Optional[DiagnosticGroups.registerGroup("ambiguousFunctionDecl", VariableReferenceCheck.AMBIGUOUS_FUNCTION_DECL)]
DiagnosticGroup UNKNOWN_DEFINES=Optional[DiagnosticGroups.registerGroup("unknownDefines", ProcessDefines.UNKNOWN_DEFINE_WARNING)]
DiagnosticGroup TWEAKS=Optional[DiagnosticGroups.registerGroup("tweakValidation", ProcessTweaks.INVALID_TWEAK_DEFAULT_VALUE_WARNING, ProcessTweaks.TWEAK_WRONG_GETTER_TYPE_WARNING, ProcessTweaks.UNKNOWN_TWEAK_WARNING)]
DiagnosticGroup MISSING_PROPERTIES=Optional[DiagnosticGroups.registerGroup("missingProperties", TypeCheck.INEXISTENT_PROPERTY)]
DiagnosticGroup INTERNET_EXPLORER_CHECKS=Optional[DiagnosticGroups.registerGroup("internetExplorerChecks", RhinoErrorReporter.TRAILING_COMMA)]
DiagnosticGroup UNDEFINED_VARIABLES=Optional[DiagnosticGroups.registerGroup("undefinedVars", VarCheck.UNDEFINED_VAR_ERROR)]
DiagnosticGroup UNDEFINED_NAMES=Optional[DiagnosticGroups.registerGroup("undefinedNames", CheckGlobalNames.UNDEFINED_NAME_WARNING)]
DiagnosticGroup DEBUGGER_STATEMENT_PRESENT=Optional[DiagnosticGroups.registerGroup("checkDebuggerStatement", CheckDebuggerStatement.DEBUGGER_STATEMENT_PRESENT)]
DiagnosticGroup CHECK_REGEXP=Optional[DiagnosticGroups.registerGroup("checkRegExp", CheckRegExp.REGEXP_REFERENCE, CheckRegExp.MALFORMED_REGEXP)]
DiagnosticGroup CHECK_TYPES=Optional[DiagnosticGroups.registerGroup("checkTypes", TypeValidator.ALL_DIAGNOSTICS, TypeCheck.ALL_DIAGNOSTICS)]
DiagnosticGroup CHECK_VARIABLES=Optional[DiagnosticGroups.registerGroup("checkVars", VarCheck.UNDEFINED_VAR_ERROR, SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR)]
DiagnosticGroup CHECK_USELESS_CODE=Optional[DiagnosticGroups.registerGroup("uselessCode", CheckSideEffects.USELESS_CODE_ERROR, CheckUnreachableCode.UNREACHABLE_CODE)]
DiagnosticGroup CONST=Optional[DiagnosticGroups.registerGroup("const", CheckAccessControls.CONST_PROPERTY_DELETED, CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE, ConstCheck.CONST_REASSIGNED_VALUE_ERROR)]
DiagnosticGroup TYPE_INVALIDATION=Optional[DiagnosticGroups.registerGroup("typeInvalidation", DisambiguateProperties.Warnings.INVALIDATION)]
DiagnosticGroup DUPLICATE_VARS=Optional[DiagnosticGroups.registerGroup("duplicate", SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR, TypeValidator.DUP_VAR_DECLARATION)]
DiagnosticGroup ES5_STRICT=Optional[DiagnosticGroups.registerGroup("es5Strict", ControlStructureCheck.USE_OF_WITH, StrictModeCheck.UNKNOWN_VARIABLE, StrictModeCheck.EVAL_DECLARATION, StrictModeCheck.EVAL_ASSIGNMENT, StrictModeCheck.ARGUMENTS_DECLARATION, StrictModeCheck.ARGUMENTS_ASSIGNMENT, StrictModeCheck.DELETE_VARIABLE, StrictModeCheck.DUPLICATE_OBJECT_KEY, StrictModeCheck.BAD_FUNCTION_DECLARATION)]
DiagnosticGroup CHECK_PROVIDES=Optional[DiagnosticGroups.registerGroup("checkProvides", CheckProvides.MISSING_PROVIDE_WARNING)]
DiagnosticGroup DUPLICATE_MESSAGE=Optional[DiagnosticGroups.registerGroup("duplicateMessage", JsMessageVisitor.MESSAGE_DUPLICATE_KEY)]
DiagnosticGroup MISPLACED_TYPE_ANNOTATION=Optional[DiagnosticGroups.registerGroup("misplacedTypeAnnotation", RhinoErrorReporter.MISPLACED_TYPE_ANNOTATION)]
DiagnosticGroup CAST=Optional[DiagnosticGroups.registerGroup("cast", TypeValidator.INVALID_CAST)]
DiagnosticGroup SUSPICIOUS_CODE=Optional[DiagnosticGroups.registerGroup("suspiciousCode", CheckSuspiciousCode.SUSPICIOUS_SEMICOLON, CheckSuspiciousCode.SUSPICIOUS_COMPARISON_WITH_NAN)]
