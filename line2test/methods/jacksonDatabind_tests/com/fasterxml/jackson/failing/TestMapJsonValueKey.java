@JsonCreator [EOL] Wat(String wat) { [EOL]     this.wat = wat; [EOL] } <line_num>: 18,22
@JsonValue [EOL] public String getWat() { [EOL]     return wat; [EOL] } <line_num>: 24,28
@Override [EOL] public String toString() { [EOL]     return "[Wat: " + wat + "]"; [EOL] } <line_num>: 30,34
public void testMapJsonValueKey() throws Exception { [EOL]     Map<Wat, Boolean> map = new HashMap<Wat, Boolean>(); [EOL]     map.put(new Wat("3"), true); [EOL]     map.put(new Wat("x"), false); [EOL]     TypeReference<Map<Wat, Boolean>> type = new TypeReference<Map<Wat, Boolean>>() { [EOL]     }; [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     assertEquals(map, mapper.readValue(mapper.writeValueAsBytes(map), type)); [EOL] } <line_num>: 37,48
