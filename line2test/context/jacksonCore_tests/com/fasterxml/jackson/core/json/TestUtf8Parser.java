public void testEmptyName() throws Exception
public void testUtf8Name2Bytes() throws Exception
public void testUtf8Name3Bytes() throws Exception
public void testUtf8StringTrivial() throws Exception
public void testUtf8StringValue() throws Exception
public void testNextFieldName() throws IOException
String[] UTF8_2BYTE_STRINGS=Optional[new String[] { /* This may look funny, but UTF8 scanner has fairly
         * elaborate decoding machinery, and it is indeed
         * necessary to try out various combinations...
         */
"b", "A\u00D8", "abc", "c3p0", "12345", "......", "Long\u00FAer", "Latin1-fully-\u00BE-develop\u00A8d", "Some very long name, ridiculously long actually to see that buffer expansion works: \u00BF?" }]
String[] UTF8_3BYTE_STRINGS=Optional[new String[] { "\uC823?", "A\u400F", "1\u1234?", "Ab123\u4034", "Even-longer:\uC023" }]
