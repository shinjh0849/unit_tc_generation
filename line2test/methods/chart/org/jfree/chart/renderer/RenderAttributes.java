public RenderAttributes() { [EOL]     this(true); [EOL] } <line_num>: 119,121
public RenderAttributes(boolean allowNull) { [EOL]     this.paintList = new PaintList(); [EOL]     this.defaultPaint = allowNull ? null : Color.BLACK; [EOL]     this.strokeList = new StrokeList(); [EOL]     this.defaultStroke = allowNull ? null : new BasicStroke(1.0f); [EOL]     this.fillPaintList = new PaintList(); [EOL]     this.defaultFillPaint = allowNull ? null : Color.BLACK; [EOL]     this.outlinePaintList = new PaintList(); [EOL]     this.defaultOutlinePaint = allowNull ? null : Color.BLACK; [EOL]     this.shapeList = new ShapeList(); [EOL] } <line_num>: 123,133
public boolean getAllowNull() { [EOL]     return this.allowNull; [EOL] } <line_num>: 135,137
public Paint getItemPaint(int series, int item) { [EOL]     return lookupSeriesPaint(series); [EOL] } <line_num>: 141,143
protected Paint lookupSeriesPaint(int series) { [EOL]     Paint result = this.paintList.getPaint(series); [EOL]     if (result == null) { [EOL]         result = this.defaultPaint; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 145,151
public Paint getSeriesPaint(int series) { [EOL]     return this.paintList.getPaint(series); [EOL] } <line_num>: 153,155
public void setSeriesPaint(int series, Paint paint) { [EOL]     this.paintList.setPaint(series, paint); [EOL] } <line_num>: 157,159
public Paint getDefaultPaint() { [EOL]     return this.defaultPaint; [EOL] } <line_num>: 161,163
public void setDefaultPaint(Paint paint) { [EOL]     if (paint == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.defaultPaint = paint; [EOL] } <line_num>: 165,170
public Stroke getItemStroke(int series, int item) { [EOL]     return lookupSeriesStroke(series); [EOL] } <line_num>: 174,176
protected Stroke lookupSeriesStroke(int series) { [EOL]     Stroke result = this.strokeList.getStroke(series); [EOL]     if (result == null) { [EOL]         result = this.defaultStroke; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 178,184
public Stroke getSeriesStroke(int series) { [EOL]     return this.strokeList.getStroke(series); [EOL] } <line_num>: 186,188
public void setSeriesStroke(int series, Stroke stroke) { [EOL]     this.strokeList.setStroke(series, stroke); [EOL] } <line_num>: 190,192
public Stroke getDefaultStroke() { [EOL]     return this.defaultStroke; [EOL] } <line_num>: 194,196
public void setDefaultStroke(Stroke stroke) { [EOL]     if (stroke == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'stroke' argument."); [EOL]     } [EOL]     this.defaultStroke = stroke; [EOL] } <line_num>: 198,203
public Shape getItemShape(int series, int item) { [EOL]     return lookupSeriesShape(series); [EOL] } <line_num>: 207,209
protected Shape lookupSeriesShape(int series) { [EOL]     Shape result = this.shapeList.getShape(series); [EOL]     if (result == null) { [EOL]         result = this.defaultShape; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 211,217
public Shape getSeriesShape(int series) { [EOL]     return this.shapeList.getShape(series); [EOL] } <line_num>: 219,221
public void setSeriesShape(int series, Shape shape) { [EOL]     this.shapeList.setShape(series, shape); [EOL] } <line_num>: 223,225
public Shape getDefaultShape() { [EOL]     return this.defaultShape; [EOL] } <line_num>: 227,229
public void setDefaultShape(Shape shape) { [EOL]     if (shape == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'shape' argument."); [EOL]     } [EOL]     this.defaultShape = shape; [EOL] } <line_num>: 231,236
public Paint getItemFillPaint(int series, int item) { [EOL]     return lookupSeriesFillPaint(series); [EOL] } <line_num>: 240,242
protected Paint lookupSeriesFillPaint(int series) { [EOL]     Paint result = this.fillPaintList.getPaint(series); [EOL]     if (result == null) { [EOL]         result = this.defaultFillPaint; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 244,250
public Paint getSeriesFillPaint(int series) { [EOL]     return this.fillPaintList.getPaint(series); [EOL] } <line_num>: 252,254
public void setSeriesFillPaint(int series, Paint paint) { [EOL]     this.fillPaintList.setPaint(series, paint); [EOL] } <line_num>: 256,258
public Paint getDefaultFillPaint() { [EOL]     return this.defaultFillPaint; [EOL] } <line_num>: 260,262
public void setDefaultFillPaint(Paint paint) { [EOL]     if (paint == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.defaultFillPaint = paint; [EOL] } <line_num>: 264,269
public Paint getItemOutlinePaint(int series, int item) { [EOL]     return lookupSeriesOutlinePaint(series); [EOL] } <line_num>: 273,275
protected Paint lookupSeriesOutlinePaint(int series) { [EOL]     Paint result = this.outlinePaintList.getPaint(series); [EOL]     if (result == null) { [EOL]         result = this.defaultOutlinePaint; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 277,283
public Paint getSeriesOutlinePaint(int series) { [EOL]     return this.outlinePaintList.getPaint(series); [EOL] } <line_num>: 285,287
public void setSeriesOutlinePaint(int series, Paint paint) { [EOL]     this.outlinePaintList.setPaint(series, paint); [EOL] } <line_num>: 289,291
public Paint getDefaultOutlinePaint() { [EOL]     return this.defaultOutlinePaint; [EOL] } <line_num>: 293,295
public void setDefaultOutlinePaint(Paint paint) { [EOL]     if (paint == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.defaultOutlinePaint = paint; [EOL] } <line_num>: 297,302
public Stroke getItemOutlineStroke(int series, int item) { [EOL]     return lookupSeriesOutlineStroke(series); [EOL] } <line_num>: 306,308
protected Stroke lookupSeriesOutlineStroke(int series) { [EOL]     Stroke result = this.outlineStrokeList.getStroke(series); [EOL]     if (result == null) { [EOL]         result = this.defaultOutlineStroke; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 310,316
public Stroke getSeriesOutlineStroke(int series) { [EOL]     return this.outlineStrokeList.getStroke(series); [EOL] } <line_num>: 318,320
public void setSeriesOutlineStroke(int series, Stroke stroke) { [EOL]     this.outlineStrokeList.setStroke(series, stroke); [EOL] } <line_num>: 322,324
public Stroke getDefaultOutlineStroke() { [EOL]     return this.defaultOutlineStroke; [EOL] } <line_num>: 326,328
public void setDefaultOutlineStroke(Stroke stroke) { [EOL]     if (stroke == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'stroke' argument."); [EOL]     } [EOL]     this.defaultOutlineStroke = stroke; [EOL] } <line_num>: 330,335
public Boolean isLabelVisible(int series, int item) { [EOL]     return lookupSeriesLabelVisible(series); [EOL] } <line_num>: 339,341
protected Boolean lookupSeriesLabelVisible(int series) { [EOL]     Boolean result = this.labelsVisibleList.getBoolean(series); [EOL]     if (result == null) { [EOL]         result = this.defaultLabelVisible; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 343,349
public Boolean getSeriesLabelVisible(int series) { [EOL]     return this.labelsVisibleList.getBoolean(series); [EOL] } <line_num>: 351,353
public void setSeriesLabelVisible(int series, Boolean visible) { [EOL]     this.labelsVisibleList.setBoolean(series, visible); [EOL] } <line_num>: 355,357
public Boolean getDefaultLabelVisible() { [EOL]     return this.defaultLabelVisible; [EOL] } <line_num>: 359,361
public void setDefaultLabelVisible(Boolean visible) { [EOL]     if (visible == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'visible' argument."); [EOL]     } [EOL]     this.defaultLabelVisible = visible; [EOL] } <line_num>: 363,368
public Font getItemLabelFont(int series, int item) { [EOL]     return lookupSeriesLabelFont(series); [EOL] } <line_num>: 372,374
protected Font lookupSeriesLabelFont(int series) { [EOL]     Font result = (Font) this.labelFontList.get(series); [EOL]     if (result == null) { [EOL]         result = this.defaultLabelFont; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 376,382
public Font getSeriesLabelFont(int series) { [EOL]     return (Font) this.labelFontList.get(series); [EOL] } <line_num>: 384,386
public void setSeriesLabelFont(int series, Font font) { [EOL]     this.labelFontList.set(series, font); [EOL] } <line_num>: 388,390
public Font getDefaultLabelFont() { [EOL]     return this.defaultLabelFont; [EOL] } <line_num>: 392,394
public void setDefaultLabelFont(Font font) { [EOL]     if (font == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     this.defaultLabelFont = font; [EOL] } <line_num>: 396,401
public Paint getItemLabelPaint(int series, int item) { [EOL]     return lookupSeriesLabelPaint(series); [EOL] } <line_num>: 405,407
protected Paint lookupSeriesLabelPaint(int series) { [EOL]     Paint result = this.labelPaintList.getPaint(series); [EOL]     if (result == null) { [EOL]         result = this.defaultLabelPaint; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 409,415
public Paint getSeriesLabelPaint(int series) { [EOL]     return this.labelPaintList.getPaint(series); [EOL] } <line_num>: 417,419
public void setSeriesLabelPaint(int series, Paint paint) { [EOL]     this.labelPaintList.setPaint(series, paint); [EOL] } <line_num>: 421,423
public Paint getDefaultLabelPaint() { [EOL]     return this.defaultLabelPaint; [EOL] } <line_num>: 425,427
public void setDefaultLabelPaint(Paint paint) { [EOL]     if (paint == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.defaultLabelPaint = paint; [EOL] } <line_num>: 429,434
public Boolean getCreateEntity(int series, int item) { [EOL]     return lookupSeriesCreateEntity(series); [EOL] } <line_num>: 444,446
protected Boolean lookupSeriesCreateEntity(int series) { [EOL]     Boolean result = this.createEntityList.getBoolean(series); [EOL]     if (result == null) { [EOL]         result = this.defaultCreateEntity; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 448,454
public Boolean getSeriesCreateEntity(int series) { [EOL]     return this.createEntityList.getBoolean(series); [EOL] } <line_num>: 456,458
public void setSeriesCreateEntity(int series, Boolean visible) { [EOL]     this.createEntityList.setBoolean(series, visible); [EOL] } <line_num>: 460,462
public Boolean getDefaultCreateEntity() { [EOL]     return this.defaultCreateEntity; [EOL] } <line_num>: 464,466
public void setDefaultCreateEntity(Boolean create) { [EOL]     if (create == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'create' argument."); [EOL]     } [EOL]     this.defaultCreateEntity = create; [EOL] } <line_num>: 468,473
