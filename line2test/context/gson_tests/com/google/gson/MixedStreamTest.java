 Car(String name, int color)
 Car()
public void testWriteMixedStreamed() throws IOException
public void testReadMixedStreamed() throws IOException
public void testReaderDoesNotMutateState() throws IOException
public void testWriteDoesNotMutateState() throws IOException
public void testReadInvalidState() throws IOException
public void testReadClosed() throws IOException
public void testWriteInvalidState() throws IOException
public void testWriteClosed() throws IOException
public void testWriteNulls()
public void testReadNulls()
public void testWriteHtmlSafe()
public void testWriteLenient()
public int hashCode()
public boolean equals(Object o)
Car BLUE_MUSTANG=Optional[new Car("mustang", 0x0000FF)]
Car BLACK_BMW=Optional[new Car("bmw", 0x000000)]
Car RED_MIATA=Optional[new Car("miata", 0xFF0000)]
String CARS_JSON=Optional["[\n" + "  {\n" + "    \"name\": \"mustang\",\n" + "    \"color\": 255\n" + "  },\n" + "  {\n" + "    \"name\": \"bmw\",\n" + "    \"color\": 0\n" + "  },\n" + "  {\n" + "    \"name\": \"miata\",\n" + "    \"color\": 16711680\n" + "  }\n" + "]"]
