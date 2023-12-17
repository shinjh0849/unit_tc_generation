public DOMAttributePointer(NodePointer parent, Attr attr) { [EOL]     super(parent); [EOL]     this.attr = attr; [EOL] } <line_num>: 36,39
public QName getName() { [EOL]     return new QName(DOMNodePointer.getPrefix(attr), DOMNodePointer.getLocalName(attr)); [EOL] } <line_num>: 41,45
public String getNamespaceURI() { [EOL]     String prefix = DOMNodePointer.getPrefix(attr); [EOL]     if (prefix == null) { [EOL]         return null; [EOL]     } [EOL]     return parent.getNamespaceURI(prefix); [EOL] } <line_num>: 47,53
public Object getValue() { [EOL]     String value = attr.getValue(); [EOL]     if (value == null) { [EOL]         return null; [EOL]     } [EOL]     if (value.equals("") && !attr.getSpecified()) { [EOL]         return null; [EOL]     } [EOL]     return value; [EOL] } <line_num>: 55,64
public Object getBaseValue() { [EOL]     return attr; [EOL] } <line_num>: 66,68
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 70,72
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 74,76
public Object getImmediateNode() { [EOL]     return attr; [EOL] } <line_num>: 78,80
public boolean isActual() { [EOL]     return true; [EOL] } <line_num>: 82,84
public boolean isLeaf() { [EOL]     return true; [EOL] } <line_num>: 86,88
public boolean testNode(NodeTest nodeTest) { [EOL]     return nodeTest == null || ((nodeTest instanceof NodeTypeTest) && ((NodeTypeTest) nodeTest).getNodeType() == Compiler.NODE_TYPE_NODE); [EOL] } <line_num>: 90,95
public void setValue(Object value) { [EOL]     attr.setValue((String) TypeUtils.convert(value, String.class)); [EOL] } <line_num>: 100,102
public void remove() { [EOL]     attr.getOwnerElement().removeAttributeNode(attr); [EOL] } <line_num>: 104,106
public String asPath() { [EOL]     StringBuffer buffer = new StringBuffer(); [EOL]     if (parent != null) { [EOL]         buffer.append(parent.asPath()); [EOL]         if (buffer.length() == 0 || buffer.charAt(buffer.length() - 1) != '/') { [EOL]             buffer.append('/'); [EOL]         } [EOL]     } [EOL]     buffer.append('@'); [EOL]     buffer.append(getName()); [EOL]     return buffer.toString(); [EOL] } <line_num>: 110,122
public int hashCode() { [EOL]     return System.identityHashCode(attr); [EOL] } <line_num>: 124,126
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof DOMAttributePointer)) { [EOL]         return false; [EOL]     } [EOL]     DOMAttributePointer other = (DOMAttributePointer) object; [EOL]     return attr == other.attr; [EOL] } <line_num>: 128,139
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { [EOL]     return 0; [EOL] } <line_num>: 141,147
