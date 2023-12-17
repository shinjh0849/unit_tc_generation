private MapperFeature(boolean defaultState) { [EOL]     _defaultState = defaultState; [EOL] } <line_num>: 280,282
@Override [EOL] public boolean enabledByDefault() { [EOL]     return _defaultState; [EOL] } <line_num>: 284,285
@Override [EOL] public int getMask() { [EOL]     return (1 << ordinal()); [EOL] } <line_num>: 287,288
