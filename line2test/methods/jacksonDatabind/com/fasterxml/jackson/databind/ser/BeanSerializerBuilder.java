public BeanSerializerBuilder(BeanDescription beanDesc) { [EOL]     _beanDesc = beanDesc; [EOL] } <line_num>: 76,78
protected BeanSerializerBuilder(BeanSerializerBuilder src) { [EOL]     _beanDesc = src._beanDesc; [EOL]     _properties = src._properties; [EOL]     _filteredProperties = src._filteredProperties; [EOL]     _anyGetter = src._anyGetter; [EOL]     _filterId = src._filterId; [EOL] } <line_num>: 83,89
protected void setConfig(SerializationConfig config) { [EOL]     _config = config; [EOL] } <line_num>: 100,102
public void setProperties(List<BeanPropertyWriter> properties) { [EOL]     _properties = properties; [EOL] } <line_num>: 104,106
public void setFilteredProperties(BeanPropertyWriter[] properties) { [EOL]     _filteredProperties = properties; [EOL] } <line_num>: 108,110
public void setAnyGetter(AnyGetterWriter anyGetter) { [EOL]     _anyGetter = anyGetter; [EOL] } <line_num>: 112,114
public void setFilterId(Object filterId) { [EOL]     _filterId = filterId; [EOL] } <line_num>: 116,118
public void setTypeId(AnnotatedMember idProp) { [EOL]     if (_typeId != null) { [EOL]         throw new IllegalArgumentException("Multiple type ids specified with " + _typeId + " and " + idProp); [EOL]     } [EOL]     _typeId = idProp; [EOL] } <line_num>: 120,126
public void setObjectIdWriter(ObjectIdWriter w) { [EOL]     _objectIdWriter = w; [EOL] } <line_num>: 128,130
public AnnotatedClass getClassInfo() { [EOL]     return _beanDesc.getClassInfo(); [EOL] } <line_num>: 140,140
public BeanDescription getBeanDescription() { [EOL]     return _beanDesc; [EOL] } <line_num>: 142,142
public List<BeanPropertyWriter> getProperties() { [EOL]     return _properties; [EOL] } <line_num>: 144,144
public boolean hasProperties() { [EOL]     return (_properties != null) && (_properties.size() > 0); [EOL] } <line_num>: 145,147
public BeanPropertyWriter[] getFilteredProperties() { [EOL]     return _filteredProperties; [EOL] } <line_num>: 149,149
public AnyGetterWriter getAnyGetter() { [EOL]     return _anyGetter; [EOL] } <line_num>: 151,151
public Object getFilterId() { [EOL]     return _filterId; [EOL] } <line_num>: 153,153
public AnnotatedMember getTypeId() { [EOL]     return _typeId; [EOL] } <line_num>: 155,155
public ObjectIdWriter getObjectIdWriter() { [EOL]     return _objectIdWriter; [EOL] } <line_num>: 157,157
public JsonSerializer<?> build() { [EOL]     BeanPropertyWriter[] properties; [EOL]     if (_properties == null || _properties.isEmpty()) { [EOL]         if (_anyGetter == null) { [EOL]             return null; [EOL]         } [EOL]         properties = NO_PROPERTIES; [EOL]     } else { [EOL]         properties = _properties.toArray(new BeanPropertyWriter[_properties.size()]); [EOL]     } [EOL]     return new BeanSerializer(_beanDesc.getType(), this, properties, _filteredProperties); [EOL] } <line_num>: 170,185
public BeanSerializer createDummy() { [EOL]     return BeanSerializer.createDummy(_beanDesc.getType()); [EOL] } <line_num>: 192,194
