public CtorValueBean(String d)
public CtorValueBean(int value)
public CtorValueBean(long value)
protected FactoryValueBean(String desc, int dummy)
public TestBean(int x, long y, String desc, URI uri, Collection<?> misc)
public TestBean()
public BeanWithList()
public BeanWithList(List<CtorValueBean> beans)
public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public String toString()
public boolean equals(Object o)
public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public static FactoryValueBean valueOf(String v)
public static FactoryValueBean valueOf(int v)
public static FactoryValueBean valueOf(long v)
public String toString()
public String getDesc()
public int getX()
public long getY()
public URI getURI()
public Collection<?> getMisc()
public void setDesc(String value)
public void setX(int value)
public void setY(long value)
public void setURI(URI value)
public void setMisc(Collection<?> value)
public boolean equals(Object o)
public String toString()
public List<CtorValueBean> getBeans()
public void setBeans(List<CtorValueBean> beans)
public int hashCode()
public boolean equals(Object o)
public String toString()
public void testFromStringCtor() throws Exception
public void testFromIntCtor() throws Exception
public void testFromLongCtor() throws Exception
public void testFromStringFactory() throws Exception
public void testFromIntFactory() throws Exception
public void testFromLongFactory() throws Exception
public void testSimpleBean() throws Exception
public void testListBean() throws Exception
public void testUnknownFields() throws Exception
