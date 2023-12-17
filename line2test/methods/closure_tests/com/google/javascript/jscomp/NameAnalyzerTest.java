public NameAnalyzerTest() { [EOL]     super(kExterns); [EOL] } <line_num>: 34,36
MarkNoSideEffectCallsAndNameAnalyzerRunner(Compiler compiler) { [EOL]     this.markNoSideEffectCalls = new MarkNoSideEffectCalls(compiler); [EOL]     this.analyzer = new NameAnalyzer(compiler, true); [EOL] } <line_num>: 1935,1938
@Override [EOL] protected void setUp() { [EOL]     super.enableNormalize(); [EOL]     super.enableLineNumberCheck(true); [EOL] } <line_num>: 38,42
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 44,48
public void testRemoveVarDeclaration1() { [EOL]     test("var foo = 3;", ""); [EOL] } <line_num>: 50,52
public void testRemoveVarDeclaration2() { [EOL]     test("var foo = 3, bar = 4; externfoo = foo;", "var foo = 3; externfoo = foo;"); [EOL] } <line_num>: 54,57
public void testRemoveVarDeclaration3() { [EOL]     test("var a = f(), b = 1, c = 2; b; c", "f();var b = 1, c = 2; b; c"); [EOL] } <line_num>: 59,61
public void testRemoveVarDeclaration4() { [EOL]     test("var a = 0, b = f(), c = 2; a; c", "var a = 0;f();var c = 2; a; c"); [EOL] } <line_num>: 63,65
public void testRemoveVarDeclaration5() { [EOL]     test("var a = 0, b = 1, c = f(); a; b", "var a = 0, b = 1; f(); a; b"); [EOL] } <line_num>: 67,69
public void testRemoveVarDeclaration6() { [EOL]     test("var a = 0, b = a = 1; a", "var a = 0; a = 1; a"); [EOL] } <line_num>: 71,73
public void testRemoveVarDeclaration7() { [EOL]     test("var a = 0, b = a = 1", ""); [EOL] } <line_num>: 75,77
public void testRemoveVarDeclaration8() { [EOL]     test("var a;var b = 0, c = a = b = 1", ""); [EOL] } <line_num>: 79,81
public void testRemoveDeclaration1() { [EOL]     test("var a;var b = 0, c = a = b = 1", ""); [EOL] } <line_num>: 84,86
public void testRemoveDeclaration2() { [EOL]     test("var a,b,c; c = a = b = 1", ""); [EOL] } <line_num>: 88,90
public void testRemoveDeclaration3() { [EOL]     test("var a,b,c; c = a = b = {}; a.x = 1;", ""); [EOL] } <line_num>: 92,94
public void testRemoveDeclaration4() { [EOL]     testSame("var a,b,c; c = a = b = {}; a.x = 1;alert(c.x);"); [EOL] } <line_num>: 96,98
public void testRemoveDeclaration5() { [EOL]     test("var a,b,c; c = a = b = null; use(b)", "var b;b=null;use(b)"); [EOL] } <line_num>: 100,102
public void testRemoveDeclaration6() { [EOL]     test("var a,b,c; c = a = b = 'str';use(b)", "var b;b='str';use(b)"); [EOL] } <line_num>: 104,106
public void testRemoveDeclaration7() { [EOL]     test("var a,b,c; c = a = b = true;use(b)", "var b;b=true;use(b)"); [EOL] } <line_num>: 108,110
public void testRemoveFunction1() { [EOL]     test("var foo = function(){};", ""); [EOL] } <line_num>: 112,114
public void testRemoveFunction2() { [EOL]     test("var foo; foo = function(){};", ""); [EOL] } <line_num>: 116,118
public void testRemoveFunction3() { [EOL]     test("var foo = {}; foo.bar = function() {};", ""); [EOL] } <line_num>: 120,122
public void testRemoveFunction4() { [EOL]     test("var a = {}; a.b = {}; a.b.c = function() {};", ""); [EOL] } <line_num>: 124,126
public void testReferredToByWindow() { [EOL]     testSame("var foo = {}; foo.bar = function() {}; window['fooz'] = foo.bar"); [EOL] } <line_num>: 128,130
public void testExtern() { [EOL]     testSame("externfoo = 5"); [EOL] } <line_num>: 132,134
public void testRemoveNamedFunction() { [EOL]     test("function foo(){}", ""); [EOL] } <line_num>: 136,138
public void testRemoveRecursiveFunction1() { [EOL]     test("function f(){f()}", ""); [EOL] } <line_num>: 140,142
public void testRemoveRecursiveFunction2() { [EOL]     test("var f = function (){f()}", ""); [EOL] } <line_num>: 144,146
public void testRemoveRecursiveFunction2a() { [EOL]     test("var f = function g(){g()}", ""); [EOL] } <line_num>: 148,150
public void testRemoveRecursiveFunction3() { [EOL]     test("var f;f = function (){f()}", ""); [EOL] } <line_num>: 152,154
public void testRemoveRecursiveFunction4() { [EOL]     testSame("f = function (){f()}"); [EOL] } <line_num>: 156,159
public void testRemoveRecursiveFunction5() { [EOL]     test("function g(){f()}function f(){g()}", ""); [EOL] } <line_num>: 161,163
public void testRemoveRecursiveFunction6() { [EOL]     test("var f=function(){g()};function g(){f()}", ""); [EOL] } <line_num>: 165,167
public void testRemoveRecursiveFunction7() { [EOL]     test("var g = function(){f()};var f = function(){g()}", ""); [EOL] } <line_num>: 169,171
public void testRemoveRecursiveFunction8() { [EOL]     test("var o = {};o.f = function(){o.f()}", ""); [EOL] } <line_num>: 173,175
public void testRemoveRecursiveFunction9() { [EOL]     testSame("var o = {};o.f = function(){o.f()};o.f()"); [EOL] } <line_num>: 177,179
public void testSideEffectClassification1() { [EOL]     test("foo();", "foo();"); [EOL] } <line_num>: 181,183
public void testSideEffectClassification2() { [EOL]     test("var a = foo();", "foo();"); [EOL] } <line_num>: 185,187
public void testSideEffectClassification3() { [EOL]     testSame("var a = foo();window['b']=a;"); [EOL] } <line_num>: 189,191
public void testSideEffectClassification4() { [EOL]     testSame("function sef(){} sef();"); [EOL] } <line_num>: 193,195
public void testSideEffectClassification5() { [EOL]     testSame("function nsef(){} var a = nsef();window['b']=a;"); [EOL] } <line_num>: 197,199
public void testSideEffectClassification6() { [EOL]     test("function sef(){} sef();", "function sef(){} sef();"); [EOL] } <line_num>: 201,203
public void testSideEffectClassification7() { [EOL]     testSame("function sef(){} var a = sef();window['b']=a;"); [EOL] } <line_num>: 205,207
public void testNoSideEffectAnnotation1() { [EOL]     test("function f(){} var a = f();", "function f(){} f()"); [EOL] } <line_num>: 209,212
public void testNoSideEffectAnnotation2() { [EOL]     test("/**@nosideeffects*/function f(){}", "var a = f();", "", null, null); [EOL] } <line_num>: 214,217
public void testNoSideEffectAnnotation3() { [EOL]     test("var f = function(){}; var a = f();", "var f = function(){}; f();"); [EOL] } <line_num>: 219,222
public void testNoSideEffectAnnotation4() { [EOL]     test("var f = /**@nosideeffects*/function(){};", "var a = f();", "", null, null); [EOL] } <line_num>: 224,227
public void testNoSideEffectAnnotation5() { [EOL]     test("var f; f = function(){}; var a = f();", "var f; f = function(){}; f();"); [EOL] } <line_num>: 229,232
public void testNoSideEffectAnnotation6() { [EOL]     test("var f; f = /**@nosideeffects*/function(){};", "var a = f();", "", null, null); [EOL] } <line_num>: 234,237
public void testNoSideEffectAnnotation7() { [EOL]     test("var f;" + "f = /**@nosideeffects*/function(){};", "f = function(){};" + "var a = f();", "f = function(){}; f();", null, null); [EOL] } <line_num>: 239,245
public void testNoSideEffectAnnotation8() { [EOL]     test("var f;" + "f = function(){};" + "f = /**@nosideeffects*/function(){};", "var a = f();", "f();", null, null); [EOL] } <line_num>: 247,253
public void testNoSideEffectAnnotation9() { [EOL]     test("var f;" + "f = /**@nosideeffects*/function(){};" + "f = /**@nosideeffects*/function(){};", "var a = f();", "", null, null); [EOL]     test("var f; f = /**@nosideeffects*/function(){};", "var a = f();", "", null, null); [EOL] } <line_num>: 255,264
public void testNoSideEffectAnnotation10() { [EOL]     test("var o = {}; o.f = function(){}; var a = o.f();", "var o = {}; o.f = function(){}; o.f();"); [EOL] } <line_num>: 266,269
public void testNoSideEffectAnnotation11() { [EOL]     test("var o = {}; o.f = /**@nosideeffects*/function(){};", "var a = o.f();", "", null, null); [EOL] } <line_num>: 271,274
public void testNoSideEffectAnnotation12() { [EOL]     test("function c(){} var a = new c", "function c(){} new c"); [EOL] } <line_num>: 276,279
public void testNoSideEffectAnnotation13() { [EOL]     test("/**@nosideeffects*/function c(){}", "var a = new c", "", null, null); [EOL] } <line_num>: 281,284
public void testNoSideEffectAnnotation14() { [EOL]     String common = "function c(){};" + "c.prototype.f = /**@nosideeffects*/function(){};"; [EOL]     test(common, "var o = new c; var a = o.f()", "new c", null, null); [EOL] } <line_num>: 286,290
public void testNoSideEffectAnnotation15() { [EOL]     test("function c(){}; c.prototype.f = function(){}; var a = (new c).f()", "function c(){}; c.prototype.f = function(){}; (new c).f()"); [EOL] } <line_num>: 292,295
public void testNoSideEffectAnnotation16() { [EOL]     test("/**@nosideeffects*/function c(){}" + "c.prototype.f = /**@nosideeffects*/function(){};", "var a = (new c).f()", "", null, null); [EOL] } <line_num>: 297,303
public void testFunctionPrototype() { [EOL]     testSame("var a = 5; Function.prototype.foo = function() {return a;}"); [EOL] } <line_num>: 305,307
public void testTopLevelClass1() { [EOL]     test("var Point = function() {}; Point.prototype.foo = function() {}", ""); [EOL] } <line_num>: 309,311
public void testTopLevelClass2() { [EOL]     testSame("var Point = {}; Point.prototype.foo = function() {};" + "externfoo = new Point()"); [EOL] } <line_num>: 313,316
public void testTopLevelClass3() { [EOL]     test("function Point() {this.me_ = Point}", ""); [EOL] } <line_num>: 318,320
public void testTopLevelClass4() { [EOL]     test("function f(){} function A(){} A.prototype = {x: function() {}}; f();", "function f(){} f();"); [EOL] } <line_num>: 322,325
public void testTopLevelClass5() { [EOL]     testSame("function f(){} function A(){}" + "A.prototype = {x: function() { f(); }}; new A();"); [EOL] } <line_num>: 327,330
public void testTopLevelClass6() { [EOL]     testSame("function f(){} function A(){}" + "A.prototype = {x: function() { f(); }}; new A().x();"); [EOL] } <line_num>: 332,335
public void testTopLevelClass7() { [EOL]     test("A.prototype.foo = function(){}; function A() {}", ""); [EOL] } <line_num>: 337,339
public void testNamespacedClass1() { [EOL]     test("var foo = {};foo.bar = {};foo.bar.prototype.baz = {}", ""); [EOL] } <line_num>: 341,343
public void testNamespacedClass2() { [EOL]     testSame("var foo = {};foo.bar = {};foo.bar.prototype.baz = {};" + "window.z = new foo.bar()"); [EOL] } <line_num>: 345,348
public void testNamespacedClass3() { [EOL]     test("var a = {}; a.b = function() {}; a.b.prototype = {x: function() {}};", ""); [EOL] } <line_num>: 350,353
public void testNamespacedClass4() { [EOL]     testSame("function f(){} var a = {}; a.b = function() {};" + "a.b.prototype = {x: function() { f(); }}; new a.b();"); [EOL] } <line_num>: 355,358
public void testNamespacedClass5() { [EOL]     testSame("function f(){} var a = {}; a.b = function() {};" + "a.b.prototype = {x: function() { f(); }}; new a.b().x();"); [EOL] } <line_num>: 360,363
public void testAssignmentToThisPrototype() { [EOL]     testSame("Function.prototype.inherits = function(parentCtor) {" + "  function tempCtor() {};" + "  tempCtor.prototype = parentCtor.prototype;" + "  this.superClass_ = parentCtor.prototype;" + "  this.prototype = new tempCtor();" + "  this.prototype.constructor = this;" + "};"); [EOL] } <line_num>: 365,373
public void testAssignmentToCallResultPrototype() { [EOL]     testSame("function f() { return function(){}; } f().prototype = {};"); [EOL] } <line_num>: 375,377
public void testAssignmentToExternPrototype() { [EOL]     testSame("externfoo.prototype = {};"); [EOL] } <line_num>: 379,381
public void testAssignmentToUnknownPrototype() { [EOL]     testSame("/** @suppress {duplicate} */ var window;" + "window['a'].prototype = {};"); [EOL] } <line_num>: 383,387
public void testBug2099540() { [EOL]     testSame("/** @suppress {duplicate} */ var document;\n" + "/** @suppress {duplicate} */ var window;\n" + "var klass;\n" + "window[klass].prototype = " + "document.createElement(tagName)['__proto__'];"); [EOL] } <line_num>: 389,396
public void testOtherGlobal() { [EOL]     testSame("goog.global.foo = bar(); function bar(){}"); [EOL] } <line_num>: 398,400
public void testExternName1() { [EOL]     testSame("top.z = bar(); function bar(){}"); [EOL] } <line_num>: 402,404
public void testExternName2() { [EOL]     testSame("top['z'] = bar(); function bar(){}"); [EOL] } <line_num>: 406,408
public void testInherits1() { [EOL]     test("var a = {}; var b = {}; b.inherits(a)", ""); [EOL] } <line_num>: 410,412
public void testInherits2() { [EOL]     test("var a = {}; var b = {}; var goog = {}; goog.inherits(b, a)", ""); [EOL] } <line_num>: 414,416
public void testInherits3() { [EOL]     testSame("var a = {}; this.b = {}; b.inherits(a);"); [EOL] } <line_num>: 418,420
public void testInherits4() { [EOL]     testSame("var a = {}; this.b = {}; var goog = {}; goog.inherits(b, a);"); [EOL] } <line_num>: 422,424
public void testInherits5() { [EOL]     test("this.a = {}; var b = {}; b.inherits(a);", "this.a = {}"); [EOL] } <line_num>: 426,429
public void testInherits6() { [EOL]     test("this.a = {}; var b = {}; var goog = {}; goog.inherits(b, a);", "this.a = {}"); [EOL] } <line_num>: 431,434
public void testInherits7() { [EOL]     testSame("var a = {}; this.b = {}; var goog = {};" + " goog.inherits = function() {}; goog.inherits(b, a);"); [EOL] } <line_num>: 436,439
public void testInherits8() { [EOL]     test("this.a = {}; var b = {}; var c = b.inherits(a);", "this.a = {};"); [EOL] } <line_num>: 441,445
public void testMixin1() { [EOL]     testSame("var goog = {}; goog.mixin = function() {};" + "Function.prototype.mixin = function(base) {" + "  goog.mixin(this.prototype, base); " + "};"); [EOL] } <line_num>: 447,452
public void testMixin2() { [EOL]     testSame("var a = {}; this.b = {}; var goog = {};" + " goog.mixin = function() {}; goog.mixin(b.prototype, a.prototype);"); [EOL] } <line_num>: 454,457
public void testMixin3() { [EOL]     test("this.a = {}; var b = {}; var goog = {};" + " goog.mixin = function() {}; goog.mixin(b.prototype, a.prototype);", "this.a = {};"); [EOL] } <line_num>: 459,463
public void testMixin4() { [EOL]     testSame("this.a = {}; var b = {}; var goog = {};" + "goog.mixin = function() {};" + "goog.mixin(b.prototype, a.prototype);" + "new b()"); [EOL] } <line_num>: 465,470
public void testMixin5() { [EOL]     test("this.a = {}; var b = {}; var c = {}; var goog = {};" + "goog.mixin = function() {};" + "goog.mixin(b.prototype, a.prototype);" + "goog.mixin(c.prototype, a.prototype);" + "new b()", "this.a = {}; var b = {}; var goog = {};" + "goog.mixin = function() {};" + "goog.mixin(b.prototype, a.prototype);" + "new b()"); [EOL] } <line_num>: 472,482
public void testMixin6() { [EOL]     testSame("this.a = {}; var b = {}; var c = {}; var goog = {};" + "goog.mixin = function() {};" + "goog.mixin(c.prototype, a.prototype) + " + "goog.mixin(b.prototype, a.prototype);" + "new b()"); [EOL] } <line_num>: 484,490
public void testMixin7() { [EOL]     test("this.a = {}; var b = {}; var c = {}; var goog = {};" + "goog.mixin = function() {};" + "var d = goog.mixin(c.prototype, a.prototype) + " + "goog.mixin(b.prototype, a.prototype);" + "new b()", "this.a = {}; var b = {}; var goog = {};" + "goog.mixin = function() {};" + "goog.mixin(b.prototype, a.prototype);" + "new b()"); [EOL] } <line_num>: 492,502
public void testConstants1() { [EOL]     testSame("var bar = function(){}; var EXP_FOO = true; if (EXP_FOO) bar();"); [EOL] } <line_num>: 504,506
public void testConstants2() { [EOL]     test("var bar = function(){}; var EXP_FOO = true; var EXP_BAR = true;" + "if (EXP_FOO) bar();", "var bar = function(){}; var EXP_FOO = true; if (EXP_FOO) bar();"); [EOL] } <line_num>: 508,512
public void testExpressions1() { [EOL]     test("var foo={}; foo.A='A'; foo.AB=foo.A+'B'; foo.ABC=foo.AB+'C'", ""); [EOL] } <line_num>: 514,517
public void testExpressions2() { [EOL]     testSame("var foo={}; foo.A='A'; foo.AB=foo.A+'B'; this.ABC=foo.AB+'C'"); [EOL] } <line_num>: 519,521
public void testExpressions3() { [EOL]     testSame("var foo = 2; window.bar(foo + 3)"); [EOL] } <line_num>: 523,525
public void testSetCreatingReference() { [EOL]     testSame("var foo; var bar = function(){foo=6;}; bar();"); [EOL] } <line_num>: 527,529
public void testAnonymous1() { [EOL]     testSame("function foo() {}; function bar() {}; foo(function() {bar()})"); [EOL] } <line_num>: 531,533
public void testAnonymous2() { [EOL]     test("var foo;(function(){foo=6;})()", "(function(){})()"); [EOL] } <line_num>: 535,537
public void testAnonymous3() { [EOL]     testSame("var foo; (function(){ if(!foo)foo=6; })()"); [EOL] } <line_num>: 539,541
public void testAnonymous4() { [EOL]     testSame("var foo; (function(){ foo=6; })(); externfoo=foo;"); [EOL] } <line_num>: 543,545
public void testAnonymous5() { [EOL]     testSame("var foo;" + "(function(){ foo=function(){ bar() }; function bar(){} })();" + "foo();"); [EOL] } <line_num>: 547,551
public void testAnonymous6() { [EOL]     testSame("function foo(){}" + "function bar(){}" + "foo(function(){externfoo = bar});"); [EOL] } <line_num>: 553,557
public void testAnonymous7() { [EOL]     testSame("var foo;" + "(function (){ function bar(){ externfoo = foo; } bar(); })();"); [EOL] } <line_num>: 559,562
public void testAnonymous8() { [EOL]     testSame("var foo;" + "(function (){ var g=function(){ externfoo = foo; }; g(); })();"); [EOL] } <line_num>: 564,567
public void testAnonymous9() { [EOL]     testSame("function foo(){}" + "function bar(){}" + "foo(function(){ function baz(){ externfoo = bar; } baz(); });"); [EOL] } <line_num>: 569,573
public void testFunctions1() { [EOL]     testSame("var foo = null; function baz() {}" + "function bar() {foo=baz();} bar();"); [EOL] } <line_num>: 575,578
public void testFunctions2() { [EOL]     testSame("var foo; foo = function() {var a = bar()};" + "var bar = function(){}; foo();"); [EOL] } <line_num>: 580,583
public void testGetElem1() { [EOL]     testSame("var foo = {}; foo.bar = {}; foo.bar.baz = {a: 5, b: 10};" + "var fn = function() {window[foo.bar.baz.a] = 5;}; fn()"); [EOL] } <line_num>: 585,588
public void testGetElem2() { [EOL]     testSame("var foo = {}; foo.bar = {}; foo.bar.baz = {a: 5, b: 10};" + "var fn = function() {this[foo.bar.baz.a] = 5;}; fn()"); [EOL] } <line_num>: 590,593
public void testGetElem3() { [EOL]     testSame("var foo = {'i': 0, 'j': 1}; foo['k'] = 2; top.foo = foo;"); [EOL] } <line_num>: 595,597
public void testIf1() { [EOL]     test("var foo = {};if(e)foo.bar=function(){};", "if(e);"); [EOL] } <line_num>: 599,601
public void testIf2() { [EOL]     test("var e = false;var foo = {};if(e)foo.bar=function(){};", "var e = false;if(e);"); [EOL] } <line_num>: 603,606
public void testIf3() { [EOL]     test("var e = false;var foo = {};if(e + 1)foo.bar=function(){};", "var e = false;if(e + 1);"); [EOL] } <line_num>: 608,611
public void testIf4() { [EOL]     test("var e = false, f;var foo = {};if(f=e)foo.bar=function(){};", "var e = false;if(e);"); [EOL] } <line_num>: 613,616
public void testIf4a() { [EOL]     testSame("var e = [], f;if(f=e);f[0] = 1;"); [EOL] } <line_num>: 618,621
public void testIf4b() { [EOL]     test("var e = [], f;if(e=f);f[0] = 1;", "var f;if(f);f[0] = 1;"); [EOL] } <line_num>: 623,627
public void testIf4c() { [EOL]     test("var e = [], f;if(f=e);e[0] = 1;", "var e = [];if(e);e[0] = 1;"); [EOL] } <line_num>: 629,632
public void testIf5() { [EOL]     test("var e = false, f;var foo = {};if(f = e + 1)foo.bar=function(){};", "var e = false;if(e + 1);"); [EOL] } <line_num>: 634,637
public void testIfElse() { [EOL]     test("var foo = {};if(e)foo.bar=function(){};else foo.bar=function(){};", "if(e);else;"); [EOL] } <line_num>: 639,642
public void testWhile() { [EOL]     test("var foo = {};while(e)foo.bar=function(){};", "while(e);"); [EOL] } <line_num>: 644,646
public void testFor() { [EOL]     test("var foo = {};for(e in x)foo.bar=function(){};", "for(e in x);"); [EOL] } <line_num>: 648,650
public void testDo() { [EOL]     test("var cond = false;do {var a = 1} while (cond)", "var cond = false;do {} while (cond)"); [EOL] } <line_num>: 652,655
public void testSetterInForStruct1() { [EOL]     test("var j = 0; for (var i = 1; i = 0; j++);", "var j = 0; for (; 0; j++);"); [EOL] } <line_num>: 657,660
public void testSetterInForStruct2() { [EOL]     test("var Class = function() {}; " + "for (var i = 1; Class.prototype.property_ = 0; i++);", "for (var i = 1; 0; i++);"); [EOL] } <line_num>: 662,666
public void testSetterInForStruct3() { [EOL]     test("var j = 0; for (var i = 1 + f() + g() + h(); i = 0; j++);", "var j = 0; f(); g(); h(); for (; 0; j++);"); [EOL] } <line_num>: 668,671
public void testSetterInForStruct4() { [EOL]     test("var i = 0;var j = 0; for (i = 1 + f() + g() + h(); i = 0; j++);", "var j = 0; f(); g(); h(); for (; 0; j++);"); [EOL] } <line_num>: 673,676
public void testSetterInForStruct5() { [EOL]     test("var i = 0, j = 0; for (i = f(), j = g(); 0;);", "for (f(), g(); 0;);"); [EOL] } <line_num>: 678,681
public void testSetterInForStruct6() { [EOL]     test("var i = 0, j = 0, k = 0; for (i = f(), j = g(), k = h(); i = 0;);", "for (f(), g(), h(); 0;);"); [EOL] } <line_num>: 683,686
public void testSetterInForStruct7() { [EOL]     test("var i = 0, j = 0, k = 0; for (i = 1, j = 2, k = 3; i = 0;);", "for (1, 2, 3; 0;);"); [EOL] } <line_num>: 688,691
public void testSetterInForStruct8() { [EOL]     test("var i = 0, j = 0, k = 0; for (i = 1, j = i, k = 2; i = 0;);", "var i = 0; for(i = 1, i , 2; i = 0;);"); [EOL] } <line_num>: 693,696
public void testSetterInForStruct9() { [EOL]     test("var Class = function() {}; " + "for (var i = 1; Class.property_ = 0; i++);", "for (var i = 1; 0; i++);"); [EOL] } <line_num>: 698,702
public void testSetterInForStruct10() { [EOL]     test("var Class = function() {}; " + "for (var i = 1; Class.property_ = 0; i = 2);", "for (; 0;);"); [EOL] } <line_num>: 704,708
public void testSetterInForStruct11() { [EOL]     test("var Class = function() {}; " + "for (;Class.property_ = 0;);", "for (;0;);"); [EOL] } <line_num>: 710,714
public void testSetterInForStruct12() { [EOL]     test("var a = 1; var Class = function() {}; " + "for (;Class.property_ = a;);", "var a = 1; for (; a;);"); [EOL] } <line_num>: 716,720
public void testSetterInForStruct13() { [EOL]     test("var a = 1; var Class = function() {}; " + "for (Class.property_ = a; 0 ;);", "for (; 0;);"); [EOL] } <line_num>: 722,726
public void testSetterInForStruct14() { [EOL]     test("var a = 1; var Class = function() {}; " + "for (; 0; Class.property_ = a);", "for (; 0;);"); [EOL] } <line_num>: 728,732
public void testSetterInForStruct15() { [EOL]     test("var Class = function() {}; " + "for (var i = 1; 0; Class.prototype.property_ = 0);", "for (; 0; 0);"); [EOL] } <line_num>: 734,738
public void testSetterInForStruct16() { [EOL]     test("var Class = function() {}; " + "for (var i = 1; i = 0; Class.prototype.property_ = 0);", "for (; 0; 0);"); [EOL] } <line_num>: 740,744
public void testSetterInForIn1() { [EOL]     test("var foo = {}; var bar; for(e in bar = foo.a);", "var foo = {}; for(e in foo.a);"); [EOL] } <line_num>: 746,749
public void testSetterInForIn2() { [EOL]     testSame("var foo = {}; var bar; for(e in bar = foo.a); bar"); [EOL] } <line_num>: 751,753
public void testSetterInForIn3() { [EOL]     testSame("var foo = {}; var bar; for(e in bar = foo.a); bar.b = 3"); [EOL] } <line_num>: 755,757
public void testSetterInForIn4() { [EOL]     testSame("var foo = {}; var bar; for (e in bar = foo.a); bar.b = 3; foo.a"); [EOL] } <line_num>: 759,761
public void testSetterInForIn5() { [EOL]     test("var foo = {}; var bar; for (e in foo.a) { bar = e } bar.b = 3; foo.a", "var foo={};for(e in foo.a);foo.a"); [EOL] } <line_num>: 763,768
public void testSetterInForIn6() { [EOL]     testSame("var foo = {};for(e in foo);"); [EOL] } <line_num>: 770,772
public void testSetterInIfPredicate() { [EOL]     testSame("var a = 1;" + "var Class = function() {}; " + "if (Class.property_ = a);"); [EOL] } <line_num>: 774,779
public void testSetterInWhilePredicate() { [EOL]     test("var a = 1;" + "var Class = function() {}; " + "while (Class.property_ = a);", "var a = 1; for (;a;) {}"); [EOL] } <line_num>: 781,786
public void testSetterInDoWhilePredicate() { [EOL]     testSame("var a = 1;" + "var Class = function() {}; " + "do {} while(Class.property_ = a);"); [EOL] } <line_num>: 788,793
public void testSetterInSwitchInput() { [EOL]     testSame("var a = 1;" + "var Class = function() {}; " + "switch (Class.property_ = a) {" + "  default:" + "}"); [EOL] } <line_num>: 795,802
public void testComplexAssigns() { [EOL]     testSame("var x = 0; x += 3; x *= 5;"); [EOL] } <line_num>: 804,807
public void testNestedAssigns1() { [EOL]     test("var x = 0; var y = x = 3; window.alert(y);", "var y = 3; window.alert(y);"); [EOL] } <line_num>: 809,812
public void testNestedAssigns2() { [EOL]     testSame("var x = 0; var y = x = {}; x.b = 3; window.alert(y);"); [EOL] } <line_num>: 814,816
public void testComplexNestedAssigns1() { [EOL]     testSame("var x = 0; var y = 2; y += x = 3; window.alert(x);"); [EOL] } <line_num>: 818,821
public void testComplexNestedAssigns2() { [EOL]     test("var x = 0; var y = 2; y += x = 3; window.alert(y);", "var y = 2; y += 3; window.alert(y);"); [EOL] } <line_num>: 823,826
public void testComplexNestedAssigns3() { [EOL]     test("var x = 0; var y = x += 3; window.alert(x);", "var x = 0; x += 3; window.alert(x);"); [EOL] } <line_num>: 828,831
public void testComplexNestedAssigns4() { [EOL]     testSame("var x = 0; var y = x += 3; window.alert(y);"); [EOL] } <line_num>: 833,835
public void testUnintendedUseOfInheritsInLocalScope1() { [EOL]     testSame("goog.mixin = function() {}; " + "(function() { var x = {}; var y = {}; goog.mixin(x, y); })();"); [EOL] } <line_num>: 837,840
public void testUnintendedUseOfInheritsInLocalScope2() { [EOL]     testSame("goog.mixin = function() {}; " + "var x = {}; var y = {}; (function() { goog.mixin(x, y); })();"); [EOL] } <line_num>: 842,845
public void testUnintendedUseOfInheritsInLocalScope3() { [EOL]     testSame("goog.mixin = function() {}; " + "var x = {}; var y = {}; (function() { goog.mixin(x, y); })(); " + "window.alert(x);"); [EOL] } <line_num>: 847,851
public void testUnintendedUseOfInheritsInLocalScope4() { [EOL]     testSame("var goog$mixin = function() {}; " + "(function() { var x = {}; var y = {}; goog$mixin(x, y); })();"); [EOL] } <line_num>: 853,858
public void testPrototypePropertySetInLocalScope1() { [EOL]     testSame("(function() { var x = function(){}; x.prototype.bar = 3; })();"); [EOL] } <line_num>: 860,862
public void testPrototypePropertySetInLocalScope2() { [EOL]     testSame("var x = function(){}; (function() { x.prototype.bar = 3; })();"); [EOL] } <line_num>: 864,866
public void testPrototypePropertySetInLocalScope3() { [EOL]     test("var x = function(){ x.prototype.bar = 3; };", ""); [EOL] } <line_num>: 868,870
public void testPrototypePropertySetInLocalScope4() { [EOL]     test("var x = {}; x.foo = function(){ x.foo.prototype.bar = 3; };", ""); [EOL] } <line_num>: 872,874
public void testPrototypePropertySetInLocalScope5() { [EOL]     test("var x = {}; x.prototype.foo = 3;", ""); [EOL] } <line_num>: 876,878
public void testPrototypePropertySetInLocalScope6() { [EOL]     testSame("var x = {}; x.prototype.foo = 3; bar(x.prototype.foo)"); [EOL] } <line_num>: 880,882
public void testPrototypePropertySetInLocalScope7() { [EOL]     testSame("var x = {}; x.foo = 3; bar(x.foo)"); [EOL] } <line_num>: 884,886
public void testRValueReference1() { [EOL]     testSame("var a = 1; a"); [EOL] } <line_num>: 888,890
public void testRValueReference2() { [EOL]     testSame("var a = 1; 1+a"); [EOL] } <line_num>: 892,894
public void testRValueReference3() { [EOL]     testSame("var x = {}; x.prototype.foo = 3; var a = x.prototype.foo; 1+a"); [EOL] } <line_num>: 896,898
public void testRValueReference4() { [EOL]     testSame("var x = {}; x.prototype.foo = 3; x.prototype.foo"); [EOL] } <line_num>: 900,902
public void testRValueReference5() { [EOL]     testSame("var x = {}; x.prototype.foo = 3; 1+x.prototype.foo"); [EOL] } <line_num>: 904,906
public void testRValueReference6() { [EOL]     testSame("var x = {}; var idx = 2; x[idx]"); [EOL] } <line_num>: 908,910
public void testUnhandledTopNode() { [EOL]     testSame("function Foo() {}; Foo.prototype.isBar = function() {};" + "function Bar() {}; Bar.prototype.isFoo = function() {};" + "var foo = new Foo(); var bar = new Bar();" + "var cond = foo.isBar() && bar.isFoo();" + "if (cond) {window.alert('hello');}"); [EOL] } <line_num>: 912,920
public void testPropertyDefinedInGlobalScope() { [EOL]     testSame("function Foo() {}; var x = new Foo(); x.cssClass = 'bar';" + "window.alert(x);"); [EOL] } <line_num>: 922,925
public void testConditionallyDefinedFunction1() { [EOL]     testSame("var g; externfoo.x || (externfoo.x = function() { g; })"); [EOL] } <line_num>: 927,929
public void testConditionallyDefinedFunction2() { [EOL]     testSame("var g; 1 || (externfoo.x = function() { g; })"); [EOL] } <line_num>: 931,933
public void testConditionallyDefinedFunction3() { [EOL]     testSame("var a = {};" + "rand() % 2 || (a.f = function() { externfoo = 1; } || alert());"); [EOL] } <line_num>: 935,938
public void testGetElemOnThis() { [EOL]     testSame("var a = 3; this['foo'] = a;"); [EOL]     testSame("this['foo'] = 3;"); [EOL] } <line_num>: 940,943
public void testRemoveInstanceOfOnly() { [EOL]     test("function Foo() {}; Foo.prototype.isBar = function() {};" + "var x; if (x instanceof Foo) { window.alert(x); }", ";var x; if (false) { window.alert(x); }"); [EOL] } <line_num>: 945,949
public void testRemoveLocalScopedInstanceOfOnly() { [EOL]     test("function Foo() {}; function Bar(x) { this.z = x instanceof Foo; };" + "externfoo.x = new Bar({});", ";function Bar(x) { this.z = false }; externfoo.x = new Bar({});"); [EOL] } <line_num>: 951,955
public void testRemoveInstanceOfWithReferencedMethod() { [EOL]     test("function Foo() {}; Foo.prototype.isBar = function() {};" + "var x; if (x instanceof Foo) { window.alert(x.isBar()); }", ";var x; if (false) { window.alert(x.isBar()); }"); [EOL] } <line_num>: 957,961
public void testDoNotChangeReferencedInstanceOf() { [EOL]     testSame("function Foo() {}; Foo.prototype.isBar = function() {};" + "var x = new Foo(); if (x instanceof Foo) { window.alert(x); }"); [EOL] } <line_num>: 963,966
public void testDoNotChangeReferencedLocalScopedInstanceOf() { [EOL]     testSame("function Foo() {}; externfoo.x = new Foo();" + "function Bar() { if (x instanceof Foo) { window.alert(x); } };" + "externfoo.y = new Bar();"); [EOL] } <line_num>: 968,972
public void testDoNotChangeLocalScopeReferencedInstanceOf() { [EOL]     testSame("function Foo() {}; Foo.prototype.isBar = function() {};" + "function Bar() { this.z = new Foo(); }; externfoo.x = new Bar();" + "if (x instanceof Foo) { window.alert(x); }"); [EOL] } <line_num>: 974,978
public void testDoNotChangeLocalScopeReferencedLocalScopedInstanceOf() { [EOL]     testSame("function Foo() {}; Foo.prototype.isBar = function() {};" + "function Bar() { this.z = new Foo(); };" + "Bar.prototype.func = function(x) {" + "if (x instanceof Foo) { window.alert(x); }" + "}; new Bar().func();"); [EOL] } <line_num>: 980,986
public void testDoNotChangeLocalScopeReferencedLocalScopedInstanceOf2() { [EOL]     test("function Foo() {}" + "var createAxis = function(f) { return window.passThru(f); };" + "var axis = createAxis(function(test) {" + "  return test instanceof Foo;" + "});", "var createAxis = function(f) { return window.passThru(f); };" + "createAxis(function(test) {" + "  return false;" + "});"); [EOL] } <line_num>: 988,999
public void testDoNotChangeInstanceOfGetElem() { [EOL]     testSame("var goog = {};" + "function f(obj, name) {" + "  if (obj instanceof goog[name]) {" + "    return name;" + "  }" + "}" + "window['f'] = f;"); [EOL] } <line_num>: 1001,1009
public void testWeirdnessOnLeftSideOfPrototype() { [EOL]     testSame("var x = 3; " + "(function() { this.bar = 3; }).z = function() {" + "  return x;" + "};"); [EOL] } <line_num>: 1011,1018
public void testShortCircuit1() { [EOL]     test("var a = b() || 1", "b()"); [EOL] } <line_num>: 1020,1022
public void testShortCircuit2() { [EOL]     test("var a = 1 || c()", "1 || c()"); [EOL] } <line_num>: 1024,1026
public void testShortCircuit3() { [EOL]     test("var a = b() || c()", "b() || c()"); [EOL] } <line_num>: 1028,1030
public void testShortCircuit4() { [EOL]     test("var a = b() || 3 || c()", "b() || 3 || c()"); [EOL] } <line_num>: 1032,1034
public void testShortCircuit5() { [EOL]     test("var a = b() && 1", "b()"); [EOL] } <line_num>: 1036,1038
public void testShortCircuit6() { [EOL]     test("var a = 1 && c()", "1 && c()"); [EOL] } <line_num>: 1040,1042
public void testShortCircuit7() { [EOL]     test("var a = b() && c()", "b() && c()"); [EOL] } <line_num>: 1044,1046
public void testShortCircuit8() { [EOL]     test("var a = b() && 3 && c()", "b() && 3 && c()"); [EOL] } <line_num>: 1048,1050
public void testRhsReference1() { [EOL]     testSame("var a = 1; a"); [EOL] } <line_num>: 1052,1054
public void testRhsReference2() { [EOL]     testSame("var a = 1; a || b()"); [EOL] } <line_num>: 1056,1058
public void testRhsReference3() { [EOL]     testSame("var a = 1; 1 || a"); [EOL] } <line_num>: 1060,1062
public void testRhsReference4() { [EOL]     test("var a = 1; var b = a || foo()", "var a = 1; a || foo()"); [EOL] } <line_num>: 1064,1066
public void testRhsReference5() { [EOL]     test("var a = 1, b = 5; a; foo(b)", "var a = 1, b = 5; a; foo(b)"); [EOL] } <line_num>: 1068,1070
public void testRhsAssign1() { [EOL]     test("var foo, bar; foo || (bar = 1)", "var foo; foo || 1"); [EOL] } <line_num>: 1072,1075
public void testRhsAssign2() { [EOL]     test("var foo, bar, baz; foo || (baz = bar = 1)", "var foo; foo || 1"); [EOL] } <line_num>: 1077,1080
public void testRhsAssign3() { [EOL]     testSame("var foo = null; foo || (foo = 1)"); [EOL] } <line_num>: 1082,1084
public void testRhsAssign4() { [EOL]     test("var foo = null; foo = (foo || 1)", ""); [EOL] } <line_num>: 1086,1088
public void testRhsAssign5() { [EOL]     test("var a = 3, foo, bar; foo || (bar = a)", "var a = 3, foo; foo || a"); [EOL] } <line_num>: 1090,1092
public void testRhsAssign6() { [EOL]     test("function Foo(){} var foo = null;" + "var f = function () {foo || (foo = new Foo()); return foo}", ""); [EOL] } <line_num>: 1094,1098
public void testRhsAssign7() { [EOL]     testSame("function Foo(){} var foo = null;" + "var f = function () {foo || (foo = new Foo())}; f()"); [EOL] } <line_num>: 1100,1103
public void testRhsAssign8() { [EOL]     testSame("function Foo(){} var foo = null;" + "var f = function () {(foo = new Foo()) || g()}; f()"); [EOL] } <line_num>: 1105,1108
public void testRhsAssign9() { [EOL]     test("function Foo(){} var foo = null;" + "var f = function () {1 + (foo = new Foo()); return foo}", ""); [EOL] } <line_num>: 1110,1114
public void testAssignWithOr1() { [EOL]     testSame("var foo = null;" + "var f = window.a || function () {return foo}; f()"); [EOL] } <line_num>: 1116,1119
public void testAssignWithOr2() { [EOL]     test("var foo = null;" + "var f = window.a || function () {return foo};", "var foo = null"); [EOL] } <line_num>: 1121,1125
public void testAssignWithAnd1() { [EOL]     testSame("var foo = null;" + "var f = window.a && function () {return foo}; f()"); [EOL] } <line_num>: 1127,1130
public void testAssignWithAnd2() { [EOL]     test("var foo = null;" + "var f = window.a && function () {return foo};", "var foo = null;"); [EOL] } <line_num>: 1132,1136
public void testAssignWithHook1() { [EOL]     testSame("function Foo(){} var foo = null;" + "var f = window.a ? " + "    function () {return new Foo()} : function () {return foo}; f()"); [EOL] } <line_num>: 1138,1142
public void testAssignWithHook2() { [EOL]     test("function Foo(){} var foo = null;" + "var f = window.a ? " + "    function () {return new Foo()} : function () {return foo};", ""); [EOL] } <line_num>: 1144,1149
public void testAssignWithHook2a() { [EOL]     test("function Foo(){} var foo = null;" + "var f; f = window.a ? " + "    function () {return new Foo()} : function () {return foo};", ""); [EOL] } <line_num>: 1151,1156
public void testAssignWithHook3() { [EOL]     testSame("function Foo(){} var foo = null; var f = {};" + "f.b = window.a ? " + "    function () {return new Foo()} : function () {return foo}; f.b()"); [EOL] } <line_num>: 1158,1162
public void testAssignWithHook4() { [EOL]     test("function Foo(){} var foo = null; var f = {};" + "f.b = window.a ? " + "    function () {return new Foo()} : function () {return foo};", ""); [EOL] } <line_num>: 1164,1169
public void testAssignWithHook5() { [EOL]     testSame("function Foo(){} var foo = null; var f = {};" + "f.b = window.a ? function () {return new Foo()} :" + "    window.b ? function () {return foo} :" + "    function() { return Foo }; f.b()"); [EOL] } <line_num>: 1171,1176
public void testAssignWithHook6() { [EOL]     test("function Foo(){} var foo = null; var f = {};" + "f.b = window.a ? function () {return new Foo()} :" + "    window.b ? function () {return foo} :" + "    function() { return Foo };", ""); [EOL] } <line_num>: 1178,1184
public void testAssignWithHook7() { [EOL]     testSame("function Foo(){} var foo = null;" + "var f = window.a ? new Foo() : foo;" + "f()"); [EOL] } <line_num>: 1186,1190
public void testAssignWithHook8() { [EOL]     test("function Foo(){} var foo = null;" + "var f = window.a ? new Foo() : foo;", "function Foo(){}" + "window.a && new Foo()"); [EOL] } <line_num>: 1192,1197
public void testAssignWithHook9() { [EOL]     test("function Foo(){} var foo = null; var f = {};" + "f.b = window.a ? new Foo() : foo;", "function Foo(){} window.a && new Foo()"); [EOL] } <line_num>: 1199,1203
public void testAssign1() { [EOL]     test("function Foo(){} var foo = null; var f = {};" + "f.b = window.a;", ""); [EOL] } <line_num>: 1205,1209
public void testAssign2() { [EOL]     test("function Foo(){} var foo = null; var f = {};" + "f.b = window;", ""); [EOL] } <line_num>: 1211,1215
public void testAssign3() { [EOL]     test("var f = {};" + "f.b = window;", ""); [EOL] } <line_num>: 1217,1221
public void testAssign4() { [EOL]     test("function Foo(){} var foo = null; var f = {};" + "f.b = new Foo();", "function Foo(){} new Foo()"); [EOL] } <line_num>: 1223,1227
public void testAssign5() { [EOL]     test("function Foo(){} var foo = null; var f = {};" + "f.b = foo;", ""); [EOL] } <line_num>: 1229,1233
public void testNestedAssign1() { [EOL]     test("var a, b = a = 1, c = 2", ""); [EOL] } <line_num>: 1235,1237
public void testNestedAssign2() { [EOL]     test("var a, b = a = 1; foo(b)", "var b = 1; foo(b)"); [EOL] } <line_num>: 1239,1242
public void testNestedAssign3() { [EOL]     test("var a, b = a = 1; a = b = 2; foo(b)", "var b = 1; b = 2; foo(b)"); [EOL] } <line_num>: 1244,1247
public void testNestedAssign4() { [EOL]     test("var a, b = a = 1; b = a = 2; foo(b)", "var b = 1; b = 2; foo(b)"); [EOL] } <line_num>: 1249,1252
public void testNestedAssign5() { [EOL]     test("var a, b = a = 1; b = a = 2", ""); [EOL] } <line_num>: 1254,1256
public void testNestedAssign15() { [EOL]     test("var a, b, c; c = b = a = 2", ""); [EOL] } <line_num>: 1258,1260
public void testNestedAssign6() { [EOL]     testSame("var a, b, c; a = b = c = 1; foo(a, b, c)"); [EOL] } <line_num>: 1262,1264
public void testNestedAssign7() { [EOL]     testSame("var a = 0; a = i[j] = 1; b(a, i[j])"); [EOL] } <line_num>: 1266,1268
public void testNestedAssign8() { [EOL]     testSame("function f(){" + "this.lockedToken_ = this.lastToken_ = " + "SETPROP_value(this.hiddenInput_, a)}f()"); [EOL] } <line_num>: 1270,1274
public void testRefChain1() { [EOL]     test("var a = 1; var b = a; var c = b; var d = c", ""); [EOL] } <line_num>: 1276,1278
public void testRefChain2() { [EOL]     test("var a = 1; var b = a; var c = b; var d = c || f()", "var a = 1; var b = a; var c = b; c || f()"); [EOL] } <line_num>: 1280,1283
public void testRefChain3() { [EOL]     test("var a = 1; var b = a; var c = b; var d = c + f()", "f()"); [EOL] } <line_num>: 1285,1287
public void testRefChain4() { [EOL]     test("var a = 1; var b = a; var c = b; var d = f() || c", "f()"); [EOL] } <line_num>: 1289,1292
public void testRefChain5() { [EOL]     test("var a = 1; var b = a; var c = b; var d = f() ? g() : c", "f() && g()"); [EOL] } <line_num>: 1294,1297
public void testRefChain6() { [EOL]     test("var a = 1; var b = a; var c = b; var d = c ? f() : g()", "var a = 1; var b = a; var c = b; c ? f() : g()"); [EOL] } <line_num>: 1299,1302
public void testRefChain7() { [EOL]     test("var a = 1; var b = a; var c = b; var d = (b + f()) ? g() : c", "var a = 1; var b = a; (b+f()) && g()"); [EOL] } <line_num>: 1304,1307
public void testRefChain8() { [EOL]     test("var a = 1; var b = a; var c = b; var d = f()[b] ? g() : 0", "var a = 1; var b = a; f()[b] && g()"); [EOL] } <line_num>: 1309,1312
public void testRefChain9() { [EOL]     test("var a = 1; var b = a; var c = 5; var d = f()[b+c] ? g() : 0", "var a = 1; var b = a; var c = 5; f()[b+c] && g()"); [EOL] } <line_num>: 1314,1317
public void testRefChain10() { [EOL]     test("var a = 1; var b = a; var c = b; var d = f()[b] ? g() : 0", "var a = 1; var b = a; f()[b] && g()"); [EOL] } <line_num>: 1319,1322
public void testRefChain11() { [EOL]     test("var a = 1; var b = a; var d = f()[b] ? g() : 0", "var a = 1; var b = a; f()[b] && g()"); [EOL] } <line_num>: 1324,1327
public void testRefChain12() { [EOL]     testSame("var a = 1; var b = a; f()[b] ? g() : 0"); [EOL] } <line_num>: 1329,1331
public void testRefChain13() { [EOL]     test("function f(){}var a = 1; var b = a; var d = f()[b] ? g() : 0", "function f(){}var a = 1; var b = a; f()[b] && g()"); [EOL] } <line_num>: 1334,1337
public void testRefChain14() { [EOL]     testSame("function f(){}var a = 1; var b = a; f()[b] ? g() : 0"); [EOL] } <line_num>: 1339,1341
public void testRefChain15() { [EOL]     test("function f(){}var a = 1, b = a; var c = f(); var d = c[b] ? g() : 0", "function f(){}var a = 1, b = a; var c = f(); c[b] && g()"); [EOL] } <line_num>: 1343,1346
public void testRefChain16() { [EOL]     testSame("function f(){}var a = 1; var b = a; var c = f(); c[b] ? g() : 0"); [EOL] } <line_num>: 1348,1350
public void testRefChain17() { [EOL]     test("function f(){}var a = 1; var b = a; var c = f(); var d = c[b]", "function f(){} f()"); [EOL] } <line_num>: 1352,1355
public void testRefChain18() { [EOL]     testSame("var a = 1; f()[a] && g()"); [EOL] } <line_num>: 1357,1359
public void testRefChain19() { [EOL]     test("var a = 1; var b = [a]; var c = b; b[f()] ? g() : 0", "var a=1; var b=[a]; b[f()] ? g() : 0"); [EOL] } <line_num>: 1362,1365
public void testRefChain20() { [EOL]     test("var a = 1; var b = [a]; var c = b; var d = b[f()] ? g() : 0", "var a=1; var b=[a]; b[f()]&&g()"); [EOL] } <line_num>: 1367,1370
public void testRefChain21() { [EOL]     testSame("var a = 1; var b = 2; var c = a + b; f(c)"); [EOL] } <line_num>: 1372,1374
public void testRefChain22() { [EOL]     test("var a = 2; var b = a = 4; f(a)", "var a = 2; a = 4; f(a)"); [EOL] } <line_num>: 1376,1378
public void testRefChain23() { [EOL]     test("var a = {}; var b = a[1] || f()", "var a = {}; a[1] || f()"); [EOL] } <line_num>: 1380,1382
public void testAssignmentWithComplexLhs() { [EOL]     testSame("function f() { return this; }" + "var o = {'key': 'val'};" + "f().x_ = o['key'];"); [EOL] } <line_num>: 1389,1393
public void testAssignmentWithComplexLhs2() { [EOL]     testSame("function f() { return this; }" + "var o = {'key': 'val'};" + "f().foo = function() {" + "  o" + "};"); [EOL] } <line_num>: 1395,1401
public void testAssignmentWithComplexLhs3() { [EOL]     String source = "var o = {'key': 'val'};" + "function init_() {" + "  this.x = o['key']" + "}"; [EOL]     test(source, ""); [EOL]     testSame(source + ";init_()"); [EOL] } <line_num>: 1403,1412
public void testAssignmentWithComplexLhs4() { [EOL]     testSame("function f() { return this; }" + "var o = {'key': 'val'};" + "f().foo = function() {" + "  this.x = o['key']" + "};"); [EOL] } <line_num>: 1414,1420
public void testNoRemovePrototypeDefinitionsOutsideGlobalScope1() { [EOL]     testSame("function f(arg){}" + "" + "(function(){" + "  var O = {};" + "  O.prototype = 'foo';" + "  f(O);" + "})()"); [EOL] } <line_num>: 1427,1435
public void testNoRemovePrototypeDefinitionsOutsideGlobalScope2() { [EOL]     testSame("function f(arg){}" + "(function h(){" + "  var L = {};" + "  L.prototype = 'foo';" + "  f(L);" + "})()"); [EOL] } <line_num>: 1437,1444
public void testNoRemovePrototypeDefinitionsOutsideGlobalScope4() { [EOL]     testSame("function f(arg){}" + "function g(){" + "  var N = {};" + "  N.prototype = 'foo';" + "  f(N);" + "}" + "g()"); [EOL] } <line_num>: 1446,1454
public void testNoRemovePrototypeDefinitionsOutsideGlobalScope5() { [EOL]     testSame("function g(){ var R = {}; R.prototype = 'foo' } g()"); [EOL] } <line_num>: 1456,1459
public void testRemovePrototypeDefinitionsInGlobalScope1() { [EOL]     testSame("function f(arg){}" + "var M = {};" + "M.prototype = 'foo';" + "f(M);"); [EOL] } <line_num>: 1461,1466
public void testRemovePrototypeDefinitionsInGlobalScope2() { [EOL]     test("var Q = {}; Q.prototype = 'foo'", ""); [EOL] } <line_num>: 1468,1470
public void testRemoveLabeledStatment() { [EOL]     test("LBL: var x = 1;", "LBL: {}"); [EOL] } <line_num>: 1472,1474
public void testRemoveLabeledStatment2() { [EOL]     test("var x; LBL: x = f() + g()", "LBL: { f() ; g()}"); [EOL] } <line_num>: 1476,1478
public void testRemoveLabeledStatment3() { [EOL]     test("var x; LBL: x = 1;", "LBL: {}"); [EOL] } <line_num>: 1480,1482
public void testRemoveLabeledStatment4() { [EOL]     test("var a; LBL: a = f()", "LBL: f()"); [EOL] } <line_num>: 1484,1486
public void testPreservePropertyMutationsToAlias1() { [EOL]     testSame("var a = {}; var b = a; b.x = 1; a"); [EOL] } <line_num>: 1488,1493
public void testPreservePropertyMutationsToAlias2() { [EOL]     test("var a = {}; var b = a; var c = a; b.x = 1; a", "var a = {}; var b = a; b.x = 1; a"); [EOL] } <line_num>: 1495,1499
public void testPreservePropertyMutationsToAlias3() { [EOL]     testSame("var a = {}; var b = a; var c = b; c.x = 1; a"); [EOL] } <line_num>: 1501,1504
public void testPreservePropertyMutationsToAlias4() { [EOL]     testSame("var a = {}; var b = a; b['x'] = 1; a"); [EOL] } <line_num>: 1506,1509
public void testPreservePropertyMutationsToAlias5() { [EOL]     testSame("function testCall(o){}" + "var DATA = {'prop': 'foo','attr': {}};" + "var SUBDATA = DATA['attr'];" + "SUBDATA['subprop'] = 'bar';" + "testCall(DATA);"); [EOL] } <line_num>: 1511,1518
public void testPreservePropertyMutationsToAlias6() { [EOL]     testSame("function testCall(o){}" + "var DATA = {'prop': 'foo','attr': {}};" + "var SUBDATA = DATA['attr'];" + "var SUBSUBDATA = SUBDATA['subprop'];" + "SUBSUBDATA['subsubprop'] = 'bar';" + "testCall(DATA);"); [EOL] } <line_num>: 1520,1528
public void testPreservePropertyMutationsToAlias7() { [EOL]     test("var a = {}; var b = {}; b.x = 0;" + "var goog = {}; goog.inherits(b, a); a", "var a = {}; a"); [EOL] } <line_num>: 1530,1535
public void testPreservePropertyMutationsToAlias8() { [EOL]     test("var a = {};" + "var b = {}; b.x = 0;" + "var c = {}; c.y = 0;" + "var goog = {}; goog.inherits(b, a); goog.inherits(c, a); c", "var a = {}; var c = {}; c.y = 0;" + "var goog = {}; goog.inherits(c, a); c"); [EOL] } <line_num>: 1537,1545
public void testPreservePropertyMutationsToAlias9() { [EOL]     testSame("var a = {b: {}};" + "var c = a.b; c.d = 3;" + "a.d = 3; a.d;"); [EOL] } <line_num>: 1547,1551
public void testRemoveAlias() { [EOL]     test("var a = {b: {}};" + "var c = a.b;" + "a.d = 3; a.d;", "var a = {b: {}}; a.d = 3; a.d;"); [EOL] } <line_num>: 1553,1558
public void testSingletonGetter1() { [EOL]     test("function Foo() {} goog.addSingletonGetter(Foo);", ""); [EOL] } <line_num>: 1560,1562
public void testSingletonGetter2() { [EOL]     test("function Foo() {} goog$addSingletonGetter(Foo);", ""); [EOL] } <line_num>: 1564,1566
public void testSingletonGetter3() { [EOL]     testSame("function Foo() {} goog$addSingletonGetter(Foo);" + "this.x = Foo.getInstance();"); [EOL] } <line_num>: 1568,1572
public void testNoRemoveWindowPropertyAlias1() { [EOL]     testSame("var self_ = window.gbar;\n" + "self_.qs = function() {};"); [EOL] } <line_num>: 1576,1580
public void testNoRemoveWindowPropertyAlias2() { [EOL]     testSame("var self_ = window;\n" + "self_.qs = function() {};"); [EOL] } <line_num>: 1582,1586
public void testNoRemoveWindowPropertyAlias3() { [EOL]     testSame("var self_ = window;\n" + "self_['qs'] = function() {};"); [EOL] } <line_num>: 1588,1592
public void testNoRemoveWindowPropertyAlias4() { [EOL]     test("var self_ = window['gbar'] || {};\n" + "self_.qs = function() {};", ""); [EOL] } <line_num>: 1594,1600
public void testNoRemoveWindowPropertyAlias4a() { [EOL]     test("var self_; self_ = window.gbar || {};\n" + "self_.qs = function() {};", ""); [EOL] } <line_num>: 1602,1608
public void testNoRemoveWindowPropertyAlias5() { [EOL]     test("var self_ = window || {};\n" + "self_['qs'] = function() {};", ""); [EOL] } <line_num>: 1610,1616
public void testNoRemoveWindowPropertyAlias5a() { [EOL]     test("var self_; self_ = window || {};\n" + "self_['qs'] = function() {};", ""); [EOL] } <line_num>: 1618,1624
public void testNoRemoveWindowPropertyAlias6() { [EOL]     testSame("var self_ = (window.gbar = window.gbar || {});\n" + "self_.qs = function() {};"); [EOL] } <line_num>: 1626,1630
public void testNoRemoveWindowPropertyAlias6a() { [EOL]     testSame("var self_; self_ = (window.gbar = window.gbar || {});\n" + "self_.qs = function() {};"); [EOL] } <line_num>: 1632,1636
public void testNoRemoveWindowPropertyAlias7() { [EOL]     testSame("var self_ = (window = window || {});\n" + "self_['qs'] = function() {};"); [EOL] } <line_num>: 1638,1642
public void testNoRemoveWindowPropertyAlias7a() { [EOL]     testSame("var self_; self_ = (window = window || {});\n" + "self_['qs'] = function() {};"); [EOL] } <line_num>: 1644,1648
public void testNoRemoveAlias0() { [EOL]     testSame("var x = {}; function f() { return x; }; " + "f().style.display = 'block';" + "alert(x.style)"); [EOL] } <line_num>: 1650,1655
public void testNoRemoveAlias1() { [EOL]     testSame("var x = {}; function f() { return x; };" + "var map = f();\n" + "map.style.display = 'block';" + "alert(x.style)"); [EOL] } <line_num>: 1657,1663
public void testNoRemoveAlias2() { [EOL]     testSame("var x = {};" + "var map = (function () { return x; })();\n" + "map.style = 'block';" + "alert(x.style)"); [EOL] } <line_num>: 1665,1671
public void testNoRemoveAlias3() { [EOL]     testSame("var x = {}; function f() { return x; };" + "var map = {}\n" + "map[1] = f();\n" + "map[1].style.display = 'block';"); [EOL] } <line_num>: 1673,1679
public void testNoRemoveAliasOfExternal0() { [EOL]     testSame("document.getElementById('foo').style.display = 'block';"); [EOL] } <line_num>: 1681,1684
public void testNoRemoveAliasOfExternal1() { [EOL]     testSame("var map = document.getElementById('foo');\n" + "map.style.display = 'block';"); [EOL] } <line_num>: 1686,1690
public void testNoRemoveAliasOfExternal2() { [EOL]     testSame("var map = {}\n" + "map[1] = document.getElementById('foo');\n" + "map[1].style.display = 'block';"); [EOL] } <line_num>: 1692,1697
public void testNoRemoveThrowReference1() { [EOL]     testSame("var e = {}\n" + "throw e;"); [EOL] } <line_num>: 1699,1703
public void testNoRemoveThrowReference2() { [EOL]     testSame("function e() {}\n" + "throw new e();"); [EOL] } <line_num>: 1705,1709
public void testClassDefinedInObjectLit1() { [EOL]     test("var data = {Foo: function() {}};" + "data.Foo.prototype.toString = function() {};", ""); [EOL] } <line_num>: 1711,1716
public void testClassDefinedInObjectLit2() { [EOL]     test("var data = {}; data.bar = {Foo: function() {}};" + "data.bar.Foo.prototype.toString = function() {};", ""); [EOL] } <line_num>: 1718,1723
public void testClassDefinedInObjectLit3() { [EOL]     test("var data = {bar: {Foo: function() {}}};" + "data.bar.Foo.prototype.toString = function() {};", ""); [EOL] } <line_num>: 1725,1730
public void testClassDefinedInObjectLit4() { [EOL]     test("var data = {};" + "data.baz = {bar: {Foo: function() {}}};" + "data.baz.bar.Foo.prototype.toString = function() {};", ""); [EOL] } <line_num>: 1732,1738
public void testVarReferencedInClassDefinedInObjectLit1() { [EOL]     testSame("var ref = 3;" + "var data = {Foo: function() { this.x = ref; }};" + "window.Foo = data.Foo;"); [EOL] } <line_num>: 1740,1745
public void testVarReferencedInClassDefinedInObjectLit2() { [EOL]     testSame("var ref = 3;" + "var data = {Foo: function() { this.x = ref; }," + "            Bar: function() {}};" + "window.Bar = data.Bar;"); [EOL] } <line_num>: 1747,1753
public void testArrayExt() { [EOL]     testSame("Array.prototype.foo = function() { return 1 };" + "var y = [];" + "switch (y.foo()) {" + "}"); [EOL] } <line_num>: 1755,1761
public void testArrayAliasExt() { [EOL]     testSame("Array$X = Array;" + "Array$X.prototype.foo = function() { return 1 };" + "function Array$X() {}" + "var y = [];" + "switch (y.foo()) {" + "}"); [EOL] } <line_num>: 1763,1771
public void testExternalAliasInstanceof1() { [EOL]     test("Array$X = Array;" + "function Array$X() {}" + "var y = [];" + "if (y instanceof Array) {}", "var y = [];" + "if (y instanceof Array) {}"); [EOL] } <line_num>: 1773,1782
public void testExternalAliasInstanceof2() { [EOL]     testSame("Array$X = Array;" + "function Array$X() {}" + "var y = [];" + "if (y instanceof Array$X) {}"); [EOL] } <line_num>: 1784,1790
public void testExternalAliasInstanceof3() { [EOL]     testSame("var b = Array;" + "var y = [];" + "if (y instanceof b) {}"); [EOL] } <line_num>: 1792,1797
public void testAliasInstanceof4() { [EOL]     testSame("function Foo() {};" + "var b = Foo;" + "var y = new Foo();" + "if (y instanceof b) {}"); [EOL] } <line_num>: 1799,1805
public void testAliasInstanceof5() { [EOL]     test("function Foo() {}" + "function Bar() {}" + "var b = x ? Foo : Bar;" + "var y = new Foo();" + "if (y instanceof b) {}", "function Foo() {}" + "var y = new Foo;" + "if (false){}"); [EOL] } <line_num>: 1807,1818
public void testBrokenNamespaceWithPrototypeAssignment() { [EOL]     test("var x = {}; x.a.prototype = 1", ""); [EOL] } <line_num>: 1822,1824
public void testRemovePrototypeAliases() { [EOL]     test("function g() {}" + "function F() {} F.prototype.bar = g;" + "window.g = g;", "function g() {}" + "window.g = g;"); [EOL] } <line_num>: 1826,1833
public void testIssue284() { [EOL]     test("var goog = {};" + "goog.inherits = function(x, y) {};" + "var ns = {};" + "/** @constructor */" + "ns.PageSelectionModel = function() {};" + "/** @constructor */" + "ns.PageSelectionModel.FooEvent = function() {};" + "/** @constructor */" + "ns.PageSelectionModel.SelectEvent = function() {};" + "goog.inherits(ns.PageSelectionModel.ChangeEvent," + "    ns.PageSelectionModel.FooEvent);", ""); [EOL] } <line_num>: 1835,1849
public void testIssue838a() { [EOL]     testSame("var z = window['z'] || (window['z'] = {});\n" + "z['hello'] = 'Hello';\n" + "z['world'] = 'World';"); [EOL] } <line_num>: 1851,1855
public void testIssue838b() { [EOL]     testSame("var z;" + "window['z'] = z || (z = {});\n" + "z['hello'] = 'Hello';\n" + "z['world'] = 'World';"); [EOL] } <line_num>: 1857,1863
public void testIssue874a() { [EOL]     testSame("var a = a || {};\n" + "var b = a;\n" + "b.View = b.View || {}\n" + "var c = b.View;\n" + "c.Editor = function f(d, e) {\n" + "  return d + e\n" + "};\n" + "window.ImageEditor.View.Editor = a.View.Editor;"); [EOL] } <line_num>: 1866,1876
public void testIssue874b() { [EOL]     testSame("var b;\n" + "var c = b = {};\n" + "c.Editor = function f(d, e) {\n" + "  return d + e\n" + "};\n" + "window['Editor'] = b.Editor;"); [EOL] } <line_num>: 1878,1886
public void testIssue874c() { [EOL]     testSame("var b, c;\n" + "c = b = {};\n" + "c.Editor = function f(d, e) {\n" + "  return d + e\n" + "};\n" + "window['Editor'] = b.Editor;"); [EOL] } <line_num>: 1888,1896
public void testIssue874d() { [EOL]     testSame("var b = {}, c;\n" + "c = b;\n" + "c.Editor = function f(d, e) {\n" + "  return d + e\n" + "};\n" + "window['Editor'] = b.Editor;"); [EOL] } <line_num>: 1898,1906
public void testIssue874e() { [EOL]     testSame("var a;\n" + "var b = a || (a = {});\n" + "var c = b.View || (b.View = {});\n" + "c.Editor = function f(d, e) {\n" + "  return d + e\n" + "};\n" + "window.ImageEditor.View.Editor = a.View.Editor;"); [EOL] } <line_num>: 1908,1917
public void testBug6575051() { [EOL]     testSame("var hackhack = window['__o_o_o__'] = window['__o_o_o__'] || {};\n" + "window['__o_o_o__']['va'] = 1;\n" + "hackhack['Vb'] = 1;"); [EOL] } <line_num>: 1919,1924
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new MarkNoSideEffectCallsAndNameAnalyzerRunner(compiler); [EOL] } <line_num>: 1926,1929
@Override [EOL] public void process(Node externs, Node root) { [EOL]     markNoSideEffectCalls.process(externs, root); [EOL]     analyzer.process(externs, root); [EOL] } <line_num>: 1940,1944
