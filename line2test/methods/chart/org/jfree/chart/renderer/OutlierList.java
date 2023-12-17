public OutlierList(Outlier outlier) { [EOL]     this.outliers = new ArrayList(); [EOL]     setAveragedOutlier(outlier); [EOL] } <line_num>: 85,88
public boolean add(Outlier outlier) { [EOL]     return this.outliers.add(outlier); [EOL] } <line_num>: 97,99
public int getItemCount() { [EOL]     return this.outliers.size(); [EOL] } <line_num>: 106,108
public Outlier getAveragedOutlier() { [EOL]     return this.averagedOutlier; [EOL] } <line_num>: 115,117
public void setAveragedOutlier(Outlier averagedOutlier) { [EOL]     this.averagedOutlier = averagedOutlier; [EOL] } <line_num>: 124,126
public boolean isMultiple() { [EOL]     return this.multiple; [EOL] } <line_num>: 134,136
public void setMultiple(boolean multiple) { [EOL]     this.multiple = multiple; [EOL] } <line_num>: 144,146
public boolean isOverlapped(Outlier other) { [EOL]     if (other == null) { [EOL]         return false; [EOL]     } [EOL]     boolean result = other.overlaps(getAveragedOutlier()); [EOL]     return result; [EOL] } <line_num>: 156,165
public void updateAveragedOutlier() { [EOL]     double totalXCoords = 0.0; [EOL]     double totalYCoords = 0.0; [EOL]     int size = getItemCount(); [EOL]     for (Iterator iterator = this.outliers.iterator(); iterator.hasNext(); ) { [EOL]         Outlier o = (Outlier) iterator.next(); [EOL]         totalXCoords += o.getX(); [EOL]         totalYCoords += o.getY(); [EOL]     } [EOL]     getAveragedOutlier().getPoint().setLocation(new Point2D.Double(totalXCoords / size, totalYCoords / size)); [EOL] } <line_num>: 171,184
