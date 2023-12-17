public DynamicPointer(QName name, Object bean, DynamicPropertyHandler handler, Locale locale) { [EOL]     super(null, locale); [EOL]     this.name = name; [EOL]     this.bean = bean; [EOL]     this.handler = handler; [EOL] } <line_num>: 44,51
public DynamicPointer(NodePointer parent, QName name, Object bean, DynamicPropertyHandler handler) { [EOL]     super(parent); [EOL]     this.name = name; [EOL]     this.bean = bean; [EOL]     this.handler = handler; [EOL] } <line_num>: 53,60
public PropertyPointer getPropertyPointer() { [EOL]     return new DynamicPropertyPointer(this, handler); [EOL] } <line_num>: 62,64
public NodeIterator createNodeIterator(String property, boolean reverse, NodePointer startWith) { [EOL]     return new PropertyIterator(this, property, reverse, startWith); [EOL] } <line_num>: 66,70
public NodeIterator attributeIterator(QName name) { [EOL]     return new DynamicAttributeIterator(this, name); [EOL] } <line_num>: 72,74
public QName getName() { [EOL]     return name; [EOL] } <line_num>: 76,78
public boolean isDynamicPropertyDeclarationSupported() { [EOL]     return true; [EOL] } <line_num>: 80,82
public Object getBaseValue() { [EOL]     return bean; [EOL] } <line_num>: 87,89
public boolean isLeaf() { [EOL]     Object value = getNode(); [EOL]     return value == null || JXPathIntrospector.getBeanInfo(value.getClass()).isAtomic(); [EOL] } <line_num>: 91,95
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 97,99
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 104,106
public String asPath() { [EOL]     if (parent != null) { [EOL]         return super.asPath(); [EOL]     } [EOL]     return "/"; [EOL] } <line_num>: 108,113
public int hashCode() { [EOL]     return System.identityHashCode(bean) + name.hashCode(); [EOL] } <line_num>: 115,117
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof DynamicPointer)) { [EOL]         return false; [EOL]     } [EOL]     DynamicPointer other = (DynamicPointer) object; [EOL]     return bean == other.bean && name.equals(other.name); [EOL] } <line_num>: 119,130
