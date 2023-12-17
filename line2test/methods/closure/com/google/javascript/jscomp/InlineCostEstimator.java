private InlineCostEstimator() { [EOL] } <line_num>: 32,33
CompiledSizeEstimator(int costThreshhold) { [EOL]     this.maxCost = costThreshhold; [EOL] } <line_num>: 61,63
static int getCost(Node root) { [EOL]     return getCost(root, Integer.MAX_VALUE); [EOL] } <line_num>: 38,40
static int getCost(Node root, int costThreshhold) { [EOL]     CompiledSizeEstimator estimator = new CompiledSizeEstimator(costThreshhold); [EOL]     estimator.add(root); [EOL]     return estimator.getCost(); [EOL] } <line_num>: 45,49
void add(Node root) { [EOL]     CodeGenerator cg = CodeGenerator.forCostEstimation(this); [EOL]     cg.add(root); [EOL] } <line_num>: 65,68
int getCost() { [EOL]     return cost; [EOL] } <line_num>: 70,72
@Override [EOL] boolean continueProcessing() { [EOL]     return continueProcessing; [EOL] } <line_num>: 74,77
@Override [EOL] char getLastChar() { [EOL]     return last; [EOL] } <line_num>: 79,82
@Override [EOL] void append(String str) { [EOL]     last = str.charAt(str.length() - 1); [EOL]     cost += str.length(); [EOL]     if (maxCost <= cost) { [EOL]         continueProcessing = false; [EOL]     } [EOL] } <line_num>: 84,91
@Override [EOL] void addIdentifier(String identifier) { [EOL]     add(ESTIMATED_IDENTIFIER); [EOL] } <line_num>: 93,96
@Override [EOL] void addConstant(String newcode) { [EOL]     add("0"); [EOL] } <line_num>: 102,105
