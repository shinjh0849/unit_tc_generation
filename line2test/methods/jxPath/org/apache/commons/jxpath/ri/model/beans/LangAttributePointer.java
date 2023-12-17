public LangAttributePointer(NodePointer parent) { [EOL]     super(parent); [EOL] } <line_num>: 31,33
public QName getName() { [EOL]     return new QName("xml", "lang"); [EOL] } <line_num>: 35,37
public String getNamespaceURI() { [EOL]     return null; [EOL] } <line_num>: 39,41
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 43,45
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 47,49
public Object getBaseValue() { [EOL]     return parent.getLocale().toString().replace('_', '-'); [EOL] } <line_num>: 51,53
public Object getImmediateNode() { [EOL]     return getBaseValue(); [EOL] } <line_num>: 55,57
public boolean isLeaf() { [EOL]     return true; [EOL] } <line_num>: 59,61
public void setValue(Object value) { [EOL]     throw new UnsupportedOperationException("Cannot change locale using the 'lang' attribute"); [EOL] } <line_num>: 66,69
public String asPath() { [EOL]     StringBuffer buffer = new StringBuffer(); [EOL]     if (parent != null) { [EOL]         buffer.append(parent.asPath()); [EOL]         if (buffer.length() == 0 || buffer.charAt(buffer.length() - 1) != '/') { [EOL]             buffer.append('/'); [EOL]         } [EOL]     } [EOL]     buffer.append("@xml:lang"); [EOL]     return buffer.toString(); [EOL] } <line_num>: 73,84
public int hashCode() { [EOL]     return 0; [EOL] } <line_num>: 86,88
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof LangAttributePointer)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 90,100
public boolean testNode(NodeTest test) { [EOL]     return false; [EOL] } <line_num>: 102,104
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { [EOL]     return 0; [EOL] } <line_num>: 106,112
