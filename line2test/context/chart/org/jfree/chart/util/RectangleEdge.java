private RectangleEdge(String name)
public String toString()
public boolean equals(Object obj)
public int hashCode()
public static boolean isTopOrBottom(RectangleEdge edge)
public static boolean isLeftOrRight(RectangleEdge edge)
public static RectangleEdge opposite(RectangleEdge edge)
public static double coordinate(Rectangle2D rectangle, RectangleEdge edge)
private Object readResolve() throws ObjectStreamException
long serialVersionUID=Optional[-7400988293691093548L]
RectangleEdge TOP=Optional[new RectangleEdge("RectangleEdge.TOP")]
RectangleEdge BOTTOM=Optional[new RectangleEdge("RectangleEdge.BOTTOM")]
RectangleEdge LEFT=Optional[new RectangleEdge("RectangleEdge.LEFT")]
RectangleEdge RIGHT=Optional[new RectangleEdge("RectangleEdge.RIGHT")]
String name
