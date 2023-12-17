public ChainableReverseAbstractInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry)
 RestrictByOneTypeOfResultVisitor(String value, boolean resultEqualsValue)
public ChainableReverseAbstractInterpreter append(ChainableReverseAbstractInterpreter lastLink)
public ChainableReverseAbstractInterpreter getFirst()
protected FlowScope firstPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome)
protected FlowScope nextPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome)
protected JSType getTypeIfRefinable(Node node, FlowScope scope)
protected void declareNameInScope(FlowScope scope, Node node, JSType type)
public JSType caseEnumElementType(EnumElementType enumElementType)
public JSType caseAllType()
public JSType caseNoObjectType()
public JSType caseNoType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseUnionType(UnionType type)
public JSType caseUnknownType()
public JSType caseVoidType()
public JSType caseParameterizedType(ParameterizedType type)
public JSType caseTemplateType(TemplateType templateType)
public JSType caseEnumElementType(EnumElementType enumElementType)
public JSType caseAllType()
public JSType caseNoObjectType()
public JSType caseNoType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseUnionType(UnionType type)
public JSType caseUnknownType()
public JSType caseVoidType()
public JSType caseParameterizedType(ParameterizedType type)
public JSType caseTemplateType(TemplateType templateType)
protected abstract JSType caseTopType(JSType topType)
public JSType caseAllType()
public JSType caseUnknownType()
public JSType caseUnionType(UnionType type)
public JSType caseNoType()
public JSType caseEnumElementType(EnumElementType enumElementType)
public JSType caseParameterizedType(ParameterizedType type)
public JSType caseTemplateType(TemplateType templateType)
public JSType caseNoObjectType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseVoidType()
protected JSType caseTopType(JSType topType)
public JSType caseNoObjectType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseVoidType()
private boolean matchesExpectation(String result)
protected JSType caseTopType(JSType topType)
public JSType caseNoObjectType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseVoidType()
protected final JSType getRestrictedWithoutUndefined(JSType type)
protected final JSType getRestrictedWithoutNull(JSType type)
 JSType getRestrictedByTypeOfResult(JSType type, String value, boolean resultEqualsValue)
 JSType getNativeType(JSTypeNative typeId)
private JSType getNativeTypeForTypeOf(String value)
CodingConvention convention
JSTypeRegistry typeRegistry
ChainableReverseAbstractInterpreter firstLink
ChainableReverseAbstractInterpreter nextLink
Visitor<JSType> restrictUndefinedVisitor=Optional[new Visitor<JSType>() {

    @Override
    public JSType caseEnumElementType(EnumElementType enumElementType) {
        JSType type = enumElementType.getPrimitiveType().visit(this);
        if (type != null && enumElementType.getPrimitiveType().isEquivalentTo(type)) {
            return enumElementType;
        } else {
            return type;
        }
    }

    @Override
    public JSType caseAllType() {
        return typeRegistry.createUnionType(OBJECT_TYPE, NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE, NULL_TYPE);
    }

    @Override
    public JSType caseNoObjectType() {
        return getNativeType(NO_OBJECT_TYPE);
    }

    @Override
    public JSType caseNoType() {
        return getNativeType(NO_TYPE);
    }

    @Override
    public JSType caseBooleanType() {
        return getNativeType(BOOLEAN_TYPE);
    }

    @Override
    public JSType caseFunctionType(FunctionType type) {
        return type;
    }

    @Override
    public JSType caseNullType() {
        return getNativeType(NULL_TYPE);
    }

    @Override
    public JSType caseNumberType() {
        return getNativeType(NUMBER_TYPE);
    }

    @Override
    public JSType caseObjectType(ObjectType type) {
        return type;
    }

    @Override
    public JSType caseStringType() {
        return getNativeType(STRING_TYPE);
    }

    @Override
    public JSType caseUnionType(UnionType type) {
        return type.getRestrictedUnion(getNativeType(VOID_TYPE));
    }

    @Override
    public JSType caseUnknownType() {
        return getNativeType(UNKNOWN_TYPE);
    }

    @Override
    public JSType caseVoidType() {
        return null;
    }

    @Override
    public JSType caseParameterizedType(ParameterizedType type) {
        return caseObjectType(type);
    }

    @Override
    public JSType caseTemplateType(TemplateType templateType) {
        return caseObjectType(templateType);
    }
}]
Visitor<JSType> restrictNullVisitor=Optional[new Visitor<JSType>() {

    @Override
    public JSType caseEnumElementType(EnumElementType enumElementType) {
        JSType type = enumElementType.getPrimitiveType().visit(this);
        if (type != null && enumElementType.getPrimitiveType().isEquivalentTo(type)) {
            return enumElementType;
        } else {
            return type;
        }
    }

    @Override
    public JSType caseAllType() {
        return typeRegistry.createUnionType(OBJECT_TYPE, NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE, VOID_TYPE);
    }

    @Override
    public JSType caseNoObjectType() {
        return getNativeType(NO_OBJECT_TYPE);
    }

    @Override
    public JSType caseNoType() {
        return getNativeType(NO_TYPE);
    }

    @Override
    public JSType caseBooleanType() {
        return getNativeType(BOOLEAN_TYPE);
    }

    @Override
    public JSType caseFunctionType(FunctionType type) {
        return type;
    }

    @Override
    public JSType caseNullType() {
        return null;
    }

    @Override
    public JSType caseNumberType() {
        return getNativeType(NUMBER_TYPE);
    }

    @Override
    public JSType caseObjectType(ObjectType type) {
        return type;
    }

    @Override
    public JSType caseStringType() {
        return getNativeType(STRING_TYPE);
    }

    @Override
    public JSType caseUnionType(UnionType type) {
        return type.getRestrictedUnion(getNativeType(NULL_TYPE));
    }

    @Override
    public JSType caseUnknownType() {
        return getNativeType(UNKNOWN_TYPE);
    }

    @Override
    public JSType caseVoidType() {
        return getNativeType(VOID_TYPE);
    }

    @Override
    public JSType caseParameterizedType(ParameterizedType type) {
        return caseObjectType(type);
    }

    @Override
    public JSType caseTemplateType(TemplateType templateType) {
        return caseObjectType(templateType);
    }
}]
