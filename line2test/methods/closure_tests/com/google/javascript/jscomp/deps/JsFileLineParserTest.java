TestParser(ErrorManager errorManager) { [EOL]     super(errorManager); [EOL] } <line_num>: 90,92
@Override [EOL] public void setUp() { [EOL]     errorManager = new PrintStreamErrorManager(System.err); [EOL]     parser = new TestParser(errorManager); [EOL] } <line_num>: 36,40
public void testSingleLine1() { [EOL]     assertStrip("2", "// 1\n2"); [EOL] } <line_num>: 42,44
public void testSingleLine2() { [EOL]     assertStrip("2 ", "// 1\n2 // 3 // 4 \n"); [EOL] } <line_num>: 46,48
public void testMultiLine1() { [EOL]     assertStrip("1", "/* hi */\n1"); [EOL] } <line_num>: 50,52
public void testMultiLine2() { [EOL]     assertStrip("123", "1/* hi */2\n3"); [EOL] } <line_num>: 54,56
public void testMultiLine3() { [EOL]     assertStrip("14", "1/* hi 2\n3*/4"); [EOL] } <line_num>: 58,60
public void testMultiLine4() { [EOL]     assertStrip("15", "1/* hi x\ny\nz*/5"); [EOL] } <line_num>: 62,64
public void testMultiLine5() { [EOL]     assertStrip("1234", "1/* hi */2/**/3/*\n/** bye */4"); [EOL] } <line_num>: 66,68
public void testMultiLine6() { [EOL]     assertStrip("12", "1/*** hi *** 3 **/2"); [EOL] } <line_num>: 70,72
public void testMixedLine1() { [EOL]     assertStrip("14", "1// /** 2 **/ 3\n4"); [EOL] } <line_num>: 74,76
public void testMixedLine2() { [EOL]     assertStrip("1 34", "1/** // 2 **/ 3\n4"); [EOL] } <line_num>: 78,80
private void assertStrip(String expected, String input) { [EOL]     parser.doParse("file", new StringReader(input)); [EOL]     assertEquals(expected, parser.toString()); [EOL] } <line_num>: 82,85
@Override [EOL] boolean parseLine(String line) { [EOL]     sb.append(line); [EOL]     return true; [EOL] } <line_num>: 94,98
@Override [EOL] public String toString() { [EOL]     return sb.toString(); [EOL] } <line_num>: 100,103
