public CompilerOptions()
public void setAggressiveVarCheck(CheckLevel level)
public void setTightenTypes(boolean tighten)
public void setReportMissingOverride(CheckLevel level)
public void setReportUnknownTypes(CheckLevel level)
public void setCheckRequires(CheckLevel level)
public void setCheckProvides(CheckLevel level)
public void setCheckGlobalNamesLevel(CheckLevel level)
public void setBrokenClosureRequiresLevel(CheckLevel level)
public void setCheckGlobalThisLevel(CheckLevel level)
public void setCheckMissingGetCssNameLevel(CheckLevel level)
public void setCheckCaja(boolean check)
public void setCheckUnreachableCode(CheckLevel level)
public void setCheckMissingReturn(CheckLevel level)
public void setAliasableGlobals(String names)
public void setUnaliasableGlobals(String names)
public void setCollapseObjectLiterals(boolean enabled)
public void setSpecializeInitialModule(boolean enabled)
public void setReplaceMessagesWithChromeI18n(boolean replaceMessagesWithChromeI18n, String tcProjectId)
public void setIgnoreCajaProperties(boolean enabled)
public void setAppNameStr(String appNameStr)
public void setPreferSingleQuotes(boolean enabled)
public void setTrustedStrings(boolean yes)
public void setReportPath(String reportPath)
public TracerMode getTracerMode()
public void setTracerMode(TracerMode mode)
public void setNameReferenceReportPath(String filePath)
public void setNameReferenceGraphPath(String filePath)
public void setProtectHiddenSideEffects(boolean enable)
public boolean isRemoveUnusedClassProperties()
public void setRemoveUnusedClassProperties(boolean removeUnusedClassProperties)
public Map<String, Node> getDefineReplacements()
public Map<String, Node> getTweakReplacements()
private static Map<String, Node> getReplacementsHelper(Map<String, Object> source)
public void setDefineToBooleanLiteral(String defineName, boolean value)
public void setDefineToStringLiteral(String defineName, String value)
public void setDefineToNumberLiteral(String defineName, int value)
public void setDefineToDoubleLiteral(String defineName, double value)
public void setTweakToBooleanLiteral(String tweakId, boolean value)
public void setTweakToStringLiteral(String tweakId, String value)
public void setTweakToNumberLiteral(String tweakId, int value)
public void setTweakToDoubleLiteral(String tweakId, double value)
public void skipAllCompilerPasses()
 boolean enables(DiagnosticGroup type)
 boolean disables(DiagnosticGroup type)
public void setWarningLevel(DiagnosticGroup type, CheckLevel level)
 WarningsGuard getWarningsGuard()
public void resetWarningsGuard()
 void useEmergencyFailSafe()
public void addWarningsGuard(WarningsGuard guard)
public void setRenamingPolicy(VariableRenamingPolicy newVariablePolicy, PropertyRenamingPolicy newPropertyPolicy)
public void setPropertyAffinity(boolean useAffinity)
public void setShadowVariables(boolean shadow)
public void setCollapsePropertiesOnExternTypes(boolean collapse)
public void setProcessObjectPropertyString(boolean process)
public void setReplaceIdGenerators(boolean replaceIdGenerators)
public void setIdGenerators(Set<String> idGenerators)
public void setIdGeneratorsMap(String previousMappings)
public void setInlineFunctions(Reach reach)
public void setInlineVariables(Reach reach)
public void setInlineProperties(boolean enable)
public void setRemoveUnusedVariable(Reach reach)
public void setRemoveUnusedVariables(Reach reach)
public void setReplaceStringsConfiguration(String placeholderToken, List<String> functionDescriptors)
public void setRewriteNewDateGoogNow(boolean rewrite)
public void setRemoveAbstractMethods(boolean remove)
public void setRemoveClosureAsserts(boolean remove)
public void setNameAnonymousFunctionsOnly(boolean value)
public void setColorizeErrorOutput(boolean colorizeErrorOutput)
public boolean shouldColorizeErrorOutput()
public void setChainCalls(boolean value)
public void setAcceptConstKeyword(boolean value)
public void enableRuntimeTypeCheck(String logFunction)
public void disableRuntimeTypeCheck()
public void setGenerateExports(boolean generateExports)
public void setCodingConvention(CodingConvention codingConvention)
public CodingConvention getCodingConvention()
public void setDependencyOptions(DependencyOptions options)
public void setManageClosureDependencies(boolean newVal)
public void setManageClosureDependencies(List<String> entryPoints)
public void setSummaryDetailLevel(int summaryDetailLevel)
public void enableExternExports(boolean enabled)
public void setExtraAnnotationNames(Set<String> extraAnnotationNames)
public boolean isExternExportsEnabled()
public void setOutputCharset(String charsetName)
 Charset getOutputCharset()
public void setTweakProcessing(TweakProcessing tweakProcessing)
public TweakProcessing getTweakProcessing()
public void setLanguageIn(LanguageMode languageIn)
public LanguageMode getLanguageIn()
public LanguageMode getLanguageOut()
public void setLooseTypes(boolean looseTypes)
public Object clone() throws CloneNotSupportedException
public void setAliasTransformationHandler(AliasTransformationHandler changes)
public AliasTransformationHandler getAliasTransformationHandler()
public void setErrorHandler(ErrorHandler handler)
public void setInferTypes(boolean enable)
public boolean getInferTypes()
public boolean assumeStrictThis()
public void setAssumeStrictThis(boolean enable)
public void setPropertyInvalidationErrors(Map<String, CheckLevel> propertyInvalidationErrors)
public void setLanguageOut(LanguageMode languageOut)
public void setIdeMode(boolean ideMode)
public void setSaveDataStructures(boolean save)
public void setSkipAllPasses(boolean skipAllPasses)
public void setDevMode(DevMode devMode)
public void setMessageBundle(MessageBundle messageBundle)
public void setCheckSymbols(boolean checkSymbols)
public void setCheckSuspiciousCode(boolean checkSuspiciousCode)
public void setCheckControlStructures(boolean checkControlStructures)
public void setCheckTypes(boolean checkTypes)
public void setCheckMissingGetCssNameBlacklist(String blackList)
public void setFoldConstants(boolean foldConstants)
public void setDeadAssignmentElimination(boolean deadAssignmentElimination)
public void setInlineConstantVars(boolean inlineConstantVars)
public void setInlineFunctions(boolean inlineFunctions)
public void setInlineLocalFunctions(boolean inlineLocalFunctions)
public void setCrossModuleCodeMotion(boolean crossModuleCodeMotion)
public void setCoalesceVariableNames(boolean coalesceVariableNames)
public void setCrossModuleMethodMotion(boolean crossModuleMethodMotion)
public void setInlineGetters(boolean inlineGetters)
public void setInlineVariables(boolean inlineVariables)
public void setInlineLocalVariables(boolean inlineLocalVariables)
public void setFlowSensitiveInlineVariables(boolean enabled)
public void setSmartNameRemoval(boolean smartNameRemoval)
public void setRemoveDeadCode(boolean removeDeadCode)
public void setExtractPrototypeMemberDeclarations(boolean enabled)
public void setRemoveUnusedPrototypeProperties(boolean enabled)
public void setRemoveUnusedPrototypePropertiesInExterns(boolean enabled)
public void setRemoveUnusedVars(boolean removeUnusedVars)
public void setRemoveUnusedLocalVars(boolean removeUnusedLocalVars)
public void setAliasExternals(boolean aliasExternals)
public void setCollapseVariableDeclarations(boolean enabled)
public void setGroupVariableDeclarations(boolean enabled)
public void setCollapseAnonymousFunctions(boolean enabled)
public void setAliasableStrings(Set<String> aliasableStrings)
public void setAliasStringsBlacklist(String aliasStringsBlacklist)
public void setAliasAllStrings(boolean aliasAllStrings)
public void setOutputJsStringUsage(boolean outputJsStringUsage)
public void setConvertToDottedProperties(boolean convertToDottedProperties)
public void setRewriteFunctionExpressions(boolean rewriteFunctionExpressions)
public void setOptimizeParameters(boolean optimizeParameters)
public void setOptimizeReturns(boolean optimizeReturns)
public void setOptimizeCalls(boolean optimizeCalls)
public void setOptimizeArgumentsArray(boolean optimizeArgumentsArray)
public void setVariableRenaming(VariableRenamingPolicy variableRenaming)
public void setPropertyRenaming(PropertyRenamingPolicy propertyRenaming)
public void setLabelRenaming(boolean labelRenaming)
public void setReserveRawExports(boolean reserveRawExports)
public void setGeneratePseudoNames(boolean generatePseudoNames)
public void setRenamePrefix(String renamePrefix)
public void setRenamePrefixNamespace(String renamePrefixNamespace)
public void setAliasKeywords(boolean aliasKeywords)
public void setCollapseProperties(boolean collapseProperties)
public void setDevirtualizePrototypeMethods(boolean devirtualizePrototypeMethods)
public void setComputeFunctionSideEffects(boolean computeFunctionSideEffects)
public void setDebugFunctionSideEffectsPath(String debugFunctionSideEffectsPath)
public void setDisambiguateProperties(boolean disambiguateProperties)
public void setAmbiguateProperties(boolean ambiguateProperties)
public void setAnonymousFunctionNaming(AnonymousFunctionNamingPolicy anonymousFunctionNaming)
public void setInputAnonymousFunctionNamingMap(VariableMap inputMap)
public void setInputVariableMapSerialized(byte[] inputVariableMapSerialized) throws ParseException
public void setInputVariableMap(VariableMap inputVariableMap)
public void setInputPropertyMapSerialized(byte[] inputPropertyMapSerialized) throws ParseException
public void setInputPropertyMap(VariableMap inputPropertyMap)
public void setExportTestFunctions(boolean exportTestFunctions)
public void setRuntimeTypeCheck(boolean runtimeTypeCheck)
public void setRuntimeTypeCheckLogFunction(String runtimeTypeCheckLogFunction)
public void setSyntheticBlockStartMarker(String syntheticBlockStartMarker)
public void setSyntheticBlockEndMarker(String syntheticBlockEndMarker)
public void setLocale(String locale)
public void setMarkAsCompiled(boolean markAsCompiled)
public void setRemoveTryCatchFinally(boolean removeTryCatchFinally)
public void setClosurePass(boolean closurePass)
public void setGatherCssNames(boolean gatherCssNames)
public void setStripTypes(Set<String> stripTypes)
public void setStripNameSuffixes(Set<String> stripNameSuffixes)
public void setStripNamePrefixes(Set<String> stripNamePrefixes)
public void setStripTypePrefixes(Set<String> stripTypePrefixes)
public void setCustomPasses(Multimap<CustomPassExecutionTime, CompilerPass> customPasses)
public void setMarkNoSideEffectCalls(boolean markNoSideEffectCalls)
public void setDefineReplacements(Map<String, Object> defineReplacements)
public void setTweakReplacements(Map<String, Object> tweakReplacements)
public void setMoveFunctionDeclarations(boolean moveFunctionDeclarations)
public void setInstrumentationTemplate(String instrumentationTemplate)
public void setRecordFunctionInformation(boolean recordFunctionInformation)
public void setCssRenamingMap(CssRenamingMap cssRenamingMap)
public void setCssRenamingWhitelist(Set<String> whitelist)
public void setReplaceStringsFunctionDescriptions(List<String> replaceStringsFunctionDescriptions)
public void setReplaceStringsPlaceholderToken(String replaceStringsPlaceholderToken)
public void setReplaceStringsReservedStrings(Set<String> replaceStringsReservedStrings)
public void setReplaceStringsInputMap(VariableMap serializedMap)
public void setPrettyPrint(boolean prettyPrint)
public void setLineBreak(boolean lineBreak)
public void setPreferLineBreakAtEndOfFile(boolean lineBreakAtEnd)
public void setPrintInputDelimiter(boolean printInputDelimiter)
public void setInputDelimiter(String inputDelimiter)
public void setTracer(TracerMode tracer)
public void setErrorFormat(ErrorFormat errorFormat)
public void setWarningsGuard(ComposeWarningsGuard warningsGuard)
public void setLineLengthThreshold(int lineLengthThreshold)
public void setExternExports(boolean externExports)
public void setExternExportsPath(String externExportsPath)
public void setSourceMapOutputPath(String sourceMapOutputPath)
public void setSourceMapDetailLevel(SourceMap.DetailLevel sourceMapDetailLevel)
public void setSourceMapFormat(SourceMap.Format sourceMapFormat)
public void setSourceMapLocationMappings(List<SourceMap.LocationMapping> sourceMapLocationMappings)
public void setTransformAMDToCJSModules(boolean transformAMDToCJSModules)
public void setProcessCommonJSModules(boolean processCommonJSModules)
public void setCommonJSModulePathPrefix(String commonJSModulePathPrefix)
public static LanguageMode fromString(String value)
 boolean isOn()
public boolean isOn()
public boolean shouldStrip()
public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<AliasTransformation> position)
 void addAlias(String alias, String definition)
public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<AliasTransformation> position)
public void addAlias(String alias, String definition)
boolean manageClosureDependencies=Optional[false]
long serialVersionUID=Optional[7L]
LanguageMode languageIn
LanguageMode languageOut
boolean acceptConstKeyword
boolean assumeStrictThis
boolean ideMode
boolean saveDataStructures=Optional[false]
boolean inferTypes
boolean skipAllPasses
boolean nameAnonymousFunctionsOnly
DevMode devMode
DependencyOptions dependencyOptions=Optional[new DependencyOptions()]
MessageBundle messageBundle=Optional[null]
boolean checkSymbols
CheckLevel aggressiveVarCheck
boolean checkSuspiciousCode
boolean checkControlStructures
boolean checkTypes
boolean tightenTypes
CheckLevel reportMissingOverride
CheckLevel reportUnknownTypes
CheckLevel checkRequires
CheckLevel checkProvides
CheckLevel checkGlobalNamesLevel
CheckLevel brokenClosureRequiresLevel
CheckLevel checkGlobalThisLevel
CheckLevel checkMissingGetCssNameLevel
String checkMissingGetCssNameBlacklist
boolean checkCaja
Set<String> extraAnnotationNames
boolean foldConstants
boolean deadAssignmentElimination
boolean inlineConstantVars
boolean inlineFunctions
boolean inlineLocalFunctions
boolean inlineProperties
boolean crossModuleCodeMotion
boolean coalesceVariableNames
boolean crossModuleMethodMotion
boolean inlineGetters
boolean inlineVariables
boolean inlineLocalVariables
boolean flowSensitiveInlineVariables
boolean smartNameRemoval
boolean removeDeadCode
CheckLevel checkUnreachableCode
CheckLevel checkMissingReturn
boolean extractPrototypeMemberDeclarations
boolean removeUnusedPrototypeProperties
boolean removeUnusedPrototypePropertiesInExterns
boolean removeUnusedClassProperties
boolean removeUnusedVars
boolean removeUnusedLocalVars
boolean aliasExternals
String aliasableGlobals
String unaliasableGlobals
boolean collapseVariableDeclarations
boolean groupVariableDeclarations
boolean collapseAnonymousFunctions
Set<String> aliasableStrings
String aliasStringsBlacklist
boolean aliasAllStrings
boolean outputJsStringUsage
boolean convertToDottedProperties
boolean rewriteFunctionExpressions
boolean optimizeParameters
boolean optimizeReturns
boolean optimizeCalls
boolean optimizeArgumentsArray
boolean chainCalls
VariableRenamingPolicy variableRenaming
PropertyRenamingPolicy propertyRenaming
boolean propertyAffinity
boolean labelRenaming
boolean reserveRawExports
boolean shadowVariables
boolean generatePseudoNames
String renamePrefix
String renamePrefixNamespace
boolean aliasKeywords
boolean collapseProperties
boolean collapseObjectLiterals
boolean collapsePropertiesOnExternTypes
boolean devirtualizePrototypeMethods
boolean computeFunctionSideEffects
String debugFunctionSideEffectsPath
boolean disambiguateProperties
boolean ambiguateProperties
AnonymousFunctionNamingPolicy anonymousFunctionNaming
VariableMap inputAnonymousFunctionNamingMap
VariableMap inputVariableMap
VariableMap inputPropertyMap
boolean exportTestFunctions
boolean specializeInitialModule
boolean replaceMessagesWithChromeI18n
String tcProjectId
boolean runtimeTypeCheck
String runtimeTypeCheckLogFunction
CodingConvention codingConvention
boolean ignoreCajaProperties
String syntheticBlockStartMarker
String syntheticBlockEndMarker
String locale
boolean markAsCompiled
boolean removeTryCatchFinally
boolean closurePass
boolean jqueryPass
boolean removeAbstractMethods
boolean removeClosureAsserts
boolean gatherCssNames
Set<String> stripTypes
Set<String> stripNameSuffixes
Set<String> stripNamePrefixes
Set<String> stripTypePrefixes
Multimap<CustomPassExecutionTime, CompilerPass> customPasses
boolean markNoSideEffectCalls
Map<String, Object> defineReplacements
TweakProcessing tweakProcessing
Map<String, Object> tweakReplacements
boolean moveFunctionDeclarations
String instrumentationTemplate
String appNameStr
boolean recordFunctionInformation
boolean generateExports
CssRenamingMap cssRenamingMap
Set<String> cssRenamingWhitelist
boolean processObjectPropertyString
boolean replaceIdGenerators=Optional[true]
Set<String> idGenerators
String idGeneratorsMapSerialized
List<String> replaceStringsFunctionDescriptions
String replaceStringsPlaceholderToken
Set<String> replaceStringsReservedStrings
VariableMap replaceStringsInputMap
Map<String, CheckLevel> propertyInvalidationErrors
boolean transformAMDToCJSModules=Optional[false]
boolean processCommonJSModules=Optional[false]
String commonJSModulePathPrefix=Optional[ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX]
boolean prettyPrint
boolean lineBreak
boolean preferLineBreakAtEndOfFile
boolean printInputDelimiter
String inputDelimiter=Optional["// Input %num%"]
boolean preferSingleQuotes
boolean trustedStrings
String reportPath
TracerMode tracer
boolean colorizeErrorOutput
ErrorFormat errorFormat
ComposeWarningsGuard warningsGuard=Optional[new ComposeWarningsGuard()]
int summaryDetailLevel=Optional[1]
int lineLengthThreshold=Optional[CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD]
boolean externExports
String externExportsPath
String nameReferenceReportPath
String nameReferenceGraphPath
String sourceMapOutputPath
SourceMap.DetailLevel sourceMapDetailLevel=Optional[SourceMap.DetailLevel.SYMBOLS]
SourceMap.Format sourceMapFormat=Optional[SourceMap.Format.DEFAULT]
List<SourceMap.LocationMapping> sourceMapLocationMappings=Optional[Collections.emptyList()]
String outputCharset
boolean looseTypes
boolean protectHiddenSideEffects
AliasTransformationHandler aliasHandler
ErrorHandler errorHandler
AliasTransformationHandler NULL_ALIAS_TRANSFORMATION_HANDLER=Optional[new NullAliasTransformationHandler()]
