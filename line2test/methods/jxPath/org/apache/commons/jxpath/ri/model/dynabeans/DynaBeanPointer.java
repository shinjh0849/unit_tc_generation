public DynaBeanPointer(QName name, DynaBean dynaBean, Locale locale) { [EOL]     super(null, locale); [EOL]     this.name = name; [EOL]     this.dynaBean = dynaBean; [EOL] } <line_num>: 38,42
public DynaBeanPointer(NodePointer parent, QName name, DynaBean dynaBean) { [EOL]     super(parent); [EOL]     this.name = name; [EOL]     this.dynaBean = dynaBean; [EOL] } <line_num>: 47,51
public PropertyPointer getPropertyPointer() { [EOL]     return new DynaBeanPropertyPointer(this, dynaBean); [EOL] } <line_num>: 53,55
public QName getName() { [EOL]     return name; [EOL] } <line_num>: 57,59
public Object getBaseValue() { [EOL]     return dynaBean; [EOL] } <line_num>: 64,66
public Object getImmediateNode() { [EOL]     return dynaBean; [EOL] } <line_num>: 68,70
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 72,74
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 79,81
public boolean isLeaf() { [EOL]     return false; [EOL] } <line_num>: 83,85
public int hashCode() { [EOL]     return name == null ? 0 : name.hashCode(); [EOL] } <line_num>: 87,89
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof DynaBeanPointer)) { [EOL]         return false; [EOL]     } [EOL]     DynaBeanPointer other = (DynaBeanPointer) object; [EOL]     if (parent != other.parent) { [EOL]         if (parent == null || !parent.equals(other.parent)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     if ((name == null && other.name != null) || (name != null && !name.equals(other.name))) { [EOL]         return false; [EOL]     } [EOL]     int iThis = (index == WHOLE_COLLECTION ? 0 : index); [EOL]     int iOther = (other.index == WHOLE_COLLECTION ? 0 : other.index); [EOL]     if (iThis != iOther) { [EOL]         return false; [EOL]     } [EOL]     return dynaBean == other.dynaBean; [EOL] } <line_num>: 91,119
public String asPath() { [EOL]     if (parent != null) { [EOL]         return super.asPath(); [EOL]     } [EOL]     return "/"; [EOL] } <line_num>: 124,129
