protected StrLookup() { [EOL]     super(); [EOL] } <line_num>: 104,106
MapStrLookup(final Map<String, V> map) { [EOL]     this.map = map; [EOL] } <line_num>: 147,149
public static StrLookup<?> noneLookup() { [EOL]     return NONE_LOOKUP; [EOL] } <line_num>: 67,69
public static StrLookup<String> systemPropertiesLookup() { [EOL]     return SYSTEM_PROPERTIES_LOOKUP; [EOL] } <line_num>: 82,84
public static <V> StrLookup<V> mapLookup(final Map<String, V> map) { [EOL]     return new MapStrLookup<V>(map); [EOL] } <line_num>: 96,98
public abstract String lookup(String key); <line_num>: 131,131
@Override [EOL] public String lookup(final String key) { [EOL]     if (map == null) { [EOL]         return null; [EOL]     } [EOL]     final Object obj = map.get(key); [EOL]     if (obj == null) { [EOL]         return null; [EOL]     } [EOL]     return obj.toString(); [EOL] } <line_num>: 160,170
