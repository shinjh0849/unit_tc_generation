public void testBadInstantiation() throws Exception
public void testSkipFieldsWithMixedTrueAndFalse() throws Exception
public void testSkipFieldsWithFalseOnly() throws Exception
ExclusionStrategy FALSE_STRATEGY=Optional[new MockExclusionStrategy(false, false)]
ExclusionStrategy TRUE_STRATEGY=Optional[new MockExclusionStrategy(true, true)]
Class<?> CLAZZ=Optional[String.class]
FieldAttributes FIELD=Optional[new FieldAttributes(CLAZZ, CLAZZ.getFields()[0])]
