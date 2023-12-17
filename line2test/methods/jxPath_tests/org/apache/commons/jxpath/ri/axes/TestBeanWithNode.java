public Object getVendor() { [EOL]     return node; [EOL] } <line_num>: 34,36
public Object[] getVendors() { [EOL]     return new Object[] { node }; [EOL] } <line_num>: 38,40
public void setVendor(Object node) { [EOL]     this.node = node; [EOL] } <line_num>: 42,44
public Object getObject() { [EOL]     return object; [EOL] } <line_num>: 46,48
public void setObject(Object object) { [EOL]     this.object = object; [EOL] } <line_num>: 50,52
public static TestBeanWithNode createTestBeanWithDOM() { [EOL]     DocumentContainer docCtr = new DocumentContainer(JXPathTestCase.class.getResource("Vendor.xml")); [EOL]     Document doc = (Document) docCtr.getValue(); [EOL]     TestBeanWithNode tbwdom = new TestBeanWithNode(); [EOL]     tbwdom.setVendor(doc.getDocumentElement()); [EOL]     tbwdom.setObject(docCtr); [EOL]     return tbwdom; [EOL] } <line_num>: 54,63
