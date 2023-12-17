protected ConstructorBean(@JsonProperty("x") int x)
protected BooleanConstructorBean(Boolean b)
protected BooleanConstructorBean2(boolean b)
protected DoubleConstructorBean(Double d)
private FactoryBean(double value, boolean dummy)
private LongFactoryBean(long v)
private StringFactoryBean(String v, boolean dummy)
protected BrokenBean(@JsonProperty("a") int a, int b)
protected CreatorBean(@JsonProperty("a") String paramA, @JsonProperty("x") int paramX)
private CreatorBean(String a, int x, boolean dummy)
private MixIn(String a, int x)
public MultiBean(int v)
public MultiBean(double v)
public MultiBean(String v)
public MultiBean(boolean v)
public NoArgFactoryBean(int value)
protected ConstructorAndPropsBean(@JsonProperty("a") int a, @JsonProperty("b") int b)
protected FactoryAndPropsBean(@JsonProperty("a") boolean[] arg)
public DeferredConstructorAndPropsBean(@JsonProperty("createA") int[] a)
 DeferredFactoryAndPropsBean(@JsonProperty("ctor") String str)
 MapWithCtor()
public MapWithCtor(@JsonProperty("number") int nr, @JsonProperty("text") String t)
private MapWithFactory(Boolean b)
protected static FactoryBean createIt(@JsonProperty("f") double value)
protected static LongFactoryBean valueOf(long v)
protected static StringFactoryBean valueOf(String v)
 static FactoryBean createIt(@JsonProperty("mixed") double xyz)
public static CreatorBean buildMeUpButterCup(@JsonProperty("a") String paramA, @JsonProperty("x") int paramX)
public static NoArgFactoryBean create()
public void setC(boolean value)
public void setB(int value)
public void setC(int value)
public void setPropA(String a)
public void setPropB(String b)
public void setProp(String str)
 static MapWithFactory createIt(@JsonProperty("b") Boolean b)
public void testSimpleConstructor() throws Exception
public void testNoArgsFactory() throws Exception
public void testSimpleDoubleConstructor() throws Exception
public void testSimpleBooleanConstructor() throws Exception
public void testSimpleFactory() throws Exception
public void testLongFactory() throws Exception
public void testStringFactory() throws Exception
public void testConstructorCreator() throws Exception
public void testConstructorAndProps() throws Exception
public void testFactoryAndProps() throws Exception
public void testMultipleCreators() throws Exception
public void testDeferredConstructorAndProps() throws Exception
public void testDeferredFactoryAndProps() throws Exception
public void testFactoryCreatorWithMixin() throws Exception
public void testFactoryCreatorWithRenamingMixin() throws Exception
public void testMapWithConstructor() throws Exception
public void testMapWithFactory() throws Exception
public void testBrokenConstructor() throws Exception
ObjectMapper MAPPER=Optional[new ObjectMapper()]
