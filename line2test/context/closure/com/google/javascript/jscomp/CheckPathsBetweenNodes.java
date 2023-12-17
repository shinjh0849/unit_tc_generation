 CheckPathsBetweenNodes(DiGraph<N, E> graph, DiGraphNode<N, E> a, DiGraphNode<N, E> b, Predicate<N> nodePredicate, Predicate<DiGraphEdge<N, E>> edgePredicate, boolean inclusive)
 CheckPathsBetweenNodes(DiGraph<N, E> graph, DiGraphNode<N, E> a, DiGraphNode<N, E> b, Predicate<N> nodePredicate, Predicate<DiGraphEdge<N, E>> edgePredicate)
public boolean allPathsSatisfyPredicate()
public boolean somePathsSatisfyPredicate()
private void setUp()
private void tearDown()
private void discoverBackEdges(DiGraphNode<N, E> u)
private boolean ignoreEdge(DiGraphEdge<N, E> e)
private boolean checkAllPathsWithoutBackEdges(DiGraphNode<N, E> a, DiGraphNode<N, E> b)
private boolean checkSomePathsWithoutBackEdges(DiGraphNode<N, E> a, DiGraphNode<N, E> b)
Predicate<N> nodePredicate
Predicate<DiGraphEdge<N, E>> edgePredicate
boolean inclusive
Annotation BACK_EDGE=Optional[new Annotation() {
}]
Annotation VISITED_EDGE=Optional[new Annotation() {
}]
Annotation WHITE=Optional[null]
Annotation GRAY=Optional[new Annotation() {
}]
Annotation BLACK=Optional[new Annotation() {
}]
DiGraph<N, E> graph
DiGraphNode<N, E> start
DiGraphNode<N, E> end
