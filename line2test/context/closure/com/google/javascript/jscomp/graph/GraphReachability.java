public GraphReachability(DiGraph<N, E> graph)
public GraphReachability(DiGraph<N, E> graph, Predicate<EdgeTuple<N, E>> edgePredicate)
public EdgeTuple(N sourceNode, E edge, N destNode)
public void compute(N entry)
public void recompute(N reachableNode)
public boolean traverseEdge(N source, E e, N destination)
DiGraph<N, E> graph
Predicate<EdgeTuple<N, E>> edgePredicate
Annotation REACHABLE=Optional[new Annotation() {
}]
