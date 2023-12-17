public NodeTypeTest(int nodeType) { [EOL]     this.nodeType = nodeType; [EOL] } <line_num>: 28,30
public int getNodeType() { [EOL]     return nodeType; [EOL] } <line_num>: 32,34
public String toString() { [EOL]     return nodeTypeToString(nodeType) + "()"; [EOL] } <line_num>: 36,38
public static String nodeTypeToString(int code) { [EOL]     switch(code) { [EOL]         case Compiler.NODE_TYPE_NODE: [EOL]             return "node"; [EOL]         case Compiler.NODE_TYPE_TEXT: [EOL]             return "text"; [EOL]         case Compiler.NODE_TYPE_COMMENT: [EOL]             return "comment"; [EOL]         case Compiler.NODE_TYPE_PI: [EOL]             return "processing-instruction"; [EOL]     } [EOL]     return "UNKNOWN"; [EOL] } <line_num>: 40,52
