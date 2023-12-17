public void testDataBindingUsage() throws Exception
public void testDataBindingUsageWithoutView() throws Exception
private ObjectMapper createObjectMapper(Class<?> viewClass)
private String serializeWithObjectMapper(Object object, Class<? extends Views.View> view, ObjectMapper objectMapper) throws IOException
public String getNameNull()
public void setNameNull(String nameNull)
public String getNameComplex()
public void setNameComplex(String nameComplex)
public String getNameComplexHidden()
public void setNameComplexHidden(String nameComplexHidden)
public SimpleTestData getTestData()
public void setTestData(SimpleTestData testData)
public SimpleTestData[] getTestDataArray()
public void setTestDataArray(SimpleTestData[] testDataArray)
public String getName()
public void setName(String name)
public String getNameHidden()
public void setNameHidden(String nameHidden)
