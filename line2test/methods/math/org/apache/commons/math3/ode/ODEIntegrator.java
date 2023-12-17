String getName(); <line_num>: 39,39
void addStepHandler(StepHandler handler); <line_num>: 49,49
Collection<StepHandler> getStepHandlers(); <line_num>: 57,57
void clearStepHandlers(); <line_num>: 64,64
void addEventHandler(EventHandler handler, double maxCheckInterval, double convergence, int maxIterationCount); <line_num>: 80,81
void addEventHandler(EventHandler handler, double maxCheckInterval, double convergence, int maxIterationCount, UnivariateSolver solver); <line_num>: 96,98
Collection<EventHandler> getEventHandlers(); <line_num>: 105,105
void clearEventHandlers(); <line_num>: 111,111
double getCurrentStepStart(); <line_num>: 122,122
double getCurrentSignedStepsize(); <line_num>: 133,133
void setMaxEvaluations(int maxEvaluations); <line_num>: 143,143
int getMaxEvaluations(); <line_num>: 148,148
int getEvaluations(); <line_num>: 157,157
