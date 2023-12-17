@JsonProperty("size") [EOL] public int foo() { [EOL]     return size(); [EOL] } <line_num>: 22,23
public List<String> getValues() { [EOL]     return new ArrayList<String>(this); [EOL] } <line_num>: 25,27
public void setValues(List<String> v) { [EOL]     addAll(v); [EOL] } <line_num>: 29,31
public void setSize(int i) { [EOL] } <line_num>: 34,34
public void testListAsObject() throws Exception { [EOL]     CollectionAsPOJO list = new CollectionAsPOJO(); [EOL]     list.add("a"); [EOL]     list.add("b"); [EOL]     String json = MAPPER.writeValueAsString(list); [EOL]     assertEquals("{\"size\":2,\"values\":[\"a\",\"b\"]}", json); [EOL]     CollectionAsPOJO result = MAPPER.readValue(json, CollectionAsPOJO.class); [EOL]     assertEquals(2, result.size()); [EOL] } <line_num>: 47,59
