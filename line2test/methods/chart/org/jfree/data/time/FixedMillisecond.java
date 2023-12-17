public FixedMillisecond() { [EOL]     this(new Date()); [EOL] } <line_num>: 73,75
public FixedMillisecond(long millisecond) { [EOL]     this(new Date(millisecond)); [EOL] } <line_num>: 82,84
public FixedMillisecond(Date time) { [EOL]     this.time = time.getTime(); [EOL] } <line_num>: 91,93
public Date getTime() { [EOL]     return new Date(this.time); [EOL] } <line_num>: 100,102
public void peg(Calendar calendar) { [EOL] } <line_num>: 111,113
public RegularTimePeriod previous() { [EOL]     RegularTimePeriod result = null; [EOL]     long t = this.time; [EOL]     if (t != Long.MIN_VALUE) { [EOL]         result = new FixedMillisecond(t - 1); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 120,127
public RegularTimePeriod next() { [EOL]     RegularTimePeriod result = null; [EOL]     long t = this.time; [EOL]     if (t != Long.MAX_VALUE) { [EOL]         result = new FixedMillisecond(t + 1); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 134,141
public boolean equals(Object object) { [EOL]     if (object instanceof FixedMillisecond) { [EOL]         FixedMillisecond m = (FixedMillisecond) object; [EOL]         return this.time == m.getFirstMillisecond(); [EOL]     } else { [EOL]         return false; [EOL]     } [EOL] } <line_num>: 150,159
public int hashCode() { [EOL]     return (int) this.time; [EOL] } <line_num>: 166,168
public int compareTo(Object o1) { [EOL]     int result; [EOL]     long difference; [EOL]     if (o1 instanceof FixedMillisecond) { [EOL]         FixedMillisecond t1 = (FixedMillisecond) o1; [EOL]         difference = this.time - t1.time; [EOL]         if (difference > 0) { [EOL]             result = 1; [EOL]         } else { [EOL]             if (difference < 0) { [EOL]                 result = -1; [EOL]             } else { [EOL]                 result = 0; [EOL]             } [EOL]         } [EOL]     } else if (o1 instanceof RegularTimePeriod) { [EOL]         result = 0; [EOL]     } else { [EOL]         result = 1; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 179,218
public long getFirstMillisecond() { [EOL]     return this.time; [EOL] } <line_num>: 225,227
public long getFirstMillisecond(Calendar calendar) { [EOL]     return this.time; [EOL] } <line_num>: 237,239
public long getLastMillisecond() { [EOL]     return this.time; [EOL] } <line_num>: 246,248
public long getLastMillisecond(Calendar calendar) { [EOL]     return this.time; [EOL] } <line_num>: 257,259
public long getMiddleMillisecond() { [EOL]     return this.time; [EOL] } <line_num>: 266,268
public long getMiddleMillisecond(Calendar calendar) { [EOL]     return this.time; [EOL] } <line_num>: 277,279
public long getSerialIndex() { [EOL]     return this.time; [EOL] } <line_num>: 286,288
