public FunctionBuilder(JSTypeRegistry registry) { [EOL]     this.registry = registry; [EOL] } <line_num>: 65,67
public FunctionBuilder withName(String name) { [EOL]     this.name = name; [EOL]     return this; [EOL] } <line_num>: 70,73
public FunctionBuilder withSourceNode(Node sourceNode) { [EOL]     this.sourceNode = sourceNode; [EOL]     return this; [EOL] } <line_num>: 76,79
public FunctionBuilder withParams(FunctionParamBuilder params) { [EOL]     this.parametersNode = params.build(); [EOL]     return this; [EOL] } <line_num>: 82,85
public FunctionBuilder withParamsNode(Node parametersNode) { [EOL]     this.parametersNode = parametersNode; [EOL]     return this; [EOL] } <line_num>: 90,93
public FunctionBuilder withReturnType(JSType returnType) { [EOL]     this.returnType = returnType; [EOL]     return this; [EOL] } <line_num>: 96,99
public FunctionBuilder withReturnType(JSType returnType, boolean inferred) { [EOL]     this.returnType = returnType; [EOL]     this.inferredReturnType = inferred; [EOL]     return this; [EOL] } <line_num>: 102,106
public FunctionBuilder withInferredReturnType(JSType returnType) { [EOL]     this.returnType = returnType; [EOL]     this.inferredReturnType = true; [EOL]     return this; [EOL] } <line_num>: 109,113
public FunctionBuilder withTypeOfThis(JSType typeOfThis) { [EOL]     this.typeOfThis = typeOfThis; [EOL]     return this; [EOL] } <line_num>: 116,119
public FunctionBuilder withTemplateKeys(ImmutableList<String> templateKeys) { [EOL]     this.templateKeys = templateKeys; [EOL]     return this; [EOL] } <line_num>: 122,126
public FunctionBuilder forConstructor() { [EOL]     this.isConstructor = true; [EOL]     return this; [EOL] } <line_num>: 129,132
public FunctionBuilder setIsConstructor(boolean isConstructor) { [EOL]     this.isConstructor = isConstructor; [EOL]     return this; [EOL] } <line_num>: 135,138
FunctionBuilder forNativeType() { [EOL]     this.isNativeType = true; [EOL]     return this; [EOL] } <line_num>: 141,144
public FunctionBuilder copyFromOtherFunction(FunctionType otherType) { [EOL]     this.name = otherType.getReferenceName(); [EOL]     this.sourceNode = otherType.getSource(); [EOL]     this.parametersNode = otherType.getParametersNode(); [EOL]     this.returnType = otherType.getReturnType(); [EOL]     this.typeOfThis = otherType.getTypeOfThis(); [EOL]     this.templateKeys = otherType.getTemplateKeys(); [EOL]     this.isConstructor = otherType.isConstructor(); [EOL]     this.isNativeType = otherType.isNativeObjectType(); [EOL]     return this; [EOL] } <line_num>: 147,157
public FunctionType build() { [EOL]     return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateKeys, isConstructor, isNativeType); [EOL] } <line_num>: 160,164
