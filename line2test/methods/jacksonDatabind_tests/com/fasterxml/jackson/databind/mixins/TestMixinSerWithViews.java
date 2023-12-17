public A(String name, int age, String surname) { [EOL]     super(); [EOL]     this.name = name; [EOL]     this.age = age; [EOL]     this.surname = surname; [EOL] } <line_num>: 131,131
public String getName() { [EOL]     return name; [EOL] } <line_num>: 23,23
public String getNameHidden() { [EOL]     return nameHidden; [EOL] } <line_num>: 24,24
public void setName(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 26,28
public void setNameHidden(String nameHidden) { [EOL]     this.nameHidden = nameHidden; [EOL] } <line_num>: 30,32
public String getNameNull() { [EOL]     return nameNull; [EOL] } <line_num>: 47,50
public void setNameNull(String nameNull) { [EOL]     this.nameNull = nameNull; [EOL] } <line_num>: 52,55
public String getNameComplex() { [EOL]     return nameComplex; [EOL] } <line_num>: 57,60
public void setNameComplex(String nameComplex) { [EOL]     this.nameComplex = nameComplex; [EOL] } <line_num>: 62,65
public String getNameComplexHidden() { [EOL]     return nameComplexHidden; [EOL] } <line_num>: 67,70
public void setNameComplexHidden(String nameComplexHidden) { [EOL]     this.nameComplexHidden = nameComplexHidden; [EOL] } <line_num>: 72,75
public SimpleTestData getTestData() { [EOL]     return testData; [EOL] } <line_num>: 77,80
public void setTestData(SimpleTestData testData) { [EOL]     this.testData = testData; [EOL] } <line_num>: 82,85
public SimpleTestData[] getTestDataArray() { [EOL]     return testDataArray; [EOL] } <line_num>: 87,90
public void setTestDataArray(SimpleTestData[] testDataArray) { [EOL]     this.testDataArray = testDataArray; [EOL] } <line_num>: 92,95
@JsonView(Views.View.class) [EOL] String getName(); <line_num>: 100,101
@JsonView(Views.View.class) [EOL] String getNameNull(); <line_num>: 106,107
@JsonView(Views.View.class) [EOL] String getNameComplex(); <line_num>: 109,110
@JsonView(Views.View.class) [EOL] String getNameComplexHidden(); <line_num>: 112,113
@JsonView(Views.View.class) [EOL] SimpleTestData getTestData(); <line_num>: 115,116
@JsonView(Views.View.class) [EOL] SimpleTestData[] getTestDataArray(); <line_num>: 118,119
public String getName() { [EOL]     return name; [EOL] } <line_num>: 133,133
public void setName(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 135,135
public int getAge() { [EOL]     return age; [EOL] } <line_num>: 137,137
public void setAge(int age) { [EOL]     this.age = age; [EOL] } <line_num>: 139,139
public String getSurname() { [EOL]     return surname; [EOL] } <line_num>: 141,141
public void setSurname(String surname) { [EOL]     this.surname = surname; [EOL] } <line_num>: 143,143
@JsonProperty("name") [EOL] @JsonView(AView.class) [EOL] abstract String getName(); <line_num>: 149,151
@JsonProperty("age") [EOL] @JsonView(AView.class) [EOL] abstract int getAge(); <line_num>: 152,153
public void testDataBindingUsage() throws Exception { [EOL]     ObjectMapper objectMapper = createObjectMapper(); [EOL]     ObjectWriter objectWriter = objectMapper.writerWithView(Views.View.class).withDefaultPrettyPrinter(); [EOL]     Object object = new ComplexTestData(); [EOL]     String json = objectWriter.writeValueAsString(object); [EOL]     assertTrue(json.indexOf("nameHidden") == -1); [EOL]     assertTrue(json.indexOf("\"name\" : \"shown\"") > 0); [EOL] } <line_num>: 162,170
public void testIssue560() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     A a = new A("myname", 29, "mysurname"); [EOL]     mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, Boolean.FALSE); [EOL]     mapper.addMixInAnnotations(A.class, AMixInAnnotation.class); [EOL]     String json = mapper.writerWithView(AView.class).writeValueAsString(a); [EOL]     assertTrue(json.indexOf("\"name\"") > 0); [EOL] } <line_num>: 172,183
private ObjectMapper createObjectMapper() { [EOL]     ObjectMapper objectMapper = new ObjectMapper(); [EOL]     objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); [EOL]     objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL); [EOL]     objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false); [EOL]     Map<Class<?>, Class<?>> sourceMixins = new HashMap<Class<?>, Class<?>>(); [EOL]     sourceMixins.put(SimpleTestData.class, TestDataJAXBMixin.class); [EOL]     sourceMixins.put(ComplexTestData.class, TestComplexDataJAXBMixin.class); [EOL]     objectMapper.setMixInAnnotations(sourceMixins); [EOL]     return objectMapper; [EOL] } <line_num>: 191,204
