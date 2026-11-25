package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class DayIntervalPattern extends TimePatternImpl {
    private TimePatternDay endDay;
    private int recurringDays;
    private TimePatternDay startDay;

    public DayIntervalPattern(TimePatternDay timePatternDay, TimePatternDay timePatternDay2, int i) {
        super(TimePatternType.DAY_INTERVAL);
        this.startDay = timePatternDay;
        this.endDay = timePatternDay2;
        this.recurringDays = i;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        DayIntervalPattern dayIntervalPattern = (DayIntervalPattern) obj;
        TimePatternDay timePatternDay = this.endDay;
        if (timePatternDay == null) {
            if (dayIntervalPattern.endDay != null) {
                return false;
            }
        } else if (!timePatternDay.equals(dayIntervalPattern.endDay)) {
            return false;
        }
        if (this.recurringDays != dayIntervalPattern.recurringDays) {
            return false;
        }
        TimePatternDay timePatternDay2 = this.startDay;
        if (timePatternDay2 == null) {
            if (dayIntervalPattern.startDay != null) {
                return false;
            }
        } else if (!timePatternDay2.equals(dayIntervalPattern.startDay)) {
            return false;
        }
        return true;
    }

    public TimePatternDay getEndDay() {
        return this.endDay;
    }

    public int getRecurringDays() {
        return this.recurringDays;
    }

    public TimePatternDay getStartDay() {
        return this.startDay;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        TimePatternDay timePatternDay = this.endDay;
        int iHashCode2 = (((iHashCode + (timePatternDay == null ? 0 : timePatternDay.hashCode())) * 31) + this.recurringDays) * 31;
        TimePatternDay timePatternDay2 = this.startDay;
        return iHashCode2 + (timePatternDay2 != null ? timePatternDay2.hashCode() : 0);
    }

    public void setEndDay(TimePatternDay timePatternDay) {
        this.endDay = timePatternDay;
    }

    public void setRecurringDays(int i) {
        this.recurringDays = i;
    }

    public void setStartDay(TimePatternDay timePatternDay) {
        this.startDay = timePatternDay;
    }
}
