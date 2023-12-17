ObjectType(JSTypeRegistry registry) { [EOL]     super(registry); [EOL] } <line_num>: 87,89
ObjectType(JSTypeRegistry registry, ImmutableList<String> templateKeys, ImmutableList<JSType> templatizedTypes) { [EOL]     super(registry, templateKeys, templatizedTypes); [EOL] } <line_num>: 91,94
@Override [EOL] public Node getRootNode() { [EOL]     return null; [EOL] } <line_num>: 96,97
@Override [EOL] public ObjectType getParentScope() { [EOL]     return getImplicitPrototype(); [EOL] } <line_num>: 99,102
PropertyMap getPropertyMap() { [EOL]     return PropertyMap.immutableEmptyMap(); [EOL] } <line_num>: 107,109
@Override [EOL] public Property getSlot(String name) { [EOL]     return getPropertyMap().getSlot(name); [EOL] } <line_num>: 115,118
@Override [EOL] public Property getOwnSlot(String name) { [EOL]     return getPropertyMap().getOwnProperty(name); [EOL] } <line_num>: 120,123
@Override [EOL] public JSType getTypeOfThis() { [EOL]     return null; [EOL] } <line_num>: 125,128
public JSType getParameterType() { [EOL]     return null; [EOL] } <line_num>: 134,136
public JSType getIndexType() { [EOL]     return null; [EOL] } <line_num>: 142,144
@Override [EOL] public JSDocInfo getJSDocInfo() { [EOL]     return docInfo; [EOL] } <line_num>: 149,152
public void setJSDocInfo(JSDocInfo info) { [EOL]     docInfo = info; [EOL] } <line_num>: 158,160
final boolean detectImplicitPrototypeCycle() { [EOL]     this.visited = true; [EOL]     ObjectType p = getImplicitPrototype(); [EOL]     while (p != null) { [EOL]         if (p.visited) { [EOL]             return true; [EOL]         } else { [EOL]             p.visited = true; [EOL]         } [EOL]         p = p.getImplicitPrototype(); [EOL]     } [EOL]     p = this; [EOL]     do { [EOL]         p.visited = false; [EOL]         p = p.getImplicitPrototype(); [EOL]     } while (p != null); [EOL]     return false; [EOL] } <line_num>: 170,190
final boolean detectInheritanceCycle() { [EOL]     return detectImplicitPrototypeCycle() || Iterables.contains(this.getCtorImplementedInterfaces(), this) || Iterables.contains(this.getCtorExtendedInterfaces(), this); [EOL] } <line_num>: 198,206
public abstract String getReferenceName(); <line_num>: 215,215
public String getNormalizedReferenceName() { [EOL]     String name = getReferenceName(); [EOL]     if (name != null) { [EOL]         int pos = name.indexOf("("); [EOL]         if (pos != -1) { [EOL]             return name.substring(0, pos); [EOL]         } [EOL]     } [EOL]     return name; [EOL] } <line_num>: 226,235
@Override [EOL] public String getDisplayName() { [EOL]     return getNormalizedReferenceName(); [EOL] } <line_num>: 237,240
public static String createDelegateSuffix(String suffix) { [EOL]     return "(" + suffix + ")"; [EOL] } <line_num>: 246,248
public boolean hasReferenceName() { [EOL]     return false; [EOL] } <line_num>: 254,256
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     TernaryValue result = super.testForEquality(that); [EOL]     if (result != null) { [EOL]         return result; [EOL]     } [EOL]     if (that.isSubtype(getNativeType(JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN))) { [EOL]         return UNKNOWN; [EOL]     } else { [EOL]         return FALSE; [EOL]     } [EOL] } <line_num>: 258,272
public abstract FunctionType getConstructor(); <line_num>: 279,279
public abstract ObjectType getImplicitPrototype(); <line_num>: 284,284
public final boolean defineDeclaredProperty(String propertyName, JSType type, Node propertyNode) { [EOL]     boolean result = defineProperty(propertyName, type, false, propertyNode); [EOL]     registry.registerPropertyOnType(propertyName, this); [EOL]     return result; [EOL] } <line_num>: 293,302
public final boolean defineSynthesizedProperty(String propertyName, JSType type, Node propertyNode) { [EOL]     return defineProperty(propertyName, type, false, propertyNode); [EOL] } <line_num>: 309,312
public final boolean defineInferredProperty(String propertyName, JSType type, Node propertyNode) { [EOL]     StaticSlot<JSType> originalSlot = getSlot(propertyName); [EOL]     if (hasProperty(propertyName)) { [EOL]         if (isPropertyTypeDeclared(propertyName)) { [EOL]             return true; [EOL]         } [EOL]         JSType originalType = getPropertyType(propertyName); [EOL]         type = originalType == null ? type : originalType.getLeastSupertype(type); [EOL]     } [EOL]     boolean result = defineProperty(propertyName, type, true, propertyNode); [EOL]     registry.registerPropertyOnType(propertyName, this); [EOL]     return result; [EOL] } <line_num>: 321,344
abstract boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode); <line_num>: 362,363
public boolean removeProperty(String propertyName) { [EOL]     return false; [EOL] } <line_num>: 372,374
public Node getPropertyNode(String propertyName) { [EOL]     Property p = getSlot(propertyName); [EOL]     return p == null ? null : p.getNode(); [EOL] } <line_num>: 388,391
public JSDocInfo getOwnPropertyJSDocInfo(String propertyName) { [EOL]     Property p = getOwnSlot(propertyName); [EOL]     return p == null ? null : p.getJSDocInfo(); [EOL] } <line_num>: 398,401
public void setPropertyJSDocInfo(String propertyName, JSDocInfo info) { [EOL] } <line_num>: 409,411
@Override [EOL] public JSType findPropertyType(String propertyName) { [EOL]     return hasProperty(propertyName) ? getPropertyType(propertyName) : null; [EOL] } <line_num>: 413,417
public JSType getPropertyType(String propertyName) { [EOL]     StaticSlot<JSType> slot = getSlot(propertyName); [EOL]     if (slot == null) { [EOL]         if (isNoResolvedType() || isCheckedUnknownType()) { [EOL]             return getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE); [EOL]         } else if (isEmptyType()) { [EOL]             return getNativeType(JSTypeNative.NO_TYPE); [EOL]         } [EOL]         return getNativeType(JSTypeNative.UNKNOWN_TYPE); [EOL]     } [EOL]     return slot.getType(); [EOL] } <line_num>: 430,441
@Override [EOL] public boolean hasProperty(String propertyName) { [EOL]     return isEmptyType() || isUnknownType() || getSlot(propertyName) != null; [EOL] } <line_num>: 443,447
public boolean hasOwnProperty(String propertyName) { [EOL]     return getOwnSlot(propertyName) != null; [EOL] } <line_num>: 453,455
public Set<String> getOwnPropertyNames() { [EOL]     return getPropertyMap().getOwnPropertyNames(); [EOL] } <line_num>: 462,464
public boolean isPropertyTypeInferred(String propertyName) { [EOL]     StaticSlot<JSType> slot = getSlot(propertyName); [EOL]     return slot == null ? false : slot.isTypeInferred(); [EOL] } <line_num>: 469,472
public boolean isPropertyTypeDeclared(String propertyName) { [EOL]     StaticSlot<JSType> slot = getSlot(propertyName); [EOL]     return slot == null ? false : !slot.isTypeInferred(); [EOL] } <line_num>: 477,480
final boolean hasOwnDeclaredProperty(String name) { [EOL]     return hasOwnProperty(name) && isPropertyTypeDeclared(name); [EOL] } <line_num>: 485,487
public boolean isPropertyInExterns(String propertyName) { [EOL]     Property p = getSlot(propertyName); [EOL]     return p == null ? false : p.isFromExterns(); [EOL] } <line_num>: 490,493
public int getPropertiesCount() { [EOL]     return getPropertyMap().getPropertiesCount(); [EOL] } <line_num>: 498,500
public Set<String> getPropertyNames() { [EOL]     Set<String> props = Sets.newTreeSet(); [EOL]     collectPropertyNames(props); [EOL]     return props; [EOL] } <line_num>: 506,510
final void collectPropertyNames(Set<String> props) { [EOL]     getPropertyMap().collectPropertyNames(props); [EOL] } <line_num>: 515,517
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseObjectType(this); [EOL] } <line_num>: 519,522
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseObjectType(this, that); [EOL] } <line_num>: 524,526
final boolean isImplicitPrototype(ObjectType prototype) { [EOL]     for (ObjectType current = this; current != null; current = current.getImplicitPrototype()) { [EOL]         if (current.isEquivalentTo(prototype)) { [EOL]             return true; [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 538,547
@Override [EOL] public BooleanLiteralSet getPossibleToBooleanOutcomes() { [EOL]     return BooleanLiteralSet.TRUE; [EOL] } <line_num>: 549,552
@Override [EOL] public boolean isUnknownType() { [EOL]     if (unknown) { [EOL]         ObjectType implicitProto = getImplicitPrototype(); [EOL]         if (implicitProto == null || implicitProto.isNativeObjectType()) { [EOL]             unknown = false; [EOL]             for (ObjectType interfaceType : getCtorExtendedInterfaces()) { [EOL]                 if (interfaceType.isUnknownType()) { [EOL]                     unknown = true; [EOL]                     break; [EOL]                 } [EOL]             } [EOL]         } else { [EOL]             unknown = implicitProto.isUnknownType(); [EOL]         } [EOL]     } [EOL]     return unknown; [EOL] } <line_num>: 558,578
@Override [EOL] public boolean isObject() { [EOL]     return true; [EOL] } <line_num>: 580,583
public boolean hasCachedValues() { [EOL]     return !unknown; [EOL] } <line_num>: 590,592
public void clearCachedValues() { [EOL]     unknown = true; [EOL] } <line_num>: 598,600
public boolean isNativeObjectType() { [EOL]     return false; [EOL] } <line_num>: 603,605
public static ObjectType cast(JSType type) { [EOL]     return type == null ? null : type.toObjectType(); [EOL] } <line_num>: 610,612
@Override [EOL] public final boolean isFunctionPrototypeType() { [EOL]     return getOwnerFunction() != null; [EOL] } <line_num>: 614,617
public FunctionType getOwnerFunction() { [EOL]     return null; [EOL] } <line_num>: 620,622
void setOwnerFunction(FunctionType type) { [EOL] } <line_num>: 625,625
public Iterable<ObjectType> getCtorImplementedInterfaces() { [EOL]     return ImmutableSet.of(); [EOL] } <line_num>: 631,633
public Iterable<ObjectType> getCtorExtendedInterfaces() { [EOL]     return ImmutableSet.of(); [EOL] } <line_num>: 639,641
