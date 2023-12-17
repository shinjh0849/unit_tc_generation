public ChainableReverseAbstractInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry) { [EOL]     Preconditions.checkNotNull(convention); [EOL]     this.convention = convention; [EOL]     this.typeRegistry = typeRegistry; [EOL]     firstLink = this; [EOL]     nextLink = null; [EOL] } <line_num>: 63,70
RestrictByOneTypeOfResultVisitor(String value, boolean resultEqualsValue) { [EOL]     this.value = value; [EOL]     this.resultEqualsValue = resultEqualsValue; [EOL] } <line_num>: 557,560
public ChainableReverseAbstractInterpreter append(ChainableReverseAbstractInterpreter lastLink) { [EOL]     Preconditions.checkArgument(lastLink.nextLink == null); [EOL]     this.nextLink = lastLink; [EOL]     lastLink.firstLink = this.firstLink; [EOL]     return lastLink; [EOL] } <line_num>: 80,86
public ChainableReverseAbstractInterpreter getFirst() { [EOL]     return firstLink; [EOL] } <line_num>: 91,93
protected FlowScope firstPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome) { [EOL]     return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome); [EOL] } <line_num>: 98,102
protected FlowScope nextPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome) { [EOL]     return nextLink != null ? nextLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome) : blindScope; [EOL] } <line_num>: 108,112
protected JSType getTypeIfRefinable(Node node, FlowScope scope) { [EOL]     switch(node.getType()) { [EOL]         case Token.NAME: [EOL]             StaticSlot<JSType> nameVar = scope.getSlot(node.getString()); [EOL]             if (nameVar != null) { [EOL]                 JSType nameVarType = nameVar.getType(); [EOL]                 if (nameVarType == null) { [EOL]                     nameVarType = node.getJSType(); [EOL]                 } [EOL]                 return nameVarType; [EOL]             } [EOL]             return null; [EOL]         case Token.GETPROP: [EOL]             String qualifiedName = node.getQualifiedName(); [EOL]             if (qualifiedName == null) { [EOL]                 return null; [EOL]             } [EOL]             StaticSlot<JSType> propVar = scope.getSlot(qualifiedName); [EOL]             JSType propVarType = null; [EOL]             if (propVar != null) { [EOL]                 propVarType = propVar.getType(); [EOL]             } [EOL]             if (propVarType == null) { [EOL]                 propVarType = node.getJSType(); [EOL]             } [EOL]             if (propVarType == null) { [EOL]                 propVarType = getNativeType(UNKNOWN_TYPE); [EOL]             } [EOL]             return propVarType; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 119,151
protected void declareNameInScope(FlowScope scope, Node node, JSType type) { [EOL]     switch(node.getType()) { [EOL]         case Token.NAME: [EOL]             scope.inferSlotType(node.getString(), type); [EOL]             break; [EOL]         case Token.GETPROP: [EOL]             String qualifiedName = node.getQualifiedName(); [EOL]             Preconditions.checkNotNull(qualifiedName); [EOL]             JSType origType = node.getJSType(); [EOL]             origType = origType == null ? getNativeType(UNKNOWN_TYPE) : origType; [EOL]             scope.inferQualifiedSlot(node, qualifiedName, origType, type); [EOL]             break; [EOL]         case Token.THIS: [EOL]             break; [EOL]         default: [EOL]             throw new IllegalArgumentException("Node cannot be refined. \n" + node.toStringTree()); [EOL]     } [EOL] } <line_num>: 158,181
@Override [EOL] public JSType caseEnumElementType(EnumElementType enumElementType) { [EOL]     JSType type = enumElementType.getPrimitiveType().visit(this); [EOL]     if (type != null && enumElementType.getPrimitiveType().isEquivalentTo(type)) { [EOL]         return enumElementType; [EOL]     } else { [EOL]         return type; [EOL]     } [EOL] } <line_num>: 188,196
@Override [EOL] public JSType caseAllType() { [EOL]     return typeRegistry.createUnionType(OBJECT_TYPE, NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE, NULL_TYPE); [EOL] } <line_num>: 198,202
@Override [EOL] public JSType caseNoObjectType() { [EOL]     return getNativeType(NO_OBJECT_TYPE); [EOL] } <line_num>: 204,207
@Override [EOL] public JSType caseNoType() { [EOL]     return getNativeType(NO_TYPE); [EOL] } <line_num>: 209,212
@Override [EOL] public JSType caseBooleanType() { [EOL]     return getNativeType(BOOLEAN_TYPE); [EOL] } <line_num>: 214,217
@Override [EOL] public JSType caseFunctionType(FunctionType type) { [EOL]     return type; [EOL] } <line_num>: 219,222
@Override [EOL] public JSType caseNullType() { [EOL]     return getNativeType(NULL_TYPE); [EOL] } <line_num>: 224,227
@Override [EOL] public JSType caseNumberType() { [EOL]     return getNativeType(NUMBER_TYPE); [EOL] } <line_num>: 229,232
@Override [EOL] public JSType caseObjectType(ObjectType type) { [EOL]     return type; [EOL] } <line_num>: 234,237
@Override [EOL] public JSType caseStringType() { [EOL]     return getNativeType(STRING_TYPE); [EOL] } <line_num>: 239,242
@Override [EOL] public JSType caseUnionType(UnionType type) { [EOL]     return type.getRestrictedUnion(getNativeType(VOID_TYPE)); [EOL] } <line_num>: 244,247
@Override [EOL] public JSType caseUnknownType() { [EOL]     return getNativeType(UNKNOWN_TYPE); [EOL] } <line_num>: 249,252
@Override [EOL] public JSType caseVoidType() { [EOL]     return null; [EOL] } <line_num>: 254,257
@Override [EOL] public JSType caseParameterizedType(ParameterizedType type) { [EOL]     return caseObjectType(type); [EOL] } <line_num>: 259,262
@Override [EOL] public JSType caseTemplateType(TemplateType templateType) { [EOL]     return caseObjectType(templateType); [EOL] } <line_num>: 264,267
@Override [EOL] public JSType caseEnumElementType(EnumElementType enumElementType) { [EOL]     JSType type = enumElementType.getPrimitiveType().visit(this); [EOL]     if (type != null && enumElementType.getPrimitiveType().isEquivalentTo(type)) { [EOL]         return enumElementType; [EOL]     } else { [EOL]         return type; [EOL]     } [EOL] } <line_num>: 276,285
@Override [EOL] public JSType caseAllType() { [EOL]     return typeRegistry.createUnionType(OBJECT_TYPE, NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE, VOID_TYPE); [EOL] } <line_num>: 287,291
@Override [EOL] public JSType caseNoObjectType() { [EOL]     return getNativeType(NO_OBJECT_TYPE); [EOL] } <line_num>: 293,296
@Override [EOL] public JSType caseNoType() { [EOL]     return getNativeType(NO_TYPE); [EOL] } <line_num>: 298,301
@Override [EOL] public JSType caseBooleanType() { [EOL]     return getNativeType(BOOLEAN_TYPE); [EOL] } <line_num>: 303,306
@Override [EOL] public JSType caseFunctionType(FunctionType type) { [EOL]     return type; [EOL] } <line_num>: 308,311
@Override [EOL] public JSType caseNullType() { [EOL]     return null; [EOL] } <line_num>: 313,316
@Override [EOL] public JSType caseNumberType() { [EOL]     return getNativeType(NUMBER_TYPE); [EOL] } <line_num>: 318,321
@Override [EOL] public JSType caseObjectType(ObjectType type) { [EOL]     return type; [EOL] } <line_num>: 323,326
@Override [EOL] public JSType caseStringType() { [EOL]     return getNativeType(STRING_TYPE); [EOL] } <line_num>: 328,331
@Override [EOL] public JSType caseUnionType(UnionType type) { [EOL]     return type.getRestrictedUnion(getNativeType(NULL_TYPE)); [EOL] } <line_num>: 333,336
@Override [EOL] public JSType caseUnknownType() { [EOL]     return getNativeType(UNKNOWN_TYPE); [EOL] } <line_num>: 338,341
@Override [EOL] public JSType caseVoidType() { [EOL]     return getNativeType(VOID_TYPE); [EOL] } <line_num>: 343,346
@Override [EOL] public JSType caseParameterizedType(ParameterizedType type) { [EOL]     return caseObjectType(type); [EOL] } <line_num>: 348,351
@Override [EOL] public JSType caseTemplateType(TemplateType templateType) { [EOL]     return caseObjectType(templateType); [EOL] } <line_num>: 353,356
protected abstract JSType caseTopType(JSType topType); <line_num>: 374,374
@Override [EOL] public JSType caseAllType() { [EOL]     return caseTopType(getNativeType(ALL_TYPE)); [EOL] } <line_num>: 376,379
@Override [EOL] public JSType caseUnknownType() { [EOL]     return caseTopType(getNativeType(CHECKED_UNKNOWN_TYPE)); [EOL] } <line_num>: 381,384
@Override [EOL] public JSType caseUnionType(UnionType type) { [EOL]     JSType restricted = null; [EOL]     for (JSType alternate : type.getAlternates()) { [EOL]         JSType restrictedAlternate = alternate.visit(this); [EOL]         if (restrictedAlternate != null) { [EOL]             if (restricted == null) { [EOL]                 restricted = restrictedAlternate; [EOL]             } else { [EOL]                 restricted = restrictedAlternate.getLeastSupertype(restricted); [EOL]             } [EOL]         } [EOL]     } [EOL]     return restricted; [EOL] } <line_num>: 386,400
@Override [EOL] public JSType caseNoType() { [EOL]     return getNativeType(NO_TYPE); [EOL] } <line_num>: 402,405
@Override [EOL] public JSType caseEnumElementType(EnumElementType enumElementType) { [EOL]     JSType type = enumElementType.getPrimitiveType().visit(this); [EOL]     if (type != null && enumElementType.getPrimitiveType().isEquivalentTo(type)) { [EOL]         return enumElementType; [EOL]     } else { [EOL]         return type; [EOL]     } [EOL] } <line_num>: 407,425
@Override [EOL] public JSType caseParameterizedType(ParameterizedType type) { [EOL]     return caseObjectType(type); [EOL] } <line_num>: 427,430
@Override [EOL] public JSType caseTemplateType(TemplateType templateType) { [EOL]     return caseObjectType(templateType); [EOL] } <line_num>: 432,435
@Override [EOL] public JSType caseNoObjectType() { [EOL]     return null; [EOL] } <line_num>: 445,448
@Override [EOL] public JSType caseBooleanType() { [EOL]     return null; [EOL] } <line_num>: 450,453
@Override [EOL] public JSType caseFunctionType(FunctionType type) { [EOL]     return null; [EOL] } <line_num>: 455,458
@Override [EOL] public JSType caseNullType() { [EOL]     return null; [EOL] } <line_num>: 460,463
@Override [EOL] public JSType caseNumberType() { [EOL]     return null; [EOL] } <line_num>: 465,468
@Override [EOL] public JSType caseObjectType(ObjectType type) { [EOL]     return null; [EOL] } <line_num>: 470,473
@Override [EOL] public JSType caseStringType() { [EOL]     return null; [EOL] } <line_num>: 475,478
@Override [EOL] public JSType caseVoidType() { [EOL]     return null; [EOL] } <line_num>: 480,483
@Override [EOL] protected JSType caseTopType(JSType topType) { [EOL]     return topType; [EOL] } <line_num>: 493,496
@Override [EOL] public JSType caseNoObjectType() { [EOL]     return getNativeType(NO_OBJECT_TYPE); [EOL] } <line_num>: 498,501
@Override [EOL] public JSType caseBooleanType() { [EOL]     return getNativeType(BOOLEAN_TYPE); [EOL] } <line_num>: 503,506
@Override [EOL] public JSType caseFunctionType(FunctionType type) { [EOL]     return type; [EOL] } <line_num>: 508,511
@Override [EOL] public JSType caseNullType() { [EOL]     return getNativeType(NULL_TYPE); [EOL] } <line_num>: 513,516
@Override [EOL] public JSType caseNumberType() { [EOL]     return getNativeType(NUMBER_TYPE); [EOL] } <line_num>: 518,521
@Override [EOL] public JSType caseObjectType(ObjectType type) { [EOL]     return type; [EOL] } <line_num>: 523,526
@Override [EOL] public JSType caseStringType() { [EOL]     return getNativeType(STRING_TYPE); [EOL] } <line_num>: 528,531
@Override [EOL] public JSType caseVoidType() { [EOL]     return getNativeType(VOID_TYPE); [EOL] } <line_num>: 533,536
private boolean matchesExpectation(String result) { [EOL]     return result.equals(value) == resultEqualsValue; [EOL] } <line_num>: 567,569
@Override [EOL] protected JSType caseTopType(JSType topType) { [EOL]     JSType result = topType; [EOL]     if (resultEqualsValue) { [EOL]         JSType typeByName = getNativeTypeForTypeOf(value); [EOL]         if (typeByName != null) { [EOL]             result = typeByName; [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 571,581
@Override [EOL] public JSType caseNoObjectType() { [EOL]     return (value.equals("object") || value.equals("function")) == resultEqualsValue ? getNativeType(NO_OBJECT_TYPE) : null; [EOL] } <line_num>: 583,587
@Override [EOL] public JSType caseBooleanType() { [EOL]     return matchesExpectation("boolean") ? getNativeType(BOOLEAN_TYPE) : null; [EOL] } <line_num>: 589,592
@Override [EOL] public JSType caseFunctionType(FunctionType type) { [EOL]     return matchesExpectation("function") ? type : null; [EOL] } <line_num>: 594,597
@Override [EOL] public JSType caseNullType() { [EOL]     return matchesExpectation("object") ? getNativeType(NULL_TYPE) : null; [EOL] } <line_num>: 599,602
@Override [EOL] public JSType caseNumberType() { [EOL]     return matchesExpectation("number") ? getNativeType(NUMBER_TYPE) : null; [EOL] } <line_num>: 604,607
@Override [EOL] public JSType caseObjectType(ObjectType type) { [EOL]     if (value.equals("function")) { [EOL]         JSType ctorType = getNativeType(U2U_CONSTRUCTOR_TYPE); [EOL]         if (resultEqualsValue) { [EOL]             return ctorType.getGreatestSubtype(type); [EOL]         } else { [EOL]             return type.isSubtype(ctorType) ? null : type; [EOL]         } [EOL]     } [EOL]     return matchesExpectation("object") ? type : null; [EOL] } <line_num>: 609,622
@Override [EOL] public JSType caseStringType() { [EOL]     return matchesExpectation("string") ? getNativeType(STRING_TYPE) : null; [EOL] } <line_num>: 624,627
@Override [EOL] public JSType caseVoidType() { [EOL]     return matchesExpectation("undefined") ? getNativeType(VOID_TYPE) : null; [EOL] } <line_num>: 629,632
protected final JSType getRestrictedWithoutUndefined(JSType type) { [EOL]     return type == null ? null : type.visit(restrictUndefinedVisitor); [EOL] } <line_num>: 638,640
protected final JSType getRestrictedWithoutNull(JSType type) { [EOL]     return type == null ? null : type.visit(restrictNullVisitor); [EOL] } <line_num>: 645,647
JSType getRestrictedByTypeOfResult(JSType type, String value, boolean resultEqualsValue) { [EOL]     if (type == null) { [EOL]         if (resultEqualsValue) { [EOL]             JSType result = getNativeTypeForTypeOf(value); [EOL]             return result == null ? getNativeType(CHECKED_UNKNOWN_TYPE) : result; [EOL]         } else { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     return type.visit(new RestrictByOneTypeOfResultVisitor(value, resultEqualsValue)); [EOL] } <line_num>: 676,688
JSType getNativeType(JSTypeNative typeId) { [EOL]     return typeRegistry.getNativeType(typeId); [EOL] } <line_num>: 690,692
private JSType getNativeTypeForTypeOf(String value) { [EOL]     if (value.equals("number")) { [EOL]         return getNativeType(NUMBER_TYPE); [EOL]     } else if (value.equals("boolean")) { [EOL]         return getNativeType(BOOLEAN_TYPE); [EOL]     } else if (value.equals("string")) { [EOL]         return getNativeType(STRING_TYPE); [EOL]     } else if (value.equals("undefined")) { [EOL]         return getNativeType(VOID_TYPE); [EOL]     } else if (value.equals("function")) { [EOL]         return getNativeType(U2U_CONSTRUCTOR_TYPE); [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 703,717
