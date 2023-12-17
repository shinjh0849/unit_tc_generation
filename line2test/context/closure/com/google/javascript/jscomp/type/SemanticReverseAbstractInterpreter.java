public SemanticReverseAbstractInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry)
 RestrictByTrueInstanceOfResultVisitor(ObjectType target)
 RestrictByFalseInstanceOfResultVisitor(ObjectType target)
public TypePair apply(TypePair p)
public TypePair apply(TypePair p)
public TypePair apply(TypePair p)
public TypePair apply(TypePair p)
public TypePair apply(TypePair p)
public FlowScope getPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome)
private FlowScope caseEquality(Node condition, FlowScope blindScope, Function<TypePair, TypePair> merging)
private FlowScope caseEquality(Node left, Node right, FlowScope blindScope, Function<TypePair, TypePair> merging)
private FlowScope caseAndOrNotShortCircuiting(Node left, Node right, FlowScope blindScope, boolean condition)
private FlowScope caseAndOrMaybeShortCircuiting(Node left, Node right, FlowScope blindScope, boolean condition)
private FlowScope maybeRestrictName(FlowScope blindScope, Node node, JSType originalType, JSType restrictedType)
private FlowScope maybeRestrictTwoNames(FlowScope blindScope, Node left, JSType originalLeftType, JSType restrictedLeftType, Node right, JSType originalRightType, JSType restrictedRightType)
private FlowScope caseNameOrGetProp(Node name, FlowScope blindScope, boolean outcome)
private FlowScope caseTypeOf(Node node, JSType type, String value, boolean resultEqualsValue, FlowScope blindScope)
private FlowScope caseInstanceOf(Node left, Node right, FlowScope blindScope, boolean outcome)
private FlowScope caseIn(Node object, String propertyName, FlowScope blindScope)
protected JSType caseTopType(JSType type)
public JSType caseUnknownType()
public JSType caseObjectType(ObjectType type)
public JSType caseUnionType(UnionType type)
public JSType caseFunctionType(FunctionType type)
private JSType applyCommonRestriction(JSType type)
public JSType caseObjectType(ObjectType type)
public JSType caseUnionType(UnionType type)
public JSType caseFunctionType(FunctionType type)
Function<TypePair, TypePair> EQ=Optional[new Function<TypePair, TypePair>() {

    @Override
    public TypePair apply(TypePair p) {
        if (p.typeA == null || p.typeB == null) {
            return null;
        }
        return p.typeA.getTypesUnderEquality(p.typeB);
    }
}]
Function<TypePair, TypePair> NE=Optional[new Function<TypePair, TypePair>() {

    @Override
    public TypePair apply(TypePair p) {
        if (p.typeA == null || p.typeB == null) {
            return null;
        }
        return p.typeA.getTypesUnderInequality(p.typeB);
    }
}]
Function<TypePair, TypePair> SHEQ=Optional[new Function<TypePair, TypePair>() {

    @Override
    public TypePair apply(TypePair p) {
        if (p.typeA == null || p.typeB == null) {
            return null;
        }
        return p.typeA.getTypesUnderShallowEquality(p.typeB);
    }
}]
Function<TypePair, TypePair> SHNE=Optional[new Function<TypePair, TypePair>() {

    @Override
    public TypePair apply(TypePair p) {
        if (p.typeA == null || p.typeB == null) {
            return null;
        }
        return p.typeA.getTypesUnderShallowInequality(p.typeB);
    }
}]
Function<TypePair, TypePair> INEQ=Optional[new Function<TypePair, TypePair>() {

    @Override
    public TypePair apply(TypePair p) {
        return new TypePair(getRestrictedWithoutUndefined(p.typeA), getRestrictedWithoutUndefined(p.typeB));
    }
}]
