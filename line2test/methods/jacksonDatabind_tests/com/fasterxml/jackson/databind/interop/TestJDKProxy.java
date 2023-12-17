public Planet() { [EOL] } <line_num>: 21,21
public Planet(String s) { [EOL]     name = s; [EOL] } <line_num>: 22,22
public ProxyUtil(Object o) { [EOL]     obj = o; [EOL] } <line_num>: 58,60
String getName(); <line_num>: 13,13
String setName(String s); <line_num>: 14,14
@Override [EOL] public String getName() { [EOL]     return name; [EOL] } <line_num>: 24,25
@Override [EOL] public String setName(String iName) { [EOL]     name = iName; [EOL]     return name; [EOL] } <line_num>: 26,29
public void testSimple() throws Exception { [EOL]     IPlanet input = getProxy(IPlanet.class, new Planet("Foo")); [EOL]     String json = MAPPER.writeValueAsString(input); [EOL]     assertEquals("{\"name\":\"Foo\"}", json); [EOL]     Planet output = MAPPER.readValue(json, Planet.class); [EOL]     assertEquals("Foo", output.getName()); [EOL] } <line_num>: 38,47
@Override [EOL] public Object invoke(Object proxy, Method m, Object[] args) throws Throwable { [EOL]     Object result = null; [EOL]     result = m.invoke(obj, args); [EOL]     return result; [EOL] } <line_num>: 61,66
public static <T> T getProxy(Class<T> type, Object obj) { [EOL]     class ProxyUtil implements InvocationHandler { [EOL]  [EOL]         Object obj; [EOL]  [EOL]         public ProxyUtil(Object o) { [EOL]             obj = o; [EOL]         } [EOL]  [EOL]         @Override [EOL]         public Object invoke(Object proxy, Method m, Object[] args) throws Throwable { [EOL]             Object result = null; [EOL]             result = m.invoke(obj, args); [EOL]             return result; [EOL]         } [EOL]     } [EOL]     @SuppressWarnings("unchecked") [EOL]     T proxy = (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[] { type }, new ProxyUtil(obj)); [EOL]     return proxy; [EOL] } <line_num>: 55,72
