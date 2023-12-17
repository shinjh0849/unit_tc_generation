JsonToken(String token) { [EOL]     if (token == null) { [EOL]         _serialized = null; [EOL]         _serializedChars = null; [EOL]         _serializedBytes = null; [EOL]     } else { [EOL]         _serialized = token; [EOL]         _serializedChars = token.toCharArray(); [EOL]         int len = _serializedChars.length; [EOL]         _serializedBytes = new byte[len]; [EOL]         for (int i = 0; i < len; ++i) { [EOL]             _serializedBytes[i] = (byte) _serializedChars[i]; [EOL]         } [EOL]     } [EOL] } <line_num>: 127,143
public String asString() { [EOL]     return _serialized; [EOL] } <line_num>: 145,145
public char[] asCharArray() { [EOL]     return _serializedChars; [EOL] } <line_num>: 146,146
public byte[] asByteArray() { [EOL]     return _serializedBytes; [EOL] } <line_num>: 147,147
public boolean isNumeric() { [EOL]     return (this == VALUE_NUMBER_INT) || (this == VALUE_NUMBER_FLOAT); [EOL] } <line_num>: 149,151
public boolean isScalarValue() { [EOL]     return ordinal() >= VALUE_EMBEDDED_OBJECT.ordinal(); [EOL] } <line_num>: 158,161
