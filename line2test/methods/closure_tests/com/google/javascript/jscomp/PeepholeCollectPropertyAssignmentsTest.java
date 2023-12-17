@Override [EOL] protected CompilerPass getProcessor(final Compiler compiler) { [EOL]     return new PeepholeOptimizationsPass(compiler, new PeepholeCollectPropertyAssignments()); [EOL] } <line_num>: 21,25
public final void testArrayOptimization1() { [EOL]     test("var a = []; a[0] = 1; a[1] = 2; a[2] = 3;", "var a = [1, 2, 3];"); [EOL] } <line_num>: 27,30
public final void testArrayOptimization2() { [EOL]     test("var a; a = []; a[0] = 1; a[1] = 2; a[2] = 3;", "var a; a = [1, 2, 3];"); [EOL] } <line_num>: 32,35
public final void testArrayOptimization3() { [EOL]     testSame("var a; a.b = []; a.b[0] = 1; a.b[1] = 2; a.b[2] = 3;"); [EOL] } <line_num>: 37,39
public final void testCompoundAssignment() { [EOL]     testSame("var x, a; a = []; a[0] *= x;"); [EOL] } <line_num>: 41,43
public final void testNegativeArrayIndex1() { [EOL]     testSame("var a = []; a[-1] = 1;"); [EOL] } <line_num>: 45,47
public final void testNegativeArrayIndex2() { [EOL]     testSame("var a; a = []; a[-1] = 1;"); [EOL] } <line_num>: 49,51
public final void testFractionalArrayIndex1() { [EOL]     testSame("var a = []; a[0.5] = 1;"); [EOL] } <line_num>: 53,55
public final void testFractionalArrayIndex2() { [EOL]     testSame("var a; a = []; a[0.5] = 1;"); [EOL] } <line_num>: 57,59
public final void testArrayOptimizationOfPartiallyBuiltArray1() { [EOL]     test("var a = [1, 2]; a[2] = 3;", "var a = [1, 2, 3];"); [EOL] } <line_num>: 61,64
public final void testArrayOptimizationOfPartiallyBuiltArray2() { [EOL]     test("var a; a = [1, 2]; a[2] = 3;", "var a; a = [1, 2, 3];"); [EOL] } <line_num>: 66,69
public final void testArrayOptimizationWithAHole1() { [EOL]     test("var a = []; a[0] = 1; a[1] = 2; a[3] = 4;", "var a = [1, 2, , 4];"); [EOL] } <line_num>: 71,74
public final void testArrayOptimizationWithAHole2() { [EOL]     test("var a; a = []; a[0] = 1; a[1] = 2; a[3] = 4;", "var a; a = [1, 2, , 4];"); [EOL] } <line_num>: 76,79
public final void testEarlyUsage1() { [EOL]     testSame("function c() {return sum(a)};" + "var a = [1,2,3];" + "a[4] = c();"); [EOL] } <line_num>: 81,86
public final void testEarlyUsage2() { [EOL]     testSame("function c() {return sum(a)};" + "var a; a = [1,2,3];" + "a[4] = c();"); [EOL] } <line_num>: 88,93
public final void testArrayTooSparseOptimization1() { [EOL]     test("var a = []; a[0] = 1; a[1] = 2; a[100] = 4;", "var a = [1, 2]; a[100] = 4;"); [EOL] } <line_num>: 95,98
public final void testArrayTooSparseOptimization2() { [EOL]     test("var a; a = []; a[0] = 1; a[1] = 2; a[100] = 4;", "var a; a = [1, 2]; a[100] = 4;"); [EOL] } <line_num>: 100,103
public final void testArrayOutOfOrder() { [EOL]     test("var a = []; a[1] = 1; a[0] = 0;", "var a = [0, 1];"); [EOL]     test("var a; a = []; a[1] = 1; a[0] = 0;", "var a; a = [0, 1];"); [EOL]     testSame("var x = 0; var a = []; a[1] = x++; a[0] = x++;"); [EOL]     testSame("var x; x = 0; var a = []; a[1] = x++; a[0] = x++;"); [EOL] } <line_num>: 105,119
public final void testMultipleNames1() { [EOL]     test("var b = []; b[0] = 2; var a = []; a[0] = 1;", "var b = [2]; var a = [1];"); [EOL] } <line_num>: 121,124
public final void testMultipleNames2() { [EOL]     test("var b; b = []; b[0] = 2; var a = []; a[0] = 1;", "var b; b = [2]; var a = [1];"); [EOL] } <line_num>: 126,129
public final void testArrayReassignedInValue1() { [EOL]     test("var a = []; a[0] = 1; a[1] = (a = []); a[3] = 4;", "var a = [1]; a[1] = (a = []); a[3] = 4;"); [EOL] } <line_num>: 132,135
public final void testArrayReassignedInValue2() { [EOL]     test("var a; a = []; a[0] = 1; a[1] = (a = []); a[3] = 4;", "var a; a = [1]; a[1] = (a = []); a[3] = 4;"); [EOL] } <line_num>: 137,140
public final void testArrayReassignedInSubsequentVar1() { [EOL]     testSame("var a = []; a[0] = a = []; a[1] = 2;"); [EOL] } <line_num>: 142,144
public final void testArrayReassignedInSubsequentVar2() { [EOL]     testSame("var a; a = []; a[0] = a = []; a[1] = 2;"); [EOL] } <line_num>: 146,148
public final void testForwardReference1() { [EOL]     test("var a; a = []; a[0] = 1; a[1] = a;", "var a; a = [1]; a[1] = a;"); [EOL] } <line_num>: 150,153
public final void testForwardReference2() { [EOL]     test("var a; a = []; a[0] = 1; a[1] = a;", "var a; a = [1]; a[1] = a;"); [EOL] } <line_num>: 155,158
public final void testObjectOptimization1() { [EOL]     test("var o = {}; o.x = 0; o['y'] = 1; o[2] = 2;", "var o = { x: 0, \"y\": 1, \"2\": 2 };"); [EOL] } <line_num>: 160,163
public final void testObjectOptimization2() { [EOL]     test("var o; o = {}; o.x = 0; o['y'] = 1; o[2] = 2;", "var o; o = { x: 0, \"y\": 1, \"2\": 2 };"); [EOL] } <line_num>: 165,168
public final void testObjectReassignedInValue1() { [EOL]     test("var o = {}; o.x = 1; o.y = (o = {}); o.z = 4;", "var o = {x:1}; o.y = (o = {}); o.z = 4;"); [EOL] } <line_num>: 170,173
public final void testObjectReassignedInValue2() { [EOL]     test("var o; o = {}; o.x = 1; o.y = (o = {}); o.z = 4;", "var o; o = {x:1}; o.y = (o = {}); o.z = 4;"); [EOL] } <line_num>: 176,179
public final void testObjectFunctionRollup1() { [EOL]     test("var o; o = {};" + "o.x = function() {};", "var o; o = {x:function () {}};"); [EOL] } <line_num>: 181,185
public final void testObjectFunctionRollup2() { [EOL]     testSame("var o; o = {};" + "o.x = (function() {return o})();"); [EOL] } <line_num>: 187,191
public final void testObjectFunctionRollup3() { [EOL]     test("var o; o = {};" + "o.x = function() {return o};", "var o; o = {x:function () {return o}};"); [EOL] } <line_num>: 193,197
public final void testObjectFunctionRollup4() { [EOL]     testSame("function f() {return o};" + "var o; o = {};" + "o.x = f();"); [EOL] } <line_num>: 199,204
public final void testObjectFunctionRollup5() { [EOL]     test("var o; o = {};" + "o.x = function() {return o};" + "o.y = [function() {return o}];" + "o.z = {a:function() {return o}};", "var o; o = {" + "x:function () {return o}, " + "y:[function () {return o}], " + "z:{a:function () {return o}}};"); [EOL] } <line_num>: 206,216
