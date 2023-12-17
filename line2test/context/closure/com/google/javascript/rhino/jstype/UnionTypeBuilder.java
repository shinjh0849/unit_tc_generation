 UnionTypeBuilder(JSTypeRegistry registry)
 UnionTypeBuilder(JSTypeRegistry registry, int maxUnionSize)
 Iterable<JSType> getAlternates()
 UnionTypeBuilder addAlternate(JSType alternate)
private JSType reduceAlternatesWithoutUnion()
 JSType build()
private Collection<JSType> getAlternateListCopy()
long serialVersionUID=Optional[1L]
int DEFAULT_MAX_UNION_SIZE=Optional[20]
JSTypeRegistry registry
List<JSType> alternates=Optional[Lists.newArrayList()]
boolean isAllType=Optional[false]
boolean isNativeUnknownType=Optional[false]
boolean areAllUnknownsChecked=Optional[true]
int maxUnionSize
int functionTypePosition=Optional[-1]
JSType result=Optional[null]
