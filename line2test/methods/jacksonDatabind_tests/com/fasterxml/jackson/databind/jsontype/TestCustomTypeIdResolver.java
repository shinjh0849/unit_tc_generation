public CustomBean() { [EOL] } <line_num>: 23,23
public CustomBean(int x) { [EOL]     this.x = x; [EOL] } <line_num>: 24,24
public CustomResolver() { [EOL] } <line_num>: 31,31
@Override [EOL] public Id getMechanism() { [EOL]     return Id.CUSTOM; [EOL] } <line_num>: 33,36
@Override [EOL] public String idFromValue(Object value) { [EOL]     if (value.getClass() == CustomBean.class) { [EOL]         return "*"; [EOL]     } [EOL]     return "unknown"; [EOL] } <line_num>: 38,45
@Override [EOL] public String idFromValueAndType(Object value, Class<?> type) { [EOL]     return idFromValue(value); [EOL] } <line_num>: 47,50
@Override [EOL] public void init(JavaType baseType) { [EOL]     if (initTypes != null) { [EOL]         initTypes.add(baseType); [EOL]     } [EOL] } <line_num>: 52,57
@Override [EOL] public JavaType typeFromId(String id) { [EOL]     if ("*".equals(id)) { [EOL]         return TypeFactory.defaultInstance().constructType(CustomBean.class); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 59,66
@Override [EOL] public String idFromBaseType() { [EOL]     return "xxx"; [EOL] } <line_num>: 68,71
public void testCustomTypeIdResolver() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     List<JavaType> types = new ArrayList<JavaType>(); [EOL]     CustomResolver.initTypes = types; [EOL]     String json = m.writeValueAsString(new CustomBean[] { new CustomBean(28) }); [EOL]     assertEquals("[{\"*\":{\"x\":28}}]", json); [EOL]     assertEquals(1, types.size()); [EOL]     assertEquals(CustomBean.class, types.get(0).getRawClass()); [EOL]     types = new ArrayList<JavaType>(); [EOL]     CustomResolver.initTypes = types; [EOL]     CustomBean[] result = m.readValue(json, CustomBean[].class); [EOL]     assertNotNull(result); [EOL]     assertEquals(1, result.length); [EOL]     assertEquals(28, result[0].x); [EOL]     assertEquals(1, types.size()); [EOL]     assertEquals(CustomBean.class, types.get(0).getRawClass()); [EOL] } <line_num>: 81,99
