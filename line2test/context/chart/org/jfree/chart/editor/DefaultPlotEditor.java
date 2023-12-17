public DefaultPlotEditor(Plot plot)
public RectangleInsets getPlotInsets()
public Paint getBackgroundPaint()
public Stroke getOutlineStroke()
public Paint getOutlinePaint()
public DefaultAxisEditor getDomainAxisPropertyEditPanel()
public DefaultAxisEditor getRangeAxisPropertyEditPanel()
public void actionPerformed(ActionEvent event)
private void attemptBackgroundPaintSelection()
private void attemptOutlineStrokeSelection()
private void attemptOutlinePaintSelection()
private void attemptOrientationSelection()
private void attemptDrawLinesSelection()
private void attemptDrawShapesSelection()
public void updatePlotProperties(Plot plot)
String[] orientationNames=Optional[{ "Vertical", "Horizontal" }]
int ORIENTATION_VERTICAL=Optional[0]
int ORIENTATION_HORIZONTAL=Optional[1]
PaintSample backgroundPaintSample
StrokeSample outlineStrokeSample
PaintSample outlinePaintSample
DefaultAxisEditor domainAxisPropertyPanel
DefaultAxisEditor rangeAxisPropertyPanel
StrokeSample[] availableStrokeSamples
RectangleInsets plotInsets
PlotOrientation plotOrientation
JComboBox orientationCombo
Boolean drawLines
JCheckBox drawLinesCheckBox
Boolean drawShapes
JCheckBox drawShapesCheckBox
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.editor.LocalizationBundle")]
