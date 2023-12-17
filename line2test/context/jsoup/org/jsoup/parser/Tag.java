private Tag(String tagName)
public String getName()
public static Tag valueOf(String tagName)
 boolean canContain(Tag child)
public boolean isBlock()
public boolean canContainBlock()
public boolean isInline()
public boolean isData()
public boolean isEmpty()
public boolean preserveWhitespace()
 Tag getImplicitParent()
 boolean isValidParent(Tag child)
public boolean equals(Object o)
public int hashCode()
public String toString()
private static Tag createBlock(String tagName)
private static Tag createInline(String tagName)
private static Tag register(Tag tag)
private Tag setContainInlineOnly()
private Tag setContainDataOnly()
private Tag setEmpty()
private Tag setOptionalClosing()
private Tag setPreserveWhitespace()
private Tag setAncestor(String... tagNames)
Map<String, Tag> tags=Optional[new HashMap<String, Tag>()]
Tag defaultAncestor
String tagName
boolean isBlock=Optional[true]
boolean canContainBlock=Optional[true]
boolean canContainInline=Optional[true]
boolean optionalClosing=Optional[false]
boolean empty=Optional[false]
boolean preserveWhitespace=Optional[false]
List<Tag> ancestors
