public JDOMAttributePointer(NodePointer parent, Attribute attr) { [EOL]     super(parent); [EOL]     this.attr = attr; [EOL] } <line_num>: 33,36
public QName getName() { [EOL]     return new QName(JDOMNodePointer.getPrefix(attr), JDOMNodePointer.getLocalName(attr)); [EOL] } <line_num>: 38,42
public String getNamespaceURI() { [EOL]     String uri = attr.getNamespaceURI(); [EOL]     if (uri != null && uri.equals("")) { [EOL]         uri = null; [EOL]     } [EOL]     return uri; [EOL] } <line_num>: 44,50
public Object getValue() { [EOL]     return attr.getValue(); [EOL] } <line_num>: 52,54
public Object getBaseValue() { [EOL]     return attr; [EOL] } <line_num>: 56,58
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 60,62
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 64,66
public Object getImmediateNode() { [EOL]     return attr; [EOL] } <line_num>: 68,70
public boolean isActual() { [EOL]     return true; [EOL] } <line_num>: 72,74
public boolean isLeaf() { [EOL]     return true; [EOL] } <line_num>: 76,78
public void setValue(Object value) { [EOL]     attr.setValue((String) TypeUtils.convert(value, String.class)); [EOL] } <line_num>: 83,85
public void remove() { [EOL]     attr.getParent().removeAttribute(attr); [EOL] } <line_num>: 87,89
public String asPath() { [EOL]     StringBuffer buffer = new StringBuffer(); [EOL]     if (parent != null) { [EOL]         buffer.append(parent.asPath()); [EOL]         if (buffer.length() == 0 || buffer.charAt(buffer.length() - 1) != '/') { [EOL]             buffer.append('/'); [EOL]         } [EOL]     } [EOL]     buffer.append('@'); [EOL]     buffer.append(getName()); [EOL]     return buffer.toString(); [EOL] } <line_num>: 93,105
public int hashCode() { [EOL]     return System.identityHashCode(attr); [EOL] } <line_num>: 107,109
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof JDOMAttributePointer)) { [EOL]         return false; [EOL]     } [EOL]     JDOMAttributePointer other = (JDOMAttributePointer) object; [EOL]     return attr == other.attr; [EOL] } <line_num>: 111,122
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { [EOL]     return 0; [EOL] } <line_num>: 124,130
