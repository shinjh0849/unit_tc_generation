public void setUp()
public CompilerPass getProcessor(Compiler compiler)
protected int getNumRepetitions()
private static String generateCode(String keyword, int numReps, String prepend)
private static String generateCode(String keyword, int numReps)
private static String generatePreProcessThrowCode(int repititions, String whatToThrow)
private static String generatePostProcessThrowCode(int repetitions, String code, String whatToThrow)
public void testDontAlias()
public void testAlias()
public void testAliasTrueFalseNull()
public void testAliasThrowKeywordLiteral()
public void testExistingAliasDefinitionFails()
public void testWithNoInputs()
int ENOUGH_TO_ALIAS_LITERAL=Optional[AliasKeywords.MIN_OCCURRENCES_REQUIRED_TO_ALIAS_LITERAL]
int TOO_FEW_TO_ALIAS_LITERAL=Optional[ENOUGH_TO_ALIAS_LITERAL - 1]
int ENOUGH_TO_ALIAS_THROW=Optional[AliasKeywords.MIN_OCCURRENCES_REQUIRED_TO_ALIAS_THROW]
int TOO_FEW_TO_ALIAS_THROW=Optional[ENOUGH_TO_ALIAS_THROW - 1]
