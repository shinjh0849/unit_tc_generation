private TestEnum() { [EOL] } <line_num>: 37,37
private AnnotatedTestEnum() { [EOL] } <line_num>: 48,48
private EnumWithJsonValue(String n) { [EOL]     name = n; [EOL] } <line_num>: 56,58
private SerializableEnum() { [EOL] } <line_num>: 73,73
private LowerCaseEnum() { [EOL] } <line_num>: 91,91
NOT_OK(@JsonProperty String key) { [EOL]     this.key = key; [EOL] } <line_num>: 109,109
OK(String key) { [EOL]     this.key = key; [EOL] } <line_num>: 115,115
private PoNUM(String v) { [EOL]     value = v; [EOL] } <line_num>: 128,128
NOT_OK2(@JsonProperty String key) { [EOL]     this.key = key; [EOL] } <line_num>: 281,281
@Override [EOL] public String toString() { [EOL]     return name().toLowerCase(); [EOL] } <line_num>: 39,39
@Override [EOL] public String toString() { [EOL]     return name().toLowerCase(); [EOL] } <line_num>: 50,50
@JsonValue [EOL] @Override [EOL] public String toString() { [EOL]     return name; [EOL] } <line_num>: 59,61
@Override [EOL] @JsonValue [EOL] public String toString(); <line_num>: 65,66
@Override [EOL] public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException { [EOL]     serialize(jgen, provider); [EOL] } <line_num>: 75,80
@Override [EOL] public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jgen.writeString("foo"); [EOL] } <line_num>: 82,86
@Override [EOL] public String toString() { [EOL]     return name().toLowerCase(); [EOL] } <line_num>: 92,93
public void add(TestEnum key, int value) { [EOL]     map.put(key, Integer.valueOf(value)); [EOL] } <line_num>: 99,101
public String getValue() { [EOL]     return value; [EOL] } <line_num>: 130,130
public void testSimple() throws Exception { [EOL]     assertEquals("\"B\"", mapper.writeValueAsString(TestEnum.B)); [EOL] } <line_num>: 152,155
public void testEnumSet() throws Exception { [EOL]     StringWriter sw = new StringWriter(); [EOL]     EnumSet<TestEnum> value = EnumSet.of(TestEnum.B); [EOL]     mapper.writeValue(sw, value); [EOL]     assertEquals("[\"B\"]", sw.toString()); [EOL] } <line_num>: 157,163
public void testEnumUsingToString() throws Exception { [EOL]     StringWriter sw = new StringWriter(); [EOL]     mapper.writeValue(sw, AnnotatedTestEnum.C2); [EOL]     assertEquals("\"c2\"", sw.toString()); [EOL] } <line_num>: 170,175
public void testSubclassedEnums() throws Exception { [EOL]     assertEquals("\"B\"", mapper.writeValueAsString(EnumWithSubClass.B)); [EOL] } <line_num>: 178,181
public void testEnumsWithJsonValue() throws Exception { [EOL]     assertEquals("\"bar\"", mapper.writeValueAsString(EnumWithJsonValue.B)); [EOL] } <line_num>: 184,187
public void testEnumsWithJsonValueUsingMixin() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.addMixInAnnotations(TestEnum.class, ToStringMixin.class); [EOL]     assertEquals("\"b\"", mapper.writeValueAsString(TestEnum.B)); [EOL] } <line_num>: 190,196
public void testSerializableEnum() throws Exception { [EOL]     assertEquals("\"foo\"", mapper.writeValueAsString(SerializableEnum.A)); [EOL] } <line_num>: 202,205
public void testToStringEnum() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true); [EOL]     assertEquals("\"b\"", mapper.writeValueAsString(LowerCaseEnum.B)); [EOL] } <line_num>: 208,213
public void testToStringEnumWithEnumMap() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true); [EOL]     EnumMap<LowerCaseEnum, String> m = new EnumMap<LowerCaseEnum, String>(LowerCaseEnum.class); [EOL]     m.put(LowerCaseEnum.C, "value"); [EOL]     assertEquals("{\"c\":\"value\"}", mapper.writeValueAsString(m)); [EOL] } <line_num>: 216,223
public void testMapWithEnumKeys() throws Exception { [EOL]     MapBean bean = new MapBean(); [EOL]     bean.add(TestEnum.B, 3); [EOL]     String json = mapper.writeValueAsString(bean); [EOL]     assertEquals("{\"map\":{\"b\":3}}", json); [EOL] } <line_num>: 226,232
public void testAsIndex() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     assertFalse(mapper.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)); [EOL]     assertEquals(quote("B"), mapper.writeValueAsString(TestEnum.B)); [EOL]     mapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX); [EOL]     assertEquals("1", mapper.writeValueAsString(TestEnum.B)); [EOL] } <line_num>: 235,245
public void testAnnotationsOnEnumCtor() throws Exception { [EOL]     assertEquals(quote("V1"), mapper.writeValueAsString(OK.V1)); [EOL]     assertEquals(quote("V1"), mapper.writeValueAsString(NOT_OK.V1)); [EOL]     assertEquals(quote("V2"), mapper.writeValueAsString(NOT_OK2.V2)); [EOL] } <line_num>: 248,253
public void testEnumAsObjectValid() throws Exception { [EOL]     assertEquals("{\"value\":\"a1\"}", mapper.writeValueAsString(PoNUM.A)); [EOL] } <line_num>: 257,259
public void testEnumAsIndexViaAnnotations() throws Exception { [EOL]     assertEquals("{\"text\":0}", mapper.writeValueAsString(new PoNUMContainer())); [EOL] } <line_num>: 261,263
public void testEnumAsObjectBroken() throws Exception { [EOL]     try { [EOL]         String json = mapper.writeValueAsString(BrokenPoNum.A); [EOL]         fail("Should not have succeeded, produced: " + json); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Unsupported serialization shape"); [EOL]     } [EOL] } <line_num>: 265,273
