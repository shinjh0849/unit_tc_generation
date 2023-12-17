protected Animal() { [EOL] } <line_num>: 25,25
public Dog() { [EOL] } <line_num>: 47,47
public Cat() { [EOL] } <line_num>: 55,55
private AbstractRoot(String opt) { [EOL]     this.opt = opt; [EOL] } <line_num>: 63,65
private One(String opt) { [EOL]     super(opt); [EOL] } <line_num>: 84,86
@JsonCreator [EOL] public static Animal create(@JsonProperty("type") String type) { [EOL]     if ("dog".equals(type)) { [EOL]         return new Dog(); [EOL]     } [EOL]     if ("cat".equals(type)) { [EOL]         return new Cat(); [EOL]     } [EOL]     throw new IllegalArgumentException("No such animal type ('" + type + "')"); [EOL] } <line_num>: 31,41
public void setBarkVolume(double v) { [EOL]     barkVolume = v; [EOL] } <line_num>: 48,48
public void setLikesCream(boolean likesCreamSurely) { [EOL]     likesCream = likesCreamSurely; [EOL] } <line_num>: 56,56
@JsonCreator [EOL] public static final AbstractRoot make(@JsonProperty("which") int which, @JsonProperty("opt") String opt) { [EOL]     if (1 == which) { [EOL]         return new One(opt); [EOL]     } [EOL]     throw new RuntimeException("cannot instantiate " + which); [EOL] } <line_num>: 67,74
abstract public int getWhich(); <line_num>: 76,76
public final String getOpt() { [EOL]     return opt; [EOL] } <line_num>: 78,80
@Override [EOL] public int getWhich() { [EOL]     return 1; [EOL] } <line_num>: 88,90
public void testManualPolymorphicDog() throws Exception { [EOL]     Animal animal = MAPPER.readValue("{ \"type\":\"dog\", \"name\":\"Fido\", \"barkVolume\" : 95.0 }", Animal.class); [EOL]     assertEquals(Dog.class, animal.getClass()); [EOL]     assertEquals("Fido", animal.name); [EOL]     assertEquals(95.0, ((Dog) animal).barkVolume); [EOL] } <line_num>: 105,112
public void testManualPolymorphicCatBasic() throws Exception { [EOL]     Animal animal = MAPPER.readValue("{ \"name\" : \"Macavity\", \"type\":\"cat\", \"lives\":18, \"likesCream\":false }", Animal.class); [EOL]     assertEquals(Cat.class, animal.getClass()); [EOL]     assertEquals("Macavity", animal.name); [EOL]     Cat cat = (Cat) animal; [EOL]     assertEquals(18, cat.lives); [EOL]     assertEquals(false, cat.likesCream); [EOL] } <line_num>: 114,124
public void testManualPolymorphicCatWithReorder() throws Exception { [EOL]     Animal animal = MAPPER.readValue("{ \"likesCream\":true, \"name\" : \"Venla\", \"type\":\"cat\" }", Animal.class); [EOL]     assertEquals(Cat.class, animal.getClass()); [EOL]     assertEquals("Venla", animal.name); [EOL]     assertTrue(((Cat) animal).likesCream); [EOL] } <line_num>: 126,134
public void testManualPolymorphicWithNumbered() throws Exception { [EOL]     final ObjectWriter w = MAPPER.writerWithType(AbstractRoot.class); [EOL]     final ObjectReader r = MAPPER.reader(AbstractRoot.class); [EOL]     AbstractRoot input = AbstractRoot.make(1, "oh hai!"); [EOL]     String json = w.writeValueAsString(input); [EOL]     AbstractRoot result = r.readValue(json); [EOL]     assertNotNull(result); [EOL]     assertEquals("oh hai!", result.getOpt()); [EOL] } <line_num>: 136,146
