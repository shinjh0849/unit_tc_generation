public abstract DateTimeZone getZone(); <line_num>: 71,71
public abstract Chronology withUTC(); <line_num>: 80,80
public abstract Chronology withZone(DateTimeZone zone); <line_num>: 89,89
public abstract long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay); <line_num>: 107,107
public abstract long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond); <line_num>: 129,131
public abstract long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond); <line_num>: 151,153
public abstract void validate(ReadablePartial partial, int[] values); <line_num>: 163,163
public abstract int[] get(ReadablePartial partial, long instant); <line_num>: 172,172
public abstract long set(ReadablePartial partial, long instant); <line_num>: 181,181
public abstract int[] get(ReadablePeriod period, long startInstant, long endInstant); <line_num>: 192,192
public abstract int[] get(ReadablePeriod period, long duration); <line_num>: 201,201
public abstract long add(ReadablePeriod period, long instant, int scalar); <line_num>: 211,211
public abstract long add(long instant, long duration, int scalar); <line_num>: 222,222
public abstract DurationField millis(); <line_num>: 231,231
public abstract DateTimeField millisOfSecond(); <line_num>: 238,238
public abstract DateTimeField millisOfDay(); <line_num>: 245,245
public abstract DurationField seconds(); <line_num>: 254,254
public abstract DateTimeField secondOfMinute(); <line_num>: 261,261
public abstract DateTimeField secondOfDay(); <line_num>: 268,268
public abstract DurationField minutes(); <line_num>: 277,277
public abstract DateTimeField minuteOfHour(); <line_num>: 284,284
public abstract DateTimeField minuteOfDay(); <line_num>: 291,291
public abstract DurationField hours(); <line_num>: 300,300
public abstract DateTimeField hourOfDay(); <line_num>: 307,307
public abstract DateTimeField clockhourOfDay(); <line_num>: 314,314
public abstract DurationField halfdays(); <line_num>: 323,323
public abstract DateTimeField hourOfHalfday(); <line_num>: 330,330
public abstract DateTimeField clockhourOfHalfday(); <line_num>: 337,337
public abstract DateTimeField halfdayOfDay(); <line_num>: 344,344
public abstract DurationField days(); <line_num>: 353,353
public abstract DateTimeField dayOfWeek(); <line_num>: 363,363
public abstract DateTimeField dayOfMonth(); <line_num>: 370,370
public abstract DateTimeField dayOfYear(); <line_num>: 377,377
public abstract DurationField weeks(); <line_num>: 386,386
public abstract DateTimeField weekOfWeekyear(); <line_num>: 393,393
public abstract DurationField weekyears(); <line_num>: 402,402
public abstract DateTimeField weekyear(); <line_num>: 409,409
public abstract DateTimeField weekyearOfCentury(); <line_num>: 416,416
public abstract DurationField months(); <line_num>: 425,425
public abstract DateTimeField monthOfYear(); <line_num>: 432,432
public abstract DurationField years(); <line_num>: 441,441
public abstract DateTimeField year(); <line_num>: 448,448
public abstract DateTimeField yearOfEra(); <line_num>: 455,455
public abstract DateTimeField yearOfCentury(); <line_num>: 462,462
public abstract DurationField centuries(); <line_num>: 471,471
public abstract DateTimeField centuryOfEra(); <line_num>: 478,478
public abstract DurationField eras(); <line_num>: 487,487
public abstract DateTimeField era(); <line_num>: 494,494
public abstract String toString(); <line_num>: 502,502
