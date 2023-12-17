public DecimalNode(BigDecimal v)
public static DecimalNode valueOf(BigDecimal d)
public JsonToken asToken()
public JsonParser.NumberType numberType()
public boolean isFloatingPointNumber()
public boolean isBigDecimal()
public boolean canConvertToInt()
public boolean canConvertToLong()
public Number numberValue()
public short shortValue()
public int intValue()
public long longValue()
public BigInteger bigIntegerValue()
public float floatValue()
public double doubleValue()
public BigDecimal decimalValue()
public String asText()
public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException
public boolean equals(Object o)
public int hashCode()
DecimalNode ZERO=Optional[new DecimalNode(BigDecimal.ZERO)]
BigDecimal MIN_INTEGER=Optional[BigDecimal.valueOf(Integer.MIN_VALUE)]
BigDecimal MAX_INTEGER=Optional[BigDecimal.valueOf(Integer.MAX_VALUE)]
BigDecimal MIN_LONG=Optional[BigDecimal.valueOf(Long.MIN_VALUE)]
BigDecimal MAX_LONG=Optional[BigDecimal.valueOf(Long.MAX_VALUE)]
BigDecimal _value
