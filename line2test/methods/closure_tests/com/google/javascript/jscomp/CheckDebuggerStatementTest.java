@Override [EOL] public void tearDown() { [EOL]     checkLevel = null; [EOL] } <line_num>: 32,35
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new CheckDebuggerStatement(compiler); [EOL] } <line_num>: 37,40
@Override [EOL] protected CompilerOptions getOptions() { [EOL]     CompilerOptions options = super.getOptions(); [EOL]     if (checkLevel != null) { [EOL]         options.setWarningLevel(DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT, checkLevel); [EOL]     } [EOL]     return options; [EOL] } <line_num>: 42,51
public void testCheckDebuggerStatement() { [EOL]     checkLevel = CheckLevel.WARNING; [EOL]     testSame("debugger;", CheckDebuggerStatement.DEBUGGER_STATEMENT_PRESENT); [EOL]     testSame("function foo() { debugger; }", CheckDebuggerStatement.DEBUGGER_STATEMENT_PRESENT); [EOL] } <line_num>: 53,59
public void testCheckIsDisabledByDefault() { [EOL]     checkLevel = null; [EOL]     testSame("debugger;"); [EOL]     testSame("function foo() { debugger; }"); [EOL] } <line_num>: 61,66
public void testNoWarningWhenExplicitlyDisabled() { [EOL]     checkLevel = CheckLevel.OFF; [EOL]     testSame("debugger;"); [EOL]     testSame("function foo() { debugger; }"); [EOL] } <line_num>: 68,73
public void testCheckDebuggerKeywordMayAppearInComments() { [EOL]     checkLevel = CheckLevel.WARNING; [EOL]     test("// I like the debugger; it is helpful.", ""); [EOL] } <line_num>: 75,79
public void testCheckDebuggerStatementInEval() { [EOL]     checkLevel = CheckLevel.WARNING; [EOL]     testSame("eval('debugger');"); [EOL] } <line_num>: 81,85
