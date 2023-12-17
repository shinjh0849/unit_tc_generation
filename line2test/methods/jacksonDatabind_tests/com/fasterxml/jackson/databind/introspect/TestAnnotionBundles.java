@MyIgnoral [EOL] public String getIgnored() { [EOL]     return "foo"; [EOL] } <line_num>: 25,26
public int getA() { [EOL]     return 13; [EOL] } <line_num>: 40,40
@JsonProperty [EOL] public int getB() { [EOL]     return 5; [EOL] } <line_num>: 42,43
public void testBundledIgnore() throws Exception { [EOL]     assertEquals("{\"foobar\":13}", MAPPER.writeValueAsString(new Bean())); [EOL] } <line_num>: 63,66
public void testVisibilityBundle() throws Exception { [EOL]     assertEquals("{\"b\":5}", MAPPER.writeValueAsString(new NoAutoDetect())); [EOL] } <line_num>: 68,71
public void testIssue92() throws Exception { [EOL]     assertEquals("{\"_id\":\"abc\"}", MAPPER.writeValueAsString(new Bean92())); [EOL] } <line_num>: 73,76
