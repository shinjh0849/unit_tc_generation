public DefaultNumberAxisEditor(NumberAxis axis)
public boolean isAutoRange()
public double getMinimumValue()
public double getMaximumValue()
public void actionPerformed(ActionEvent event)
private void attemptGridStrokeSelection()
private void attemptGridPaintSelection()
public void focusGained(FocusEvent event)
public void focusLost(FocusEvent event)
public void toggleAutoRange()
public void validateMinimum()
public void validateMaximum()
public void setAxisProperties(Axis axis)
boolean autoRange
double minimumValue
double maximumValue
JCheckBox autoRangeCheckBox
JTextField minimumRangeValue
JTextField maximumRangeValue
PaintSample gridPaintSample
StrokeSample gridStrokeSample
StrokeSample[] availableStrokeSamples
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.editor.LocalizationBundle")]
