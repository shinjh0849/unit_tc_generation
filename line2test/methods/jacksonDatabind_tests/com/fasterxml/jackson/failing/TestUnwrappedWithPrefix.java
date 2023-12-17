public MapUnwrap() { [EOL] } <line_num>: 15,15
public MapUnwrap(String key, Object value) { [EOL]     map = Collections.singletonMap(key, value); [EOL] } <line_num>: 16,18
public void testMapUnwrapSerialize() throws Exception { [EOL]     String json = mapper.writeValueAsString(new MapUnwrap("test", 6)); [EOL]     assertEquals("{\"map.test\": 6}", json); [EOL] } <line_num>: 34,38
public void testMapUnwrapDeserialize() throws Exception { [EOL]     MapUnwrap root = mapper.readValue("{\"map.test\": 6}", MapUnwrap.class); [EOL]     assertEquals(1, root.map.size()); [EOL]     assertEquals(6, ((Number) root.map.get("test")).intValue()); [EOL] } <line_num>: 46,52
