public void setUp() throws Exception
public void testModuleDepth()
public void testDeepestCommonDep()
public void testDeepestCommonDepInclusive()
public void testGetTransitiveDepsDeepestFirst()
public void testCoalesceDuplicateFiles()
public void testManageDependencies1() throws Exception
public void testManageDependencies2() throws Exception
public void testManageDependencies3() throws Exception
public void testManageDependencies4() throws Exception
public void testNoFiles() throws Exception
public void testToJson() throws JSONException
private List<CompilerInput> setUpManageDependenciesTest()
private void assertInputs(JSModule module, String... sourceNames)
private List<String> sourceNames(List<CompilerInput> inputs)
private SourceFile code(String sourceName, List<String> provides, List<String> requires)
private List<String> provides(String... strings)
private List<String> requires(String... strings)
private void assertDeepestCommonDepInclusive(JSModule expected, JSModule m1, JSModule m2)
private void assertDeepestCommonDep(JSModule expected, JSModule m1, JSModule m2)
private void assertDeepestCommonDepOneWay(JSModule expected, JSModule m1, JSModule m2, boolean inclusive)
private void assertTransitiveDepsDeepestFirst(JSModule m, JSModule... deps)
