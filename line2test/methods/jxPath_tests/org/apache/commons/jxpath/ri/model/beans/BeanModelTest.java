public BeanModelTest(String name) { [EOL]     super(name); [EOL] } <line_num>: 39,41
public static TestSuite suite() { [EOL]     return (new TestSuite(BeanModelTest.class)); [EOL] } <line_num>: 46,48
protected Object createContextBean() { [EOL]     return new TestBean(); [EOL] } <line_num>: 50,52
protected AbstractFactory getAbstractFactory() { [EOL]     return new TestBeanFactory(); [EOL] } <line_num>: 54,56
public void testIndexedProperty() { [EOL]     JXPathContext context = JXPathContext.newContext(null, new TestIndexedPropertyBean()); [EOL]     assertXPathValueAndPointer(context, "indexed[1]", new Integer(0), "/indexed[1]"); [EOL] } <line_num>: 58,67
