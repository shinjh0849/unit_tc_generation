public String toString()
public void testConstructor()
public void testCaseFunctions()
public void testSwapCase_String()
public void testJoin_Objects()
public void testJoin_Objectarray()
public void testJoin_ArrayCharSeparator()
public void testJoin_ArrayOfChars()
public void testJoin_ArrayOfBytes()
public void testJoin_ArrayOfInts()
public void testJoin_ArrayOfLongs()
public void testJoin_ArrayOfFloats()
public void testJoin_ArrayOfDoubles()
public void testJoin_ArrayOfShorts()
public void testJoin_ArrayString()
public void testJoin_IteratorChar()
public void testJoin_IteratorString()
public void testJoin_IterableChar()
public void testJoin_IterableString()
public void testSplit_String()
public void testSplit_StringChar()
public void testSplit_StringString_StringStringInt()
private void innerTestSplit(final char separator, final String sepStr, final char noMatch)
public void testSplitByWholeString_StringStringBoolean()
public void testSplitByWholeString_StringStringBooleanInt()
public void testSplitByWholeSeparatorPreserveAllTokens_StringStringInt()
public void testSplitPreserveAllTokens_String()
public void testSplitPreserveAllTokens_StringChar()
public void testSplitPreserveAllTokens_StringString_StringStringInt()
private void innerTestSplitPreserveAllTokens(final char separator, final String sepStr, final char noMatch)
public void testSplitByCharacterType()
public void testSplitByCharacterTypeCamelCase()
public void testDeleteWhitespace_String()
public void testLang623()
public void testReplace_StringStringString()
public void testReplacePattern()
public void testRemovePattern()
public void testReplace_StringStringStringInt()
public void testReplaceOnce_StringStringString()
public void testReplace_StringStringArrayStringArray()
public void testReplace_StringStringArrayStringArrayBoolean()
public void testReplaceChars_StringCharChar()
public void testReplaceChars_StringStringString()
public void testOverlay_StringStringIntInt()
public void testRepeat_StringInt()
public void testRepeat_StringStringInt()
public void testChop()
public void testChomp()
public void testRightPad_StringInt()
public void testRightPad_StringIntChar()
public void testRightPad_StringIntString()
public void testLeftPad_StringInt()
public void testLeftPad_StringIntChar()
public void testLeftPad_StringIntString()
public void testLengthString()
public void testLengthStringBuffer()
public void testLengthStringBuilder()
public void testLength_CharBuffer()
public void testCenter_StringInt()
public void testCenter_StringIntChar()
public void testCenter_StringIntString()
public void testReverse_String()
public void testReverseDelimited_StringChar()
public void testDefault_String()
public void testDefault_StringString()
public void testDefaultIfEmpty_StringString()
public void testDefaultIfBlank_StringString()
public void testDefaultIfEmpty_StringBuilders()
public void testDefaultIfBlank_StringBuilders()
public void testDefaultIfEmpty_StringBuffers()
public void testDefaultIfBlank_StringBuffers()
public void testDefaultIfEmpty_CharBuffers()
public void testDefaultIfBlank_CharBuffers()
public void testAbbreviate_StringInt()
public void testAbbreviate_StringIntInt()
private void assertAbbreviateWithOffset(final String expected, final int offset, final int maxWidth)
public void testAbbreviateMiddle()
public void testDifference_StringString()
public void testDifferenceAt_StringString()
public void testGetLevenshteinDistance_StringString()
public void testGetLevenshteinDistance_StringStringInt()
public void testEMPTY()
public void testIsAllLowerCase()
public void testIsAllUpperCase()
public void testRemoveStart()
public void testRemoveStartIgnoreCase()
public void testRemoveEnd()
public void testRemoveEndIgnoreCase()
public void testRemove_String()
public void testRemove_char()
public void testDifferenceAt_StringArray()
public void testGetCommonPrefix_StringArray()
public void testNormalizeSpace()
public void testLANG666()
public void testStringUtilsCharSequenceContract()
public void testToString() throws UnsupportedEncodingException
public void testEscapeSurrogatePairs() throws Exception
public void testEscapeSurrogatePairsLang858() throws Exception
public void testUnescapeSurrogatePairs() throws Exception
public void testAppendIfMissing()
public void testAppendIfMissingIgnoreCase()
public void testPrependIfMissing()
public void testPrependIfMissingIgnoreCase()
String WHITESPACE
String NON_WHITESPACE
String TRIMMABLE
String NON_TRIMMABLE
String[] ARRAY_LIST=Optional[{ "foo", "bar", "baz" }]
String[] EMPTY_ARRAY_LIST=Optional[{}]
String[] NULL_ARRAY_LIST=Optional[{ null }]
Object[] NULL_TO_STRING_LIST=Optional[{ new Object() {

    @Override
    public String toString() {
        return null;
    }
} }]
String[] MIXED_ARRAY_LIST=Optional[{ null, "", "foo" }]
Object[] MIXED_TYPE_LIST=Optional[{ "foo", Long.valueOf(2L) }]
long[] LONG_PRIM_LIST=Optional[{ 1, 2 }]
int[] INT_PRIM_LIST=Optional[{ 1, 2 }]
byte[] BYTE_PRIM_LIST=Optional[{ 1, 2 }]
short[] SHORT_PRIM_LIST=Optional[{ 1, 2 }]
char[] CHAR_PRIM_LIST=Optional[{ '1', '2' }]
float[] FLOAT_PRIM_LIST=Optional[{ 1, 2 }]
double[] DOUBLE_PRIM_LIST=Optional[{ 1, 2 }]
String SEPARATOR=Optional[","]
char SEPARATOR_CHAR=Optional[';']
String TEXT_LIST=Optional["foo,bar,baz"]
String TEXT_LIST_CHAR=Optional["foo;bar;baz"]
String TEXT_LIST_NOSEP=Optional["foobarbaz"]
String FOO_UNCAP=Optional["foo"]
String FOO_CAP=Optional["Foo"]
String SENTENCE_UNCAP=Optional["foo bar baz"]
String SENTENCE_CAP=Optional["Foo Bar Baz"]
