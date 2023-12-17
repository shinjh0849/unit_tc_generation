public JXPathCompiledExpression(String xpath, Expression expression) { [EOL]     this.xpath = xpath; [EOL]     this.expression = expression; [EOL] } <line_num>: 37,40
protected String getXPath() { [EOL]     return xpath; [EOL] } <line_num>: 42,44
protected Expression getExpression() { [EOL]     return expression; [EOL] } <line_num>: 46,48
public String toString() { [EOL]     return xpath; [EOL] } <line_num>: 50,52
public Object getValue(JXPathContext context) { [EOL]     return ((JXPathContextReferenceImpl) context).getValue(xpath, expression); [EOL] } <line_num>: 57,60
public Object getValue(JXPathContext context, Class requiredType) { [EOL]     return ((JXPathContextReferenceImpl) context).getValue(xpath, expression, requiredType); [EOL] } <line_num>: 65,68
public void setValue(JXPathContext context, Object value) { [EOL]     ((JXPathContextReferenceImpl) context).setValue(xpath, expression, value); [EOL] } <line_num>: 73,76
public Pointer createPath(JXPathContext context) { [EOL]     return ((JXPathContextReferenceImpl) context).createPath(xpath, expression); [EOL] } <line_num>: 81,84
public Pointer createPathAndSetValue(JXPathContext context, Object value) { [EOL]     return ((JXPathContextReferenceImpl) context).createPathAndSetValue(xpath, expression, value); [EOL] } <line_num>: 89,92
public Iterator iterate(JXPathContext context) { [EOL]     return ((JXPathContextReferenceImpl) context).iterate(xpath, expression); [EOL] } <line_num>: 97,100
public Pointer getPointer(JXPathContext context, String xpath) { [EOL]     return ((JXPathContextReferenceImpl) context).getPointer(xpath, expression); [EOL] } <line_num>: 105,108
public Iterator iteratePointers(JXPathContext context) { [EOL]     return ((JXPathContextReferenceImpl) context).iteratePointers(xpath, expression); [EOL] } <line_num>: 113,116
public void removePath(JXPathContext context) { [EOL]     ((JXPathContextReferenceImpl) context).removePath(xpath, expression); [EOL] } <line_num>: 121,123
public void removeAll(JXPathContext context) { [EOL]     ((JXPathContextReferenceImpl) context).removeAll(xpath, expression); [EOL] } <line_num>: 128,130
