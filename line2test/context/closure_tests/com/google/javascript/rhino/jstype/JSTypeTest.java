public StaticSlot<JSType> getSlot(String name)
protected void setUp() throws Exception
public void testUniversalConstructorType() throws Exception
public void testNoObjectType() throws Exception
public void testNoType() throws Exception
public void testNoResolvedType() throws Exception
public void testArrayType() throws Exception
public void testUnknownType() throws Exception
public void testCheckedUnknownType() throws Exception
public void testAllType() throws Exception
public void testTheObjectType() throws Exception
public void testNumberObjectType() throws Exception
public void testNumberValueType() throws Exception
public void testNullType() throws Exception
public void testDateType() throws Exception
public void testRegExpType() throws Exception
public void testStringObjectType() throws Exception
public void testStringValueType() throws Exception
private void assertPropertyTypeDeclared(ObjectType ownerType, String prop)
private void assertPropertyTypeInferred(ObjectType ownerType, String prop)
private void assertPropertyTypeUnknown(ObjectType ownerType, String prop)
private void assertReturnTypeEquals(JSType expectedReturnType, JSType function)
public void testRecordType() throws Exception
public void testFunctionInstanceType() throws Exception
public void testFunctionType() throws Exception
public void testRecordTypeSubtyping()
public void testRecordTypeSubtypingWithInferredProperties()
public void testRecordTypeLeastSuperType1()
public void testRecordTypeLeastSuperType2()
public void testRecordTypeLeastSuperType3()
public void testRecordTypeLeastSuperType4()
public void testRecordTypeGreatestSubType1()
public void testRecordTypeGreatestSubType2()
public void testRecordTypeGreatestSubType3()
public void testRecordTypeGreatestSubType4()
public void testRecordTypeGreatestSubType5()
public void testRecordTypeGreatestSubType6()
public void testRecordTypeGreatestSubType7()
public void testRecordTypeGreatestSubType8()
public void testApplyOfDateMethod()
public void testCallOfDateMethod()
public void testFunctionTypeRepresentation()
public void testFunctionTypeRelationships()
public void testProxiedFunctionTypeRelationships()
public void testFunctionSubTypeRelationships()
public void testFunctionPrototypeAndImplicitPrototype1()
public void testFunctionPrototypeAndImplicitPrototype2()
public void testJSDocOnPrototypeProperty() throws Exception
public void testVoidType() throws Exception
public void testBooleanValueType() throws Exception
public void testBooleanObjectType() throws Exception
public void testEnumType() throws Exception
public void testEnumElementType() throws Exception
public void testStringEnumType() throws Exception
public void testStringObjectEnumType() throws Exception
public void testObjectType() throws Exception
public void testGoogBar() throws Exception
public void testObjectTypePropertiesCount() throws Exception
public void testDefineProperties()
public void testObjectTypePropertiesCountWithShadowing()
public void testNamedGoogBar() throws Exception
public void testPrototypeChaining() throws Exception
public void testInstanceFunctionChaining() throws Exception
public void testCanTestForEqualityWithCornerCases()
public void testTestForEquality()
private void compare(TernaryValue r, JSType t1, JSType t2)
private void assertCanTestForEqualityWith(JSType t1, JSType t2)
private void assertCannotTestForEqualityWith(JSType t1, JSType t2)
public void testSubtypingSimpleTypes() throws Exception
public void testSubtypingObjectTopOfObjects() throws Exception
public void testSubtypingFunctionPrototypeType() throws Exception
public void testSubtypingFunctionFixedArgs() throws Exception
public void testSubtypingFunctionMultipleFixedArgs() throws Exception
public void testSubtypingFunctionFixedArgsNotMatching() throws Exception
public void testSubtypingFunctionVariableArgsOneOnly() throws Exception
public void testSubtypingFunctionVariableArgsBoth() throws Exception
public void testSubtypingMostGeneralFunction() throws Exception
private List<JSType> getTypesToTestForSymmetry()
public void testSymmetryOfTestForEquality()
public void testSymmetryOfLeastSupertype()
public void testWeirdBug()
public void testSymmetryOfGreatestSubtype()
public void testReflexivityOfLeastSupertype()
public void testReflexivityOfGreatestSubtype()
public void testLeastSupertypeUnresolvedNamedType()
public void testLeastSupertypeUnresolvedNamedType2()
public void testLeastSupertypeUnresolvedNamedType3()
public void testSubclassOfUnresolvedNamedType()
public void testSupertypeOfProxiedFunctionTypes()
public void testTypeOfThisIsProxied()
public void testNamedTypeEquals()
public void testNamedTypeEquals2()
public void testForwardDeclaredNamedTypeEquals()
public void testForwardDeclaredNamedType()
public void testGreatestSubtypeSimpleTypes()
public void testSubtypingDerivedExtendsNamedBaseType() throws Exception
public void testNamedSubtypeChain() throws Exception
public void testRecordSubtypeChain() throws Exception
public void testRecordAndObjectChain2() throws Exception
public void testRecordAndObjectChain3() throws Exception
public void testNullableNamedTypeChain() throws Exception
public void testEnumTypeChain() throws Exception
public void testFunctionSubtypeChain() throws Exception
public void testFunctionUnionSubtypeChain() throws Exception
public void testConstructorSubtypeChain() throws Exception
public void testGoogBarSubtypeChain() throws Exception
public void testConstructorWithArgSubtypeChain() throws Exception
public void testInterfaceInstanceSubtypeChain() throws Exception
public void testInterfaceInheritanceSubtypeChain() throws Exception
public void testAnonymousObjectChain() throws Exception
public void testAnonymousEnumElementChain() throws Exception
public void testParameterizedArrayChain() throws Exception
public void testParameterizedArrayChain2() throws Exception
public void testParameterizedObjectChain() throws Exception
public void testMixedParameterizedTypeChain() throws Exception
public void testParameterizedTypeSubtypes()
public void testParameterizedTypeRelations() throws Exception
public void verifySubtypeChain(List<JSType> typeChain) throws Exception
public void verifySubtypeChain(List<JSType> typeChain, boolean checkSubtyping) throws Exception
 JSType getNamedWrapper(String name, JSType jstype)
public void testRestrictedTypeGivenToBoolean()
public void testRegisterProperty()
public void testRegisterPropertyMemoization()
public void testGreatestSubtypeWithProperty()
public void testGoodSetPrototypeBasedOn()
public void testLateSetPrototypeBasedOn()
public void testGetTypeUnderEquality1()
public void testGetTypesUnderEquality2()
public void testGetTypesUnderEquality3()
public void testGetTypesUnderEquality4()
public void testGetTypesUnderEquality5()
public void testGetTypesUnderEquality6()
private void testGetTypeUnderEquality(JSType t1, JSType t2, JSType t1Eq, JSType t2Eq)
public void testGetTypesUnderInequality1()
public void testGetTypesUnderInequality2()
public void testGetTypesUnderInequality3()
public void testGetTypesUnderInequality4() throws Exception
private void testGetTypesUnderInequality(JSType t1, JSType t2, JSType t1Eq, JSType t2Eq)
public void testCreateRecordType() throws Exception
public void testCreateOptionalType() throws Exception
public void assertUnionContains(UnionType union, JSType type)
public void testCreateAnonymousObjectType() throws Exception
public void testCreateAnonymousObjectType2() throws Exception
public void testCreateObjectType() throws Exception
public void testBug903110() throws Exception
public void testBug904123() throws Exception
private void assertTypeCanAssignToItself(JSType type)
public void testHasOwnProperty() throws Exception
public void testNamedTypeHasOwnProperty() throws Exception
public void testInterfaceHasOwnProperty() throws Exception
public void testGetPropertyNames() throws Exception
public void testGetAndSetJSDocInfoWithNamedType() throws Exception
public void testGetAndSetJSDocInfoWithObjectTypes() throws Exception
public void testGetAndSetJSDocInfoWithNoType() throws Exception
public void testObjectGetSubTypes() throws Exception
public void testImplementingType() throws Exception
public void testIsTemplatedType() throws Exception
public void testTemplatizedType() throws Exception
public void testPartiallyTemplatizedType() throws Exception
public void testInvalidTemplatizedType() throws Exception
public void testCanCastTo()
private static boolean containsType(Iterable<? extends JSType> types, JSType type)
private static boolean assertTypeListEquals(Iterable<? extends JSType> typeListA, Iterable<? extends JSType> typeListB)
private ArrowType createArrowType(Node params)
FunctionType dateMethod
FunctionType functionType
NamedType unresolvedNamedType
FunctionType googBar
FunctionType googSubBar
FunctionType googSubSubBar
ObjectType googBarInst
ObjectType googSubBarInst
ObjectType googSubSubBarInst
NamedType namedGoogBar
ObjectType subclassOfUnresolvedNamedType
FunctionType subclassCtor
FunctionType interfaceType
ObjectType interfaceInstType
FunctionType subInterfaceType
ObjectType subInterfaceInstType
JSType recordType
EnumType enumType
EnumElementType elementsType
NamedType forwardDeclaredNamedType
StaticScope<JSType> EMPTY_SCOPE=Optional[MapBasedScope.emptyScope()]
List<JSType> types
