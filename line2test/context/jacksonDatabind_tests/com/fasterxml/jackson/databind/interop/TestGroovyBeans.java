public void testSimpleSerialization() throws Exception
public void testSimpleDeserialization() throws Exception
protected Class<?> defineGroovyClass(String src) throws Exception
protected Object newGroovyObject(String src) throws Exception
String SIMPLE_POGO=Optional["public class GBean {\n" + "long id = 3;\n" + "String name = \"whome\";\n" + "}"]
ObjectMapper MAPPER=Optional[new ObjectMapper()]
