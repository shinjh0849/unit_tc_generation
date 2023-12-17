public ChartProgressEvent(Object source, JFreeChart chart, int type, int percent) { [EOL]     super(source); [EOL]     this.chart = chart; [EOL]     this.type = type; [EOL]     this.percent = percent; [EOL] } <line_num>: 76,82
public JFreeChart getChart() { [EOL]     return this.chart; [EOL] } <line_num>: 89,91
public void setChart(JFreeChart chart) { [EOL]     this.chart = chart; [EOL] } <line_num>: 98,100
public int getType() { [EOL]     return this.type; [EOL] } <line_num>: 107,109
public void setType(int type) { [EOL]     this.type = type; [EOL] } <line_num>: 116,118
public int getPercent() { [EOL]     return this.percent; [EOL] } <line_num>: 125,127
public void setPercent(int percent) { [EOL]     this.percent = percent; [EOL] } <line_num>: 134,136
