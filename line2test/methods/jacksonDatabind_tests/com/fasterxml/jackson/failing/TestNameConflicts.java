public Bean193(@JsonProperty("val1") int value1, @JsonProperty("val2") int value2) { [EOL]     this.x = value1; [EOL]     this.value2 = value2; [EOL] } <line_num>: 16,21
@JsonProperty("val2") [EOL] int x() { [EOL]     return value2; [EOL] } <line_num>: 23,27
public void testIssue193() throws Exception { [EOL]     String json = objectWriter().writeValueAsString(new Bean193(1, 2)); [EOL]     assertNotNull(json); [EOL] } <line_num>: 36,40
