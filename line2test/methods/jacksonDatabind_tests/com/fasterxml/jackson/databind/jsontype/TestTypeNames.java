public Dog() { [EOL] } <line_num>: 105,105
public Dog(String n, int y) { [EOL]     name = n; [EOL]     ageInYears = y; [EOL] } <line_num>: 106,109
public Cat() { [EOL] } <line_num>: 124,124
public Cat(String n, boolean p) { [EOL]     name = n; [EOL]     purrs = p; [EOL] } <line_num>: 125,128
public MaineCoon() { [EOL]     super(); [EOL] } <line_num>: 140,140
public MaineCoon(String n, boolean p) { [EOL]     super(n, p); [EOL] } <line_num>: 141,143
public Persian() { [EOL]     super(); [EOL] } <line_num>: 148,148
public Persian(String n, boolean p) { [EOL]     super(n, p); [EOL] } <line_num>: 149,151
public void testSerialization() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     assertEquals("[{\"doggy\":{\"name\":\"Spot\",\"ageInYears\":3}}]", m.writeValueAsString(new Animal[] { new Dog("Spot", 3) })); [EOL]     assertEquals("[{\"MaineCoon\":{\"name\":\"Belzebub\",\"purrs\":true}}]", m.writeValueAsString(new Animal[] { new MaineCoon("Belzebub", true) })); [EOL] } <line_num>: 30,42
public void testRoundTrip() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Animal[] input = new Animal[] { new Dog("Odie", 7), null, new MaineCoon("Piru", false), new Persian("Khomeini", true) }; [EOL]     String json = m.writeValueAsString(input); [EOL]     List<Animal> output = m.readValue(json, TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Animal.class)); [EOL]     assertEquals(input.length, output.size()); [EOL]     for (int i = 0, len = input.length; i < len; ++i) { [EOL]         assertEquals("Entry #" + i + " differs, input = '" + json + "'", input[i], output.get(i)); [EOL]     } [EOL] } <line_num>: 44,61
public void testRoundTripMap() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     AnimalMap input = new AnimalMap(); [EOL]     input.put("venla", new MaineCoon("Venla", true)); [EOL]     input.put("ama", new Dog("Amadeus", 13)); [EOL]     String json = m.writeValueAsString(input); [EOL]     AnimalMap output = m.readValue(json, AnimalMap.class); [EOL]     assertEquals(input, output); [EOL] } <line_num>: 63,72
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) [EOL]         return false; [EOL]     return name.equals(((Animal) o).name); [EOL] } <line_num>: 91,97
@Override [EOL] public boolean equals(Object o) { [EOL]     return super.equals(o) && ((Dog) o).ageInYears == ageInYears; [EOL] } <line_num>: 111,115
@Override [EOL] public boolean equals(Object o) { [EOL]     return super.equals(o) && ((Cat) o).purrs == purrs; [EOL] } <line_num>: 130,133
