private TypedName(String name, JSType type)
protected void setUp() throws Exception
public FlowScope newScope()
public void testNameCondition() throws Exception
public void testNegatedNameCondition() throws Exception
public void testAssignCondition1() throws Exception
public void testSheqCondition1() throws Exception
public void testSheqCondition2() throws Exception
public void testSheqCondition3() throws Exception
public void testSheqCondition4() throws Exception
public void testSheqCondition5() throws Exception
public void testSheqCondition6() throws Exception
public void testShneCondition1() throws Exception
public void testShneCondition2() throws Exception
public void testShneCondition3() throws Exception
public void testShneCondition4() throws Exception
public void testShneCondition5() throws Exception
public void testShneCondition6() throws Exception
public void testEqCondition1() throws Exception
public void testEqCondition2() throws Exception
public void testEqCondition3() throws Exception
public void testEqCondition4() throws Exception
public void testInequalitiesCondition1()
public void testInequalitiesCondition2()
public void testInequalitiesCondition3()
public void testAnd()
public void testTypeof1()
public void testTypeof2()
public void testTypeof3()
public void testTypeof4()
public void testInstanceOf()
public void testInstanceOf2()
public void testInstanceOf3()
public void testInstanceOf4()
private void testBinop(FlowScope blind, int binop, Node left, Node right, Collection<TypedName> trueOutcome, Collection<TypedName> falseOutcome)
private Node createNull()
private Node createNumber(int n)
private Node createUntypedNumber(int n)
private JSType getVarType(FlowScope scope, String name)
private Node createVar(FlowScope scope, String name, JSType type)
CodingConvention codingConvention=Optional[new GoogleCodingConvention()]
ReverseAbstractInterpreter interpreter
Scope functionScope
