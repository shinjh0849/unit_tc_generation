public PieChartTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 78,80
public static Test suite() { [EOL]     return new TestSuite(PieChartTests.class); [EOL] } <line_num>: 69,71
protected void setUp() { [EOL]     this.pieChart = createPieChart(); [EOL] } <line_num>: 85,89
public void testReplaceDatasetOnPieChart() { [EOL]     LocalListener l = new LocalListener(); [EOL]     this.pieChart.addChangeListener(l); [EOL]     PiePlot plot = (PiePlot) this.pieChart.getPlot(); [EOL]     plot.setDataset(null); [EOL]     assertEquals(true, l.flag); [EOL]     assertNull(plot.getDataset()); [EOL] } <line_num>: 96,103
private static JFreeChart createPieChart() { [EOL]     DefaultPieDataset dataset = new DefaultPieDataset(); [EOL]     dataset.setValue("Java", new Double(43.2)); [EOL]     dataset.setValue("Visual Basic", new Double(0.0)); [EOL]     dataset.setValue("C/C++", new Double(17.5)); [EOL]     return ChartFactory.createPieChart("Pie Chart", dataset, true); [EOL] } <line_num>: 110,116
public void chartChanged(ChartChangeEvent event) { [EOL]     this.flag = true; [EOL] } <line_num>: 132,134
