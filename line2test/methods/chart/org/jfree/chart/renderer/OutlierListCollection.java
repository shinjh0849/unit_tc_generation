public OutlierListCollection() { [EOL]     this.outlierLists = new ArrayList(); [EOL] } <line_num>: 81,83
public boolean isHighFarOut() { [EOL]     return this.highFarOut; [EOL] } <line_num>: 91,93
public void setHighFarOut(boolean farOut) { [EOL]     this.highFarOut = farOut; [EOL] } <line_num>: 101,103
public boolean isLowFarOut() { [EOL]     return this.lowFarOut; [EOL] } <line_num>: 111,113
public void setLowFarOut(boolean farOut) { [EOL]     this.lowFarOut = farOut; [EOL] } <line_num>: 121,123
public boolean add(Outlier outlier) { [EOL]     if (this.outlierLists.isEmpty()) { [EOL]         return this.outlierLists.add(new OutlierList(outlier)); [EOL]     } else { [EOL]         boolean updated = false; [EOL]         for (Iterator iterator = this.outlierLists.iterator(); iterator.hasNext(); ) { [EOL]             OutlierList list = (OutlierList) iterator.next(); [EOL]             if (list.isOverlapped(outlier)) { [EOL]                 updated = updateOutlierList(list, outlier); [EOL]             } [EOL]         } [EOL]         if (!updated) { [EOL]             updated = this.outlierLists.add(new OutlierList(outlier)); [EOL]         } [EOL]         return updated; [EOL]     } [EOL] } <line_num>: 135,156
public Iterator iterator() { [EOL]     return this.outlierLists.iterator(); [EOL] } <line_num>: 163,165
private boolean updateOutlierList(OutlierList list, Outlier outlier) { [EOL]     boolean result = false; [EOL]     result = list.add(outlier); [EOL]     list.updateAveragedOutlier(); [EOL]     list.setMultiple(true); [EOL]     return result; [EOL] } <line_num>: 178,184
