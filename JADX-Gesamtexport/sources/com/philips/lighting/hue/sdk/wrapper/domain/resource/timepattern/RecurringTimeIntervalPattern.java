package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class RecurringTimeIntervalPattern extends TimeIntervalPattern {
    private int recurringDays;

    public RecurringTimeIntervalPattern(TimePatternTime timePatternTime, TimePatternTime timePatternTime2, int i) {
        super(timePatternTime, timePatternTime2);
        this.recurringDays = i;
        this.type = TimePatternType.RECURRING_TIME_INTERVAL;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimeIntervalPattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && this.recurringDays == ((RecurringTimeIntervalPattern) obj).recurringDays;
    }

    public int getRecurringDays() {
        return this.recurringDays;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimeIntervalPattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        return (super.hashCode() * 31) + this.recurringDays;
    }

    public void setRecurringDays(int i) {
        this.recurringDays = i;
    }
}
