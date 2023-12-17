public DeserializerFactoryConfig()
protected DeserializerFactoryConfig(Deserializers[] allAdditionalDeserializers, KeyDeserializers[] allAdditionalKeyDeserializers, BeanDeserializerModifier[] modifiers, AbstractTypeResolver[] atr, ValueInstantiators[] vi)
public DeserializerFactoryConfig withAdditionalDeserializers(Deserializers additional)
public DeserializerFactoryConfig withAdditionalKeyDeserializers(KeyDeserializers additional)
public DeserializerFactoryConfig withDeserializerModifier(BeanDeserializerModifier modifier)
public DeserializerFactoryConfig withAbstractTypeResolver(AbstractTypeResolver resolver)
public DeserializerFactoryConfig withValueInstantiators(ValueInstantiators instantiators)
public boolean hasDeserializers()
public boolean hasKeyDeserializers()
public boolean hasDeserializerModifiers()
public boolean hasAbstractTypeResolvers()
public boolean hasValueInstantiators()
public Iterable<Deserializers> deserializers()
public Iterable<KeyDeserializers> keyDeserializers()
public Iterable<BeanDeserializerModifier> deserializerModifiers()
public Iterable<AbstractTypeResolver> abstractTypeResolvers()
public Iterable<ValueInstantiators> valueInstantiators()
long serialVersionUID=Optional[3683541151102256824L]
Deserializers[] NO_DESERIALIZERS=Optional[new Deserializers[0]]
BeanDeserializerModifier[] NO_MODIFIERS=Optional[new BeanDeserializerModifier[0]]
AbstractTypeResolver[] NO_ABSTRACT_TYPE_RESOLVERS=Optional[new AbstractTypeResolver[0]]
ValueInstantiators[] NO_VALUE_INSTANTIATORS=Optional[new ValueInstantiators[0]]
KeyDeserializers[] DEFAULT_KEY_DESERIALIZERS=Optional[new KeyDeserializers[] { new StdKeyDeserializers() }]
Deserializers[] _additionalDeserializers
KeyDeserializers[] _additionalKeyDeserializers
BeanDeserializerModifier[] _modifiers
AbstractTypeResolver[] _abstractTypeResolvers
ValueInstantiators[] _valueInstantiators
