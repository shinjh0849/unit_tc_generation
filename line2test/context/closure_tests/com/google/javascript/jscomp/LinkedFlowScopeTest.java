public void setUp() throws Exception
public void testOptimize()
public void testJoin1()
public void testJoin2()
public void testJoin3()
public void testLongChain1()
public void testLongChain2()
public void testLongChain3()
private void verifyLongChains(FlowScope chainA, FlowScope chainB)
public void testFindUniqueSlot()
public void testDiffer1()
public void testDiffer2()
private void assertScopesDiffer(FlowScope a, FlowScope b)
private void assertScopesSame(FlowScope a, FlowScope b)
private FlowScope join(FlowScope a, FlowScope b)
Node blockNode=Optional[new Node(Token.BLOCK)]
Node functionNode=Optional[new Node(Token.FUNCTION)]
int LONG_CHAIN_LENGTH=Optional[1050]
Scope globalScope
Scope localScope
FlowScope globalEntry
FlowScope localEntry
