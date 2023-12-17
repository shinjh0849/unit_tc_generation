public SplitSubHyperplane(final SubHyperplane<U> plus, final SubHyperplane<U> minus) { [EOL]     this.plus = plus; [EOL]     this.minus = minus; [EOL] } <line_num>: 103,107
SubHyperplane<S> copySelf(); <line_num>: 45,45
Hyperplane<S> getHyperplane(); <line_num>: 50,50
boolean isEmpty(); <line_num>: 55,55
double getSize(); <line_num>: 61,61
Side side(Hyperplane<S> hyperplane); <line_num>: 69,69
SplitSubHyperplane<S> split(Hyperplane<S> hyperplane); <line_num>: 77,77
SubHyperplane<S> reunite(SubHyperplane<S> other); <line_num>: 84,84
public SubHyperplane<U> getPlus() { [EOL]     return plus; [EOL] } <line_num>: 112,114
public SubHyperplane<U> getMinus() { [EOL]     return minus; [EOL] } <line_num>: 119,121
