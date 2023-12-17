@JsonIgnore [EOL] public int getY() { [EOL]     return 9; [EOL] } <line_num>: 26,26
public int getX() { [EOL]     return 1; [EOL] } <line_num>: 29,29
@JsonIgnore [EOL] public int getY2() { [EOL]     return 1; [EOL] } <line_num>: 31,31
@JsonIgnore [EOL] public int getY3() { [EOL]     return 2; [EOL] } <line_num>: 32,32
public int getX() { [EOL]     return 3; [EOL] } <line_num>: 39,39
@JsonIgnore(false) [EOL] public int getY() { [EOL]     return 4; [EOL] } <line_num>: 40,40
@JsonProperty("x") [EOL] @JsonIgnore [EOL] public int x() { [EOL]     return 1; [EOL] } <line_num>: 45,47
public int getY() { [EOL]     return 2; [EOL] } <line_num>: 49,49
@Override [EOL] @JsonIgnore(false) [EOL] public int x() { [EOL]     return 3; [EOL] } <line_num>: 58,60
public void testSimpleIgnore() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new SizeClassEnabledIgnore()); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Integer.valueOf(1), result.get("x")); [EOL]     assertNull(result.get("y")); [EOL] } <line_num>: 80,88
public void testDisabledIgnore() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new SizeClassDisabledIgnore()); [EOL]     assertEquals(2, result.size()); [EOL]     assertEquals(Integer.valueOf(3), result.get("x")); [EOL]     assertEquals(Integer.valueOf(4), result.get("y")); [EOL] } <line_num>: 90,98
public void testIgnoreOver() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new BaseClassIgnore()); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Integer.valueOf(2), result.get("y")); [EOL]     result = writeAndMap(m, new SubClassNonIgnore()); [EOL]     assertEquals(2, result.size()); [EOL]     assertEquals(Integer.valueOf(3), result.get("x")); [EOL]     assertEquals(Integer.valueOf(2), result.get("y")); [EOL] } <line_num>: 104,118
public void testIgnoreType() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     assertEquals("{\"value\":13}", m.writeValueAsString(new NonIgnoredType())); [EOL] } <line_num>: 123,127
