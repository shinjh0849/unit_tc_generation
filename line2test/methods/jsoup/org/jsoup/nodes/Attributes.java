public String get(String key) { [EOL]     Validate.notEmpty(key); [EOL]     Attribute attr = attributes.get(key.toLowerCase()); [EOL]     return attr != null ? attr.getValue() : ""; [EOL] } <line_num>: 27,32
public void put(String key, String value) { [EOL]     Attribute attr = new Attribute(key, value); [EOL]     put(attr); [EOL] } <line_num>: 39,42
public void put(Attribute attribute) { [EOL]     Validate.notNull(attribute); [EOL]     attributes.put(attribute.getKey(), attribute); [EOL] } <line_num>: 48,51
public void remove(String key) { [EOL]     Validate.notEmpty(key); [EOL]     attributes.remove(key.toLowerCase()); [EOL] } <line_num>: 57,60
public boolean hasKey(String key) { [EOL]     return attributes.containsKey(key.toLowerCase()); [EOL] } <line_num>: 67,69
public int size() { [EOL]     return attributes.size(); [EOL] } <line_num>: 75,77
public void addAll(Attributes incoming) { [EOL]     attributes.putAll(incoming.attributes); [EOL] } <line_num>: 83,85
public Iterator<Attribute> iterator() { [EOL]     return asList().iterator(); [EOL] } <line_num>: 87,89
public List<Attribute> asList() { [EOL]     List<Attribute> list = new ArrayList<Attribute>(attributes.size()); [EOL]     for (Map.Entry<String, Attribute> entry : attributes.entrySet()) { [EOL]         list.add(entry.getValue()); [EOL]     } [EOL]     return Collections.unmodifiableList(list); [EOL] } <line_num>: 96,102
public String html() { [EOL]     StringBuilder accum = new StringBuilder(); [EOL]     for (Attribute attribute : this) { [EOL]         accum.append(" "); [EOL]         accum.append(attribute.html()); [EOL]     } [EOL]     return accum.toString(); [EOL] } <line_num>: 108,115
public String toString() { [EOL]     return html(); [EOL] } <line_num>: 117,119
@Override [EOL] public boolean equals(Object o) { [EOL]     if (this == o) [EOL]         return true; [EOL]     if (!(o instanceof Attributes)) [EOL]         return false; [EOL]     Attributes that = (Attributes) o; [EOL]     if (attributes != null ? !attributes.equals(that.attributes) : that.attributes != null) [EOL]         return false; [EOL]     return true; [EOL] } <line_num>: 121,131
@Override [EOL] public int hashCode() { [EOL]     return attributes != null ? attributes.hashCode() : 0; [EOL] } <line_num>: 133,136
