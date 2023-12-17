public GatherRawExportsTest() { [EOL]     super(EXTERNS); [EOL]     super.enableNormalize(); [EOL] } <line_num>: 33,36
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     last = new GatherRawExports(compiler); [EOL]     return last; [EOL] } <line_num>: 38,42
public void testExportsFound1() { [EOL]     assertExported("var a"); [EOL] } <line_num>: 44,46
public void testExportsFound2() { [EOL]     assertExported("window['a']", "a"); [EOL] } <line_num>: 48,50
public void testExportsFound3() { [EOL]     assertExported("window.a", "a"); [EOL] } <line_num>: 52,54
public void testExportsFound4() { [EOL]     assertExported("this['a']", "a"); [EOL] } <line_num>: 56,58
public void testExportsFound5() { [EOL]     assertExported("this.a", "a"); [EOL] } <line_num>: 60,62
public void testExportsFound6() { [EOL]     assertExported("function f() { this['a'] }"); [EOL] } <line_num>: 64,66
public void testExportsFound7() { [EOL]     assertExported("function f() { this.a }"); [EOL] } <line_num>: 68,70
public void testExportsFound8() { [EOL]     assertExported("window['foo']", "foo"); [EOL] } <line_num>: 72,74
public void testExportsFound9() { [EOL]     assertExported("window['a'] = 1;", "a"); [EOL] } <line_num>: 76,78
public void testExportsFound10() { [EOL]     assertExported("window['a']['b']['c'] = 1;", "a"); [EOL] } <line_num>: 80,82
public void testExportsFound11() { [EOL]     assertExported("if (window['a'] = 1) alert(x);", "a"); [EOL] } <line_num>: 84,86
public void testExportsFound12() { [EOL]     assertExported("function foo() { window['a'] = 1; }", "a"); [EOL] } <line_num>: 88,90
public void testExportsFound13() { [EOL]     assertExported("function foo() {var window; window['a'] = 1; }"); [EOL] } <line_num>: 92,94
public void testExportsFound14() { [EOL]     assertExported("var a={window:{}}; a.window['b']"); [EOL] } <line_num>: 96,98
public void testExportsFound15() { [EOL]     assertExported("window.window['b']", "window"); [EOL] } <line_num>: 100,102
public void testExportsFound16() { [EOL]     assertExported("var a = window; a['b']"); [EOL] } <line_num>: 104,108
public void testExportOnTopFound1() { [EOL]     assertExported("top['a']", "a"); [EOL] } <line_num>: 110,112
public void testExportOntopFound2() { [EOL]     assertExported("top.a", "a"); [EOL] } <line_num>: 114,116
private void assertExported(String js, String... names) { [EOL]     Set<String> setNames = Sets.newHashSet(names); [EOL]     testSame(js); [EOL]     assertTrue(last.getExportedVariableNames().equals(setNames)); [EOL] } <line_num>: 118,122
