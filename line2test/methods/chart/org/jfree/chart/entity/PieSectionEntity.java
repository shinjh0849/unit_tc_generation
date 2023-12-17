public PieSectionEntity(Shape area, PieDataset dataset, int pieIndex, int sectionIndex, Comparable sectionKey, String toolTipText, String urlText) { [EOL]     super(area, toolTipText, urlText); [EOL]     this.dataset = dataset; [EOL]     this.pieIndex = pieIndex; [EOL]     this.sectionIndex = sectionIndex; [EOL]     this.sectionKey = sectionKey; [EOL] } <line_num>: 95,107
public PieDataset getDataset() { [EOL]     return this.dataset; [EOL] } <line_num>: 116,118
public void setDataset(PieDataset dataset) { [EOL]     this.dataset = dataset; [EOL] } <line_num>: 127,129
public int getPieIndex() { [EOL]     return this.pieIndex; [EOL] } <line_num>: 140,142
public void setPieIndex(int index) { [EOL]     this.pieIndex = index; [EOL] } <line_num>: 151,153
public int getSectionIndex() { [EOL]     return this.sectionIndex; [EOL] } <line_num>: 162,164
public void setSectionIndex(int index) { [EOL]     this.sectionIndex = index; [EOL] } <line_num>: 173,175
public Comparable getSectionKey() { [EOL]     return this.sectionKey; [EOL] } <line_num>: 184,186
public void setSectionKey(Comparable key) { [EOL]     this.sectionKey = key; [EOL] } <line_num>: 195,197
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof PieSectionEntity)) { [EOL]         return false; [EOL]     } [EOL]     PieSectionEntity that = (PieSectionEntity) obj; [EOL]     if (!ObjectUtilities.equal(this.dataset, that.dataset)) { [EOL]         return false; [EOL]     } [EOL]     if (this.pieIndex != that.pieIndex) { [EOL]         return false; [EOL]     } [EOL]     if (this.sectionIndex != that.sectionIndex) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.sectionKey, that.sectionKey)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 206,227
public int hashCode() { [EOL]     int result = super.hashCode(); [EOL]     result = HashUtilities.hashCode(result, this.pieIndex); [EOL]     result = HashUtilities.hashCode(result, this.sectionIndex); [EOL]     return result; [EOL] } <line_num>: 234,239
public String toString() { [EOL]     return "PieSection: " + this.pieIndex + ", " + this.sectionIndex + "(" + this.sectionKey.toString() + ")"; [EOL] } <line_num>: 246,249
