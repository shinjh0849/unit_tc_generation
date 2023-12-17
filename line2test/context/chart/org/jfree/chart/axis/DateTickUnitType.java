private DateTickUnitType(String name, int calendarField)
public int getCalendarField()
public String toString()
public boolean equals(Object obj)
private Object readResolve() throws ObjectStreamException
DateTickUnitType YEAR=Optional[new DateTickUnitType("DateTickUnitType.YEAR", Calendar.YEAR)]
DateTickUnitType MONTH=Optional[new DateTickUnitType("DateTickUnitType.MONTH", Calendar.MONTH)]
DateTickUnitType DAY=Optional[new DateTickUnitType("DateTickUnitType.DAY", Calendar.DATE)]
DateTickUnitType HOUR=Optional[new DateTickUnitType("DateTickUnitType.HOUR", Calendar.HOUR_OF_DAY)]
DateTickUnitType MINUTE=Optional[new DateTickUnitType("DateTickUnitType.MINUTE", Calendar.MINUTE)]
DateTickUnitType SECOND=Optional[new DateTickUnitType("DateTickUnitType.SECOND", Calendar.SECOND)]
DateTickUnitType MILLISECOND=Optional[new DateTickUnitType("DateTickUnitType.MILLISECOND", Calendar.MILLISECOND)]
String name
int calendarField
