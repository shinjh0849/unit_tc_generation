@JsonCreator [EOL] protected ConstructorBean(@JsonProperty("x") int x) { [EOL]     this.x = x; [EOL] } <line_num>: 29,31
@JsonCreator [EOL] protected BooleanConstructorBean(Boolean b) { [EOL]     this.b = b; [EOL] } <line_num>: 40,42
@JsonCreator [EOL] protected BooleanConstructorBean2(boolean b) { [EOL]     this.b = b; [EOL] } <line_num>: 47,49
@JsonCreator [EOL] protected DoubleConstructorBean(Double d) { [EOL]     this.d = d; [EOL] } <line_num>: 54,56
private FactoryBean(double value, boolean dummy) { [EOL]     d = value; [EOL] } <line_num>: 62,62
private LongFactoryBean(long v) { [EOL]     value = v; [EOL] } <line_num>: 72,72
private StringFactoryBean(String v, boolean dummy) { [EOL]     value = v; [EOL] } <line_num>: 82,82
@JsonCreator [EOL] protected BrokenBean(@JsonProperty("a") int a, int b) { [EOL] } <line_num>: 106,108
@JsonCreator [EOL] protected CreatorBean(@JsonProperty("a") String paramA, @JsonProperty("x") int paramX) { [EOL]     a = "ctor:" + paramA; [EOL]     x = 1 + paramX; [EOL] } <line_num>: 121,127
private CreatorBean(String a, int x, boolean dummy) { [EOL]     this.a = a; [EOL]     this.x = x; [EOL] } <line_num>: 129,132
@JsonIgnore [EOL] private MixIn(String a, int x) { [EOL] } <line_num>: 149,149
@JsonCreator [EOL] public MultiBean(int v) { [EOL]     value = v; [EOL] } <line_num>: 155,155
@JsonCreator [EOL] public MultiBean(double v) { [EOL]     value = v; [EOL] } <line_num>: 156,156
@JsonCreator [EOL] public MultiBean(String v) { [EOL]     value = v; [EOL] } <line_num>: 157,157
@JsonCreator [EOL] public MultiBean(boolean v) { [EOL]     value = v; [EOL] } <line_num>: 158,158
public NoArgFactoryBean(int value) { [EOL]     x = value; [EOL] } <line_num>: 166,166
@JsonCreator [EOL] protected ConstructorAndPropsBean(@JsonProperty("a") int a, @JsonProperty("b") int b) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL] } <line_num>: 186,191
@JsonCreator [EOL] protected FactoryAndPropsBean(@JsonProperty("a") boolean[] arg) { [EOL]     arg1 = arg; [EOL] } <line_num>: 204,207
@JsonCreator [EOL] public DeferredConstructorAndPropsBean(@JsonProperty("createA") int[] a) { [EOL]     createA = a; [EOL] } <line_num>: 219,223
@JsonCreator [EOL] DeferredFactoryAndPropsBean(@JsonProperty("ctor") String str) { [EOL]     ctor = str; [EOL] } <line_num>: 232,235
MapWithCtor() { [EOL]     this(-1, "default"); [EOL] } <line_num>: 252,252
@JsonCreator [EOL] public MapWithCtor(@JsonProperty("number") int nr, @JsonProperty("text") String t) { [EOL]     _number = nr; [EOL]     _text = t; [EOL] } <line_num>: 254,260
private MapWithFactory(Boolean b) { [EOL]     _b = b; [EOL] } <line_num>: 268,270
@JsonCreator [EOL] protected static FactoryBean createIt(@JsonProperty("f") double value) { [EOL]     return new FactoryBean(value, true); [EOL] } <line_num>: 64,66
@JsonCreator [EOL] static protected LongFactoryBean valueOf(long v) { [EOL]     return new LongFactoryBean(v); [EOL] } <line_num>: 74,76
@JsonCreator [EOL] static protected StringFactoryBean valueOf(String v) { [EOL]     return new StringFactoryBean(v, true); [EOL] } <line_num>: 84,86
static FactoryBean createIt(@JsonProperty("mixed") double xyz) { [EOL]     return null; [EOL] } <line_num>: 96,98
@JsonCreator [EOL] public static CreatorBean buildMeUpButterCup(@JsonProperty("a") String paramA, @JsonProperty("x") int paramX) { [EOL]     return new CreatorBean("factory:" + paramA, paramX - 1, false); [EOL] } <line_num>: 134,139
@JsonCreator [EOL] public static NoArgFactoryBean create() { [EOL]     return new NoArgFactoryBean(123); [EOL] } <line_num>: 168,169
public void setC(boolean value) { [EOL]     c = value; [EOL] } <line_num>: 193,193
public void setB(int value) { [EOL]     arg2 = value; [EOL] } <line_num>: 209,209
public void setC(int value) { [EOL]     arg3 = value; [EOL] } <line_num>: 210,210
public void setPropA(String a) { [EOL]     propA = a; [EOL] } <line_num>: 224,224
public void setPropB(String b) { [EOL]     propB = b; [EOL] } <line_num>: 225,225
public void setProp(String str) { [EOL]     prop = str; [EOL] } <line_num>: 237,237
@JsonCreator [EOL] static MapWithFactory createIt(@JsonProperty("b") Boolean b) { [EOL]     return new MapWithFactory(b); [EOL] } <line_num>: 272,276
public void testSimpleConstructor() throws Exception { [EOL]     ConstructorBean bean = MAPPER.readValue("{ \"x\" : 42 }", ConstructorBean.class); [EOL]     assertEquals(42, bean.x); [EOL] } <line_num>: 287,291
public void testNoArgsFactory() throws Exception { [EOL]     NoArgFactoryBean value = MAPPER.readValue("{\"y\":13}", NoArgFactoryBean.class); [EOL]     assertEquals(13, value.y); [EOL]     assertEquals(123, value.x); [EOL] } <line_num>: 294,299
public void testSimpleDoubleConstructor() throws Exception { [EOL]     Double exp = new Double("0.25"); [EOL]     DoubleConstructorBean bean = MAPPER.readValue(exp.toString(), DoubleConstructorBean.class); [EOL]     assertEquals(exp, bean.d); [EOL] } <line_num>: 301,306
public void testSimpleBooleanConstructor() throws Exception { [EOL]     BooleanConstructorBean bean = MAPPER.readValue(" true ", BooleanConstructorBean.class); [EOL]     assertEquals(Boolean.TRUE, bean.b); [EOL]     BooleanConstructorBean2 bean2 = MAPPER.readValue(" true ", BooleanConstructorBean2.class); [EOL]     assertTrue(bean2.b); [EOL] } <line_num>: 308,315
public void testSimpleFactory() throws Exception { [EOL]     FactoryBean bean = MAPPER.readValue("{ \"f\" : 0.25 }", FactoryBean.class); [EOL]     assertEquals(0.25, bean.d); [EOL] } <line_num>: 317,321
public void testLongFactory() throws Exception { [EOL]     long VALUE = 123456789000L; [EOL]     LongFactoryBean bean = MAPPER.readValue(String.valueOf(VALUE), LongFactoryBean.class); [EOL]     assertEquals(VALUE, bean.value); [EOL] } <line_num>: 323,328
public void testStringFactory() throws Exception { [EOL]     String str = "abc"; [EOL]     StringFactoryBean bean = MAPPER.readValue(quote(str), StringFactoryBean.class); [EOL]     assertEquals(str, bean.value); [EOL] } <line_num>: 330,335
public void testConstructorCreator() throws Exception { [EOL]     CreatorBean bean = MAPPER.readValue("{ \"a\" : \"xyz\", \"x\" : 12 }", CreatorBean.class); [EOL]     assertEquals(13, bean.x); [EOL]     assertEquals("ctor:xyz", bean.a); [EOL] } <line_num>: 337,343
public void testConstructorAndProps() throws Exception { [EOL]     ConstructorAndPropsBean bean = MAPPER.readValue("{ \"a\" : \"1\", \"b\": 2, \"c\" : true }", ConstructorAndPropsBean.class); [EOL]     assertEquals(1, bean.a); [EOL]     assertEquals(2, bean.b); [EOL]     assertEquals(true, bean.c); [EOL] } <line_num>: 345,352
public void testFactoryAndProps() throws Exception { [EOL]     FactoryAndPropsBean bean = MAPPER.readValue("{ \"a\" : [ false, true, false ], \"b\": 2, \"c\" : -1 }", FactoryAndPropsBean.class); [EOL]     assertEquals(2, bean.arg2); [EOL]     assertEquals(-1, bean.arg3); [EOL]     boolean[] arg1 = bean.arg1; [EOL]     assertNotNull(arg1); [EOL]     assertEquals(3, arg1.length); [EOL]     assertFalse(arg1[0]); [EOL]     assertTrue(arg1[1]); [EOL]     assertFalse(arg1[2]); [EOL] } <line_num>: 354,366
public void testMultipleCreators() throws Exception { [EOL]     MultiBean bean = MAPPER.readValue("123", MultiBean.class); [EOL]     assertEquals(Integer.valueOf(123), bean.value); [EOL]     bean = MAPPER.readValue(quote("abc"), MultiBean.class); [EOL]     assertEquals("abc", bean.value); [EOL]     bean = MAPPER.readValue("0.25", MultiBean.class); [EOL]     assertEquals(Double.valueOf(0.25), bean.value); [EOL] } <line_num>: 372,380
public void testDeferredConstructorAndProps() throws Exception { [EOL]     DeferredConstructorAndPropsBean bean = MAPPER.readValue("{ \"propB\" : \"...\", \"createA\" : [ 1 ], \"propA\" : null }", DeferredConstructorAndPropsBean.class); [EOL]     assertEquals("...", bean.propB); [EOL]     assertNull(bean.propA); [EOL]     assertNotNull(bean.createA); [EOL]     assertEquals(1, bean.createA.length); [EOL]     assertEquals(1, bean.createA[0]); [EOL] } <line_num>: 388,399
public void testDeferredFactoryAndProps() throws Exception { [EOL]     DeferredFactoryAndPropsBean bean = MAPPER.readValue("{ \"prop\" : \"1\", \"ctor\" : \"2\" }", DeferredFactoryAndPropsBean.class); [EOL]     assertEquals("1", bean.prop); [EOL]     assertEquals("2", bean.ctor); [EOL] } <line_num>: 401,407
public void testFactoryCreatorWithMixin() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(CreatorBean.class, MixIn.class); [EOL]     CreatorBean bean = m.readValue("{ \"a\" : \"xyz\", \"x\" : 12 }", CreatorBean.class); [EOL]     assertEquals(11, bean.x); [EOL]     assertEquals("factory:xyz", bean.a); [EOL] } <line_num>: 415,423
public void testFactoryCreatorWithRenamingMixin() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(FactoryBean.class, FactoryBeanMixIn.class); [EOL]     FactoryBean bean = m.readValue("{ \"mixed\" :  20.5 }", FactoryBean.class); [EOL]     assertEquals(20.5, bean.d); [EOL] } <line_num>: 425,432
public void testMapWithConstructor() throws Exception { [EOL]     MapWithCtor result = MAPPER.readValue("{\"text\":\"abc\", \"entry\":true, \"number\":123, \"xy\":\"yx\"}", MapWithCtor.class); [EOL]     assertEquals(Boolean.TRUE, result.get("entry")); [EOL]     assertEquals("yx", result.get("xy")); [EOL]     assertEquals(2, result.size()); [EOL]     assertEquals("abc", result._text); [EOL]     assertEquals(123, result._number); [EOL] } <line_num>: 441,453
public void testMapWithFactory() throws Exception { [EOL]     MapWithFactory result = MAPPER.readValue("{\"x\":\"...\",\"b\":true  }", MapWithFactory.class); [EOL]     assertEquals("...", result.get("x")); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Boolean.TRUE, result._b); [EOL] } <line_num>: 455,463
public void testBrokenConstructor() throws Exception { [EOL]     try { [EOL]         MAPPER.readValue("{ \"x\" : 42 }", BrokenBean.class); [EOL]     } catch (JsonMappingException je) { [EOL]         verifyException(je, "has no property name"); [EOL]     } [EOL] } <line_num>: 471,478
