public Animal()
public Animal(@JsonProperty(ID) String id)
public Dog()
public Dog(@JsonProperty(ID) String id)
public AnimalWrapper(@JsonProperty("animal") Animal animal)
public String getId()
public Animal getAnimal()
public void testSubtypes() throws Exception
