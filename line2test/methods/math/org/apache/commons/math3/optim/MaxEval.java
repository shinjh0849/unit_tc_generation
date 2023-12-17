public MaxEval(int max) { [EOL]     if (max <= 0) { [EOL]         throw new NotStrictlyPositiveException(max); [EOL]     } [EOL]     maxEval = max; [EOL] } <line_num>: 35,41
public int getMaxEval() { [EOL]     return maxEval; [EOL] } <line_num>: 48,50
public static MaxEval unlimited() { [EOL]     return new MaxEval(Integer.MAX_VALUE); [EOL] } <line_num>: 59,61
