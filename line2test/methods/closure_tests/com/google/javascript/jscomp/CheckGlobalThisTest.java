public CheckGlobalThisTest() { [EOL]     this.parseTypeInfo = true; [EOL] } <line_num>: 23,25
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new CombinedCompilerPass(compiler, new CheckGlobalThis(compiler)); [EOL] } <line_num>: 27,31
private void testFailure(String js) { [EOL]     testSame(js, CheckGlobalThis.GLOBAL_THIS); [EOL] } <line_num>: 33,35
public void testGlobalThis1() throws Exception { [EOL]     testSame("var a = this;"); [EOL] } <line_num>: 37,39
public void testGlobalThis2() { [EOL]     testFailure("this.foo = 5;"); [EOL] } <line_num>: 41,43
public void testGlobalThis3() { [EOL]     testFailure("this[foo] = 5;"); [EOL] } <line_num>: 45,47
public void testGlobalThis4() { [EOL]     testFailure("this['foo'] = 5;"); [EOL] } <line_num>: 49,51
public void testGlobalThis5() { [EOL]     testFailure("(a = this).foo = 4;"); [EOL] } <line_num>: 53,55
public void testGlobalThis6() { [EOL]     testSame("a = this;"); [EOL] } <line_num>: 57,59
public void testGlobalThis7() { [EOL]     testFailure("var a = this.foo;"); [EOL] } <line_num>: 61,63
public void testStaticFunction1() { [EOL]     testSame("function a() { return this; }"); [EOL] } <line_num>: 65,67
public void testStaticFunction2() { [EOL]     testFailure("function a() { this.complex = 5; }"); [EOL] } <line_num>: 69,71
public void testStaticFunction3() { [EOL]     testSame("var a = function() { return this; }"); [EOL] } <line_num>: 73,75
public void testStaticFunction4() { [EOL]     testFailure("var a = function() { this.foo.bar = 6; }"); [EOL] } <line_num>: 77,79
public void testStaticFunction5() { [EOL]     testSame("function a() { return function() { return this; } }"); [EOL] } <line_num>: 81,83
public void testStaticFunction6() { [EOL]     testSame("function a() { return function() { this.x = 8; } }"); [EOL] } <line_num>: 85,87
public void testStaticFunction7() { [EOL]     testSame("var a = function() { return function() { this.x = 8; } }"); [EOL] } <line_num>: 89,91
public void testStaticFunction8() { [EOL]     testFailure("var a = function() { return this.foo; };"); [EOL] } <line_num>: 93,95
public void testConstructor1() { [EOL]     testSame("/** @constructor */function A() { this.m2 = 5; }"); [EOL] } <line_num>: 97,99
public void testConstructor2() { [EOL]     testSame("/** @constructor */var A = function() { this.m2 = 5; }"); [EOL] } <line_num>: 101,103
public void testConstructor3() { [EOL]     testSame("/** @constructor */a.A = function() { this.m2 = 5; }"); [EOL] } <line_num>: 105,107
public void testInterface1() { [EOL]     testSame("/** @interface */function A() { /** @type {string} */ this.m2; }"); [EOL] } <line_num>: 109,112
public void testOverride1() { [EOL]     testSame("/** @constructor */function A() { } var a = new A();" + "/** @override */ a.foo = function() { this.bar = 5; };"); [EOL] } <line_num>: 114,117
public void testThisJSDoc1() throws Exception { [EOL]     testSame("/** @this whatever */function h() { this.foo = 56; }"); [EOL] } <line_num>: 119,121
public void testThisJSDoc2() throws Exception { [EOL]     testSame("/** @this whatever */var h = function() { this.foo = 56; }"); [EOL] } <line_num>: 123,125
public void testThisJSDoc3() throws Exception { [EOL]     testSame("/** @this whatever */foo.bar = function() { this.foo = 56; }"); [EOL] } <line_num>: 127,129
public void testThisJSDoc4() throws Exception { [EOL]     testSame("/** @this whatever */function f() { this.foo = 56; }"); [EOL] } <line_num>: 131,133
public void testThisJSDoc5() throws Exception { [EOL]     testSame("function a() { /** @this x */function f() { this.foo = 56; } }"); [EOL] } <line_num>: 135,137
public void testMethod1() { [EOL]     testSame("A.prototype.m1 = function() { this.m2 = 5; }"); [EOL] } <line_num>: 139,141
public void testMethod2() { [EOL]     testSame("a.B.prototype.m1 = function() { this.m2 = 5; }"); [EOL] } <line_num>: 143,145
public void testMethod3() { [EOL]     testSame("a.b.c.D.prototype.m1 = function() { this.m2 = 5; }"); [EOL] } <line_num>: 147,149
public void testMethod4() { [EOL]     testSame("a.prototype['x' + 'y'] =  function() { this.foo = 3; };"); [EOL] } <line_num>: 151,153
public void testPropertyOfMethod() { [EOL]     testFailure("a.protoype.b = {}; " + "a.prototype.b.c = function() { this.foo = 3; };"); [EOL] } <line_num>: 155,158
public void testStaticMethod1() { [EOL]     testFailure("a.b = function() { this.m2 = 5; }"); [EOL] } <line_num>: 160,162
public void testStaticMethod2() { [EOL]     testSame("a.b = function() { return function() { this.m2 = 5; } }"); [EOL] } <line_num>: 164,166
public void testStaticMethod3() { [EOL]     testSame("a.b.c = function() { return function() { this.m2 = 5; } }"); [EOL] } <line_num>: 168,170
public void testMethodInStaticFunction() { [EOL]     testSame("function f() { A.prototype.m1 = function() { this.m2 = 5; } }"); [EOL] } <line_num>: 172,174
public void testStaticFunctionInMethod1() { [EOL]     testSame("A.prototype.m1 = function() { function me() { this.m2 = 5; } }"); [EOL] } <line_num>: 176,178
public void testStaticFunctionInMethod2() { [EOL]     testSame("A.prototype.m1 = function() {" + "  function me() {" + "    function myself() {" + "      function andI() { this.m2 = 5; } } } }"); [EOL] } <line_num>: 180,185
public void testInnerFunction1() { [EOL]     testFailure("function f() { function g() { return this.x; } }"); [EOL] } <line_num>: 187,189
public void testInnerFunction2() { [EOL]     testFailure("function f() { var g = function() { return this.x; } }"); [EOL] } <line_num>: 191,193
public void testInnerFunction3() { [EOL]     testFailure("function f() { var x = {}; x.y = function() { return this.x; } }"); [EOL] } <line_num>: 195,198
public void testInnerFunction4() { [EOL]     testSame("function f() { var x = {}; x.y(function() { return this.x; }); }"); [EOL] } <line_num>: 200,203
public void testIssue182a() { [EOL]     testFailure("var NS = {read: function() { return this.foo; }};"); [EOL] } <line_num>: 205,207
public void testIssue182b() { [EOL]     testFailure("var NS = {write: function() { this.foo = 3; }};"); [EOL] } <line_num>: 209,211
public void testIssue182c() { [EOL]     testFailure("var NS = {}; NS.write2 = function() { this.foo = 3; };"); [EOL] } <line_num>: 213,215
public void testIssue182d() { [EOL]     testSame("function Foo() {} " + "Foo.prototype = {write: function() { this.foo = 3; }};"); [EOL] } <line_num>: 217,220
public void testLendsAnnotation1() { [EOL]     testFailure("/** @constructor */ function F() {}" + "dojo.declare(F, {foo: function() { return this.foo; }});"); [EOL] } <line_num>: 222,225
public void testLendsAnnotation2() { [EOL]     testFailure("/** @constructor */ function F() {}" + "dojo.declare(F, /** @lends {F.bar} */ (" + "    {foo: function() { return this.foo; }}));"); [EOL] } <line_num>: 227,231
public void testLendsAnnotation3() { [EOL]     testSame("/** @constructor */ function F() {}" + "dojo.declare(F, /** @lends {F.prototype} */ (" + "    {foo: function() { return this.foo; }}));"); [EOL] } <line_num>: 233,237
public void testSuppressWarning() { [EOL]     testFailure("var x = function() { this.complex = 5; };"); [EOL]     testSame("/** @suppress {globalThis} */" + "var x = function() { this.complex = 5; };"); [EOL] } <line_num>: 239,243
