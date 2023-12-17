public NestedTestBean[] getBeans() { [EOL]     return beans; [EOL] } <line_num>: 49,51
public void setBeans(NestedTestBean[] beans) { [EOL]     this.beans = beans; [EOL] } <line_num>: 53,55
public boolean getBoolean() { [EOL]     return bool; [EOL] } <line_num>: 61,63
public void setBoolean(boolean bool) { [EOL]     this.bool = bool; [EOL] } <line_num>: 65,67
public int getInt() { [EOL]     return integer; [EOL] } <line_num>: 73,75
public void setInt(int integer) { [EOL]     this.integer = integer; [EOL] } <line_num>: 77,79
public int[] getIntegers() { [EOL]     return array; [EOL] } <line_num>: 85,87
public int getIntegers(int index) { [EOL]     return array[index]; [EOL] } <line_num>: 89,91
public void setIntegers(int index, int value) { [EOL]     if (index >= array.length) { [EOL]         array = (int[]) ValueUtils.expandCollection(array, index + 1); [EOL]     } [EOL]     array[index] = value; [EOL] } <line_num>: 93,98
public List getList() { [EOL]     if (list == null) { [EOL]         list = new ArrayList(); [EOL]         list.add("String 3"); [EOL]         list.add(new Integer(3)); [EOL]         list.add(new NestedTestBean("Name 3")); [EOL]     } [EOL]     return list; [EOL] } <line_num>: 104,112
public Map getMap() { [EOL]     return map; [EOL] } <line_num>: 124,126
public void setMap(Map map) { [EOL]     this.map = (HashMap) map; [EOL] } <line_num>: 128,130
public NestedTestBean getNestedBean() { [EOL]     return nestedBean; [EOL] } <line_num>: 136,138
public void setNestedBean(NestedTestBean bean) { [EOL]     this.nestedBean = bean; [EOL] } <line_num>: 140,142
public Object getObject() { [EOL]     return object; [EOL] } <line_num>: 149,151
public Object getObjects() { [EOL]     return getIntegers(); [EOL] } <line_num>: 156,158
public Set getSet() { [EOL]     if (set == null) { [EOL]         set = new HashSet(); [EOL]         set.add("String 4"); [EOL]         set.add(new Integer(4)); [EOL]         set.add(new NestedTestBean("Name 4")); [EOL]     } [EOL]     return set; [EOL] } <line_num>: 164,172
public String toString() { [EOL]     return "ROOT"; [EOL] } <line_num>: 174,176
