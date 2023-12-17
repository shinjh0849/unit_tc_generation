public JsonArray() { [EOL]     elements = new ArrayList<JsonElement>(); [EOL] } <line_num>: 41,43
public void add(JsonElement element) { [EOL]     if (element == null) { [EOL]         element = JsonNull.createJsonNull(); [EOL]     } [EOL]     elements.add(element); [EOL] } <line_num>: 50,55
public void addAll(JsonArray array) { [EOL]     elements.addAll(array.elements); [EOL] } <line_num>: 62,64
void reverse() { [EOL]     Collections.reverse(elements); [EOL] } <line_num>: 69,71
public int size() { [EOL]     return elements.size(); [EOL] } <line_num>: 78,80
public Iterator<JsonElement> iterator() { [EOL]     return elements.iterator(); [EOL] } <line_num>: 88,90
public JsonElement get(int i) { [EOL]     return elements.get(i); [EOL] } <line_num>: 100,102
@Override [EOL] public Number getAsNumber() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsNumber(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 112,118
@Override [EOL] public String getAsString() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsString(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 128,134
@Override [EOL] public double getAsDouble() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsDouble(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 144,150
@Override [EOL] public BigDecimal getAsBigDecimal() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsBigDecimal(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 161,167
@Override [EOL] public BigInteger getAsBigInteger() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsBigInteger(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 178,184
@Override [EOL] public float getAsFloat() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsFloat(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 194,200
@Override [EOL] public long getAsLong() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsLong(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 210,216
@Override [EOL] public int getAsInt() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsInt(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 226,232
@Override [EOL] public byte getAsByte() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsByte(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 234,240
@Override [EOL] public char getAsCharacter() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsCharacter(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 242,248
@Override [EOL] public short getAsShort() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsShort(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 258,264
@Override [EOL] public boolean getAsBoolean() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsBoolean(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 274,280
@Override [EOL] Object getAsObject() { [EOL]     if (elements.size() == 1) { [EOL]         return elements.get(0).getAsObject(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 290,296
@Override [EOL] protected void toString(Appendable sb, Escaper escaper) throws IOException { [EOL]     sb.append('['); [EOL]     boolean first = true; [EOL]     for (JsonElement element : elements) { [EOL]         if (first) { [EOL]             first = false; [EOL]         } else { [EOL]             sb.append(','); [EOL]         } [EOL]         element.toString(sb, escaper); [EOL]     } [EOL]     sb.append(']'); [EOL] } <line_num>: 298,311
