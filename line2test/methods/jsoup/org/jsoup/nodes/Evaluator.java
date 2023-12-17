private Evaluator() { [EOL] } <line_num>: 12,12
Tag(String tagName) { [EOL]     this.tagName = tagName; [EOL] } <line_num>: 21,23
Id(String id) { [EOL]     this.id = id; [EOL] } <line_num>: 32,34
Class(String className) { [EOL]     this.className = className; [EOL] } <line_num>: 43,45
Attribute(String key) { [EOL]     this.key = key; [EOL] } <line_num>: 55,57
AttributeWithValue(String key, String value) { [EOL]     super(key, value); [EOL] } <line_num>: 65,67
AttributeWithValueNot(String key, String value) { [EOL]     super(key, value); [EOL] } <line_num>: 75,77
AttributeWithValueStarting(String key, String value) { [EOL]     super(key, value); [EOL] } <line_num>: 85,87
AttributeWithValueEnding(String key, String value) { [EOL]     super(key, value); [EOL] } <line_num>: 95,97
AttributeWithValueContaining(String key, String value) { [EOL]     super(key, value); [EOL] } <line_num>: 105,107
AttributeKeyPair(String key, String value) { [EOL]     Validate.notEmpty(key); [EOL]     Validate.notEmpty(value); [EOL]     this.key = key.trim().toLowerCase(); [EOL]     this.value = value.trim().toLowerCase(); [EOL] } <line_num>: 118,124
IndexLessThan(int index) { [EOL]     super(index); [EOL] } <line_num>: 134,136
IndexGreaterThan(int index) { [EOL]     super(index); [EOL] } <line_num>: 144,146
IndexEquals(int index) { [EOL]     super(index); [EOL] } <line_num>: 154,156
IndexEvaluator(int index) { [EOL]     this.index = index; [EOL] } <line_num>: 166,168
public abstract boolean matches(Element element); <line_num>: 17,17
public boolean matches(Element element) { [EOL]     return (element.tagName().equals(tagName)); [EOL] } <line_num>: 25,27
public boolean matches(Element element) { [EOL]     return (id.equals(element.id())); [EOL] } <line_num>: 36,38
public boolean matches(Element element) { [EOL]     return (element.hasClass(className)); [EOL] } <line_num>: 47,49
public boolean matches(Element element) { [EOL]     return (element.hasAttr(key)); [EOL] } <line_num>: 59,61
public boolean matches(Element element) { [EOL]     return (value.equalsIgnoreCase(element.attr(key))); [EOL] } <line_num>: 69,71
public boolean matches(Element element) { [EOL]     return (!value.equalsIgnoreCase(element.attr(key))); [EOL] } <line_num>: 79,81
public boolean matches(Element element) { [EOL]     return element.attr(key).toLowerCase().startsWith(value); [EOL] } <line_num>: 89,91
public boolean matches(Element element) { [EOL]     return element.attr(key).toLowerCase().endsWith(value); [EOL] } <line_num>: 99,101
public boolean matches(Element element) { [EOL]     return element.attr(key).toLowerCase().contains(value); [EOL] } <line_num>: 109,111
public boolean matches(Element element) { [EOL]     return true; [EOL] } <line_num>: 128,130
public boolean matches(Element element) { [EOL]     return element.elementSiblingIndex() < index; [EOL] } <line_num>: 138,140
public boolean matches(Element element) { [EOL]     return element.elementSiblingIndex() > index; [EOL] } <line_num>: 148,150
public boolean matches(Element element) { [EOL]     return element.elementSiblingIndex() == index; [EOL] } <line_num>: 158,160
