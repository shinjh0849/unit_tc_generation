public DefaultValueDataset() { [EOL]     this(null); [EOL] } <line_num>: 71,73
public DefaultValueDataset(double value) { [EOL]     this(new Double(value)); [EOL] } <line_num>: 80,82
public DefaultValueDataset(Number value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 89,92
public Number getValue() { [EOL]     return this.value; [EOL] } <line_num>: 99,101
public void setValue(Number value) { [EOL]     this.value = value; [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 109,113
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (obj instanceof ValueDataset) { [EOL]         ValueDataset vd = (ValueDataset) obj; [EOL]         return ObjectUtilities.equal(this.value, vd.getValue()); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 122,131
public int hashCode() { [EOL]     return (this.value != null ? this.value.hashCode() : 0); [EOL] } <line_num>: 138,140
