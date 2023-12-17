public SortedDependencies(List<INPUT> inputs) throws CircularDependencyException
 CircularDependencyException(String message)
 MissingProvideException(String provide)
public INPUT getInputProviding(String symbol) throws MissingProvideException
public INPUT maybeGetInputProviding(String symbol)
private List<INPUT> findCycle(List<INPUT> subGraph, Multimap<INPUT, INPUT> deps)
private List<INPUT> findCycle(INPUT current, Set<INPUT> subGraph, Multimap<INPUT, INPUT> deps, Set<INPUT> covered)
private INPUT findRequireInSubGraphOrFail(INPUT input, Set<INPUT> subGraph)
private String cycleToString(List<INPUT> cycle)
public List<INPUT> getSortedList()
public List<INPUT> getSortedDependenciesOf(List<INPUT> roots)
public List<INPUT> getDependenciesOf(List<INPUT> roots, boolean sorted)
public List<INPUT> getInputsWithoutProvides()
public int compare(T a, T b)
private static List<T> topologicalStableSort(List<T> items, Multimap<T, T> deps)
List<INPUT> inputs
List<INPUT> sortedList
List<INPUT> noProvides
Map<String, INPUT> provideMap=Optional[Maps.newHashMap()]
