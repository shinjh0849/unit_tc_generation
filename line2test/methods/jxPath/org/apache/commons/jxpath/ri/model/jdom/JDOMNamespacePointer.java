public JDOMNamespacePointer(NodePointer parent, String prefix) { [EOL]     super(parent); [EOL]     this.prefix = prefix; [EOL] } <line_num>: 32,35
public JDOMNamespacePointer(NodePointer parent, String prefix, String namespaceURI) { [EOL]     super(parent); [EOL]     this.prefix = prefix; [EOL]     this.namespaceURI = namespaceURI; [EOL] } <line_num>: 37,45
public QName getName() { [EOL]     return new QName(prefix); [EOL] } <line_num>: 47,49
public Object getBaseValue() { [EOL]     return null; [EOL] } <line_num>: 51,53
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 55,57
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 59,61
public Object getImmediateNode() { [EOL]     return getNamespaceURI(); [EOL] } <line_num>: 63,65
public String getNamespaceURI() { [EOL]     if (namespaceURI == null) { [EOL]         namespaceURI = parent.getNamespaceURI(prefix); [EOL]     } [EOL]     return namespaceURI; [EOL] } <line_num>: 67,72
public boolean isLeaf() { [EOL]     return true; [EOL] } <line_num>: 74,76
public void setValue(Object value) { [EOL]     throw new UnsupportedOperationException("Cannot modify a namespace"); [EOL] } <line_num>: 81,83
public String asPath() { [EOL]     StringBuffer buffer = new StringBuffer(); [EOL]     if (parent != null) { [EOL]         buffer.append(parent.asPath()); [EOL]         if (buffer.length() == 0 || buffer.charAt(buffer.length() - 1) != '/') { [EOL]             buffer.append('/'); [EOL]         } [EOL]     } [EOL]     buffer.append("namespace::"); [EOL]     buffer.append(prefix); [EOL]     return buffer.toString(); [EOL] } <line_num>: 85,97
public int hashCode() { [EOL]     return prefix.hashCode(); [EOL] } <line_num>: 99,101
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof JDOMNamespacePointer)) { [EOL]         return false; [EOL]     } [EOL]     JDOMNamespacePointer other = (JDOMNamespacePointer) object; [EOL]     return prefix.equals(other.prefix); [EOL] } <line_num>: 103,114
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { [EOL]     return 0; [EOL] } <line_num>: 116,122
