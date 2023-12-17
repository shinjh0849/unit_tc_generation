public void testAndOr() throws Exception
public void testIllegalArgumentIfNotAndOr() throws Exception
public void testIllegalArgumentIfNoSideEffectAndOr() throws Exception
public void testHook() throws Exception
public void testIllegalArgumentIfNotHook() throws Exception
public void testIllegalArgumentIfNoSideEffectHook() throws Exception
public void testIllegalArgumentIfHookKeepNeitherBranch() throws Exception
private Node getNoSideEffectsAndNode()
private Node getSideEffectsAndNode()
private Node getNoSideEffectsHookNode()
private Node getSideEffectsHookNode()
private void checkKeepSimplifiedShortCircuitExpr(Node root, List<String> expected)
private void checkKeepSimplifiedHookExpr(Node root, boolean thenHasSideEffects, boolean elseHasSideEffects, List<String> expected)
