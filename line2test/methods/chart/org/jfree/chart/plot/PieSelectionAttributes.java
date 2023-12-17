public PieSelectionAttributes() { [EOL]     this(true); [EOL] } <line_num>: 96,98
public PieSelectionAttributes(boolean allowNull) { [EOL]     this.sectionPaint = new PaintMap(); [EOL]     this.defaultPaint = allowNull ? null : Color.BLACK; [EOL]     this.sectionOutlinePaint = new PaintMap(); [EOL]     this.defaultOutlinePaint = allowNull ? null : Color.BLACK; [EOL]     this.sectionOutlineStroke = new StrokeMap(); [EOL]     this.defaultOutlineStroke = allowNull ? null : new BasicStroke(2.0f); [EOL] } <line_num>: 100,107
public boolean getAllowNull() { [EOL]     return this.allowNull; [EOL] } <line_num>: 109,111
protected Paint lookupSectionPaint(Comparable key) { [EOL]     Paint result = this.sectionPaint.getPaint(key); [EOL]     if (result == null) { [EOL]         result = this.defaultPaint; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 115,121
public Paint getSectionPaint(Comparable key) { [EOL]     return this.sectionPaint.getPaint(key); [EOL] } <line_num>: 123,125
public void setSeriesPaint(Comparable key, Paint paint) { [EOL]     this.sectionPaint.put(key, paint); [EOL] } <line_num>: 127,129
public Paint getDefaultPaint() { [EOL]     return this.defaultPaint; [EOL] } <line_num>: 131,133
public void setDefaultPaint(Paint paint) { [EOL]     if (paint == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.defaultPaint = paint; [EOL] } <line_num>: 135,140
protected Paint lookupSectionOutlinePaint(Comparable key) { [EOL]     Paint result = this.sectionOutlinePaint.getPaint(key); [EOL]     if (result == null) { [EOL]         result = this.defaultOutlinePaint; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 144,150
public Paint getSectionOutlinePaint(Comparable key) { [EOL]     return this.sectionOutlinePaint.getPaint(key); [EOL] } <line_num>: 152,154
public void setSectionOutlinePaint(Comparable key, Paint paint) { [EOL]     this.sectionOutlinePaint.put(key, paint); [EOL] } <line_num>: 156,158
public Paint getDefaultOutlinePaint() { [EOL]     return this.defaultOutlinePaint; [EOL] } <line_num>: 160,162
public void setDefaultOutlinePaint(Paint paint) { [EOL]     if (paint == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.defaultOutlinePaint = paint; [EOL] } <line_num>: 164,169
protected Stroke lookupSectionOutlineStroke(Comparable key) { [EOL]     Stroke result = this.sectionOutlineStroke.getStroke(key); [EOL]     if (result == null) { [EOL]         result = this.defaultOutlineStroke; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 173,179
public Stroke getSectionOutlineStroke(Comparable key) { [EOL]     return this.sectionOutlineStroke.getStroke(key); [EOL] } <line_num>: 181,183
public void setSectionOutlineStroke(Comparable key, Stroke stroke) { [EOL]     this.sectionOutlineStroke.put(key, stroke); [EOL] } <line_num>: 185,187
public Stroke getDefaultOutlineStroke() { [EOL]     return this.defaultOutlineStroke; [EOL] } <line_num>: 189,191
public void setDefaultOutlineStroke(Stroke stroke) { [EOL]     if (stroke == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'stroke' argument."); [EOL]     } [EOL]     this.defaultOutlineStroke = stroke; [EOL] } <line_num>: 193,198
public Boolean isLabelVisible(int series, int item) { [EOL]     return lookupSeriesLabelVisible(series); [EOL] } <line_num>: 202,204
protected Boolean lookupSeriesLabelVisible(int series) { [EOL]     Boolean result = this.labelsVisibleList.getBoolean(series); [EOL]     if (result == null) { [EOL]         result = this.defaultLabelVisible; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 206,212
public Boolean getSeriesLabelVisible(int series) { [EOL]     return this.labelsVisibleList.getBoolean(series); [EOL] } <line_num>: 214,216
public void setSeriesLabelVisible(int series, Boolean visible) { [EOL]     this.labelsVisibleList.setBoolean(series, visible); [EOL] } <line_num>: 218,220
public Boolean getDefaultLabelVisible() { [EOL]     return this.defaultLabelVisible; [EOL] } <line_num>: 222,224
public void setDefaultLabelVisible(Boolean visible) { [EOL]     if (visible == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'visible' argument."); [EOL]     } [EOL]     this.defaultLabelVisible = visible; [EOL] } <line_num>: 226,231
public Font getItemLabelFont(int series, int item) { [EOL]     return lookupSeriesLabelFont(series); [EOL] } <line_num>: 235,237
protected Font lookupSeriesLabelFont(int series) { [EOL]     Font result = (Font) this.labelFontList.get(series); [EOL]     if (result == null) { [EOL]         result = this.defaultLabelFont; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 239,245
public Font getSeriesLabelFont(int series) { [EOL]     return (Font) this.labelFontList.get(series); [EOL] } <line_num>: 247,249
public void setSeriesLabelFont(int series, Font font) { [EOL]     this.labelFontList.set(series, font); [EOL] } <line_num>: 251,253
public Font getDefaultLabelFont() { [EOL]     return this.defaultLabelFont; [EOL] } <line_num>: 255,257
public void setDefaultLabelFont(Font font) { [EOL]     if (font == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     this.defaultLabelFont = font; [EOL] } <line_num>: 259,264
public Paint getItemLabelPaint(int series, int item) { [EOL]     return lookupSeriesLabelPaint(series); [EOL] } <line_num>: 268,270
protected Paint lookupSeriesLabelPaint(int series) { [EOL]     Paint result = this.labelPaintList.getPaint(series); [EOL]     if (result == null) { [EOL]         result = this.defaultLabelPaint; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 272,278
public Paint getSeriesLabelPaint(int series) { [EOL]     return this.labelPaintList.getPaint(series); [EOL] } <line_num>: 280,282
public void setSeriesLabelPaint(int series, Paint paint) { [EOL]     this.labelPaintList.setPaint(series, paint); [EOL] } <line_num>: 284,286
public Paint getDefaultLabelPaint() { [EOL]     return this.defaultLabelPaint; [EOL] } <line_num>: 288,290
public void setDefaultLabelPaint(Paint paint) { [EOL]     if (paint == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.defaultLabelPaint = paint; [EOL] } <line_num>: 292,297
public Boolean getCreateEntity(int series, int item) { [EOL]     return lookupSeriesCreateEntity(series); [EOL] } <line_num>: 303,305
protected Boolean lookupSeriesCreateEntity(int series) { [EOL]     Boolean result = this.createEntityList.getBoolean(series); [EOL]     if (result == null) { [EOL]         result = this.defaultCreateEntity; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 307,313
public Boolean getSeriesCreateEntity(int series) { [EOL]     return this.createEntityList.getBoolean(series); [EOL] } <line_num>: 315,317
public void setSeriesCreateEntity(int series, Boolean visible) { [EOL]     this.createEntityList.setBoolean(series, visible); [EOL] } <line_num>: 319,321
public Boolean getDefaultCreateEntity() { [EOL]     return this.defaultCreateEntity; [EOL] } <line_num>: 323,325
public void setDefaultCreateEntity(Boolean create) { [EOL]     if (create == null && !this.allowNull) { [EOL]         throw new IllegalArgumentException("Null 'create' argument."); [EOL]     } [EOL]     this.defaultCreateEntity = create; [EOL] } <line_num>: 327,332
