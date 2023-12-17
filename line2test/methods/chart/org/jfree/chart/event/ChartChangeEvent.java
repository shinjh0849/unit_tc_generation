public ChartChangeEvent(Object source) { [EOL]     this(source, null, ChartChangeEventType.GENERAL); [EOL] } <line_num>: 68,70
public ChartChangeEvent(Object source, JFreeChart chart) { [EOL]     this(source, chart, ChartChangeEventType.GENERAL); [EOL] } <line_num>: 79,81
public ChartChangeEvent(Object source, JFreeChart chart, ChartChangeEventType type) { [EOL]     super(source); [EOL]     this.chart = chart; [EOL]     this.type = type; [EOL] } <line_num>: 91,96
public JFreeChart getChart() { [EOL]     return this.chart; [EOL] } <line_num>: 103,105
public void setChart(JFreeChart chart) { [EOL]     this.chart = chart; [EOL] } <line_num>: 112,114
public ChartChangeEventType getType() { [EOL]     return this.type; [EOL] } <line_num>: 121,123
public void setType(ChartChangeEventType type) { [EOL]     this.type = type; [EOL] } <line_num>: 130,132
