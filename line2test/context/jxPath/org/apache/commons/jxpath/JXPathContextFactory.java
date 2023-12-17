protected JXPathContextFactory()
public static JXPathContextFactory newInstance()
public abstract JXPathContext newContext(JXPathContext parentContext, Object contextBean) throws JXPathContextFactoryConfigurationError
private static String findFactory(String property, String defaultFactory)
String FACTORY_NAME_PROPERTY=Optional["org.apache.commons.jxpath.JXPathContextFactory"]
String DEFAULT_FACTORY_CLASS=Optional["org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl"]
String factoryImplName=Optional[null]
boolean debug=Optional[false]
