public ValueMarker(double value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 67,70
public ValueMarker(double value, Paint paint, Stroke stroke) { [EOL]     this(value, paint, stroke, paint, stroke, 1.0f); [EOL] } <line_num>: 79,81
public ValueMarker(double value, Paint paint, Stroke stroke, Paint outlinePaint, Stroke outlineStroke, float alpha) { [EOL]     super(paint, stroke, outlinePaint, outlineStroke, alpha); [EOL]     this.value = value; [EOL] } <line_num>: 93,97
public double getValue() { [EOL]     return this.value; [EOL] } <line_num>: 106,108
public void setValue(double value) { [EOL]     this.value = value; [EOL]     notifyListeners(new MarkerChangeEvent(this)); [EOL] } <line_num>: 120,123
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!super.equals(obj)) { [EOL]         return false; [EOL]     } [EOL]     if (!(obj instanceof ValueMarker)) { [EOL]         return false; [EOL]     } [EOL]     ValueMarker that = (ValueMarker) obj; [EOL]     if (this.value != that.value) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 140,155
