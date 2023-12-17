public ExternalBean()
public ExternalBean(int v)
public ExternalBeanWithDefault()
public ExternalBeanWithDefault(int v)
public ExternalBean3()
public ExternalBean3(int v)
public ExternalBeanWithCreator(@JsonProperty("foo") int f)
public ValueBean()
public ValueBean(int v)
protected Derived1()
public Derived1(@JsonProperty("derived1Property") String d1p, @JsonProperty("baseProperty") String bp)
protected Derived2()
public Derived2(@JsonProperty("derived2Property") String d2p, @JsonProperty("baseProperty") String bp)
protected BaseContainer()
public BaseContainer(@JsonProperty("baseContainerProperty") String bcp, @JsonProperty("base") Base b)
public ExternalTypeWithNonPOJO()
public ExternalTypeWithNonPOJO(Object o)
public AsValueThingy(long l)
public AsValueThingy()
 String getBaseProperty()
public String getBaseProperty()
public String getDerived1Property()
public String getBaseProperty()
public String getDerived2Property()
public String getBaseContainerProperty()
public Base getBase()
public String getPetType()
public void setPetType(String petType)
public Date serialization()
public void testSimpleSerialization() throws Exception
public void testImproperExternalIdSerialization() throws Exception
public void testSimpleDeserialization() throws Exception
public void testMultipleTypeIdsDeserialization() throws Exception
public void testExternalTypeWithCreator() throws Exception
public void testImproperExternalIdDeserialization() throws Exception
public void testIssue798() throws Exception
public void testIssue831() throws Exception
public void testWithScalar118() throws Exception
public void testWithNaturalScalar118() throws Exception
public void testWithAsValue() throws Exception
ObjectMapper MAPPER=Optional[new ObjectMapper()]
