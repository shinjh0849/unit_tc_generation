public ChartMouseEvent(JFreeChart chart, MouseEvent trigger, ChartEntity entity) { [EOL]     super(chart); [EOL]     this.chart = chart; [EOL]     this.trigger = trigger; [EOL]     this.entity = entity; [EOL] } <line_num>: 83,89
public JFreeChart getChart() { [EOL]     return this.chart; [EOL] } <line_num>: 96,98
public MouseEvent getTrigger() { [EOL]     return this.trigger; [EOL] } <line_num>: 105,107
public ChartEntity getEntity() { [EOL]     return this.entity; [EOL] } <line_num>: 114,116
