public PiePlotState(PlotRenderingInfo info) { [EOL]     super(info); [EOL]     this.passesRequired = 1; [EOL]     this.total = 0.0; [EOL] } <line_num>: 88,92
public int getPassesRequired() { [EOL]     return this.passesRequired; [EOL] } <line_num>: 99,101
public void setPassesRequired(int passes) { [EOL]     this.passesRequired = passes; [EOL] } <line_num>: 108,110
public double getTotal() { [EOL]     return this.total; [EOL] } <line_num>: 117,119
public void setTotal(double total) { [EOL]     this.total = total; [EOL] } <line_num>: 126,128
public double getLatestAngle() { [EOL]     return this.latestAngle; [EOL] } <line_num>: 135,137
public void setLatestAngle(double angle) { [EOL]     this.latestAngle = angle; [EOL] } <line_num>: 144,146
public Rectangle2D getPieArea() { [EOL]     return this.pieArea; [EOL] } <line_num>: 153,155
public void setPieArea(Rectangle2D area) { [EOL]     this.pieArea = area; [EOL] } <line_num>: 162,164
public Rectangle2D getExplodedPieArea() { [EOL]     return this.explodedPieArea; [EOL] } <line_num>: 171,173
public void setExplodedPieArea(Rectangle2D area) { [EOL]     this.explodedPieArea = area; [EOL] } <line_num>: 180,182
public double getPieCenterX() { [EOL]     return this.pieCenterX; [EOL] } <line_num>: 189,191
public void setPieCenterX(double x) { [EOL]     this.pieCenterX = x; [EOL] } <line_num>: 198,200
public double getPieCenterY() { [EOL]     return this.pieCenterY; [EOL] } <line_num>: 209,211
public void setPieCenterY(double y) { [EOL]     this.pieCenterY = y; [EOL] } <line_num>: 219,221
public Rectangle2D getLinkArea() { [EOL]     return this.linkArea; [EOL] } <line_num>: 229,231
public void setLinkArea(Rectangle2D area) { [EOL]     this.linkArea = area; [EOL] } <line_num>: 239,241
public double getPieHRadius() { [EOL]     return this.pieHRadius; [EOL] } <line_num>: 248,250
public void setPieHRadius(double radius) { [EOL]     this.pieHRadius = radius; [EOL] } <line_num>: 257,259
public double getPieWRadius() { [EOL]     return this.pieWRadius; [EOL] } <line_num>: 266,268
public void setPieWRadius(double radius) { [EOL]     this.pieWRadius = radius; [EOL] } <line_num>: 275,277
