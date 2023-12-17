 NamedType(JSTypeRegistry registry, String reference, String sourceName, int lineno, int charno)
private PropertyContinuation(String propertyName, JSType type, boolean inferred, Node propertyNode)
 boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode)
private void finishPropertyContinuations()
public JSType getReferencedType()
public String getReferenceName()
 String toStringHelper(boolean forAnnotations)
public boolean hasReferenceName()
 boolean isNamedType()
public boolean isNominalType()
public int hashCode()
 JSType resolveInternal(ErrorReporter t, StaticScope<JSType> enclosing)
private boolean resolveViaRegistry(ErrorReporter t, StaticScope<JSType> enclosing)
private void resolveViaProperties(ErrorReporter t, StaticScope<JSType> enclosing)
private JSType lookupViaProperties(ErrorReporter t, StaticScope<JSType> enclosing)
private void setReferencedAndResolvedType(JSType type, ErrorReporter t, StaticScope<JSType> enclosing)
private void handleTypeCycle(ErrorReporter t)
private void checkEnumElementCycle(ErrorReporter t)
private void checkProtoCycle(ErrorReporter t)
private void handleUnresolvedType(ErrorReporter t, boolean ignoreForwardReferencedTypes)
 JSType getTypedefType(ErrorReporter t, StaticSlot<JSType> slot, String name)
public boolean setValidator(Predicate<JSType> validator)
 void commit(ObjectType target)
long serialVersionUID=Optional[1L]
String reference
String sourceName
int lineno
int charno
Predicate<JSType> validator
List<PropertyContinuation> propertyContinuations=Optional[null]
