@JsonCreator [EOL] public BeanWithCreator(@JsonProperty("c") int c, @JsonProperty("a") int a) { [EOL]     this.a = a; [EOL]     this.c = c; [EOL] } <line_num>: 26,29
public BeanWithOrder(int a, int b, int c, int d) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL]     this.c = c; [EOL]     this.d = d; [EOL] } <line_num>: 37,42
public SubBeanWithOrder(int a, int b, int c, int d) { [EOL]     super(a, b, c, d); [EOL] } <line_num>: 48,50
@JsonProperty("b") [EOL] public String xB() { [EOL]     return "b"; [EOL] } <line_num>: 64,64
@JsonProperty("x") [EOL] public String aX() { [EOL]     return "x"; [EOL] } <line_num>: 65,65
public void testImplicitOrderByCreator() throws Exception { [EOL]     assertEquals("{\"c\":1,\"a\":2,\"b\":0}", serializeAsString(new BeanWithCreator(1, 2))); [EOL] } <line_num>: 82,85
public void testExplicitOrder() throws Exception { [EOL]     assertEquals("{\"c\":3,\"a\":1,\"b\":2,\"d\":4}", serializeAsString(new BeanWithOrder(1, 2, 3, 4))); [EOL] } <line_num>: 87,90
public void testAlphabeticOrder() throws Exception { [EOL]     assertEquals("{\"d\":4,\"a\":1,\"b\":2,\"c\":3}", serializeAsString(new SubBeanWithOrder(1, 2, 3, 4))); [EOL] } <line_num>: 92,95
public void testOrderWithMixins() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(BeanWithOrder.class, OrderMixIn.class); [EOL]     assertEquals("{\"b\":2,\"a\":1,\"c\":3,\"d\":4}", serializeAsString(m, new BeanWithOrder(1, 2, 3, 4))); [EOL] } <line_num>: 98,103
public void testOrderWrt268() throws Exception { [EOL]     assertEquals("{\"a\":\"a\",\"b\":\"b\",\"x\":\"x\",\"z\":\"z\"}", serializeAsString(new BeanFor268())); [EOL] } <line_num>: 106,110
public void testOrderWithFeature() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true); [EOL]     assertEquals("{\"a\":1,\"b\":2,\"c\":3,\"d\":4}", serializeAsString(m, new BeanFor459())); [EOL] } <line_num>: 113,118
