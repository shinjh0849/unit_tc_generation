public Elements() { [EOL]     contents = new ArrayList<Element>(); [EOL] } <line_num>: 15,17
public Elements(Collection<Element> elements) { [EOL]     contents = new ArrayList<Element>(elements); [EOL] } <line_num>: 19,21
public Elements(List<Element> elements) { [EOL]     contents = elements; [EOL] } <line_num>: 23,25
public Elements(Element... elements) { [EOL]     this(Arrays.asList(elements)); [EOL] } <line_num>: 27,29
public String attr(String attributeKey) { [EOL]     for (Element element : contents) { [EOL]         if (element.hasAttr(attributeKey)) [EOL]             return element.attr(attributeKey); [EOL]     } [EOL]     return ""; [EOL] } <line_num>: 39,45
public boolean hasAttr(String attributeKey) { [EOL]     for (Element element : contents) { [EOL]         if (element.hasAttr(attributeKey)) [EOL]             return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 52,58
public Elements attr(String attributeKey, String attributeValue) { [EOL]     for (Element element : contents) { [EOL]         element.attr(attributeKey, attributeValue); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 66,71
public Elements removeAttr(String attributeKey) { [EOL]     for (Element element : contents) { [EOL]         element.removeAttr(attributeKey); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 78,83
public Elements addClass(String className) { [EOL]     for (Element element : contents) { [EOL]         element.addClass(className); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 90,95
public Elements removeClass(String className) { [EOL]     for (Element element : contents) { [EOL]         element.removeClass(className); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 102,107
public Elements toggleClass(String className) { [EOL]     for (Element element : contents) { [EOL]         element.toggleClass(className); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 114,119
public boolean hasClass(String className) { [EOL]     for (Element element : contents) { [EOL]         if (element.hasClass(className)) [EOL]             return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 126,132
public String val() { [EOL]     if (size() > 0) [EOL]         return first().val(); [EOL]     else [EOL]         return ""; [EOL] } <line_num>: 139,144
public Elements val(String value) { [EOL]     for (Element element : contents) element.val(value); [EOL]     return this; [EOL] } <line_num>: 151,155
public String text() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     for (Element element : contents) { [EOL]         if (sb.length() != 0) [EOL]             sb.append(" "); [EOL]         sb.append(element.text()); [EOL]     } [EOL]     return sb.toString(); [EOL] } <line_num>: 165,173
public boolean hasText() { [EOL]     for (Element element : contents) { [EOL]         if (element.hasText()) [EOL]             return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 175,181
public String html() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     for (Element element : contents) { [EOL]         if (sb.length() != 0) [EOL]             sb.append("\n"); [EOL]         sb.append(element.html()); [EOL]     } [EOL]     return sb.toString(); [EOL] } <line_num>: 189,197
public String outerHtml() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     for (Element element : contents) { [EOL]         if (sb.length() != 0) [EOL]             sb.append("\n"); [EOL]         sb.append(element.outerHtml()); [EOL]     } [EOL]     return sb.toString(); [EOL] } <line_num>: 205,213
public Elements html(String html) { [EOL]     for (Element element : contents) { [EOL]         element.html(html); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 221,226
public Elements prepend(String html) { [EOL]     for (Element element : contents) { [EOL]         element.prepend(html); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 234,239
public Elements append(String html) { [EOL]     for (Element element : contents) { [EOL]         element.append(html); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 247,252
public Elements wrap(String html) { [EOL]     Validate.notEmpty(html); [EOL]     for (Element element : contents) { [EOL]         element.wrap(html); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 263,269
public Elements select(String query) { [EOL]     return Selector.select(query, this); [EOL] } <line_num>: 278,280
public Elements eq(int index) { [EOL]     if (contents.size() > index) [EOL]         return new Elements(get(index)); [EOL]     else [EOL]         return new Elements(); [EOL] } <line_num>: 287,292
public boolean is(String query) { [EOL]     Elements children = this.select(query); [EOL]     return !children.isEmpty(); [EOL] } <line_num>: 299,302
public Element first() { [EOL]     return !contents.isEmpty() ? contents.get(0) : null; [EOL] } <line_num>: 309,311
public Element last() { [EOL]     return !contents.isEmpty() ? contents.get(contents.size() - 1) : null; [EOL] } <line_num>: 317,319
public int size() { [EOL]     return contents.size(); [EOL] } <line_num>: 322,322
public boolean isEmpty() { [EOL]     return contents.isEmpty(); [EOL] } <line_num>: 324,324
public boolean contains(Object o) { [EOL]     return contents.contains(o); [EOL] } <line_num>: 326,326
public Iterator<Element> iterator() { [EOL]     return contents.iterator(); [EOL] } <line_num>: 328,328
public Object[] toArray() { [EOL]     return contents.toArray(); [EOL] } <line_num>: 330,330
public <T> T[] toArray(T[] a) { [EOL]     return contents.toArray(a); [EOL] } <line_num>: 332,332
public boolean add(Element element) { [EOL]     return contents.add(element); [EOL] } <line_num>: 334,334
public boolean remove(Object o) { [EOL]     return contents.remove(o); [EOL] } <line_num>: 336,336
public boolean containsAll(Collection<?> c) { [EOL]     return contents.containsAll(c); [EOL] } <line_num>: 338,338
public boolean addAll(Collection<? extends Element> c) { [EOL]     return contents.addAll(c); [EOL] } <line_num>: 340,340
public boolean addAll(int index, Collection<? extends Element> c) { [EOL]     return contents.addAll(index, c); [EOL] } <line_num>: 342,342
public boolean removeAll(Collection<?> c) { [EOL]     return contents.removeAll(c); [EOL] } <line_num>: 344,344
public boolean retainAll(Collection<?> c) { [EOL]     return contents.retainAll(c); [EOL] } <line_num>: 346,346
public void clear() { [EOL]     contents.clear(); [EOL] } <line_num>: 348,348
public boolean equals(Object o) { [EOL]     return contents.equals(o); [EOL] } <line_num>: 350,350
public int hashCode() { [EOL]     return contents.hashCode(); [EOL] } <line_num>: 352,352
public Element get(int index) { [EOL]     return contents.get(index); [EOL] } <line_num>: 354,354
public Element set(int index, Element element) { [EOL]     return contents.set(index, element); [EOL] } <line_num>: 356,356
public void add(int index, Element element) { [EOL]     contents.add(index, element); [EOL] } <line_num>: 358,358
public Element remove(int index) { [EOL]     return contents.remove(index); [EOL] } <line_num>: 360,360
public int indexOf(Object o) { [EOL]     return contents.indexOf(o); [EOL] } <line_num>: 362,362
public int lastIndexOf(Object o) { [EOL]     return contents.lastIndexOf(o); [EOL] } <line_num>: 364,364
public ListIterator<Element> listIterator() { [EOL]     return contents.listIterator(); [EOL] } <line_num>: 366,366
public ListIterator<Element> listIterator(int index) { [EOL]     return contents.listIterator(index); [EOL] } <line_num>: 368,368
public List<Element> subList(int fromIndex, int toIndex) { [EOL]     return contents.subList(fromIndex, toIndex); [EOL] } <line_num>: 370,370
