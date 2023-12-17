public CrosshairState() { [EOL]     this(false); [EOL] } <line_num>: 119,121
public CrosshairState(boolean calculateDistanceInDataSpace) { [EOL]     this.calculateDistanceInDataSpace = calculateDistanceInDataSpace; [EOL] } <line_num>: 130,132
public double getCrosshairDistance() { [EOL]     return this.distance; [EOL] } <line_num>: 143,145
public void setCrosshairDistance(double distance) { [EOL]     this.distance = distance; [EOL] } <line_num>: 157,159
public void updateCrosshairPoint(double x, double y, double transX, double transY, PlotOrientation orientation) { [EOL]     updateCrosshairPoint(x, y, 0, 0, transX, transY, orientation); [EOL] } <line_num>: 180,184
public void updateCrosshairPoint(double x, double y, int domainAxisIndex, int rangeAxisIndex, double transX, double transY, PlotOrientation orientation) { [EOL]     if (this.anchor != null) { [EOL]         double d = 0.0; [EOL]         if (this.calculateDistanceInDataSpace) { [EOL]             d = (x - this.anchorX) * (x - this.anchorX) + (y - this.anchorY) * (y - this.anchorY); [EOL]         } else { [EOL]             double xx = this.anchor.getX(); [EOL]             double yy = this.anchor.getY(); [EOL]             if (orientation == PlotOrientation.HORIZONTAL) { [EOL]                 double temp = yy; [EOL]                 yy = xx; [EOL]                 xx = temp; [EOL]             } [EOL]             d = (transX - xx) * (transX - xx) + (transY - yy) * (transY - yy); [EOL]         } [EOL]         if (d < this.distance) { [EOL]             this.crosshairX = x; [EOL]             this.crosshairY = y; [EOL]             this.domainAxisIndex = domainAxisIndex; [EOL]             this.rangeAxisIndex = rangeAxisIndex; [EOL]             this.distance = d; [EOL]         } [EOL]     } [EOL] } <line_num>: 206,237
public void updateCrosshairX(double candidateX) { [EOL]     updateCrosshairX(candidateX, 0); [EOL] } <line_num>: 251,253
public void updateCrosshairX(double candidateX, int domainAxisIndex) { [EOL]     double d = Math.abs(candidateX - this.anchorX); [EOL]     if (d < this.distance) { [EOL]         this.crosshairX = candidateX; [EOL]         this.domainAxisIndex = domainAxisIndex; [EOL]         this.distance = d; [EOL]     } [EOL] } <line_num>: 267,276
public void updateCrosshairY(double candidateY) { [EOL]     updateCrosshairY(candidateY, 0); [EOL] } <line_num>: 290,292
public void updateCrosshairY(double candidateY, int rangeAxisIndex) { [EOL]     double d = Math.abs(candidateY - this.anchorY); [EOL]     if (d < this.distance) { [EOL]         this.crosshairY = candidateY; [EOL]         this.rangeAxisIndex = rangeAxisIndex; [EOL]         this.distance = d; [EOL]     } [EOL] } <line_num>: 306,314
public Point2D getAnchor() { [EOL]     return this.anchor; [EOL] } <line_num>: 325,327
public void setAnchor(Point2D anchor) { [EOL]     this.anchor = anchor; [EOL] } <line_num>: 342,344
public double getAnchorX() { [EOL]     return this.anchorX; [EOL] } <line_num>: 353,355
public void setAnchorX(double x) { [EOL]     this.anchorX = x; [EOL] } <line_num>: 366,368
public double getAnchorY() { [EOL]     return this.anchorY; [EOL] } <line_num>: 377,379
public void setAnchorY(double y) { [EOL]     this.anchorY = y; [EOL] } <line_num>: 390,392
public double getCrosshairX() { [EOL]     return this.crosshairX; [EOL] } <line_num>: 401,403
public void setCrosshairX(double x) { [EOL]     this.crosshairX = x; [EOL] } <line_num>: 416,418
public double getCrosshairY() { [EOL]     return this.crosshairY; [EOL] } <line_num>: 428,430
public void setCrosshairY(double y) { [EOL]     this.crosshairY = y; [EOL] } <line_num>: 442,444
public int getDatasetIndex() { [EOL]     return this.datasetIndex; [EOL] } <line_num>: 457,459
public void setDatasetIndex(int index) { [EOL]     this.datasetIndex = index; [EOL] } <line_num>: 470,472
public int getDomainAxisIndex() { [EOL]     return this.domainAxisIndex; [EOL] } <line_num>: 484,486
public int getRangeAxisIndex() { [EOL]     return this.rangeAxisIndex; [EOL] } <line_num>: 498,500
