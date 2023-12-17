public ToStringBuilder(final Object object) { [EOL]     this(object, null, null); [EOL] } <line_num>: 225,227
public ToStringBuilder(final Object object, final ToStringStyle style) { [EOL]     this(object, style, null); [EOL] } <line_num>: 237,239
public ToStringBuilder(final Object object, ToStringStyle style, StringBuffer buffer) { [EOL]     if (style == null) { [EOL]         style = getDefaultStyle(); [EOL]     } [EOL]     if (buffer == null) { [EOL]         buffer = new StringBuffer(512); [EOL]     } [EOL]     this.buffer = buffer; [EOL]     this.style = style; [EOL]     this.object = object; [EOL]     style.appendStart(buffer, object); [EOL] } <line_num>: 252,264
public static ToStringStyle getDefaultStyle() { [EOL]     return defaultStyle; [EOL] } <line_num>: 116,118
public static void setDefaultStyle(final ToStringStyle style) { [EOL]     if (style == null) { [EOL]         throw new IllegalArgumentException("The style must not be null"); [EOL]     } [EOL]     defaultStyle = style; [EOL] } <line_num>: 135,140
public static String reflectionToString(final Object object) { [EOL]     return ReflectionToStringBuilder.toString(object); [EOL] } <line_num>: 151,153
public static String reflectionToString(final Object object, final ToStringStyle style) { [EOL]     return ReflectionToStringBuilder.toString(object, style); [EOL] } <line_num>: 164,166
public static String reflectionToString(final Object object, final ToStringStyle style, final boolean outputTransients) { [EOL]     return ReflectionToStringBuilder.toString(object, style, outputTransients, false, null); [EOL] } <line_num>: 178,180
public static <T> String reflectionToString(final T object, final ToStringStyle style, final boolean outputTransients, final Class<? super T> reflectUpToClass) { [EOL]     return ReflectionToStringBuilder.toString(object, style, outputTransients, false, reflectUpToClass); [EOL] } <line_num>: 195,201
public ToStringBuilder append(final boolean value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 275,278
public ToStringBuilder append(final boolean[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 289,292
public ToStringBuilder append(final byte value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 303,306
public ToStringBuilder append(final byte[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 317,320
public ToStringBuilder append(final char value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 331,334
public ToStringBuilder append(final char[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 345,348
public ToStringBuilder append(final double value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 359,362
public ToStringBuilder append(final double[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 373,376
public ToStringBuilder append(final float value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 387,390
public ToStringBuilder append(final float[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 401,404
public ToStringBuilder append(final int value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 415,418
public ToStringBuilder append(final int[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 429,432
public ToStringBuilder append(final long value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 443,446
public ToStringBuilder append(final long[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 457,460
public ToStringBuilder append(final Object obj) { [EOL]     style.append(buffer, null, obj, null); [EOL]     return this; [EOL] } <line_num>: 471,474
public ToStringBuilder append(final Object[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 485,488
public ToStringBuilder append(final short value) { [EOL]     style.append(buffer, null, value); [EOL]     return this; [EOL] } <line_num>: 499,502
public ToStringBuilder append(final short[] array) { [EOL]     style.append(buffer, null, array, null); [EOL]     return this; [EOL] } <line_num>: 513,516
public ToStringBuilder append(final String fieldName, final boolean value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 526,529
public ToStringBuilder append(final String fieldName, final boolean[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 539,542
public ToStringBuilder append(final String fieldName, final boolean[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 559,562
public ToStringBuilder append(final String fieldName, final byte value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 572,575
public ToStringBuilder append(final String fieldName, final byte[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 584,587
public ToStringBuilder append(final String fieldName, final byte[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 604,607
public ToStringBuilder append(final String fieldName, final char value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 617,620
public ToStringBuilder append(final String fieldName, final char[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 630,633
public ToStringBuilder append(final String fieldName, final char[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 650,653
public ToStringBuilder append(final String fieldName, final double value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 663,666
public ToStringBuilder append(final String fieldName, final double[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 676,679
public ToStringBuilder append(final String fieldName, final double[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 696,699
public ToStringBuilder append(final String fieldName, final float value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 709,712
public ToStringBuilder append(final String fieldName, final float[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 722,725
public ToStringBuilder append(final String fieldName, final float[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 742,745
public ToStringBuilder append(final String fieldName, final int value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 755,758
public ToStringBuilder append(final String fieldName, final int[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 768,771
public ToStringBuilder append(final String fieldName, final int[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 788,791
public ToStringBuilder append(final String fieldName, final long value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 801,804
public ToStringBuilder append(final String fieldName, final long[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 814,817
public ToStringBuilder append(final String fieldName, final long[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 834,837
public ToStringBuilder append(final String fieldName, final Object obj) { [EOL]     style.append(buffer, fieldName, obj, null); [EOL]     return this; [EOL] } <line_num>: 847,850
public ToStringBuilder append(final String fieldName, final Object obj, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, obj, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 862,865
public ToStringBuilder append(final String fieldName, final Object[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 875,878
public ToStringBuilder append(final String fieldName, final Object[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 895,898
public ToStringBuilder append(final String fieldName, final short value) { [EOL]     style.append(buffer, fieldName, value); [EOL]     return this; [EOL] } <line_num>: 908,911
public ToStringBuilder append(final String fieldName, final short[] array) { [EOL]     style.append(buffer, fieldName, array, null); [EOL]     return this; [EOL] } <line_num>: 921,924
public ToStringBuilder append(final String fieldName, final short[] array, final boolean fullDetail) { [EOL]     style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail)); [EOL]     return this; [EOL] } <line_num>: 941,944
public ToStringBuilder appendAsObjectToString(final Object object) { [EOL]     ObjectUtils.identityToString(this.getStringBuffer(), object); [EOL]     return this; [EOL] } <line_num>: 955,958
public ToStringBuilder appendSuper(final String superToString) { [EOL]     if (superToString != null) { [EOL]         style.appendSuper(buffer, superToString); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 974,979
public ToStringBuilder appendToString(final String toString) { [EOL]     if (toString != null) { [EOL]         style.appendToString(buffer, toString); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 1008,1013
public Object getObject() { [EOL]     return object; [EOL] } <line_num>: 1021,1023
public StringBuffer getStringBuffer() { [EOL]     return buffer; [EOL] } <line_num>: 1030,1032
public ToStringStyle getStyle() { [EOL]     return style; [EOL] } <line_num>: 1042,1044
@Override [EOL] public String toString() { [EOL]     if (this.getObject() == null) { [EOL]         this.getStringBuffer().append(this.getStyle().getNullText()); [EOL]     } else { [EOL]         style.appendEnd(this.getStringBuffer(), this.getObject()); [EOL]     } [EOL]     return this.getStringBuffer().toString(); [EOL] } <line_num>: 1056,1064
@Override [EOL] public String build() { [EOL]     return toString(); [EOL] } <line_num>: 1076,1079
