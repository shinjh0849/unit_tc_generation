public IterationManager(final int maxIterations) { [EOL]     this.iterations = new Incrementor(maxIterations); [EOL]     this.listeners = new CopyOnWriteArrayList<IterationListener>(); [EOL] } <line_num>: 45,48
public IterationManager(final int maxIterations, final Incrementor.MaxCountExceededCallback callBack) { [EOL]     this.iterations = new Incrementor(maxIterations, callBack); [EOL]     this.listeners = new CopyOnWriteArrayList<IterationListener>(); [EOL] } <line_num>: 59,63
public void addIterationListener(final IterationListener listener) { [EOL]     listeners.add(listener); [EOL] } <line_num>: 70,72
public void fireInitializationEvent(final IterationEvent e) { [EOL]     for (IterationListener l : listeners) { [EOL]         l.initializationPerformed(e); [EOL]     } [EOL] } <line_num>: 80,84
public void fireIterationPerformedEvent(final IterationEvent e) { [EOL]     for (IterationListener l : listeners) { [EOL]         l.iterationPerformed(e); [EOL]     } [EOL] } <line_num>: 92,96
public void fireIterationStartedEvent(final IterationEvent e) { [EOL]     for (IterationListener l : listeners) { [EOL]         l.iterationStarted(e); [EOL]     } [EOL] } <line_num>: 104,108
public void fireTerminationEvent(final IterationEvent e) { [EOL]     for (IterationListener l : listeners) { [EOL]         l.terminationPerformed(e); [EOL]     } [EOL] } <line_num>: 116,120
public int getIterations() { [EOL]     return iterations.getCount(); [EOL] } <line_num>: 128,130
public int getMaxIterations() { [EOL]     return iterations.getMaximalCount(); [EOL] } <line_num>: 137,139
public void incrementIterationCount() throws MaxCountExceededException { [EOL]     iterations.incrementCount(); [EOL] } <line_num>: 149,152
public void removeIterationListener(final IterationListener listener) { [EOL]     listeners.remove(listener); [EOL] } <line_num>: 162,164
public void resetIterationCount() { [EOL]     iterations.resetCount(); [EOL] } <line_num>: 170,172
