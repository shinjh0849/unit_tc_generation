private LongSerializationPolicy(Strategy strategy) { [EOL]     this.strategy = strategy; [EOL] } <line_num>: 45,47
public JsonElement serialize(Long value) { [EOL]     return strategy.serialize(value); [EOL] } <line_num>: 55,57
JsonElement serialize(Long value); <line_num>: 60,60
public JsonElement serialize(Long value) { [EOL]     return new JsonPrimitive(value); [EOL] } <line_num>: 64,66
public JsonElement serialize(Long value) { [EOL]     return new JsonPrimitive(String.valueOf(value)); [EOL] } <line_num>: 70,72
