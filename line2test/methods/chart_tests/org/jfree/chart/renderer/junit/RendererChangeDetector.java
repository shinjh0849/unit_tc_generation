public RendererChangeDetector() { [EOL]     this.notified = false; [EOL] } <line_num>: 58,60
public boolean getNotified() { [EOL]     return this.notified; [EOL] } <line_num>: 68,70
public void setNotified(boolean notified) { [EOL]     this.notified = notified; [EOL] } <line_num>: 78,80
public void rendererChanged(RendererChangeEvent event) { [EOL]     this.notified = true; [EOL] } <line_num>: 87,89
