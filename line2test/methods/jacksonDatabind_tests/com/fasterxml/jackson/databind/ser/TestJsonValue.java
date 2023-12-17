public ValueClass(T v) { [EOL]     _value = v; [EOL] } <line_num>: 28,28
public ToStringValueClass(T value) { [EOL]     super(value); [EOL] } <line_num>: 46,46
public ToStringValueClass2(String value) { [EOL]     super(value); [EOL] } <line_num>: 57,57
public Internal(int v) { [EOL]     value = v; [EOL] } <line_num>: 115,115
External(Internal e) { [EOL]     i = e.value; [EOL] } <line_num>: 124,124
@JsonCreator [EOL] public AdditionInterfaceImpl(@JsonProperty("toAdd") int toAdd) { [EOL]     this.toAdd = toAdd; [EOL] } <line_num>: 140,143
public NegatingAdditionInterface(AdditionInterface delegate) { [EOL]     this.delegate = delegate; [EOL] } <line_num>: 160,162
@JsonValue [EOL] T value() { [EOL]     return _value; [EOL] } <line_num>: 30,30
@Override [EOL] public String toString() { [EOL]     return "???"; [EOL] } <line_num>: 33,34
@JsonSerialize(using = ToStringSerializer.class) [EOL] @Override [EOL] @JsonValue [EOL] T value() { [EOL]     return super.value(); [EOL] } <line_num>: 49,51
@JsonProperty [EOL] int getFoobar() { [EOL]     return 4; [EOL] } <line_num>: 62,62
public String[] getSomethingElse() { [EOL]     return new String[] { "1", "a" }; [EOL] } <line_num>: 64,64
@JsonValue [EOL] public ValueBase getX() { [EOL]     return new ValueType(); [EOL] } <line_num>: 77,78
@JsonValue [EOL] public Map<String, String> toMap() { [EOL]     HashMap<String, String> map = new HashMap<String, String>(); [EOL]     map.put("a", "1"); [EOL]     return map; [EOL] } <line_num>: 83,89
@JsonValue [EOL] public int value() { [EOL]     return 42; [EOL] } <line_num>: 95,96
@JsonValue [EOL] public int value() { [EOL]     return 13; [EOL] } <line_num>: 102,103
public void add(int v) { [EOL]     values.add(new Internal(v)); [EOL] } <line_num>: 109,109
@JsonValue [EOL] public External asExternal() { [EOL]     return new External(this); [EOL] } <line_num>: 117,118
public int add(int in); <line_num>: 133,133
@JsonProperty [EOL] public int getToAdd() { [EOL]     return toAdd; [EOL] } <line_num>: 145,148
@Override [EOL] public int add(int in) { [EOL]     return in + toAdd; [EOL] } <line_num>: 150,153
@Override [EOL] public int add(int in) { [EOL]     return delegate.add(-in); [EOL] } <line_num>: 164,167
@JsonValue [EOL] public AdditionInterface getDelegate() { [EOL]     return delegate; [EOL] } <line_num>: 169,172
public void testSimpleJsonValue() throws Exception { [EOL]     String result = MAPPER.writeValueAsString(new ValueClass<String>("abc")); [EOL]     assertEquals("\"abc\"", result); [EOL] } <line_num>: 183,187
public void testJsonValueWithUseSerializer() throws Exception { [EOL]     String result = serializeAsString(MAPPER, new ToStringValueClass<Integer>(Integer.valueOf(123))); [EOL]     assertEquals("\"123\"", result); [EOL] } <line_num>: 189,193
public void testMixedJsonValue() throws Exception { [EOL]     String result = serializeAsString(MAPPER, new ToStringValueClass2("xyz")); [EOL]     assertEquals("\"xyz\"", result); [EOL] } <line_num>: 198,202
public void testValueWithStaticType() throws Exception { [EOL]     assertEquals("{\"a\":\"a\",\"b\":\"b\"}", MAPPER.writeValueAsString(new ValueWrapper())); [EOL]     ObjectMapper staticMapper = new ObjectMapper(); [EOL]     staticMapper.configure(MapperFeature.USE_STATIC_TYPING, true); [EOL]     assertEquals("{\"a\":\"a\"}", staticMapper.writeValueAsString(new ValueWrapper())); [EOL] } <line_num>: 204,213
public void testMapWithJsonValue() throws Exception { [EOL]     assertEquals("{\"a\":\"1\"}", MAPPER.writeValueAsString(new MapBean())); [EOL] } <line_num>: 215,217
public void testWithMap() throws Exception { [EOL]     assertEquals("42", MAPPER.writeValueAsString(new MapAsNumber())); [EOL] } <line_num>: 219,222
public void testWithList() throws Exception { [EOL]     assertEquals("13", MAPPER.writeValueAsString(new ListAsNumber())); [EOL] } <line_num>: 224,226
public void testInList() throws Exception { [EOL]     IntExtBean bean = new IntExtBean(); [EOL]     bean.add(1); [EOL]     bean.add(2); [EOL]     String json = MAPPER.writeValueAsString(bean); [EOL]     assertEquals(json, "{\"values\":[{\"i\":1},{\"i\":2}]}"); [EOL] } <line_num>: 228,234
public void testPolymorphicSerdeWithDelegate() throws Exception { [EOL]     AdditionInterface adder = new AdditionInterfaceImpl(1); [EOL]     assertEquals(2, adder.add(1)); [EOL]     String json = MAPPER.writeValueAsString(adder); [EOL]     assertEquals("{\"boingo\":\"boopsy\",\"toAdd\":1}", json); [EOL]     assertEquals(2, MAPPER.readValue(json, AdditionInterface.class).add(1)); [EOL]     adder = new NegatingAdditionInterface(adder); [EOL]     assertEquals(0, adder.add(1)); [EOL]     json = MAPPER.writeValueAsString(adder); [EOL]     assertEquals("{\"boingo\":\"boopsy\",\"toAdd\":1}", json); [EOL]     assertEquals(2, MAPPER.readValue(json, AdditionInterface.class).add(1)); [EOL] } <line_num>: 237,252
