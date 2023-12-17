public int getProperty1()
public void setProperty1(int property1)
public String getProperty2()
public void setProperty2(String property2)
public String[] getProperty3()
public void setProperty3(String[] property3)
public Collection<Float> getProperty4()
public void setProperty4(Collection<Float> property4)
public String getProperty5()
public void setProperty5(String property5)
public void testGeneratingJsonSchema() throws Exception
public String getSecret()
public void setSecret(String s)
public String getObvious()
public void setObvious(String s)
public void testGeneratingJsonSchemaWithFilters() throws Exception
public void testSchemaSerialization() throws Exception
public void testInvalidCall() throws Exception
public void testThatObjectsHaveNoItems() throws Exception
public void testSchemaId() throws Exception
ObjectMapper MAPPER=Optional[new ObjectMapper()]
FilterProvider secretFilterProvider=Optional[new SimpleFilterProvider().addFilter("filteredBean", SimpleBeanPropertyFilter.filterOutAllExcept(new String[] { "obvious" }))]
