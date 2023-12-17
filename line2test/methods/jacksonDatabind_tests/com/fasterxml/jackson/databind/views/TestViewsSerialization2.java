public void testDataBindingUsage() throws Exception { [EOL]     ObjectMapper objectMapper = createObjectMapper(null); [EOL]     String result = serializeWithObjectMapper(new ComplexTestData(), Views.View.class, objectMapper); [EOL]     assertEquals(-1, result.indexOf("nameHidden")); [EOL] } <line_num>: 17,22
public void testDataBindingUsageWithoutView() throws Exception { [EOL]     ObjectMapper objectMapper = createObjectMapper(null); [EOL]     String json = serializeWithObjectMapper(new ComplexTestData(), null, objectMapper); [EOL]     assertTrue(json.indexOf("nameHidden") > 0); [EOL] } <line_num>: 24,29
private ObjectMapper createObjectMapper(Class<?> viewClass) { [EOL]     ObjectMapper objectMapper = new ObjectMapper(); [EOL]     objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); [EOL]     objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL); [EOL]     objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false); [EOL]     return objectMapper; [EOL] } <line_num>: 37,46
private String serializeWithObjectMapper(Object object, Class<? extends Views.View> view, ObjectMapper objectMapper) throws IOException { [EOL]     return objectMapper.writerWithView(view).writeValueAsString(object); [EOL] } <line_num>: 48,52
@JsonView(Views.View.class) [EOL] public String getNameNull() { [EOL]     return nameNull; [EOL] } <line_num>: 78,82
public void setNameNull(String nameNull) { [EOL]     this.nameNull = nameNull; [EOL] } <line_num>: 84,87
@JsonView(Views.View.class) [EOL] public String getNameComplex() { [EOL]     return nameComplex; [EOL] } <line_num>: 89,93
public void setNameComplex(String nameComplex) { [EOL]     this.nameComplex = nameComplex; [EOL] } <line_num>: 95,98
public String getNameComplexHidden() { [EOL]     return nameComplexHidden; [EOL] } <line_num>: 100,103
public void setNameComplexHidden(String nameComplexHidden) { [EOL]     this.nameComplexHidden = nameComplexHidden; [EOL] } <line_num>: 105,108
@JsonView(Views.View.class) [EOL] public SimpleTestData getTestData() { [EOL]     return testData; [EOL] } <line_num>: 110,114
public void setTestData(SimpleTestData testData) { [EOL]     this.testData = testData; [EOL] } <line_num>: 116,119
@JsonView(Views.View.class) [EOL] public SimpleTestData[] getTestDataArray() { [EOL]     return testDataArray; [EOL] } <line_num>: 121,125
public void setTestDataArray(SimpleTestData[] testDataArray) { [EOL]     this.testDataArray = testDataArray; [EOL] } <line_num>: 127,130
@JsonView(Views.View.class) [EOL] public String getName() { [EOL]     return name; [EOL] } <line_num>: 139,143
public void setName(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 145,148
public String getNameHidden() { [EOL]     return nameHidden; [EOL] } <line_num>: 150,153
public void setNameHidden(String nameHidden) { [EOL]     this.nameHidden = nameHidden; [EOL] } <line_num>: 155,158
