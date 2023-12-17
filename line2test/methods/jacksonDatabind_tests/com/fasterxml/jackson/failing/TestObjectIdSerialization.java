public Obj() { [EOL] } <line_num>: 25,26
public Obj(int id) { [EOL]     this.id = id; [EOL] } <line_num>: 28,30
public SetContainer() { [EOL] } <line_num>: 43,43
public SetContainer(int id) { [EOL]     this.id = id; [EOL] } <line_num>: 45,47
public ArrContainer() { [EOL] } <line_num>: 57,58
public ArrContainer(int id) { [EOL]     this.id = id; [EOL] } <line_num>: 60,62
public void testArraySerialization() throws Exception { [EOL]     Obj o = new Obj(1); [EOL]     Obj o2 = new Obj(7); [EOL]     ArrContainer oa = new ArrContainer(4); [EOL]     oa.objs = new Obj[] { o, o2 }; [EOL]     String json = MAPPER.writeValueAsString(oa); [EOL]     assertEquals(EXP_ARR_SET, json); [EOL] } <line_num>: 67,74
public void testCollectionSerialization() throws Exception { [EOL]     Obj o = new Obj(1); [EOL]     Obj o2 = new Obj(7); [EOL]     SetContainer os = new SetContainer(4); [EOL]     os.objs.add(o); [EOL]     os.objs.add(o2); [EOL]     String json = MAPPER.writeValueAsString(os); [EOL]     assertEquals(EXP_ARR_SET, json); [EOL] } <line_num>: 76,84
public void testDeserialization() throws Exception { [EOL]     Obj o = new Obj(1); [EOL]     o.objGroup = new SetContainer(4); [EOL]     String json = MAPPER.writeValueAsString(o); [EOL]     Obj deser = MAPPER.readValue(json, Obj.class); [EOL]     assertEquals(deser.id, 1); [EOL]     assertEquals(deser.objGroup.id, 4); [EOL] } <line_num>: 86,93
