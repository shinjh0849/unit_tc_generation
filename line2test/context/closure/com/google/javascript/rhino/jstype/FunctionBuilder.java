public FunctionBuilder(JSTypeRegistry registry)
public FunctionBuilder withName(String name)
public FunctionBuilder withSourceNode(Node sourceNode)
public FunctionBuilder withParams(FunctionParamBuilder params)
public FunctionBuilder withParamsNode(Node parametersNode)
public FunctionBuilder withReturnType(JSType returnType)
public FunctionBuilder withReturnType(JSType returnType, boolean inferred)
public FunctionBuilder withInferredReturnType(JSType returnType)
public FunctionBuilder withTypeOfThis(JSType typeOfThis)
public FunctionBuilder withTemplateKeys(ImmutableList<String> templateKeys)
public FunctionBuilder forConstructor()
public FunctionBuilder setIsConstructor(boolean isConstructor)
 FunctionBuilder forNativeType()
public FunctionBuilder copyFromOtherFunction(FunctionType otherType)
public FunctionType build()
JSTypeRegistry registry
String name=Optional[null]
Node sourceNode=Optional[null]
Node parametersNode=Optional[null]
JSType returnType=Optional[null]
JSType typeOfThis=Optional[null]
ImmutableList<String> templateKeys=Optional[ImmutableList.of()]
boolean inferredReturnType=Optional[false]
boolean isConstructor=Optional[false]
boolean isNativeType=Optional[false]
