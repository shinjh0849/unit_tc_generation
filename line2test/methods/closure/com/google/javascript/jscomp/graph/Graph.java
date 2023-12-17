public AnnotationState(Annotatable annotatable, Annotation annotation) { [EOL]     this.first = annotatable; [EOL]     this.second = annotation; [EOL] } <line_num>: 66,69
public GraphAnnotationState(int size) { [EOL]     super(size); [EOL] } <line_num>: 79,81
SimpleSubGraph(Graph<N, E> graph) { [EOL]     this.graph = graph; [EOL] } <line_num>: 310,312
public abstract void connect(N n1, E edge, N n2); <line_num>: 101,101
public abstract void disconnect(N n1, N n2); <line_num>: 109,109
public final void connectIfNotFound(N n1, E edge, N n2) { [EOL]     if (!isConnected(n1, edge, n2)) { [EOL]         connect(n1, edge, n2); [EOL]     } [EOL] } <line_num>: 119,123
public abstract GraphNode<N, E> createNode(N value); <line_num>: 133,133
@Override [EOL] public abstract Collection<GraphNode<N, E>> getNodes(); <line_num>: 136,137
public abstract List<GraphEdge<N, E>> getEdges(); <line_num>: 140,140
public abstract int getNodeDegree(N value); <line_num>: 148,148
@Override [EOL] public int getWeight(N value) { [EOL]     return getNodeDegree(value); [EOL] } <line_num>: 150,153
public abstract List<GraphNode<N, E>> getNeighborNodes(N value); <line_num>: 161,161
public abstract Iterator<GraphNode<N, E>> getNeighborNodesIterator(N value); <line_num>: 163,163
public abstract List<GraphEdge<N, E>> getEdges(N n1, N n2); <line_num>: 172,172
public abstract GraphEdge<N, E> getFirstEdge(N n1, N n2); <line_num>: 182,182
public final boolean hasNode(N n) { [EOL]     return getNode(n) != null; [EOL] } <line_num>: 191,193
public abstract boolean isConnected(N n1, N n2); <line_num>: 202,202
public abstract boolean isConnected(N n1, E e, N n2); <line_num>: 212,212
@SuppressWarnings("unchecked") [EOL] <T extends GraphNode<N, E>> T getNodeOrFail(N val) { [EOL]     T node = (T) getNode(val); [EOL]     if (node == null) { [EOL]         throw new IllegalArgumentException(val + " does not exist in graph"); [EOL]     } [EOL]     return node; [EOL] } <line_num>: 218,225
@Override [EOL] public final void clearNodeAnnotations() { [EOL]     for (GraphNode<N, E> n : getNodes()) { [EOL]         n.setAnnotation(null); [EOL]     } [EOL] } <line_num>: 227,232
public final void clearEdgeAnnotations() { [EOL]     for (GraphEdge<N, E> e : getEdges()) { [EOL]         e.setAnnotation(null); [EOL]     } [EOL] } <line_num>: 235,239
public final void pushNodeAnnotations() { [EOL]     if (nodeAnnotationStack == null) { [EOL]         nodeAnnotationStack = Lists.newLinkedList(); [EOL]     } [EOL]     pushAnnotations(nodeAnnotationStack, getNodes()); [EOL] } <line_num>: 245,250
public final void popNodeAnnotations() { [EOL]     Preconditions.checkNotNull(nodeAnnotationStack, "Popping node annotations without pushing."); [EOL]     popAnnotations(nodeAnnotationStack); [EOL] } <line_num>: 256,260
public final void pushEdgeAnnotations() { [EOL]     if (edgeAnnotationStack == null) { [EOL]         edgeAnnotationStack = Lists.newLinkedList(); [EOL]     } [EOL]     pushAnnotations(edgeAnnotationStack, getEdges()); [EOL] } <line_num>: 266,271
public final void popEdgeAnnotations() { [EOL]     Preconditions.checkNotNull(edgeAnnotationStack, "Popping edge annotations without pushing."); [EOL]     popAnnotations(edgeAnnotationStack); [EOL] } <line_num>: 277,281
E getValue(); <line_num>: 295,295
GraphNode<N, E> getNodeA(); <line_num>: 297,297
GraphNode<N, E> getNodeB(); <line_num>: 299,299
@Override [EOL] public boolean isIndependentOf(N value) { [EOL]     GraphNode<N, E> node = graph.getNode(value); [EOL]     for (GraphNode<N, E> n : nodes) { [EOL]         if (graph.getNeighborNodes(n.getValue()).contains(node)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 314,323
@Override [EOL] public void addNode(N value) { [EOL]     nodes.add(graph.getNodeOrFail(value)); [EOL] } <line_num>: 325,328
private static void pushAnnotations(Deque<GraphAnnotationState> stack, Collection<? extends Annotatable> haveAnnotations) { [EOL]     stack.push(new GraphAnnotationState(haveAnnotations.size())); [EOL]     for (Annotatable h : haveAnnotations) { [EOL]         stack.peek().add(new AnnotationState(h, h.getAnnotation())); [EOL]         h.setAnnotation(null); [EOL]     } [EOL] } <line_num>: 335,343
private static void popAnnotations(Deque<GraphAnnotationState> stack) { [EOL]     for (AnnotationState as : stack.pop()) { [EOL]         as.first.setAnnotation(as.second); [EOL]     } [EOL] } <line_num>: 348,352
