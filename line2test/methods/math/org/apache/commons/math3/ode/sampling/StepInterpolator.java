double getPreviousTime(); <line_num>: 55,55
double getCurrentTime(); <line_num>: 61,61
double getInterpolatedTime(); <line_num>: 69,69
void setInterpolatedTime(double time); <line_num>: 83,83
double[] getInterpolatedState() throws MaxCountExceededException; <line_num>: 94,94
double[] getInterpolatedDerivatives() throws MaxCountExceededException; <line_num>: 106,106
double[] getInterpolatedSecondaryState(int index) throws MaxCountExceededException; <line_num>: 124,124
double[] getInterpolatedSecondaryDerivatives(int index) throws MaxCountExceededException; <line_num>: 142,142
boolean isForward(); <line_num>: 153,153
StepInterpolator copy() throws MaxCountExceededException; <line_num>: 164,164
