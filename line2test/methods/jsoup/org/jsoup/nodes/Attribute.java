public Attribute(String key, String value) { [EOL]     Validate.notEmpty(key); [EOL]     Validate.notNull(value); [EOL]     this.key = key.trim().toLowerCase(); [EOL]     this.value = value; [EOL] } <line_num>: 20,25
public String getKey() { [EOL]     return key; [EOL] } <line_num>: 31,33
public void setKey(String key) { [EOL]     Validate.notEmpty(key); [EOL]     this.key = key.trim().toLowerCase(); [EOL] } <line_num>: 39,42
public String getValue() { [EOL]     return value; [EOL] } <line_num>: 48,50
public void setValue(String value) { [EOL]     Validate.notNull(value); [EOL]     this.value = value; [EOL] } <line_num>: 56,59
public String html() { [EOL]     return String.format("%s=\"%s\"", key, StringEscapeUtils.escapeHtml(value)); [EOL] } <line_num>: 65,67
public String toString() { [EOL]     return html(); [EOL] } <line_num>: 73,75
public static Attribute createFromEncoded(String unencodedKey, String encodedValue) { [EOL]     String value = StringEscapeUtils.unescapeHtml(encodedValue); [EOL]     return new Attribute(unencodedKey, value); [EOL] } <line_num>: 83,86
@Override [EOL] public boolean equals(Object o) { [EOL]     if (this == o) [EOL]         return true; [EOL]     if (!(o instanceof Attribute)) [EOL]         return false; [EOL]     Attribute attribute = (Attribute) o; [EOL]     if (key != null ? !key.equals(attribute.key) : attribute.key != null) [EOL]         return false; [EOL]     if (value != null ? !value.equals(attribute.value) : attribute.value != null) [EOL]         return false; [EOL]     return true; [EOL] } <line_num>: 88,99
@Override [EOL] public int hashCode() { [EOL]     int result = key != null ? key.hashCode() : 0; [EOL]     result = 31 * result + (value != null ? value.hashCode() : 0); [EOL]     return result; [EOL] } <line_num>: 101,106
