public LegendItemCollection() { [EOL]     this.items = new java.util.ArrayList(); [EOL] } <line_num>: 68,70
public void add(LegendItem item) { [EOL]     this.items.add(item); [EOL] } <line_num>: 77,79
public void addAll(LegendItemCollection collection) { [EOL]     this.items.addAll(collection.items); [EOL] } <line_num>: 86,88
public LegendItem get(int index) { [EOL]     return (LegendItem) this.items.get(index); [EOL] } <line_num>: 97,99
public int getItemCount() { [EOL]     return this.items.size(); [EOL] } <line_num>: 106,108
public Iterator iterator() { [EOL]     return this.items.iterator(); [EOL] } <line_num>: 115,117
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof LegendItemCollection)) { [EOL]         return false; [EOL]     } [EOL]     LegendItemCollection that = (LegendItemCollection) obj; [EOL]     if (!this.items.equals(that.items)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 126,138
public Object clone() throws CloneNotSupportedException { [EOL]     LegendItemCollection clone = (LegendItemCollection) super.clone(); [EOL]     clone.items = (List) ObjectUtilities.deepClone(this.items); [EOL]     return clone; [EOL] } <line_num>: 148,152
