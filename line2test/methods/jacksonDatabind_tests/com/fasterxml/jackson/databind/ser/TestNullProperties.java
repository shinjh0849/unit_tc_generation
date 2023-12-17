NonDefaultBean() { [EOL] } <line_num>: 43,43
MixedBean() { [EOL] } <line_num>: 53,53
public String getA() { [EOL]     return "a"; [EOL] } <line_num>: 25,25
public String getB() { [EOL]     return null; [EOL] } <line_num>: 26,26
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL) [EOL] public String getA() { [EOL]     return null; [EOL] } <line_num>: 32,33
public String getB() { [EOL]     return null; [EOL] } <line_num>: 35,35
public String getA() { [EOL]     return _a; [EOL] } <line_num>: 45,45
public String getB() { [EOL]     return _b; [EOL] } <line_num>: 46,46
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT) [EOL] public String getA() { [EOL]     return _a; [EOL] } <line_num>: 55,56
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL) [EOL] public String getB() { [EOL]     return _b; [EOL] } <line_num>: 58,59
public void testGlobal() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new SimpleBean()); [EOL]     assertEquals(2, result.size()); [EOL]     assertEquals("a", result.get("a")); [EOL]     assertNull(result.get("b")); [EOL]     assertTrue(result.containsKey("b")); [EOL] } <line_num>: 79,87
public void testNonNullByClass() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new NoNullsBean()); [EOL]     assertEquals(1, result.size()); [EOL]     assertFalse(result.containsKey("a")); [EOL]     assertNull(result.get("a")); [EOL]     assertTrue(result.containsKey("b")); [EOL]     assertNull(result.get("b")); [EOL] } <line_num>: 89,98
public void testNonDefaultByClass() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     NonDefaultBean bean = new NonDefaultBean(); [EOL]     bean._a = "notA"; [EOL]     Map<String, Object> result = writeAndMap(m, bean); [EOL]     assertEquals(1, result.size()); [EOL]     assertTrue(result.containsKey("a")); [EOL]     assertEquals("notA", result.get("a")); [EOL]     assertFalse(result.containsKey("b")); [EOL]     assertNull(result.get("b")); [EOL] } <line_num>: 100,112
public void testMixedMethod() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     MixedBean bean = new MixedBean(); [EOL]     bean._a = "xyz"; [EOL]     bean._b = null; [EOL]     Map<String, Object> result = writeAndMap(m, bean); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals("xyz", result.get("a")); [EOL]     assertFalse(result.containsKey("b")); [EOL]     bean._a = "a"; [EOL]     bean._b = "b"; [EOL]     result = writeAndMap(m, bean); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals("b", result.get("b")); [EOL]     assertFalse(result.containsKey("a")); [EOL] } <line_num>: 114,132
public void testDefaultForEmptyList() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     assertEquals("{}", m.writeValueAsString(new ListBean())); [EOL] } <line_num>: 134,138
public void testNonEmptyDefaultArray() throws IOException { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     assertEquals("{}", m.writeValueAsString(new ArrayBean())); [EOL] } <line_num>: 141,145
