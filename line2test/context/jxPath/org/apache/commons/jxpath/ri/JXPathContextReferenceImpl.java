protected JXPathContextReferenceImpl(JXPathContext parentContext, Object contextBean)
public JXPathContextReferenceImpl(JXPathContext parentContext, Object contextBean, Pointer contextPointer)
public int compare(Object a, Object b)
private static void createNodeFactoryArray()
public static void addNodePointerFactory(NodePointerFactory factory)
public static NodePointerFactory[] getNodePointerFactories()
protected Compiler getCompiler()
protected CompiledExpression compilePath(String xpath)
private Expression compileExpression(String xpath)
public Object getValue(String xpath)
public Object getValue(String xpath, Expression expr)
public Object getValue(String xpath, Class requiredType)
public Object getValue(String xpath, Expression expr, Class requiredType)
public Iterator iterate(String xpath)
public Iterator iterate(String xpath, Expression expr)
public Pointer getPointer(String xpath)
public Pointer getPointer(String xpath, Expression expr)
public void setValue(String xpath, Object value)
public void setValue(String xpath, Expression expr, Object value)
public Pointer createPath(String xpath)
public Pointer createPath(String xpath, Expression expr)
public Pointer createPathAndSetValue(String xpath, Object value)
public Pointer createPathAndSetValue(String xpath, Expression expr, Object value)
private Pointer setValue(String xpath, Expression expr, Object value, boolean create)
private void checkSimplePath(Expression expr)
public Iterator iteratePointers(String xpath)
public Iterator iteratePointers(String xpath, Expression expr)
public void removePath(String xpath)
public void removePath(String xpath, Expression expr)
public void removeAll(String xpath)
public void removeAll(String xpath, Expression expr)
public JXPathContext getRelativeContext(Pointer pointer)
public Pointer getContextPointer()
private NodePointer getAbsoluteRootPointer()
private EvalContext getEvalContext()
public EvalContext getAbsoluteRootContext()
public NodePointer getVariablePointer(QName name)
public Function getFunction(QName functionName, Object[] parameters)
public void registerNamespace(String prefix, String namespaceURI)
public String getNamespaceURI(String prefix)
public void setNamespaceContextPointer(Pointer pointer)
public Pointer getNamespaceContextPointer()
public NamespaceResolver getNamespaceResolver()
public String getDefaultNamespaceURI()
public void registerDefaultNamespace(String uri)
public static Object allocateConditionally(String className, String existenceCheckClassName)
boolean USE_SOFT_CACHE=Optional[true]
Compiler COMPILER=Optional[new TreeCompiler()]
Map compiled=Optional[new HashMap()]
int cleanupCount=Optional[0]
Vector nodeFactories=Optional[new Vector()]
NodePointerFactory[] nodeFactoryArray=Optional[null]
Pointer rootPointer
Pointer contextPointer
NamespaceResolver namespaceResolver
String defaultNamespaceURI
int CLEANUP_THRESHOLD=Optional[500]
