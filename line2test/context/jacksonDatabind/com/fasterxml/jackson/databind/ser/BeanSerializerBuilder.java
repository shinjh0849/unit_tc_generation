public BeanSerializerBuilder(BeanDescription beanDesc)
protected BeanSerializerBuilder(BeanSerializerBuilder src)
protected void setConfig(SerializationConfig config)
public void setProperties(List<BeanPropertyWriter> properties)
public void setFilteredProperties(BeanPropertyWriter[] properties)
public void setAnyGetter(AnyGetterWriter anyGetter)
public void setFilterId(Object filterId)
public void setTypeId(AnnotatedMember idProp)
public void setObjectIdWriter(ObjectIdWriter w)
public AnnotatedClass getClassInfo()
public BeanDescription getBeanDescription()
public List<BeanPropertyWriter> getProperties()
public boolean hasProperties()
public BeanPropertyWriter[] getFilteredProperties()
public AnyGetterWriter getAnyGetter()
public Object getFilterId()
public AnnotatedMember getTypeId()
public ObjectIdWriter getObjectIdWriter()
public JsonSerializer<?> build()
public BeanSerializer createDummy()
BeanPropertyWriter[] NO_PROPERTIES=Optional[new BeanPropertyWriter[0]]
BeanDescription _beanDesc
SerializationConfig _config
List<BeanPropertyWriter> _properties
BeanPropertyWriter[] _filteredProperties
AnyGetterWriter _anyGetter
Object _filterId
AnnotatedMember _typeId
ObjectIdWriter _objectIdWriter
