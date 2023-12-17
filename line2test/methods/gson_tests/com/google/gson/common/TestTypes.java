@SuppressWarnings("unused") [EOL] private ClassWithBaseField() { [EOL]     this(null); [EOL] } <line_num>: 56,59
public ClassWithBaseField(Base base) { [EOL]     this.base = base; [EOL] } <line_num>: 60,62
@SuppressWarnings("unused") [EOL] private ClassWithBaseArrayField() { [EOL]     this(null); [EOL] } <line_num>: 68,71
public ClassWithBaseArrayField(Base[] base) { [EOL]     this.base = base; [EOL] } <line_num>: 72,74
StringWrapper() { [EOL]     this("Blah"); [EOL] } <line_num>: 97,99
public StringWrapper(String value) { [EOL]     someConstantStringInstanceField = value; [EOL] } <line_num>: 101,103
public BagOfPrimitives() { [EOL]     this(DEFAULT_VALUE, 0, false, ""); [EOL] } <line_num>: 113,115
public BagOfPrimitives(long longValue, int intValue, boolean booleanValue, String stringValue) { [EOL]     this.longValue = longValue; [EOL]     this.intValue = intValue; [EOL]     this.booleanValue = booleanValue; [EOL]     this.stringValue = stringValue; [EOL] } <line_num>: 117,122
public BagOfPrimitiveWrappers() { [EOL]     this(0L, 0, false); [EOL] } <line_num>: 185,187
public BagOfPrimitiveWrappers(Long longValue, Integer intValue, Boolean booleanValue) { [EOL]     this.longValue = longValue; [EOL]     this.intValue = intValue; [EOL]     this.booleanValue = booleanValue; [EOL] } <line_num>: 189,193
public PrimitiveArray() { [EOL]     this(new long[0]); [EOL] } <line_num>: 209,211
public PrimitiveArray(long[] longArray) { [EOL]     this.longArray = longArray; [EOL] } <line_num>: 213,215
public Nested() { [EOL]     this(null, null); [EOL] } <line_num>: 248,250
public Nested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) { [EOL]     this.primitive1 = primitive1; [EOL]     this.primitive2 = primitive2; [EOL] } <line_num>: 252,255
public ClassWithTransientFields() { [EOL]     this(0L); [EOL] } <line_num>: 283,285
public ClassWithTransientFields(long value) { [EOL]     longValue = new long[] { value }; [EOL]     transientLongValue = value + 1; [EOL] } <line_num>: 287,290
public ClassWithCustomTypeConverter() { [EOL]     this(new BagOfPrimitives(), 10); [EOL] } <line_num>: 305,307
public ClassWithCustomTypeConverter(int value) { [EOL]     this(new BagOfPrimitives(value, value, false, ""), value); [EOL] } <line_num>: 309,311
public ClassWithCustomTypeConverter(BagOfPrimitives bag, int value) { [EOL]     this.bag = bag; [EOL]     this.value = value; [EOL] } <line_num>: 313,316
public ArrayOfObjects() { [EOL]     elements = new BagOfPrimitives[3]; [EOL]     for (int i = 0; i < elements.length; ++i) { [EOL]         elements[i] = new BagOfPrimitives(i, i + 2, false, "i" + i); [EOL]     } [EOL] } <line_num>: 333,338
public ClassWithArray() { [EOL]     array = null; [EOL] } <line_num>: 377,379
public ClassWithArray(Object[] array) { [EOL]     this.array = array; [EOL] } <line_num>: 381,383
public ClassWithObjects() { [EOL]     this(new BagOfPrimitives()); [EOL] } <line_num>: 388,390
public ClassWithObjects(BagOfPrimitives bag) { [EOL]     this.bag = bag; [EOL] } <line_num>: 391,393
public ClassWithSerializedNameFields() { [EOL]     this(1, 4); [EOL] } <line_num>: 400,402
public ClassWithSerializedNameFields(int f, int g) { [EOL]     this.f = f; [EOL]     this.g = g; [EOL] } <line_num>: 403,406
public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) { [EOL]     JsonObject obj = new JsonObject(); [EOL]     obj.addProperty(Base.SERIALIZER_KEY, NAME); [EOL]     return obj; [EOL] } <line_num>: 79,83
public JsonElement serialize(Sub src, Type typeOfSrc, JsonSerializationContext context) { [EOL]     JsonObject obj = new JsonObject(); [EOL]     obj.addProperty(Base.SERIALIZER_KEY, NAME); [EOL]     return obj; [EOL] } <line_num>: 87,91
public int getIntValue() { [EOL]     return intValue; [EOL] } <line_num>: 124,126
public String getExpectedJson() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("{"); [EOL]     sb.append("\"longValue\":").append(longValue).append(","); [EOL]     sb.append("\"intValue\":").append(intValue).append(","); [EOL]     sb.append("\"booleanValue\":").append(booleanValue).append(","); [EOL]     sb.append("\"stringValue\":\"").append(stringValue).append("\""); [EOL]     sb.append("}"); [EOL]     return sb.toString(); [EOL] } <line_num>: 128,137
@Override [EOL] public int hashCode() { [EOL]     final int prime = 31; [EOL]     int result = 1; [EOL]     result = prime * result + (booleanValue ? 1231 : 1237); [EOL]     result = prime * result + intValue; [EOL]     result = prime * result + (int) (longValue ^ (longValue >>> 32)); [EOL]     result = prime * result + ((stringValue == null) ? 0 : stringValue.hashCode()); [EOL]     return result; [EOL] } <line_num>: 139,148
@Override [EOL] public boolean equals(Object obj) { [EOL]     if (this == obj) [EOL]         return true; [EOL]     if (obj == null) [EOL]         return false; [EOL]     if (getClass() != obj.getClass()) [EOL]         return false; [EOL]     BagOfPrimitives other = (BagOfPrimitives) obj; [EOL]     if (booleanValue != other.booleanValue) [EOL]         return false; [EOL]     if (intValue != other.intValue) [EOL]         return false; [EOL]     if (longValue != other.longValue) [EOL]         return false; [EOL]     if (stringValue == null) { [EOL]         if (other.stringValue != null) [EOL]             return false; [EOL]     } else if (!stringValue.equals(other.stringValue)) [EOL]         return false; [EOL]     return true; [EOL] } <line_num>: 150,171
@Override [EOL] public String toString() { [EOL]     return String.format("(longValue=%d,intValue=%d,booleanValue=%b,stringValue=%s)", longValue, intValue, booleanValue, stringValue); [EOL] } <line_num>: 173,177
public String getExpectedJson() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("{"); [EOL]     sb.append("\"longValue\":").append(longValue).append(","); [EOL]     sb.append("\"intValue\":").append(intValue).append(","); [EOL]     sb.append("\"booleanValue\":").append(booleanValue); [EOL]     sb.append("}"); [EOL]     return sb.toString(); [EOL] } <line_num>: 195,203
public String getExpectedJson() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("{\"longArray\":["); [EOL]     boolean first = true; [EOL]     for (long l : longArray) { [EOL]         if (!first) { [EOL]             sb.append(","); [EOL]         } else { [EOL]             first = false; [EOL]         } [EOL]         sb.append(l); [EOL]     } [EOL]     sb.append("]}"); [EOL]     return sb.toString(); [EOL] } <line_num>: 217,233
@Override [EOL] public boolean equals(Object other) { [EOL]     return other.getClass() == ClassWithNoFields.class; [EOL] } <line_num>: 238,241
public String getExpectedJson() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("{"); [EOL]     appendFields(sb); [EOL]     sb.append("}"); [EOL]     return sb.toString(); [EOL] } <line_num>: 257,263
public void appendFields(StringBuilder sb) { [EOL]     if (primitive1 != null) { [EOL]         sb.append("\"primitive1\":").append(primitive1.getExpectedJson()); [EOL]     } [EOL]     if (primitive1 != null && primitive2 != null) { [EOL]         sb.append(","); [EOL]     } [EOL]     if (primitive2 != null) { [EOL]         sb.append("\"primitive2\":").append(primitive2.getExpectedJson()); [EOL]     } [EOL] } <line_num>: 265,275
public String getExpectedJson() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("{"); [EOL]     sb.append("\"longValue\":[").append(longValue[0]).append("]"); [EOL]     sb.append("}"); [EOL]     return sb.toString(); [EOL] } <line_num>: 292,298
public BagOfPrimitives getBag() { [EOL]     return bag; [EOL] } <line_num>: 318,320
public String getExpectedJson() { [EOL]     return "{\"url\":\"" + bag.getExpectedJson() + "\",\"value\":" + value + "}"; [EOL] } <line_num>: 322,324
public int getValue() { [EOL]     return value; [EOL] } <line_num>: 326,328
public String getExpectedJson() { [EOL]     StringBuilder sb = new StringBuilder("{\"elements\":["); [EOL]     boolean first = true; [EOL]     for (BagOfPrimitives element : elements) { [EOL]         if (first) { [EOL]             first = false; [EOL]         } else { [EOL]             sb.append(","); [EOL]         } [EOL]         sb.append(element.getExpectedJson()); [EOL]     } [EOL]     sb.append("]}"); [EOL]     return sb.toString(); [EOL] } <line_num>: 339,352
public String getExpectedJson() { [EOL]     if (ref == null) { [EOL]         return "{}"; [EOL]     } [EOL]     return "{\"ref\":" + ref.getExpectedJson() + "}"; [EOL] } <line_num>: 358,363
@Override [EOL] public boolean equals(Object obj) { [EOL]     return true; [EOL] } <line_num>: 364,367
@Override [EOL] public int hashCode() { [EOL]     return 1; [EOL] } <line_num>: 369,372
public String getExpectedJson() { [EOL]     return '{' + "\"fooBar\":" + f + ",\"Another Foo\":" + g + '}'; [EOL] } <line_num>: 408,410
public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context) { [EOL]     return new JsonPrimitive(src + DIFFERENCE); [EOL] } <line_num>: 416,418
public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException { [EOL]     return json.getAsLong() - DIFFERENCE; [EOL] } <line_num>: 420,423
