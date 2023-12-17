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
protected void fieldNameFor(StringBuilder sb, int index)
protected String fieldNameFor(int index)
