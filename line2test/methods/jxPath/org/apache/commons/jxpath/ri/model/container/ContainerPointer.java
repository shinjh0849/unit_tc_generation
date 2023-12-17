public ContainerPointer(Container container, Locale locale) { [EOL]     super(null, locale); [EOL]     this.container = container; [EOL] } <line_num>: 40,43
public ContainerPointer(NodePointer parent, Container container) { [EOL]     super(parent); [EOL]     this.container = container; [EOL] } <line_num>: 45,48
public boolean isContainer() { [EOL]     return true; [EOL] } <line_num>: 53,55
public QName getName() { [EOL]     return null; [EOL] } <line_num>: 57,59
public Object getBaseValue() { [EOL]     return container; [EOL] } <line_num>: 61,63
public boolean isCollection() { [EOL]     Object value = getBaseValue(); [EOL]     return value != null && ValueUtils.isCollection(value); [EOL] } <line_num>: 65,68
public int getLength() { [EOL]     Object value = getBaseValue(); [EOL]     if (value == null) { [EOL]         return 1; [EOL]     } [EOL]     return ValueUtils.getLength(value); [EOL] } <line_num>: 70,76
public boolean isLeaf() { [EOL]     return getValuePointer().isLeaf(); [EOL] } <line_num>: 78,80
public Object getImmediateNode() { [EOL]     Object value = getBaseValue(); [EOL]     if (index != WHOLE_COLLECTION) { [EOL]         if (index >= 0 && index < getLength()) { [EOL]             return ValueUtils.getValue(value, index); [EOL]         } else { [EOL]             return null; [EOL]         } [EOL]     } else { [EOL]         return ValueUtils.getValue(value); [EOL]     } [EOL] } <line_num>: 82,95
public void setValue(Object value) { [EOL]     container.setValue(value); [EOL] } <line_num>: 97,100
public NodePointer getImmediateValuePointer() { [EOL]     if (valuePointer == null) { [EOL]         Object value = getImmediateNode(); [EOL]         valuePointer = NodePointer.newChildNodePointer(this, getName(), value); [EOL]     } [EOL]     return valuePointer; [EOL] } <line_num>: 102,109
public int hashCode() { [EOL]     return System.identityHashCode(container) + index; [EOL] } <line_num>: 111,113
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof ContainerPointer)) { [EOL]         return false; [EOL]     } [EOL]     ContainerPointer other = (ContainerPointer) object; [EOL]     return container == other.container && index == other.index; [EOL] } <line_num>: 115,126
public NodeIterator childIterator(NodeTest test, boolean reverse, NodePointer startWith) { [EOL]     return getValuePointer().childIterator(test, reverse, startWith); [EOL] } <line_num>: 128,134
public NodeIterator attributeIterator(QName name) { [EOL]     return getValuePointer().attributeIterator(name); [EOL] } <line_num>: 136,138
public NodeIterator namespaceIterator() { [EOL]     return getValuePointer().namespaceIterator(); [EOL] } <line_num>: 140,142
public NodePointer namespacePointer(String namespace) { [EOL]     return getValuePointer().namespacePointer(namespace); [EOL] } <line_num>: 144,146
public boolean testNode(NodeTest nodeTest) { [EOL]     return getValuePointer().testNode(nodeTest); [EOL] } <line_num>: 148,150
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { [EOL]     return pointer1.getIndex() - pointer2.getIndex(); [EOL] } <line_num>: 152,157
public String getNamespaceURI(String prefix) { [EOL]     return getValuePointer().getNamespaceURI(prefix); [EOL] } <line_num>: 159,161
public String asPath() { [EOL]     if (parent != null) { [EOL]         return parent.asPath(); [EOL]     } [EOL]     return "/"; [EOL] } <line_num>: 163,168
