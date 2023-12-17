public MaxIter(int max) { [EOL]     if (max <= 0) { [EOL]         throw new NotStrictlyPositiveException(max); [EOL]     } [EOL]     maxIter = max; [EOL] } <line_num>: 35,41
public int getMaxIter() { [EOL]     return maxIter; [EOL] } <line_num>: 48,50
public static MaxIter unlimited() { [EOL]     return new MaxIter(Integer.MAX_VALUE); [EOL] } <line_num>: 59,61
