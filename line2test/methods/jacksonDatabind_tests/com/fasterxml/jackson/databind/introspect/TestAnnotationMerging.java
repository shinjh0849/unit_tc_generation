public Wrapper() { [EOL] } <line_num>: 18,18
public Wrapper(Object o) { [EOL]     value = o; [EOL] } <line_num>: 19,19
public SharedName(int v) { [EOL]     value = v; [EOL] } <line_num>: 31,31
@JsonCreator [EOL] public TypeWrapper(@JsonProperty("value") @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS) Object o) { [EOL]     value = o; [EOL] } <line_num>: 48,53
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS) [EOL] public Object getValue() { [EOL]     return value; [EOL] } <line_num>: 21,22
public void setValue(Object o) { [EOL]     value = o; [EOL] } <line_num>: 24,24
public int getValue() { [EOL]     return value; [EOL] } <line_num>: 33,33
@JsonProperty("x") [EOL] public int getValue() { [EOL]     return 1; [EOL] } <line_num>: 38,39
public void setValue(int x) { [EOL] } <line_num>: 40,40
public Object getValue() { [EOL]     return value; [EOL] } <line_num>: 54,54
public void testSharedNames() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     assertEquals("{\"x\":6}", mapper.writeValueAsString(new SharedName(6))); [EOL] } <line_num>: 63,67
public void testSharedNamesFromGetterToSetter() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     String json = mapper.writeValueAsString(new SharedName2()); [EOL]     assertEquals("{\"x\":1}", json); [EOL]     SharedName2 result = mapper.readValue(json, SharedName2.class); [EOL]     assertNotNull(result); [EOL] } <line_num>: 69,76
public void testSharedTypeInfo() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     String json = mapper.writeValueAsString(new Wrapper(13L)); [EOL]     Wrapper result = mapper.readValue(json, Wrapper.class); [EOL]     assertEquals(Long.class, result.value.getClass()); [EOL] } <line_num>: 78,84
public void testSharedTypeInfoWithCtor() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     String json = mapper.writeValueAsString(new TypeWrapper(13L)); [EOL]     TypeWrapper result = mapper.readValue(json, TypeWrapper.class); [EOL]     assertEquals(Long.class, result.value.getClass()); [EOL] } <line_num>: 86,92
