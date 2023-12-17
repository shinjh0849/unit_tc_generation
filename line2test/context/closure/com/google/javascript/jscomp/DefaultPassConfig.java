public DefaultPassConfig(CompilerOptions options)
 GlobalTypeResolver(AbstractCompiler compiler)
 HotSwapPassFactory(String name, boolean isOneTimePass)
protected State getIntermediateState()
protected void setIntermediateState(State state)
 GlobalNamespace getGlobalNamespace()
 PreprocessorSymbolTable getPreprocessorSymbolTable()
 void maybeInitializePreprocessorSymbolTable(AbstractCompiler compiler)
protected List<PassFactory> getChecks()
protected List<PassFactory> getOptimizations()
private List<PassFactory> getMainOptimizationLoop()
private List<PassFactory> getCodeRemovingPasses()
protected HotSwapCompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(final AbstractCompiler compiler)
protected HotSwapCompilerPass create(final AbstractCompiler compiler)
private void assertAllOneTimePasses(List<PassFactory> passes)
private void assertAllLoopablePasses(List<PassFactory> passes)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(final AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node jsRoot)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
protected HotSwapCompilerPass create(final AbstractCompiler compiler)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
protected HotSwapCompilerPass create(final AbstractCompiler compiler)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
protected HotSwapCompilerPass create(final AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
private static HotSwapCompilerPass combineChecks(AbstractCompiler compiler, List<Callback> callbacks)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void process(Node externs, Node root)
public void process(Node externs, Node jsRoot)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node jsRoot)
protected CompilerPass create(final AbstractCompiler compiler)
public void process(Node externs, Node jsRoot)
protected CompilerPass create(final AbstractCompiler compiler)
public void process(Node externs, Node jsRoot)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
protected HotSwapCompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
private VariableMap runPropertyRenaming(AbstractCompiler compiler, VariableMap prevPropertyMap, Node externs, Node root)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
private VariableMap runVariableRenaming(AbstractCompiler compiler, VariableMap prevVariableMap, Node externs, Node root)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass create(final AbstractCompiler compiler)
protected CompilerPass create(final AbstractCompiler compiler)
 static PassFactory createEmptyPass(String name)
protected CompilerPass create(final AbstractCompiler compiler)
private PassFactory getCustomPasses(final CustomPassExecutionTime executionTime)
private boolean isInliningForbidden()
private static CompilerPass runInSerial(final CompilerPass... passes)
public void process(Node externs, Node root)
private static CompilerPass runInSerial(final Collection<CompilerPass> passes)
 static Map<String, Node> getAdditionalReplacements(CompilerOptions options)
public void process(Node externs, Node jsRoot)
protected CompilerPass create(final AbstractCompiler compiler)
public void process(Node externs, Node jsRoot)
protected CompilerPass create(final AbstractCompiler compiler)
protected abstract HotSwapCompilerPass create(AbstractCompiler compiler)
 HotSwapCompilerPass getHotSwapPass(AbstractCompiler compiler)
String COMPILED_CONSTANT_NAME=Optional["COMPILED"]
String CLOSURE_LOCALE_CONSTANT_NAME=Optional["goog.LOCALE"]
DiagnosticType TIGHTEN_TYPES_WITHOUT_TYPE_CHECK=Optional[DiagnosticType.error("JSC_TIGHTEN_TYPES_WITHOUT_TYPE_CHECK", "TightenTypes requires type checking. Please use --check_types.")]
DiagnosticType CANNOT_USE_PROTOTYPE_AND_VAR=Optional[DiagnosticType.error("JSC_CANNOT_USE_PROTOTYPE_AND_VAR", "Rename prototypes and inline variables cannot be used together")]
DiagnosticType REPORT_PATH_IO_ERROR=Optional[DiagnosticType.error("JSC_REPORT_PATH_IO_ERROR", "Error writing compiler report to {0}")]
DiagnosticType NAME_REF_GRAPH_FILE_ERROR=Optional[DiagnosticType.error("JSC_NAME_REF_GRAPH_FILE_ERROR", "Error \"{1}\" writing name reference graph to \"{0}\".")]
DiagnosticType NAME_REF_REPORT_FILE_ERROR=Optional[DiagnosticType.error("JSC_NAME_REF_REPORT_FILE_ERROR", "Error \"{1}\" writing name reference report to \"{0}\".")]
java.util.regex.Pattern GLOBAL_SYMBOL_NAMESPACE_PATTERN=Optional[java.util.regex.Pattern.compile("^[a-zA-Z0-9$_]+$")]
GlobalNamespace namespaceForChecks=Optional[null]
PreprocessorSymbolTable preprocessorSymbolTable=Optional[null]
TightenTypes tightenTypes=Optional[null]
Set<String> exportedNames=Optional[null]
CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator=Optional[new CrossModuleMethodMotion.IdGenerator()]
Map<String, Integer> cssNames=Optional[null]
VariableMap variableMap=Optional[null]
VariableMap propertyMap=Optional[null]
VariableMap anonymousFunctionNameMap=Optional[null]
FunctionNames functionNames=Optional[null]
VariableMap stringMap=Optional[null]
String idGeneratorMap=Optional[null]
HotSwapPassFactory checkSideEffects=Optional[new HotSwapPassFactory("checkSideEffects", true) {

    @Override
    protected HotSwapCompilerPass create(final AbstractCompiler compiler) {
        // The current approach to protecting "hidden" side-effects is to
        // wrap them in a function call that is stripped later, this shouldn't
        // be done in IDE mode where AST changes may be unexpected.
        boolean protectHiddenSideEffects = options.protectHiddenSideEffects && !options.ideMode;
        return new CheckSideEffects(compiler, options.checkSuspiciousCode ? CheckLevel.WARNING : CheckLevel.OFF, protectHiddenSideEffects);
    }
}]
PassFactory stripSideEffectProtection=Optional[new PassFactory("stripSideEffectProtection", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CheckSideEffects.StripProtection(compiler);
    }
}]
HotSwapPassFactory suspiciousCode=Optional[new HotSwapPassFactory("suspiciousCode", true) {

    @Override
    protected HotSwapCompilerPass create(final AbstractCompiler compiler) {
        List<Callback> sharedCallbacks = Lists.newArrayList();
        if (options.checkSuspiciousCode) {
            sharedCallbacks.add(new CheckSuspiciousCode());
        }
        if (options.enables(DiagnosticGroups.GLOBAL_THIS)) {
            sharedCallbacks.add(new CheckGlobalThis(compiler));
        }
        if (options.enables(DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT)) {
            sharedCallbacks.add(new CheckDebuggerStatement(compiler));
        }
        return combineChecks(compiler, sharedCallbacks);
    }
}]
HotSwapPassFactory checkControlStructures=Optional[new HotSwapPassFactory("checkControlStructures", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new ControlStructureCheck(compiler);
    }
}]
HotSwapPassFactory checkRequires=Optional[new HotSwapPassFactory("checkRequires", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new CheckRequiresForConstructors(compiler, options.checkRequires);
    }
}]
HotSwapPassFactory checkProvides=Optional[new HotSwapPassFactory("checkProvides", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new CheckProvides(compiler, options.checkProvides);
    }
}]
DiagnosticType GENERATE_EXPORTS_ERROR=Optional[DiagnosticType.error("JSC_GENERATE_EXPORTS_ERROR", "Exports can only be generated if export symbol/property " + "functions are set.")]
PassFactory generateExports=Optional[new PassFactory("generateExports", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        CodingConvention convention = compiler.getCodingConvention();
        if (convention.getExportSymbolFunction() != null && convention.getExportPropertyFunction() != null) {
            return new GenerateExports(compiler, convention.getExportSymbolFunction(), convention.getExportPropertyFunction());
        } else {
            return new ErrorPass(compiler, GENERATE_EXPORTS_ERROR);
        }
    }
}]
PassFactory exportTestFunctions=Optional[new PassFactory("exportTestFunctions", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        CodingConvention convention = compiler.getCodingConvention();
        if (convention.getExportSymbolFunction() != null) {
            return new ExportTestFunctions(compiler, convention.getExportSymbolFunction(), convention.getExportPropertyFunction());
        } else {
            return new ErrorPass(compiler, GENERATE_EXPORTS_ERROR);
        }
    }
}]
PassFactory gatherRawExports=Optional[new PassFactory("gatherRawExports", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        final GatherRawExports pass = new GatherRawExports(compiler);
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                pass.process(externs, root);
                if (exportedNames == null) {
                    exportedNames = Sets.newHashSet();
                }
                exportedNames.addAll(pass.getExportedVariableNames());
            }
        };
    }
}]
HotSwapPassFactory closurePrimitives=Optional[new HotSwapPassFactory("closurePrimitives", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        maybeInitializePreprocessorSymbolTable(compiler);
        final ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, preprocessorSymbolTable, options.brokenClosureRequiresLevel);
        return new HotSwapCompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                pass.process(externs, root);
                exportedNames = pass.getExportedVariableNames();
            }

            @Override
            public void hotSwapScript(Node scriptRoot, Node originalRoot) {
                pass.hotSwapScript(scriptRoot, originalRoot);
            }
        };
    }
}]
PassFactory jqueryAliases=Optional[new PassFactory("jqueryAliases", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ExpandJqueryAliases(compiler);
    }
}]
PassFactory replaceMessages=Optional[new PassFactory("replaceMessages", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new ReplaceMessages(compiler, options.messageBundle, /* warn about message dupes */
        true, /* allow messages with goog.getMsg */
        JsMessage.Style.getFromParams(true, false), /* if we can't find a translation, don't worry about it. */
        false);
    }
}]
PassFactory replaceMessagesForChrome=Optional[new PassFactory("replaceMessages", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new ReplaceMessagesForChrome(compiler, new GoogleJsMessageIdGenerator(options.tcProjectId), /* warn about message dupes */
        true, /* allow messages with goog.getMsg */
        JsMessage.Style.getFromParams(true, false));
    }
}]
HotSwapPassFactory closureGoogScopeAliases=Optional[new HotSwapPassFactory("closureGoogScopeAliases", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        maybeInitializePreprocessorSymbolTable(compiler);
        return new ScopedAliases(compiler, preprocessorSymbolTable, options.getAliasTransformationHandler());
    }
}]
HotSwapPassFactory closureRewriteGoogClass=Optional[new HotSwapPassFactory("closureRewriteGoogClass", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new ClosureRewriteClass(compiler);
    }
}]
PassFactory closureCheckGetCssName=Optional[new PassFactory("closureCheckGetCssName", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        String blacklist = options.checkMissingGetCssNameBlacklist;
        Preconditions.checkState(blacklist != null && !blacklist.isEmpty(), "Not checking use of goog.getCssName because of empty blacklist.");
        return new CheckMissingGetCssName(compiler, options.checkMissingGetCssNameLevel, blacklist);
    }
}]
PassFactory closureReplaceGetCssName=Optional[new PassFactory("closureReplaceGetCssName", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node jsRoot) {
                Map<String, Integer> newCssNames = null;
                if (options.gatherCssNames) {
                    newCssNames = Maps.newHashMap();
                }
                ReplaceCssNames pass = new ReplaceCssNames(compiler, newCssNames, options.cssRenamingWhitelist);
                pass.process(externs, jsRoot);
                cssNames = newCssNames;
            }
        };
    }
}]
PassFactory createSyntheticBlocks=Optional[new PassFactory("createSyntheticBlocks", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new CreateSyntheticBlocks(compiler, options.syntheticBlockStartMarker, options.syntheticBlockEndMarker);
    }
}]
PassFactory peepholeOptimizations=Optional[new PassFactory("peepholeOptimizations", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        final boolean late = false;
        return new PeepholeOptimizationsPass(compiler, new PeepholeSubstituteAlternateSyntax(late), new PeepholeReplaceKnownMethods(late), new PeepholeRemoveDeadCode(), new PeepholeFoldConstants(late), new PeepholeCollectPropertyAssignments());
    }
}]
PassFactory latePeepholeOptimizations=Optional[new PassFactory("latePeepholeOptimizations", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        final boolean late = true;
        return new PeepholeOptimizationsPass(compiler, new StatementFusion(), new PeepholeRemoveDeadCode(), new PeepholeSubstituteAlternateSyntax(late), new PeepholeReplaceKnownMethods(late), new PeepholeFoldConstants(late), new ReorderConstantExpression());
    }
}]
HotSwapPassFactory checkVars=Optional[new HotSwapPassFactory("checkVars", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new VarCheck(compiler);
    }
}]
PassFactory checkRegExp=Optional[new PassFactory("checkRegExp", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        final CheckRegExp pass = new CheckRegExp(compiler);
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                pass.process(externs, root);
                compiler.setHasRegExpGlobalReferences(pass.isGlobalRegExpPropertiesUsed());
            }
        };
    }
}]
HotSwapPassFactory checkVariableReferences=Optional[new HotSwapPassFactory("checkVariableReferences", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new VariableReferenceCheck(compiler, options.aggressiveVarCheck);
    }
}]
PassFactory objectPropertyStringPreprocess=Optional[new PassFactory("ObjectPropertyStringPreprocess", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ObjectPropertyStringPreprocess(compiler);
    }
}]
HotSwapPassFactory resolveTypes=Optional[new HotSwapPassFactory("resolveTypes", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new GlobalTypeResolver(compiler);
    }
}]
PassFactory clearTypedScopePass=Optional[new PassFactory("clearTypedScopePass", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ClearTypedScope();
    }
}]
HotSwapPassFactory inferTypes=Optional[new HotSwapPassFactory("inferTypes", true) {

    @Override
    protected HotSwapCompilerPass create(final AbstractCompiler compiler) {
        return new HotSwapCompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                Preconditions.checkNotNull(topScope);
                Preconditions.checkNotNull(getTypedScopeCreator());
                makeTypeInference(compiler).process(externs, root);
            }

            @Override
            public void hotSwapScript(Node scriptRoot, Node originalRoot) {
                makeTypeInference(compiler).inferAllScopes(scriptRoot);
            }
        };
    }
}]
HotSwapPassFactory inferJsDocInfo=Optional[new HotSwapPassFactory("inferJsDocInfo", true) {

    @Override
    protected HotSwapCompilerPass create(final AbstractCompiler compiler) {
        return new HotSwapCompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                Preconditions.checkNotNull(topScope);
                Preconditions.checkNotNull(getTypedScopeCreator());
                makeInferJsDocInfo(compiler).process(externs, root);
            }

            @Override
            public void hotSwapScript(Node scriptRoot, Node originalRoot) {
                makeInferJsDocInfo(compiler).hotSwapScript(scriptRoot, originalRoot);
            }
        };
    }
}]
HotSwapPassFactory checkTypes=Optional[new HotSwapPassFactory("checkTypes", true) {

    @Override
    protected HotSwapCompilerPass create(final AbstractCompiler compiler) {
        return new HotSwapCompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                Preconditions.checkNotNull(topScope);
                Preconditions.checkNotNull(getTypedScopeCreator());
                TypeCheck check = makeTypeCheck(compiler);
                check.process(externs, root);
                compiler.getErrorManager().setTypedPercent(check.getTypedPercent());
            }

            @Override
            public void hotSwapScript(Node scriptRoot, Node originalRoot) {
                makeTypeCheck(compiler).check(scriptRoot, false);
            }
        };
    }
}]
HotSwapPassFactory checkControlFlow=Optional[new HotSwapPassFactory("checkControlFlow", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        List<Callback> callbacks = Lists.newArrayList();
        if (options.checkUnreachableCode.isOn()) {
            callbacks.add(new CheckUnreachableCode(compiler, options.checkUnreachableCode));
        }
        if (options.checkMissingReturn.isOn() && options.checkTypes) {
            callbacks.add(new CheckMissingReturn(compiler, options.checkMissingReturn));
        }
        return combineChecks(compiler, callbacks);
    }
}]
HotSwapPassFactory checkAccessControls=Optional[new HotSwapPassFactory("checkAccessControls", true) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new CheckAccessControls(compiler);
    }
}]
PassFactory checkGlobalNames=Optional[new PassFactory("checkGlobalNames", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node jsRoot) {
                // Create a global namespace for analysis by check passes.
                // Note that this class does all heavy computation lazily,
                // so it's OK to create it here.
                namespaceForChecks = new GlobalNamespace(compiler, externs, jsRoot);
                new CheckGlobalNames(compiler, options.checkGlobalNamesLevel).injectNamespace(namespaceForChecks).process(externs, jsRoot);
            }
        };
    }
}]
PassFactory checkStrictMode=Optional[new PassFactory("checkStrictMode", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new StrictModeCheck(compiler, // don't check variables twice
        !options.checkSymbols, // disable eval check if not Caja
        !options.checkCaja);
    }
}]
PassFactory processTweaks=Optional[new PassFactory("processTweaks", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node jsRoot) {
                new ProcessTweaks(compiler, options.getTweakProcessing().shouldStrip(), options.getTweakReplacements()).process(externs, jsRoot);
            }
        };
    }
}]
PassFactory processDefines=Optional[new PassFactory("processDefines", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node jsRoot) {
                Map<String, Node> replacements = getAdditionalReplacements(options);
                replacements.putAll(options.getDefineReplacements());
                new ProcessDefines(compiler, replacements).injectNamespace(namespaceForChecks).process(externs, jsRoot);
            }
        };
    }
}]
PassFactory garbageCollectChecks=Optional[new HotSwapPassFactory("garbageCollectChecks", true) {

    @Override
    protected HotSwapCompilerPass create(final AbstractCompiler compiler) {
        return new HotSwapCompilerPass() {

            @Override
            public void process(Node externs, Node jsRoot) {
                // Kill the global namespace so that it can be garbage collected
                // after all passes are through with it.
                namespaceForChecks = null;
            }

            @Override
            public void hotSwapScript(Node scriptRoot, Node originalRoot) {
                process(null, null);
            }
        };
    }
}]
PassFactory checkConsts=Optional[new PassFactory("checkConsts", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ConstCheck(compiler);
    }
}]
PassFactory computeFunctionNames=Optional[new PassFactory("computeFunctionNames", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return ((functionNames = new FunctionNames(compiler)));
    }
}]
PassFactory ignoreCajaProperties=Optional[new PassFactory("ignoreCajaProperties", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new IgnoreCajaProperties(compiler);
    }
}]
PassFactory runtimeTypeCheck=Optional[new PassFactory("runtimeTypeCheck", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new RuntimeTypeCheck(compiler, options.runtimeTypeCheckLogFunction);
    }
}]
PassFactory replaceIdGenerators=Optional[new PassFactory("replaceIdGenerators", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                ReplaceIdGenerators pass = new ReplaceIdGenerators(compiler, options.idGenerators, options.generatePseudoNames, options.idGeneratorsMapSerialized);
                pass.process(externs, root);
                idGeneratorMap = pass.getSerializedIdMappings();
            }
        };
    }
}]
PassFactory replaceStrings=Optional[new PassFactory("replaceStrings", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                ReplaceStrings pass = new ReplaceStrings(compiler, options.replaceStringsPlaceholderToken, options.replaceStringsFunctionDescriptions, options.replaceStringsReservedStrings, options.replaceStringsInputMap);
                pass.process(externs, root);
                stringMap = pass.getStringMap();
            }
        };
    }
}]
PassFactory optimizeArgumentsArray=Optional[new PassFactory("optimizeArgumentsArray", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new OptimizeArgumentsArray(compiler);
    }
}]
PassFactory closureCodeRemoval=Optional[new PassFactory("closureCodeRemoval", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new ClosureCodeRemoval(compiler, options.removeAbstractMethods, options.removeClosureAsserts);
    }
}]
PassFactory closureOptimizePrimitives=Optional[new PassFactory("closureOptimizePrimitives", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new ClosureOptimizePrimitives(compiler);
    }
}]
PassFactory rescopeGlobalSymbols=Optional[new PassFactory("rescopeGlobalSymbols", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new RescopeGlobalSymbols(compiler, options.renamePrefixNamespace);
    }
}]
PassFactory collapseProperties=Optional[new PassFactory("collapseProperties", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new CollapseProperties(compiler, options.collapsePropertiesOnExternTypes, !isInliningForbidden());
    }
}]
PassFactory collapseObjectLiterals=Optional[new PassFactory("collapseObjectLiterals", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
    }
}]
PassFactory tightenTypesBuilder=Optional[new PassFactory("tightenTypes", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        if (!options.checkTypes) {
            return new ErrorPass(compiler, TIGHTEN_TYPES_WITHOUT_TYPE_CHECK);
        }
        tightenTypes = new TightenTypes(compiler);
        return tightenTypes;
    }
}]
PassFactory disambiguateProperties=Optional[new PassFactory("disambiguateProperties", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        if (tightenTypes == null) {
            return DisambiguateProperties.forJSTypeSystem(compiler, options.propertyInvalidationErrors);
        } else {
            return DisambiguateProperties.forConcreteTypeSystem(compiler, tightenTypes, options.propertyInvalidationErrors);
        }
    }
}]
PassFactory chainCalls=Optional[new PassFactory("chainCalls", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ChainCalls(compiler);
    }
}]
PassFactory devirtualizePrototypeMethods=Optional[new PassFactory("devirtualizePrototypeMethods", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new DevirtualizePrototypeMethods(compiler);
    }
}]
PassFactory optimizeCallsAndRemoveUnusedVars=Optional[new PassFactory("optimizeCalls_and_removeUnusedVars", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        OptimizeCalls passes = new OptimizeCalls(compiler);
        if (options.optimizeReturns) {
            // Remove unused return values.
            passes.addPass(new OptimizeReturns(compiler));
        }
        if (options.optimizeParameters) {
            // Remove all parameters that are constants or unused.
            passes.addPass(new OptimizeParameters(compiler));
        }
        if (options.optimizeCalls) {
            boolean removeOnlyLocals = options.removeUnusedLocalVars && !options.removeUnusedVars;
            boolean preserveAnonymousFunctionNames = options.anonymousFunctionNaming != AnonymousFunctionNamingPolicy.OFF;
            passes.addPass(new RemoveUnusedVars(compiler, !removeOnlyLocals, preserveAnonymousFunctionNames, true));
        }
        return passes;
    }
}]
PassFactory markPureFunctions=Optional[new PassFactory("markPureFunctions", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new PureFunctionIdentifier.Driver(compiler, options.debugFunctionSideEffectsPath, false);
    }
}]
PassFactory markNoSideEffectCalls=Optional[new PassFactory("markNoSideEffectCalls", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new MarkNoSideEffectCalls(compiler);
    }
}]
PassFactory inlineVariables=Optional[new PassFactory("inlineVariables", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        if (isInliningForbidden()) {
            // In old renaming schemes, inlining a variable can change whether
            // or not a property is renamed. This is bad, and those old renaming
            // schemes need to die.
            return new ErrorPass(compiler, CANNOT_USE_PROTOTYPE_AND_VAR);
        } else {
            InlineVariables.Mode mode;
            if (options.inlineVariables) {
                mode = InlineVariables.Mode.ALL;
            } else if (options.inlineLocalVariables) {
                mode = InlineVariables.Mode.LOCALS_ONLY;
            } else {
                throw new IllegalStateException("No variable inlining option set.");
            }
            return new InlineVariables(compiler, mode, true);
        }
    }
}]
PassFactory inlineConstants=Optional[new PassFactory("inlineConstants", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, true);
    }
}]
PassFactory minimizeExitPoints=Optional[new PassFactory("minimizeExitPoints", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new MinimizeExitPoints(compiler);
    }
}]
PassFactory removeUnreachableCode=Optional[new PassFactory("removeUnreachableCode", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new UnreachableCodeElimination(compiler, true);
    }
}]
PassFactory removeUnusedPrototypeProperties=Optional[new PassFactory("removeUnusedPrototypeProperties", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new RemoveUnusedPrototypeProperties(compiler, options.removeUnusedPrototypePropertiesInExterns, !options.removeUnusedVars);
    }
}]
PassFactory removeUnusedClassProperties=Optional[new PassFactory("removeUnusedClassProperties", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new RemoveUnusedClassProperties(compiler);
    }
}]
PassFactory smartNamePass=Optional[new PassFactory("smartNamePass", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                NameAnalyzer na = new NameAnalyzer(compiler, false);
                na.process(externs, root);
                String reportPath = options.reportPath;
                if (reportPath != null) {
                    try {
                        Files.write(na.getHtmlReport(), new File(reportPath), Charsets.UTF_8);
                    } catch (IOException e) {
                        compiler.report(JSError.make(REPORT_PATH_IO_ERROR, reportPath));
                    }
                }
                if (options.smartNameRemoval) {
                    na.removeUnreferenced();
                }
            }
        };
    }
}]
PassFactory smartNamePass2=Optional[new PassFactory("smartNamePass", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                NameAnalyzer na = new NameAnalyzer(compiler, false);
                na.process(externs, root);
                na.removeUnreferenced();
            }
        };
    }
}]
PassFactory inlineSimpleMethods=Optional[new PassFactory("inlineSimpleMethods", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new InlineSimpleMethods(compiler);
    }
}]
PassFactory deadAssignmentsElimination=Optional[new PassFactory("deadAssignmentsElimination", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new DeadAssignmentsElimination(compiler);
    }
}]
PassFactory inlineFunctions=Optional[new PassFactory("inlineFunctions", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        boolean enableBlockInlining = !isInliningForbidden();
        return new InlineFunctions(compiler, compiler.getUniqueNameIdSupplier(), options.inlineFunctions, options.inlineLocalFunctions, enableBlockInlining, options.assumeStrictThis() || options.getLanguageIn() == LanguageMode.ECMASCRIPT5_STRICT, true);
    }
}]
PassFactory inlineProperties=Optional[new PassFactory("inlineProperties", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new InlineProperties(compiler);
    }
}]
PassFactory removeUnusedVars=Optional[new PassFactory("removeUnusedVars", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        boolean removeOnlyLocals = options.removeUnusedLocalVars && !options.removeUnusedVars;
        boolean preserveAnonymousFunctionNames = options.anonymousFunctionNaming != AnonymousFunctionNamingPolicy.OFF;
        return new RemoveUnusedVars(compiler, !removeOnlyLocals, preserveAnonymousFunctionNames, false);
    }
}]
PassFactory crossModuleCodeMotion=Optional[new PassFactory("crossModuleCodeMotion", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new CrossModuleCodeMotion(compiler, compiler.getModuleGraph());
    }
}]
PassFactory crossModuleMethodMotion=Optional[new PassFactory("crossModuleMethodMotion", false) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new CrossModuleMethodMotion(compiler, crossModuleIdGenerator, // Only move properties in externs if we're not treating
        // them as exports.
        options.removeUnusedPrototypePropertiesInExterns);
    }
}]
PassFactory specializeInitialModule=Optional[new PassFactory("specializeInitialModule", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new SpecializeModule(compiler, devirtualizePrototypeMethods, inlineFunctions, removeUnusedPrototypeProperties);
    }
}]
PassFactory flowSensitiveInlineVariables=Optional[new PassFactory("flowSensitiveInlineVariables", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new FlowSensitiveInlineVariables(compiler);
    }
}]
PassFactory coalesceVariableNames=Optional[new PassFactory("coalesceVariableNames", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new CoalesceVariableNames(compiler, options.generatePseudoNames);
    }
}]
PassFactory exploitAssign=Optional[new PassFactory("exploitAssign", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new PeepholeOptimizationsPass(compiler, new ExploitAssigns());
    }
}]
PassFactory collapseVariableDeclarations=Optional[new PassFactory("collapseVariableDeclarations", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new CollapseVariableDeclarations(compiler);
    }
}]
PassFactory groupVariableDeclarations=Optional[new PassFactory("groupVariableDeclarations", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new GroupVariableDeclarations(compiler);
    }
}]
PassFactory extractPrototypeMemberDeclarations=Optional[new PassFactory("extractPrototypeMemberDeclarations", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ExtractPrototypeMemberDeclarations(compiler, Pattern.USE_GLOBAL_TEMP);
    }
}]
PassFactory rewriteFunctionExpressions=Optional[new PassFactory("rewriteFunctionExpressions", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new FunctionRewriter(compiler);
    }
}]
PassFactory collapseAnonymousFunctions=Optional[new PassFactory("collapseAnonymousFunctions", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new CollapseAnonymousFunctions(compiler);
    }
}]
PassFactory moveFunctionDeclarations=Optional[new PassFactory("moveFunctionDeclarations", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new MoveFunctionDeclarations(compiler);
    }
}]
PassFactory nameUnmappedAnonymousFunctions=Optional[new PassFactory("nameAnonymousFunctions", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new NameAnonymousFunctions(compiler);
    }
}]
PassFactory nameMappedAnonymousFunctions=Optional[new PassFactory("nameAnonymousFunctions", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                NameAnonymousFunctionsMapped naf = new NameAnonymousFunctionsMapped(compiler, options.inputAnonymousFunctionNamingMap);
                naf.process(externs, root);
                anonymousFunctionNameMap = naf.getFunctionMap();
            }
        };
    }
}]
PassFactory aliasExternals=Optional[new PassFactory("aliasExternals", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new AliasExternals(compiler, compiler.getModuleGraph(), options.unaliasableGlobals, options.aliasableGlobals);
    }
}]
PassFactory aliasStrings=Optional[new PassFactory("aliasStrings", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new AliasStrings(compiler, compiler.getModuleGraph(), options.aliasAllStrings ? null : options.aliasableStrings, options.aliasStringsBlacklist, options.outputJsStringUsage);
    }
}]
PassFactory aliasKeywords=Optional[new PassFactory("aliasKeywords", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new AliasKeywords(compiler);
    }
}]
PassFactory objectPropertyStringPostprocess=Optional[new PassFactory("ObjectPropertyStringPostprocess", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ObjectPropertyStringPostprocess(compiler);
    }
}]
PassFactory ambiguateProperties=Optional[new PassFactory("ambiguateProperties", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new AmbiguateProperties(compiler, options.anonymousFunctionNaming.getReservedCharacters());
    }
}]
PassFactory markUnnormalized=Optional[new PassFactory("markUnnormalized", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                compiler.setLifeCycleStage(LifeCycleStage.RAW);
            }
        };
    }
}]
PassFactory denormalize=Optional[new PassFactory("denormalize", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new Denormalize(compiler);
    }
}]
PassFactory invertContextualRenaming=Optional[new PassFactory("invertContextualRenaming", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    }
}]
PassFactory renameProperties=Optional[new PassFactory("renameProperties", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        final VariableMap prevPropertyMap = options.inputPropertyMap;
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                propertyMap = runPropertyRenaming(compiler, prevPropertyMap, externs, root);
            }
        };
    }
}]
PassFactory renameVars=Optional[new PassFactory("renameVars", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        final VariableMap prevVariableMap = options.inputVariableMap;
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                variableMap = runVariableRenaming(compiler, prevVariableMap, externs, root);
            }
        };
    }
}]
PassFactory renameLabels=Optional[new PassFactory("renameLabels", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new RenameLabels(compiler);
    }
}]
PassFactory convertToDottedProperties=Optional[new PassFactory("convertToDottedProperties", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new ConvertToDottedProperties(compiler);
    }
}]
PassFactory sanityCheckAst=Optional[new PassFactory("sanityCheckAst", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new AstValidator();
    }
}]
PassFactory sanityCheckVars=Optional[new PassFactory("sanityCheckVars", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new VarCheck(compiler, true);
    }
}]
PassFactory instrumentFunctions=Optional[new PassFactory("instrumentFunctions", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node root) {
                try {
                    FileReader templateFile = new FileReader(options.instrumentationTemplate);
                    (new InstrumentFunctions(compiler, functionNames, options.instrumentationTemplate, options.appNameStr, templateFile)).process(externs, root);
                } catch (IOException e) {
                    compiler.report(JSError.make(AbstractCompiler.READ_ERROR, options.instrumentationTemplate));
                }
            }
        };
    }
}]
PassFactory printNameReferenceGraph=Optional[new PassFactory("printNameReferenceGraph", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node jsRoot) {
                NameReferenceGraphConstruction gc = new NameReferenceGraphConstruction(compiler);
                gc.process(externs, jsRoot);
                String graphFileName = options.nameReferenceGraphPath;
                try {
                    Files.write(DotFormatter.toDot(gc.getNameReferenceGraph()), new File(graphFileName), Charsets.UTF_8);
                } catch (IOException e) {
                    compiler.report(JSError.make(NAME_REF_GRAPH_FILE_ERROR, e.getMessage(), graphFileName));
                }
            }
        };
    }
}]
PassFactory printNameReferenceReport=Optional[new PassFactory("printNameReferenceReport", true) {

    @Override
    protected CompilerPass create(final AbstractCompiler compiler) {
        return new CompilerPass() {

            @Override
            public void process(Node externs, Node jsRoot) {
                NameReferenceGraphConstruction gc = new NameReferenceGraphConstruction(compiler);
                String reportFileName = options.nameReferenceReportPath;
                try {
                    NameReferenceGraphReport report = new NameReferenceGraphReport(gc.getNameReferenceGraph());
                    Files.write(report.getHtmlReport(), new File(reportFileName), Charsets.UTF_8);
                } catch (IOException e) {
                    compiler.report(JSError.make(NAME_REF_REPORT_FILE_ERROR, e.getMessage(), reportFileName));
                }
            }
        };
    }
}]
