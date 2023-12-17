public void testSerializeSimpleNonNS() throws Exception
public void testDeserializeNonNS() throws Exception
public void testDeserializeNS() throws Exception
protected static String normalizeOutput(String output)
String SIMPLE_XML=Optional["<root attr='3'><leaf>Rock &amp; Roll!</leaf><?proc instr?></root>"]
String SIMPLE_XML_NS=Optional["<root ns:attr='abc' xmlns:ns='http://foo' />"]
