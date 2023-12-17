public TypeParser(TypeFactory f)
public MyTokenizer(String str)
public JavaType parse(String canonical) throws IllegalArgumentException
protected JavaType parseType(MyTokenizer tokens) throws IllegalArgumentException
protected List<JavaType> parseTypes(MyTokenizer tokens) throws IllegalArgumentException
protected Class<?> findClass(String className, MyTokenizer tokens)
protected IllegalArgumentException _problem(MyTokenizer tokens, String msg)
public boolean hasMoreTokens()
public String nextToken()
public void pushBack(String token)
public String getAllInput()
public String getUsedInput()
public String getRemainingInput()
long serialVersionUID=Optional[1L]
TypeFactory _factory
