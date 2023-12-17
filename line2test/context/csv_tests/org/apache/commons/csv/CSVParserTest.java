public void testGetLine() throws IOException
public void testGetRecords() throws IOException
public void testExcelFormat1() throws IOException
public void testExcelFormat2() throws Exception
public void testEndOfFileBehaviourExcel() throws Exception
public void testEndOfFileBehaviorCSV() throws Exception
public void testEmptyLineBehaviourExcel() throws Exception
public void testEmptyLineBehaviourCSV() throws Exception
public void testEmptyFile() throws Exception
public void testBackslashEscapingOld() throws IOException
public void testBackslashEscaping() throws IOException
public void testBackslashEscaping2() throws IOException
public void testDefaultFormat() throws IOException
public void testCarriageReturnLineFeedEndings() throws IOException
public void testCarriageReturnEndings() throws IOException
public void testLineFeedEndings() throws IOException
public void testIgnoreEmptyLines() throws IOException
public void testForEach() throws Exception
public void testIterator() throws Exception
public void testHeader() throws Exception
public void testProvidedHeader() throws Exception
public void testGetLineNumberWithLF() throws Exception
public void testGetLineNumberWithCRLF() throws Exception
public void testGetLineNumberWithCR() throws Exception
String code=Optional["a,b,c,d\n" + " a , b , 1 2 \n" + "\"foo baar\", b,\n" + // + "   \"foo\n,,\n\"\",,\n\\\"\",d,e\n";
"   \"foo\n,,\n\"\",,\n\"\"\",d,e\n"]
String[][] res=Optional[{ { "a", "b", "c", "d" }, { "a", "b", "1 2" }, { "foo baar", "b", "" }, { "foo\n,,\n\",,\n\"", "d", "e" } }]
