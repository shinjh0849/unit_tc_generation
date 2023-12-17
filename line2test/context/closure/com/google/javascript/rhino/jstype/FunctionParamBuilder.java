public FunctionParamBuilder(JSTypeRegistry registry)
public boolean addRequiredParams(JSType... types)
public boolean addOptionalParams(JSType... types)
public boolean addVarArgs(JSType type)
public Node newParameterFromNode(Node n)
public Node newOptionalParameterFromNode(Node n)
private Node newParameter(JSType type)
public Node build()
private boolean hasOptionalOrVarArgs()
public boolean hasVarArgs()
JSTypeRegistry registry
Node root=Optional[new Node(Token.PARAM_LIST)]
