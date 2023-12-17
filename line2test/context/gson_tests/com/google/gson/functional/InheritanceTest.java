private SubTypeOfNested()
public SubTypeOfNested(BagOfPrimitives primitive1, BagOfPrimitives primitive2)
private ClassWithSubInterfacesOfCollection()
public ClassWithSubInterfacesOfCollection(List<Integer> list, Queue<Long> queue, Set<Float> set, SortedSet<Character> sortedSet)
protected void setUp() throws Exception
public void testSubClassSerialization() throws Exception
public void testSubClassDeserialization() throws Exception
public void testClassWithBaseFieldSerialization()
public void testClassWithBaseArrayFieldSerialization()
public void testBaseSerializedAsSub()
public void testBaseSerializedAsSubForToJsonMethod()
public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitType()
public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod()
public void testBaseSerializedAsSubWhenSpecifiedWithExplicitType()
public void testBaseSerializedAsSubWhenSpecifiedWithExplicitTypeForToJsonMethod()
public void appendFields(StringBuilder sb)
public void testSubInterfacesOfCollectionSerialization() throws Exception
public void testSubInterfacesOfCollectionDeserialization() throws Exception
 boolean listContains(int... values)
 boolean queueContains(long... values)
 boolean setContains(float... values)
 boolean sortedSetContains(char... values)
public String getExpectedJson()
private StringBuilder append(StringBuilder sb, Collection<?> c)
Gson gson
