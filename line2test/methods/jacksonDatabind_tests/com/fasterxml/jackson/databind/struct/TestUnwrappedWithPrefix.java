public Unwrapping() { [EOL] } <line_num>: 14,14
public Unwrapping(String str, int x, int y) { [EOL]     name = str; [EOL]     location = new Location(x, y); [EOL] } <line_num>: 15,18
public DeepUnwrapping() { [EOL] } <line_num>: 26,26
public DeepUnwrapping(String str, int x, int y) { [EOL]     unwrapped = new Unwrapping(str, x, y); [EOL] } <line_num>: 27,29
public Location() { [EOL] } <line_num>: 36,36
public Location(int x, int y) { [EOL]     this.x = x; [EOL]     this.y = y; [EOL] } <line_num>: 37,40
public PrefixUnwrap() { [EOL] } <line_num>: 50,50
public PrefixUnwrap(String str, int x, int y) { [EOL]     name = str; [EOL]     location = new Location(x, y); [EOL] } <line_num>: 51,54
public DeepPrefixUnwrap() { [EOL] } <line_num>: 62,62
public DeepPrefixUnwrap(String str, int x, int y) { [EOL]     unwrapped = new PrefixUnwrap(str, x, y); [EOL] } <line_num>: 63,65
public ConfigRoot() { [EOL] } <line_num>: 78,78
public ConfigRoot(String name, int value) { [EOL]     general = new ConfigGeneral(name); [EOL]     misc.value = value; [EOL] } <line_num>: 79,83
public ConfigAlternate() { [EOL] } <line_num>: 96,96
public ConfigAlternate(int id, String name, int value) { [EOL]     this.id = id; [EOL]     general = new ConfigGeneral(name); [EOL]     misc.value = value; [EOL] } <line_num>: 97,102
public ConfigGeneral() { [EOL] } <line_num>: 110,110
public ConfigGeneral(String name) { [EOL]     names.name = name; [EOL] } <line_num>: 111,113
public void testPrefixedUnwrappingSerialize() throws Exception { [EOL]     assertEquals("{\"name\":\"Tatu\",\"_x\":1,\"_y\":2}", mapper.writeValueAsString(new PrefixUnwrap("Tatu", 1, 2))); [EOL] } <line_num>: 134,138
public void testDeepPrefixedUnwrappingSerialize() throws Exception { [EOL]     String json = mapper.writeValueAsString(new DeepPrefixUnwrap("Bubba", 1, 1)); [EOL]     assertEquals("{\"u.name\":\"Bubba\",\"u._x\":1,\"u._y\":1}", json); [EOL] } <line_num>: 140,144
public void testHierarchicConfigSerialize() throws Exception { [EOL]     String json = mapper.writeValueAsString(new ConfigRoot("Fred", 25)); [EOL]     assertEquals("{\"general.names.name\":\"Fred\",\"misc.value\":25}", json); [EOL] } <line_num>: 146,150
public void testPrefixedUnwrapping() throws Exception { [EOL]     PrefixUnwrap bean = mapper.readValue("{\"name\":\"Axel\",\"_x\":4,\"_y\":7}", PrefixUnwrap.class); [EOL]     assertNotNull(bean); [EOL]     assertEquals("Axel", bean.name); [EOL]     assertNotNull(bean.location); [EOL]     assertEquals(4, bean.location.x); [EOL]     assertEquals(7, bean.location.y); [EOL] } <line_num>: 158,166
public void testDeepPrefixedUnwrappingDeserialize() throws Exception { [EOL]     DeepPrefixUnwrap bean = mapper.readValue("{\"u.name\":\"Bubba\",\"u._x\":2,\"u._y\":3}", DeepPrefixUnwrap.class); [EOL]     assertNotNull(bean.unwrapped); [EOL]     assertNotNull(bean.unwrapped.location); [EOL]     assertEquals(2, bean.unwrapped.location.x); [EOL]     assertEquals(3, bean.unwrapped.location.y); [EOL]     assertEquals("Bubba", bean.unwrapped.name); [EOL] } <line_num>: 168,177
public void testHierarchicConfigDeserialize() throws Exception { [EOL]     ConfigRoot root = mapper.readValue("{\"general.names.name\":\"Bob\",\"misc.value\":3}", ConfigRoot.class); [EOL]     assertNotNull(root.general); [EOL]     assertNotNull(root.general.names); [EOL]     assertNotNull(root.misc); [EOL]     assertEquals(3, root.misc.value); [EOL]     assertEquals("Bob", root.general.names.name); [EOL] } <line_num>: 179,188
public void testHierarchicConfigRoundTrip() throws Exception { [EOL]     ConfigAlternate input = new ConfigAlternate(123, "Joe", 42); [EOL]     String json = mapper.writeValueAsString(input); [EOL]     ConfigAlternate root = mapper.readValue(json, ConfigAlternate.class); [EOL]     assertEquals(123, root.id); [EOL]     assertNotNull(root.general); [EOL]     assertNotNull(root.general.names); [EOL]     assertNotNull(root.misc); [EOL]     assertEquals("Joe", root.general.names.name); [EOL]     assertEquals(42, root.misc.value); [EOL] } <line_num>: 196,208
