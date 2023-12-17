public FixedPointGraphTraversal(EdgeCallback<N, E> callback)
public static FixedPointGraphTraversal<NODE, EDGE> newTraversal(EdgeCallback<NODE, EDGE> callback)
public void computeFixedPoint(DiGraph<N, E> graph)
public void computeFixedPoint(DiGraph<N, E> graph, N entry)
public void computeFixedPoint(DiGraph<N, E> graph, Set<N> entrySet)
 boolean traverseEdge(Node source, Edge e, Node destination)
EdgeCallback<N, E> callback
String NON_HALTING_ERROR_MSG=Optional["Fixed point computation not halting"]
