protected ValueClassXY(int x, int y)
protected ValueClassABC(int a, int b, int c)
protected ValueImmutable(int v)
private BuildImmutable()
private BuildImmutable(int v)
protected ValueFoo(int v)
protected CreatorValue(int a, int b, int c)
public CreatorBuilder(@JsonProperty("a") int a, @JsonProperty("b") int b)
public SimpleBuilderXY withX(int x)
public SimpleBuilderXY withY(int y)
public ValueClassXY build()
public BuildABC assignB(int b)
public void c(int c)
public ValueClassABC build()
public BuildImmutable withValue(int v)
public ValueImmutable build()
public BuildFoo fooValue(int v)
public ValueFoo construct()
public CreatorBuilder withC(int v)
public CreatorValue build()
public void testSimple() throws Exception
public void testMultiAccess() throws Exception
public void testImmutable() throws Exception
public void testCustomWith() throws Exception
public void testWithCreator() throws Exception
ObjectMapper mapper=Optional[new ObjectMapper()]
