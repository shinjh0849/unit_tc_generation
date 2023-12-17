public abstract Iterable<DiGraphNode<N, E>> getDirectedGraphNodes(); <line_num>: 33,33
public abstract List<DiGraphEdge<N, E>> getOutEdges(N nodeValue); <line_num>: 38,38
public abstract List<DiGraphEdge<N, E>> getInEdges(N nodeValue); <line_num>: 43,43
public abstract List<DiGraphNode<N, E>> getDirectedPredNodes(DiGraphNode<N, E> n); <line_num>: 45,46
public abstract List<DiGraphNode<N, E>> getDirectedSuccNodes(DiGraphNode<N, E> n); <line_num>: 48,49
public abstract List<DiGraphNode<N, E>> getDirectedPredNodes(N nodeValue); <line_num>: 51,52
public abstract List<DiGraphNode<N, E>> getDirectedSuccNodes(N nodeValue); <line_num>: 54,55
public abstract DiGraphNode<N, E> createDirectedGraphNode(N nodeValue); <line_num>: 57,57
public abstract DiGraphNode<N, E> getDirectedGraphNode(N nodeValue); <line_num>: 59,59
public abstract List<DiGraphEdge<N, E>> getDirectedGraphEdges(N n1, N n2); <line_num>: 61,62
public abstract void disconnectInDirection(N n1, N n2); <line_num>: 70,70
public abstract boolean isConnectedInDirection(N n1, N n2); <line_num>: 79,79
public abstract boolean isConnectedInDirection(N n1, E edgeValue, N n2); <line_num>: 90,90
@Override [EOL] public boolean isConnected(N n1, N n2) { [EOL]     return isConnectedInDirection(n1, n2) || isConnectedInDirection(n2, n1); [EOL] } <line_num>: 92,95
@Override [EOL] public boolean isConnected(N n1, E e, N n2) { [EOL]     return isConnectedInDirection(n1, e, n2) || isConnectedInDirection(n2, e, n1); [EOL] } <line_num>: 97,101
public List<DiGraphEdge<N, E>> getOutEdges(); <line_num>: 111,111
public List<DiGraphEdge<N, E>> getInEdges(); <line_num>: 113,113
public DiGraphNode<N, E> getSource(); <line_num>: 124,124
public DiGraphNode<N, E> getDestination(); <line_num>: 126,126
public void setSource(DiGraphNode<N, E> node); <line_num>: 128,128
public void setDestination(DiGraphNode<N, E> node); <line_num>: 130,130
