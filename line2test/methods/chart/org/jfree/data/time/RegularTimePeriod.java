public static RegularTimePeriod createInstance(Class c, Date millisecond, TimeZone zone) { [EOL]     RegularTimePeriod result = null; [EOL]     try { [EOL]         Constructor constructor = c.getDeclaredConstructor(new Class[] { Date.class, TimeZone.class }); [EOL]         result = (RegularTimePeriod) constructor.newInstance(new Object[] { millisecond, zone }); [EOL]     } catch (Exception e) { [EOL]     } [EOL]     return result; [EOL] } <line_num>: 84,97
public static Class downsize(Class c) { [EOL]     if (c.equals(Year.class)) { [EOL]         return Quarter.class; [EOL]     } else if (c.equals(Quarter.class)) { [EOL]         return Month.class; [EOL]     } else if (c.equals(Month.class)) { [EOL]         return Day.class; [EOL]     } else if (c.equals(Day.class)) { [EOL]         return Hour.class; [EOL]     } else if (c.equals(Hour.class)) { [EOL]         return Minute.class; [EOL]     } else if (c.equals(Minute.class)) { [EOL]         return Second.class; [EOL]     } else if (c.equals(Second.class)) { [EOL]         return Millisecond.class; [EOL]     } else { [EOL]         return Millisecond.class; [EOL]     } [EOL] } <line_num>: 107,132
public abstract RegularTimePeriod previous(); <line_num>: 140,140
public abstract RegularTimePeriod next(); <line_num>: 148,148
public abstract long getSerialIndex(); <line_num>: 155,155
public abstract void peg(Calendar calendar); <line_num>: 167,167
public Date getStart() { [EOL]     return new Date(getFirstMillisecond()); [EOL] } <line_num>: 177,179
public Date getEnd() { [EOL]     return new Date(getLastMillisecond()); [EOL] } <line_num>: 189,191
public abstract long getFirstMillisecond(); <line_num>: 203,203
public abstract long getFirstMillisecond(Calendar calendar); <line_num>: 218,218
public abstract long getLastMillisecond(); <line_num>: 230,230
public abstract long getLastMillisecond(Calendar calendar); <line_num>: 242,242
public long getMiddleMillisecond() { [EOL]     long m1 = getFirstMillisecond(); [EOL]     long m2 = getLastMillisecond(); [EOL]     return m1 + (m2 - m1) / 2; [EOL] } <line_num>: 249,253
public long getMiddleMillisecond(Calendar calendar) { [EOL]     long m1 = getFirstMillisecond(calendar); [EOL]     long m2 = getLastMillisecond(calendar); [EOL]     return m1 + (m2 - m1) / 2; [EOL] } <line_num>: 263,267
public String toString() { [EOL]     return String.valueOf(getStart()); [EOL] } <line_num>: 274,276
