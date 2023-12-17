public DefaultAxisEditor(Axis axis)
public static DefaultAxisEditor getInstance(Axis axis)
public String getLabel()
public Font getLabelFont()
public Paint getLabelPaint()
public boolean isTickLabelsVisible()
public Font getTickLabelFont()
public Paint getTickLabelPaint()
public boolean isTickMarksVisible()
public RectangleInsets getTickLabelInsets()
public RectangleInsets getLabelInsets()
public JTabbedPane getOtherTabs()
public void actionPerformed(ActionEvent event)
private void attemptLabelFontSelection()
private void attemptModifyLabelPaint()
public void attemptTickLabelFontSelection()
public void setAxisProperties(Axis axis)
JTextField label
Font labelFont
PaintSample labelPaintSample
JTextField labelFontField
Font tickLabelFont
JTextField tickLabelFontField
PaintSample tickLabelPaintSample
JPanel slot1
JPanel slot2
JCheckBox showTickLabelsCheckBox
JCheckBox showTickMarksCheckBox
RectangleInsets tickLabelInsets
RectangleInsets labelInsets
JTabbedPane otherTabs
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.editor.LocalizationBundle")]
