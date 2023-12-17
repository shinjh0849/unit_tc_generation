public boolean isJsonArray() { [EOL]     return this instanceof JsonArray; [EOL] } <line_num>: 38,40
public boolean isJsonObject() { [EOL]     return this instanceof JsonObject; [EOL] } <line_num>: 47,49
public boolean isJsonPrimitive() { [EOL]     return this instanceof JsonPrimitive; [EOL] } <line_num>: 56,58
public boolean isJsonNull() { [EOL]     return this instanceof JsonNull; [EOL] } <line_num>: 66,68
public JsonObject getAsJsonObject() { [EOL]     if (isJsonObject()) { [EOL]         return (JsonObject) this; [EOL]     } [EOL]     throw new IllegalStateException("This is not a JSON Object."); [EOL] } <line_num>: 79,84
public JsonArray getAsJsonArray() { [EOL]     if (isJsonArray()) { [EOL]         return (JsonArray) this; [EOL]     } [EOL]     throw new IllegalStateException("This is not a JSON Array."); [EOL] } <line_num>: 95,100
public JsonPrimitive getAsJsonPrimitive() { [EOL]     if (isJsonPrimitive()) { [EOL]         return (JsonPrimitive) this; [EOL]     } [EOL]     throw new IllegalStateException("This is not a JSON Primitive."); [EOL] } <line_num>: 111,116
public JsonNull getAsJsonNull() { [EOL]     if (isJsonNull()) { [EOL]         return (JsonNull) this; [EOL]     } [EOL]     throw new IllegalStateException("This is not a JSON Null."); [EOL] } <line_num>: 128,133
public boolean getAsBoolean() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 144,146
Boolean getAsBooleanWrapper() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 157,159
public Number getAsNumber() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 170,172
public String getAsString() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 183,185
public double getAsDouble() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 196,198
public float getAsFloat() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 209,211
public long getAsLong() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 222,224
public int getAsInt() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 235,237
public byte getAsByte() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 249,251
public char getAsCharacter() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 263,265
public BigDecimal getAsBigDecimal() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 277,279
public BigInteger getAsBigInteger() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 291,293
public short getAsShort() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 304,306
Object getAsObject() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 317,319
@Override [EOL] public String toString() { [EOL]     try { [EOL]         StringBuilder sb = new StringBuilder(); [EOL]         toString(sb, BASIC_ESCAPER); [EOL]         return sb.toString(); [EOL]     } catch (IOException e) { [EOL]         throw new RuntimeException(e); [EOL]     } [EOL] } <line_num>: 326,335
protected abstract void toString(Appendable sb, Escaper escaper) throws IOException; <line_num>: 337,337
