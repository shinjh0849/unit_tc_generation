public SerializerFactoryConfig()
protected SerializerFactoryConfig(Serializers[] allAdditionalSerializers, Serializers[] allAdditionalKeySerializers, BeanSerializerModifier[] modifiers)
public SerializerFactoryConfig withAdditionalSerializers(Serializers additional)
public SerializerFactoryConfig withAdditionalKeySerializers(Serializers additional)
public SerializerFactoryConfig withSerializerModifier(BeanSerializerModifier modifier)
public boolean hasSerializers()
public boolean hasKeySerializers()
public boolean hasSerializerModifiers()
public Iterable<Serializers> serializers()
public Iterable<Serializers> keySerializers()
public Iterable<BeanSerializerModifier> serializerModifiers()
long serialVersionUID=Optional[1L]
Serializers[] NO_SERIALIZERS=Optional[new Serializers[0]]
BeanSerializerModifier[] NO_MODIFIERS=Optional[new BeanSerializerModifier[0]]
Serializers[] _additionalSerializers
Serializers[] _additionalKeySerializers
BeanSerializerModifier[] _modifiers
