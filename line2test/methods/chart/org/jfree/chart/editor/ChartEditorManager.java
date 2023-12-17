private ChartEditorManager() { [EOL] } <line_num>: 59,61
public static ChartEditorFactory getChartEditorFactory() { [EOL]     return factory; [EOL] } <line_num>: 68,70
public static void setChartEditorFactory(ChartEditorFactory f) { [EOL]     if (f == null) { [EOL]         throw new IllegalArgumentException("Null 'f' argument."); [EOL]     } [EOL]     factory = f; [EOL] } <line_num>: 77,82
public static ChartEditor getChartEditor(JFreeChart chart) { [EOL]     return factory.createEditor(chart); [EOL] } <line_num>: 91,93
