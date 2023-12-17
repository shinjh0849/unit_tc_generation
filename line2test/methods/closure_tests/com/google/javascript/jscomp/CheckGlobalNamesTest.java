public CheckGlobalNamesTest() { [EOL]     super("function alert() {}" + "/** @constructor */ function Object(){}" + "Object.prototype.hasOwnProperty = function() {};" + "/** @constructor */ function Function(){}" + "Function.prototype.call = function() {};"); [EOL] } <line_num>: 34,40
@Override [EOL] public void process(Node externs, Node js) { [EOL]     checkGlobalNames.injectNamespace(new GlobalNamespace(compiler, externs, js)).process(externs, js); [EOL] } <line_num>: 48,53
@Override [EOL] protected CompilerPass getProcessor(final Compiler compiler) { [EOL]     final CheckGlobalNames checkGlobalNames = new CheckGlobalNames(compiler, CheckLevel.WARNING); [EOL]     if (injectNamespace) { [EOL]         return new CompilerPass() { [EOL]  [EOL]             @Override [EOL]             public void process(Node externs, Node js) { [EOL]                 checkGlobalNames.injectNamespace(new GlobalNamespace(compiler, externs, js)).process(externs, js); [EOL]             } [EOL]         }; [EOL]     } else { [EOL]         return checkGlobalNames; [EOL]     } [EOL] } <line_num>: 42,58
@Override [EOL] public void setUp() { [EOL]     injectNamespace = false; [EOL]     STRICT_MODULE_DEP_QNAME.level = CheckLevel.WARNING; [EOL] } <line_num>: 60,64
public void testRefToDefinedProperties1() { [EOL]     testSame(NAMES + "alert(a.b); alert(a.c.e);"); [EOL]     testSame(GET_NAMES + "alert(a.b); alert(a.c.e);"); [EOL]     testSame(SET_NAMES + "alert(a.b); alert(a.c.e);"); [EOL] } <line_num>: 72,76
public void testRefToDefinedProperties2() { [EOL]     testSame(NAMES + "a.x={}; alert(a.c);"); [EOL]     testSame(GET_NAMES + "a.x={}; alert(a.c);"); [EOL]     testSame(SET_NAMES + "a.x={}; alert(a.c);"); [EOL] } <line_num>: 78,82
public void testRefToDefinedProperties3() { [EOL]     testSame(NAMES + "alert(a.d);"); [EOL]     testSame(GET_NAMES + "alert(a.d);"); [EOL]     testSame(SET_NAMES + "alert(a.d);"); [EOL] } <line_num>: 84,88
public void testRefToMethod1() { [EOL]     testSame("function foo() {}; foo.call();"); [EOL] } <line_num>: 90,92
public void testRefToMethod2() { [EOL]     testSame("function foo() {}; foo.call.call();"); [EOL] } <line_num>: 94,96
public void testCallUndefinedFunctionGivesNoWaring() { [EOL]     testSame("foo();"); [EOL] } <line_num>: 98,102
public void testRefToPropertyOfAliasedName() { [EOL]     testSame(NAMES + "alert(a); alert(a.x);"); [EOL] } <line_num>: 104,107
public void testRefToUndefinedProperty1() { [EOL]     testSame(NAMES + "alert(a.x);", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 109,111
public void testRefToUndefinedProperty2() { [EOL]     testSame(NAMES + "a.x();", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 113,115
public void testRefToUndefinedProperty3() { [EOL]     testSame(NAMES + "alert(a.c.x);", UNDEFINED_NAME_WARNING); [EOL]     testSame(GET_NAMES + "alert(a.c.x);", UNDEFINED_NAME_WARNING); [EOL]     testSame(SET_NAMES + "alert(a.c.x);", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 117,121
public void testRefToUndefinedProperty4() { [EOL]     testSame(NAMES + "alert(a.d.x);"); [EOL]     testSame(GET_NAMES + "alert(a.d.x);"); [EOL]     testSame(SET_NAMES + "alert(a.d.x);"); [EOL] } <line_num>: 123,127
public void testRefToDescendantOfUndefinedProperty1() { [EOL]     testSame(NAMES + "var c = a.x.b;", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 129,131
public void testRefToDescendantOfUndefinedProperty2() { [EOL]     testSame(NAMES + "a.x.b();", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 133,135
public void testRefToDescendantOfUndefinedProperty3() { [EOL]     testSame(NAMES + "a.x.b = 3;", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 137,139
public void testUndefinedPrototypeMethodRefGivesNoWarning() { [EOL]     testSame("function Foo() {} var a = new Foo(); a.bar();"); [EOL] } <line_num>: 141,143
public void testComplexPropAssignGivesNoWarning() { [EOL]     testSame("var a = {}; var b = a.b = 3;"); [EOL] } <line_num>: 145,147
public void testTypedefGivesNoWarning() { [EOL]     testSame("var a = {}; /** @typedef {number} */ a.b;"); [EOL] } <line_num>: 149,151
public void testRefToDescendantOfUndefinedPropertyGivesCorrectWarning() { [EOL]     testSame("", NAMES + "a.x.b = 3;", UNDEFINED_NAME_WARNING, UNDEFINED_NAME_WARNING.format("a.x")); [EOL] } <line_num>: 153,156
public void testNamespaceInjection() { [EOL]     injectNamespace = true; [EOL]     testSame(NAMES + "var c = a.x.b;", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 158,161
public void testSuppressionOfUndefinedNamesWarning() { [EOL]     testSame(new String[] { NAMES + "/** @constructor */ function Foo() { };" + "/** @suppress {undefinedNames} */" + "Foo.prototype.bar = function() {" + "  alert(a.x);" + "  alert(a.x.b());" + "  a.x();" + "  var c = a.x.b;" + "  var c = a.x.b();" + "  a.x.b();" + "  a.x.b = 3;" + "};" }); [EOL] } <line_num>: 163,178
public void testNoWarningForSimpleVarModuleDep1() { [EOL]     testSame(createModuleChain(NAMES, "var c = a;")); [EOL] } <line_num>: 180,185
public void testNoWarningForSimpleVarModuleDep2() { [EOL]     testSame(createModuleChain("var c = a;", NAMES)); [EOL] } <line_num>: 187,192
public void testNoWarningForGoodModuleDep1() { [EOL]     testSame(createModuleChain(NAMES, "var c = a.b;")); [EOL] } <line_num>: 193,198
public void testBadModuleDep1() { [EOL]     testSame(createModuleChain("var c = a.b;", NAMES), STRICT_MODULE_DEP_QNAME); [EOL] } <line_num>: 200,205
public void testBadModuleDep2() { [EOL]     testSame(createModuleStar(NAMES, "a.xxx = 3;", "var x = a.xxx;"), STRICT_MODULE_DEP_QNAME); [EOL] } <line_num>: 207,213
public void testSelfModuleDep() { [EOL]     testSame(createModuleChain(NAMES + "var c = a.b;")); [EOL] } <line_num>: 215,219
public void testUndefinedModuleDep1() { [EOL]     testSame(createModuleChain("var c = a.xxx;", NAMES), UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 221,226
public void testLateDefinedName1() { [EOL]     testSame("x.y = {}; var x = {};", NAME_DEFINED_LATE_WARNING); [EOL] } <line_num>: 228,230
public void testLateDefinedName2() { [EOL]     testSame("var x = {}; x.y.z = {}; x.y = {};", NAME_DEFINED_LATE_WARNING); [EOL] } <line_num>: 232,234
public void testLateDefinedName3() { [EOL]     testSame("var x = {}; x.y.z = {}; x.y = {z: {}};", NAME_DEFINED_LATE_WARNING); [EOL] } <line_num>: 236,239
public void testLateDefinedName4() { [EOL]     testSame("var x = {}; x.y.z.bar = {}; x.y = {z: {}};", NAME_DEFINED_LATE_WARNING); [EOL] } <line_num>: 241,244
public void testLateDefinedName5() { [EOL]     testSame("var x = {}; /** @typedef {number} */ x.y.z; x.y = {};", NAME_DEFINED_LATE_WARNING); [EOL] } <line_num>: 246,249
public void testLateDefinedName6() { [EOL]     testSame("var x = {}; x.y.prototype.z = 3;" + "/** @constructor */ x.y = function() {};", NAME_DEFINED_LATE_WARNING); [EOL] } <line_num>: 251,256
public void testOkLateDefinedName1() { [EOL]     testSame("function f() { x.y = {}; } var x = {};"); [EOL] } <line_num>: 258,260
public void testOkLateDefinedName2() { [EOL]     testSame("var x = {}; function f() { x.y.z = {}; } x.y = {};"); [EOL] } <line_num>: 262,264
public void testPathologicalCaseThatsOkAnyway() { [EOL]     testSame("var x = {};" + "switch (x) { " + "  default: x.y.z = {}; " + "  case (x.y = {}): break;" + "}", NAME_DEFINED_LATE_WARNING); [EOL] } <line_num>: 266,273
public void testOkGlobalDeclExpr() { [EOL]     testSame("var x = {}; /** @type {string} */ x.foo;"); [EOL] } <line_num>: 275,277
public void testBadInterfacePropRef() { [EOL]     testSame("/** @interface */ function F() {}" + "F.bar();", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 279,284
public void testInterfaceFunctionPropRef() { [EOL]     testSame("/** @interface */ function F() {}" + "F.call(); F.hasOwnProperty('z');"); [EOL] } <line_num>: 286,290
public void testObjectPrototypeProperties() { [EOL]     testSame("var x = {}; var y = x.hasOwnProperty('z');"); [EOL] } <line_num>: 292,294
public void testCustomObjectPrototypeProperties() { [EOL]     testSame("Object.prototype.seal = function() {};" + "var x = {}; x.seal();"); [EOL] } <line_num>: 296,299
public void testFunctionPrototypeProperties() { [EOL]     testSame("var x = {}; var y = x.hasOwnProperty('z');"); [EOL] } <line_num>: 301,303
public void testIndirectlyDeclaredProperties() { [EOL]     testSame("Function.prototype.inherits = function(ctor) {" + "  this.superClass_ = ctor;" + "};" + "/** @constructor */ function Foo() {}" + "Foo.prototype.bar = function() {};" + "/** @constructor */ function SubFoo() {}" + "SubFoo.inherits(Foo);" + "SubFoo.superClass_.bar();"); [EOL] } <line_num>: 305,315
public void testGoogInheritsAlias() { [EOL]     testSame("Function.prototype.inherits = function(ctor) {" + "  this.superClass_ = ctor;" + "};" + "/** @constructor */ function Foo() {}" + "Foo.prototype.bar = function() {};" + "/** @constructor */ function SubFoo() {}" + "SubFoo.inherits(Foo);" + "SubFoo.superClass_.bar();"); [EOL] } <line_num>: 317,327
public void testGoogInheritsAlias2() { [EOL]     testSame(CompilerTypeTestCase.CLOSURE_DEFS + "/** @constructor */ function Foo() {}" + "Foo.prototype.bar = function() {};" + "/** @constructor */ function SubFoo() {}" + "goog.inherits(SubFoo, Foo);" + "SubFoo.superClazz();", UNDEFINED_NAME_WARNING); [EOL] } <line_num>: 329,338
