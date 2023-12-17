public ChartDeleter() { [EOL]     super(); [EOL] } <line_num>: 66,68
public void addChart(String filename) { [EOL]     this.chartNames.add(filename); [EOL] } <line_num>: 76,78
public boolean isChartAvailable(String filename) { [EOL]     return (this.chartNames.contains(filename)); [EOL] } <line_num>: 88,90
public void valueBound(HttpSessionBindingEvent event) { [EOL]     return; [EOL] } <line_num>: 97,99
public void valueUnbound(HttpSessionBindingEvent event) { [EOL]     Iterator iter = this.chartNames.listIterator(); [EOL]     while (iter.hasNext()) { [EOL]         String filename = (String) iter.next(); [EOL]         File file = new File(System.getProperty("java.io.tmpdir"), filename); [EOL]         if (file.exists()) { [EOL]             file.delete(); [EOL]         } [EOL]     } [EOL]     return; [EOL] } <line_num>: 108,122
