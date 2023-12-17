public BaseClass() { [EOL] } <line_num>: 23,23
protected void addValue(String key, Object value) { [EOL]     values.put(key, value); [EOL] } <line_num>: 25,27
@JsonAnySetter [EOL] void addValue(String key, Object value); <line_num>: 32,32
public void testWithAnySetter() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(BaseClass.class, MixIn.class); [EOL]     BaseClass result = m.readValue("{ \"a\" : 3, \"b\" : true }", BaseClass.class); [EOL]     assertNotNull(result); [EOL]     assertEquals(2, result.values.size()); [EOL]     assertEquals(Integer.valueOf(3), result.values.get("a")); [EOL]     assertEquals(Boolean.TRUE, result.values.get("b")); [EOL] } <line_num>: 45,54
