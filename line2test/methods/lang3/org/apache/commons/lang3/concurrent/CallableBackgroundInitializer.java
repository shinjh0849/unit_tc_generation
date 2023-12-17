public CallableBackgroundInitializer(final Callable<T> call) { [EOL]     checkCallable(call); [EOL]     callable = call; [EOL] } <line_num>: 79,82
public CallableBackgroundInitializer(final Callable<T> call, final ExecutorService exec) { [EOL]     super(exec); [EOL]     checkCallable(call); [EOL]     callable = call; [EOL] } <line_num>: 95,99
@Override [EOL] protected T initialize() throws Exception { [EOL]     return callable.call(); [EOL] } <line_num>: 109,112
private void checkCallable(final Callable<T> call) { [EOL]     if (call == null) { [EOL]         throw new IllegalArgumentException("Callable must not be null!"); [EOL]     } [EOL] } <line_num>: 121,125
