private ObjectWithTypeVariables()
public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList, List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList)
private MultiParameters()
 MultiParameters(A a, B b, C c, D d, E e)
protected void setUp() throws Exception
public void testParameterizedTypesSerialization() throws Exception
public void testParameterizedTypeDeserialization() throws Exception
public void testTypesWithMultipleParametersSerialization() throws Exception
public void testTypesWithMultipleParametersDeserialization() throws Exception
public void testParameterizedTypeWithCustomSerializer()
public void testParameterizedTypesWithCustomDeserializer()
public void testParameterizedTypesWithWriterSerialization() throws Exception
public void testParameterizedTypeWithReaderDeserialization() throws Exception
public void testVariableTypeFieldsAndGenericArraysSerialization() throws Exception
public void testVariableTypeFieldsAndGenericArraysDeserialization() throws Exception
public void testVariableTypeDeserialization() throws Exception
public void testVariableTypeArrayDeserialization() throws Exception
public void testParameterizedTypeWithVariableTypeDeserialization() throws Exception
public void testParameterizedTypeGenericArraysSerialization() throws Exception
public void testParameterizedTypeGenericArraysDeserialization() throws Exception
public String getExpectedJson()
private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable)
private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList)
public String toString(T obj)
public int hashCode()
public boolean equals(Object obj)
public void testDeepParameterizedTypeSerialization()
public void testDeepParameterizedTypeDeserialization()
