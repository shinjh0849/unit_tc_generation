public LegendItemEntity(Shape area) { [EOL]     super(area); [EOL] } <line_num>: 82,84
public Dataset getDataset() { [EOL]     return this.dataset; [EOL] } <line_num>: 96,98
public void setDataset(Dataset dataset) { [EOL]     this.dataset = dataset; [EOL] } <line_num>: 107,109
public Comparable getSeriesKey() { [EOL]     return this.seriesKey; [EOL] } <line_num>: 120,122
public void setSeriesKey(Comparable key) { [EOL]     this.seriesKey = key; [EOL] } <line_num>: 133,135
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof LegendItemEntity)) { [EOL]         return false; [EOL]     } [EOL]     LegendItemEntity that = (LegendItemEntity) obj; [EOL]     if (!ObjectUtilities.equal(this.seriesKey, that.seriesKey)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.dataset, that.dataset)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 144,159
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 169,171
public String toString() { [EOL]     return "LegendItemEntity: seriesKey=" + this.seriesKey + ", dataset=" + this.dataset; [EOL] } <line_num>: 179,182
