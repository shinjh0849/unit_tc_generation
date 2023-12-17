 CheckSuspiciousCode()
public void visit(NodeTraversal t, Node n, Node parent)
private void checkMissingSemicolon(NodeTraversal t, Node n)
private void reportIfWasEmpty(NodeTraversal t, Node block)
private void checkNaN(NodeTraversal t, Node n)
private void reportIfNaN(NodeTraversal t, Node n)
DiagnosticType SUSPICIOUS_SEMICOLON=Optional[DiagnosticType.warning("JSC_SUSPICIOUS_SEMICOLON", "If this if/for/while really shouldn't have a body, use {}")]
DiagnosticType SUSPICIOUS_COMPARISON_WITH_NAN=Optional[DiagnosticType.warning("JSC_SUSPICIOUS_NAN", "Comparison again NaN is always false. Did you mean isNaN()?")]
