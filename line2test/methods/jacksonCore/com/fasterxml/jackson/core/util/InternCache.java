private InternCache() { [EOL]     super(MAX_ENTRIES, 0.8f, true); [EOL] } <line_num>: 31,33
@Override [EOL] protected boolean removeEldestEntry(Map.Entry<String, String> eldest) { [EOL]     return size() > MAX_ENTRIES; [EOL] } <line_num>: 35,39
public synchronized String intern(String input) { [EOL]     String result = get(input); [EOL]     if (result == null) { [EOL]         result = input.intern(); [EOL]         put(result, result); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 41,49
