public Base() { [EOL]     this(0); [EOL] } <line_num>: 24,24
public Base(int v) { [EOL]     value = v; [EOL] } <line_num>: 25,27
public Impl() { [EOL]     this(0, 0); [EOL] } <line_num>: 34,34
public Impl(int v, int e) { [EOL]     super(v); [EOL]     extra = e; [EOL] } <line_num>: 35,38
private Base811() { [EOL] } <line_num>: 48,48
public Base811(Process owner) { [EOL]     this.owner = owner; [EOL]     if (owner == null) { [EOL]         id = 0; [EOL]     } else { [EOL]         id = ++owner.childIdCounter; [EOL]         owner.children.add(this); [EOL]     } [EOL] } <line_num>: 49,57
public Process() { [EOL]     super(null); [EOL] } <line_num>: 64,64
public Activity(Process owner, Activity parent) { [EOL]     super(owner); [EOL]     this.parent = parent; [EOL] } <line_num>: 69,72
private Activity() { [EOL]     super(); [EOL] } <line_num>: 73,75
public Scope(Process owner, Activity parent) { [EOL]     super(owner, parent); [EOL] } <line_num>: 80,82
private Scope() { [EOL]     super(); [EOL] } <line_num>: 83,85
public FaultHandler(Process owner) { [EOL]     super(owner); [EOL] } <line_num>: 91,93
protected FaultHandler() { [EOL] } <line_num>: 95,95
public Catch(Process owner, Activity parent) { [EOL]     super(owner, parent); [EOL] } <line_num>: 99,101
protected Catch() { [EOL] } <line_num>: 102,102
public void testPolymorphicRoundtrip() throws Exception { [EOL]     Impl in1 = new Impl(123, 456); [EOL]     in1.next = new Impl(111, 222); [EOL]     in1.next.next = in1; [EOL]     String json = mapper.writeValueAsString(in1); [EOL]     Base result0 = mapper.readValue(json, Base.class); [EOL]     assertNotNull(result0); [EOL]     assertSame(Impl.class, result0.getClass()); [EOL]     Impl result = (Impl) result0; [EOL]     assertEquals(123, result.value); [EOL]     assertEquals(456, result.extra); [EOL]     Impl result2 = (Impl) result.next; [EOL]     assertEquals(111, result2.value); [EOL]     assertEquals(222, result2.extra); [EOL]     assertSame(result, result2.next); [EOL] } <line_num>: 113,133
public void testIssue811() throws Exception { [EOL]     ObjectMapper om = new ObjectMapper(); [EOL]     om.disable(MapperFeature.AUTO_DETECT_CREATORS); [EOL]     om.disable(MapperFeature.AUTO_DETECT_GETTERS); [EOL]     om.disable(MapperFeature.AUTO_DETECT_IS_GETTERS); [EOL]     om.setVisibility(PropertyAccessor.FIELD, Visibility.ANY); [EOL]     om.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX); [EOL]     om.enable(SerializationFeature.INDENT_OUTPUT); [EOL]     om.enableDefaultTypingAsProperty(DefaultTyping.NON_FINAL, "@class"); [EOL]     Process p = new Process(); [EOL]     Scope s = new Scope(p, null); [EOL]     FaultHandler fh = new FaultHandler(p); [EOL]     Catch c = new Catch(p, s); [EOL]     fh.catchBlocks.add(c); [EOL]     s.faultHandlers.add(fh); [EOL]     String json = om.writeValueAsString(p); [EOL]     Process restored = om.readValue(json, Process.class); [EOL]     assertNotNull(restored); [EOL]     assertEquals(0, p.id); [EOL]     assertEquals(3, p.children.size()); [EOL]     assertSame(p, p.children.get(0).owner); [EOL]     assertSame(p, p.children.get(1).owner); [EOL]     assertSame(p, p.children.get(2).owner); [EOL] } <line_num>: 135,163
