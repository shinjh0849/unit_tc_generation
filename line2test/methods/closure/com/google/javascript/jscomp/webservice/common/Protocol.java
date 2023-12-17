private Protocol() { [EOL] } <line_num>: 29,29
private RequestKey(String asGetParameter) { [EOL]     this.asGetParameter = asGetParameter; [EOL] } <line_num>: 88,90
private OutputInfoKey(String value) { [EOL]     this.value = value; [EOL] } <line_num>: 124,126
private FormattingKey(String value) { [EOL]     this.value = value; [EOL] } <line_num>: 144,146
CompilationLevelKey(String value) { [EOL]     this.value = value; [EOL] } <line_num>: 162,164
private WarningLevelKey(String value) { [EOL]     this.value = value; [EOL] } <line_num>: 180,182
private OutputFormatKey(String value) { [EOL]     this.value = value; [EOL] } <line_num>: 198,200
ApiKeyResponse(String responseParam) { [EOL]     this.responseParam = responseParam; [EOL] } <line_num>: 222,224
private ResponseTag(String responseTag) { [EOL]     this.responseTag = responseTag; [EOL] } <line_num>: 283,285
public String getValue(); <line_num>: 40,40
private static Set<String> getPermittedKeys() { [EOL]     Set<String> keys = Sets.newHashSet(); [EOL]     for (RequestKey key : RequestKey.values()) { [EOL]         keys.add(key.asGetParameter()); [EOL]     } [EOL]     return keys; [EOL] } <line_num>: 77,84
public String asGetParameter() { [EOL]     return asGetParameter; [EOL] } <line_num>: 92,94
@Override [EOL] public String toString() { [EOL]     return asGetParameter; [EOL] } <line_num>: 96,99
public static boolean isKeyValid(String key) { [EOL]     return permittedKeys.contains(key.toLowerCase()); [EOL] } <line_num>: 101,103
@Override [EOL] public String getValue() { [EOL]     return asGetParameter; [EOL] } <line_num>: 105,108
@Override [EOL] public String getValue() { [EOL]     return value; [EOL] } <line_num>: 128,131
@Override [EOL] public String getValue() { [EOL]     return value; [EOL] } <line_num>: 148,151
@Override [EOL] public String getValue() { [EOL]     return value; [EOL] } <line_num>: 166,169
@Override [EOL] public String getValue() { [EOL]     return value; [EOL] } <line_num>: 184,187
@Override [EOL] public String getValue() { [EOL]     return value; [EOL] } <line_num>: 202,205
@Override [EOL] public String toString() { [EOL]     return getValue(); [EOL] } <line_num>: 207,210
public String getResponseParam() { [EOL]     return responseParam; [EOL] } <line_num>: 229,231
@Override [EOL] public String toString() { [EOL]     return getResponseParam(); [EOL] } <line_num>: 233,236
@Override [EOL] public String getValue() { [EOL]     return getResponseParam(); [EOL] } <line_num>: 238,241
public String getResponseTag() { [EOL]     return responseTag; [EOL] } <line_num>: 287,289
@Override [EOL] public String toString() { [EOL]     return getResponseTag(); [EOL] } <line_num>: 291,294
@Override [EOL] public String getValue() { [EOL]     return getResponseTag(); [EOL] } <line_num>: 296,299
public static final int maximumInputSize() { [EOL]     return maxInputSize; [EOL] } <line_num>: 337,340
public static final void resetMaximumInputSize() { [EOL]     String maxInputSizeStr = System.getProperty(Protocol.MAX_INPUT_SIZE_KEY); [EOL]     if (maxInputSizeStr == null) { [EOL]         maxInputSize = Protocol.FALLBACK_MAX_INPUT_SIZE; [EOL]     } else { [EOL]         maxInputSize = Integer.parseInt(maxInputSizeStr); [EOL]     } [EOL] } <line_num>: 347,355
