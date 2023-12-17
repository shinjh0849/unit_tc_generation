 EnumType(JSTypeRegistry registry, String name, Node source, JSType elementsType)
public Node getSource()
public EnumType toMaybeEnumType()
public ObjectType getImplicitPrototype()
public Set<String> getElements()
public boolean defineElement(String name, Node definingNode)
public EnumElementType getElementsType()
public TernaryValue testForEquality(JSType that)
public boolean isSubtype(JSType that)
 String toStringHelper(boolean forAnnotations)
public String getDisplayName()
public T visit(Visitor<T> visitor)
 T visit(RelationshipVisitor<T> visitor, JSType that)
public FunctionType getConstructor()
public boolean matchesNumberContext()
public boolean matchesStringContext()
public boolean matchesObjectContext()
 JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope)
long serialVersionUID=Optional[1L]
Node source
EnumElementType elementsType
Set<String> elements=Optional[new HashSet<String>()]
