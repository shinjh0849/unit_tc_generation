public static Constructor lookupConstructor(Class targetClass, Object[] parameters)
public static Method lookupStaticMethod(Class targetClass, String name, Object[] parameters)
public static Method lookupMethod(Class targetClass, String name, Object[] parameters)
private static int matchParameterTypes(Class[] types, Object[] parameters)
private static int matchType(Class expected, Object object)
int NO_MATCH=Optional[0]
int APPROXIMATE_MATCH=Optional[1]
int EXACT_MATCH=Optional[2]
Object[] EMPTY_ARRAY=Optional[new Object[0]]
