public DateTickUnit(DateTickUnitType unitType, int multiple)
public DateTickUnit(DateTickUnitType unitType, int multiple, DateFormat formatter)
public DateTickUnit(DateTickUnitType unitType, int multiple, DateTickUnitType rollUnitType, int rollMultiple, DateFormat formatter)
public DateTickUnitType getUnitType()
public int getMultiple()
public DateTickUnitType getRollUnitType()
public int getRollMultiple()
public String valueToString(double milliseconds)
public String dateToString(Date date)
public Date addToDate(Date base, TimeZone zone)
public Date rollDate(Date base)
public Date rollDate(Date base, TimeZone zone)
public int getCalendarField()
private static long getMillisecondCount(DateTickUnitType unit, int count)
private static DateFormat notNull(DateFormat formatter)
public boolean equals(Object obj)
public int hashCode()
public String toString()
long serialVersionUID=Optional[-7289292157229621901L]
DateTickUnitType unitType
int count
DateTickUnitType rollUnitType
int rollCount
DateFormat formatter
