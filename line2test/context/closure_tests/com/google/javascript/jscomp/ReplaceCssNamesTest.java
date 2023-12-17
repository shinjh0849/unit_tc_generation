public ReplaceCssNamesTest()
protected CssRenamingMap getCssRenamingMap()
protected CompilerPass getProcessor(Compiler compiler)
public String get(String value)
protected CssRenamingMap getPartialMap()
public String get(String value)
protected CssRenamingMap getFullMap()
protected void setUp() throws Exception
protected int getNumRepetitions()
public void testDoNotUseReplacementMap()
public void testOneArgWithUnknownStringLiterals()
public void testOneArgWithSimpleStringLiterals()
public void testOneArgWithCompositeClassNames()
public void testOneArgWithCompositeClassNamesFull()
public void testOneArgWithCompositeClassNamesWithUnknownParts()
public void testTwoArgsWithStringLiterals()
public void testTwoArsWithVariableFirstArg()
public void testTwoArgsWithVariableFirstArgFull()
public void testZeroArguments()
public void testManyArguments()
public void testNonStringArgument()
protected void printSummary()
public void println(CheckLevel level, JSError error)
public void testNoSymbolMapStripsCallAndDoesntIssueWarnings()
public void testWhitelistByPart()
public void testWhitelistByWhole()
public void testWhitelistWithDashes()
boolean useReplacementMap
Map<String, String> replacementMap=Optional[new ImmutableMap.Builder<String, String>().put("active", "a").put("buttonbar", "b").put("colorswatch", "c").put("disabled", "d").put("elephant", "e").put("footer", "f").put("goog", "g").build()]
Map<String, String> replacementMapFull=Optional[new ImmutableMap.Builder<String, String>().put("long-prefix", "h").put("suffix1", "i").put("unrelated-word", "k").put("unrelated", "l").put("long-suffix", "m").put("long-prefix-suffix1", "h-i").build()]
CssRenamingMap renamingMap
Set<String> whitelist
Map<String, Integer> cssNames
