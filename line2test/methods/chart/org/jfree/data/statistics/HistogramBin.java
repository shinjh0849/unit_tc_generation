public HistogramBin(double startBoundary, double endBoundary) { [EOL]     if (startBoundary > endBoundary) { [EOL]         throw new IllegalArgumentException("HistogramBin():  startBoundary > endBoundary."); [EOL]     } [EOL]     this.count = 0; [EOL]     this.startBoundary = startBoundary; [EOL]     this.endBoundary = endBoundary; [EOL] } <line_num>: 72,80
public int getCount() { [EOL]     return this.count; [EOL] } <line_num>: 87,89
public void incrementCount() { [EOL]     this.count++; [EOL] } <line_num>: 94,96
public double getStartBoundary() { [EOL]     return this.startBoundary; [EOL] } <line_num>: 103,105
public double getEndBoundary() { [EOL]     return this.endBoundary; [EOL] } <line_num>: 112,114
public double getBinWidth() { [EOL]     return this.endBoundary - this.startBoundary; [EOL] } <line_num>: 121,123
public boolean equals(Object obj) { [EOL]     if (obj == null) { [EOL]         return false; [EOL]     } [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (obj instanceof HistogramBin) { [EOL]         HistogramBin bin = (HistogramBin) obj; [EOL]         boolean b0 = bin.startBoundary == this.startBoundary; [EOL]         boolean b1 = bin.endBoundary == this.endBoundary; [EOL]         boolean b2 = bin.count == this.count; [EOL]         return b0 && b1 && b2; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 132,147
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 156,158
