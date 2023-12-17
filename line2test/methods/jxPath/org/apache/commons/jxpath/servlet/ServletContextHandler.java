public String[] getPropertyNames(Object context) { [EOL]     HashSet list = new HashSet(16); [EOL]     collectPropertyNames(list, context); [EOL]     return (String[]) list.toArray(STRING_ARRAY); [EOL] } <line_num>: 37,41
protected void collectPropertyNames(HashSet set, Object bean) { [EOL]     Enumeration e = ((ServletContext) bean).getAttributeNames(); [EOL]     while (e.hasMoreElements()) { [EOL]         set.add(e.nextElement()); [EOL]     } [EOL] } <line_num>: 43,48
public Object getProperty(Object context, String property) { [EOL]     return ((ServletContext) context).getAttribute(property); [EOL] } <line_num>: 50,52
public void setProperty(Object context, String property, Object value) { [EOL]     ((ServletContext) context).setAttribute(property, value); [EOL] } <line_num>: 54,56
