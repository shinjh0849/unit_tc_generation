public DynaBeanModelTest(String name) { [EOL]     super(name); [EOL] } <line_num>: 34,36
public static TestSuite suite() { [EOL]     return new TestSuite(DynaBeanModelTest.class); [EOL] } <line_num>: 38,43
protected Object createContextBean() { [EOL]     return new WrapDynaBean(new TestBean()); [EOL] } <line_num>: 45,47
protected AbstractFactory getAbstractFactory() { [EOL]     return new TestDynaBeanFactory(); [EOL] } <line_num>: 49,51
