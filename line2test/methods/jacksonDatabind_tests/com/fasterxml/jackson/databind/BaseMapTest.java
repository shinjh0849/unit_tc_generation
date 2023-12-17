@JsonCreator [EOL] public BooleanWrapper(Boolean value) { [EOL]     b = value; [EOL] } <line_num>: 33,34
public IntWrapper() { [EOL] } <line_num>: 42,42
public IntWrapper(int value) { [EOL]     i = value; [EOL] } <line_num>: 43,43
public StringWrapper() { [EOL] } <line_num>: 53,53
public StringWrapper(String value) { [EOL]     str = value; [EOL] } <line_num>: 54,56
protected ObjectWrapper(final Object object) { [EOL]     this.object = object; [EOL] } <line_num>: 61,63
public ListWrapper(T... values) { [EOL]     list = new ArrayList<T>(); [EOL]     for (T value : values) { [EOL]         list.add(value); [EOL]     } [EOL] } <line_num>: 75,80
public MapWrapper(Map<K, V> m) { [EOL]     map = m; [EOL] } <line_num>: 87,89
public ArrayWrapper(T[] v) { [EOL]     array = v; [EOL] } <line_num>: 96,98
protected BaseMapTest() { [EOL]     super(); [EOL] } <line_num>: 112,112
@JsonValue [EOL] public Boolean value() { [EOL]     return b; [EOL] } <line_num>: 36,36
public Object getObject() { [EOL]     return object; [EOL] } <line_num>: 64,64
@JsonCreator [EOL] static ObjectWrapper jsonValue(final Object object) { [EOL]     return new ObjectWrapper(object); [EOL] } <line_num>: 65,68
@Override [EOL] public void foobar() { [EOL] } <line_num>: 105,105
@Override [EOL] public void foobar() { [EOL] } <line_num>: 106,106
public abstract void foobar(); <line_num>: 109,109
protected ObjectMapper objectMapper() { [EOL]     return SHARED_MAPPER; [EOL] } <line_num>: 122,124
protected ObjectWriter objectWriter() { [EOL]     return SHARED_MAPPER.writer(); [EOL] } <line_num>: 126,128
protected ObjectReader objectReader() { [EOL]     return SHARED_MAPPER.reader(); [EOL] } <line_num>: 130,132
protected ObjectReader objectReader(Class<?> cls) { [EOL]     return SHARED_MAPPER.reader(cls); [EOL] } <line_num>: 134,136
protected void assertEquals(int[] exp, int[] act) { [EOL]     assertArrayEquals(exp, act); [EOL] } <line_num>: 144,147
protected void assertStandardEquals(Object o) { [EOL]     assertTrue(o.equals(o)); [EOL]     assertFalse(o.equals(null)); [EOL]     assertFalse(o.equals(SINGLETON_OBJECT)); [EOL]     o.hashCode(); [EOL] } <line_num>: 154,161
@SuppressWarnings("unchecked") [EOL] protected Map<String, Object> writeAndMap(ObjectMapper m, Object value) throws IOException { [EOL]     String str = m.writeValueAsString(value); [EOL]     return (Map<String, Object>) m.readValue(str, Map.class); [EOL] } <line_num>: 169,175
protected <T> T readAndMapFromString(String input, Class<T> cls) throws IOException { [EOL]     return readAndMapFromString(SHARED_MAPPER, input, cls); [EOL] } <line_num>: 177,181
protected <T> T readAndMapFromString(ObjectMapper m, String input, Class<T> cls) throws IOException { [EOL]     return (T) m.readValue("\"" + input + "\"", cls); [EOL] } <line_num>: 183,187
protected String serializeAsString(ObjectMapper m, Object value) throws IOException { [EOL]     return m.writeValueAsString(value); [EOL] } <line_num>: 189,193
protected String serializeAsString(Object value) throws IOException { [EOL]     return serializeAsString(SHARED_MAPPER, value); [EOL] } <line_num>: 195,199
protected String asJSONObjectValueString(Object... args) throws IOException { [EOL]     return asJSONObjectValueString(SHARED_MAPPER, args); [EOL] } <line_num>: 201,205
protected String asJSONObjectValueString(ObjectMapper m, Object... args) throws IOException { [EOL]     LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>(); [EOL]     for (int i = 0, len = args.length; i < len; i += 2) { [EOL]         map.put(args[i], args[i + 1]); [EOL]     } [EOL]     return m.writeValueAsString(map); [EOL] } <line_num>: 207,215
protected TimeZone getUTCTimeZone() { [EOL]     return TimeZone.getTimeZone("GMT"); [EOL] } <line_num>: 217,219
protected byte[] utf8Bytes(String str) { [EOL]     try { [EOL]         return str.getBytes("UTF-8"); [EOL]     } catch (IOException e) { [EOL]         throw new IllegalArgumentException(e); [EOL]     } [EOL] } <line_num>: 221,227
