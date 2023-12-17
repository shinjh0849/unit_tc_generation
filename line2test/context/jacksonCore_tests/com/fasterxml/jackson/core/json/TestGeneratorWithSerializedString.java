public void testSimple() throws Exception
private void _writeSimple(JsonGenerator jgen) throws Exception
private void _verifySimple(JsonParser jp) throws Exception
String NAME_WITH_QUOTES=Optional["\"name\""]
String NAME_WITH_LATIN1=Optional["P\u00f6ll\u00f6"]
SerializedString quotedName=Optional[new SerializedString(NAME_WITH_QUOTES)]
SerializedString latin1Name=Optional[new SerializedString(NAME_WITH_LATIN1)]
