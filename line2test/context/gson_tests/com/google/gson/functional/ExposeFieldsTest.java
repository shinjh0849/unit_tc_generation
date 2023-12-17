private ClassWithExposedFields()
public ClassWithExposedFields(Integer a, Integer b)
public ClassWithExposedFields(Integer a, Integer b, long c, double d, char e)
private ClassWithInterfaceField()
public ClassWithInterfaceField(SomeInterface interfaceField)
protected void setUp() throws Exception
public void testNullExposeFieldSerialization() throws Exception
public void testArrayWithOneNullExposeFieldObjectSerialization() throws Exception
public void testExposeAnnotationSerialization() throws Exception
public void testExposeAnnotationDeserialization() throws Exception
public void testNoExposedFieldSerialization() throws Exception
public void testNoExposedFieldDeserialization() throws Exception
public void testExposedInterfaceFieldSerialization() throws Exception
public void testExposedInterfaceFieldDeserialization() throws Exception
public String getExpectedJson()
public SomeInterface createInstance(Type type)
Gson gson
