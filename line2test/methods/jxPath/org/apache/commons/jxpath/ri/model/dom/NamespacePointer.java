public NamespacePointer(NodePointer parent, String prefix) { [EOL]     super(parent); [EOL]     this.prefix = prefix; [EOL] } <line_num>: 35,38
public NamespacePointer(NodePointer parent, String prefix, String namespaceURI) { [EOL]     super(parent); [EOL]     this.prefix = prefix; [EOL]     this.namespaceURI = namespaceURI; [EOL] } <line_num>: 40,48
public QName getName() { [EOL]     return new QName(prefix); [EOL] } <line_num>: 50,52
public Object getBaseValue() { [EOL]     return null; [EOL] } <line_num>: 54,56
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 58,60
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 62,64
public Object getImmediateNode() { [EOL]     return getNamespaceURI(); [EOL] } <line_num>: 66,68
public String getNamespaceURI() { [EOL]     if (namespaceURI == null) { [EOL]         namespaceURI = parent.getNamespaceURI(prefix); [EOL]     } [EOL]     return namespaceURI; [EOL] } <line_num>: 70,75
public boolean isLeaf() { [EOL]     return true; [EOL] } <line_num>: 77,79
public void setValue(Object value) { [EOL]     throw new UnsupportedOperationException("Cannot modify DOM trees"); [EOL] } <line_num>: 84,86
public boolean testNode(NodeTest nodeTest) { [EOL]     return nodeTest == null || ((nodeTest instanceof NodeTypeTest) && ((NodeTypeTest) nodeTest).getNodeType() == Compiler.NODE_TYPE_NODE); [EOL] } <line_num>: 88,93
public String asPath() { [EOL]     StringBuffer buffer = new StringBuffer(); [EOL]     if (parent != null) { [EOL]         buffer.append(parent.asPath()); [EOL]         if (buffer.length() == 0 || buffer.charAt(buffer.length() - 1) != '/') { [EOL]             buffer.append('/'); [EOL]         } [EOL]     } [EOL]     buffer.append("namespace::"); [EOL]     buffer.append(prefix); [EOL]     return buffer.toString(); [EOL] } <line_num>: 95,107
public int hashCode() { [EOL]     return prefix.hashCode(); [EOL] } <line_num>: 109,111
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof NamespacePointer)) { [EOL]         return false; [EOL]     } [EOL]     NamespacePointer other = (NamespacePointer) object; [EOL]     return prefix.equals(other.prefix); [EOL] } <line_num>: 113,124
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { [EOL]     return 0; [EOL] } <line_num>: 126,132
