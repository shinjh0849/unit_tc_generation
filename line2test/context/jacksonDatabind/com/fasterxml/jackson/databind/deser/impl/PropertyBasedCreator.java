protected PropertyBasedCreator(ValueInstantiator valueInstantiator, SettableBeanProperty[] creatorProps, Object[] defaultValues)
public static PropertyBasedCreator construct(DeserializationContext ctxt, ValueInstantiator valueInstantiator, SettableBeanProperty[] srcProps) throws JsonMappingException
public void assignDeserializer(SettableBeanProperty prop, JsonDeserializer<Object> deser)
public Collection<SettableBeanProperty> properties()
public SettableBeanProperty findCreatorProperty(String name)
public PropertyValueBuffer startBuilding(JsonParser jp, DeserializationContext ctxt, ObjectIdReader oir)
public Object build(DeserializationContext ctxt, PropertyValueBuffer buffer) throws IOException
ValueInstantiator _valueInstantiator
HashMap<String, SettableBeanProperty> _properties
int _propertyCount
Object[] _defaultValues
SettableBeanProperty[] _propertiesWithInjectables
