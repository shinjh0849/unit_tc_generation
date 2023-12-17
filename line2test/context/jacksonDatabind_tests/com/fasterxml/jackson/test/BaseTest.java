public Name()
public Name(String f, String l)
public FiveMinuteUser()
public FiveMinuteUser(String first, String last, boolean verified, Gender g, byte[] data)
public String getFirst()
public String getLast()
public void setFirst(String s)
public void setLast(String s)
public boolean equals(Object o)
public Name getName()
public boolean isVerified()
public Gender getGender()
public byte[] getUserImage()
public void setName(Name n)
public void setVerified(boolean b)
public void setGender(Gender g)
public void setUserImage(byte[] b)
public boolean equals(Object o)
protected void verifyJsonSpecSampleDoc(JsonParser jp, boolean verifyContents) throws IOException
protected void verifyJsonSpecSampleDoc(JsonParser jp, boolean verifyContents, boolean requireNumbers) throws IOException
private void verifyIntToken(JsonToken t, boolean requireNumbers)
protected void verifyFieldName(JsonParser jp, String expName) throws IOException
protected void verifyIntValue(JsonParser jp, long expValue) throws IOException
protected static boolean runsFromAnt()
protected JsonParser createParserUsingReader(String input) throws IOException, JsonParseException
protected JsonParser createParserUsingReader(JsonFactory f, String input) throws IOException, JsonParseException
protected JsonParser createParserUsingStream(String input, String encoding) throws IOException, JsonParseException
protected JsonParser createParserUsingStream(JsonFactory f, String input, String encoding) throws IOException, JsonParseException
protected void assertToken(JsonToken expToken, JsonToken actToken)
protected void assertToken(JsonToken expToken, JsonParser jp)
protected void assertType(Object ob, Class<?> expType)
protected void verifyException(Throwable e, String... matches)
protected String getAndVerifyText(JsonParser jp) throws IOException, JsonParseException
protected byte[] encodeInUTF32BE(String input)
public String quote(String str)
int SAMPLE_SPEC_VALUE_WIDTH=Optional[800]
int SAMPLE_SPEC_VALUE_HEIGHT=Optional[600]
String SAMPLE_SPEC_VALUE_TITLE=Optional["View from 15th Floor"]
String SAMPLE_SPEC_VALUE_TN_URL=Optional["http://www.example.com/image/481989943"]
int SAMPLE_SPEC_VALUE_TN_HEIGHT=Optional[125]
String SAMPLE_SPEC_VALUE_TN_WIDTH=Optional["100"]
int SAMPLE_SPEC_VALUE_TN_ID1=Optional[116]
int SAMPLE_SPEC_VALUE_TN_ID2=Optional[943]
int SAMPLE_SPEC_VALUE_TN_ID3=Optional[234]
int SAMPLE_SPEC_VALUE_TN_ID4=Optional[38793]
String SAMPLE_DOC_JSON_SPEC=Optional["{\n" + "  \"Image\" : {\n" + "    \"Width\" : " + SAMPLE_SPEC_VALUE_WIDTH + ",\n" + "    \"Height\" : " + SAMPLE_SPEC_VALUE_HEIGHT + "," + "\"Title\" : \"" + SAMPLE_SPEC_VALUE_TITLE + "\",\n" + "    \"Thumbnail\" : {\n" + "      \"Url\" : \"" + SAMPLE_SPEC_VALUE_TN_URL + "\",\n" + "\"Height\" : " + SAMPLE_SPEC_VALUE_TN_HEIGHT + ",\n" + "      \"Width\" : \"" + SAMPLE_SPEC_VALUE_TN_WIDTH + "\"\n" + "    },\n" + "    \"IDs\" : [" + SAMPLE_SPEC_VALUE_TN_ID1 + "," + SAMPLE_SPEC_VALUE_TN_ID2 + "," + SAMPLE_SPEC_VALUE_TN_ID3 + "," + SAMPLE_SPEC_VALUE_TN_ID4 + "]\n" + "  }" + "}"]
