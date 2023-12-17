protected AbstractProperty() { [EOL] } <line_num>: 119,119
protected AbstractProperty(String name) { [EOL]     m_name = name; [EOL] } <line_num>: 121,123
protected NestedPropertySheetImpl(String name, PropertySheet propertySheet) { [EOL]     super(name); [EOL]     m_propertySheet = propertySheet; [EOL] } <line_num>: 150,155
NestedPropertySheetImpl() { [EOL] } <line_num>: 157,157
public StringPropertyImpl(String name, String value) { [EOL]     super(name); [EOL]     m_value = value; [EOL] } <line_num>: 203,206
StringPropertyImpl() { [EOL] } <line_num>: 208,208
public void testDeserialize() throws IOException { [EOL]     PropertySheet input = MAPPER.readValue(JSON, PropertySheet.class); [EOL]     assertEquals(JSON, MAPPER.writeValueAsString(input)); [EOL] } <line_num>: 26,30
public void testSerialize() throws IOException { [EOL]     PropertySheet sheet = new PropertySheetImpl(); [EOL]     sheet.addProperty(new StringPropertyImpl("p1name", "p1value")); [EOL]     sheet.addProperty(new StringPropertyImpl("p2name", "p2value")); [EOL]     String actual = MAPPER.writeValueAsString(sheet); [EOL]     assertEquals(JSON, actual); [EOL] } <line_num>: 32,40
@JsonIgnore [EOL] String getEntityType(); <line_num>: 45,45
Long getId(); <line_num>: 46,46
void setId(Long id); <line_num>: 47,47
@JsonIgnore [EOL] void setPersistable(); <line_num>: 48,48
@Override [EOL] PropertySheet getValue(); <line_num>: 55,55
void setValue(PropertySheet propertySheet); <line_num>: 56,56
String getName(); <line_num>: 65,65
PropertySheet getParentSheet(); <line_num>: 66,66
T getValue(); <line_num>: 67,67
void setName(String name); <line_num>: 68,68
void setParentSheet(PropertySheet parentSheet); <line_num>: 69,69
void addProperty(Property property); <line_num>: 79,79
Map<String, Property> getProperties(); <line_num>: 80,80
void setProperties(Map<String, Property> properties); <line_num>: 81,81
@Override [EOL] String getValue(); <line_num>: 88,88
void setValue(String value); <line_num>: 89,89
@Override [EOL] public String getEntityType() { [EOL]     return ""; [EOL] } <line_num>: 96,98
@Override [EOL] public Long getId() { [EOL]     return id; [EOL] } <line_num>: 100,102
@Override [EOL] public void setId(Long id) { [EOL]     this.id = id; [EOL] } <line_num>: 104,107
@Override [EOL] public void setPersistable() { [EOL] } <line_num>: 109,109
@Override [EOL] public String getName() { [EOL]     return m_name; [EOL] } <line_num>: 125,127
@JsonBackReference("propertySheet-properties") [EOL] @Override [EOL] public PropertySheet getParentSheet() { [EOL]     return m_parentSheet; [EOL] } <line_num>: 129,132
@Override [EOL] public void setName(String name) { [EOL]     m_name = name; [EOL] } <line_num>: 134,136
@Override [EOL] public void setParentSheet(PropertySheet parentSheet) { [EOL]     m_parentSheet = parentSheet; [EOL] } <line_num>: 138,140
@Override [EOL] public PropertySheet getValue() { [EOL]     return m_propertySheet; [EOL] } <line_num>: 159,161
@Override [EOL] public void setValue(PropertySheet propertySheet) { [EOL]     m_propertySheet = propertySheet; [EOL] } <line_num>: 163,165
@Override [EOL] public void addProperty(Property property) { [EOL]     if (m_properties == null) { [EOL]         m_properties = new TreeMap<String, Property>(); [EOL]     } [EOL]     property.setParentSheet(this); [EOL]     m_properties.put(property.getName(), property); [EOL] } <line_num>: 175,182
@JsonDeserialize(as = TreeMap.class, keyAs = String.class, contentAs = Property.class) [EOL] @JsonManagedReference("propertySheet-properties") [EOL] @Override [EOL] public Map<String, Property> getProperties() { [EOL]     return m_properties; [EOL] } <line_num>: 184,190
@Override [EOL] public void setProperties(Map<String, Property> properties) { [EOL]     m_properties = properties; [EOL] } <line_num>: 192,194
@Override [EOL] public String getValue() { [EOL]     return m_value; [EOL] } <line_num>: 210,212
@Override [EOL] public void setValue(String value) { [EOL]     m_value = value; [EOL] } <line_num>: 214,216
