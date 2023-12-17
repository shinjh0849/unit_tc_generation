protected BaseClass() { [EOL] } <line_num>: 25,25
public BaseClass(String a, String b) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL] } <line_num>: 27,30
public LeafClass(String a, String b) { [EOL]     super(a, b); [EOL] } <line_num>: 57,57
@JsonProperty("b") [EOL] public String takeB() { [EOL]     return b; [EOL] } <line_num>: 32,33
@Override [EOL] @JsonProperty("b2") [EOL] public abstract String takeB(); <line_num>: 46,48
@JsonProperty [EOL] abstract String getFoobar(); <line_num>: 51,51
@Override [EOL] @JsonIgnore [EOL] public String takeB() { [EOL]     return null; [EOL] } <line_num>: 59,61
@Override [EOL] @JsonProperty [EOL] public int hashCode(); <line_num>: 67,68
int x() { [EOL]     return 42; [EOL] } <line_num>: 75,75
@JsonProperty("x") [EOL] abstract int x(); <line_num>: 85,85
@JsonProperty("notreally") [EOL] public int xxx() { [EOL]     return 3; [EOL] } <line_num>: 88,88
public abstract int getIt(); <line_num>: 91,91
public void testLeafMixin() throws IOException { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     Map<String, Object> result; [EOL]     BaseClass bean = new BaseClass("a1", "b2"); [EOL]     result = writeAndMap(mapper, bean); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals("b2", result.get("b")); [EOL]     mapper = new ObjectMapper(); [EOL]     mapper.addMixInAnnotations(BaseClass.class, MixIn.class); [EOL]     result = writeAndMap(mapper, bean); [EOL]     assertEquals(2, result.size()); [EOL]     assertEquals("b2", result.get("b2")); [EOL]     assertEquals("a1", result.get("a")); [EOL] } <line_num>: 105,123
public void testIntermediateMixin() throws IOException { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     Map<String, Object> result; [EOL]     LeafClass bean = new LeafClass("XXX", "b2"); [EOL]     mapper.addMixInAnnotations(BaseClass.class, MixIn.class); [EOL]     result = writeAndMap(mapper, bean); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals("XXX", result.get("a")); [EOL] } <line_num>: 130,140
public void testIntermediateMixin2() throws IOException { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.addMixInAnnotations(EmptyBean.class, MixInForSimple.class); [EOL]     Map<String, Object> result = writeAndMap(mapper, new SimpleBean()); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Integer.valueOf(42), result.get("x")); [EOL] } <line_num>: 146,153
public void testObjectMixin() throws IOException { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.addMixInAnnotations(Object.class, ObjectMixIn.class); [EOL]     Map<String, Object> result = writeAndMap(mapper, new BaseClass("a", "b")); [EOL]     assertEquals(2, result.size()); [EOL]     assertEquals("b", result.get("b")); [EOL]     Object ob = result.get("hashCode"); [EOL]     assertNotNull(ob); [EOL]     assertEquals(Integer.class, ob.getClass()); [EOL] } <line_num>: 160,190
