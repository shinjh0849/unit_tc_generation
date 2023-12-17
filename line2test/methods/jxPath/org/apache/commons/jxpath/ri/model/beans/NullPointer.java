public NullPointer(QName name, Locale locale) { [EOL]     super(null, locale); [EOL]     this.name = name; [EOL] } <line_num>: 33,36
public NullPointer(NodePointer parent, QName name) { [EOL]     super(parent); [EOL]     this.name = name; [EOL] } <line_num>: 41,44
public NullPointer(Locale locale, String id) { [EOL]     super(null, locale); [EOL]     this.id = id; [EOL] } <line_num>: 46,49
public QName getName() { [EOL]     return name; [EOL] } <line_num>: 51,53
public Object getBaseValue() { [EOL]     return null; [EOL] } <line_num>: 55,57
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 59,61
public boolean isLeaf() { [EOL]     return true; [EOL] } <line_num>: 63,65
public boolean isActual() { [EOL]     return false; [EOL] } <line_num>: 67,69
public PropertyPointer getPropertyPointer() { [EOL]     return new NullPropertyPointer(this); [EOL] } <line_num>: 71,73
public NodePointer createPath(JXPathContext context, Object value) { [EOL]     if (parent != null) { [EOL]         return parent.createPath(context, value).getValuePointer(); [EOL]     } else { [EOL]         throw new UnsupportedOperationException("Cannot create the root object: " + asPath()); [EOL]     } [EOL] } <line_num>: 75,83
public NodePointer createPath(JXPathContext context) { [EOL]     if (parent != null) { [EOL]         return parent.createPath(context).getValuePointer(); [EOL]     } else { [EOL]         throw new UnsupportedOperationException("Cannot create the root object: " + asPath()); [EOL]     } [EOL] } <line_num>: 85,93
public NodePointer createChild(JXPathContext context, QName name, int index) { [EOL]     return createPath(context).createChild(context, name, index); [EOL] } <line_num>: 95,101
public NodePointer createChild(JXPathContext context, QName name, int index, Object value) { [EOL]     return createPath(context).createChild(context, name, index, value); [EOL] } <line_num>: 103,110
public int hashCode() { [EOL]     return name == null ? 0 : name.hashCode(); [EOL] } <line_num>: 112,114
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof NullPointer)) { [EOL]         return false; [EOL]     } [EOL]     NullPointer other = (NullPointer) object; [EOL]     return (name == null && other.name == null) || (name != null && name.equals(other.name)); [EOL] } <line_num>: 116,128
public String asPath() { [EOL]     if (id != null) { [EOL]         return "id(" + id + ")"; [EOL]     } [EOL]     if (parent != null) { [EOL]         return super.asPath(); [EOL]     } [EOL]     return "null()"; [EOL] } <line_num>: 130,139
public int getLength() { [EOL]     return 0; [EOL] } <line_num>: 141,143
