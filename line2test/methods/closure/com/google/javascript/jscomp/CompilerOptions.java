public CompilerOptions() { [EOL]     languageIn = LanguageMode.ECMASCRIPT3; [EOL]     acceptConstKeyword = false; [EOL]     skipAllPasses = false; [EOL]     nameAnonymousFunctionsOnly = false; [EOL]     devMode = DevMode.OFF; [EOL]     checkSymbols = false; [EOL]     aggressiveVarCheck = CheckLevel.OFF; [EOL]     checkSuspiciousCode = false; [EOL]     checkControlStructures = false; [EOL]     checkTypes = false; [EOL]     tightenTypes = false; [EOL]     reportMissingOverride = CheckLevel.OFF; [EOL]     reportUnknownTypes = CheckLevel.OFF; [EOL]     checkRequires = CheckLevel.OFF; [EOL]     checkProvides = CheckLevel.OFF; [EOL]     checkGlobalNamesLevel = CheckLevel.OFF; [EOL]     brokenClosureRequiresLevel = CheckLevel.ERROR; [EOL]     checkGlobalThisLevel = CheckLevel.OFF; [EOL]     checkUnreachableCode = CheckLevel.OFF; [EOL]     checkMissingReturn = CheckLevel.OFF; [EOL]     checkMissingGetCssNameLevel = CheckLevel.OFF; [EOL]     checkMissingGetCssNameBlacklist = null; [EOL]     checkCaja = false; [EOL]     computeFunctionSideEffects = false; [EOL]     chainCalls = false; [EOL]     extraAnnotationNames = null; [EOL]     foldConstants = false; [EOL]     coalesceVariableNames = false; [EOL]     deadAssignmentElimination = false; [EOL]     inlineConstantVars = false; [EOL]     inlineFunctions = false; [EOL]     inlineLocalFunctions = false; [EOL]     assumeStrictThis = false; [EOL]     inlineProperties = false; [EOL]     crossModuleCodeMotion = false; [EOL]     crossModuleMethodMotion = false; [EOL]     inlineGetters = false; [EOL]     inlineVariables = false; [EOL]     inlineLocalVariables = false; [EOL]     smartNameRemoval = false; [EOL]     removeDeadCode = false; [EOL]     extractPrototypeMemberDeclarations = false; [EOL]     removeUnusedPrototypeProperties = false; [EOL]     removeUnusedPrototypePropertiesInExterns = false; [EOL]     removeUnusedClassProperties = false; [EOL]     removeUnusedVars = false; [EOL]     removeUnusedLocalVars = false; [EOL]     aliasExternals = false; [EOL]     collapseVariableDeclarations = false; [EOL]     groupVariableDeclarations = false; [EOL]     collapseAnonymousFunctions = false; [EOL]     aliasableStrings = Collections.emptySet(); [EOL]     aliasStringsBlacklist = ""; [EOL]     aliasAllStrings = false; [EOL]     outputJsStringUsage = false; [EOL]     convertToDottedProperties = false; [EOL]     rewriteFunctionExpressions = false; [EOL]     optimizeParameters = false; [EOL]     optimizeReturns = false; [EOL]     variableRenaming = VariableRenamingPolicy.OFF; [EOL]     propertyRenaming = PropertyRenamingPolicy.OFF; [EOL]     propertyAffinity = false; [EOL]     labelRenaming = false; [EOL]     generatePseudoNames = false; [EOL]     shadowVariables = false; [EOL]     renamePrefix = null; [EOL]     aliasKeywords = false; [EOL]     collapseProperties = false; [EOL]     collapsePropertiesOnExternTypes = false; [EOL]     collapseObjectLiterals = false; [EOL]     devirtualizePrototypeMethods = false; [EOL]     disambiguateProperties = false; [EOL]     ambiguateProperties = false; [EOL]     anonymousFunctionNaming = AnonymousFunctionNamingPolicy.OFF; [EOL]     exportTestFunctions = false; [EOL]     runtimeTypeCheck = false; [EOL]     runtimeTypeCheckLogFunction = null; [EOL]     ignoreCajaProperties = false; [EOL]     syntheticBlockStartMarker = null; [EOL]     syntheticBlockEndMarker = null; [EOL]     locale = null; [EOL]     markAsCompiled = false; [EOL]     removeTryCatchFinally = false; [EOL]     closurePass = false; [EOL]     jqueryPass = false; [EOL]     removeAbstractMethods = true; [EOL]     removeClosureAsserts = false; [EOL]     stripTypes = Collections.emptySet(); [EOL]     stripNameSuffixes = Collections.emptySet(); [EOL]     stripNamePrefixes = Collections.emptySet(); [EOL]     stripTypePrefixes = Collections.emptySet(); [EOL]     customPasses = null; [EOL]     markNoSideEffectCalls = false; [EOL]     defineReplacements = Maps.newHashMap(); [EOL]     tweakProcessing = TweakProcessing.OFF; [EOL]     tweakReplacements = Maps.newHashMap(); [EOL]     moveFunctionDeclarations = false; [EOL]     instrumentationTemplate = null; [EOL]     appNameStr = ""; [EOL]     recordFunctionInformation = false; [EOL]     generateExports = false; [EOL]     cssRenamingMap = null; [EOL]     cssRenamingWhitelist = null; [EOL]     processObjectPropertyString = false; [EOL]     idGenerators = Collections.emptySet(); [EOL]     replaceStringsFunctionDescriptions = Collections.emptyList(); [EOL]     replaceStringsPlaceholderToken = ""; [EOL]     replaceStringsReservedStrings = Collections.emptySet(); [EOL]     propertyInvalidationErrors = Maps.newHashMap(); [EOL]     printInputDelimiter = false; [EOL]     prettyPrint = false; [EOL]     lineBreak = false; [EOL]     preferLineBreakAtEndOfFile = false; [EOL]     reportPath = null; [EOL]     tracer = TracerMode.OFF; [EOL]     colorizeErrorOutput = false; [EOL]     errorFormat = ErrorFormat.SINGLELINE; [EOL]     debugFunctionSideEffectsPath = null; [EOL]     externExports = false; [EOL]     nameReferenceReportPath = null; [EOL]     nameReferenceGraphPath = null; [EOL]     aliasHandler = NULL_ALIAS_TRANSFORMATION_HANDLER; [EOL]     errorHandler = null; [EOL] } <line_num>: 841,980
public void setAggressiveVarCheck(CheckLevel level) { [EOL]     this.aggressiveVarCheck = level; [EOL] } <line_num>: 139,141
public void setTightenTypes(boolean tighten) { [EOL]     tightenTypes = tighten; [EOL] } <line_num>: 155,157
public void setReportMissingOverride(CheckLevel level) { [EOL]     reportMissingOverride = level; [EOL] } <line_num>: 165,167
public void setReportUnknownTypes(CheckLevel level) { [EOL]     reportUnknownTypes = level; [EOL] } <line_num>: 172,174
public void setCheckRequires(CheckLevel level) { [EOL]     checkRequires = level; [EOL] } <line_num>: 179,181
public void setCheckProvides(CheckLevel level) { [EOL]     checkProvides = level; [EOL] } <line_num>: 186,188
public void setCheckGlobalNamesLevel(CheckLevel level) { [EOL]     checkGlobalNamesLevel = level; [EOL] } <line_num>: 196,198
public void setBrokenClosureRequiresLevel(CheckLevel level) { [EOL]     brokenClosureRequiresLevel = level; [EOL] } <line_num>: 203,205
public void setCheckGlobalThisLevel(CheckLevel level) { [EOL]     this.checkGlobalThisLevel = level; [EOL] } <line_num>: 217,219
public void setCheckMissingGetCssNameLevel(CheckLevel level) { [EOL]     this.checkMissingGetCssNameLevel = level; [EOL] } <line_num>: 227,229
public void setCheckCaja(boolean check) { [EOL]     checkCaja = check; [EOL] } <line_num>: 239,241
public void setCheckUnreachableCode(CheckLevel level) { [EOL]     this.checkUnreachableCode = level; [EOL] } <line_num>: 303,305
public void setCheckMissingReturn(CheckLevel level) { [EOL]     this.checkMissingReturn = level; [EOL] } <line_num>: 310,312
public void setAliasableGlobals(String names) { [EOL]     aliasableGlobals = names; [EOL] } <line_num>: 342,344
public void setUnaliasableGlobals(String names) { [EOL]     unaliasableGlobals = names; [EOL] } <line_num>: 352,354
public void setCollapseObjectLiterals(boolean enabled) { [EOL]     collapseObjectLiterals = enabled; [EOL] } <line_num>: 466,468
public void setSpecializeInitialModule(boolean enabled) { [EOL]     specializeInitialModule = enabled; [EOL] } <line_num>: 517,519
public void setReplaceMessagesWithChromeI18n(boolean replaceMessagesWithChromeI18n, String tcProjectId) { [EOL]     if (replaceMessagesWithChromeI18n && messageBundle != null && !(messageBundle instanceof EmptyMessageBundle)) { [EOL]         throw new RuntimeException("When replacing messages with " + "chrome.i18n.getMessage, a message bundle should not be specified."); [EOL]     } [EOL]     this.replaceMessagesWithChromeI18n = replaceMessagesWithChromeI18n; [EOL]     this.tcProjectId = tcProjectId; [EOL] } <line_num>: 532,544
public void setIgnoreCajaProperties(boolean enabled) { [EOL]     ignoreCajaProperties = enabled; [EOL] } <line_num>: 562,564
public void setAppNameStr(String appNameStr) { [EOL]     this.appNameStr = appNameStr; [EOL] } <line_num>: 634,636
public void setPreferSingleQuotes(boolean enabled) { [EOL]     this.preferSingleQuotes = enabled; [EOL] } <line_num>: 714,716
public void setTrustedStrings(boolean yes) { [EOL]     trustedStrings = yes; [EOL] } <line_num>: 726,728
public void setReportPath(String reportPath) { [EOL]     this.reportPath = reportPath; [EOL] } <line_num>: 733,735
public TracerMode getTracerMode() { [EOL]     return tracer; [EOL] } <line_num>: 739,741
public void setTracerMode(TracerMode mode) { [EOL]     tracer = mode; [EOL] } <line_num>: 743,745
public void setNameReferenceReportPath(String filePath) { [EOL]     nameReferenceReportPath = filePath; [EOL] } <line_num>: 773,775
public void setNameReferenceGraphPath(String filePath) { [EOL]     nameReferenceGraphPath = filePath; [EOL] } <line_num>: 780,782
public void setProtectHiddenSideEffects(boolean enable) { [EOL]     this.protectHiddenSideEffects = enable; [EOL] } <line_num>: 821,823
public boolean isRemoveUnusedClassProperties() { [EOL]     return removeUnusedClassProperties; [EOL] } <line_num>: 985,987
public void setRemoveUnusedClassProperties(boolean removeUnusedClassProperties) { [EOL]     this.removeUnusedClassProperties = removeUnusedClassProperties; [EOL] } <line_num>: 993,995
public Map<String, Node> getDefineReplacements() { [EOL]     return getReplacementsHelper(defineReplacements); [EOL] } <line_num>: 1000,1002
public Map<String, Node> getTweakReplacements() { [EOL]     return getReplacementsHelper(tweakReplacements); [EOL] } <line_num>: 1007,1009
private static Map<String, Node> getReplacementsHelper(Map<String, Object> source) { [EOL]     Map<String, Node> map = Maps.newHashMap(); [EOL]     for (Map.Entry<String, Object> entry : source.entrySet()) { [EOL]         String name = entry.getKey(); [EOL]         Object value = entry.getValue(); [EOL]         if (value instanceof Boolean) { [EOL]             map.put(name, NodeUtil.booleanNode(((Boolean) value).booleanValue())); [EOL]         } else if (value instanceof Integer) { [EOL]             map.put(name, IR.number(((Integer) value).intValue())); [EOL]         } else if (value instanceof Double) { [EOL]             map.put(name, IR.number(((Double) value).doubleValue())); [EOL]         } else { [EOL]             Preconditions.checkState(value instanceof String); [EOL]             map.put(name, IR.string((String) value)); [EOL]         } [EOL]     } [EOL]     return map; [EOL] } <line_num>: 1014,1032
public void setDefineToBooleanLiteral(String defineName, boolean value) { [EOL]     defineReplacements.put(defineName, new Boolean(value)); [EOL] } <line_num>: 1038,1040
public void setDefineToStringLiteral(String defineName, String value) { [EOL]     defineReplacements.put(defineName, value); [EOL] } <line_num>: 1046,1048
public void setDefineToNumberLiteral(String defineName, int value) { [EOL]     defineReplacements.put(defineName, new Integer(value)); [EOL] } <line_num>: 1054,1056
public void setDefineToDoubleLiteral(String defineName, double value) { [EOL]     defineReplacements.put(defineName, new Double(value)); [EOL] } <line_num>: 1062,1064
public void setTweakToBooleanLiteral(String tweakId, boolean value) { [EOL]     tweakReplacements.put(tweakId, new Boolean(value)); [EOL] } <line_num>: 1070,1072
public void setTweakToStringLiteral(String tweakId, String value) { [EOL]     tweakReplacements.put(tweakId, value); [EOL] } <line_num>: 1078,1080
public void setTweakToNumberLiteral(String tweakId, int value) { [EOL]     tweakReplacements.put(tweakId, new Integer(value)); [EOL] } <line_num>: 1086,1088
public void setTweakToDoubleLiteral(String tweakId, double value) { [EOL]     tweakReplacements.put(tweakId, new Double(value)); [EOL] } <line_num>: 1094,1096
public void skipAllCompilerPasses() { [EOL]     skipAllPasses = true; [EOL] } <line_num>: 1101,1103
boolean enables(DiagnosticGroup type) { [EOL]     return warningsGuard.enables(type); [EOL] } <line_num>: 1109,1111
boolean disables(DiagnosticGroup type) { [EOL]     return warningsGuard.disables(type); [EOL] } <line_num>: 1117,1119
public void setWarningLevel(DiagnosticGroup type, CheckLevel level) { [EOL]     addWarningsGuard(new DiagnosticGroupWarningsGuard(type, level)); [EOL] } <line_num>: 1124,1126
WarningsGuard getWarningsGuard() { [EOL]     return warningsGuard; [EOL] } <line_num>: 1128,1130
public void resetWarningsGuard() { [EOL]     warningsGuard = new ComposeWarningsGuard(); [EOL] } <line_num>: 1135,1137
void useEmergencyFailSafe() { [EOL]     warningsGuard = warningsGuard.makeEmergencyFailSafeGuard(); [EOL] } <line_num>: 1143,1145
public void addWarningsGuard(WarningsGuard guard) { [EOL]     warningsGuard.addGuard(guard); [EOL] } <line_num>: 1150,1152
public void setRenamingPolicy(VariableRenamingPolicy newVariablePolicy, PropertyRenamingPolicy newPropertyPolicy) { [EOL]     this.variableRenaming = newVariablePolicy; [EOL]     this.propertyRenaming = newPropertyPolicy; [EOL] } <line_num>: 1159,1163
public void setPropertyAffinity(boolean useAffinity) { [EOL]     this.propertyAffinity = useAffinity; [EOL] } <line_num>: 1165,1167
public void setShadowVariables(boolean shadow) { [EOL]     this.shadowVariables = shadow; [EOL] } <line_num>: 1170,1172
public void setCollapsePropertiesOnExternTypes(boolean collapse) { [EOL]     collapsePropertiesOnExternTypes = collapse; [EOL] } <line_num>: 1179,1181
public void setProcessObjectPropertyString(boolean process) { [EOL]     processObjectPropertyString = process; [EOL] } <line_num>: 1186,1188
public void setReplaceIdGenerators(boolean replaceIdGenerators) { [EOL]     this.replaceIdGenerators = replaceIdGenerators; [EOL] } <line_num>: 1193,1195
public void setIdGenerators(Set<String> idGenerators) { [EOL]     this.idGenerators = Sets.newHashSet(idGenerators); [EOL] } <line_num>: 1200,1202
public void setIdGeneratorsMap(String previousMappings) { [EOL]     this.idGeneratorsMapSerialized = previousMappings; [EOL] } <line_num>: 1209,1211
public void setInlineFunctions(Reach reach) { [EOL]     switch(reach) { [EOL]         case ALL: [EOL]             this.inlineFunctions = true; [EOL]             this.inlineLocalFunctions = true; [EOL]             break; [EOL]         case LOCAL_ONLY: [EOL]             this.inlineFunctions = false; [EOL]             this.inlineLocalFunctions = true; [EOL]             break; [EOL]         case NONE: [EOL]             this.inlineFunctions = false; [EOL]             this.inlineLocalFunctions = false; [EOL]             break; [EOL]         default: [EOL]             throw new IllegalStateException("unexpected"); [EOL]     } [EOL] } <line_num>: 1216,1233
public void setInlineVariables(Reach reach) { [EOL]     switch(reach) { [EOL]         case ALL: [EOL]             this.inlineVariables = true; [EOL]             this.inlineLocalVariables = true; [EOL]             break; [EOL]         case LOCAL_ONLY: [EOL]             this.inlineVariables = false; [EOL]             this.inlineLocalVariables = true; [EOL]             break; [EOL]         case NONE: [EOL]             this.inlineVariables = false; [EOL]             this.inlineLocalVariables = false; [EOL]             break; [EOL]         default: [EOL]             throw new IllegalStateException("unexpected"); [EOL]     } [EOL] } <line_num>: 1238,1255
public void setInlineProperties(boolean enable) { [EOL]     inlineProperties = enable; [EOL] } <line_num>: 1260,1262
@Deprecated [EOL] public void setRemoveUnusedVariable(Reach reach) { [EOL]     setRemoveUnusedVariables(reach); [EOL] } <line_num>: 1267,1270
public void setRemoveUnusedVariables(Reach reach) { [EOL]     switch(reach) { [EOL]         case ALL: [EOL]             this.removeUnusedVars = true; [EOL]             this.removeUnusedLocalVars = true; [EOL]             break; [EOL]         case LOCAL_ONLY: [EOL]             this.removeUnusedVars = false; [EOL]             this.removeUnusedLocalVars = true; [EOL]             break; [EOL]         case NONE: [EOL]             this.removeUnusedVars = false; [EOL]             this.removeUnusedLocalVars = false; [EOL]             break; [EOL]         default: [EOL]             throw new IllegalStateException("unexpected"); [EOL]     } [EOL] } <line_num>: 1275,1292
public void setReplaceStringsConfiguration(String placeholderToken, List<String> functionDescriptors) { [EOL]     this.replaceStringsPlaceholderToken = placeholderToken; [EOL]     this.replaceStringsFunctionDescriptions = Lists.newArrayList(functionDescriptors); [EOL] } <line_num>: 1297,1302
@Deprecated [EOL] public void setRewriteNewDateGoogNow(boolean rewrite) { [EOL] } <line_num>: 1304,1306
public void setRemoveAbstractMethods(boolean remove) { [EOL]     this.removeAbstractMethods = remove; [EOL] } <line_num>: 1308,1310
public void setRemoveClosureAsserts(boolean remove) { [EOL]     this.removeClosureAsserts = remove; [EOL] } <line_num>: 1312,1314
public void setNameAnonymousFunctionsOnly(boolean value) { [EOL]     this.nameAnonymousFunctionsOnly = value; [EOL] } <line_num>: 1319,1321
public void setColorizeErrorOutput(boolean colorizeErrorOutput) { [EOL]     this.colorizeErrorOutput = colorizeErrorOutput; [EOL] } <line_num>: 1323,1325
public boolean shouldColorizeErrorOutput() { [EOL]     return colorizeErrorOutput; [EOL] } <line_num>: 1327,1329
public void setChainCalls(boolean value) { [EOL]     this.chainCalls = value; [EOL] } <line_num>: 1334,1336
public void setAcceptConstKeyword(boolean value) { [EOL]     this.acceptConstKeyword = value; [EOL] } <line_num>: 1341,1343
public void enableRuntimeTypeCheck(String logFunction) { [EOL]     this.runtimeTypeCheck = true; [EOL]     this.runtimeTypeCheckLogFunction = logFunction; [EOL] } <line_num>: 1351,1354
public void disableRuntimeTypeCheck() { [EOL]     this.runtimeTypeCheck = false; [EOL] } <line_num>: 1356,1358
public void setGenerateExports(boolean generateExports) { [EOL]     this.generateExports = generateExports; [EOL] } <line_num>: 1360,1362
public void setCodingConvention(CodingConvention codingConvention) { [EOL]     this.codingConvention = codingConvention; [EOL] } <line_num>: 1364,1366
public CodingConvention getCodingConvention() { [EOL]     return codingConvention; [EOL] } <line_num>: 1368,1370
public void setDependencyOptions(DependencyOptions options) { [EOL]     Preconditions.checkNotNull(options); [EOL]     this.dependencyOptions = options; [EOL] } <line_num>: 1376,1379
public void setManageClosureDependencies(boolean newVal) { [EOL]     dependencyOptions.setDependencySorting(newVal || dependencyOptions.shouldSortDependencies()); [EOL]     dependencyOptions.setDependencyPruning(newVal || dependencyOptions.shouldPruneDependencies()); [EOL]     dependencyOptions.setMoocherDropping(false); [EOL]     manageClosureDependencies = newVal; [EOL] } <line_num>: 1385,1392
public void setManageClosureDependencies(List<String> entryPoints) { [EOL]     Preconditions.checkNotNull(entryPoints); [EOL]     setManageClosureDependencies(true); [EOL]     dependencyOptions.setEntryPoints(entryPoints); [EOL] } <line_num>: 1403,1407
public void setSummaryDetailLevel(int summaryDetailLevel) { [EOL]     this.summaryDetailLevel = summaryDetailLevel; [EOL] } <line_num>: 1416,1418
@Deprecated [EOL] public void enableExternExports(boolean enabled) { [EOL]     this.externExports = enabled; [EOL] } <line_num>: 1423,1426
public void setExtraAnnotationNames(Set<String> extraAnnotationNames) { [EOL]     this.extraAnnotationNames = Sets.newHashSet(extraAnnotationNames); [EOL] } <line_num>: 1428,1430
public boolean isExternExportsEnabled() { [EOL]     return externExports; [EOL] } <line_num>: 1432,1434
public void setOutputCharset(String charsetName) { [EOL]     this.outputCharset = charsetName; [EOL] } <line_num>: 1439,1441
Charset getOutputCharset() { [EOL]     return outputCharset == null ? null : Charset.forName(outputCharset); [EOL] } <line_num>: 1446,1448
public void setTweakProcessing(TweakProcessing tweakProcessing) { [EOL]     this.tweakProcessing = tweakProcessing; [EOL] } <line_num>: 1453,1455
public TweakProcessing getTweakProcessing() { [EOL]     return tweakProcessing; [EOL] } <line_num>: 1457,1459
public void setLanguageIn(LanguageMode languageIn) { [EOL]     this.languageIn = languageIn; [EOL]     this.languageOut = languageIn; [EOL] } <line_num>: 1464,1467
public LanguageMode getLanguageIn() { [EOL]     return languageIn; [EOL] } <line_num>: 1469,1471
public LanguageMode getLanguageOut() { [EOL]     return languageOut; [EOL] } <line_num>: 1473,1475
public void setLooseTypes(boolean looseTypes) { [EOL]     this.looseTypes = looseTypes; [EOL] } <line_num>: 1484,1486
@Override [EOL] public Object clone() throws CloneNotSupportedException { [EOL]     CompilerOptions clone = (CompilerOptions) super.clone(); [EOL]     return clone; [EOL] } <line_num>: 1488,1493
public void setAliasTransformationHandler(AliasTransformationHandler changes) { [EOL]     this.aliasHandler = changes; [EOL] } <line_num>: 1495,1498
public AliasTransformationHandler getAliasTransformationHandler() { [EOL]     return this.aliasHandler; [EOL] } <line_num>: 1500,1502
public void setErrorHandler(ErrorHandler handler) { [EOL]     this.errorHandler = handler; [EOL] } <line_num>: 1516,1518
public void setInferTypes(boolean enable) { [EOL]     inferTypes = enable; [EOL] } <line_num>: 1524,1526
public boolean getInferTypes() { [EOL]     return inferTypes; [EOL] } <line_num>: 1532,1534
public boolean assumeStrictThis() { [EOL]     return assumeStrictThis; [EOL] } <line_num>: 1539,1541
public void setAssumeStrictThis(boolean enable) { [EOL]     this.assumeStrictThis = enable; [EOL] } <line_num>: 1546,1548
public void setPropertyInvalidationErrors(Map<String, CheckLevel> propertyInvalidationErrors) { [EOL]     this.propertyInvalidationErrors = Maps.newHashMap(propertyInvalidationErrors); [EOL] } <line_num>: 1554,1558
public void setLanguageOut(LanguageMode languageOut) { [EOL]     this.languageOut = languageOut; [EOL] } <line_num>: 1560,1562
public void setIdeMode(boolean ideMode) { [EOL]     this.ideMode = ideMode; [EOL] } <line_num>: 1564,1566
public void setSaveDataStructures(boolean save) { [EOL]     this.saveDataStructures = save; [EOL] } <line_num>: 1572,1574
public void setSkipAllPasses(boolean skipAllPasses) { [EOL]     this.skipAllPasses = skipAllPasses; [EOL] } <line_num>: 1576,1578
public void setDevMode(DevMode devMode) { [EOL]     this.devMode = devMode; [EOL] } <line_num>: 1580,1582
public void setMessageBundle(MessageBundle messageBundle) { [EOL]     this.messageBundle = messageBundle; [EOL] } <line_num>: 1584,1586
public void setCheckSymbols(boolean checkSymbols) { [EOL]     this.checkSymbols = checkSymbols; [EOL] } <line_num>: 1588,1590
public void setCheckSuspiciousCode(boolean checkSuspiciousCode) { [EOL]     this.checkSuspiciousCode = checkSuspiciousCode; [EOL] } <line_num>: 1592,1594
public void setCheckControlStructures(boolean checkControlStructures) { [EOL]     this.checkControlStructures = checkControlStructures; [EOL] } <line_num>: 1596,1598
public void setCheckTypes(boolean checkTypes) { [EOL]     this.checkTypes = checkTypes; [EOL] } <line_num>: 1600,1602
public void setCheckMissingGetCssNameBlacklist(String blackList) { [EOL]     this.checkMissingGetCssNameBlacklist = blackList; [EOL] } <line_num>: 1604,1606
public void setFoldConstants(boolean foldConstants) { [EOL]     this.foldConstants = foldConstants; [EOL] } <line_num>: 1608,1610
public void setDeadAssignmentElimination(boolean deadAssignmentElimination) { [EOL]     this.deadAssignmentElimination = deadAssignmentElimination; [EOL] } <line_num>: 1612,1614
public void setInlineConstantVars(boolean inlineConstantVars) { [EOL]     this.inlineConstantVars = inlineConstantVars; [EOL] } <line_num>: 1616,1618
public void setInlineFunctions(boolean inlineFunctions) { [EOL]     this.inlineFunctions = inlineFunctions; [EOL] } <line_num>: 1620,1622
public void setInlineLocalFunctions(boolean inlineLocalFunctions) { [EOL]     this.inlineLocalFunctions = inlineLocalFunctions; [EOL] } <line_num>: 1624,1626
public void setCrossModuleCodeMotion(boolean crossModuleCodeMotion) { [EOL]     this.crossModuleCodeMotion = crossModuleCodeMotion; [EOL] } <line_num>: 1628,1630
public void setCoalesceVariableNames(boolean coalesceVariableNames) { [EOL]     this.coalesceVariableNames = coalesceVariableNames; [EOL] } <line_num>: 1632,1634
public void setCrossModuleMethodMotion(boolean crossModuleMethodMotion) { [EOL]     this.crossModuleMethodMotion = crossModuleMethodMotion; [EOL] } <line_num>: 1636,1638
public void setInlineGetters(boolean inlineGetters) { [EOL]     this.inlineGetters = inlineGetters; [EOL] } <line_num>: 1640,1642
public void setInlineVariables(boolean inlineVariables) { [EOL]     this.inlineVariables = inlineVariables; [EOL] } <line_num>: 1644,1646
public void setInlineLocalVariables(boolean inlineLocalVariables) { [EOL]     this.inlineLocalVariables = inlineLocalVariables; [EOL] } <line_num>: 1648,1650
public void setFlowSensitiveInlineVariables(boolean enabled) { [EOL]     this.flowSensitiveInlineVariables = enabled; [EOL] } <line_num>: 1652,1654
public void setSmartNameRemoval(boolean smartNameRemoval) { [EOL]     this.smartNameRemoval = smartNameRemoval; [EOL] } <line_num>: 1656,1658
public void setRemoveDeadCode(boolean removeDeadCode) { [EOL]     this.removeDeadCode = removeDeadCode; [EOL] } <line_num>: 1660,1662
public void setExtractPrototypeMemberDeclarations(boolean enabled) { [EOL]     this.extractPrototypeMemberDeclarations = enabled; [EOL] } <line_num>: 1664,1666
public void setRemoveUnusedPrototypeProperties(boolean enabled) { [EOL]     this.removeUnusedPrototypeProperties = enabled; [EOL] } <line_num>: 1668,1670
public void setRemoveUnusedPrototypePropertiesInExterns(boolean enabled) { [EOL]     this.removeUnusedPrototypePropertiesInExterns = enabled; [EOL] } <line_num>: 1672,1675
public void setRemoveUnusedVars(boolean removeUnusedVars) { [EOL]     this.removeUnusedVars = removeUnusedVars; [EOL] } <line_num>: 1677,1679
public void setRemoveUnusedLocalVars(boolean removeUnusedLocalVars) { [EOL]     this.removeUnusedLocalVars = removeUnusedLocalVars; [EOL] } <line_num>: 1681,1683
public void setAliasExternals(boolean aliasExternals) { [EOL]     this.aliasExternals = aliasExternals; [EOL] } <line_num>: 1685,1687
public void setCollapseVariableDeclarations(boolean enabled) { [EOL]     this.collapseVariableDeclarations = enabled; [EOL] } <line_num>: 1689,1691
public void setGroupVariableDeclarations(boolean enabled) { [EOL]     this.groupVariableDeclarations = enabled; [EOL] } <line_num>: 1693,1695
public void setCollapseAnonymousFunctions(boolean enabled) { [EOL]     this.collapseAnonymousFunctions = enabled; [EOL] } <line_num>: 1697,1699
public void setAliasableStrings(Set<String> aliasableStrings) { [EOL]     this.aliasableStrings = aliasableStrings; [EOL] } <line_num>: 1701,1703
public void setAliasStringsBlacklist(String aliasStringsBlacklist) { [EOL]     this.aliasStringsBlacklist = aliasStringsBlacklist; [EOL] } <line_num>: 1705,1707
public void setAliasAllStrings(boolean aliasAllStrings) { [EOL]     this.aliasAllStrings = aliasAllStrings; [EOL] } <line_num>: 1709,1711
public void setOutputJsStringUsage(boolean outputJsStringUsage) { [EOL]     this.outputJsStringUsage = outputJsStringUsage; [EOL] } <line_num>: 1713,1715
public void setConvertToDottedProperties(boolean convertToDottedProperties) { [EOL]     this.convertToDottedProperties = convertToDottedProperties; [EOL] } <line_num>: 1717,1719
public void setRewriteFunctionExpressions(boolean rewriteFunctionExpressions) { [EOL]     this.rewriteFunctionExpressions = rewriteFunctionExpressions; [EOL] } <line_num>: 1721,1723
public void setOptimizeParameters(boolean optimizeParameters) { [EOL]     this.optimizeParameters = optimizeParameters; [EOL] } <line_num>: 1725,1727
public void setOptimizeReturns(boolean optimizeReturns) { [EOL]     this.optimizeReturns = optimizeReturns; [EOL] } <line_num>: 1729,1731
public void setOptimizeCalls(boolean optimizeCalls) { [EOL]     this.optimizeCalls = optimizeCalls; [EOL] } <line_num>: 1733,1735
public void setOptimizeArgumentsArray(boolean optimizeArgumentsArray) { [EOL]     this.optimizeArgumentsArray = optimizeArgumentsArray; [EOL] } <line_num>: 1737,1739
public void setVariableRenaming(VariableRenamingPolicy variableRenaming) { [EOL]     this.variableRenaming = variableRenaming; [EOL] } <line_num>: 1741,1743
public void setPropertyRenaming(PropertyRenamingPolicy propertyRenaming) { [EOL]     this.propertyRenaming = propertyRenaming; [EOL] } <line_num>: 1745,1747
public void setLabelRenaming(boolean labelRenaming) { [EOL]     this.labelRenaming = labelRenaming; [EOL] } <line_num>: 1749,1751
public void setReserveRawExports(boolean reserveRawExports) { [EOL]     this.reserveRawExports = reserveRawExports; [EOL] } <line_num>: 1753,1755
public void setGeneratePseudoNames(boolean generatePseudoNames) { [EOL]     this.generatePseudoNames = generatePseudoNames; [EOL] } <line_num>: 1757,1759
public void setRenamePrefix(String renamePrefix) { [EOL]     this.renamePrefix = renamePrefix; [EOL] } <line_num>: 1761,1763
public void setRenamePrefixNamespace(String renamePrefixNamespace) { [EOL]     this.renamePrefixNamespace = renamePrefixNamespace; [EOL] } <line_num>: 1765,1767
public void setAliasKeywords(boolean aliasKeywords) { [EOL]     this.aliasKeywords = aliasKeywords; [EOL] } <line_num>: 1769,1771
public void setCollapseProperties(boolean collapseProperties) { [EOL]     this.collapseProperties = collapseProperties; [EOL] } <line_num>: 1773,1775
public void setDevirtualizePrototypeMethods(boolean devirtualizePrototypeMethods) { [EOL]     this.devirtualizePrototypeMethods = devirtualizePrototypeMethods; [EOL] } <line_num>: 1777,1779
public void setComputeFunctionSideEffects(boolean computeFunctionSideEffects) { [EOL]     this.computeFunctionSideEffects = computeFunctionSideEffects; [EOL] } <line_num>: 1781,1783
public void setDebugFunctionSideEffectsPath(String debugFunctionSideEffectsPath) { [EOL]     this.debugFunctionSideEffectsPath = debugFunctionSideEffectsPath; [EOL] } <line_num>: 1785,1787
public void setDisambiguateProperties(boolean disambiguateProperties) { [EOL]     this.disambiguateProperties = disambiguateProperties; [EOL] } <line_num>: 1789,1791
public void setAmbiguateProperties(boolean ambiguateProperties) { [EOL]     this.ambiguateProperties = ambiguateProperties; [EOL] } <line_num>: 1793,1795
public void setAnonymousFunctionNaming(AnonymousFunctionNamingPolicy anonymousFunctionNaming) { [EOL]     this.anonymousFunctionNaming = anonymousFunctionNaming; [EOL] } <line_num>: 1797,1800
public void setInputAnonymousFunctionNamingMap(VariableMap inputMap) { [EOL]     this.inputAnonymousFunctionNamingMap = inputMap; [EOL] } <line_num>: 1802,1804
@Deprecated [EOL] public void setInputVariableMapSerialized(byte[] inputVariableMapSerialized) throws ParseException { [EOL]     this.inputVariableMap = VariableMap.fromBytes(inputVariableMapSerialized); [EOL] } <line_num>: 1806,1810
public void setInputVariableMap(VariableMap inputVariableMap) { [EOL]     this.inputVariableMap = inputVariableMap; [EOL] } <line_num>: 1812,1814
@Deprecated [EOL] public void setInputPropertyMapSerialized(byte[] inputPropertyMapSerialized) throws ParseException { [EOL]     this.inputPropertyMap = VariableMap.fromBytes(inputPropertyMapSerialized); [EOL] } <line_num>: 1816,1820
public void setInputPropertyMap(VariableMap inputPropertyMap) { [EOL]     this.inputPropertyMap = inputPropertyMap; [EOL] } <line_num>: 1822,1824
public void setExportTestFunctions(boolean exportTestFunctions) { [EOL]     this.exportTestFunctions = exportTestFunctions; [EOL] } <line_num>: 1826,1828
public void setRuntimeTypeCheck(boolean runtimeTypeCheck) { [EOL]     this.runtimeTypeCheck = runtimeTypeCheck; [EOL] } <line_num>: 1830,1832
public void setRuntimeTypeCheckLogFunction(String runtimeTypeCheckLogFunction) { [EOL]     this.runtimeTypeCheckLogFunction = runtimeTypeCheckLogFunction; [EOL] } <line_num>: 1834,1836
public void setSyntheticBlockStartMarker(String syntheticBlockStartMarker) { [EOL]     this.syntheticBlockStartMarker = syntheticBlockStartMarker; [EOL] } <line_num>: 1838,1840
public void setSyntheticBlockEndMarker(String syntheticBlockEndMarker) { [EOL]     this.syntheticBlockEndMarker = syntheticBlockEndMarker; [EOL] } <line_num>: 1842,1844
public void setLocale(String locale) { [EOL]     this.locale = locale; [EOL] } <line_num>: 1846,1848
public void setMarkAsCompiled(boolean markAsCompiled) { [EOL]     this.markAsCompiled = markAsCompiled; [EOL] } <line_num>: 1850,1852
public void setRemoveTryCatchFinally(boolean removeTryCatchFinally) { [EOL]     this.removeTryCatchFinally = removeTryCatchFinally; [EOL] } <line_num>: 1854,1856
public void setClosurePass(boolean closurePass) { [EOL]     this.closurePass = closurePass; [EOL] } <line_num>: 1858,1860
public void setGatherCssNames(boolean gatherCssNames) { [EOL]     this.gatherCssNames = gatherCssNames; [EOL] } <line_num>: 1862,1864
public void setStripTypes(Set<String> stripTypes) { [EOL]     this.stripTypes = stripTypes; [EOL] } <line_num>: 1866,1868
public void setStripNameSuffixes(Set<String> stripNameSuffixes) { [EOL]     this.stripNameSuffixes = stripNameSuffixes; [EOL] } <line_num>: 1870,1872
public void setStripNamePrefixes(Set<String> stripNamePrefixes) { [EOL]     this.stripNamePrefixes = stripNamePrefixes; [EOL] } <line_num>: 1874,1876
public void setStripTypePrefixes(Set<String> stripTypePrefixes) { [EOL]     this.stripTypePrefixes = stripTypePrefixes; [EOL] } <line_num>: 1878,1880
public void setCustomPasses(Multimap<CustomPassExecutionTime, CompilerPass> customPasses) { [EOL]     this.customPasses = customPasses; [EOL] } <line_num>: 1882,1884
public void setMarkNoSideEffectCalls(boolean markNoSideEffectCalls) { [EOL]     this.markNoSideEffectCalls = markNoSideEffectCalls; [EOL] } <line_num>: 1886,1888
public void setDefineReplacements(Map<String, Object> defineReplacements) { [EOL]     this.defineReplacements = defineReplacements; [EOL] } <line_num>: 1890,1892
public void setTweakReplacements(Map<String, Object> tweakReplacements) { [EOL]     this.tweakReplacements = tweakReplacements; [EOL] } <line_num>: 1894,1896
public void setMoveFunctionDeclarations(boolean moveFunctionDeclarations) { [EOL]     this.moveFunctionDeclarations = moveFunctionDeclarations; [EOL] } <line_num>: 1898,1900
public void setInstrumentationTemplate(String instrumentationTemplate) { [EOL]     this.instrumentationTemplate = instrumentationTemplate; [EOL] } <line_num>: 1902,1904
public void setRecordFunctionInformation(boolean recordFunctionInformation) { [EOL]     this.recordFunctionInformation = recordFunctionInformation; [EOL] } <line_num>: 1906,1908
public void setCssRenamingMap(CssRenamingMap cssRenamingMap) { [EOL]     this.cssRenamingMap = cssRenamingMap; [EOL] } <line_num>: 1910,1912
public void setCssRenamingWhitelist(Set<String> whitelist) { [EOL]     this.cssRenamingWhitelist = whitelist; [EOL] } <line_num>: 1914,1916
public void setReplaceStringsFunctionDescriptions(List<String> replaceStringsFunctionDescriptions) { [EOL]     this.replaceStringsFunctionDescriptions = replaceStringsFunctionDescriptions; [EOL] } <line_num>: 1918,1920
public void setReplaceStringsPlaceholderToken(String replaceStringsPlaceholderToken) { [EOL]     this.replaceStringsPlaceholderToken = replaceStringsPlaceholderToken; [EOL] } <line_num>: 1922,1924
public void setReplaceStringsReservedStrings(Set<String> replaceStringsReservedStrings) { [EOL]     this.replaceStringsReservedStrings = replaceStringsReservedStrings; [EOL] } <line_num>: 1926,1928
public void setReplaceStringsInputMap(VariableMap serializedMap) { [EOL]     this.replaceStringsInputMap = serializedMap; [EOL] } <line_num>: 1930,1932
public void setPrettyPrint(boolean prettyPrint) { [EOL]     this.prettyPrint = prettyPrint; [EOL] } <line_num>: 1934,1936
public void setLineBreak(boolean lineBreak) { [EOL]     this.lineBreak = lineBreak; [EOL] } <line_num>: 1938,1940
public void setPreferLineBreakAtEndOfFile(boolean lineBreakAtEnd) { [EOL]     this.preferLineBreakAtEndOfFile = lineBreakAtEnd; [EOL] } <line_num>: 1942,1944
public void setPrintInputDelimiter(boolean printInputDelimiter) { [EOL]     this.printInputDelimiter = printInputDelimiter; [EOL] } <line_num>: 1946,1948
public void setInputDelimiter(String inputDelimiter) { [EOL]     this.inputDelimiter = inputDelimiter; [EOL] } <line_num>: 1950,1952
public void setTracer(TracerMode tracer) { [EOL]     this.tracer = tracer; [EOL] } <line_num>: 1954,1956
public void setErrorFormat(ErrorFormat errorFormat) { [EOL]     this.errorFormat = errorFormat; [EOL] } <line_num>: 1958,1960
public void setWarningsGuard(ComposeWarningsGuard warningsGuard) { [EOL]     this.warningsGuard = warningsGuard; [EOL] } <line_num>: 1962,1964
public void setLineLengthThreshold(int lineLengthThreshold) { [EOL]     this.lineLengthThreshold = lineLengthThreshold; [EOL] } <line_num>: 1966,1968
public void setExternExports(boolean externExports) { [EOL]     this.externExports = externExports; [EOL] } <line_num>: 1970,1972
public void setExternExportsPath(String externExportsPath) { [EOL]     this.externExportsPath = externExportsPath; [EOL] } <line_num>: 1974,1976
public void setSourceMapOutputPath(String sourceMapOutputPath) { [EOL]     this.sourceMapOutputPath = sourceMapOutputPath; [EOL] } <line_num>: 1978,1980
public void setSourceMapDetailLevel(SourceMap.DetailLevel sourceMapDetailLevel) { [EOL]     this.sourceMapDetailLevel = sourceMapDetailLevel; [EOL] } <line_num>: 1982,1984
public void setSourceMapFormat(SourceMap.Format sourceMapFormat) { [EOL]     this.sourceMapFormat = sourceMapFormat; [EOL] } <line_num>: 1986,1988
public void setSourceMapLocationMappings(List<SourceMap.LocationMapping> sourceMapLocationMappings) { [EOL]     this.sourceMapLocationMappings = sourceMapLocationMappings; [EOL] } <line_num>: 1990,1992
public void setTransformAMDToCJSModules(boolean transformAMDToCJSModules) { [EOL]     this.transformAMDToCJSModules = transformAMDToCJSModules; [EOL] } <line_num>: 1997,1999
public void setProcessCommonJSModules(boolean processCommonJSModules) { [EOL]     this.processCommonJSModules = processCommonJSModules; [EOL] } <line_num>: 2005,2007
public void setCommonJSModulePathPrefix(String commonJSModulePathPrefix) { [EOL]     this.commonJSModulePathPrefix = commonJSModulePathPrefix; [EOL] } <line_num>: 2012,2014
public static LanguageMode fromString(String value) { [EOL]     if (value.equals("ECMASCRIPT5_STRICT") || value.equals("ES5_STRICT")) { [EOL]         return CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT; [EOL]     } else if (value.equals("ECMASCRIPT5") || value.equals("ES5")) { [EOL]         return CompilerOptions.LanguageMode.ECMASCRIPT5; [EOL]     } else if (value.equals("ECMASCRIPT3") || value.equals("ES3")) { [EOL]         return CompilerOptions.LanguageMode.ECMASCRIPT3; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 2037,2049
boolean isOn() { [EOL]     return this != OFF; [EOL] } <line_num>: 2081,2083
public boolean isOn() { [EOL]     return this != OFF; [EOL] } <line_num>: 2091,2093
public boolean shouldStrip() { [EOL]     return this == STRIP; [EOL] } <line_num>: 2095,2097
public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<AliasTransformation> position); <line_num>: 2133,2134
void addAlias(String alias, String definition); <line_num>: 2155,2155
@Override [EOL] public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<AliasTransformation> position) { [EOL]     position.setItem(NULL_ALIAS_TRANSFORMATION); [EOL]     return NULL_ALIAS_TRANSFORMATION; [EOL] } <line_num>: 2172,2177
@Override [EOL] public void addAlias(String alias, String definition) { [EOL] } <line_num>: 2183,2185
