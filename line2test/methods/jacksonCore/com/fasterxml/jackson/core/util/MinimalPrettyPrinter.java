public MinimalPrettyPrinter() { [EOL]     this(DEFAULT_ROOT_VALUE_SEPARATOR); [EOL] } <line_num>: 44,46
public MinimalPrettyPrinter(String rootValueSeparator) { [EOL]     _rootValueSeparator = rootValueSeparator; [EOL] } <line_num>: 48,50
public void setRootValueSeparator(String sep) { [EOL]     _rootValueSeparator = sep; [EOL] } <line_num>: 52,54
@Override [EOL] public void writeRootValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     if (_rootValueSeparator != null) { [EOL]         jg.writeRaw(_rootValueSeparator); [EOL]     } [EOL] } <line_num>: 62,68
@Override [EOL] public void writeStartObject(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw('{'); [EOL] } <line_num>: 70,75
@Override [EOL] public void beforeObjectEntries(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL] } <line_num>: 77,82
@Override [EOL] public void writeObjectFieldValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(':'); [EOL] } <line_num>: 91,96
@Override [EOL] public void writeObjectEntrySeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(','); [EOL] } <line_num>: 105,110
@Override [EOL] public void writeEndObject(JsonGenerator jg, int nrOfEntries) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw('}'); [EOL] } <line_num>: 112,117
@Override [EOL] public void writeStartArray(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw('['); [EOL] } <line_num>: 119,124
@Override [EOL] public void beforeArrayValues(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL] } <line_num>: 126,131
@Override [EOL] public void writeArrayValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(','); [EOL] } <line_num>: 140,145
@Override [EOL] public void writeEndArray(JsonGenerator jg, int nrOfValues) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(']'); [EOL] } <line_num>: 147,152
