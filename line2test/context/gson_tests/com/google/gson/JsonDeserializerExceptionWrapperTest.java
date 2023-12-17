public ExceptionJsonDeserializer(RuntimeException exceptionToThrow)
public void testRethrowJsonParseException() throws Exception
public void testWrappedExceptionPropagation() throws Exception
public void testProperSerialization() throws Exception
public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
String DATE_STRING=Optional[DateFormat.getDateInstance(DateFormat.LONG).format(new Date())]
JsonPrimitive PRIMITIVE_ELEMENT=Optional[new JsonPrimitive(DATE_STRING)]
