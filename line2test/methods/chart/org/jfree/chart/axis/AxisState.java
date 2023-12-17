public AxisState() { [EOL]     this(0.0); [EOL] } <line_num>: 69,71
public AxisState(double cursor) { [EOL]     this.cursor = cursor; [EOL]     this.ticks = new java.util.ArrayList(); [EOL] } <line_num>: 78,81
public double getCursor() { [EOL]     return this.cursor; [EOL] } <line_num>: 88,90
public void setCursor(double cursor) { [EOL]     this.cursor = cursor; [EOL] } <line_num>: 97,99
public void moveCursor(double units, RectangleEdge edge) { [EOL]     if (edge == RectangleEdge.TOP) { [EOL]         cursorUp(units); [EOL]     } else if (edge == RectangleEdge.BOTTOM) { [EOL]         cursorDown(units); [EOL]     } else if (edge == RectangleEdge.LEFT) { [EOL]         cursorLeft(units); [EOL]     } else if (edge == RectangleEdge.RIGHT) { [EOL]         cursorRight(units); [EOL]     } [EOL] } <line_num>: 107,120
public void cursorUp(double units) { [EOL]     this.cursor = this.cursor - units; [EOL] } <line_num>: 127,129
public void cursorDown(double units) { [EOL]     this.cursor = this.cursor + units; [EOL] } <line_num>: 136,138
public void cursorLeft(double units) { [EOL]     this.cursor = this.cursor - units; [EOL] } <line_num>: 145,147
public void cursorRight(double units) { [EOL]     this.cursor = this.cursor + units; [EOL] } <line_num>: 154,156
public List getTicks() { [EOL]     return this.ticks; [EOL] } <line_num>: 163,165
public void setTicks(List ticks) { [EOL]     this.ticks = ticks; [EOL] } <line_num>: 172,174
public double getMax() { [EOL]     return this.max; [EOL] } <line_num>: 181,183
public void setMax(double max) { [EOL]     this.max = max; [EOL] } <line_num>: 190,192
