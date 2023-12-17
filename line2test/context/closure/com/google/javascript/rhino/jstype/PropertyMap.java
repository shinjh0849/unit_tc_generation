 PropertyMap()
private PropertyMap(Map<String, Property> underlyingMap)
public PropertyMap apply(ObjectType t)
 static PropertyMap immutableEmptyMap()
 void setParentSource(ObjectType ownerType)
 PropertyMap getPrimaryParent()
 Iterable<PropertyMap> getSecondaryParents()
 Property getSlot(String name)
 Property getOwnProperty(String propertyName)
 int getPropertiesCount()
 boolean hasOwnProperty(String propertyName)
 boolean hasProperty(String propertyName)
 Set<String> getOwnPropertyNames()
 void collectPropertyNames(Set<String> props)
 boolean removeProperty(String name)
 void putProperty(String name, Property newProp)
 Iterable<Property> values()
long serialVersionUID=Optional[1L]
PropertyMap EMPTY_MAP=Optional[new PropertyMap(ImmutableMap.<String, Property>of())]
Function<ObjectType, PropertyMap> PROP_MAP_FROM_TYPE=Optional[new Function<ObjectType, PropertyMap>() {

    @Override
    public PropertyMap apply(ObjectType t) {
        return t.getPropertyMap();
    }
}]
ObjectType parentSource=Optional[null]
Map<String, Property> properties
