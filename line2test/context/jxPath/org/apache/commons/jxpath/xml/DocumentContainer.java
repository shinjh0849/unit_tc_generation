public DocumentContainer(URL xmlURL)
public DocumentContainer(URL xmlURL, String model)
public static void registerXMLParser(String model, XMLParser parser)
public static void registerXMLParser(String model, String parserClassName)
public Object getValue()
public Object parseXML(InputStream stream)
public void setValue(Object value)
private static final XMLParser getParser(String model)
String MODEL_DOM=Optional["DOM"]
String MODEL_JDOM=Optional["JDOM"]
Object document
URL xmlURL
String model
HashMap parserClasses=Optional[new HashMap()]
HashMap parsers=Optional[new HashMap()]
