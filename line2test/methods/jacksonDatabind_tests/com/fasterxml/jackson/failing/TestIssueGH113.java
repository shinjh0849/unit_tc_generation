public Animal() { [EOL] } <line_num>: 16,17
@JsonCreator [EOL] public Animal(@JsonProperty(ID) String id) { [EOL]     this.id = id; [EOL] } <line_num>: 19,22
public Dog() { [EOL]     super(); [EOL] } <line_num>: 32,34
@JsonCreator [EOL] public Dog(@JsonProperty(ID) String id) { [EOL]     super(id); [EOL] } <line_num>: 36,39
@JsonCreator [EOL] public AnimalWrapper(@JsonProperty("animal") Animal animal) { [EOL]     this.animal = animal; [EOL] } <line_num>: 46,49
@JsonProperty(ID) [EOL] public String getId() { [EOL]     return id; [EOL] } <line_num>: 24,27
public Animal getAnimal() { [EOL]     return animal; [EOL] } <line_num>: 51,53
public void testSubtypes() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     String id = "nice dogy"; [EOL]     String serializedDog = mapper.writeValueAsString(new AnimalWrapper(new Dog(id))); [EOL]     AnimalWrapper wrapper = mapper.readValue(serializedDog, AnimalWrapper.class); [EOL]     assertEquals(id, wrapper.getAnimal().getId()); [EOL] } <line_num>: 56,64
