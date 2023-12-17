public CtorBean(@JacksonInject String n, @JsonProperty("age") int a)
public CtorBean2(@JacksonInject String n, @JacksonInject("number") Integer a)
public void injectThird(long v)
public void testSimple() throws Exception
public void testWithCtors() throws Exception
public void testTwoInjectablesViaCreator() throws Exception
public void testInvalidDup() throws Exception
