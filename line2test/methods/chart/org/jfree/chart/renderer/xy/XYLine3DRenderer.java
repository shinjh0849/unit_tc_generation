public XYLine3DRenderer() { [EOL]     this.wallPaint = DEFAULT_WALL_PAINT; [EOL]     this.xOffset = DEFAULT_X_OFFSET; [EOL]     this.yOffset = DEFAULT_Y_OFFSET; [EOL] } <line_num>: 89,93
public double getXOffset() { [EOL]     return this.xOffset; [EOL] } <line_num>: 100,102
public double getYOffset() { [EOL]     return this.yOffset; [EOL] } <line_num>: 109,111
public void setXOffset(double xOffset) { [EOL]     this.xOffset = xOffset; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 119,122
public void setYOffset(double yOffset) { [EOL]     this.yOffset = yOffset; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 130,133
public Paint getWallPaint() { [EOL]     return this.wallPaint; [EOL] } <line_num>: 141,143
public void setWallPaint(Paint paint) { [EOL]     this.wallPaint = paint; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 152,155
public int getPassCount() { [EOL]     return 3; [EOL] } <line_num>: 164,166
protected boolean isLinePass(int pass) { [EOL]     return pass == 0 || pass == 1; [EOL] } <line_num>: 175,177
protected boolean isItemPass(int pass) { [EOL]     return pass == 2; [EOL] } <line_num>: 186,188
protected boolean isShadowPass(int pass) { [EOL]     return pass == 0; [EOL] } <line_num>: 197,199
protected void drawShape1(Graphics2D g2, int pass, int series, int item, boolean selected, Shape shape) { [EOL]     if (isShadowPass(pass)) { [EOL]         if (getWallPaint() != null) { [EOL]             g2.setStroke(getItemStroke(series, item, selected)); [EOL]             g2.setPaint(getWallPaint()); [EOL]             g2.translate(getXOffset(), getYOffset()); [EOL]             g2.draw(shape); [EOL]             g2.translate(-getXOffset(), -getYOffset()); [EOL]         } [EOL]     } else { [EOL]         super.drawShape1(g2, pass, series, item, selected, shape); [EOL]     } [EOL] } <line_num>: 211,226
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof XYLine3DRenderer)) { [EOL]         return false; [EOL]     } [EOL]     XYLine3DRenderer that = (XYLine3DRenderer) obj; [EOL]     if (this.xOffset != that.xOffset) { [EOL]         return false; [EOL]     } [EOL]     if (this.yOffset != that.yOffset) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.wallPaint, that.wallPaint)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 235,253
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.wallPaint = SerialUtilities.readPaint(stream); [EOL] } <line_num>: 263,267
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.wallPaint, stream); [EOL] } <line_num>: 276,279
