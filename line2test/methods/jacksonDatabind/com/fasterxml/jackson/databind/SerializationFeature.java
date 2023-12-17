private SerializationFeature(boolean defaultState) { [EOL]     _defaultState = defaultState; [EOL] } <line_num>: 320,322
@Override [EOL] public boolean enabledByDefault() { [EOL]     return _defaultState; [EOL] } <line_num>: 324,325
@Override [EOL] public int getMask() { [EOL]     return (1 << ordinal()); [EOL] } <line_num>: 327,328
