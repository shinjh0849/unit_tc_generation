public ClosureReverseAbstractInterpreter(CodingConvention convention, final JSTypeRegistry typeRegistry)
private TypeRestriction(JSType type, boolean outcome)
protected JSType caseTopType(JSType topType)
public JSType caseObjectType(ObjectType type)
public JSType caseObjectType(ObjectType type)
protected JSType caseTopType(JSType topType)
public JSType caseObjectType(ObjectType type)
public JSType caseFunctionType(FunctionType type)
public JSType caseAllType()
public JSType caseObjectType(ObjectType type)
public JSType caseFunctionType(FunctionType type)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public JSType apply(TypeRestriction p)
public FlowScope getPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome)
private FlowScope restrictParameter(Node parameter, JSType type, FlowScope blindScope, Function<TypeRestriction, JSType> restriction, boolean outcome)
Visitor<JSType> restrictToArrayVisitor=Optional[new RestrictByTrueTypeOfResultVisitor() {

    @Override
    protected JSType caseTopType(JSType topType) {
        // Ideally, we would like to return any subtype of Array.
        // Since that's not possible, we don't restrict the type.
        return topType;
    }

    @Override
    public JSType caseObjectType(ObjectType type) {
        JSType arrayType = getNativeType(ARRAY_TYPE);
        return arrayType.isSubtype(type) ? arrayType : null;
    }
}]
Visitor<JSType> restrictToNotArrayVisitor=Optional[new RestrictByFalseTypeOfResultVisitor() {

    @Override
    public JSType caseObjectType(ObjectType type) {
        return type.isSubtype(getNativeType(ARRAY_TYPE)) ? null : type;
    }
}]
Visitor<JSType> restrictToObjectVisitor=Optional[new RestrictByTrueTypeOfResultVisitor() {

    @Override
    protected JSType caseTopType(JSType topType) {
        return getNativeType(NO_OBJECT_TYPE);
    }

    @Override
    public JSType caseObjectType(ObjectType type) {
        return type;
    }

    @Override
    public JSType caseFunctionType(FunctionType type) {
        return type;
    }
}]
Visitor<JSType> restrictToNotObjectVisitor=Optional[new RestrictByFalseTypeOfResultVisitor() {

    @Override
    public JSType caseAllType() {
        return typeRegistry.createUnionType(getNativeType(NUMBER_STRING_BOOLEAN), getNativeType(NULL_VOID));
    }

    @Override
    public JSType caseObjectType(ObjectType type) {
        return null;
    }

    @Override
    public JSType caseFunctionType(FunctionType type) {
        return null;
    }
}]
Map<String, Function<TypeRestriction, JSType>> restricters
