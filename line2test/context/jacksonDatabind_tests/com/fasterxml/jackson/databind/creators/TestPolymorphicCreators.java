protected Animal()
public Dog()
public Cat()
private AbstractRoot(String opt)
private One(String opt)
public static Animal create(@JsonProperty("type") String type)
public void setBarkVolume(double v)
public void setLikesCream(boolean likesCreamSurely)
public static final AbstractRoot make(@JsonProperty("which") int which, @JsonProperty("opt") String opt)
public abstract int getWhich()
public final String getOpt()
public int getWhich()
public void testManualPolymorphicDog() throws Exception
public void testManualPolymorphicCatBasic() throws Exception
public void testManualPolymorphicCatWithReorder() throws Exception
public void testManualPolymorphicWithNumbered() throws Exception
ObjectMapper MAPPER=Optional[new ObjectMapper()]
