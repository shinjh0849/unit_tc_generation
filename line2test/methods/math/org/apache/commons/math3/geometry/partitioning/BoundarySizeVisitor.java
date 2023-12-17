public BoundarySizeVisitor() { [EOL]     boundarySize = 0; [EOL] } <line_num>: 33,35
public Order visitOrder(final BSPTree<S> node) { [EOL]     return Order.MINUS_SUB_PLUS; [EOL] } <line_num>: 38,40
public void visitInternalNode(final BSPTree<S> node) { [EOL]     @SuppressWarnings("unchecked") [EOL]     final BoundaryAttribute<S> attribute = (BoundaryAttribute<S>) node.getAttribute(); [EOL]     if (attribute.getPlusOutside() != null) { [EOL]         boundarySize += attribute.getPlusOutside().getSize(); [EOL]     } [EOL]     if (attribute.getPlusInside() != null) { [EOL]         boundarySize += attribute.getPlusInside().getSize(); [EOL]     } [EOL] } <line_num>: 43,53
public void visitLeafNode(final BSPTree<S> node) { [EOL] } <line_num>: 56,57
public double getSize() { [EOL]     return boundarySize; [EOL] } <line_num>: 62,64
