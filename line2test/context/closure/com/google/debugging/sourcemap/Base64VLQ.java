private Base64VLQ()
private static int toVLQSigned(int value)
private static int fromVLQSigned(int value)
public static void encode(Appendable out, int value) throws IOException
 boolean hasNext()
 char next()
public static int decode(CharIterator in)
int VLQ_BASE_SHIFT=Optional[5]
int VLQ_BASE=Optional[1 << VLQ_BASE_SHIFT]
int VLQ_BASE_MASK=Optional[VLQ_BASE - 1]
int VLQ_CONTINUATION_BIT=Optional[VLQ_BASE]
