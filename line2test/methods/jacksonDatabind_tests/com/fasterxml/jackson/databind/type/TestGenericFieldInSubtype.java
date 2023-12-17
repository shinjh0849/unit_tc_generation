public Success677() { [EOL] } <line_num>: 33,33
public Success677(K k) { [EOL]     value = k; [EOL] } <line_num>: 34,34
public void test677() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     JavaType t677 = mapper.constructType(Result677.Success677.class); [EOL]     assertNotNull(t677); [EOL]     Result677.Success677<Integer> s = new Result677.Success677<Integer>(Integer.valueOf(4)); [EOL]     String json = mapper.writeValueAsString(s); [EOL]     assertEquals("{\"value\":4}", json); [EOL] } <line_num>: 8,17
public void testInnerType() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     BaseType.SubType<?> r = mapper.readValue("{}", BaseType.SubType.class); [EOL]     assertNotNull(r); [EOL] } <line_num>: 20,25
