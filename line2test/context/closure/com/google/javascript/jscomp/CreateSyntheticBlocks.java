public Marker(Node startMarker, Node endMarker)
public CreateSyntheticBlocks(AbstractCompiler compiler, String startMarkerName, String endMarkerName)
public void process(Node externs, Node root)
private void addBlocks(Marker marker)
private void moveSiblingExclusive(Node src, Node dest, @Nullable Node start, @Nullable Node end)
private Node childAfter(Node parent, @Nullable Node siblingBefore)
private Node removeChildAfter(Node parent, @Nullable Node siblingBefore)
public void visit(NodeTraversal t, Node n, Node parent)
DiagnosticType UNMATCHED_START_MARKER=Optional[DiagnosticType.warning("JSC_UNMATCHED_START_MARKER", "Unmatched {0}")]
DiagnosticType UNMATCHED_END_MARKER=Optional[DiagnosticType.warning("JSC_UNMATCHED_END_MARKER", "Unmatched {1} - {0} not in the same block")]
DiagnosticType INVALID_MARKER_USAGE=Optional[DiagnosticType.warning("JSC_INVALID_MARKER_USAGE", "Marker {0} can only be used in a simple " + "call expression")]
AbstractCompiler compiler
String startMarkerName
String endMarkerName
Deque<Node> markerStack=Optional[new ArrayDeque<Node>()]
List<Marker> validMarkers=Optional[Lists.newArrayList()]
