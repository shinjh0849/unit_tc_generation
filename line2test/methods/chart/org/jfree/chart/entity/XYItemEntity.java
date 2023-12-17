public XYItemEntity(Shape area, XYDataset dataset, int series, int item, String toolTipText, String urlText) { [EOL]     super(area, toolTipText, urlText); [EOL]     this.dataset = dataset; [EOL]     this.series = series; [EOL]     this.item = item; [EOL] } <line_num>: 85,92
public XYDataset getDataset() { [EOL]     return this.dataset; [EOL] } <line_num>: 99,101
public void setDataset(XYDataset dataset) { [EOL]     this.dataset = dataset; [EOL] } <line_num>: 108,110
public int getSeriesIndex() { [EOL]     return this.series; [EOL] } <line_num>: 117,119
public void setSeriesIndex(int series) { [EOL]     this.series = series; [EOL] } <line_num>: 126,128
public int getItem() { [EOL]     return this.item; [EOL] } <line_num>: 135,137
public void setItem(int item) { [EOL]     this.item = item; [EOL] } <line_num>: 144,146
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (obj instanceof XYItemEntity && super.equals(obj)) { [EOL]         XYItemEntity ie = (XYItemEntity) obj; [EOL]         if (this.series != ie.series) { [EOL]             return false; [EOL]         } [EOL]         if (this.item != ie.item) { [EOL]             return false; [EOL]         } [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 155,170
public String toString() { [EOL]     return "XYItemEntity: series = " + getSeriesIndex() + ", item = " + getItem() + ", dataset = " + getDataset(); [EOL] } <line_num>: 178,181
