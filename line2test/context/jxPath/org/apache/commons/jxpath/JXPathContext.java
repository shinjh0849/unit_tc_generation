protected JXPathContext(JXPathContext parentContext, Object contextBean)
public static JXPathContext newContext(Object contextBean)
public static JXPathContext newContext(JXPathContext parentContext, Object contextBean)
private static JXPathContextFactory getContextFactory()
public JXPathContext getParentContext()
public Object getContextBean()
public abstract Pointer getContextPointer()
public abstract JXPathContext getRelativeContext(Pointer pointer)
public void setVariables(Variables vars)
public Variables getVariables()
public void setFunctions(Functions functions)
public Functions getFunctions()
public void setFactory(AbstractFactory factory)
public AbstractFactory getFactory()
public void setLocale(Locale locale)
public Locale getLocale()
public void setDecimalFormatSymbols(String name, DecimalFormatSymbols symbols)
public DecimalFormatSymbols getDecimalFormatSymbols(String name)
public void setLenient(boolean lenient)
public boolean isLenient()
public static CompiledExpression compile(String xpath)
protected abstract CompiledExpression compilePath(String xpath)
public Object selectSingleNode(String xpath)
public List selectNodes(String xpath)
public abstract Object getValue(String xpath)
public abstract Object getValue(String xpath, Class requiredType)
public abstract void setValue(String xpath, Object value)
public abstract Pointer createPath(String xpath)
public abstract Pointer createPathAndSetValue(String xpath, Object value)
public abstract void removePath(String xpath)
public abstract void removeAll(String xpath)
public abstract Iterator iterate(String xpath)
public abstract Pointer getPointer(String xpath)
public abstract Iterator iteratePointers(String xpath)
public void setIdentityManager(IdentityManager idManager)
public IdentityManager getIdentityManager()
public Pointer getPointerByID(String id)
public void setKeyManager(KeyManager keyManager)
public KeyManager getKeyManager()
public Pointer getPointerByKey(String key, String value)
public void registerNamespace(String prefix, String namespaceURI)
public String getNamespaceURI(String prefix)
public void setNamespaceContextPointer(Pointer namespaceContextPointer)
public Pointer getNamespaceContextPointer()
public void registerDefaultNamespace(String uri)
public String getDefaultNamespaceURI()
JXPathContext parentContext
Object contextBean
Variables vars
Functions functions
AbstractFactory factory
Locale locale
boolean lenientSet=Optional[false]
boolean lenient=Optional[false]
IdentityManager idManager
KeyManager keyManager
HashMap decimalFormats
JXPathContextFactory contextFactory
JXPathContext compilationContext
PackageFunctions GENERIC_FUNCTIONS=Optional[new PackageFunctions("", null)]
