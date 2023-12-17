public BaseClass(String a) { [EOL]     _a = a + "..."; [EOL] } <line_num>: 22,24
private BaseClass(String value, boolean dummy) { [EOL]     _a = value; [EOL] } <line_num>: 26,28
private BaseClassWithPrivateCtor(String a) { [EOL]     _a = a + "..."; [EOL] } <line_num>: 38,40
@JsonIgnore [EOL] protected MixIn(String s) { [EOL] } <line_num>: 55,55
@JsonCreator [EOL] MixInForPrivate(String s) { [EOL] } <line_num>: 63,63
private StringWrapper(String s, boolean foo) { [EOL]     _value = s; [EOL] } <line_num>: 68,68
public static BaseClass myFactory(String a) { [EOL]     return new BaseClass(a + "X", true); [EOL] } <line_num>: 30,32
@JsonCreator [EOL] static BaseClass myFactory(String a) { [EOL]     return null; [EOL] } <line_num>: 57,58
@SuppressWarnings("unused") [EOL] private static StringWrapper create(String str) { [EOL]     return new StringWrapper(str, false); [EOL] } <line_num>: 70,73
@JsonCreator [EOL] static StringWrapper create(String str) { [EOL]     return null; [EOL] } <line_num>: 77,77
public void testForConstructor() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(BaseClassWithPrivateCtor.class, MixInForPrivate.class); [EOL]     BaseClassWithPrivateCtor result = m.readValue("\"?\"", BaseClassWithPrivateCtor.class); [EOL]     assertEquals("?...", result._a); [EOL] } <line_num>: 86,92
public void testForFactoryAndCtor() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     BaseClass result; [EOL]     result = m.readValue("\"string\"", BaseClass.class); [EOL]     assertEquals("string...", result._a); [EOL]     m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(BaseClass.class, MixIn.class); [EOL]     result = m.readValue("\"string\"", BaseClass.class); [EOL]     assertEquals("stringX", result._a); [EOL] } <line_num>: 94,108
public void testFactoryMixIn() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(StringWrapper.class, StringWrapperMixIn.class); [EOL]     StringWrapper result = m.readValue("\"a\"", StringWrapper.class); [EOL]     assertEquals("a", result._value); [EOL] } <line_num>: 110,116
