public PieLabelRecord(Comparable key, double angle, double baseY, TextBox label, double labelHeight, double gap, double linkPercent) { [EOL]     this.key = key; [EOL]     this.angle = angle; [EOL]     this.baseY = baseY; [EOL]     this.allocatedY = baseY; [EOL]     this.label = label; [EOL]     this.labelHeight = labelHeight; [EOL]     this.gap = gap; [EOL]     this.linkPercent = linkPercent; [EOL] } <line_num>: 92,103
public double getBaseY() { [EOL]     return this.baseY; [EOL] } <line_num>: 111,113
public void setBaseY(double base) { [EOL]     this.baseY = base; [EOL] } <line_num>: 120,122
public double getLowerY() { [EOL]     return this.allocatedY - this.labelHeight / 2.0; [EOL] } <line_num>: 129,131
public double getUpperY() { [EOL]     return this.allocatedY + this.labelHeight / 2.0; [EOL] } <line_num>: 138,140
public double getAngle() { [EOL]     return this.angle; [EOL] } <line_num>: 147,149
public Comparable getKey() { [EOL]     return this.key; [EOL] } <line_num>: 156,158
public TextBox getLabel() { [EOL]     return this.label; [EOL] } <line_num>: 165,167
public double getLabelHeight() { [EOL]     return this.labelHeight; [EOL] } <line_num>: 175,177
public double getAllocatedY() { [EOL]     return this.allocatedY; [EOL] } <line_num>: 184,186
public void setAllocatedY(double y) { [EOL]     this.allocatedY = y; [EOL] } <line_num>: 193,195
public double getGap() { [EOL]     return this.gap; [EOL] } <line_num>: 202,204
public double getLinkPercent() { [EOL]     return this.linkPercent; [EOL] } <line_num>: 211,213
public int compareTo(Object obj) { [EOL]     int result = 0; [EOL]     if (obj instanceof PieLabelRecord) { [EOL]         PieLabelRecord plr = (PieLabelRecord) obj; [EOL]         if (this.baseY < plr.baseY) { [EOL]             result = -1; [EOL]         } else if (this.baseY > plr.baseY) { [EOL]             result = 1; [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 222,234
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof PieLabelRecord)) { [EOL]         return false; [EOL]     } [EOL]     PieLabelRecord that = (PieLabelRecord) obj; [EOL]     if (!this.key.equals(that.key)) { [EOL]         return false; [EOL]     } [EOL]     if (this.angle != that.angle) { [EOL]         return false; [EOL]     } [EOL]     if (this.gap != that.gap) { [EOL]         return false; [EOL]     } [EOL]     if (this.allocatedY != that.allocatedY) { [EOL]         return false; [EOL]     } [EOL]     if (this.baseY != that.baseY) { [EOL]         return false; [EOL]     } [EOL]     if (this.labelHeight != that.labelHeight) { [EOL]         return false; [EOL]     } [EOL]     if (this.linkPercent != that.linkPercent) { [EOL]         return false; [EOL]     } [EOL]     if (!this.label.equals(that.label)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 243,276
public String toString() { [EOL]     return this.baseY + ", " + this.key.toString(); [EOL] } <line_num>: 283,285
