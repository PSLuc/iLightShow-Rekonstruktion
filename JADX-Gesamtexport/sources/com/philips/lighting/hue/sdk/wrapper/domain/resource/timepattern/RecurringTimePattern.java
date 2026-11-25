package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class RecurringTimePattern extends TruncatedTimePattern {
    private int recurringDays;

    public RecurringTimePattern(TimePatternTime timePatternTime, int i) {
        super(timePatternTime);
        this.recurringDays = i;
        this.type = TimePatternType.RECURRING_TIME;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TruncatedTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && this.recurringDays == ((RecurringTimePattern) obj).recurringDays;
    }

    public int getRecurringDays() {
        return this.recurringDays;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TruncatedTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        return (super.hashCode() * 31) + this.recurringDays;
    }

    public void setRecurringDays(int i) {
        this.recurringDays = i;
    }
}
