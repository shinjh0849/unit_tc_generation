public FieldNamingStrategy2Adapter(FieldNamingStrategy adaptee) { [EOL]     Preconditions.checkNotNull(adaptee); [EOL]     this.adaptee = adaptee; [EOL] } <line_num>: 29,32
@SuppressWarnings("deprecation") [EOL] public String translateName(FieldAttributes f) { [EOL]     return adaptee.translateName(f.getFieldObject()); [EOL] } <line_num>: 34,37
