public Incrementor() { [EOL]     this(0); [EOL] } <line_num>: 52,54
public Incrementor(int max) { [EOL]     this(max, new MaxCountExceededCallback() { [EOL]  [EOL]         public void trigger(int max) throws MaxCountExceededException { [EOL]             throw new MaxCountExceededException(max); [EOL]         } [EOL]     }); [EOL] } <line_num>: 61,69
public Incrementor(int max, MaxCountExceededCallback cb) throws NullArgumentException { [EOL]     if (cb == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     maximalCount = max; [EOL]     maxCountCallback = cb; [EOL] } <line_num>: 79,86
public void trigger(int max) throws MaxCountExceededException { [EOL]     throw new MaxCountExceededException(max); [EOL] } <line_num>: 65,67
public void setMaximalCount(int max) { [EOL]     maximalCount = max; [EOL] } <line_num>: 95,97
public int getMaximalCount() { [EOL]     return maximalCount; [EOL] } <line_num>: 104,106
public int getCount() { [EOL]     return count; [EOL] } <line_num>: 113,115
public boolean canIncrement() { [EOL]     return count < maximalCount; [EOL] } <line_num>: 124,126
public void incrementCount(int value) throws MaxCountExceededException { [EOL]     for (int i = 0; i < value; i++) { [EOL]         incrementCount(); [EOL]     } [EOL] } <line_num>: 135,139
public void incrementCount() throws MaxCountExceededException { [EOL]     if (++count > maximalCount) { [EOL]         maxCountCallback.trigger(maximalCount); [EOL]     } [EOL] } <line_num>: 154,158
public void resetCount() { [EOL]     count = 0; [EOL] } <line_num>: 163,165
void trigger(int maximalCount) throws MaxCountExceededException; <line_num>: 178,178
