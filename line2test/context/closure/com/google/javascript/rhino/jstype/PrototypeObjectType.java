 PrototypeObjectType(JSTypeRegistry registry, String className, ObjectType implicitPrototype)
 PrototypeObjectType(JSTypeRegistry registry, String className, ObjectType implicitPrototype, boolean nativeType, ImmutableList<String> templateKeys, ImmutableList<JSType> templatizedTypes)
 PropertyMap getPropertyMap()
 boolean defineProperty(String name, JSType type, boolean inferred, Node propertyNode)
public boolean removeProperty(String name)
public void setPropertyJSDocInfo(String propertyName, JSDocInfo info)
public boolean matchesNumberContext()
public boolean matchesStringContext()
private boolean hasOverridenNativeProperty(String propertyName)
public JSType unboxesTo()
public boolean matchesObjectContext()
public boolean canBeCalled()
 String toStringHelper(boolean forAnnotations)
 void setPrettyPrint(boolean prettyPrint)
 boolean isPrettyPrint()
public FunctionType getConstructor()
public ObjectType getImplicitPrototype()
 final void setImplicitPrototype(ObjectType implicitPrototype)
public String getReferenceName()
public boolean hasReferenceName()
public boolean isSubtype(JSType that)
private boolean implicitPrototypeChainIsUnknown()
public boolean hasCachedValues()
public boolean isNativeObjectType()
 void setOwnerFunction(FunctionType type)
public FunctionType getOwnerFunction()
public Iterable<ObjectType> getCtorImplementedInterfaces()
public Iterable<ObjectType> getCtorExtendedInterfaces()
 JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope)
public void matchConstraint(JSType constraint)
public void matchRecordTypeConstraint(ObjectType constraintObj)
long serialVersionUID=Optional[1L]
String className
PropertyMap properties
boolean nativeType
ObjectType implicitPrototypeFallback
FunctionType ownerFunction=Optional[null]
boolean prettyPrint=Optional[false]
int MAX_PRETTY_PRINTED_PROPERTIES=Optional[4]
